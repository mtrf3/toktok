package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.6Vj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class ViewOnTouchListenerC161476Vj implements View.OnTouchListener {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    public /* synthetic */ ViewOnTouchListenerC161476Vj(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Integer valueOf;
        switch (this.LJLIL) {
            case 0:
                C73063Slv this$0 = (C73063Slv) this.LJLILLLLZI;
                o.LJIIIZ(this$0, "this$0");
                if (motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getAction())) != null && valueOf.intValue() != 0 && valueOf != null && (valueOf.intValue() == 1 || valueOf.intValue() == 3)) {
                    if (!this$0.LJLJJI) {
                        this$0.LJI();
                    } else {
                        this$0.LIZIZ(0L);
                    }
                }
                return false;
            default:
                C161416Vd c161416Vd = (C161416Vd) this.LJLILLLLZI;
                if (c161416Vd.LJLLLL == null) {
                    return false;
                }
                Rect rect = new Rect();
                c161416Vd.LJLLLL.getHitRect(rect);
                if (motionEvent.getY() < rect.top - KL2.LIZJ(c161416Vd.LJLIL, 20.0f)) {
                    return false;
                }
                if (motionEvent.getY() > KL2.LIZJ(c161416Vd.LJLIL, 20.0f) + rect.bottom) {
                    return false;
                }
                float height = (rect.height() / 2) + rect.top;
                float x = motionEvent.getX() - rect.left;
                if (x < 0.0f) {
                    x = 0.0f;
                } else if (x > rect.width()) {
                    x = rect.width();
                }
                return c161416Vd.LJLLLL.onTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), x, height, motionEvent.getMetaState()));
        }
    }
}
