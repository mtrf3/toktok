package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.journey.step.swipeup.SwipeUpVideoComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G3E extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ SwipeUpVideoComponent LJLIL;

    public G3E(SwipeUpVideoComponent swipeUpVideoComponent) {
        this.LJLIL = swipeUpVideoComponent;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent e1, MotionEvent e2, float f, float f2) {
        o.LJIIIZ(e1, "e1");
        o.LJIIIZ(e2, "e2");
        C63078OpG.LIZ();
        if (e2.getRawY() - e1.getRawY() < 0.0f && Math.abs(e2.getRawY() - e1.getRawY()) >= 25.0f && Math.abs(f2) >= 400.0f) {
            SwipeUpVideoComponent swipeUpVideoComponent = this.LJLIL;
            if (!swipeUpVideoComponent.LJLLL) {
                swipeUpVideoComponent.LJLLL = true;
                swipeUpVideoComponent.Dl("slide_up");
                TuxTextView tuxTextView = this.LJLIL.LJLLILLLL;
                if (tuxTextView != null) {
                    C12460eI.LJIILJJIL(tuxTextView, "c5319", "d1940", null, null);
                } else {
                    o.LJIJI("startWatchingView");
                    throw null;
                }
            }
            SwipeUpVideoComponent swipeUpVideoComponent2 = this.LJLIL;
            swipeUpVideoComponent2.getClass();
            C63078OpG.LIZ();
            swipeUpVideoComponent2.vl(null);
        }
        return true;
    }
}
