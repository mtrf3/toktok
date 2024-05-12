package Y;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public class IDTListenerS67S0000000 implements View.OnTouchListener {
    public final int $t;

    public static final boolean onTouch$0(IDTListenerS67S0000000 iDTListenerS67S0000000, View view, MotionEvent motionEvent) {
        return true;
    }

    public static final boolean onTouch$1(IDTListenerS67S0000000 iDTListenerS67S0000000, View view, MotionEvent motionEvent) {
        return false;
    }

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

    public IDTListenerS67S0000000(int i) {
        this.$t = i;
    }
}
