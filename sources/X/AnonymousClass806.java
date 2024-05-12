package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.806, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass806 implements View.OnTouchListener {
    public final float LJLIL;
    public View.OnTouchListener LJLILLLLZI = null;

    public AnonymousClass806(float f) {
        this.LJLIL = f;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                view.animate().alpha(1.0f).setDuration(150L).start();
            }
        } else {
            view.animate().alpha(this.LJLIL).setDuration(150L).start();
        }
        View.OnTouchListener onTouchListener = this.LJLILLLLZI;
        if (onTouchListener != null && onTouchListener.onTouch(view, motionEvent)) {
            return true;
        }
        return false;
    }
}
