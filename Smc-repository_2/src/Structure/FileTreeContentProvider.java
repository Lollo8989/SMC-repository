package Structure;

import java.io.File;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class FileTreeContentProvider implements ITreeContentProvider{
	

	 public Object[] getChildren(Object arg0) {
		    // Return the files and subdirectories in this directory
		   
		    //System.out.println("Arg0 vale: " + arg0);
		    return ((File) arg0).listFiles();
	}
	
	 
	public Object getParent(Object arg0) {
		   // Return this file's parent file
		   return ((File) arg0).getParentFile();
	}


	public boolean hasChildren(Object arg0) {
		  // Get the children
	      Object[] obj = getChildren(arg0);
	    
	     // Return whether the parent has children
	     return obj == null ? false : obj.length > 0;
	}

	
	public Object[] getElements(Object arg0) {
	    // These are the root elements of the tree
	    // We don't care what arg0 is, because we just want all
	    // the root nodes in the file system
		System.out.println("arg0 vale :" + arg0);
		File file = new File((String) arg0);
		Object[] array = new Object[1];
		array[0]= file;
	    return array;
	}
	
	
    public void dispose() {
		    // Nothing to dispose
	}
    

    public void inputChanged(Viewer arg0, Object arg1, Object arg2) {
        // Nothing to change
      }


}