package X;

import android.app.Application;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.provider.Settings;
import com.bytedance.bpea.basics.Cert;

/* renamed from: X.IcD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46981IcD {
    public static boolean LIZ;
    public static boolean LIZJ;
    public static final C46983IcF LIZIZ = new C46983IcF();
    public static boolean LIZLLL = true;

    public static int LIZ() {
        Application application = C46982IcE.LIZ;
        int i = -1;
        if (application == null) {
            return -1;
        }
        try {
            i = 1;
            if (Settings.System.getInt(application.getContentResolver(), "screen_brightness_mode") == 1) {
                return 1;
            }
            return 0;
        } catch (Throwable unused) {
            return i;
        }
    }

    public static int LIZIZ() {
        Application application = C46982IcE.LIZ;
        if (application == null) {
            return -1;
        }
        try {
            return Settings.System.getInt(application.getContentResolver(), "screen_brightness");
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static void LIZJ() {
        if (!LIZJ || LIZLLL || LIZ) {
            return;
        }
        LIZ = true;
        Application application = C46982IcE.LIZ;
        if (application == null) {
            return;
        }
        try {
            Object LLILL = C16880lQ.LLILL(application, "sensor");
            if (LLILL != null) {
                SensorManager sensorManager = (SensorManager) LLILL;
                if (C46982IcE.LJFF == null) {
                    C46982IcE.LJFF = C46982IcE.LIZIZ().createBpeaLightSensor(sensorManager);
                }
                Sensor sensor = C46982IcE.LJFF;
                if (sensor != null) {
                    C39187FZn c39187FZn = C39188FZo.LIZ;
                    C46983IcF c46983IcF = LIZIZ;
                    Cert LJ = C46982IcE.LJ(true);
                    c39187FZn.getClass();
                    C39187FZn.LIZJ(sensorManager, c46983IcF, sensor, 3, LJ);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.hardware.SensorManager");
        } catch (Q0C unused) {
        }
    }
}
