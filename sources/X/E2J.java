package X;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;

/* loaded from: classes7.dex */
public final class E2J {
    public static String LIZ(String str) {
        String[] strArr;
        if (str == null) {
            return str;
        }
        android.net.Uri parse = UriProtector.parse(str);
        if (parse != null && !parse.isOpaque() && TextUtils.equals(UriProtector.getQueryParameter(parse, "need_is_cutout"), "1")) {
            try {
                SettingsManager.LIZLLL().getClass();
                strArr = (String[]) SettingsManager.LJII("is_cutout_android", String[].class);
            } catch (Throwable unused) {
                strArr = null;
            }
            if (strArr != null) {
                for (String str2 : strArr) {
                    if (TextUtils.equals(Build.MODEL, str2)) {
                        return parse.buildUpon().appendQueryParameter("is_cutout", "1").build().toString();
                    }
                }
            }
        }
        return str;
    }
}
