package X;

import java.util.List;

/* loaded from: classes8.dex */
public final class H8W {
    public static final List<String> LIZ = C47261Igj.LJJIJIIJI("enter_video_shoot_page", "enter_clip_edit_page", "enter_video_edit_page", "enter_video_post_page");
    public static long LIZIZ = -1;
    public static String LIZJ = "";

    public static final void LIZ(String str) {
        List<String> list = LIZ;
        if (!list.contains(str)) {
            return;
        }
        if (!list.contains(LIZJ)) {
            LIZJ = str;
        } else if (list.indexOf(LIZJ) < list.indexOf(str)) {
            LIZJ = str;
        }
    }
}
