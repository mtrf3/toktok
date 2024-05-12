package X;

import android.content.Context;
import android.os.Build;
import java.util.Locale;

/* renamed from: X.Fd5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39391Fd5 {
    public static String LIZ(Context context) {
        Locale locale;
        if (context == null) {
            return "zh-CN";
        }
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = context.getResources().getConfiguration().getLocales().get(0);
            } else {
                locale = context.getResources().getConfiguration().locale;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(locale.getLanguage());
            LIZ.append("-");
            C39399FdD.LIZIZ.getClass();
            LIZ.append(C39567Ffv.LIZIZ(locale));
            return X1D.LIZIZ(LIZ);
        } catch (Exception unused) {
            return "zh-CN";
        }
    }
}
