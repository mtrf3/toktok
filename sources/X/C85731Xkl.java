package X;

import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment;

/* renamed from: X.Xkl, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85731Xkl extends C85742Xkw {
    public final /* synthetic */ InputCodeFragment LJLIL;

    @Override // X.InterfaceC85737Xkr
    public final void LIZ() {
        if (this.LJLIL.isViewValid()) {
            this.LJLIL.km();
        }
    }

    @Override // X.InterfaceC85737Xkr
    public final void onStart() {
        this.LJLIL.lm();
    }

    public C85731Xkl(InputCodeFragment inputCodeFragment) {
        this.LJLIL = inputCodeFragment;
    }

    @Override // X.C85742Xkw, X.InterfaceC85737Xkr
    public final void LJIILIIL(long j) {
        if (this.LJLIL.isViewValid()) {
            this.LJLIL.nm(j, true);
        }
    }
}
