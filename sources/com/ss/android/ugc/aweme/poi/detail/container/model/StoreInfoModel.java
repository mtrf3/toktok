package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoreInfoModel implements Serializable {

    @InterfaceC65349Pkn("opening_time_loss_back_up_info")
    public final String backUpInfo;

    @InterfaceC65349Pkn("opening_end_time")
    public final String endTime;

    @InterfaceC65349Pkn("OpeningHoursForPoiDetail")
    public final String openingHoursForPoiDetail;

    @InterfaceC65349Pkn("opening_status")
    public final boolean openingStatus;

    @InterfaceC65349Pkn("shutdown_info")
    public final String shutdownInfo;

    @InterfaceC65349Pkn("opening_start_time")
    public final String startTime;

    public static /* synthetic */ StoreInfoModel copy$default(StoreInfoModel storeInfoModel, boolean z, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = storeInfoModel.openingStatus;
        }
        if ((i & 2) != 0) {
            str = storeInfoModel.startTime;
        }
        if ((i & 4) != 0) {
            str2 = storeInfoModel.endTime;
        }
        if ((i & 8) != 0) {
            str3 = storeInfoModel.shutdownInfo;
        }
        if ((i & 16) != 0) {
            str4 = storeInfoModel.backUpInfo;
        }
        if ((i & 32) != 0) {
            str5 = storeInfoModel.openingHoursForPoiDetail;
        }
        return storeInfoModel.copy(z, str, str2, str3, str4, str5);
    }

    public final StoreInfoModel copy(boolean z, String str, String str2, String str3, String str4, String str5) {
        return new StoreInfoModel(z, str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreInfoModel)) {
            return false;
        }
        StoreInfoModel storeInfoModel = (StoreInfoModel) obj;
        return this.openingStatus == storeInfoModel.openingStatus && o.LJ(this.startTime, storeInfoModel.startTime) && o.LJ(this.endTime, storeInfoModel.endTime) && o.LJ(this.shutdownInfo, storeInfoModel.shutdownInfo) && o.LJ(this.backUpInfo, storeInfoModel.backUpInfo) && o.LJ(this.openingHoursForPoiDetail, storeInfoModel.openingHoursForPoiDetail);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    public int hashCode() {
        boolean z = this.openingStatus;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.startTime;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.endTime;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shutdownInfo;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.backUpInfo;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.openingHoursForPoiDetail;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoreInfoModel(openingStatus=");
        LIZ.append(this.openingStatus);
        LIZ.append(", startTime=");
        LIZ.append(this.startTime);
        LIZ.append(", endTime=");
        LIZ.append(this.endTime);
        LIZ.append(", shutdownInfo=");
        LIZ.append(this.shutdownInfo);
        LIZ.append(", backUpInfo=");
        LIZ.append(this.backUpInfo);
        LIZ.append(", openingHoursForPoiDetail=");
        return q.LIZIZ(LIZ, this.openingHoursForPoiDetail, ')', LIZ);
    }

    public final String getBackUpInfo() {
        return this.backUpInfo;
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final String getOpeningHoursForPoiDetail() {
        return this.openingHoursForPoiDetail;
    }

    public final boolean getOpeningStatus() {
        return this.openingStatus;
    }

    public final String getShutdownInfo() {
        return this.shutdownInfo;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public StoreInfoModel(boolean z, String str, String str2, String str3, String str4, String str5) {
        this.openingStatus = z;
        this.startTime = str;
        this.endTime = str2;
        this.shutdownInfo = str3;
        this.backUpInfo = str4;
        this.openingHoursForPoiDetail = str5;
    }

    public /* synthetic */ StoreInfoModel(boolean z, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, str, str2, str3, str4, str5);
    }
}
