package com.byted.cast.common.discovery;

import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes29.dex */
public final class BuriPointInfo {
    public boolean browseStarted;
    public boolean resultFound;
    public String serviceType;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BuriPointInfo(serviceType='");
        LIZ.append(this.serviceType);
        LIZ.append("', browseStarted=");
        LIZ.append(this.browseStarted);
        LIZ.append(", resultFound=");
        LIZ.append(this.resultFound);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getServiceType() {
        return this.serviceType;
    }

    public BuriPointInfo(String serviceType) {
        o.LJIIJ(serviceType, "serviceType");
        this.serviceType = serviceType;
    }

    public final void setServiceType(String str) {
        o.LJIIJ(str, "<set-?>");
        this.serviceType = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuriPointInfo(String serviceType, boolean z, boolean z2) {
        this(serviceType);
        o.LJIIJ(serviceType, "serviceType");
        this.browseStarted = z;
        this.resultFound = z2;
    }
}
