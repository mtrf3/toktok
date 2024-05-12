package Y;

import X.C82740Wdc;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes3.dex */
public class IDTListenerS69S0000000_2 implements View.OnTouchListener {
    public final int $t;

    public static final boolean onTouch$0(IDTListenerS69S0000000_2 iDTListenerS69S0000000_2, View view, MotionEvent motionEvent) {
        return true;
    }

    public static final boolean onTouch$1(IDTListenerS69S0000000_2 iDTListenerS69S0000000_2, View view, MotionEvent motionEvent) {
        return true;
    }

    public static final boolean onTouch$2(IDTListenerS69S0000000_2 iDTListenerS69S0000000_2, View view, MotionEvent motionEvent) {
        return true;
    }

    public static final boolean onTouch$4(IDTListenerS69S0000000_2 iDTListenerS69S0000000_2, View view, MotionEvent motionEvent) {
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
            case 3:
                return onTouch$3(this, view, motionEvent);
            case 4:
                return onTouch$4(this, view, motionEvent);
            default:
                return false;
        }
    }

    public IDTListenerS69S0000000_2(int i) {
        this.$t = i;
    }

    public static final boolean onTouch$3(IDTListenerS69S0000000_2 iDTListenerS69S0000000_2, View view, MotionEvent motionEvent) {
        if (view.getTag() != null && !((Boolean) view.getTag()).booleanValue()) {
            return false;
        }
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
