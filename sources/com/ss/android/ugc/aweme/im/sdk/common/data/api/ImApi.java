package com.ss.android.ugc.aweme.im.sdk.common.data.api;

import X.AbstractC73672Svk;
import X.C76L;
import X.E4Q;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.BlockResponse;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.ShareStateResponse;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.UserOtherResponse;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.UserSelfResponse;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.UserStruct;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model.RelationFetchResponse;

/* loaded from: classes2.dex */
public interface ImApi {
    @E4Q("user/block/")
    C76L<BlockResponse> block(@InterfaceC64989Pez("user_id") String str, @InterfaceC64989Pez("sec_user_id") String str2, @InterfaceC64989Pez("block_type") int i);

    @InterfaceC195787mI
    @E4T("im/msg/feedback/")
    AbstractC73672Svk<BaseResponse> feedBackMsg(@InterfaceC64987Pex("msg_type") String str, @InterfaceC64987Pex("conv_id") String str2, @InterfaceC64987Pex("conv_short_id") Long l, @InterfaceC64987Pex("scene") String str3, @InterfaceC64987Pex("content") String str4, @InterfaceC64987Pex("receiver_uid") Long l2, @InterfaceC64987Pex("msg_id") String str5, @InterfaceC64987Pex("server_msg_id") Long l3, @InterfaceC64987Pex("content_pb") String str6, @InterfaceC64987Pex("template_scene") String str7);

    @E4Q("user/profile/other/")
    Object fetchUserOther(@InterfaceC64989Pez("user_id") String str, @InterfaceC64989Pez("sec_user_id") String str2, @InterfaceC64989Pez("scene_id") int i, InterfaceC67352kd<? super UserOtherResponse> interfaceC67352kd);

    @E4Q("user/profile/self/")
    Object fetchUserSelf(@InterfaceC64989Pez("user_id") String str, @InterfaceC64989Pez("sec_user_id") String str2, @InterfaceC64989Pez("scene_id") int i, InterfaceC67352kd<? super UserSelfResponse> interfaceC67352kd);

    @E4Q("im/spotlight/multi_relation/")
    Object getShareUserCanSendMsg(@InterfaceC64989Pez("sec_to_user_id") String str, InterfaceC67352kd<? super ShareStateResponse> interfaceC67352kd);

    @E4Q("spotlight/relation/")
    Object getSpotlightRelation(@InterfaceC64989Pez("count") int i, @InterfaceC64989Pez("source") String str, @InterfaceC64989Pez("with_fstatus") int i2, @InterfaceC64989Pez("max_time") long j, @InterfaceC64989Pez("min_time") long j2, @InterfaceC64989Pez("address_book_access") int i3, @InterfaceC64989Pez("with_mention_check") boolean z, InterfaceC67352kd<? super RelationFetchResponse> interfaceC67352kd);

    @E4Q("user/")
    Object queryUser(@InterfaceC64989Pez("user_id") String str, @InterfaceC64989Pez("sec_user_id") String str2, InterfaceC67352kd<? super UserStruct> interfaceC67352kd);

    @E4Q("user/block/")
    Object updateBlockUserStatus(@InterfaceC64989Pez("user_id") String str, @InterfaceC64989Pez("sec_user_id") String str2, @InterfaceC64989Pez("block_type") int i, InterfaceC67352kd<? super BlockResponse> interfaceC67352kd);
}
