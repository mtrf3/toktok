package X;

import com.ss.android.ugc.aweme.friends.model.Friend;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.profile.model.User;
import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.349, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass349 {
    public RecommendList LIZ;
    public List<Friend> LIZIZ;

    public AnonymousClass349() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass349)) {
            return false;
        }
        AnonymousClass349 anonymousClass349 = (AnonymousClass349) obj;
        return o.LJ(this.LIZ, anonymousClass349.LIZ) && o.LJ(this.LIZIZ, anonymousClass349.LIZIZ);
    }

    public final int hashCode() {
        RecommendList recommendList = this.LIZ;
        int hashCode = (recommendList == null ? 0 : recommendList.hashCode()) * 31;
        List<Friend> list = this.LIZIZ;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        Integer num;
        Integer num2;
        List<User> userList;
        List<User> inviterList;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BottomCombineResponse{recommends:{");
        RecommendList recommendList = this.LIZ;
        Integer num3 = null;
        if (recommendList != null && (inviterList = recommendList.getInviterList()) != null) {
            num = Integer.valueOf(inviterList.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(", ");
        RecommendList recommendList2 = this.LIZ;
        if (recommendList2 != null && (userList = recommendList2.getUserList()) != null) {
            num2 = Integer.valueOf(userList.size());
        } else {
            num2 = null;
        }
        LIZ.append(num2);
        LIZ.append("},contacts:");
        List<Friend> list = this.LIZIZ;
        if (list != null) {
            num3 = Integer.valueOf(list.size());
        }
        return s0.LIZJ(LIZ, num3, '}', LIZ);
    }

    public AnonymousClass349(RecommendList recommendList, List<Friend> list) {
        this.LIZ = recommendList;
        this.LIZIZ = list;
    }
}
