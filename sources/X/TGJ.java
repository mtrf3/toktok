package X;

import Y.ACListenerS32S0100000_12;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TGJ {
    public final View LIZ;

    public TGJ(View view) {
        this.LIZ = view;
        view.setOnTouchListener(new View.OnTouchListener() { // from class: X.2QL
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1 && action != 3) {
                        return false;
                    }
                    view2.animate().alpha(1.0f).setDuration(200L).start();
                    return false;
                }
                view2.animate().alpha(0.5f).setDuration(200L).start();
                return false;
            }
        });
    }

    public final void LIZ(ACListenerS32S0100000_12 aCListenerS32S0100000_12) {
        C16880lQ.LJIIJ(aCListenerS32S0100000_12, this.LIZ);
        View targetView = this.LIZ;
        o.LJIIIZ(targetView, "targetView");
    }
}
