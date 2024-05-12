package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;

/* renamed from: X.7yL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203257yL {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Aweme aweme, PostModeDetailParams postModeDetailParams) {
        String str;
        int i;
        String aid;
        J85 j85 = new J85();
        j85.LJIILJJIL = aweme;
        j85.LJIILL = "graphic_detail";
        String str2 = "";
        if (postModeDetailParams == null || (str = postModeDetailParams.eventType) == null) {
            str = "";
        }
        j85.LIZLLL = str;
        if (aweme != null && (aid = aweme.getAid()) != null) {
            str2 = aid;
        }
        j85.LJ("group_id", str2, InterfaceC1798974f.LIZ);
        if (aweme != null) {
            i = aweme.getAwemeType();
        } else {
            i = -1;
        }
        j85.LIZJ(i, "aweme_type");
        j85.LIZJ(C227768wm.LIZ(aweme), "has_title");
        j85.LIZJ(C227768wm.LJIILIIL(aweme), "pic_cnt");
        j85.LJIILIIL();
    }
}
