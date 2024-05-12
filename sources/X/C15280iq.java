package X;

import android.os.Process;
import com.bytedance.android.alog.Alog;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.ss.android.agilelogger.ALog;
import defpackage.b1;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* renamed from: X.0iq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15280iq {
    public static Alog LIZ;

    public static void LIZ() {
        Alog alog = LIZ;
        if (alog != null) {
            alog.LIZ();
        }
    }

    public static String LIZLLL() {
        final Alog alog = LIZ;
        if (alog != null) {
            if (!Alog.LJIILLIIL) {
                return "not inited";
            }
            if (alog.LJFF == null) {
                alog.LJFF = C78983UzD.LJJIJIIJIL();
            }
            String str = alog.LJFF;
            if (str == null) {
                return "get process name failed";
            }
            String replace = str.replace(':', '-');
            File file = new File(alog.LIZJ);
            if (!file.exists()) {
                return "cache dir not exists";
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return "cache dir is empty";
            }
            StringBuilder LIZJ = b1.LIZJ(replace, "__");
            String LJFF = JBR.LJFF(LIZJ, alog.LJI, ".alog.cache.guard", LIZJ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("^");
            LIZ2.append(Pattern.quote(replace));
            LIZ2.append("__");
            LIZ2.append(Pattern.quote(alog.LJI));
            LIZ2.append("__\\d{5}\\.alog\\.cache$");
            Pattern compile = PatternProtector.compile(X1D.LIZIZ(LIZ2));
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (File file2 : listFiles) {
                if (file2.getName().equals(LJFF)) {
                    i++;
                    if (file2.length() >= 24576) {
                        i2++;
                    }
                } else {
                    String name = file2.getName();
                    StringBuilder LIZJ2 = b1.LIZJ(replace, "__");
                    LIZJ2.append(alog.LJI);
                    LIZJ2.append("__");
                    if (name.startsWith(X1D.LIZIZ(LIZJ2)) && compile.matcher(file2.getName()).find()) {
                        i3++;
                        if (file2.length() >= alog.LIZLLL) {
                            i4++;
                        }
                    }
                }
            }
            if (i < 1) {
                return "cache guard not exists";
            }
            if (i2 < 1) {
                return "cache guard size insufficiently";
            }
            int i5 = alog.LJ;
            if (i3 < i5) {
                return "cache block count insufficiently";
            }
            if (i4 < i5) {
                return "cache block size insufficiently";
            }
            File file3 = new File(alog.LIZIZ);
            if (!file3.exists()) {
                return "log dir not exists";
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("^\\d{4}_\\d{2}_\\d{2}_\\d+__");
            LIZ3.append(Pattern.quote(replace));
            LIZ3.append("__");
            LIZ3.append(Pattern.quote(alog.LJI));
            LIZ3.append("\\.alog\\.hot$");
            final Pattern compile2 = PatternProtector.compile(X1D.LIZIZ(LIZ3));
            File[] listFiles2 = file3.listFiles(new FilenameFilter() { // from class: X.0in
                @Override // java.io.FilenameFilter
                public final boolean accept(File file4, String str2) {
                    return compile2.matcher(str2).find();
                }
            });
            if (listFiles2 == null || listFiles2.length == 0) {
                return "no log file for current process and instance";
            }
            return "OK";
        }
        return "default log instance is null";
    }

    public static void LIZIZ(String str, String str2) {
        if (DK6.LIZ()) {
            new C87772Yca(1, Process.myTid(), System.currentTimeMillis(), str, str2).LIZ();
        } else {
            ALog.d(str, str2);
        }
    }

    public static void LIZJ(String str, String str2) {
        if (DK6.LIZ()) {
            new C87772Yca(4, Process.myTid(), System.currentTimeMillis(), str, str2).LIZ();
        } else {
            ALog.e(str, str2);
        }
    }

    public static void LJ(String str, String str2) {
        if (DK6.LIZ()) {
            new C87772Yca(2, Process.myTid(), System.currentTimeMillis(), str, str2).LIZ();
        } else {
            ALog.i(str, str2);
        }
    }

    public static void LJI(String str, String str2) {
        if (DK6.LIZ()) {
            new C87772Yca(0, Process.myTid(), System.currentTimeMillis(), str, str2).LIZ();
        } else {
            ALog.v(str, str2);
        }
    }

    public static void LJII(String str, String str2) {
        if (DK6.LIZ()) {
            new C87772Yca(3, Process.myTid(), System.currentTimeMillis(), str, str2).LIZ();
        } else {
            ALog.w(str, str2);
        }
    }

    public static void LJFF(int i, String str, String str2) {
        Alog alog = LIZ;
        if (alog != null) {
            alog.LJIIJJI(i, str, str2);
        }
    }

    public static void LJIIIIZZ(int i, String str, String str2) {
        Alog alog = LIZ;
        if (alog != null) {
            alog.LJIIJJI(i, str, str2);
        }
    }
}
