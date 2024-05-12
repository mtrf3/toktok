package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import java.util.List;

/* renamed from: X.TZk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74856TZk {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C74857TZl.LJLIL);
    public static String LIZIZ = "single_live";
    public static int LIZJ;

    public static ListByTypeResponse.ReservedUser LIZ(long j) {
        List<ListByTypeResponse.ReservedUser> list = (List) LIZ.getValue();
        if (list != null) {
            for (ListByTypeResponse.ReservedUser reservedUser : list) {
                User user = reservedUser.user;
                if (user != null && user.getId() == j) {
                    return reservedUser;
                }
            }
            return null;
        }
        return null;
    }
}
