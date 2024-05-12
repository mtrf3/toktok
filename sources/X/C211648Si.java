package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import ujb.o;

/* renamed from: X.8Si, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211648Si {
    public static int LIZJ;
    public static int LIZLLL;
    public static int LJFF;
    public static int LJI;
    public static String LIZ = "";
    public static String LIZIZ = "";
    public static String LJ = "";

    public static void LIZ(C188727au c188727au, Aweme aweme, String str, boolean z) {
        int i;
        String str2;
        if (o.LJJJJIZL("homepage_hot", str, true) && c188727au != null) {
            if (aweme != null && aweme.isAd()) {
                i = 1;
            } else {
                i = 0;
            }
            c188727au.LIZLLL(i, "is_ad");
            c188727au.LJFF(Boolean.valueOf(FRY.LIZ()), "hit_fcp");
            if (aweme != null) {
                str2 = aweme.getAid();
            } else {
                str2 = null;
            }
            LIZ = str2;
            if (z) {
                String LJIIJ = c188727au.LJIIJ("anchor_type");
                kotlin.jvm.internal.o.LJIIIIZZ(LJIIJ, "eventMapBuilder.getValue(KEY_ANCHOR_TYPE)");
                LIZIZ = LJIIJ;
                LIZJ++;
                return;
            }
            LIZLLL++;
        }
    }
}
