package X;

import android.app.Activity;
import android.app.Dialog;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.spark.business.SparkShareBusiness;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OQ3 implements C4RB {
    public final /* synthetic */ Activity LIZ;
    public final /* synthetic */ SparkShareBusiness LIZIZ;

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

    @Override // X.C4RB
    public final void LJ(BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        ShareDependService.LIZ.getClass();
        C44498HdG.LIZ().LJIILLIIL(this.LIZIZ.LIZLLL(), sharePackage);
    }

    @Override // X.C4RB
    public final void LJIIIIZZ(BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        ShareDependService.LIZ.getClass();
        C44498HdG.LIZ().LJIJJLI(this.LIZ, this.LIZIZ.LIZLLL());
    }

    public OQ3(Activity activity, SparkShareBusiness sparkShareBusiness) {
        this.LIZ = activity;
        this.LIZIZ = sparkShareBusiness;
    }
}
