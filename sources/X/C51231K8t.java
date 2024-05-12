package X;

import com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchContainerFragment;

/* renamed from: X.K8t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51231K8t extends C0CJ {
    public final /* synthetic */ EcSearchContainerFragment LJLIL;

    @Override // X.C0CJ
    public final void LIZJ(int i) {
    }

    public C51231K8t(EcSearchContainerFragment ecSearchContainerFragment) {
        this.LJLIL = ecSearchContainerFragment;
    }

    @Override // X.C0CJ
    public final void LIZIZ(int i, float f, int i2) {
        EcSearchContainerFragment ecSearchContainerFragment = this.LJLIL;
        if (ecSearchContainerFragment.LJLILLLLZI && f == 0.0f && i2 == 0) {
            ecSearchContainerFragment.wl();
            this.LJLIL.LJLILLLLZI = false;
        }
    }
}
