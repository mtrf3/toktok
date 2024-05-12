package com.bytedance.android.live.liveinteract.match.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmies;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import java.util.Map;

/* loaded from: classes14.dex */
public final class BattleFinishResult extends F9E {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes14.dex */
    public static final class ResponseData extends F9E {

        @InterfaceC65349Pkn("anchors_info")
        public Map<Long, BattleUserInfo> anchorsInfo;

        @InterfaceC65349Pkn("armies")
        public Map<Long, BattleUserArmies> armies;

        @InterfaceC65349Pkn("battle_combo_v2")
        public Map<Long, BattleComboInfo> battleComboV2;

        @InterfaceC65349Pkn("battle_result")
        public Map<Long, BattleResult> battleResult;

        @InterfaceC65349Pkn("battle_settings")
        public BattleSetting battleSettings;

        @Override // X.F9E
        public final Object[] getObjects() {
            Map<Long, BattleResult> map = this.battleResult;
            Map<Long, BattleUserArmies> map2 = this.armies;
            Map<Long, BattleUserInfo> map3 = this.anchorsInfo;
            Map<Long, BattleComboInfo> map4 = this.battleComboV2;
            return new Object[]{map, map, map, map2, map2, map2, map3, map3, map3, map4, map4, map4};
        }
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        ResponseData responseData = this.data;
        return new Object[]{responseData, responseData};
    }
}
