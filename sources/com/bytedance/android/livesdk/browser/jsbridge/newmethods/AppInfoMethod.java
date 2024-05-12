package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import X.AbstractC38127Exn;
import X.ActivityC45651qj;
import X.C0DC;
import X.C15380j0;
import X.C16880lQ;
import X.C29306Beo;
import X.C38131Exr;
import X.CN1;
import X.InterfaceC65349Pkn;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.ss.android.common.applog.AppLog;

/* loaded from: classes14.dex */
public final class AppInfoMethod extends AbstractC38127Exn<Object, Result> {

    /* loaded from: classes14.dex */
    public static class Result {

        @InterfaceC65349Pkn("aid")
        public int aid;

        @InterfaceC65349Pkn("appName")
        public String appName;

        @InterfaceC65349Pkn("appVersion")
        public String appVersion;

        @InterfaceC65349Pkn("device_id")
        public String device_id;

        @InterfaceC65349Pkn("isAppBackground")
        public int isAppBackground;

        @InterfaceC65349Pkn("isLowPowerMode")
        public int isLowPowerMode;

        @InterfaceC65349Pkn("netType")
        public String netType;

        @InterfaceC65349Pkn("orientation")
        public String orientation;

        @InterfaceC65349Pkn("screenHeight")
        public float screenHeight;

        @InterfaceC65349Pkn("screenWidth")
        public float screenWidth;

        @InterfaceC65349Pkn("user_id")
        public String user_id;

        @InterfaceC65349Pkn("versionCode")
        public String versionCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC38127Exn
    public final Result invoke(Object obj, C38131Exr c38131Exr) {
        String str;
        String str2;
        PowerManager powerManager;
        Result result = new Result();
        IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
        result.appName = iHostAppContext.appName();
        result.aid = iHostAppContext.appId();
        int i = 0;
        i = 0;
        i = 0;
        try {
            str = C16880lQ.LLLLLLZ(c38131Exr.LIZ.getPackageManager(), c38131Exr.LIZ.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            str = iHostAppContext.getVersionCode();
        }
        result.appVersion = str;
        result.versionCode = iHostAppContext.getVersionCode();
        result.netType = C16880lQ.LLJILJILJ(iHostAppContext.context());
        ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(c38131Exr.LIZ);
        if (LIZIZ == null || LIZIZ.getRequestedOrientation() == 1) {
            str2 = "vertical";
        } else {
            str2 = "horizontal";
        }
        result.orientation = str2;
        result.device_id = AppLog.getServerDeviceId();
        result.user_id = C0DC.LIZ();
        result.screenWidth = C15380j0.LJIJ(C15380j0.LJIIL());
        result.screenHeight = C15380j0.LJIJ(C15380j0.LJIIJJI());
        IHostAppContext iHostAppContext2 = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
        if (iHostAppContext2 != null) {
            result.isAppBackground = iHostAppContext2.isAppBackground() ? 1 : 0;
        }
        Context context = c38131Exr.LIZ;
        if (Build.VERSION.SDK_INT > 21) {
            Object obj2 = null;
            if (context != null) {
                obj2 = C16880lQ.LLILL(context, "power");
            }
            if ((obj2 instanceof PowerManager) && (powerManager = (PowerManager) obj2) != null) {
                i = powerManager.isPowerSaveMode();
            }
        }
        result.isLowPowerMode = i;
        return result;
    }
}
