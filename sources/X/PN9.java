package X;

import Y.ARunnableS0S1000100_11;
import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes12.dex */
public final class PN9 {
    public static volatile boolean LIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static volatile long LJFF;
    public static volatile long LJI;
    public static long LJII;
    public static volatile long LJIIIIZZ;
    public static long LJIIIZ;
    public static volatile long LJIIJ;
    public static long LJIIJJI;
    public static volatile long LJIIL;
    public static long LJIILIIL;
    public static volatile long LJIILJJIL;
    public static long LJIILL;
    public static volatile long LJIILLIIL;
    public static long LJIIZILJ;
    public static volatile long LJIJ;
    public static long LJIJI;
    public static volatile long LJIJJ;
    public static long LJIJJLI;
    public static volatile long LJIL;
    public static long LJJ;
    public static volatile long LJJI;
    public static long LJJIFFI;
    public static volatile long LJJII;
    public static long LJJIII;
    public static volatile long LJJIIJ;
    public static long LJJIIJZLJL;
    public static volatile long LJJIIZ;
    public static long LJJIIZI;
    public static volatile long LJJIJ;
    public static long LJJIJIIJI;
    public static volatile long LJJIJIIJIL;
    public static long LJJIJIL;
    public static NetworkStatsManager LJJIJL;
    public static volatile boolean LJJJ;
    public static volatile boolean LJJJIL;
    public static OSZ<Long, Long> LIZIZ = new OSZ<>(0L, 0L);
    public static int LJJIJLIJ = -1;
    public static boolean LJJIL = true;
    public static boolean LJJIZ = true;
    public static boolean LJJJI = true;
    public static final C64220PIi LJJJJ = C64220PIi.LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.OSZ LIZJ() {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PN9.LIZJ():X.OSZ");
    }

    public static OSZ LIZIZ(int i) {
        NetworkStatsManager networkStatsManager;
        Context LIZIZ2 = EF7.LIZIZ();
        NetworkStats networkStats = null;
        if (LJJIJL == null) {
            Object LLILL = C16880lQ.LLILL(C16880lQ.LLLLL(LIZIZ2), "netstats");
            if (LLILL instanceof NetworkStatsManager) {
                networkStatsManager = (NetworkStatsManager) LLILL;
            } else {
                networkStatsManager = null;
            }
            LJJIJL = networkStatsManager;
        }
        long j = 0;
        if (LJJIJL == null) {
            return new OSZ(0L, 0L);
        }
        NetworkStats.Bucket bucket = new NetworkStats.Bucket();
        try {
            NetworkStatsManager networkStatsManager2 = LJJIJL;
            if (networkStatsManager2 != null) {
                networkStats = networkStatsManager2.querySummary(i, null, 0L, Long.MAX_VALUE);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        long j2 = 0;
        if (networkStats != null) {
            while (networkStats.hasNextBucket()) {
                networkStats.getNextBucket(bucket);
                int uid = bucket.getUid();
                if (LJJIJLIJ == -1) {
                    try {
                        PackageInfo LLLLLLZ = C16880lQ.LLLLLLZ(C16880lQ.LLLLL(LIZIZ2).getPackageManager(), C16880lQ.LLLLL(LIZIZ2).getPackageName(), 128);
                        if (LLLLLLZ != null) {
                            LJJIJLIJ = LLLLLLZ.applicationInfo.uid;
                        }
                    } catch (PackageManager.NameNotFoundException e2) {
                        C16880lQ.LLLLIIL(e2);
                    }
                }
                if (LJJIJLIJ == uid) {
                    j += bucket.getRxBytes();
                    j2 += bucket.getTxBytes();
                }
            }
            networkStats.close();
        }
        return new OSZ(Long.valueOf(j), Long.valueOf(j2));
    }

    public static void LIZ(long j, String str) {
        if (str == null) {
            str = null;
        } else {
            try {
                str = UriProtector.parse(str).buildUpon().clearQuery().build().getPath();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        for (String str2 : OEM.LIZ) {
            if (str != null && s.LJJJLZIJ(str, str2, false)) {
                LJJIJIIJIL += j;
            }
        }
    }

    public static void LJ(long j, String str) {
        if (j >= 0) {
            if (o.LJ(str, "play")) {
                LJJIIJ += j;
            }
            if (o.LJ(str, "preload")) {
                LJJIIZ += j;
            }
        }
    }

    public static void LIZLLL(long j, String str, String str2, boolean z) {
        int hashCode = str.hashCode();
        if (hashCode != -1798530555) {
            if (hashCode != -1015101340) {
                if (hashCode == 110693149 && str.equals("ttnet")) {
                    LJIILJJIL += j;
                }
                LJIJJ += j;
            } else {
                if (str.equals("okhttp")) {
                    LJIILLIIL += j;
                }
                LJIJJ += j;
            }
        } else {
            if (str.equals("httpurlconnection")) {
                LJIJ += j;
            }
            LJIJJ += j;
        }
        if (z) {
            F9U.LIZ.LIZJ(new ARunnableS0S1000100_11(j, str2, 1));
        } else {
            LIZ(j, str2);
        }
    }
}
