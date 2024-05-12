package X;

import android.text.TextUtils;
import java.io.File;

/* renamed from: X.2jC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66462jC {
    public static String LIZ(int i) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(HG3.LJIILL().getCurUserId());
        if (i == 1) {
            str = "_qrcode_image_cache_for_invite";
        } else {
            str = "_qrcode_image_cache";
        }
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }

    public static File LIZIZ(int i) {
        String str;
        File LLIIIL = C16880lQ.LLIIIL(EF7.LIZIZ());
        if (LLIIIL != null) {
            C39579Fg7.LJFF(LLIIIL);
            str = LLIIIL.getAbsolutePath();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str, LIZ(i));
            if (file.exists()) {
                return file;
            }
        }
        return null;
    }
}
