package com.ss.android.ugc.aweme.relation.model;

import X.C1NE;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FriendsNewPostsItemResponse extends BaseResponse {

    @InterfaceC65349Pkn("items")
    public final List<Aweme> awemeList;

    @InterfaceC65349Pkn("has_more")
    public final Boolean hasMore;

    @InterfaceC65349Pkn("next_page_token")
    public final String nextPageToken;

    public FriendsNewPostsItemResponse() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsNewPostsItemResponse)) {
            return false;
        }
        FriendsNewPostsItemResponse friendsNewPostsItemResponse = (FriendsNewPostsItemResponse) obj;
        return o.LJ(this.hasMore, friendsNewPostsItemResponse.hasMore) && o.LJ(this.nextPageToken, friendsNewPostsItemResponse.nextPageToken) && o.LJ(this.awemeList, friendsNewPostsItemResponse.awemeList);
    }

    public final int hashCode() {
        Boolean bool = this.hasMore;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.nextPageToken;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<Aweme> list = this.awemeList;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FriendsNewPostsItemResponse(hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", nextPageToken=");
        LIZ.append(this.nextPageToken);
        LIZ.append(", awemeList=");
        return C1NE.LIZIZ(LIZ, this.awemeList, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FriendsNewPostsItemResponse(Boolean bool, String str, List<? extends Aweme> list) {
        this.hasMore = bool;
        this.nextPageToken = str;
        this.awemeList = list;
    }

    public FriendsNewPostsItemResponse(Boolean bool, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? C61878OQg.INSTANCE : list);
    }
}
