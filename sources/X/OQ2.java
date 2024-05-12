package X;

import android.app.Dialog;
import com.ss.android.ugc.aweme.crossplatform.business.LandingShareBusiness;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OQ2 implements C4RB {
    public final /* synthetic */ LandingShareBusiness LIZ;

    @Override // X.C4RB
    public final void LIZ(BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
    }

    @Override // X.C4RB
    public final void LIZIZ(BaseSharePackage sharePackage, String str) {
        o.LJIIIZ(sharePackage, "sharePackage");
    }

    @Override // X.C4RB
    public final void LIZJ(BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
    }

    @Override // X.C4RB
    public final void LIZLLL(BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
    }

    @Override // X.C4RB
    public final void LJFF(Dialog dialog, BaseSharePackage sharePackage) {
        o.LJIIIZ(dialog, "dialog");
        o.LJIIIZ(sharePackage, "sharePackage");
    }

    @Override // X.C4RB
    public final void LJI(Dialog dialog, BaseSharePackage sharePackage) {
        o.LJIIIZ(dialog, "dialog");
        o.LJIIIZ(sharePackage, "sharePackage");
    }

    @Override // X.C4RB
    public final void LJII(BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
    }

    public OQ2(LandingShareBusiness landingShareBusiness) {
        this.LIZ = landingShareBusiness;
    }

    @Override // X.C4RB
    public final void LJ(BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        ShareDependService.LIZ.getClass();
        C44498HdG.LIZ().LJIILLIIL(this.LIZ.LIZIZ.LIZ.LJIIIZ, sharePackage);
    }

    @Override // X.C4RB
    public final void LJIIIIZZ(BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        ShareDependService.LIZ.getClass();
        ShareDependService LIZ = C44498HdG.LIZ();
        LandingShareBusiness landingShareBusiness = this.LIZ;
        LIZ.LJIJJLI(landingShareBusiness.LIZJ, landingShareBusiness.LIZIZ.LIZ.LJIIIZ);
    }
}
