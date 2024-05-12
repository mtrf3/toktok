package com.ss.android.ugc.aweme.innerpush.api.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class InnerPushFreqControlStrategy implements Serializable {

    @InterfaceC65349Pkn("ban_strategy")
    public final InnerPushBanStrategy banStrategy;

    @InterfaceC65349Pkn("popup_limit_strategies")
    public final List<InnerPushPopupLimitStrategy> popupLimitStrategies;

    /* JADX WARN: Multi-variable type inference failed */
    public InnerPushFreqControlStrategy() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InnerPushFreqControlStrategy copy$default(InnerPushFreqControlStrategy innerPushFreqControlStrategy, List list, InnerPushBanStrategy innerPushBanStrategy, int i, Object obj) {
        if ((i & 1) != 0) {
            list = innerPushFreqControlStrategy.popupLimitStrategies;
        }
        if ((i & 2) != 0) {
            innerPushBanStrategy = innerPushFreqControlStrategy.banStrategy;
        }
        return innerPushFreqControlStrategy.copy(list, innerPushBanStrategy);
    }

    public final InnerPushFreqControlStrategy copy(List<InnerPushPopupLimitStrategy> list, InnerPushBanStrategy innerPushBanStrategy) {
        return new InnerPushFreqControlStrategy(list, innerPushBanStrategy);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerPushFreqControlStrategy)) {
            return false;
        }
        InnerPushFreqControlStrategy innerPushFreqControlStrategy = (InnerPushFreqControlStrategy) obj;
        return o.LJ(this.popupLimitStrategies, innerPushFreqControlStrategy.popupLimitStrategies) && o.LJ(this.banStrategy, innerPushFreqControlStrategy.banStrategy);
    }

    public int hashCode() {
        List<InnerPushPopupLimitStrategy> list = this.popupLimitStrategies;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        InnerPushBanStrategy innerPushBanStrategy = this.banStrategy;
        return hashCode + (innerPushBanStrategy != null ? innerPushBanStrategy.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InnerPushFreqControlStrategy(popupLimitStrategies=");
        LIZ.append(this.popupLimitStrategies);
        LIZ.append(", banStrategy=");
        LIZ.append(this.banStrategy);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final InnerPushBanStrategy getBanStrategy() {
        return this.banStrategy;
    }

    public final List<InnerPushPopupLimitStrategy> getPopupLimitStrategies() {
        return this.popupLimitStrategies;
    }

    public InnerPushFreqControlStrategy(List<InnerPushPopupLimitStrategy> list, InnerPushBanStrategy innerPushBanStrategy) {
        this.popupLimitStrategies = list;
        this.banStrategy = innerPushBanStrategy;
    }

    public /* synthetic */ InnerPushFreqControlStrategy(List list, InnerPushBanStrategy innerPushBanStrategy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : innerPushBanStrategy);
    }
}
