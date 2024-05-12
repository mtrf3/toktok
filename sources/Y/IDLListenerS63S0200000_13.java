package Y;

import X.C81184Vtc;
import X.UGE;
import X.UGH;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes14.dex */
public class IDLListenerS63S0200000_13 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                return;
            case 1:
                onGlobalLayout$1(this);
                return;
            default:
                return;
        }
    }

    public static final void onGlobalLayout$0(IDLListenerS63S0200000_13 iDLListenerS63S0200000_13) {
        Rect rect = new Rect();
        View view = ((UGE) iDLListenerS63S0200000_13.l0).LIZ;
        if (view != null) {
            view.getWindowVisibleDisplayFrame(rect);
        }
        int height = rect.height();
        ((UGE) iDLListenerS63S0200000_13.l0).getClass();
        if (((UGE) iDLListenerS63S0200000_13.l0).LIZIZ == 0) {
            int LJFF = C81184Vtc.LJFF((Activity) iDLListenerS63S0200000_13.l1);
            View view2 = ((UGE) iDLListenerS63S0200000_13.l0).LIZ;
            if (view2 != null && Integer.valueOf(view2.getMeasuredHeight()) != null) {
                UGE uge = (UGE) iDLListenerS63S0200000_13.l0;
                uge.LIZIZ = uge.LIZ.getMeasuredHeight() - LJFF;
            } else {
                ((UGE) iDLListenerS63S0200000_13.l0).LIZIZ = height;
            }
        }
        UGE uge2 = (UGE) iDLListenerS63S0200000_13.l0;
        int i = uge2.LIZIZ;
        if (i == height) {
            return;
        }
        UGH ugh = uge2.LIZJ;
        if (ugh != null) {
            int i2 = i - height;
            int i3 = uge2.LIZLLL;
            if (i2 > i3) {
                ugh.keyBoardShow(i - height);
            } else if (i > height) {
                ugh.keyBoardModify(i - height);
            } else if (height - i > i3) {
                ugh.keyBoardHide(height - i);
            } else if (i < height) {
                ugh.keyBoardModify(i - height);
            }
        }
        ((UGE) iDLListenerS63S0200000_13.l0).LIZIZ = height;
    }

    public static final void onGlobalLayout$1(IDLListenerS63S0200000_13 iDLListenerS63S0200000_13) {
        ((View) iDLListenerS63S0200000_13.l0).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS63S0200000_13);
        ((Runnable) iDLListenerS63S0200000_13.l1).run();
    }

    public IDLListenerS63S0200000_13(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
