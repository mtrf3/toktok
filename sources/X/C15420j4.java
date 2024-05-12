package X;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;

/* renamed from: X.0j4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15420j4 {
    public static boolean LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return new File(str).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    public static File LIZIZ(Context context) {
        String str;
        boolean z;
        File file = null;
        try {
            str = C16880lQ.LLLLLLLZIL();
        } catch (Exception unused) {
            str = null;
        }
        boolean z2 = false;
        if ("mounted".equals(str) || "mounted_ro".equals(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                z2 = "mounted".equals(C16880lQ.LLLLLLLZIL());
            } catch (Exception unused2) {
            }
            if (z2 && C16880lQ.LLIIIZ(context) != null) {
                file = new File(C16880lQ.LLIIIZ(context).getPath());
                if (!file.exists()) {
                    file.mkdirs();
                }
                file.exists();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("cache path:");
                LIZ.append(file.getAbsolutePath());
                C0NB.LIZIZ("file_path", X1D.LIZIZ(LIZ));
            }
        }
        return file;
    }

    public static File LIZJ(Context context) {
        String str;
        boolean z;
        File file = null;
        try {
            str = C16880lQ.LLLLLLLZIL();
        } catch (Exception unused) {
            str = null;
        }
        boolean z2 = false;
        if ("mounted".equals(str) || "mounted_ro".equals(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                z2 = "mounted".equals(C16880lQ.LLLLLLLZIL());
            } catch (Exception unused2) {
            }
            if (z2) {
                file = new File(LIZIZ(context), "picture");
                if (!file.exists()) {
                    file.mkdirs();
                }
                file.exists();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("picture");
                LIZ.append(" cache path:");
                LIZ.append(file.getAbsolutePath());
                C0NB.LIZIZ("file_path", X1D.LIZIZ(LIZ));
            }
        }
        return file;
    }

    public static void LIZLLL(String str) {
        try {
            if (!"mounted".equals(C16880lQ.LLLLLLLZIL()) || TextUtils.isEmpty(str)) {
                return;
            }
            File file = new File(str);
            if (!file.exists() || !file.canWrite()) {
                return;
            }
            C16880lQ.LLLZZIL(file);
        } catch (Exception unused) {
        }
    }
}
