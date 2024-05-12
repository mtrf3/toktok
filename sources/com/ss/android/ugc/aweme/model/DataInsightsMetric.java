package com.ss.android.ugc.aweme.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DataInsightsMetric extends F9E {

    @InterfaceC65349Pkn("value")
    public final List<DataPoint> dataPoints;

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.statusCode), this.dataPoints};
    }

    public DataInsightsMetric(int i, List<DataPoint> dataPoints) {
        o.LJIIIZ(dataPoints, "dataPoints");
        this.statusCode = i;
        this.dataPoints = dataPoints;
    }
}
