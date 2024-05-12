package Y;

import X.C82740Wdc;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes15.dex */
public class IDTListenerS70S0000000_14 implements View.OnTouchListener {
    public final int $t;

    public static final boolean onTouch$2(IDTListenerS70S0000000_14 iDTListenerS70S0000000_14, View view, MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            default:
                return false;
        }
    }

    public IDTListenerS70S0000000_14(int i) {
        this.$t = i;
    }

    public static final boolean onTouch$0(IDTListenerS70S0000000_14 iDTListenerS70S0000000_14, View view, MotionEvent motionEvent) {
        if (view.getTag() != null && !((Boolean) view.getTag()).booleanValue()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                C82740Wdc.LIZ(view, false);
            }
        } else {
            C82740Wdc.LIZ(view, true);
        }
        return false;
    }

    public static final boolean onTouch$1(IDTListenerS70S0000000_14 iDTListenerS70S0000000_14, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                C82740Wdc.LIZLLL(view, false);
            }
        } else {
            C82740Wdc.LIZLLL(view, true);
        }
        return false;
    }
}
