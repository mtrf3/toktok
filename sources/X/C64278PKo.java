package X;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.PKo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64278PKo {
    public static String LIZ = null;
    public static long LIZIZ = -1;
    public static boolean LIZJ;
    public static PL1 LIZLLL;
    public static ActivityManager.ProcessErrorStateInfo LJ;

    public static boolean LIZLLL() {
        ActivityManager activityManager = (ActivityManager) C16880lQ.LLILL(PK0.LIZ, "activity");
        if (activityManager == null) {
            return false;
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo != null && runningAppProcessInfo.pid == myPid) {
                    return false;
                }
            }
        }
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
        if (processesInErrorState != null) {
            Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.ProcessErrorStateInfo next = it.next();
                if (next != null && next.pid == myPid) {
                    if (next.condition == 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static JSONObject LIZIZ(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("thread_number", 1);
            jSONObject.put("mainStackFromTrace", str);
            return jSONObject;
        } catch (Throwable th) {
            PJZ.LIZ.getClass();
            PJY.LIZ("NPTH_CATCH", th);
            return null;
        }
    }

    public static String LIZ(Context context, int[] iArr) {
        ActivityManager.ProcessErrorStateInfo next;
        if (SystemClock.uptimeMillis() - LIZIZ < 5000) {
            return null;
        }
        try {
            ActivityManager activityManager = (ActivityManager) C16880lQ.LLILL(context, "activity");
            if (activityManager != null) {
                Process.myPid();
                List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
                if (processesInErrorState != null) {
                    Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
                    while (it.hasNext()) {
                        next = it.next();
                        if (next.condition == 2) {
                            break;
                        }
                    }
                }
            }
            next = null;
            if (next != null && (Process.myPid() == next.pid || next.processName.contains(context.getPackageName()))) {
                ActivityManager.ProcessErrorStateInfo processErrorStateInfo = LJ;
                if (processErrorStateInfo != null && PLB.LIZIZ(processErrorStateInfo, next)) {
                    LIZIZ = SystemClock.uptimeMillis();
                    return null;
                }
                LJ = next;
                LIZ = null;
                LIZIZ = SystemClock.uptimeMillis();
                LIZJ = false;
                iArr[0] = next.pid;
                return PLB.LIZ(next);
            }
        } catch (Throwable unused) {
        }
        String str = LIZ;
        if (str == null) {
            return null;
        }
        iArr[0] = Process.myPid();
        LIZJ = true;
        LIZ = null;
        LIZIZ = SystemClock.uptimeMillis();
        return str;
    }

    public static String LIZJ(int i, Context context) {
        ActivityManager.ProcessErrorStateInfo next;
        if (SystemClock.uptimeMillis() - LIZIZ < 5000) {
            return null;
        }
        try {
            ActivityManager activityManager = (ActivityManager) C16880lQ.LLILL(context, "activity");
            if (activityManager != null) {
                int myPid = Process.myPid();
                int i2 = 0;
                loop0: while (i2 < i) {
                    List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
                    if (processesInErrorState != null) {
                        Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
                        while (it.hasNext()) {
                            next = it.next();
                            if (myPid != next.pid || next.condition == 2) {
                                break loop0;
                            }
                        }
                    }
                    i2++;
                    if (i == i2 || V3N.LJJIIJ()) {
                        break;
                    }
                    SystemClock.sleep(600L);
                }
            }
            next = null;
            if (next != null && Process.myPid() == next.pid) {
                ActivityManager.ProcessErrorStateInfo processErrorStateInfo = LJ;
                if (processErrorStateInfo != null && PLB.LIZIZ(processErrorStateInfo, next)) {
                    LIZIZ = SystemClock.uptimeMillis();
                    return null;
                }
                LJ = next;
                LIZ = null;
                LIZIZ = SystemClock.uptimeMillis();
                LIZJ = false;
                return PLB.LIZ(next);
            }
        } catch (Throwable unused) {
        }
        String str = LIZ;
        if (str == null) {
            return null;
        }
        LIZJ = true;
        LIZ = null;
        LIZIZ = SystemClock.uptimeMillis();
        return str;
    }
}
