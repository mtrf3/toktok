package X;

import Y.IDComparatorS34S0000000_6;
import android.content.Context;
import com.bytedance.crash.CrashType;
import com.bytedance.sliver.Sliver;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.FYg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39154FYg extends C39153FYf {
    public static final C39154FYg LIZIZ = new C39154FYg();
    public static final SimpleDateFormat LIZJ = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.CHINESE);
    public static boolean LIZLLL = false;
    public Context LIZ;

    public final void LIZIZ() {
        File LLIIJI;
        Context context = this.LIZ;
        if (context != null && (LLIIJI = C16880lQ.LLIIJI(context, "sliver-npth")) != null) {
            if (!LLIIJI.exists() && !LLIIJI.mkdirs()) {
                return;
            }
            File[] listFiles = LLIIJI.listFiles(new C39156FYi());
            if (listFiles != null && listFiles.length > 0) {
                for (File file : listFiles) {
                    C16880lQ.LLLZZIL(file);
                }
            }
            File[] listFiles2 = LLIIJI.listFiles(new C39157FYj());
            if (listFiles2 == null || listFiles2.length <= 10) {
                return;
            }
            Arrays.sort(listFiles2, new IDComparatorS34S0000000_6(1));
            for (int i = 0; i < listFiles2.length - 10; i++) {
                C16880lQ.LLLZZIL(listFiles2[i]);
            }
        }
    }

    @Override // X.C39153FYf
    public final File[] LIZ(CrashType crashType) {
        File LLIIJI;
        try {
            String str = "";
            int i = C39155FYh.LIZ[crashType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            str = "ANR";
                        }
                    } else {
                        str = "NATIVE";
                    }
                } else {
                    str = "JAVA";
                }
            } else {
                str = "LAUNCH";
            }
            Context context = this.LIZ;
            if (context != null && (LLIIJI = C16880lQ.LLIIJI(context, "sliver-npth")) != null && (LLIIJI.exists() || LLIIJI.mkdirs())) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("trace-");
                LIZ.append(str);
                LIZ.append("-");
                LIZ.append(LIZJ.format(new Date()));
                String LIZIZ2 = X1D.LIZIZ(LIZ);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(LIZIZ2);
                LIZ2.append(".tmp");
                File file = new File(LLIIJI, X1D.LIZIZ(LIZ2));
                Sliver.dumpAll(file.getAbsolutePath(), true);
                Sliver.dump(C16880lQ.LLJJJJ().getThread(), file.getAbsolutePath(), true);
                if (!file.exists()) {
                    return null;
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(LIZIZ2);
                LIZ3.append(".txt");
                File file2 = new File(LLIIJI, X1D.LIZIZ(LIZ3));
                if (file.renameTo(file2)) {
                    file = file2;
                }
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append(LIZIZ2);
                LIZ4.append(".zip");
                File file3 = new File(LLIIJI, X1D.LIZIZ(LIZ4));
                try {
                    C77412UZs.LJIIIIZZ(file3.getAbsolutePath(), file.getAbsolutePath());
                } catch (Throwable unused) {
                }
                if (file3.exists()) {
                    return new File[]{file3};
                }
                return new File[]{file};
            }
        } catch (Throwable unused2) {
        }
        return null;
    }
}
