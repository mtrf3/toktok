package X;

import android.text.TextUtils;

/* loaded from: classes6.dex */
public final class B58 {
    public static boolean LIZ(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!TextUtils.equals(str, str2)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('.');
            LIZ.append(str2);
            if (!str.endsWith(X1D.LIZIZ(LIZ))) {
                return false;
            }
        }
        return true;
    }
}
