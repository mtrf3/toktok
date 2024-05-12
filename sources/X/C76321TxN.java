package X;

import com.bytedance.android.livesdk.model.message.battle.BattleUserArmies;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUserArmies;

/* renamed from: X.TxN, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76321TxN {
    public static void LIZ(BattleTeamUserArmies battleTeamUserArmies, boolean z) {
        C19660pu.LIZ("livesdk_battle_data_changed", C113554cx.LJJL(new OSZ("match_type", "team"), new OSZ("is_cur_Team", Integer.valueOf(z ? 1 : 0))), battleTeamUserArmies);
    }

    public static void LIZIZ(BattleUserArmies battleUserArmies, boolean z) {
        C19660pu.LIZ("livesdk_battle_data_changed", C113554cx.LJJL(new OSZ("match_type", "single"), new OSZ("is_cur_host", Integer.valueOf(z ? 1 : 0))), battleUserArmies);
    }
}
