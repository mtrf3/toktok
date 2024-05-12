package X;

import android.os.Process;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* renamed from: X.Ed6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36844Ed6 {
    public static String LIZ;

    public static long LIZ() {
        int myPid = Process.myPid();
        BufferedReader bufferedReader = null;
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("/proc/");
            LIZ2.append(myPid);
            LIZ2.append("/stat");
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(X1D.LIZIZ(LIZ2))), 1000);
            try {
                String readLine = bufferedReader2.readLine();
                bufferedReader2.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[13]) + Long.parseLong(split[14]);
                C78685UuP.LJJLIIIJLLLLLLLZ(bufferedReader2);
                return parseLong;
            } catch (Throwable unused) {
                bufferedReader = bufferedReader2;
                C78685UuP.LJJLIIIJLLLLLLLZ(bufferedReader);
                return -1L;
            }
        } catch (Throwable unused2) {
        }
    }

    public static String LIZIZ(int i) {
        BufferedReader bufferedReader;
        if (!TextUtils.isEmpty(LIZ)) {
            return LIZ;
        }
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("/proc/");
            LIZ2.append(i);
            LIZ2.append("/cmdline");
            bufferedReader = new BufferedReader(new FileReader(X1D.LIZIZ(LIZ2)));
        } catch (Throwable unused) {
            bufferedReader = null;
        }
        try {
            String readLine = bufferedReader.readLine();
            if (!TextUtils.isEmpty(readLine)) {
                readLine = readLine.trim();
            }
            LIZ = readLine;
            try {
                bufferedReader.close();
            } catch (IOException e) {
                C16880lQ.LLLLIIL(e);
            }
            return readLine;
        } catch (Throwable unused2) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e2) {
                    C16880lQ.LLLLIIL(e2);
                }
            }
            return null;
        }
    }
}
