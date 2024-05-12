package X;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* loaded from: classes15.dex */
public final class VTD extends LinearLayout {
    public int LJLIL;

    private Rect getBoundRectForOverflow() {
        int i;
        if (this.LJLIL == 3 || !(getContext() instanceof VNU)) {
            return null;
        }
        VNU vnu = (VNU) getContext();
        int width = getWidth();
        int height = getHeight();
        DisplayMetrics displayMetrics = vnu.LJLZ;
        int i2 = 0;
        if ((getOverflow() & 1) != 0) {
            int i3 = displayMetrics.widthPixels;
            i = -i3;
            width += i3 * 2;
        } else {
            i = 0;
        }
        if ((getOverflow() & 2) != 0) {
            int i4 = displayMetrics.heightPixels;
            i2 = -i4;
            height += i4 * 2;
        }
        return new Rect(i, i2, width + i, height + i2);
    }

    public int getOverflow() {
        return this.LJLIL;
    }

    public VTD(VNU vnu) {
        super(vnu);
    }

    public void setOverflow(int i) {
        this.LJLIL = i;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.LJLIL != 0) {
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).setClipChildren(false);
            }
            setClipChildren(false);
            C16320kW.LIZJ(this, getBoundRectForOverflow());
            if (getChildAt(0) != null) {
                C16320kW.LIZJ(getChildAt(0), getBoundRectForOverflow());
            }
        }
    }
}
