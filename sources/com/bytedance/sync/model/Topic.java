package com.bytedance.sync.model;

import X.C77800Ug8;
import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;

/* loaded from: classes12.dex */
public class Topic {

    @InterfaceC65349Pkn("business")
    public final long business;

    @InterfaceC65349Pkn("deviceid")
    public String did;

    @InterfaceC65349Pkn("topic")
    public final String topic;

    @InterfaceC65349Pkn("secuid")
    public String uid;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Topic{topic='");
        Q89.LIZIZ(LIZ, this.topic, '\'', ", business=");
        LIZ.append(this.business);
        LIZ.append(", did='");
        Q89.LIZIZ(LIZ, this.did, '\'', ", uid='");
        return C77800Ug8.LIZJ(LIZ, this.uid, '\'', '}', LIZ);
    }

    public Topic(String str, long j) {
        this.topic = str;
        this.business = j;
    }
}
