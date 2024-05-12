package X;

import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.GzU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnTouchListenerC43328GzU implements View.OnTouchListener {
    public static final ViewOnTouchListenerC43328GzU LJLIL = new ViewOnTouchListenerC43328GzU();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent event) {
        o.LJIIIIZZ(view, "view");
        o.LJIIIIZZ(event, "event");
        if (event.getActionMasked() == 1) {
            view.performClick();
            return false;
        }
        return false;
    }
}
