package X;

import android.app.Dialog;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.OeP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62405OeP implements C4RB {
    public final /* synthetic */ C193597il LIZ;

    public C62405OeP(C193597il c193597il) {
        this.LIZ = c193597il;
    }

    @Override // X.C4RB
    public final void LIZ(BaseSharePackage sharePackage) {
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
    public final void LJ(BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("enter_from", this.LIZ.LIZ), new OSZ("poi_id", this.LIZ.LIZIZ), new OSZ("poi_city", this.LIZ.LJFF), new OSZ("poi_region_code", this.LIZ.LJI), new OSZ("poi_info_source", this.LIZ.LJII));
        LJJLIIIIJ.putAll(LocationServiceImpl.LJIJJ().getLocationCommonParamsIfHave());
        FMX.LJIIL("send_message_poi", LJJLIIIIJ);
    }

    @Override // X.C4RB
    public final void LJII(BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
    }

    @Override // X.C4RB
    public final void LJIIIIZZ(BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
    }

    @Override // X.C4RB
    public final void LIZIZ(BaseSharePackage sharePackage, String str) {
        o.LJIIIZ(sharePackage, "sharePackage");
    }

    @Override // X.C4RB
    public final void LJFF(Dialog dialog, BaseSharePackage baseSharePackage) {
        C113284cW.LIZ(dialog, baseSharePackage);
    }

    @Override // X.C4RB
    public final void LJI(Dialog dialog, BaseSharePackage baseSharePackage) {
        C113284cW.LIZIZ(dialog, baseSharePackage);
    }
}
