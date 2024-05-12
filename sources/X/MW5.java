package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MW5 {
    public static final /* synthetic */ int LIZIZ = 0;
    public final java.util.Set<String> LIZ = new LinkedHashSet();

    public static void LIZ(String str, String str2, String str3) {
        C188727au LIZLLL = KNV.LIZLLL(str3, "enterFrom");
        LIZLLL.LJIIIZ("to_user_id", str);
        LIZLLL.LJIIIZ("rec_type", str2);
        LIZLLL.LJIIIZ("enter_from", str3);
        LIZLLL.LJIIIZ("previous_page", "notification_page");
        FMX.LJIIL("show_follow_back_button", LIZLLL.LIZ);
    }

    public final void LIZIZ(User user, String str, String enterFrom) {
        boolean z;
        String str2;
        o.LJIIIZ(enterFrom, "enterFrom");
        if (!this.LIZ.contains(str)) {
            this.LIZ.add(str);
            MNH mnh = MNH.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("followRequest:");
            LIZ.append(str);
            mnh.LIZ(X1D.LIZIZ(LIZ));
            boolean z2 = false;
            if (E1X.LIZ() && user.getFollowStatus() == 1) {
                z = true;
            } else {
                z = false;
                if (AXU.LIZJ(user)) {
                    z2 = true;
                }
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("user_id", str);
            c188727au.LJIIIZ("enter_from", enterFrom);
            String str3 = "1";
            if (z2) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au.LJIIIZ("has_label", str2);
            if (!z) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au.LJIIIZ("has_follow_tag", str3);
            FMX.LJIIL("follow_request_message", c188727au.LIZ);
        }
    }
}
