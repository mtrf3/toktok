package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;

/* loaded from: classes9.dex */
public final class KUC extends AbstractC65781Prl implements InterfaceC88472Yns<KUB, C76800UCe> {
    public final /* synthetic */ KRA LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<KUB, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KUC(KRA kra, InterfaceC88472Yns<? super KUB, C76800UCe> interfaceC88472Yns, boolean z) {
        super(1);
        this.LJLIL = kra;
        this.LJLILLLLZI = interfaceC88472Yns;
        this.LJLJI = z;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(KUB kub) {
        Lifecycle.State state;
        KUB kub2;
        Lifecycle lifecycle;
        Lifecycle.State state2;
        Lifecycle lifecycle2;
        KUB kub3 = kub;
        if (kub3 == null) {
            String valueOf = String.valueOf(this.LJLIL.LJ);
            Fragment fragment = this.LJLIL.LJ;
            if (fragment != null && (lifecycle2 = fragment.getLifecycle()) != null) {
                state2 = lifecycle2.getCurrentState();
            } else {
                state2 = null;
            }
            kub2 = new KUB(valueOf, String.valueOf(state2));
            KRA kra = this.LJLIL;
            KUF<KUB> kuf = KUE.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("immutable_scene_");
            LIZ.append(kra.LIZ);
            kuf.LIZIZ(X1D.LIZIZ(LIZ), kub2);
        } else {
            kub3.LIZ = String.valueOf(this.LJLIL.LJ);
            Fragment fragment2 = this.LJLIL.LJ;
            if (fragment2 != null && (lifecycle = fragment2.getLifecycle()) != null) {
                state = lifecycle.getCurrentState();
            } else {
                state = null;
            }
            kub3.LIZIZ = String.valueOf(state);
            InterfaceC88472Yns<KUB, C76800UCe> interfaceC88472Yns = this.LJLILLLLZI;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(kub3);
            }
            kub2 = kub3;
        }
        if (this.LJLJI) {
            KUD.LIZJ(String.valueOf(kub2), null);
        } else {
            C60392Yp.LIZ("LComponentError", String.valueOf(kub3), 12);
        }
        return C76800UCe.LIZ;
    }
}
