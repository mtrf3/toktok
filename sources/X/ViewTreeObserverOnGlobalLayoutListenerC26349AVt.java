package X;

import android.view.ViewTreeObserver;
import android.widget.LinearLayout;

/* renamed from: X.AVt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC26349AVt implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ LinearLayout LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int childCount = this.LJLIL.getChildCount() - 1;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= this.LJLIL.getChildCount()) {
                break;
            }
            int measuredWidth = this.LJLIL.getChildAt(i).getMeasuredWidth() + i2;
            if (i > 0) {
                measuredWidth += C26348AVs.LIZ;
            }
            i2 = measuredWidth;
            if (i2 >= this.LJLILLLLZI) {
                childCount = i - 1;
                break;
            }
            i++;
        }
        while (true) {
            childCount++;
            if (childCount < this.LJLIL.getChildCount()) {
                C16880lQ.LLII(this.LJLIL, childCount);
            } else {
                this.LJLIL.invalidate();
                return;
            }
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC26349AVt(LinearLayout linearLayout, int i) {
        this.LJLIL = linearLayout;
        this.LJLILLLLZI = i;
    }
}
