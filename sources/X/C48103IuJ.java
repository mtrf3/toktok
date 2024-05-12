package X;

import android.util.Pair;
import java.net.InetAddress;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.IuJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48103IuJ {
    public static C64600PWy LIZ;
    public static final java.util.Map<Long, C47456Ijs> LIZIZ = new ConcurrentHashMap();
    public static final java.util.Map<Long, Pair<String, List<InetAddress>>> LIZJ = new ConcurrentHashMap();

    public static C64600PWy LIZ(C64601PWz c64601PWz) {
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(400100, "okhttp3/OkHttpClient$Builder", "build", c64601PWz, new Object[0], "okhttp3.OkHttpClient", new C65300Pk0(false, "()Lokhttp3/OkHttpClient;", "3453510373227822554"));
        return LIZJ2.LIZ ? (C64600PWy) LIZJ2.LIZIZ : c64601PWz.build();
    }

    public static String LIZIZ(C64606PXe c64606PXe) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < c64606PXe.LIZ.length / 2; i++) {
            if ("Server-Timing".equals(c64606PXe.LJ(i))) {
                sb.append(c64606PXe.LJIIJ(i));
                sb.append(",");
            }
        }
        if (sb.length() > 0) {
            return sb.toString().substring(0, sb.length() - 1);
        }
        return "";
    }
}
