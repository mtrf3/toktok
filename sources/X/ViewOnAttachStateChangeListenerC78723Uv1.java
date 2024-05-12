package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Uv1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class ViewOnAttachStateChangeListenerC78723Uv1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C78720Uuy LJLIL;

    public ViewOnAttachStateChangeListenerC78723Uv1(C78720Uuy c78720Uuy) {
        this.LJLIL = c78720Uuy;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        o.LJIIIZ(v, "v");
        C81250Vug<InterfaceC81253Vuj> c81250Vug = this.LJLIL.LIZLLL;
        if (c81250Vug != null) {
            c81250Vug.LJ();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        o.LJIIIZ(v, "v");
        C81250Vug<InterfaceC81253Vuj> c81250Vug = this.LJLIL.LIZLLL;
        if (c81250Vug != null) {
            c81250Vug.LJFF();
        }
    }
}
