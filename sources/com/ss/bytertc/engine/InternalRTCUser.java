package com.ss.bytertc.engine;

import X.X1D;

/* loaded from: classes33.dex */
public class InternalRTCUser {
    public String metaData;
    public String userId;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InternalRtcUser{userId='");
        LIZ.append(this.userId);
        LIZ.append('\'');
        LIZ.append(", metaData='");
        LIZ.append(this.metaData);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public InternalRTCUser(String str, String str2) {
        this.userId = str;
        this.metaData = str2;
    }

    public static InternalRTCUser create(String str, String str2) {
        return new InternalRTCUser(str, str2);
    }
}
