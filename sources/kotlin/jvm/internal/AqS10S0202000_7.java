package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C07290Qj;
import X.C133765Mu;
import X.C43212Gxc;
import X.C61712OJw;
import X.C61713OJx;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene;
import com.ss.android.ugc.aweme.services.ISDKService;

/* loaded from: classes8.dex */
public class AqS10S0202000_7 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public final void invoke$0() {
        ((ISDKService.SplitCallback) this.l0).onSuccess(this.i3, this.i2);
        ((C133765Mu) this.l1).destroy();
    }

    public static final Object invoke$0(AqS10S0202000_7 aqS10S0202000_7) {
        boolean z;
        C61713OJx LIZJ = C61712OJw.LIZJ(((AbsSceneAdaptationScene) aqS10S0202000_7.l0).LLJLL());
        LIZJ.LIZIZ.LJIIL();
        LIZJ.LJ(((C43212Gxc) aqS10S0202000_7.l1).LJLJLLL);
        boolean z2 = false;
        LIZJ.LIZ(false);
        if (C07290Qj.LJII(aqS10S0202000_7.i2) > 0.5d) {
            z = true;
        } else {
            z = false;
        }
        LIZJ.LIZIZ.LJIIJ(z);
        if (C07290Qj.LJII(aqS10S0202000_7.i3) > 0.5d) {
            z2 = true;
        }
        LIZJ.LIZIZ.LJII(z2);
        LIZJ.LIZJ();
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AqS10S0202000_7 aqS10S0202000_7) {
        aqS10S0202000_7.invoke$0();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS10S0202000_7(AbsSceneAdaptationScene absSceneAdaptationScene, C43212Gxc c43212Gxc, int i, int i2, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = absSceneAdaptationScene;
        this.l1 = c43212Gxc;
        this.i2 = i;
        this.i3 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS10S0202000_7(ISDKService.SplitCallback splitCallback, int i, int i2, C133765Mu c133765Mu, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = splitCallback;
        this.i3 = i;
        this.i2 = i2;
        this.l1 = c133765Mu;
    }
}
