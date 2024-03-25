package additionalfigures;

import figures.*;
import additionalfigures.IStretchable;

/**
 * Interface for figure scaling
 * @author a.yusupova
 */
public abstract class StretchableFigure extends ScalableFigure implements IStretchable {


    protected float aspectRation = 1.0f;
    protected int size = 0;
 
    @Override
    public double getAspectRatio() {
        return this.aspectRation;
    }

    @Override
    public void setAspectRatio(double aspectRatio) {
        hide();
        aspectRation = (float)aspectRatio;
        show();
    }
    
    @Override
    public int getSize(){
        return this.size;
    }
    
    @Override
    public void setSize(int newSize)
    {
        hide();
        this.size = (newSize);
        show();
    }
}
