package com.ss.android.ugc.aweme.search.pages.result.bot.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class PollingInfoData implements Serializable {
    public static final int $stable = 8;

    @InterfaceC65349Pkn("polling")
    public final PollingInfo polling;

    @InterfaceC65349Pkn("tikbot")
    public final TakoInfo tikbot;

    @InterfaceC65349Pkn("type")
    public final Integer type;

    /* JADX WARN: Multi-variable type inference failed */
    public PollingInfoData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PollingInfoData copy$default(PollingInfoData pollingInfoData, PollingInfo pollingInfo, TakoInfo takoInfo, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            pollingInfo = pollingInfoData.polling;
        }
        if ((i & 2) != 0) {
            takoInfo = pollingInfoData.tikbot;
        }
        if ((i & 4) != 0) {
            num = pollingInfoData.type;
        }
        return pollingInfoData.copy(pollingInfo, takoInfo, num);
    }

    public final PollingInfoData copy(PollingInfo pollingInfo, TakoInfo takoInfo, Integer num) {
        return new PollingInfoData(pollingInfo, takoInfo, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollingInfoData)) {
            return false;
        }
        PollingInfoData pollingInfoData = (PollingInfoData) obj;
        return o.LJ(this.polling, pollingInfoData.polling) && o.LJ(this.tikbot, pollingInfoData.tikbot) && o.LJ(this.type, pollingInfoData.type);
    }

    public int hashCode() {
        PollingInfo pollingInfo = this.polling;
        int hashCode = (pollingInfo == null ? 0 : pollingInfo.hashCode()) * 31;
        TakoInfo takoInfo = this.tikbot;
        int hashCode2 = (hashCode + (takoInfo == null ? 0 : takoInfo.hashCode())) * 31;
        Integer num = this.type;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PollingInfoData(polling=");
        LIZ.append(this.polling);
        LIZ.append(", tikbot=");
        LIZ.append(this.tikbot);
        LIZ.append(", type=");
        return s0.LIZJ(LIZ, this.type, ')', LIZ);
    }

    public final PollingInfo getPolling() {
        return this.polling;
    }

    public final TakoInfo getTikbot() {
        return this.tikbot;
    }

    public final Integer getType() {
        return this.type;
    }

    public PollingInfoData(PollingInfo pollingInfo, TakoInfo takoInfo, Integer num) {
        this.polling = pollingInfo;
        this.tikbot = takoInfo;
        this.type = num;
    }

    public /* synthetic */ PollingInfoData(PollingInfo pollingInfo, TakoInfo takoInfo, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : pollingInfo, (i & 2) != 0 ? null : takoInfo, (i & 4) != 0 ? -1 : num);
    }
}
