package com.ss.android.ugc.aweme.feed.model.commercialize;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public final class CommerceSmartUIStrategyConfig implements Serializable {

    @InterfaceC65349Pkn("default")
    public int defaultIndex;

    @InterfaceC65349Pkn("lable_index_mapping")
    public List<String> lableIndexMapping;

    @InterfaceC65349Pkn("plan")
    public PlanConfig[] plans;

    public final int getDefaultIndex() {
        return this.defaultIndex;
    }

    public final List<String> getLableIndexMapping() {
        return this.lableIndexMapping;
    }

    public final PlanConfig[] getPlans() {
        return this.plans;
    }

    public final void setDefaultIndex(int i) {
        this.defaultIndex = i;
    }

    public final void setLableIndexMapping(List<String> list) {
        this.lableIndexMapping = list;
    }

    public final void setPlans(PlanConfig[] planConfigArr) {
        this.plans = planConfigArr;
    }
}
