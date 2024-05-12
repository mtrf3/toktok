package com.ss.android.ugc.aweme.ml.ab;

import X.InterfaceC65349Pkn;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SmartFeedLoadMoreStrategyConfig {

    @InterfaceC65349Pkn("default")
    public int defaultIndex;

    @InterfaceC65349Pkn("label_index_mapping")
    public List<String> labelIndexMapping;

    @InterfaceC65349Pkn("plan")
    public List<FeedLoadMorePlan> plans;

    public final int getDefaultIndex() {
        return this.defaultIndex;
    }

    public final List<String> getLabelIndexMapping() {
        return this.labelIndexMapping;
    }

    public final List<FeedLoadMorePlan> getPlans() {
        return this.plans;
    }

    public final FeedLoadMorePlan getPlan(String label) {
        int indexOf;
        o.LJIIIZ(label, "label");
        List<FeedLoadMorePlan> list = this.plans;
        List<String> list2 = this.labelIndexMapping;
        if (list != null && list2 != null && (indexOf = list2.indexOf(label)) >= 0 && indexOf < list.size()) {
            return (FeedLoadMorePlan) ListProtector.get(list, indexOf);
        }
        return null;
    }

    public final void setDefaultIndex(int i) {
        this.defaultIndex = i;
    }

    public final void setLabelIndexMapping(List<String> list) {
        this.labelIndexMapping = list;
    }

    public final void setPlans(List<FeedLoadMorePlan> list) {
        this.plans = list;
    }
}
