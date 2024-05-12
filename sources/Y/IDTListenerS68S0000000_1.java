package Y;

import X.C101073xv;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes2.dex */
public class IDTListenerS68S0000000_1 implements View.OnTouchListener {
    public final int $t;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            default:
                return false;
        }
    }

    public IDTListenerS68S0000000_1(int i) {
        this.$t = i;
    }

    public static final boolean onTouch$0(IDTListenerS68S0000000_1 iDTListenerS68S0000000_1, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return false;
            }
            view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(40L).start();
            return false;
        }
        view.setScaleX(0.8f);
        view.setScaleY(0.8f);
        return false;
    }

    public static final boolean onTouch$1(IDTListenerS68S0000000_1 iDTListenerS68S0000000_1, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                C101073xv.LIZ(view, false);
            }
        } else {
            C101073xv.LIZ(view, true);
        }
        return false;
    }
}
