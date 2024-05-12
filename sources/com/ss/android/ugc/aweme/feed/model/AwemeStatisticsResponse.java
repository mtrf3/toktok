package com.ss.android.ugc.aweme.feed.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class AwemeStatisticsResponse implements Serializable {

    @InterfaceC65349Pkn("status_msg")
    public String message;

    @InterfaceC65349Pkn("statistics_list")
    public List<AwemeStatisticsBackup> statisticsList;

    @InterfaceC65349Pkn("status_code")
    public Integer status = 0;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AwemeStatisticsResponse(status=");
        LIZ.append(this.status);
        LIZ.append(", message=");
        LIZ.append(this.message);
        LIZ.append(", statisticsList=");
        return C1NE.LIZIZ(LIZ, this.statisticsList, ')', LIZ);
    }

    public final String getMessage() {
        return this.message;
    }

    public final List<AwemeStatisticsBackup> getStatisticsList() {
        return this.statisticsList;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatisticsList(List<AwemeStatisticsBackup> list) {
        this.statisticsList = list;
    }

    public final void setStatus(Integer num) {
        this.status = num;
    }
}
