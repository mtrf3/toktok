package X;

import com.bytedance.android.livesdk.livesetting.hybrid.TTLiveWebviewMonitorConfigSlardarAndroidSetting;
import com.bytedance.android.livesdkapi.host.IHostHybrid;

/* loaded from: classes6.dex */
public final class CO3 {
    public static boolean LIZ;

    public static void LIZ() {
        if (LIZ) {
            return;
        }
        LIZ = true;
        ((IHostHybrid) CN1.LIZ(IHostHybrid.class)).le();
        VMI vmi = VMI.LJ;
        vmi.getClass();
        C60601NqP c60601NqP = new C60601NqP();
        c60601NqP.LJI = "99999";
        c60601NqP.LJFF = "webcast_oversea";
        c60601NqP.LIZLLL = TTLiveWebviewMonitorConfigSlardarAndroidSetting.INSTANCE.getValue();
        vmi.LJIILJJIL(c60601NqP);
    }
}
