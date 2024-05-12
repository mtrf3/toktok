package X;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: X.FJk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38768FJk {
    public static String LIZ;
    public static int LIZIZ;

    public static String LIZ() {
        String str;
        BufferedReader bufferedReader;
        if (LIZ == null) {
            int i = LIZIZ;
            if (i == 0) {
                i = Process.myPid();
                LIZIZ = i;
            }
            String str2 = null;
            BufferedReader bufferedReader2 = null;
            BufferedReader bufferedReader3 = null;
            if (i > 0) {
                try {
                    StringBuilder sb = new StringBuilder(25);
                    sb.append("/proc/");
                    sb.append(i);
                    sb.append("/cmdline");
                    String sb2 = sb.toString();
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        bufferedReader = new BufferedReader(new FileReader(sb2));
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                } catch (IOException unused) {
                    str = null;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    String readLine = bufferedReader.readLine();
                    QH7.LJIIIIZZ(readLine);
                    str = readLine.trim();
                } catch (IOException unused2) {
                    str = null;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader3 = bufferedReader;
                    C38769FJl.LIZ(bufferedReader3);
                    throw th;
                }
                bufferedReader2 = bufferedReader;
                C38769FJl.LIZ(bufferedReader2);
                str2 = str;
            }
            LIZ = str2;
        }
        return LIZ;
    }
}
