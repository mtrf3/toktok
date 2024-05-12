package com.ss.android.ugc.aweme.ml.ab;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;

/* loaded from: classes2.dex */
public class SmartDataTrackConfig {

    @InterfaceC65349Pkn("configs")
    public List<OneSmartDataTrackConfig> configList;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SmartDataTrackConfig{configList=");
        return C1NE.LIZIZ(LIZ, this.configList, '}', LIZ);
    }

    public final List<OneSmartDataTrackConfig> getConfigList() {
        return this.configList;
    }

    public final void setConfigList(List<OneSmartDataTrackConfig> list) {
        this.configList = list;
    }
}
