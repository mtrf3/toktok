package X;

import android.text.TextUtils;

/* loaded from: classes7.dex */
public final class F74 {
    static {
        C16880lQ.LJLLJ(F74.class);
    }

    public static void LIZ(String str) {
        if (!TextUtils.isEmpty(str)) {
            C16880lQ.LLJJJIL(str);
            return;
        }
        throw new Exception("Invalid library name.");
    }
}
