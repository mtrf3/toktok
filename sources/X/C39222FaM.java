package X;

import android.app.Activity;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.settings.LooperProtectEnhanceSetting$ExceptionInfo;
import com.ss.android.ugc.aweme.settings.LooperProtectEnhanceSetting$LooperProtectEnhanceConfig;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.LooperProtectEnhanceThrowable;
import java.io.PrintStream;
import java.util.List;

/* renamed from: X.FaM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39222FaM extends F8T {
    @Override // X.F8Y
    public final String LIZIZ() {
        return "LooperProtectEnhancePlugin";
    }

    @Override // X.F8T
    public final boolean LJFF() {
        return true;
    }

    @Override // X.F8Z
    public final boolean LIZ(Thread thread, Throwable th) {
        StackTraceElement[] stackTrace;
        LooperProtectEnhanceSetting$LooperProtectEnhanceConfig looperProtectEnhanceSetting$LooperProtectEnhanceConfig;
        List<LooperProtectEnhanceSetting$ExceptionInfo> list;
        if (((Boolean) C39225FaP.LIZ.getValue()).booleanValue() && (th instanceof ClassCastException) && "android.view.ViewGroup$LayoutParams cannot be cast to android.view.ViewGroup$MarginLayoutParams".equals(th.getMessage())) {
            Activity topActivity = ActivityStack.getTopActivity();
            if (topActivity != null) {
                PrintStream printStream = System.err;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("activity info:");
                LIZ.append(topActivity.toString());
                printStream.println(X1D.LIZIZ(LIZ));
                PrintStream printStream2 = System.err;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("ViewTree info:");
                StringBuilder sb = new StringBuilder();
                C39217FaH.LIZ((ViewGroup) topActivity.getWindow().getDecorView(), sb);
                LIZ2.append(sb.toString());
                printStream2.println(X1D.LIZIZ(LIZ2));
            } else {
                System.err.println("activity is null");
            }
        }
        if (th == null || (stackTrace = th.getStackTrace()) == null || (looperProtectEnhanceSetting$LooperProtectEnhanceConfig = (LooperProtectEnhanceSetting$LooperProtectEnhanceConfig) SettingsManager.LIZLLL().LJIIIIZZ("looper_protect_enhance", LooperProtectEnhanceSetting$LooperProtectEnhanceConfig.class, null)) == null || (list = looperProtectEnhanceSetting$LooperProtectEnhanceConfig.ignoreList) == null || list.isEmpty()) {
            return false;
        }
        for (LooperProtectEnhanceSetting$ExceptionInfo looperProtectEnhanceSetting$ExceptionInfo : looperProtectEnhanceSetting$LooperProtectEnhanceConfig.ignoreList) {
            if (looperProtectEnhanceSetting$ExceptionInfo.LIZ() && th.getClass().getName().equals(looperProtectEnhanceSetting$ExceptionInfo.exceptionType) && th.getMessage() != null && th.getMessage().contains(looperProtectEnhanceSetting$ExceptionInfo.exceptionMessage)) {
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (looperProtectEnhanceSetting$ExceptionInfo.stackClassName.equals(stackTraceElement.getClassName()) && looperProtectEnhanceSetting$ExceptionInfo.stackMethodName.equals(stackTraceElement.getMethodName())) {
                        C40007Fn1.LIZIZ.ensureNotReachHere(new LooperProtectEnhanceThrowable("LOOPER_PROTECT_ENHANCE_SUCCESS", th), "LOOPER_PROTECT_ENHANCE_SUCCESS");
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
