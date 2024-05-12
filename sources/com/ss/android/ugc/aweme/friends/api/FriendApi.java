package com.ss.android.ugc.aweme.friends.api;

import X.AbstractC73672Svk;
import X.C10K;
import X.C57126MbS;
import X.E4Q;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC36229EJt;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.friends.model.Friend;
import com.ss.android.ugc.aweme.friends.model.FriendList;
import com.ss.android.ugc.aweme.friends.model.ShortenUrlModel;
import com.ss.android.ugc.aweme.relation.ContactResponse;
import java.util.Map;

/* loaded from: classes14.dex */
public interface FriendApi {
    public static final C57126MbS LIZ = C57126MbS.LIZ;

    @InterfaceC195787mI
    @E4T("/aweme/v1/social/friend/")
    AbstractC73672Svk<FriendList<Friend>> getSocialFriendsWithScene(@InterfaceC64987Pex("social") String str, @InterfaceC64987Pex("access_token") String str2, @InterfaceC64987Pex("secret_access_token") String str3, @InterfaceC64987Pex("token_expiration_timestamp") Long l, @InterfaceC64987Pex("scene") Integer num);

    @InterfaceC195787mI
    @E4T("/aweme/v1/social/friend/")
    AbstractC73672Svk<FriendList<Friend>> getSocialFriendsWithScene(@InterfaceC64987Pex("social") String str, @InterfaceC64987Pex("access_token") String str2, @InterfaceC64987Pex("secret_access_token") String str3, @InterfaceC64987Pex("token_expiration_timestamp") Long l, @InterfaceC64987Pex("scene") Integer num, @InterfaceC64987Pex("sync_only") boolean z);

    @E4Q("/tiktok/user/relation/recommended_notice/update/v1")
    AbstractC73672Svk<BaseResponse> reportMafFollowBackBoot(@InterfaceC64989Pez("scene") int i);

    @InterfaceC195787mI
    @E4T("/ug/social/invite/msg/short_url/")
    AbstractC73672Svk<ShortenUrlModel> shortenUrlRx(@InterfaceC64987Pex("url") String str);

    @InterfaceC195787mI
    @E4T("/aweme/v1/social/friend/")
    AbstractC73672Svk<FriendList<Friend>> socialFriends(@InterfaceC64987Pex("social") String str, @InterfaceC64987Pex("access_token") String str2, @InterfaceC64987Pex("secret_access_token") String str3, @InterfaceC64987Pex("token_expiration_timestamp") Long l, @InterfaceC64987Pex("sync_only") boolean z);

    @InterfaceC195787mI
    @E4T("/tiktok/user/relation/social/settings/update/v1")
    C10K<BaseResponse> syncContactStatus(@InterfaceC64987Pex("social_platform") int i, @InterfaceC64987Pex("sync_status") Boolean bool, @InterfaceC64987Pex("is_manual") Boolean bool2);

    @InterfaceC195787mI
    @E4T("/tiktok/user/relation/social/settings/update/v1")
    AbstractC73672Svk<BaseResponse> syncSocialRelationStatusInRx(@InterfaceC64987Pex("social_platform") int i, @InterfaceC64987Pex("sync_status") Boolean bool, @InterfaceC64987Pex("is_manual") Boolean bool2, @InterfaceC64987Pex("email_ads_disclosure") boolean z);

    @InterfaceC195787mI
    @E4T("/aweme/v1/upload/hashcontacts/")
    AbstractC73672Svk<ContactResponse> uploadHashContacts(@InterfaceC64989Pez("need_unregistered_user") String str, @InterfaceC36229EJt Map<String, String> map, @InterfaceC64989Pez("scene") Integer num, @InterfaceC64989Pez("sync_only") Boolean bool);
}
