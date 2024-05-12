package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.aZ5, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class ViewOnTouchListenerC93947aZ5 implements View.OnTouchListener {
    public final /* synthetic */ C0CM LJLIL;
    public final /* synthetic */ GestureDetector LJLILLLLZI;
    public final /* synthetic */ C76732zl LJLJI;

    public ViewOnTouchListenerC93947aZ5(C0CM c0cm, GestureDetector gestureDetector, C76732zl c76732zl) {
        this.LJLIL = c0cm;
        this.LJLILLLLZI = gestureDetector;
        this.LJLJI = c76732zl;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent event) {
        if (!this.LJLILLLLZI.onTouchEvent(event)) {
            o.LJIIIIZZ(event, "event");
            if (event.getAction() == 1 && this.LJLIL.getScrollState() == 0) {
                return true;
            }
            C0CM c0cm = this.LJLIL;
            event.setLocation(event.getX() + this.LJLJI.element, 1.0f);
            c0cm.dispatchTouchEvent(event);
        }
        return true;
    }
}
