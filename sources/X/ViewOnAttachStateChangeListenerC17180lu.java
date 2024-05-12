package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.0lu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class ViewOnAttachStateChangeListenerC17180lu implements View.OnAttachStateChangeListener, View.OnTouchListener {
    public final /* synthetic */ C17190lv LJLIL;

    public ViewOnAttachStateChangeListenerC17180lu(C17190lv c17190lv) {
        this.LJLIL = c17190lv;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C81250Vug<InterfaceC81253Vuj> c81250Vug = this.LJLIL.LIZJ;
        if (c81250Vug != null) {
            c81250Vug.LJ();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C81250Vug<InterfaceC81253Vuj> c81250Vug = this.LJLIL.LIZJ;
        if (c81250Vug != null) {
            c81250Vug.LJFF();
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C81250Vug<InterfaceC81253Vuj> c81250Vug = this.LJLIL.LIZJ;
        if (c81250Vug != null && c81250Vug.LJI(motionEvent)) {
            return true;
        }
        return false;
    }
}
