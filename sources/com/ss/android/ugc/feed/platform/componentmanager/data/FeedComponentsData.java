package com.ss.android.ugc.feed.platform.componentmanager.data;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FeedComponentsData {

    @InterfaceC65349Pkn("1")
    public FeedComponentPriorityData componentPriorityData;

    /* JADX WARN: Multi-variable type inference failed */
    public FeedComponentsData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeedComponentsData) && o.LJ(this.componentPriorityData, ((FeedComponentsData) obj).componentPriorityData);
    }

    public final int hashCode() {
        FeedComponentPriorityData feedComponentPriorityData = this.componentPriorityData;
        if (feedComponentPriorityData == null) {
            return 0;
        }
        return feedComponentPriorityData.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedComponentsData(componentPriorityData=");
        LIZ.append(this.componentPriorityData);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public FeedComponentsData(FeedComponentPriorityData feedComponentPriorityData) {
        this.componentPriorityData = feedComponentPriorityData;
    }

    public /* synthetic */ FeedComponentsData(FeedComponentPriorityData feedComponentPriorityData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : feedComponentPriorityData);
    }
}
