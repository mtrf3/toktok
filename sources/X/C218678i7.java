package X;

import Y.IDRunnableS6S0101000;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.8i7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218678i7 {
    public static boolean LIZ;
    public static Aweme LIZIZ;
    public static String LIZJ = "";
    public static int LIZLLL;

    public static void LIZ() {
        if (LIZ) {
            C1DH.LJJIJIIJI(new IDRunnableS6S0101000(2, C218668i6.LIZ, 9));
            LIZ = false;
            LIZIZ = null;
        }
    }

    public static void LIZIZ(int i, String str, Aweme aweme) {
        LIZIZ = aweme;
        LIZJ = str;
        LIZLLL = i;
        if (!LIZ) {
            C1DH.LJJIJIIJI(new Q8V(2, C218668i6.LIZ));
            LIZ = true;
        }
    }
}
