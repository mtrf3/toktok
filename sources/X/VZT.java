package X;

import android.view.ViewTreeObserver;

/* loaded from: classes15.dex */
public final class VZT implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ VZM LJLIL;

    public VZT(VZM vzm) {
        this.LJLIL = vzm;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        this.LJLIL.LIZJ();
    }
}
