package com.ss.android.ugc.aweme.topic.trendingtopic.api;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.trendingtopic.VideoTrendingTopic;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BillboardInfo {

    @InterfaceC65349Pkn("event_info")
    public final List<VideoTrendingTopic> topics;

    @InterfaceC65349Pkn("billboard_type")
    public final Integer type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillboardInfo)) {
            return false;
        }
        BillboardInfo billboardInfo = (BillboardInfo) obj;
        return o.LJ(this.type, billboardInfo.type) && o.LJ(this.topics, billboardInfo.topics);
    }

    public final int hashCode() {
        Integer num = this.type;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<VideoTrendingTopic> list = this.topics;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BillboardInfo(type=");
        LIZ.append(this.type);
        LIZ.append(", topics=");
        return C1NE.LIZIZ(LIZ, this.topics, ')', LIZ);
    }

    public BillboardInfo(Integer num, List<VideoTrendingTopic> list) {
        this.type = num;
        this.topics = list;
    }
}
