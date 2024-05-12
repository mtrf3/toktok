package X;

import android.view.ViewTreeObserver;

/* loaded from: classes15.dex */
public final class VZU implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ VZM LJLIL;

    public VZU(VZM vzm) {
        this.LJLIL = vzm;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        this.LJLIL.LIZJ();
    }
}
