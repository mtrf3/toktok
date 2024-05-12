package com.ss.android.ugc.aweme.relation.api;

import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.E4Q;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.ExposeSharerData;
import com.ss.android.ugc.aweme.friends.model.ShortenUrlModel;
import com.ss.android.ugc.aweme.relation.model.LinkPrivacyPopupStatusResponse;
import com.ss.android.ugc.aweme.relation.model.SmgSettingsModel;

/* loaded from: classes10.dex */
public interface IInviteFriendsApi {
    @E4Q("/ug/social/invite/msg/settings/")
    AbstractC73638SvC<SmgSettingsModel> getInviteFriendsSettings();

    @E4Q("/tiktok/v1/link/privacy/popup/status/")
    AbstractC73638SvC<LinkPrivacyPopupStatusResponse> getLinkPrivacyPopupStatus();

    @E4Q("/tiktok/v1/sharer/info/")
    AbstractC73672Svk<ExposeSharerData> getSharerInfo(@InterfaceC64989Pez("link_id") String str, @InterfaceC64989Pez("share_type") int i, @InterfaceC64989Pez("share_source") String str2, @InterfaceC64989Pez("from_uid") String str3, @InterfaceC64989Pez("sec_from_uid") String str4, @InterfaceC64989Pez("item_id") String str5, @InterfaceC64989Pez("checksum") String str6, @InterfaceC64989Pez("timestamp") String str7, @InterfaceC64989Pez("invitation_scene") String str8, @InterfaceC64989Pez("share_url") String str9, @InterfaceC64989Pez("share_link_mode") int i2);

    @E4Q("/tiktok/v1/now/friend/invite")
    Object inviteFriend(@InterfaceC64989Pez("user_id") String str, @InterfaceC64989Pez("sec_user_id") String str2, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);

    @InterfaceC195787mI
    @E4T("/tiktok/privacy/setting/suggestion/update/v1")
    AbstractC73638SvC<BaseResponse> setSuggestPrivacySettings(@InterfaceC64987Pex("field") String str, @InterfaceC64987Pex("value") int i);

    @InterfaceC195787mI
    @E4T("/ug/social/invite/msg/short_url/")
    AbstractC73638SvC<ShortenUrlModel> shortenUrl(@InterfaceC64987Pex("url") String str);

    @InterfaceC195787mI
    @E4T("/tiktok/v1/link/privacy/popup/status/update/")
    AbstractC73638SvC<BaseResponse> updateLinkPrivacyPopupStatus(@InterfaceC64987Pex("displayed") boolean z);
}
