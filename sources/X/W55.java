package X;

import Y.ARunnableS9S0101000_5;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes15.dex */
public class W55 implements View.OnAttachStateChangeListener, View.OnTouchListener, W56 {
    public final C81250Vug<InterfaceC81253Vuj> LJLIL;

    @Override // X.W56
    public final void LIZ() {
    }

    public W55(C81250Vug<InterfaceC81253Vuj> c81250Vug) {
        this.LJLIL = c81250Vug;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.LJLIL != null) {
            C71893SJl.LIZ(new C0BU(5, this));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.LJLIL != null) {
            C71893SJl.LIZ(new ARunnableS9S0101000_5(2, this, 8));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C81250Vug<InterfaceC81253Vuj> c81250Vug = this.LJLIL;
        if (c81250Vug != null && c81250Vug.LJI(motionEvent)) {
            return true;
        }
        return false;
    }
}
