package X;

import android.view.Surface;
import android.view.View;

/* renamed from: X.InV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnAttachStateChangeListenerC47681InV implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C47680InU LJLIL;

    public ViewOnAttachStateChangeListenerC47681InV(C47680InU c47680InU) {
        this.LJLIL = c47680InU;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Surface surface = this.LJLIL.LJLJL;
        if (surface != null) {
            surface.release();
        }
        this.LJLIL.LJLJL = new Surface(this.LJLIL.LJLJJLL);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Surface surface = this.LJLIL.LJLJL;
        if (surface != null) {
            surface.release();
            this.LJLIL.LJLJL = null;
        }
    }
}
