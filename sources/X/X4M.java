package X;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes16.dex */
public final class X4M {
    public Application LIZ;
    public int LIZJ;
    public final List<X4N> LIZIZ = new ArrayList();
    public volatile int LIZLLL = -1;
    public final X4L LJ = new X4L(this);

    public final boolean LIZIZ() {
        int i = this.LIZLLL;
        if (i == -1) {
            try {
                Application application = this.LIZ;
                if (application != null) {
                    ActivityManager activityManager = (ActivityManager) C16880lQ.LLILL(application, "activity");
                    String packageName = application.getPackageName();
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
                        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                            if (runningAppProcessInfo.importance == 100 && TextUtils.equals(runningAppProcessInfo.processName, packageName)) {
                                i = 1;
                                break;
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            i = 0;
            this.LIZLLL = i;
        }
        if (i != 1) {
            return false;
        }
        return true;
    }

    public final void LIZ(Context context) {
        if (this.LIZ == null && (context instanceof Application)) {
            synchronized (this) {
                if (this.LIZ == null) {
                    Application application = (Application) context;
                    this.LIZ = application;
                    application.registerActivityLifecycleCallbacks(this.LJ);
                }
            }
        }
    }
}
