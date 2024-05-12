package X;

import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeTrialPageInfo;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes7.dex */
public final class G0M extends G0C<C40784FzY> {
    @Override // X.G04
    public final EnumC40761FzB type() {
        return EnumC40761FzB.JOURNEY_FREE_TRIAL_ID;
    }

    @Override // X.G04
    public final boolean LIZIZ(C35656Dz2 c35656Dz2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("shouldHandle scene:");
        LIZ.append(this.LIZIZ.LIZ.type());
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ));
        if (c35656Dz2 == null) {
            return false;
        }
        G1W g1w = (G1W) this.LIZ.LIZ(G1W.class);
        if (g1w != null && !g1w.sc()) {
            return false;
        }
        return a.LJIIJ().LJJI();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0M(G0D context, G15 flowEngine) {
        super(context, flowEngine);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(flowEngine, "flowEngine");
    }

    @Override // X.G0C, X.G04
    public final void LIZ(G0D context, C35656Dz2 c35656Dz2, InterfaceC88472Yns interfaceC88472Yns) {
        AdFreeTrialPageInfo adFreeTrialPageInfo;
        C40784FzY c40784FzY = (C40784FzY) c35656Dz2;
        o.LJIIIZ(context, "context");
        super.LIZ(context, c40784FzY, interfaceC88472Yns);
        InterfaceC40755Fz5 interfaceC40755Fz5 = (InterfaceC40755Fz5) this.LIZ.LJLILLLLZI;
        IComplianceService LJIIJ = a.LJIIJ();
        if (c40784FzY != null && (adFreeTrialPageInfo = c40784FzY.LIZIZ) != null) {
            interfaceC40755Fz5.LJ().invoke(LJIIJ.LJJ(new G1U(this), adFreeTrialPageInfo), Boolean.TRUE);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        LIZLLL();
    }
}
