package X;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Base64;

/* renamed from: X.Fn9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40015Fn9 {
    public Typeface LIZ(VNU vnu, EnumC40050Fni enumC40050Fni, String str) {
        if (!TextUtils.isEmpty(str) && enumC40050Fni != EnumC40050Fni.LOCAL) {
            int indexOf = str.indexOf("base64,");
            if (str.startsWith("data:") && indexOf != -1) {
                try {
                    return C78983UzD.LJIIL(vnu, Base64.decode(str.substring(indexOf + 7), 0));
                } catch (Exception e) {
                    vnu.LJIIJ(str, "font", e.getMessage());
                }
            }
        }
        return null;
    }
}
