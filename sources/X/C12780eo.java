package X;

import android.os.Process;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* renamed from: X.0eo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12780eo {
    public static long LIZ = -1;
    public static C14100gw LIZIZ;

    public static long LIZJ() {
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/stat")), 1000);
            try {
                String readLine = bufferedReader2.readLine();
                bufferedReader2.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[2]) + Long.parseLong(split[3]) + Long.parseLong(split[4]) + Long.parseLong(split[6]) + Long.parseLong(split[5]) + Long.parseLong(split[7]) + Long.parseLong(split[8]);
                LIZ(bufferedReader2);
                return parseLong;
            } catch (Throwable unused) {
                bufferedReader = bufferedReader2;
                LIZ(bufferedReader);
                return -1L;
            }
        } catch (Throwable unused2) {
        }
    }

    public static long LIZIZ() {
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
            LIZ(bufferedReader);
            return parseLong;
        } catch (Throwable unused2) {
            bufferedReader2 = bufferedReader;
            LIZ(bufferedReader2);
            return -1L;
        }
    }

    public static void LIZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                C0NB.LJFF("CommonMonitorUtil", "", th);
            }
        }
    }
}
