package X;

import com.ss.android.ugc.aweme.pipfeed.PipServiceImpl;
import com.ss.android.ugc.aweme.services.ClearCacheService;
import yq4.a;

/* renamed from: X.Fb2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39264Fb2 implements InterfaceC62981Onh {
    public final /* synthetic */ C39263Fb1 LIZ;

    @Override // X.InterfaceC62981Onh
    public final void LIZIZ() {
        this.LIZ.LIZIZ(true);
        ClearCacheService.createIClearCacheServicebyMonsterPlugin(false).retryAddClearCacheShortcut();
        a.LJIIL().LIZLLL(false);
    }

    public C39264Fb2(C39263Fb1 c39263Fb1) {
        this.LIZ = c39263Fb1;
    }

    @Override // X.InterfaceC62981Onh
    public final void LIZ(String str) {
        this.LIZ.LIZJ = System.currentTimeMillis();
        C39263Fb1.LJIIIIZZ.storeBoolean("consent_once_shown", true);
        if (str != null) {
            this.LIZ.LIZ = str;
        }
        this.LIZ.LIZJ();
        PipServiceImpl.LJJII().LJIILJJIL();
        InterfaceC39268Fb6 interfaceC39268Fb6 = this.LIZ.LIZIZ;
        if (interfaceC39268Fb6 != null) {
            interfaceC39268Fb6.LLJJL();
        }
    }
}
