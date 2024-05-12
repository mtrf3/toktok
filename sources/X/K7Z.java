package X;

import com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchResultFragmentNew;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K7Z implements InterfaceC74055T4p {
    public final /* synthetic */ EcSearchResultFragmentNew LIZ;

    @Override // X.InterfaceC74055T4p
    public final void LIZ(KEI tab) {
        o.LJIIIZ(tab, "tab");
    }

    @Override // X.InterfaceC74055T4p
    public final void LIZIZ(KEI kei) {
    }

    public K7Z(EcSearchResultFragmentNew ecSearchResultFragmentNew) {
        this.LIZ = ecSearchResultFragmentNew;
    }

    @Override // X.InterfaceC74055T4p
    public final void LIZJ(KEI tab) {
        o.LJIIIZ(tab, "tab");
        EcSearchResultFragmentNew ecSearchResultFragmentNew = this.LIZ;
        if (ecSearchResultFragmentNew.Wl(ecSearchResultFragmentNew.LJLJI.getHint().toString())) {
            this.LIZ.getClass();
            EcSearchResultFragmentNew ecSearchResultFragmentNew2 = this.LIZ;
            ecSearchResultFragmentNew2.LJLJI.setHint(ecSearchResultFragmentNew2.Il());
        }
        this.LIZ.Nm(tab.LIZLLL);
    }
}
