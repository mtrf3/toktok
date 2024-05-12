package X;

import android.net.Uri;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class CHI {
    public static String LIZIZ(java.util.Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            StringBuilder LIZ = X1D.LIZ();
            String str = (String) C1FJ.LIZJ(LIZ, (String) entry.getKey(), "=", entry);
            str.getClass();
            try {
                LIZ.append(URLEncoder.encode(str, "utf-8"));
                arrayList.add(X1D.LIZIZ(LIZ));
            } catch (UnsupportedEncodingException unused) {
                throw new IllegalStateException("Unable to encode using UTF-8");
            }
        }
        return TextUtils.join("&", arrayList);
    }

    public static void LIZ(Uri.Builder builder, String str, Object obj) {
        if (obj == null || obj.toString() == null) {
            return;
        }
        builder.appendQueryParameter(str, obj.toString());
    }
}
