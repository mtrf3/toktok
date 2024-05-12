package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* renamed from: X.Bpr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnTouchListenerC29991Bpr implements View.OnTouchListener {
    public final /* synthetic */ GestureDetector LJLIL;

    public ViewOnTouchListenerC29991Bpr(GestureDetector gestureDetector) {
        this.LJLIL = gestureDetector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.LJLIL.onTouchEvent(motionEvent);
        }
        return false;
    }
}
