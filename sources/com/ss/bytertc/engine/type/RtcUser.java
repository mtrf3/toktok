package com.ss.bytertc.engine.type;

import X.X1D;
import com.ss.bytertc.engine.InternalRTCUser;

/* loaded from: classes33.dex */
public class RtcUser {
    public String metaData;
    public String userId;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RtcUser{uid='");
        LIZ.append(this.userId);
        LIZ.append('\'');
        LIZ.append(", metaData='");
        LIZ.append(this.metaData);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public RtcUser() {
    }

    public RtcUser(InternalRTCUser internalRTCUser) {
        this.userId = internalRTCUser.userId;
        this.metaData = internalRTCUser.metaData;
    }
}
