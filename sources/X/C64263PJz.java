package X;

import Y.ARunnableS18S0000000_11;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import java.io.File;
import java.util.Date;

/* renamed from: X.PJz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64263PJz {
    public static File LIZ;

    public static File LIZIZ() {
        if (LIZ == null) {
            if (C64264PKa.LIZJ(PK0.LIZ) == null) {
                return null;
            }
            if (PKQ.LIZIZ == null) {
                PKQ.LIZIZ();
            }
            LIZ = new File(PKQ.LIZIZ, "procHistory.txt");
            C64214PIc.LIZ().LIZJ(new ARunnableS18S0000000_11(0), LivePlayEnforceIntervalSetting.DEFAULT);
        }
        return LIZ;
    }

    public static File LIZJ(long j) {
        String LJJIIJ = C78596Usy.LJJIIJ(PK0.LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("npth/ProcessTrack/");
        LIZ2.append((j - (j % 86400000)) / 86400000);
        return new File(LJJIIJ, X1D.LIZIZ(LIZ2));
    }

    public static PK7 LJ(long j) {
        File[] listFiles = LIZJ(j).listFiles(new C64262PJy());
        if (listFiles == null || listFiles.length == 0) {
            return null;
        }
        return new PK7(listFiles, true);
    }

    public static void LIZ(String str, String str2) {
        try {
            File LIZIZ = LIZIZ();
            if (LIZIZ != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str);
                LIZ2.append(' ');
                LIZ2.append(str2);
                LIZ2.append(' ');
                LIZ2.append(C77123UOp.LJJIII().format(new Date(System.currentTimeMillis())));
                LIZ2.append('\n');
                PK8.LJIILJJIL(LIZIZ, X1D.LIZIZ(LIZ2), true);
            }
        } catch (Throwable unused) {
        }
    }

    public static File LIZLLL(long j, String str) {
        if (TextUtils.isEmpty(str)) {
            str = PK0.LIZ.getPackageName();
        }
        File LIZJ = LIZJ(j);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str.replace(':', '_'));
        LIZ2.append(".txt");
        return new File(LIZJ, X1D.LIZIZ(LIZ2));
    }
}
