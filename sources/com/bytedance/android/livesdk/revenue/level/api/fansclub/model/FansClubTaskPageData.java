package com.bytedance.android.livesdk.revenue.level.api.fansclub.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;
import tikcast.api.privilege.FansGetTaskInfoResponse;
import webcast.data.FansLevelInfo;

/* loaded from: classes6.dex */
public final class FansClubTaskPageData {

    @InterfaceC65349Pkn("last_level_info")
    public final FansLevelInfo lastLevelInfo;

    @InterfaceC65349Pkn("data")
    public final FansGetTaskInfoResponse.Data taskInfoData;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FansClubTaskPageData)) {
            return false;
        }
        FansClubTaskPageData fansClubTaskPageData = (FansClubTaskPageData) obj;
        return o.LJ(this.lastLevelInfo, fansClubTaskPageData.lastLevelInfo) && o.LJ(this.taskInfoData, fansClubTaskPageData.taskInfoData);
    }

    public final int hashCode() {
        FansLevelInfo fansLevelInfo = this.lastLevelInfo;
        int hashCode = (fansLevelInfo == null ? 0 : fansLevelInfo.hashCode()) * 31;
        FansGetTaskInfoResponse.Data data = this.taskInfoData;
        return hashCode + (data != null ? data.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FansClubTaskPageData(lastLevelInfo=");
        LIZ.append(this.lastLevelInfo);
        LIZ.append(", taskInfoData=");
        LIZ.append(this.taskInfoData);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public FansClubTaskPageData(FansLevelInfo fansLevelInfo, FansGetTaskInfoResponse.Data data) {
        this.lastLevelInfo = fansLevelInfo;
        this.taskInfoData = data;
    }
}
