package X;

import android.view.View;
import android.webkit.WebView;
import kotlin.jvm.internal.o;

/* renamed from: X.VMf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnAttachStateChangeListenerC79609VMf implements View.OnAttachStateChangeListener {
    public final /* synthetic */ VMK LJLIL;

    public ViewOnAttachStateChangeListenerC79609VMf(VMK vmk) {
        this.LJLIL = vmk;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        o.LJIIJ(v, "v");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onViewAttachedToWindow() called with: v = ");
        LIZ.append(v);
        X1D.LIZIZ(LIZ);
        if (v instanceof WebView) {
            VMK vmk = this.LJLIL;
            vmk.getClass();
            vmk.LJI(EnumC79613VMj.ATTACHED);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        o.LJIIJ(v, "v");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onViewDetachedFromWindow() called with: v = ");
        LIZ.append(v);
        X1D.LIZIZ(LIZ);
        if (v instanceof WebView) {
            VMK vmk = this.LJLIL;
            vmk.getClass();
            vmk.LJI(EnumC79613VMj.DETACHED);
            vmk.LIZIZ();
        }
    }
}
