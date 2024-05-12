package com.ss.android.ugc.aweme.commerce.anywhere;

import X.C16880lQ;
import X.C171096nZ;
import X.C37090Eh4;
import X.C38543FAt;
import X.C38544FAu;
import X.C38547FAx;
import X.EF7;
import X.EnumC38542FAs;
import X.HG3;
import X.InterfaceC38548FAy;
import X.RBX;
import android.content.Context;
import android.os.Build;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.keva.Keva;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import java.net.URLEncoder;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AnyDoorDepend {
    public static final int $stable = 0;

    public void cleanExtraMockCacheIfNeed() {
        ISplashAdService iSplashAdService = (ISplashAdService) C171096nZ.LIZ(ISplashAdService.class);
        if (iSplashAdService != null) {
            iSplashAdService.LJIL();
        }
    }

    public C38547FAx getAppInfo() {
        String str;
        boolean z;
        String valueOf = String.valueOf(C38544FAu.LIZ);
        String serverDeviceId = AppLog.getServerDeviceId();
        HG3.LJIIL();
        if (HG3.LJLJL.LIZ()) {
            str = ((RBX) HG3.LJIILL()).getCurUserId();
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        String deviceName = URLEncoder.encode(Build.MODEL, "UTF-8");
        LocalTestApi localTestApi = C37090Eh4.LIZ.LIZ;
        if (localTestApi != null && localTestApi.enableBoe()) {
            z = true;
        } else {
            z = false;
        }
        String appVersion = C16880lQ.LLLLLLZ(getContext().getPackageManager(), getContext().getPackageName(), 0).versionName;
        String str2 = Build.VERSION.RELEASE;
        String string = Keva.getRepo("aweme_network").getString("lastInputEmailPrefix", "");
        o.LJIIIIZZ(appVersion, "appVersion");
        o.LJIIIIZZ(deviceName, "deviceName");
        return new C38547FAx(valueOf, str, serverDeviceId, appVersion, deviceName, str2, string, z);
    }

    public InterfaceC38548FAy getRouter() {
        return new C38543FAt();
    }

    public Context getContext() {
        return EF7.LIZIZ();
    }

    public EnumC38542FAs getAppType() {
        return EnumC38542FAs.US;
    }
}
