package com.bytedance.im.core.client;

import X.C08380Uo;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class ReportDBInfoConfig implements Serializable {

    @InterfaceC65349Pkn("enable")
    public int enable;

    @InterfaceC65349Pkn("report_duration_days")
    public int reportDurationDays = 1;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReportDBInfoConfig{enable:");
        LIZ.append(this.enable);
        LIZ.append(", reportDurationDays:");
        return C08380Uo.LIZ(LIZ, this.reportDurationDays, "}", LIZ);
    }
}
