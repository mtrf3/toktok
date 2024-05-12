package X;

import android.os.Build;

/* renamed from: X.8Gm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208568Gm {
    public static boolean LIZ() {
        boolean z;
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        boolean LIZIZ = C84S.LIZIZ("use_dynamic_cover", z);
        if (C84S.LIZ("use_dynamic_cover") || !C84S.LIZ.containsKey(C84S.LIZJ("use_dynamic_cover"))) {
            if (((Number) C208648Gu.LIZ.getValue()).intValue() == 0) {
                z2 = true;
            }
            return C84S.LIZIZ("profile_aweme_post_use_dynamic_cover", z2);
        }
        return LIZIZ;
    }
}
