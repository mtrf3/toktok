package com.ss.ugc.effectplatform.model.net;

import com.ss.ugc.effectplatform.model.Effect;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class QueryCustomizedEffectsData {
    public List<? extends Effect> effects;
    public List<String> url_prefix;
    public List<String> url_prefix2;

    /* JADX WARN: Multi-variable type inference failed */
    public QueryCustomizedEffectsData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final List<Effect> getEffects() {
        return this.effects;
    }

    public final List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public final List<String> getUrl_prefix2() {
        return this.url_prefix2;
    }

    public final void setEffects(List<? extends Effect> list) {
        this.effects = list;
    }

    public final void setUrl_prefix(List<String> list) {
        this.url_prefix = list;
    }

    public final void setUrl_prefix2(List<String> list) {
        this.url_prefix2 = list;
    }

    public QueryCustomizedEffectsData(List<String> list, List<String> list2, List<? extends Effect> list3) {
        this.url_prefix = list;
        this.url_prefix2 = list2;
        this.effects = list3;
    }

    public /* synthetic */ QueryCustomizedEffectsData(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3);
    }
}
