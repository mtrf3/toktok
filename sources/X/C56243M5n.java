package X;

import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.M5n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56243M5n {
    public static String LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("snssdk");
        LIZ.append(EF7.LJIIIZ);
        return X1D.LIZIZ(LIZ);
    }

    public static boolean LIZIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!o.LJ(str, "sslocal") && !o.LJ(str, "snssdk1180") && !o.LJ(str, "snssdk1233") && !o.LJ(str, "musically") && !o.LJ(str, "tiktok")) {
            return false;
        }
        return true;
    }
}
