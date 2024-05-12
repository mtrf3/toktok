package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public final class ChijiResult extends F9E {

    @InterfaceC65349Pkn("bonus")
    public Long bonus;

    @InterfaceC65349Pkn("time_str")
    public String timeStr;

    @InterfaceC65349Pkn("winning_streak")
    public Long winningStreak;

    @Override // X.F9E
    public final Object[] getObjects() {
        String str = this.timeStr;
        Long l = this.winningStreak;
        Long l2 = this.bonus;
        return new Object[]{str, str, l, l, l2, l2};
    }
}
