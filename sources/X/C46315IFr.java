package X;

import Y.ACallableS6S1000000_7;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import yq4.a;

/* renamed from: X.IFr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46315IFr {
    public static final void LIZ() {
        if (a.LJIJI().LIZ()) {
            C10K.LIZIZ(new ACallableS6S1000000_7(1), FMX.LIZIZ(), null);
        }
    }

    public static final void LIZIZ(String str, Aweme aweme, String str2) {
        String str3;
        String authorUid;
        if (a.LJIJI().LIZ()) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("video_status", str);
            String str4 = "";
            if (str2 == null) {
                str2 = "";
            }
            c188727au.LJIIIZ("enter_from", str2);
            if (aweme == null || (str3 = aweme.getAid()) == null) {
                str3 = "";
            }
            c188727au.LJIIIZ("group_id", str3);
            if (aweme != null && (authorUid = aweme.getAuthorUid()) != null) {
                str4 = authorUid;
            }
            c188727au.LJIIIZ("author_id", str4);
            FMX.LJIIL("earphone_unplug", c188727au.LIZ);
        }
    }
}
