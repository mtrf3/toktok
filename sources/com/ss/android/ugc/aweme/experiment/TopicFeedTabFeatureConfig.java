package com.ss.android.ugc.aweme.experiment;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TopicFeedTabFeatureConfig extends F9E {

    @InterfaceC65349Pkn("tabs")
    public final List<TopicFeedTabConfig> tabs;

    public TopicFeedTabFeatureConfig() {
        this(null, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.tabs};
    }

    public TopicFeedTabFeatureConfig(List<TopicFeedTabConfig> tabs) {
        o.LJIIIZ(tabs, "tabs");
        this.tabs = tabs;
    }

    public TopicFeedTabFeatureConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list);
    }
}
