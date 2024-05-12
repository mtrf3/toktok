package X;

import java.util.List;

/* renamed from: X.Hay, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44356Hay {
    public static final List<String> LIZ = C47261Igj.LJJIJIIJI("single_song", "collection_music", "draft_again", "prop_page", "anchor_combine_prop", "challenge", "comment_reply", "question_and_answer", "prop_reuse", "question", "answer", "library", "mv_page");
    public static final List<String> LIZIZ = C47261Igj.LJJIJ("story");

    public static InterfaceC44358Hb0 LIZ(String str) {
        if (ORZ.LJLJJI(str, LIZIZ)) {
            return null;
        }
        if (ORZ.LJLJJI(str, LIZ)) {
            if (C00F.LIZ(31744, 0, "cache_record_mode_from_special", true) == 0) {
                return C44355Hax.LIZ;
            }
            return C44357Haz.LIZ;
        }
        if (C00F.LIZ(31744, 0, "cache_record_mode_from_normal", true) != 1) {
            return null;
        }
        return C44355Hax.LIZ;
    }

    public static boolean LIZIZ(int i, String str) {
        Integer valueOf;
        InterfaceC44358Hb0 LIZ2 = LIZ(str);
        if (LIZ2 != null && (valueOf = Integer.valueOf(LIZ2.LIZ(str))) != null) {
            if (valueOf.intValue() == 0) {
                return true;
            }
            if (valueOf != null && valueOf.intValue() == -1) {
                List<String> list = LIZ;
                if (ORZ.LJLJJI(str, list) && C00F.LIZ(31744, 0, "first_default_camera_mode_from_special", true) == 0) {
                    return true;
                }
                if (!ORZ.LJLJJI(str, list) && C00F.LIZ(31744, 0, "first_default_camera_mode_from_normal", true) != 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
