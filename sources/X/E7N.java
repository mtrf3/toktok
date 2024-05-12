package X;

import com.ss.android.deviceregister.DeviceRegisterManager;
import kotlin.jvm.internal.o;

@FI7("search_survey_debug")
/* loaded from: classes7.dex */
public final class E7N {
    public static String LIZ = "";
    public static String LIZIZ = "";

    public static boolean LIZIZ() {
        try {
            FHD.LIZLLL().getClass();
            return FHD.LJ(0, 0, "search_survey_debug", true) == 1 && o.LJ(EF7.LJIILIIL, "local_test");
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String LIZ() {
        if (LIZIZ()) {
            if (LIZ.length() == 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId());
                LIZ2.append('_');
                LIZ2.append(System.currentTimeMillis());
                LIZ = X1D.LIZIZ(LIZ2);
            }
            return LIZ;
        }
        String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        o.LJIIIIZZ(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId, "{\n            DeviceRegi…r.getDeviceId()\n        }");
        return com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId;
    }
}
