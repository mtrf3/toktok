package X;

import android.text.TextUtils;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IVT {
    public static final String LIZ(String str) {
        EF7.LIZIZ();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String absolutePath = C16880lQ.LLIIIL(EF7.LIZIZ()).getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "AppContextManager.getApp…t().cacheDir.absolutePath");
        if (TextUtils.isEmpty(absolutePath)) {
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(absolutePath);
        String str2 = File.separator;
        YE1.LIZLLL(LIZ, str2, "feedCache", str2, str);
        return X1D.LIZIZ(LIZ);
    }

    public static final boolean LIZIZ(String str) {
        if (TextUtils.isEmpty(str) || !C1B6.LIZIZ(str)) {
            return false;
        }
        return true;
    }
}
