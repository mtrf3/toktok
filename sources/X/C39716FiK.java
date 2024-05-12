package X;

import android.content.Context;
import android.os.Environment;
import java.io.File;

/* renamed from: X.FiK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39716FiK {
    public static C84382X9u LIZ;

    public static void LIZIZ() {
        try {
            if (LIZ == null) {
                synchronized (C84382X9u.class) {
                    if (LIZ == null) {
                        File LIZ2 = LIZ(EF7.LIZIZ());
                        if (LIZ2.exists()) {
                            C37246Eja c37246Eja = C37247Ejb.LIZIZ;
                            String absolutePath = LIZ2.getAbsolutePath();
                            c37246Eja.getClass();
                            C37246Eja.LIZLLL(absolutePath);
                        }
                        LIZ = C84382X9u.LJI(LIZ2, (int) EF7.LJI(), 52428800L);
                    }
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static File LIZ(Context context) {
        String path;
        if (("mounted".equals(C16880lQ.LLLLLLLZIL()) || !Environment.isExternalStorageRemovable()) && C16880lQ.LLIIIZ(context) != null) {
            path = C16880lQ.LLIIIZ(context).getPath();
        } else {
            path = C16880lQ.LLIIIL(context).getPath();
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(path);
        return new File(JBR.LJFF(LIZ2, File.separator, "runnableCache", LIZ2));
    }
}
