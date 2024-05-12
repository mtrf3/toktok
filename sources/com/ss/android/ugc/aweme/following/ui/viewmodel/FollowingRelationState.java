package com.ss.android.ugc.aweme.following.ui.viewmodel;

import X.C61878OQg;
import X.C72879Six;
import X.C72909SjR;
import X.F9E;
import X.InterfaceC61312at;
import com.bytedance.jedi.arch.ext.list.ListState;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class FollowingRelationState extends F9E implements InterfaceC61312at {
    public final String hotsoonText;
    public final boolean isHotsoonHasMore;
    public final boolean isSelf;
    public final ListState listState;
    public final int liveSortBy;
    public final String pageToken;
    public final List<Object> recommendList;
    public final C72879Six searchBarStatus;
    public final String secUserId;
    public final HashMap<String, Integer> unreadCountMap;
    public final List<String> unreadUidList;
    public final String userId;
    public final int vcdCount;

    public FollowingRelationState() {
        this(null, null, false, null, null, false, 0, null, null, null, null, null, 0, 8191, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FollowingRelationState copy$default(FollowingRelationState followingRelationState, String str, String str2, boolean z, List list, ListState listState, boolean z2, int i, String str3, HashMap hashMap, List list2, C72879Six c72879Six, String str4, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = followingRelationState.userId;
        }
        if ((i3 & 2) != 0) {
            str2 = followingRelationState.secUserId;
        }
        if ((i3 & 4) != 0) {
            z = followingRelationState.isSelf;
        }
        if ((i3 & 8) != 0) {
            list = followingRelationState.recommendList;
        }
        if ((i3 & 16) != 0) {
            listState = followingRelationState.listState;
        }
        if ((i3 & 32) != 0) {
            z2 = followingRelationState.isHotsoonHasMore;
        }
        if ((i3 & 64) != 0) {
            i = followingRelationState.vcdCount;
        }
        if ((i3 & 128) != 0) {
            str3 = followingRelationState.hotsoonText;
        }
        if ((i3 & 256) != 0) {
            hashMap = followingRelationState.unreadCountMap;
        }
        if ((i3 & 512) != 0) {
            list2 = followingRelationState.unreadUidList;
        }
        if ((i3 & 1024) != 0) {
            c72879Six = followingRelationState.searchBarStatus;
        }
        if ((i3 & 2048) != 0) {
            str4 = followingRelationState.pageToken;
        }
        if ((i3 & 4096) != 0) {
            i2 = followingRelationState.liveSortBy;
        }
        return followingRelationState.copy(str, str2, z, list, listState, z2, i, str3, hashMap, list2, c72879Six, str4, i2);
    }

    public final FollowingRelationState copy(String userId, String secUserId, boolean z, List<? extends Object> recommendList, ListState listState, boolean z2, int i, String hotsoonText, HashMap<String, Integer> unreadCountMap, List<String> unreadUidList, C72879Six searchBarStatus, String pageToken, int i2) {
        o.LJIIIZ(userId, "userId");
        o.LJIIIZ(secUserId, "secUserId");
        o.LJIIIZ(recommendList, "recommendList");
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(hotsoonText, "hotsoonText");
        o.LJIIIZ(unreadCountMap, "unreadCountMap");
        o.LJIIIZ(unreadUidList, "unreadUidList");
        o.LJIIIZ(searchBarStatus, "searchBarStatus");
        o.LJIIIZ(pageToken, "pageToken");
        return new FollowingRelationState(userId, secUserId, z, recommendList, listState, z2, i, hotsoonText, unreadCountMap, unreadUidList, searchBarStatus, pageToken, i2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.userId, this.secUserId, Boolean.valueOf(this.isSelf), this.recommendList, this.listState, Boolean.valueOf(this.isHotsoonHasMore), Integer.valueOf(this.vcdCount), this.hotsoonText, this.unreadCountMap, this.unreadUidList, this.searchBarStatus, this.pageToken, Integer.valueOf(this.liveSortBy)};
    }

    public final String getHotsoonText() {
        return this.hotsoonText;
    }

    public final ListState getListState() {
        return this.listState;
    }

    public final int getLiveSortBy() {
        return this.liveSortBy;
    }

    public final String getPageToken() {
        return this.pageToken;
    }

    public final List<Object> getRecommendList() {
        return this.recommendList;
    }

    public final C72879Six getSearchBarStatus() {
        return this.searchBarStatus;
    }

    public final String getSecUserId() {
        return this.secUserId;
    }

    public final HashMap<String, Integer> getUnreadCountMap() {
        return this.unreadCountMap;
    }

    public final List<String> getUnreadUidList() {
        return this.unreadUidList;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int getVcdCount() {
        return this.vcdCount;
    }

    public final boolean isHotsoonHasMore() {
        return this.isHotsoonHasMore;
    }

    public final boolean isSelf() {
        return this.isSelf;
    }

    public FollowingRelationState(String userId, String secUserId, boolean z, List<? extends Object> recommendList, ListState listState, boolean z2, int i, String hotsoonText, HashMap<String, Integer> unreadCountMap, List<String> unreadUidList, C72879Six searchBarStatus, String pageToken, int i2) {
        o.LJIIIZ(userId, "userId");
        o.LJIIIZ(secUserId, "secUserId");
        o.LJIIIZ(recommendList, "recommendList");
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(hotsoonText, "hotsoonText");
        o.LJIIIZ(unreadCountMap, "unreadCountMap");
        o.LJIIIZ(unreadUidList, "unreadUidList");
        o.LJIIIZ(searchBarStatus, "searchBarStatus");
        o.LJIIIZ(pageToken, "pageToken");
        this.userId = userId;
        this.secUserId = secUserId;
        this.isSelf = z;
        this.recommendList = recommendList;
        this.listState = listState;
        this.isHotsoonHasMore = z2;
        this.vcdCount = i;
        this.hotsoonText = hotsoonText;
        this.unreadCountMap = unreadCountMap;
        this.unreadUidList = unreadUidList;
        this.searchBarStatus = searchBarStatus;
        this.pageToken = pageToken;
        this.liveSortBy = i2;
    }

    public FollowingRelationState(String str, String str2, boolean z, List list, ListState listState, boolean z2, int i, String str3, HashMap hashMap, List list2, C72879Six c72879Six, String str4, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? C61878OQg.INSTANCE : list, (i3 & 16) != 0 ? new ListState(new C72909SjR(false, 0, 0L, false, 0, 0, false, 255), null, null, null, null, 30, null) : listState, (i3 & 32) != 0 ? false : z2, (i3 & 64) != 0 ? 0 : i, (i3 & 128) != 0 ? "" : str3, (i3 & 256) != 0 ? new HashMap() : hashMap, (i3 & 512) != 0 ? C61878OQg.INSTANCE : list2, (i3 & 1024) != 0 ? new C72879Six(0) : c72879Six, (i3 & 2048) == 0 ? str4 : "", (i3 & 4096) == 0 ? i2 : 0);
    }
}
