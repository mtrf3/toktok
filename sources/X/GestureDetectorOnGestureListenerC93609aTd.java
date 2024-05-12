package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.aTd, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class GestureDetectorOnGestureListenerC93609aTd implements GestureDetector.OnGestureListener {
    public final /* synthetic */ C94152acO LJLIL;

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    public GestureDetectorOnGestureListenerC93609aTd(C94152acO c94152acO) {
        this.LJLIL = c94152acO;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e) {
        o.LJIIIZ(e, "e");
        LinearLayout LIZ = this.LJLIL.LJLLILLLL.LIZ();
        if (e.getY() >= LIZ.getTop()) {
            float y = e.getY();
            int top = LIZ.getTop();
            C94152acO c94152acO = this.LJLIL;
            if (y < top + c94152acO.LJLJL) {
                c94152acO.LJLJLJ = true;
                return true;
            }
        }
        return this.LJLIL.LJI(e);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e) {
        o.LJIIIZ(e, "e");
        float y = e.getY();
        int height = this.LJLIL.getHeight();
        C94152acO c94152acO = this.LJLIL;
        if (y < height - c94152acO.LJLJJLL && c94152acO.LJI(e)) {
            this.LJLIL.dismiss();
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        LinearLayout LIZ = this.LJLIL.LJLLILLLL.LIZ();
        C94152acO c94152acO = this.LJLIL;
        if (!c94152acO.LJLJLJ) {
            return false;
        }
        if ((c94152acO.LJLIL == 1 && LIZ.getLayoutParams().height >= this.LJLIL.LJLJI && f2 > 0) || LIZ.getLayoutParams().height > this.LJLIL.LJLJI) {
            return false;
        }
        LIZ.getLayoutParams().height += (int) f2;
        LIZ.requestLayout();
        this.LJLIL.LJLILLLLZI = true;
        return false;
    }
}
