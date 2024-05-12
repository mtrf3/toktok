package X;

import android.content.Context;
import android.os.Environment;
import com.google.gson.Gson;
import defpackage.a1;
import java.io.File;

/* renamed from: X.FLf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38815FLf {
    public static final String LIZ;
    public static final String LIZIZ;
    public static File LIZJ;
    public static final Gson LIZLLL;

    public static boolean LIZ() {
        File file = LIZJ;
        if (file != null && file.exists()) {
            return true;
        }
        C37246Eja c37246Eja = C37247Ejb.LIZIZ;
        String str = LIZ;
        c37246Eja.getClass();
        C37246Eja.LIZIZ(str);
        File LIZJ2 = C37246Eja.LIZJ(LIZIZ);
        LIZJ = LIZJ2;
        if (LIZJ2 == null || !LIZJ2.exists()) {
            return false;
        }
        return true;
    }

    static {
        File LLIIJI;
        StringBuilder LIZ2 = X1D.LIZ();
        Context context = C39579Fg7.LJLIL;
        if (Environment.isExternalStorageEmulated()) {
            LLIIJI = C16880lQ.LLIIJLIL(context);
        } else {
            LLIIJI = C16880lQ.LLIIJI(context, null);
            if (LLIIJI != null) {
                C39579Fg7.LJFF(LLIIJI);
            } else {
                LLIIJI = C16880lQ.LLIIJLIL(context);
            }
        }
        LIZ2.append(LLIIJI.getPath());
        String str = File.separator;
        String LJFF = JBR.LJFF(LIZ2, str, "follow_feed_cache", LIZ2);
        LIZ = LJFF;
        String LJ = a1.LJ(LJFF, str, "cache");
        LIZIZ = LJ;
        LIZLLL = new Gson();
        C37247Ejb.LIZIZ.getClass();
        C37246Eja.LIZIZ(LJFF);
        LIZJ = C37246Eja.LIZJ(LJ);
    }
}
