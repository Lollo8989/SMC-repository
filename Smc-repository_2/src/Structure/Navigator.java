package Structure;


import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;


public class Navigator extends ViewPart {

	
	@Override
	public void createPartControl(Composite parent) {
		
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(1,false));
		
		Button preserveCase = new Button(composite, SWT.CHECK);
		preserveCase.setText("Preserve case");
		
		final TreeViewer tv = new TreeViewer(composite);
		tv.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));
		tv.setContentProvider(new FileTreeContentProvider());
	    tv.setLabelProvider(new FileTreeLabelProvider());
	    tv.setInput("C:\\Program Files");
	    //tv.setInput("root");
		
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
	}
	
	

	
}
