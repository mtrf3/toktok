package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IExternalService;
import yq4.a;

/* renamed from: X.FuH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40457FuH implements InterfaceC62968OnU {
    public final /* synthetic */ InterfaceC40458FuI LIZ;
    public final /* synthetic */ Activity LIZIZ;

    @Override // X.InterfaceC62968OnU
    public final void LIZJ() {
        this.LIZ.LIZIZ();
    }

    @Override // X.InterfaceC62968OnU
    public final void LIZIZ() {
        if (AV1.LJIIJJI()) {
            IExternalService LIZ = AVExternalServiceImpl.LIZ();
            LIZ.publishService().cancelSynthesis(this.LIZIZ, "ftc_login");
            LIZ.abilityService().effectService().clearCacheInFTC();
            FMX.onEventV3("kids_log_in");
            Context LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ == null) {
                LJIIIIZZ = EF7.LIZIZ();
            }
            a.LJI().LJIILJJIL(LJIIIIZZ);
        }
    }

    public C40457FuH(C39778FjK c39778FjK, Activity activity) {
        this.LIZ = c39778FjK;
        this.LIZIZ = activity;
    }

    @Override // X.InterfaceC62968OnU
    public final void LIZ(String str, boolean z) {
        this.LIZ.LIZ();
    }
}
