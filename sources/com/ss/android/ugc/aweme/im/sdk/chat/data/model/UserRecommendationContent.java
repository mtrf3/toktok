package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C141335gf;
import X.C1NE;
import X.C32I;
import X.C34B;
import X.C3C5;
import X.C75792yF;
import X.InterfaceC65349Pkn;
import X.ORZ;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UserRecommendationContent extends FakeMessageContent {
    public static final Companion Companion = new Companion();
    public final List<RecUserInfo> userList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserRecommendationContent copy$default(UserRecommendationContent userRecommendationContent, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = userRecommendationContent.userList;
        }
        return userRecommendationContent.copy(list);
    }

    public final UserRecommendationContent copy(List<RecUserInfo> list) {
        return new UserRecommendationContent(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserRecommendationContent) && o.LJ(this.userList, ((UserRecommendationContent) obj).userList);
    }

    public int hashCode() {
        List<RecUserInfo> list = this.userList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessageContent
    public boolean isValid() {
        List<RecUserInfo> list = this.userList;
        if (list == null || ORZ.LJLL(list).size() <= 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserRecommendationContent(userList=");
        return C1NE.LIZIZ(LIZ, this.userList, ')', LIZ);
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final UserRecommendationContent from$im_base_release(String data) {
            Object LIZ;
            o.LJIIIZ(data, "data");
            try {
                LIZ = C75792yF.LIZLLL(RecUserInfo[].class, data);
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (C3C5.m12isFailureimpl(LIZ)) {
                LIZ = null;
            }
            List list = (List) LIZ;
            if (list == null || list.isEmpty()) {
                return null;
            }
            return new UserRecommendationContent(list);
        }
    }

    /* loaded from: classes2.dex */
    public static final class RecUserInfo {

        @InterfaceC65349Pkn("avatar")
        public final UrlModel avatar;

        @InterfaceC65349Pkn("closed_ts")
        public long closedTimestamp;

        @InterfaceC65349Pkn("follow_status")
        public final int followStatus;

        @InterfaceC65349Pkn("matched_friends")
        public final MatchedFriendStruct matchedFriends;

        @InterfaceC65349Pkn("nick_name")
        public final String nickName;

        @InterfaceC65349Pkn("order_index")
        public long orderIndex;
        public transient User user;

        @InterfaceC65349Pkn("user_id")
        public final String userId;

        public final UrlModel getAvatar() {
            return this.avatar;
        }

        public final long getClosedTimestamp() {
            return this.closedTimestamp;
        }

        public final int getFollowStatus() {
            return this.followStatus;
        }

        public final MatchedFriendStruct getMatchedFriends() {
            return this.matchedFriends;
        }

        public final String getNickName() {
            return this.nickName;
        }

        public final long getOrderIndex() {
            return this.orderIndex;
        }

        public final User getUser() {
            return this.user;
        }

        public final String getUserId() {
            return this.userId;
        }

        public final void setClosedTimestamp(long j) {
            this.closedTimestamp = j;
        }

        public final void setOrderIndex(long j) {
            this.orderIndex = j;
        }

        public final void setUser(User user) {
            this.user = user;
        }

        public RecUserInfo(String str, String str2, UrlModel urlModel, int i, MatchedFriendStruct matchedFriendStruct, long j, long j2) {
            this.userId = str;
            this.nickName = str2;
            this.avatar = urlModel;
            this.followStatus = i;
            this.matchedFriends = matchedFriendStruct;
            this.closedTimestamp = j;
            this.orderIndex = j2;
        }
    }

    public final List<RecUserInfo> getUserList() {
        return this.userList;
    }

    public UserRecommendationContent(List<RecUserInfo> list) {
        this.userList = list;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessageContent
    public boolean needUpdate(FakeMessageContent fakeMessageContent) {
        Integer num;
        Integer num2;
        ArrayList arrayList;
        String str;
        String str2;
        if (!(fakeMessageContent instanceof UserRecommendationContent)) {
            return false;
        }
        List<RecUserInfo> list = this.userList;
        ArrayList arrayList2 = null;
        if (list != null) {
            num = Integer.valueOf(ORZ.LJLL(list).size());
        } else {
            num = null;
        }
        UserRecommendationContent userRecommendationContent = (UserRecommendationContent) fakeMessageContent;
        List<RecUserInfo> list2 = userRecommendationContent.userList;
        if (list2 != null) {
            num2 = Integer.valueOf(ORZ.LJLL(list2).size());
        } else {
            num2 = null;
        }
        if (!o.LJ(num, num2)) {
            C34B.LJI("UserRecommendationContent", "size is not equals");
            return true;
        }
        HashSet hashSet = new HashSet();
        List<RecUserInfo> list3 = this.userList;
        if (list3 != null) {
            Iterator it = ORZ.LJLL(list3).iterator();
            while (it.hasNext()) {
                hashSet.add(((RecUserInfo) it.next()).getUserId());
            }
        }
        List<RecUserInfo> list4 = userRecommendationContent.userList;
        if (list4 != null) {
            Iterator it2 = ORZ.LJLL(list4).iterator();
            while (it2.hasNext()) {
                hashSet.remove(((RecUserInfo) it2.next()).getUserId());
            }
        }
        if (!(!hashSet.isEmpty())) {
            return false;
        }
        StringBuilder sb = new StringBuilder("this=");
        List<RecUserInfo> list5 = this.userList;
        if (list5 != null) {
            arrayList = new ArrayList(C32I.LJJL(list5, 10));
            for (RecUserInfo recUserInfo : list5) {
                if (recUserInfo != null) {
                    str2 = recUserInfo.getUserId();
                } else {
                    str2 = null;
                }
                arrayList.add(str2);
            }
        } else {
            arrayList = null;
        }
        sb.append(arrayList);
        sb.append(", old=");
        List<RecUserInfo> list6 = userRecommendationContent.userList;
        if (list6 != null) {
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(list6, 10));
            for (RecUserInfo recUserInfo2 : list6) {
                if (recUserInfo2 != null) {
                    str = recUserInfo2.getUserId();
                } else {
                    str = null;
                }
                arrayList3.add(str);
            }
            arrayList2 = arrayList3;
        }
        sb.append(arrayList2);
        C34B.LJI("UserRecommendationContent", sb.toString());
        return true;
    }
}
