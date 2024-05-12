package X;

import com.ss.android.ugc.aweme.ecommerce.ug.newinstall.service.EcUgNewInstallService;
import com.ss.android.ugc.aweme.ecommerce.ug.newinstall.service.IEcUgNewInstallService;

/* loaded from: classes7.dex */
public final class EJC implements EJ9 {
    @Override // X.EJ9
    public final OSZ<String, String> getParam() {
        IEcUgNewInstallService LIZLLL = EcUgNewInstallService.LIZLLL();
        if (LIZLLL != null) {
            return LIZLLL.LIZ();
        }
        return null;
    }
}
