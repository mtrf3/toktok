package X;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.00T, reason: invalid class name */
/* loaded from: classes.dex */
public final class C00T {
    public static boolean LIZLLL() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    public static void LIZ(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (IOException unused) {
        }
    }

    public static void LIZIZ(OutputStream outputStream) {
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.close();
        } catch (IOException unused) {
        }
    }

    public static String LJ(String str) {
        int length = str.length();
        char[] charArray = str.toCharArray();
        int i = 0;
        char c = 0;
        int i2 = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '/' || c != '/') {
                charArray[i2] = c2;
                i2++;
            }
            i++;
            c = c2;
        }
        if (c == '/' && length > 1) {
            i2--;
        }
        if (i2 != length) {
            return new String(charArray, 0, i2);
        }
        return str;
    }

    public static Bundle LIZJ(int i, int i2, String str, String str2, String[] strArr) {
        Bundle bundle = new Bundle();
        if (LIZLLL()) {
            bundle.putString("android:query-arg-sql-selection", str);
            bundle.putStringArray("android:query-arg-sql-selection-args", strArr);
            if (TextUtils.isEmpty(str2)) {
                bundle.putString("android:query-arg-sql-sort-order", "_id DESC");
            } else {
                bundle.putString("android:query-arg-sql-sort-order", str2);
            }
            if (LIZLLL() && i > 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(i);
                LIZ.append(" offset ");
                LIZ.append(i2);
                bundle.putString("android:query-arg-sql-limit", X1D.LIZIZ(LIZ));
            }
        }
        return bundle;
    }
}
