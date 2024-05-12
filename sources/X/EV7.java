package X;

import android.content.Context;
import android.os.StatFs;
import android.text.TextUtils;
import defpackage.i0;
import java.io.File;

/* loaded from: classes7.dex */
public final class EV7 {
    public static final String[] LIZ = {"files/offlineX", "app_assets", "cache/gift_assets", "cache/feedcache"};

    public static long LIZJ() {
        EV8 ev8;
        try {
            File LLIIJLIL = C16880lQ.LLIIJLIL(EF7.LIZIZ());
            if (LLIIJLIL == null || !LLIIJLIL.exists()) {
                ev8 = new EV8(1.0d, Long.MAX_VALUE, Long.MAX_VALUE);
            } else {
                StatFs statFs = new StatFs(LLIIJLIL.getPath());
                long availableBytes = statFs.getAvailableBytes();
                long totalBytes = statFs.getTotalBytes();
                ev8 = new EV8((availableBytes * 1.0d) / totalBytes, availableBytes, totalBytes);
            }
        } catch (Throwable unused) {
            ev8 = new EV8(1.0d, Long.MAX_VALUE, Long.MAX_VALUE);
        }
        return ev8.LIZ;
    }

    public static void LIZ(String str) {
        Context LIZIZ = EF7.LIZIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("from = ");
        LIZ2.append(str);
        X1D.LIZIZ(LIZ2);
        File LLIIJLIL = C16880lQ.LLIIJLIL(LIZIZ);
        if (LLIIJLIL == null) {
            return;
        }
        String parent = LLIIJLIL.getParent();
        if (TextUtils.isEmpty(parent)) {
            return;
        }
        String LJFF = i0.LJFF(parent, "/");
        for (String str2 : LIZ) {
            File file = new File(i0.LJFF(LJFF, str2));
            if (file.exists()) {
                LIZIZ(file);
            }
        }
    }

    public static boolean LIZIZ(File file) {
        if (file.isFile()) {
            return C16880lQ.LLLZZIL(file);
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        for (File file2 : listFiles) {
            LIZIZ(file2);
        }
        return C16880lQ.LLLZZIL(file);
    }
}
