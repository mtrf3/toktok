package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IExternalService;

/* renamed from: X.FuG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40456FuG implements InterfaceC40454FuE {
    public final C40390FtC LIZ = new C40390FtC();
    public final C40455FuF LIZIZ = new C40455FuF();

    @Override // X.InterfaceC40454FuE
    public final C40455FuF LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC40454FuE
    public final C40390FtC LIZJ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC40454FuE
    public final void LIZ(Activity activity) {
        IExternalService LIZ = AVExternalServiceImpl.LIZ();
        LIZ.publishService().cancelSynthesis(activity, "ftc_login");
        LIZ.abilityService().effectService().clearCacheInFTC();
    }
}
