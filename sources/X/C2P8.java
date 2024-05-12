package X;

import com.ss.android.ugc.aweme.profile.model.AwemeUnreadInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2P8, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2P8 {
    public static String LIZ;
    public static final java.util.Map<String, List<String>> LIZIZ = new LinkedHashMap();

    public static List LIZ(User user) {
        List<String> unreadIdList;
        List list;
        o.LJIIIZ(user, "user");
        AwemeUnreadInfo awemeUnreadInfo = user.getAwemeUnreadInfo();
        if (awemeUnreadInfo == null || (unreadIdList = awemeUnreadInfo.getUnreadIdList()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : unreadIdList) {
            if (user.getUid() != null) {
                String uid = user.getUid();
                o.LJIIIIZZ(uid, "user.uid");
                String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
                if (curUserId != null) {
                    if (!o.LJ(curUserId, LIZ)) {
                        LIZ = curUserId;
                        ((LinkedHashMap) LIZIZ).clear();
                    }
                    java.util.Map<String, List<String>> map = LIZIZ;
                    if (map.containsKey(uid) && (list = (List) ((LinkedHashMap) map).get(uid)) != null && list.contains(str)) {
                    }
                }
                arrayList.add(str);
            }
        }
        return ORZ.LLJILJILJ(arrayList);
    }
}
