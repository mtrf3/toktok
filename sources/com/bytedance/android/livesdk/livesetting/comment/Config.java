package com.bytedance.android.livesdk.livesetting.comment;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class Config {

    @InterfaceC65349Pkn("is_strategy_enable")
    public boolean isStrategyEnable;

    @InterfaceC65349Pkn("strategy_num")
    public int strategyOpt;

    /* JADX WARN: Multi-variable type inference failed */
    public Config() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public Config(boolean z, int i) {
        this.isStrategyEnable = z;
        this.strategyOpt = i;
    }

    public /* synthetic */ Config(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i);
    }
}
