package com.ss.android.ugc.aweme.innerpush.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes2.dex */
public final class FrequencyStrategyPassInfo extends F9E {

    @InterfaceC65349Pkn("is_pass")
    public final boolean isPass;

    @InterfaceC65349Pkn("id")
    public final long strategyId;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.strategyId), Boolean.valueOf(this.isPass)};
    }

    public FrequencyStrategyPassInfo(long j, boolean z) {
        this.strategyId = j;
        this.isPass = z;
    }
}
