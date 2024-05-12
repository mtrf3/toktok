package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;

/* renamed from: X.Isr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48013Isr {
    public static boolean LIZ;
    public static ConnectivityManager LIZIZ;
    public static Network LIZJ;

    public static boolean LJI() {
        try {
            if (Build.VERSION.SDK_INT < 24) {
                return false;
            }
            return LIZIZ != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static long LIZIZ() {
        Network network;
        try {
            if (LJI() && (network = LIZJ) != null) {
                return LIZJ(network);
            }
            return -1L;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    public static String LJ() {
        NetworkCapabilities networkCapabilities;
        try {
            if (!LJI()) {
                return "invalid";
            }
            Network activeNetwork = LIZIZ.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = LIZIZ.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(12)) {
                return LiveGiftNewGifterBadgeSetting.DEFAULT;
            }
            if (networkCapabilities.hasTransport(0)) {
                return "cellular";
            }
            if (networkCapabilities.hasTransport(1)) {
                return "wifi";
            }
            return "unknown";
        } catch (Throwable unused) {
            return LiveGiftNewGifterBadgeSetting.DEFAULT;
        }
    }

    public static void LIZ() {
        try {
            if (!LJI() || LIZ) {
                return;
            }
            LIZIZ.requestNetwork(new NetworkRequest.Builder().addTransportType(0).addCapability(12).build(), new C48014Iss());
            LIZ = true;
        } catch (Throwable unused) {
        }
    }

    public static long LIZJ(Network network) {
        if (network == null) {
            return 0L;
        }
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                return network.getNetworkHandle();
            }
            return CastIntegerProtector.parseInt(network.toString());
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static int LIZLLL(Context context) {
        try {
            NetworkInfo LJJLI = C16880lQ.LJJLI((ConnectivityManager) C16880lQ.LLILL(context, "connectivity"));
            if (LJJLI != null && LJJLI.isAvailable()) {
                return LJJLI.getType();
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static void LJFF(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (C04330Ez.LIZ(context, "android.permission.ACCESS_NETWORK_STATE") == 0 && Build.VERSION.SDK_INT >= 24 && LIZIZ == null) {
                LIZIZ = (ConnectivityManager) C16880lQ.LLILL(context, "connectivity");
            }
        } catch (Throwable unused) {
        }
    }
}
