package X;

import Y.ACallableS114S0100000_11;
import android.os.Bundle;
import android.webkit.CookieManager;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.kids.homepage.compliance.KidsSettingsServiceImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.Callable;

/* renamed from: X.QWc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class CallableC67126QWc<V> implements Callable {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ Runnable LJLILLLLZI;

    public CallableC67126QWc(Runnable runnable, boolean z) {
        this.LJLIL = z;
        this.LJLILLLLZI = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z = this.LJLIL;
        if (z) {
            if (C35154Dqw.LIZ()) {
                C67128QWe.LIZIZ.LIZ.LJIIIZ("KID_MODE");
            } else {
                C67125QWb c67125QWb = C67125QWb.LJLL;
                String str = C67125QWb.LJLJLJ;
                c67125QWb.getClass();
                C2U8.LIZ(new C67137QWn(new C47766Ios(str), "KID_MODE"));
            }
        }
        AVExternalServiceImpl.LIZ().updateVESDKDeviceId("");
        FMS fms = FMR.LIZ;
        FML fml = fms.LJI;
        if (fml == null) {
            fml = new FML();
        }
        fms.LIZ(fml);
        FVR.LIZIZ();
        OIO.LIZ.getClass();
        C61520OCm LJIILIIL = O3U.LJIILIIL();
        if (LJIILIIL != null) {
            LJIILIIL.LJFF("");
        }
        C09970aH.LIZ("device_id", "");
        C09970aH.LIZ("install_id", "");
        HashMap hashMap = new HashMap();
        hashMap.put("deviceid", "");
        EF7.LIZIZ();
        TTVideoEngine.LJJLJ(hashMap);
        PK0.LIZLLL().LIZIZ("");
        SecApiImpl.LIZ().updateDeviceIdAndInstallId("", "");
        AppLog.clearWhenSwitchChildMode(z);
        Bundle bundle = new Bundle();
        bundle.putInt("is_kids_mode", this.LJLIL ? 1 : 0);
        bundle.putInt("user_mode", ((RBX) HG3.LJIILL()).getCurUser().getUserMode());
        bundle.putInt("user_period", ((RBX) HG3.LJIILL()).getCurUser().getUserPeriod());
        AppLog.setCustomerHeader(bundle);
        if (this.LJLIL) {
            AppLog.setEventFilterByClient(KidsSettingsServiceImpl.LJIIJJI().LJII(), false);
            AppLog.resetDidWhenSwitchChildMode(EF7.LIZIZ(), this.LJLIL, 30000L, new C67127QWd(this.LJLILLLLZI));
            return C76800UCe.LIZ;
        }
        AppLog.clearDidAndIid(EF7.LIZIZ(), UUID.randomUUID().toString());
        CookieManager.getInstance().removeAllCookies(null);
        return C10K.LIZIZ(new ACallableS114S0100000_11(this.LJLILLLLZI, 9), C10K.LJIIIIZZ, null);
    }
}
