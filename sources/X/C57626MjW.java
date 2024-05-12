package X;

import com.ss.android.ugc.aweme.relation.feed.RecUserBigCardConfig;

/* renamed from: X.MjW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57626MjW {
    public static final RecUserBigCardConfig LIZ = new RecUserBigCardConfig(0, 0, 0, 0, 0, false, false, null, null, null, 1023, null);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C57645Mjp.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C57655Mjz.LJLIL);

    public static RecUserBigCardConfig LIZ() {
        return (RecUserBigCardConfig) LIZJ.getValue();
    }

    public static boolean LIZIZ() {
        if (LIZ().group > 6) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ() {
        if (LIZ().group == 11) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL() {
        return LIZ().isOtherFreInEffect;
    }

    public static boolean LJ() {
        if (LIZ().group > 5) {
            return true;
        }
        return false;
    }
}
