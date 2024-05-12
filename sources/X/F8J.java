package X;

import android.content.res.Resources;
import android.view.WindowManager;

/* loaded from: classes7.dex */
public final class F8J extends F8T {
    @Override // X.F8Y
    public final String LIZIZ() {
        return "BadTokenAndResourceNotFoundCrashPlugin";
    }

    @Override // X.F8T
    public final boolean LJFF() {
        return true;
    }

    @Override // X.F8Z
    public final boolean LIZ(Thread thread, Throwable th) {
        if (th instanceof WindowManager.BadTokenException) {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                if ("android.view.ViewRootImpl".equals(stackTraceElement.getClassName()) && "setView".equals(stackTraceElement.getMethodName())) {
                    F8X.LIZ();
                    break;
                }
            }
        }
        if (!(th instanceof Resources.NotFoundException)) {
            return false;
        }
        for (StackTraceElement stackTraceElement2 : th.getStackTrace()) {
            if ("org.chromium.ui.base.DeviceFormFactor".equals(stackTraceElement2.getClassName()) && "isTablet".equals(stackTraceElement2.getMethodName())) {
                F8X.LIZ();
                return true;
            }
        }
        return false;
    }
}
