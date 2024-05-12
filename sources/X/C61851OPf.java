package X;

import com.bytedance.keva.Keva;
import com.ss.android.deviceregister.DeviceRegisterManager;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.OPf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61851OPf {
    public static final Keva LIZ;
    public static final String LIZIZ;

    static {
        Keva repo = Keva.getRepo("email_pop_up_keva");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        LIZ = repo;
        LIZIZ = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
    }

    public static long LIZ(Integer num) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("time");
        LIZ2.append(LIZIZ);
        LIZ2.append(num);
        return LIZ.getLong(X1D.LIZIZ(LIZ2), 0L);
    }

    public static int LIZIZ(Integer num) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("times");
        LIZ2.append(LIZIZ);
        LIZ2.append(num);
        return LIZ.getInt(X1D.LIZIZ(LIZ2), 0);
    }

    public static void LIZJ(Integer num) {
        String str = LIZIZ;
        if (str == null) {
            return;
        }
        int LIZIZ2 = LIZIZ(num);
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("time");
        LIZ2.append(str);
        LIZ2.append(num);
        String LIZIZ3 = X1D.LIZIZ(LIZ2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("times");
        LIZ3.append(str);
        LIZ3.append(num);
        String LIZIZ4 = X1D.LIZIZ(LIZ3);
        Keva keva = LIZ;
        keva.storeLong(LIZIZ3, currentTimeMillis);
        keva.storeInt(LIZIZ4, LIZIZ2 + 1);
    }

    public static void LIZLLL(boolean z) {
        String str = LIZIZ;
        if (str == null) {
            return;
        }
        LIZ.storeBoolean(i0.LJFF("feed", str), z);
    }
}
