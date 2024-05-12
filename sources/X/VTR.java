package X;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes15.dex */
public abstract class VTR extends C80217Ve1 {
    public boolean LJLZ;
    public boolean LJZ;

    public void setIsEnableTabbarDrag(boolean z) {
        this.LJLZ = z;
    }

    public void setScrollEnable(boolean z) {
        this.LJZ = z;
    }

    public VTR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLZ = true;
        this.LJZ = true;
    }
}
