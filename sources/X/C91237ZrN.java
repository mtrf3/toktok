package X;

import java.io.File;

/* renamed from: X.ZrN, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91237ZrN {
    public static boolean LIZ;

    public static String LIZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(C16880lQ.LLIIJLIL(EF7.LIZIZ()).getPath());
        String str = File.separator;
        LIZ2.append(str);
        LIZ2.append("music_dsp");
        LIZ2.append(str);
        LIZ2.append("preload");
        LIZ2.append(str);
        LIZ2.append("cache");
        return X1D.LIZIZ(LIZ2);
    }

    public static boolean LIZIZ() {
        if (!YBK.LIZ().firstFrameOpt.getEnableLocalCache()) {
            return false;
        }
        long j = C91254Zre.LIZ.getLong("local_cache_expired_time", 0L);
        if (j <= 0 || j <= C1E4.LJIIZILJ() * 1000) {
            return false;
        }
        return true;
    }

    public static void LIZJ(long j) {
        C91254Zre.LIZ.storeLong("local_cache_expired_time", j);
    }
}
