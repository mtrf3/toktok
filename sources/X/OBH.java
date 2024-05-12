package X;

import android.app.Activity;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;

/* loaded from: classes11.dex */
public final class OBH extends AbstractC62121OZp {
    public OBH(C62116OZk c62116OZk) {
        super(c62116OZk);
    }

    @Override // X.InterfaceC58734N3i
    public final boolean LIZIZ(int i, String str) {
        Activity LJIIIIZZ;
        if (TextUtils.isEmpty(str) || (LJIIIIZZ = C84763XOl.LJIIIIZZ()) == null) {
            return false;
        }
        IMiniAppService LIZIZ = C38499F9b.LIZ.LIZIZ();
        C227898wz c227898wz = new C227898wz();
        if (!C56209M4f.LIZ(str)) {
            return false;
        }
        LIZIZ.openMiniApp(LJIIIIZZ, str, c227898wz);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "scan");
        c188727au.LJIIIZ("enter_method", "scan_cam");
        c188727au.LJIIIZ("microapp_id", C30591Hz.LJIILIIL(str, "app_id"));
        FMX.LJIIL("enter_microapp", c188727au.LIZ);
        return true;
    }
}
