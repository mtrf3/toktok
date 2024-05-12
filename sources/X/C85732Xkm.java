package X;

import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;

/* renamed from: X.Xkm, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85732Xkm extends C85742Xkw {
    public final /* synthetic */ InputCodeFragmentV2 LJLIL;

    @Override // X.InterfaceC85737Xkr
    public final void LIZ() {
        if (this.LJLIL.isViewValid()) {
            this.LJLIL.dm();
        }
    }

    @Override // X.InterfaceC85737Xkr
    public final void onStart() {
        this.LJLIL.em();
    }

    public C85732Xkm(InputCodeFragmentV2 inputCodeFragmentV2) {
        this.LJLIL = inputCodeFragmentV2;
    }

    @Override // X.C85742Xkw, X.InterfaceC85737Xkr
    public final void LJIILIIL(long j) {
        if (this.LJLIL.isViewValid()) {
            this.LJLIL.km(j, true);
        }
    }
}
