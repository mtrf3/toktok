package X;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.service.EcUgPopupService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M04 {
    public final M0L LIZ;

    public M04(M0L mallGlobalData) {
        o.LJIIIZ(mallGlobalData, "mallGlobalData");
        this.LIZ = mallGlobalData;
    }

    public final boolean LIZ(Intent intent, Fragment fragment, String str, String str2) {
        o.LJIIIZ(fragment, "fragment");
        if (intent == null) {
            return false;
        }
        if (str2 != null) {
            C18080nM.LIZ.getClass();
            C18090nN LJFF = C18080nM.LJFF(str2);
            if (LJFF != null && LJFF.LJJIIJ) {
                C18080nM.LIZLLL = LJFF;
            }
        }
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "extra_landing_deeplink");
        if (LLJJIJIIJIL == null || ujb.o.LJJJJJL(LLJJIJIIJIL)) {
            return false;
        }
        intent.removeExtra("extra_landing_deeplink");
        this.LIZ.LJLJLJ = intent.getIntExtra("extra_delay_load_mall_tab", 0);
        EcUgPopupService.LJIILJJIL().LJIIIZ(fragment, LLJJIJIIJIL);
        intent.removeExtra("extra_delay_load_mall_tab");
        return true;
    }
}
