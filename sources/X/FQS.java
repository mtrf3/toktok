package X;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import defpackage.g0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.regex.Matcher;

/* loaded from: classes7.dex */
public final class FQS {
    public static int LIZ;
    public static long LIZIZ;
    public static int LIZJ;

    public static long LJFF() {
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/stat")), 1000);
            try {
                String readLine = bufferedReader2.readLine();
                bufferedReader2.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[2]) + Long.parseLong(split[3]) + Long.parseLong(split[4]) + Long.parseLong(split[6]) + Long.parseLong(split[5]) + Long.parseLong(split[7]) + Long.parseLong(split[8]);
                g0.LJJIJL(bufferedReader2);
                return parseLong;
            } catch (Throwable unused) {
                bufferedReader = bufferedReader2;
                g0.LJJIJL(bufferedReader);
                return -1L;
            }
        } catch (Throwable unused2) {
        }
    }

    public static long LJI() {
        try {
            String[] split = LJ(C16880lQ.LLLZ("/proc/%s/status", new Object[]{Integer.valueOf(Process.myPid())})).trim().split("\n");
            for (String str : split) {
                if (str.startsWith("VmSize")) {
                    Matcher matcher = PatternProtector.compile("\\d+").matcher(str);
                    if (matcher.find()) {
                        return CastLongProtector.parseLong(matcher.group());
                    }
                }
            }
            if (split.length > 12) {
                Matcher matcher2 = PatternProtector.compile("\\d+").matcher(split[12]);
                if (matcher2.find()) {
                    return CastLongProtector.parseLong(matcher2.group());
                }
            }
        } catch (Exception unused) {
        }
        return -1L;
    }

    static {
        new HashMap(3);
        LIZIZ = -1L;
        LIZJ = 0;
    }

    public static synchronized int LIZIZ() {
        synchronized (FQS.class) {
            int i = LIZ;
            if (i != 0) {
                return i;
            }
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"), 50);
                int i2 = 0;
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (readLine.startsWith("processor")) {
                            i2++;
                        }
                    } catch (Throwable th) {
                        bufferedReader.close();
                        throw th;
                    }
                }
                bufferedReader.close();
                LIZ = i2;
                return LIZ;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static long LIZLLL() {
        if (LIZIZ == -1) {
            long sysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
            if (sysconf <= 0) {
                sysconf = 100;
            }
            LIZIZ = sysconf;
        }
        return LIZIZ;
    }

    public static long LIZ() {
        BufferedReader bufferedReader;
        int myPid = Process.myPid();
        BufferedReader bufferedReader2 = null;
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("/proc/");
            LIZ2.append(myPid);
            LIZ2.append("/stat");
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(X1D.LIZIZ(LIZ2))), 1000);
        } catch (Throwable unused) {
        }
        try {
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            String[] split = readLine.split(" ");
            long parseLong = Long.parseLong(split[13]) + Long.parseLong(split[14]) + Long.parseLong(split[15]) + Long.parseLong(split[16]);
            g0.LJJIJL(bufferedReader);
            return parseLong;
        } catch (Throwable unused2) {
            bufferedReader2 = bufferedReader;
            g0.LJJIJL(bufferedReader2);
            return -1L;
        }
    }

    public static long LIZJ(File file) {
        long length;
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles == null) {
            return 0L;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                length = LIZJ(file2);
            } else {
                length = file2.length();
            }
            j += length;
        }
        return j;
    }

    public static String LJ(String str) {
        FileInputStream fileInputStream;
        File file = new File(str);
        BufferedReader bufferedReader = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Throwable th) {
            th = th;
            fileInputStream = null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(fileInputStream));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine != null) {
                            sb.append(readLine);
                            sb.append('\n');
                        } else {
                            bufferedReader2.close();
                            String sb2 = sb.toString();
                            fileInputStream.close();
                            return sb2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th;
        }
    }
}
