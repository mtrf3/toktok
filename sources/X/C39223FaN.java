package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.settings.LooperProtectEnhanceSetting$ExceptionInfo;
import com.ss.android.ugc.aweme.settings.LooperProtectEnhanceSetting$LooperProtectEnhanceConfig;
import java.util.List;

/* renamed from: X.FaN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39223FaN {
    public static boolean LIZ(Throwable th) {
        LooperProtectEnhanceSetting$LooperProtectEnhanceConfig looperProtectEnhanceSetting$LooperProtectEnhanceConfig;
        List<LooperProtectEnhanceSetting$ExceptionInfo> list;
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace == null || (looperProtectEnhanceSetting$LooperProtectEnhanceConfig = (LooperProtectEnhanceSetting$LooperProtectEnhanceConfig) SettingsManager.LIZLLL().LJIIIIZZ("looper_protect_enhance", LooperProtectEnhanceSetting$LooperProtectEnhanceConfig.class, null)) == null || (list = looperProtectEnhanceSetting$LooperProtectEnhanceConfig.ignoreList) == null || list.isEmpty()) {
            return false;
        }
        for (LooperProtectEnhanceSetting$ExceptionInfo looperProtectEnhanceSetting$ExceptionInfo : looperProtectEnhanceSetting$LooperProtectEnhanceConfig.ignoreList) {
            if (looperProtectEnhanceSetting$ExceptionInfo.LIZ() && th.getClass().getName().equals(looperProtectEnhanceSetting$ExceptionInfo.exceptionType) && th.getMessage() != null && th.getMessage().contains(looperProtectEnhanceSetting$ExceptionInfo.exceptionMessage)) {
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (looperProtectEnhanceSetting$ExceptionInfo.stackClassName.equals(stackTraceElement.getClassName()) && looperProtectEnhanceSetting$ExceptionInfo.stackMethodName.equals(stackTraceElement.getMethodName())) {
                        C40007Fn1.LIZIZ.ensureNotReachHere(new C39224FaO("RunnableLancetGuard", th), "RunnableLancetGuard");
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
