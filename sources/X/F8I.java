package X;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes7.dex */
public final class F8I extends F8T {
    @Override // X.F8Y
    public final String LIZIZ() {
        return "OppoMessageNPEPlugin";
    }

    @Override // X.F8T
    public final boolean LJFF() {
        int i = Build.VERSION.SDK_INT;
        if (i == 22 || i == 21) {
            try {
                String str = Build.MANUFACTURER;
                if (!TextUtils.isEmpty(str)) {
                    if (str.toLowerCase(Locale.getDefault()).contains("oppo")) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // X.F8Z
    public final boolean LIZ(Thread thread, Throwable th) {
        if (!(th instanceof NullPointerException)) {
            return false;
        }
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if ("android.os.Message".equals(stackTraceElement.getClassName()) && "toString".equals(stackTraceElement.getMethodName())) {
                F8X.LIZ();
                return true;
            }
        }
        return false;
    }
}
