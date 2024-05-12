package X;

import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.PickYourAdPlanPage;

/* loaded from: classes7.dex */
public final class G0X implements InterfaceC247699np {
    public final /* synthetic */ IComplianceService LIZ;
    public final /* synthetic */ PickYourAdPlanPage LIZIZ;
    public final /* synthetic */ InterfaceC40755Fz5 LIZJ;
    public final /* synthetic */ G0D LIZLLL;
    public final /* synthetic */ G0L LJ;

    @Override // X.InterfaceC247699np
    public final void onFail() {
        this.LJ.LIZLLL();
    }

    @Override // X.InterfaceC247699np
    public final void onSuccess() {
        this.LIZJ.LJ().invoke(this.LIZ.LJIIZILJ(new G1G(this.LIZLLL, this.LJ), this.LIZIZ), Boolean.TRUE);
    }

    public G0X(IComplianceService iComplianceService, PickYourAdPlanPage pickYourAdPlanPage, InterfaceC40755Fz5 interfaceC40755Fz5, G0D g0d, G0L g0l) {
        this.LIZ = iComplianceService;
        this.LIZIZ = pickYourAdPlanPage;
        this.LIZJ = interfaceC40755Fz5;
        this.LIZLLL = g0d;
        this.LJ = g0l;
    }
}
