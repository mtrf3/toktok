package X;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import java.math.BigDecimal;
import java.util.Arrays;

/* renamed from: X.Imm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47636Imm {
    public static AudioManager LIZ = null;
    public static int LIZIZ = -1;
    public static int LIZJ = -1;
    public static boolean LIZLLL = false;
    public static C47849IqD LJ = null;
    public static long LJFF = 0;
    public static int LJI = 3;
    public static long LJII = 0;
    public static String LJIIIIZZ = "";

    public static String LIZIZ() {
        AudioDeviceInfo[] devices;
        if (Build.VERSION.SDK_INT >= 23 && Math.abs(System.currentTimeMillis() - LJII) > 60000) {
            if (!LJIIIZ(EF7.LIZIZ()) && (devices = LIZ.getDevices(2)) != null) {
                for (AudioDeviceInfo audioDeviceInfo : devices) {
                    int type = audioDeviceInfo.getType();
                    if (type != 3 && type != 4 && type != 22 && (type == 7 || type == 8)) {
                        CharSequence productName = audioDeviceInfo.getProductName();
                        if (productName != null) {
                            LJIIIIZZ = productName.toString();
                        }
                    }
                }
            }
            LJII = System.currentTimeMillis();
        }
        return LJIIIIZZ;
    }

    public static int LIZ() {
        if (LJIIIZ(EF7.LIZIZ())) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            AudioDeviceInfo[] devices = LIZ.getDevices(1);
            if (devices == null) {
                return 4;
            }
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                int type = audioDeviceInfo.getType();
                if (type == 3) {
                    return 1;
                }
                if (type == 22) {
                    return 2;
                }
                if (type == 7 || type == 8) {
                    return 3;
                }
            }
            return 0;
        }
        if (LIZ.isWiredHeadsetOn()) {
            return 1;
        }
        if (!LIZ.isBluetoothScoOn() && !LIZ.isBluetoothA2dpOn()) {
            return 0;
        }
        return 3;
    }

    public static int LIZJ() {
        if (LJIIIZ(EF7.LIZIZ())) {
            return 3;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            AudioDeviceInfo[] devices = LIZ.getDevices(2);
            if (devices == null) {
                return 3;
            }
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                int type = audioDeviceInfo.getType();
                if (type == 3 || type == 4) {
                    return 4;
                }
                if (type == 22) {
                    return 5;
                }
                if (type == 7 || type == 8) {
                    return 2;
                }
            }
            return 0;
        }
        if (LIZ.isWiredHeadsetOn()) {
            return 4;
        }
        if (!LIZ.isBluetoothScoOn() && !LIZ.isBluetoothA2dpOn()) {
            return 0;
        }
        return 2;
    }

    public static int LIZLLL() {
        if (Math.abs(System.currentTimeMillis() - LJFF) > LivePlayEnforceIntervalSetting.DEFAULT) {
            LJI = LIZJ();
            LJFF = System.currentTimeMillis();
        }
        return LJI;
    }

    public static int LJ(Context context) {
        if (LJIIIZ(context)) {
            return -1;
        }
        if (LIZIZ < 0) {
            LIZIZ = C16880lQ.LLLLLLZZ(LIZ, 3);
        }
        return LIZIZ;
    }

    public static int LJFF(Context context) {
        if (LJIIIZ(context)) {
            return 3;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            AudioDeviceInfo[] devices = LIZ.getDevices(2);
            if (devices == null) {
                return 3;
            }
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                int type = audioDeviceInfo.getType();
                if (type == 3 || type == 4 || type == 22) {
                    return 1;
                }
                if (type == 7 || type == 8) {
                    return 2;
                }
            }
            return 0;
        }
        if (LIZ.isWiredHeadsetOn()) {
            return 1;
        }
        if (!LIZ.isBluetoothScoOn() && !LIZ.isBluetoothA2dpOn()) {
            return 0;
        }
        return 2;
    }

    public static int LJI(Context context) {
        if (LJIIIZ(context)) {
            return -1;
        }
        try {
            return LIZ.getStreamVolume(3);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static double LJII(int i) {
        if (LJIIIZ(EF7.LIZIZ())) {
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        try {
            if (LIZIZ < 0) {
                LIZIZ = LJ(EF7.LIZIZ());
            }
            if (LIZJ < 0 || !LIZLLL) {
                LIZJ = LJI(EF7.LIZIZ());
            }
            return new BigDecimal((LIZJ * 1.0d) / LIZIZ).setScale(i, 4).doubleValue();
        } catch (Exception unused) {
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
    }

    public static boolean LJIIIIZZ(Context context) {
        AudioDeviceInfo[] devices;
        if (LJIIIZ(context)) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (((Boolean) C47637Imn.LIZ.getValue()).booleanValue()) {
                AudioDeviceInfo[] audioDeviceInfoArr = C47640Imq.LIZIZ;
                if (audioDeviceInfoArr != null) {
                    devices = (AudioDeviceInfo[]) Arrays.copyOf(audioDeviceInfoArr, audioDeviceInfoArr.length);
                }
                return false;
            }
            devices = LIZ.getDevices(2);
            if (devices != null) {
                for (AudioDeviceInfo audioDeviceInfo : devices) {
                    int type = audioDeviceInfo.getType();
                    if (type == 3 || type == 4 || type == 7 || type == 8) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        if (!LIZ.isWiredHeadsetOn() && !LIZ.isBluetoothScoOn() && !LIZ.isBluetoothA2dpOn()) {
            return false;
        }
        return true;
    }

    public static boolean LJIIIZ(Context context) {
        if (LIZ == null) {
            try {
                LIZ = (AudioManager) C16880lQ.LLILL(context, "audio");
            } catch (Exception unused) {
            }
        }
        if (LIZ == null) {
            return true;
        }
        return false;
    }

    public static void LJIIJ(Context context) {
        if (!LIZLLL) {
            try {
                if (LJIIIZ(context)) {
                    return;
                }
                LJ = new C47849IqD(LIZ);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                C16880lQ.LJJLIIIJILLIZJL(LJ, context, intentFilter);
                LIZLLL = true;
            } catch (Exception unused) {
            }
        }
    }
}
