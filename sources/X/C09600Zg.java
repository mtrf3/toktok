package X;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;

/* renamed from: X.0Zg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09600Zg {
    public static volatile C09600Zg LIZ;
    public static String LIZIZ;

    public static void LIZIZ() {
        if (LIZ == null) {
            synchronized (C09600Zg.class) {
                LIZ = new C09600Zg();
            }
        }
    }

    public C09600Zg() {
        new ArrayList();
    }

    public static String LIZ(Context context) {
        if (LIZIZ == null) {
            File file = new File(C16880lQ.LLIIJI(context, null), "mmt");
            if (!file.exists()) {
                file.mkdir();
            }
            LIZIZ = file.getAbsolutePath();
        }
        return LIZIZ;
    }
}
