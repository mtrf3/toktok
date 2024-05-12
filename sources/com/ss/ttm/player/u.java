package com.ss.ttm.player;

import X.C16880lQ;
import X.C47952Irs;
import X.C47953Irt;
import X.C47954Iru;
import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public final class u {
    public static String LIZ = null;
    public static String LIZIZ = "libttmplayer.so";
    public static final ConcurrentHashMap<Integer, C47954Iru> LIZJ = new ConcurrentHashMap<>();

    public static final boolean LJ() {
        if (LIZIZ(6, 0) == 1) {
            return true;
        }
        if (LIZIZ(1, 0) == 0) {
            return false;
        }
        if (LIZIZ(11, 0) == 1) {
            return true;
        }
        if (LIZIZ(7, 0) == 1 || LIZIZ(8, 0) == 1 || LIZIZ(10, 0) >= 3) {
            return false;
        }
        return true;
    }

    static {
        LJFF(13, 1);
        LJI(14, "999.999.999.9");
        LJI(15, "version code:1,name:999.999.999.9default sdk info 2016-12-05");
        LJFF(0, 0);
        LJFF(1, 1);
        LJFF(2, 1);
        LJFF(3, 0);
        LJFF(4, 0);
        LJFF(5, 0);
        LJFF(6, 0);
        LJFF(7, 0);
        LJFF(8, 0);
        LJFF(10, 0);
        LJFF(11, 0);
        LJFF(18, 2);
        LJFF(25, 32);
        LJFF(34, 0);
        LJFF(35, 5242880);
        LJFF(36, 0);
        LJFF(39, 0);
        LJFF(40, 131072);
        LJFF(41, 0);
        LJFF(42, 2);
    }

    public static final String LIZ(Context context) {
        String str = LIZ;
        if (str != null) {
            return str;
        }
        if (context == null) {
            return null;
        }
        try {
            String absolutePath = C16880lQ.LLIIJLIL(C16880lQ.LLLLL(context)).getAbsolutePath();
            LIZ = absolutePath;
            return absolutePath;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final boolean LIZLLL(int i) {
        C47954Iru c47954Iru = LIZJ.get(Integer.valueOf(i));
        if (c47954Iru == null || !(c47954Iru instanceof C47952Irs) || ((C47952Irs) c47954Iru).LIZ != 1) {
            return false;
        }
        return true;
    }

    public static final int LIZIZ(int i, int i2) {
        C47954Iru c47954Iru = LIZJ.get(Integer.valueOf(i));
        if (c47954Iru != null && (c47954Iru instanceof C47952Irs)) {
            return ((C47952Irs) c47954Iru).LIZ;
        }
        return i2;
    }

    public static final String LIZJ(int i, String str) {
        if (i == 17) {
            return "ttplayer_crash.log";
        }
        C47954Iru c47954Iru = LIZJ.get(Integer.valueOf(i));
        if (c47954Iru != null && (c47954Iru instanceof C47953Irt)) {
            return ((C47953Irt) c47954Iru).LIZ;
        }
        return str;
    }

    public static final void LJFF(int i, int i2) {
        ConcurrentHashMap<Integer, C47954Iru> concurrentHashMap = LIZJ;
        C47954Iru c47954Iru = concurrentHashMap.get(Integer.valueOf(i));
        if (c47954Iru != null) {
            if (c47954Iru instanceof C47952Irs) {
                if (i == 2 && LIZLLL(6)) {
                    return;
                }
                ((C47952Irs) c47954Iru).LIZ = i2;
                return;
            }
            concurrentHashMap.remove(Integer.valueOf(i));
        }
        concurrentHashMap.put(Integer.valueOf(i), new C47952Irs(i, i2));
    }

    public static final void LJI(int i, String str) {
        ConcurrentHashMap<Integer, C47954Iru> concurrentHashMap = LIZJ;
        C47954Iru c47954Iru = concurrentHashMap.get(Integer.valueOf(i));
        if (c47954Iru != null) {
            if (c47954Iru instanceof C47953Irt) {
                ((C47953Irt) c47954Iru).LIZ = str;
                return;
            }
            concurrentHashMap.remove(Integer.valueOf(i));
        }
        concurrentHashMap.put(Integer.valueOf(i), new C47953Irt(i, str));
    }
}
