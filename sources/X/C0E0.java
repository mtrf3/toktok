package X;

import android.text.TextUtils;
import java.net.URLEncoder;

/* renamed from: X.0E0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0E0 {
    public static String LIZ(int i, String str) {
        if (TextUtils.isEmpty(str) || i < 0 || i >= str.length()) {
            return str;
        }
        String encode = URLEncoder.encode(String.valueOf(str.charAt(i)));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str.substring(0, i));
        LIZ.append(encode);
        LIZ.append(str.substring(i + 1));
        return X1D.LIZIZ(LIZ);
    }
}
