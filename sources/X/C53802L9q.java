package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.L9q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53802L9q {
    public static final /* synthetic */ C53802L9q LIZ = new C53802L9q();
    public static final List<String> LIZIZ = Arrays.asList("For You");
    public static final List<String> LIZJ = Arrays.asList("Following");
    public static final List<String> LIZLLL = C47261Igj.LJJIJIIJI("homepage_explore", "Popular", "Shop", "Nearby", "FRIENDS_FEED", "Stem", "MUSIC_DSP_XTAB", "Live");
    public static final List<String> LJ = C53803L9r.LIZIZ;

    public static String LIZ(Integer num) {
        if (num != null) {
            if (num.intValue() == 0) {
                return "HOME";
            }
            if (num.intValue() != 1) {
                if (num.intValue() == 2) {
                    return "PUBLISH";
                }
                if (num.intValue() == 3) {
                    return "NOTIFICATION";
                }
                if (num.intValue() == 4) {
                    return "USER";
                }
                if (num.intValue() == 5) {
                }
            }
            return "DISCOVER";
        }
        return "";
    }
}
