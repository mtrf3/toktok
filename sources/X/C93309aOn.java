package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.aOn, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class C93309aOn {
    public static final java.util.Map<Integer, String> LIZIZ = C113554cx.LJJL(new OSZ(20, "WiFi"), new OSZ(10, "2G"), new OSZ(11, "3G"), new OSZ(12, "4G"), new OSZ(13, "5G"), new OSZ(0, "unknown"));
    public final CopyOnWriteArrayList<InterfaceC93307aOl> LIZ = new CopyOnWriteArrayList<>();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int LIZ() {
        Context context;
        Integer valueOf;
        WeakReference<Context> weakReference = C93306aOk.LIZ;
        if (weakReference != null && (context = weakReference.get()) != null) {
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
                    o.LJFF(connectivityManager, "connectivityManager");
                    NetworkInfo LJJLI = C16880lQ.LJJLI(connectivityManager);
                    if (LJJLI != null && (valueOf = Integer.valueOf(LJJLI.getType())) != null) {
                        if (valueOf.intValue() != 1) {
                            if (valueOf.intValue() == 0) {
                                switch (LJJLI.getSubtype()) {
                                    case 1:
                                    case 2:
                                    case 4:
                                    case 7:
                                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                                        return 10;
                                    case 3:
                                    case 5:
                                    case 6:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        return 11;
                                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                                    case 18:
                                        return 12;
                                    case 20:
                                        return 13;
                                }
                            }
                        } else {
                            return 20;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return 0;
    }
}
