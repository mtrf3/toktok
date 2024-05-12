package com.bytedance.android.live.liveinteract.match.remote.api;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.E8M;
import X.EnumC29608Bjg;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.InterfaceC65131PhH;
import com.bytedance.android.live.liveinteract.match.model.BattleFinishResult;
import com.bytedance.android.live.liveinteract.match.model.BattleInviteResult;
import com.bytedance.android.live.liveinteract.match.model.PrepareBattleResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;

/* loaded from: classes14.dex */
public interface LinkBattleApi {
    @E8M("/webcast/battle/cancel/")
    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Void>> cancel(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("channel_id") long j2, @InterfaceC64985Pev("battle_id") long j3);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/battle/check_permission/")
    AbstractC73672Svk<C28467BFf<Void>> checkPermission();

    @E8M("/webcast/battle/finish/")
    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<BattleFinishResult.ResponseData>> finish(@InterfaceC64985Pev("channel_id") long j, @InterfaceC64985Pev("battle_id") long j2, @InterfaceC64985Pev("cut_short") boolean z, @InterfaceC64985Pev("other_party_left") boolean z2, @InterfaceC64985Pev("other_party_user_id") long j3, @InterfaceC64985Pev("finish_cource") String str, @InterfaceC64985Pev("finish_is_background") int i, @InterfaceC64985Pev("finish_network_quality") int i2, @InterfaceC64985Pev("finish_cur_bitrate") long j4, @InterfaceC64985Pev("finish_is_sdk") int i3);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/battle/info/")
    AbstractC73672Svk<C28467BFf<BattleInfoResponse>> getInfo(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("channel_id") long j2, @InterfaceC64986Pew("anchor_id") long j3);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/battle/info/")
    AbstractC73672Svk<C28467BFf<BattleInfoResponse>> getInfo(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("channel_id") long j2, @InterfaceC64986Pew("battle_id") long j3, @InterfaceC64986Pew("anchor_id") long j4);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/battle/info/")
    AbstractC73672Svk<C28467BFf<BattleInfoResponse>> getInfo(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("channel_id") long j2, @InterfaceC64986Pew("battle_id") long j3, @InterfaceC64986Pew("anchor_id") long j4, @InterfaceC64986Pew("scene") int i);

    @E8M("/webcast/battle/invite/")
    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<BattleInviteResult.ResponseData>> invite(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("channel_id") long j2, @InterfaceC64985Pev("target_user_id") long j3, @InterfaceC64985Pev("invite_type") int i, @InterfaceC64985Pev("gift_id") long j4);

    @E8M("/webcast/battle/open/")
    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Void>> open(@InterfaceC64985Pev("channel_id") long j, @InterfaceC64985Pev("battle_id") long j2, @InterfaceC64985Pev("duration") long j3, @InterfaceC64985Pev("actual_duration") long j4, @InterfaceC64985Pev("scene") int i);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/battle/prepare_battle/")
    AbstractC73672Svk<C28467BFf<PrepareBattleResponse.ResponseData>> prepareBattle(@InterfaceC64986Pew("channel_id") long j);

    @E8M("/webcast/battle/punish/finish/")
    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Void>> punish(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("channel_id") long j2, @InterfaceC64985Pev("cut_short") boolean z, @InterfaceC64985Pev("scene") int i, @InterfaceC64985Pev("battle_id") long j3);

    @E8M("/webcast/battle/reject/")
    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Void>> reject(@InterfaceC64985Pev("channel_id") long j, @InterfaceC64985Pev("battle_id") long j2, @InterfaceC64985Pev("invite_type") int i, @InterfaceC64985Pev("scene") int i2);
}
