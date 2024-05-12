package com.bytedance.android.livesdk.like;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import com.bytedance.android.livesdk.chatroom.model.LikeResponse;

/* loaded from: classes6.dex */
public interface LikeApi {
    @E8L("/webcast/room/like/icon/")
    AbstractC73672Svk<C28467BFf<LikeIconResult>> getIcons(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("anchor_id") long j2, @InterfaceC64986Pew("omit_default_icon") long j3);

    @E8M("/webcast/room/like/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Void>> like(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("count") long j2, @InterfaceC64986Pew("enter_from") String str);

    @E8M("/webcast/room/like/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Void>> like(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("count") long j2, @InterfaceC64986Pew("enter_from") String str, @InterfaceC64986Pew("to_uid") Long l);

    @E8M("/webcast/room/like/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<LikeResponse.Data>> like(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("count") long j2, @InterfaceC64986Pew("enter_from") String str, @InterfaceC64986Pew("to_uid") Long l, @InterfaceC64985Pev("adv_id") String str2, @InterfaceC64985Pev("enter_from_merge") String str3, @InterfaceC64985Pev("enter_method") String str4, @InterfaceC64985Pev("feed_id") String str5, @InterfaceC64985Pev("is_ad") int i, @InterfaceC64985Pev("ad_id") String str6, @InterfaceC64985Pev("label") String str7, @InterfaceC64985Pev("log_extra") String str8, @InterfaceC64985Pev("tag") String str9, @InterfaceC64985Pev("creative_id") String str10);
}
