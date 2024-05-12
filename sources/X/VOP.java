package X;

import android.view.ViewTreeObserver;

/* loaded from: classes15.dex */
public final class VOP implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ VOO LJLIL;

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        this.LJLIL.LJI = true;
    }

    public VOP(VOO voo) {
        this.LJLIL = voo;
    }
}
