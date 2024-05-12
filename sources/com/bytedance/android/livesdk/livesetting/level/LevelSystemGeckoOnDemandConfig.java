package com.bytedance.android.livesdk.livesetting.level;

import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LevelSystemGeckoOnDemandConfig {

    @InterfaceC65349Pkn("delay_time")
    public int delayTime;

    @InterfaceC65349Pkn("channel_list")
    public List<String> onDemandChannelList;

    /* JADX WARN: Multi-variable type inference failed */
    public LevelSystemGeckoOnDemandConfig() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public LevelSystemGeckoOnDemandConfig(int i, List<String> list) {
        this.delayTime = i;
        this.onDemandChannelList = list;
    }

    public /* synthetic */ LevelSystemGeckoOnDemandConfig(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : list);
    }
}
