package com.ss.android.ugc.aweme.userservice.jedi.model;

import X.AbstractC73672Svk;
import X.E4Q;
import X.InterfaceC64989Pez;
import X.M8E;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;

/* loaded from: classes10.dex */
public interface JediFollowApi {
    public static final M8E LIZ = M8E.LIZ;

    @E4Q("/aweme/v1/commit/follow/user/")
    AbstractC73672Svk<FollowStatus> follow(@InterfaceC64989Pez("user_id") String str, @InterfaceC64989Pez("sec_user_id") String str2, @InterfaceC64989Pez("type") int i, @InterfaceC64989Pez("channel_id") int i2, @InterfaceC64989Pez("from") Integer num, @InterfaceC64989Pez("item_id") String str3, @InterfaceC64989Pez("from_pre") Integer num2, @InterfaceC64989Pez("rec_type") String str4, @InterfaceC64989Pez("video_link_id") String str5, @InterfaceC64989Pez("video_link_item_id") String str6, @InterfaceC64989Pez("link_sharer") Integer num3);
}
