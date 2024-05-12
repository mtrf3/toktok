package com.bytedance.android.live.liveinteract.multimatch.remote.api;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.C76800UCe;
import X.E8L;
import X.E8M;
import X.EnumC29608Bjg;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.InterfaceC65131PhH;
import com.bytedance.android.livesdk.battle.model.BattleRecentContribResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiBattleFinishResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiInviteResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import webcast.api.battle.BattleAcceptResponse;
import webcast.api.battle.BattleAwardItemCardResponse;

/* loaded from: classes14.dex */
public interface MultiMatchApi {
    @E8M("/webcast/battle/accept/")
    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<BattleAcceptResponse.ResponseData>> acceptInvitePb(@InterfaceC64985Pev("battle_id") long j, @InterfaceC64985Pev("channel_id") long j2, @InterfaceC64985Pev("duration") long j3, @InterfaceC64985Pev("actual_duration") long j4, @InterfaceC64985Pev("accept_scene") int i);

    @E8M("/webcast/battle/approval_quit/")
    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<C76800UCe>> approvalQuit(@InterfaceC64985Pev("channel_id") long j, @InterfaceC64985Pev("battle_id") long j2, @InterfaceC64985Pev("action") int i);

    @E8M("/webcast/battle/award_item_card")
    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<BattleAwardItemCardResponse.ResponseData>> awardItemCard(@InterfaceC64985Pev("battle_id") long j, @InterfaceC64985Pev("channel_id") long j2, @InterfaceC64985Pev("anchor_id") long j3);

    @E8M("/webcast/battle/cancel/")
    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<C76800UCe>> cancel(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("channel_id") long j2, @InterfaceC64985Pev("battle_id") long j3, @InterfaceC64985Pev("scene") int i);

    @E8M("/webcast/battle/multi_finish/")
    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<MultiBattleFinishResponse>> multiFinishPb(@InterfaceC64985Pev("channel_id") long j, @InterfaceC64985Pev("battle_id") long j2, @InterfaceC64985Pev("cut_short_by_user") long j3, @InterfaceC64985Pev("finish_cource") String str, @InterfaceC64985Pev("finish_is_background") int i, @InterfaceC64985Pev("finish_network_quality") int i2, @InterfaceC64985Pev("finish_cur_bitrate") long j4, @InterfaceC64985Pev("finish_is_sdk") int i3);

    @E8M("/webcast/battle/multi_invite/")
    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<MultiInviteResponse>> multiInvitePb(@InterfaceC64985Pev("channel_id") long j, @InterfaceC64985Pev("invite_type") int i, @InterfaceC64985Pev("teammate_users") String str, @InterfaceC64985Pev("rival_users") String str2, @InterfaceC64985Pev("gift_id") long j2);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/battle/prepare_multi_battle/")
    AbstractC73672Svk<C28467BFf<MultiMatchPrepareResponse>> prepareMultiMatchPb(@InterfaceC64986Pew("channel_id") long j);

    @E8M("/webcast/battle/quit/")
    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<C76800UCe>> quit(@InterfaceC64985Pev("battle_id") long j, @InterfaceC64985Pev("channel_id") long j2);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/battle/recent_contribution/")
    AbstractC73672Svk<C28467BFf<BattleRecentContribResponse.ResponseData>> recentContribution(@InterfaceC64986Pew("channel_id") long j, @InterfaceC64986Pew("battle_id") long j2);
}
