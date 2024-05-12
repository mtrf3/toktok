package X;

import com.ss.android.ugc.aweme.notification.followrequest.model.FollowRequestResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MOr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56741MOr extends C8BS<FollowRequestResponse> {
    public boolean LJLIL;
    public boolean LJLILLLLZI;

    @Override // X.C8BS
    public final boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, com.ss.android.ugc.aweme.notification.followrequest.model.FollowRequestResponse] */
    @Override // X.C8BS
    public final void handleData(FollowRequestResponse followRequestResponse) {
        T t;
        FollowRequestResponse followRequestResponse2 = followRequestResponse;
        if (followRequestResponse2 == 0) {
            this.mData = null;
            return;
        }
        List<User> list = followRequestResponse2.userRequestList;
        if (list == null || list.isEmpty()) {
            followRequestResponse2.hasMore = false;
        }
        if (!this.LJLIL || (t = this.mData) == 0) {
            this.mData = followRequestResponse2;
        } else {
            FollowRequestResponse followRequestResponse3 = (FollowRequestResponse) t;
            followRequestResponse3.maxTime = followRequestResponse2.maxTime;
            followRequestResponse3.minTime = followRequestResponse2.minTime;
            followRequestResponse3.hasMore = followRequestResponse2.hasMore;
            List<User> list2 = followRequestResponse3.userRequestList;
            List<User> list3 = followRequestResponse2.userRequestList;
            o.LJIIIIZZ(list3, "data.userRequestList");
            list2.addAll(list3);
        }
        List<User> list4 = followRequestResponse2.userRequestList;
        if (list4 == null || list4.isEmpty()) {
            return;
        }
        L6F.LIZIZ.LIZLLL(L61.STORY, null, followRequestResponse2.userRequestList, MRH.LJLIL);
    }

    public final void LJIIIZ(int i, long j) {
        FGR.LIZIZ().LIZ(this.mHandler, new CallableC55908Lwu(j, i), 0);
    }
}
