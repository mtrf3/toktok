package X;

import android.content.Context;
import com.ss.android.common.applog.AppLog;
import com.ss.android.deviceregister.DeviceRegisterManager;
import defpackage.a1;
import defpackage.i0;

/* loaded from: classes7.dex */
public final class FMQ extends FMT {
    @Override // X.FMV
    public final void LIZIZ() {
    }

    public static final void LIZJ(Context context, FML fml) {
        AppLog.setEventSamplingEnable(C114914f9.LIZ());
        DeviceRegisterManager.setAppId(fml.LIZIZ);
        AppLog.setChannel(fml.LIZ);
        C66763QId c66763QId = new C66763QId(new String[]{"https://log-va.tiktokv.com/service/2/app_log/"}, new String[]{"https://rtlog.tiktokv.com/service/2/app_log/"}, new String[]{"https://log-va.tiktokv.com/service/2/device_register/", "https://log-va.tiktokv.com/service/2/device_register/"}, a1.LJ("https://", "log-va.tiktokv.com", "/service/2/app_alert_check/"), new String[]{"https://log-va.tiktokv.com/service/2/app_log/"}, i0.LJFF("https://", "log-va.tiktokv.com"));
        AppLog.setAppContext(C38835FLz.LIZ);
        AppLog.registerHeaderCustomCallback(new C1PH());
        AppLog.init(context, false, c66763QId);
    }
}
