package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class NeedPointStruct implements Serializable {

    @InterfaceC65349Pkn("point_type")
    public int pointType;

    @InterfaceC65349Pkn("time_stamp")
    public long timeStamp;

    public final int getPointType() {
        return this.pointType;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final void setPointType(int i) {
        this.pointType = i;
    }

    public final void setTimeStamp(long j) {
        this.timeStamp = j;
    }
}
