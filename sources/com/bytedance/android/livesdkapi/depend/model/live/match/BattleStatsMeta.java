package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import java.util.List;

/* loaded from: classes17.dex */
public final class BattleStatsMeta extends F9E {

    @InterfaceC65349Pkn("anchors")
    public List<User> anchors;

    @InterfaceC65349Pkn("battle_armies")
    public List<BattleArmy> battleArmies;

    @InterfaceC65349Pkn("battle_id")
    public Long battleId;

    @InterfaceC65349Pkn("battle_mode")
    public BattleMode battleMode;

    @InterfaceC65349Pkn("battle_scores")
    public List<BattleScore> battleScores;

    @InterfaceC65349Pkn("battle_settings")
    public BattleSetting battleSettings;

    @InterfaceC65349Pkn("channel_id")
    public Long channelId;

    @InterfaceC65349Pkn("channel_info")
    public ChannelInfo channelInfo;

    @InterfaceC65349Pkn("loser_id")
    public Long loserId;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.channelId;
        Long l2 = this.battleId;
        BattleMode battleMode = this.battleMode;
        BattleSetting battleSetting = this.battleSettings;
        List<BattleArmy> list = this.battleArmies;
        ChannelInfo channelInfo = this.channelInfo;
        List<BattleScore> list2 = this.battleScores;
        List<User> list3 = this.anchors;
        Long l3 = this.loserId;
        return new Object[]{l, l, l2, l2, battleMode, battleMode, battleSetting, battleSetting, list, list, list, channelInfo, channelInfo, list2, list2, list2, list3, list3, list3, l3, l3};
    }
}
