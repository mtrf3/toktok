package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.model.message.battle.BattleRewardSettle;
import com.bytedance.android.livesdk.model.message.battle.BattleTaskSettle;
import com.bytedance.android.livesdk.model.message.battle.BattleTaskStart;
import com.bytedance.android.livesdk.model.message.battle.BattleTaskUpdate;

/* loaded from: classes14.dex */
public class LinkMicBattleTaskMessage extends CR6 {

    @InterfaceC65349Pkn("task_message_type")
    public int battleTaskMessageType;

    @InterfaceC65349Pkn("reward")
    public BattleRewardSettle rewardSettle;

    @InterfaceC65349Pkn("task_settle")
    public BattleTaskSettle taskSettle;

    @InterfaceC65349Pkn("start")
    public BattleTaskStart taskStart;

    @InterfaceC65349Pkn("task_update")
    public BattleTaskUpdate taskUpdate;

    public LinkMicBattleTaskMessage() {
        this.type = EnumC31509CYf.LINK_MIC_BATTLE_TASK;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LinkMIcBattleTaskMessage{battleTaskMessageType=");
        LIZ.append(this.battleTaskMessageType);
        LIZ.append(", taskStart=");
        LIZ.append(this.taskStart);
        LIZ.append(", taskUpdate=");
        LIZ.append(this.taskUpdate);
        LIZ.append(", taskSettle=");
        LIZ.append(this.taskSettle);
        LIZ.append(", rewardSettle=");
        LIZ.append(this.rewardSettle);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }
}
