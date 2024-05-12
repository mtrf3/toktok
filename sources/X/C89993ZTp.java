package X;

import android.text.TextUtils;
import java.io.File;

/* renamed from: X.ZTp, reason: case insensitive filesystem */
/* loaded from: classes19.dex */
public final class C89993ZTp {
    public static void LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (!file.exists() || !file.isFile()) {
            return;
        }
        C16880lQ.LLLZZIL(file);
    }
}
