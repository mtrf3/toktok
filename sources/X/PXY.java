package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.net.settings.PayLoadControl;

/* loaded from: classes12.dex */
public final class PXY {
    public static final PayLoadControl LIZ = new PayLoadControl(false, false, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, 8191, null);
    public static PayLoadControl LIZIZ;

    public static PayLoadControl LIZ() {
        try {
            if (LIZIZ == null) {
                LIZIZ = (PayLoadControl) SettingsManager.LIZLLL().LJIIIIZZ("payload_control_settings", PayLoadControl.class, LIZ);
            }
            PayLoadControl payLoadControl = LIZIZ;
            if (payLoadControl == null) {
                return LIZ;
            }
            return payLoadControl;
        } catch (Throwable unused) {
            PayLoadControl payLoadControl2 = LIZIZ;
            if (payLoadControl2 == null) {
                return LIZ;
            }
            return payLoadControl2;
        }
    }
}
