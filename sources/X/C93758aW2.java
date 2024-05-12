package X;

import com.bytedance.speech.speechengine.SpeechEngineGenerator;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.deviceregister.DeviceRegisterManager;

/* renamed from: X.aW2, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93758aW2 {
    public static boolean LIZ;

    public static void LIZ() {
        if (!LIZ) {
            try {
                TTNetInit.forceInitCronetKernel();
                SpeechEngineGenerator.initMonitor(EF7.LIZIZ(), DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId(), String.valueOf(EF7.LJIIIZ), String.valueOf(EF7.LJI()), String.valueOf(EF7.LJFF()), "https://mon.tiktokv.com/monitor/appmonitor/v2/settings", "https://mon.tiktokv.com/monitor/collect/");
            } catch (Throwable unused) {
                C78983UzD.LJIILL("asrengine_loadso_failed_1");
            }
            LIZ = true;
        }
    }
}
