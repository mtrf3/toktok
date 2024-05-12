package com.bytedance.android.livesdk.game.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class TaskProfitInfo extends F9E {

    @InterfaceC65349Pkn("game_task")
    public BriefGameTask briefGame;

    @InterfaceC65349Pkn("profit_info")
    public ProfitInfo profitInfo;

    @Override // X.F9E
    public final Object[] getObjects() {
        BriefGameTask briefGameTask = this.briefGame;
        ProfitInfo profitInfo = this.profitInfo;
        return new Object[]{briefGameTask, briefGameTask, profitInfo, profitInfo};
    }
}
