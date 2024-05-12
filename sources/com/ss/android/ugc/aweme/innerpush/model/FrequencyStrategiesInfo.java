package com.ss.android.ugc.aweme.innerpush.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FrequencyStrategiesInfo extends F9E {

    @InterfaceC65349Pkn("ban")
    public final List<FrequencyStrategyPassInfo> banInfo;

    @InterfaceC65349Pkn("popup")
    public final List<FrequencyStrategyPassInfo> popupInfo;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.popupInfo, this.banInfo};
    }

    public FrequencyStrategiesInfo(List<FrequencyStrategyPassInfo> popupInfo, List<FrequencyStrategyPassInfo> banInfo) {
        o.LJIIIZ(popupInfo, "popupInfo");
        o.LJIIIZ(banInfo, "banInfo");
        this.popupInfo = popupInfo;
        this.banInfo = banInfo;
    }
}
