package com.ss.android.ugc.aweme.ml.ab;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;

/* loaded from: classes2.dex */
public class SmartPlaytimePredictConfig {

    @InterfaceC65349Pkn("services")
    public List<OnePlaytimePredictConfig> serviceList;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{serviceList=");
        return C1NE.LIZIZ(LIZ, this.serviceList, '}', LIZ);
    }

    public final List<OnePlaytimePredictConfig> getServiceList() {
        return this.serviceList;
    }

    public final void setServiceList(List<OnePlaytimePredictConfig> list) {
        this.serviceList = list;
    }
}
