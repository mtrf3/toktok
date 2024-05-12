package X;

import android.content.Context;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes7.dex */
public final class FPH {
    public static Context LIZ;
    public static String LIZIZ;
    public static String LIZJ;
    public static String LIZLLL;
    public static WeakReference<List<String>> LJ;

    public static Context LIZ() {
        Context context = LIZ;
        if (context != null) {
            return context;
        }
        throw new RuntimeException("Please make sure Deximage.init(...) first");
    }

    public static List<String> LIZIZ() {
        WeakReference<List<String>> weakReference = LJ;
        if (weakReference == null) {
            List<String> LIZ2 = C37695Eqp.LIZ(LIZJ());
            LJ = new WeakReference<>(LIZ2);
            return LIZ2;
        }
        List<String> list = weakReference.get();
        if (list != null) {
            return list;
        }
        List<String> LIZ3 = C37695Eqp.LIZ(LIZJ());
        LJ = new WeakReference<>(LIZ3);
        return LIZ3;
    }

    public static String LIZJ() {
        if (LIZLLL == null) {
            LIZLLL = LIZ().getPackageCodePath();
        }
        return LIZLLL;
    }

    public static File LIZLLL() {
        File file = new File(LIZ().getCodeCacheDir(), "app_profiles");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }
}
