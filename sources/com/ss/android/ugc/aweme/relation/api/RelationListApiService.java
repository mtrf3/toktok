package com.ss.android.ugc.aweme.relation.api;

import X.C791138p;
import X.E4Q;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.relation.model.FriendsListResponse;
import com.ss.android.ugc.aweme.relation.model.FriendsNewPostsItemResponse;
import com.ss.android.ugc.aweme.search.model.SearchUserSugResponse;

/* loaded from: classes13.dex */
public final class RelationListApiService implements IRelationListApi {
    public static final RelationListApiService LIZIZ = new RelationListApiService();
    public final /* synthetic */ IRelationListApi LIZ = (IRelationListApi) C791138p.LIZIZ.create(IRelationListApi.class);

    @Override // com.ss.android.ugc.aweme.relation.api.IRelationListApi
    @E4Q("/tiktok/user/relation/mutual_friends/list/v1")
    public Object getFriendsList(@InterfaceC64989Pez("scene") int i, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("sec_user_id") String str, @InterfaceC64989Pez("page_token") String str2, InterfaceC67352kd<? super FriendsListResponse> interfaceC67352kd) {
        return this.LIZ.getFriendsList(i, i2, str, str2, interfaceC67352kd);
    }

    @Override // com.ss.android.ugc.aweme.relation.api.IRelationListApi
    @E4Q("tiktok/user/relation/unread_items/v1")
    public Object getFriendsNewPosts(@InterfaceC64989Pez("to_user_id") String str, @InterfaceC64989Pez("scene") int i, @InterfaceC64989Pez("page_token") String str2, InterfaceC67352kd<? super FriendsNewPostsItemResponse> interfaceC67352kd) {
        return this.LIZ.getFriendsNewPosts(str, i, str2, interfaceC67352kd);
    }

    @Override // com.ss.android.ugc.aweme.relation.api.IRelationListApi
    @InterfaceC195787mI
    @E4T("/aweme/v1/search/user/sug/")
    public Object searchFriends(@InterfaceC64987Pex("keyword") String str, @InterfaceC64987Pex("count") long j, @InterfaceC64987Pex("source") String str2, @InterfaceC64987Pex("mention_type") long j2, InterfaceC67352kd<? super SearchUserSugResponse> interfaceC67352kd) {
        return this.LIZ.searchFriends(str, j, str2, j2, interfaceC67352kd);
    }
}
