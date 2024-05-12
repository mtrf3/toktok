package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.4W0, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4W0 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, Aweme aweme, String str2) {
        String str3;
        String LJI;
        if (aweme != null) {
            str3 = aweme.getAid();
        } else {
            str3 = null;
        }
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        if (aweme != null && (LJI = C54838Lfe.LJI(aweme)) != null) {
            str4 = LJI;
        }
        C188727au LIZLLL = KNV.LIZLLL(str, "enterFrom");
        LIZLLL.LJIIIZ("enter_from", str);
        LIZLLL.LJIIIZ("type", "popup");
        LIZLLL.LJIIIZ("action_type", str2);
        LIZLLL.LJIIIZ("enter_method", "click");
        LIZLLL.LJIIIZ("group_id", str3);
        LIZLLL.LJIIIZ("story_collection_id", str4);
        FMX.LJIIL("story_post_guide", LIZLLL.LIZ);
    }
}
