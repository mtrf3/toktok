package X;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import com.bytedance.common.utility.Logger;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* renamed from: X.Ed2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36840Ed2 {
    public static String LIZ;

    public static boolean LIZ(Context context) {
        BufferedReader bufferedReader;
        String str = LIZ;
        if (C38354F3m.LJ(str)) {
            try {
                int myPid = Process.myPid();
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) C16880lQ.LLILL(context, "activity")).getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid) {
                        Logger.debug();
                        str = runningAppProcessInfo.processName;
                        LIZ = str;
                        break;
                    }
                }
            } catch (Exception e) {
                C38901fq.LJI(e);
            }
            str = null;
            try {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("/proc/");
                LIZ2.append(Process.myPid());
                LIZ2.append("/cmdline");
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(X1D.LIZIZ(LIZ2)), "iso-8859-1"));
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        int read = bufferedReader.read();
                        if (read <= 0) {
                            break;
                        }
                        sb.append((char) read);
                    }
                    Logger.debug();
                    str = sb.toString();
                } catch (Throwable th) {
                    th = th;
                    try {
                        C38901fq.LJI(th);
                    } finally {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Exception e2) {
                                C38901fq.LJI(e2);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
            LIZ = str;
        }
        if (str == null || str.contains(":") || !str.equals(context.getPackageName())) {
            return false;
        }
        return true;
    }
}
