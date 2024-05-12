package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class DiversionData {

    @InterfaceC65349Pkn("da_params")
    public final DaParams daParams;

    @InterfaceC65349Pkn("diversion_id")
    public final String diversionId;

    @InterfaceC65349Pkn("diversion_entrance_name")
    public final String entranceName;

    @InterfaceC65349Pkn("diversion_entrance_resources")
    public final List<DiversionEntranceRes> entranceResources;

    @InterfaceC65349Pkn("show_count")
    public final Integer showCount;

    @InterfaceC65349Pkn("diversion_target_name")
    public final String targetName;

    @InterfaceC65349Pkn("diversion_target_resources")
    public final List<DiversionTargetRes> targetResources;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DiversionData copy$default(DiversionData diversionData, String str, List list, String str2, List list2, Integer num, DaParams daParams, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = diversionData.entranceName;
        }
        if ((i & 2) != 0) {
            list = diversionData.entranceResources;
        }
        if ((i & 4) != 0) {
            str2 = diversionData.targetName;
        }
        if ((i & 8) != 0) {
            list2 = diversionData.targetResources;
        }
        if ((i & 16) != 0) {
            num = diversionData.showCount;
        }
        if ((i & 32) != 0) {
            daParams = diversionData.daParams;
        }
        if ((i & 64) != 0) {
            str3 = diversionData.diversionId;
        }
        return diversionData.copy(str, list, str2, list2, num, daParams, str3);
    }

    public final DiversionData copy(String str, List<DiversionEntranceRes> list, String str2, List<DiversionTargetRes> list2, Integer num, DaParams daParams, String str3) {
        return new DiversionData(str, list, str2, list2, num, daParams, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiversionData)) {
            return false;
        }
        DiversionData diversionData = (DiversionData) obj;
        return o.LJ(this.entranceName, diversionData.entranceName) && o.LJ(this.entranceResources, diversionData.entranceResources) && o.LJ(this.targetName, diversionData.targetName) && o.LJ(this.targetResources, diversionData.targetResources) && o.LJ(this.showCount, diversionData.showCount) && o.LJ(this.daParams, diversionData.daParams) && o.LJ(this.diversionId, diversionData.diversionId);
    }

    public int hashCode() {
        String str = this.entranceName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<DiversionEntranceRes> list = this.entranceResources;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.targetName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<DiversionTargetRes> list2 = this.targetResources;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.showCount;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        DaParams daParams = this.daParams;
        int hashCode6 = (hashCode5 + (daParams == null ? 0 : daParams.hashCode())) * 31;
        String str3 = this.diversionId;
        return hashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DiversionData(entranceName=");
        LIZ.append(this.entranceName);
        LIZ.append(", entranceResources=");
        LIZ.append(this.entranceResources);
        LIZ.append(", targetName=");
        LIZ.append(this.targetName);
        LIZ.append(", targetResources=");
        LIZ.append(this.targetResources);
        LIZ.append(", showCount=");
        LIZ.append(this.showCount);
        LIZ.append(", daParams=");
        LIZ.append(this.daParams);
        LIZ.append(", diversionId=");
        return q.LIZIZ(LIZ, this.diversionId, ')', LIZ);
    }

    public final DaParams getDaParams() {
        return this.daParams;
    }

    public final String getDiversionId() {
        return this.diversionId;
    }

    public final String getEntranceName() {
        return this.entranceName;
    }

    public final List<DiversionEntranceRes> getEntranceResources() {
        return this.entranceResources;
    }

    public final Integer getShowCount() {
        return this.showCount;
    }

    public final String getTargetName() {
        return this.targetName;
    }

    public final List<DiversionTargetRes> getTargetResources() {
        return this.targetResources;
    }

    public DiversionData(String str, List<DiversionEntranceRes> list, String str2, List<DiversionTargetRes> list2, Integer num, DaParams daParams, String str3) {
        this.entranceName = str;
        this.entranceResources = list;
        this.targetName = str2;
        this.targetResources = list2;
        this.showCount = num;
        this.daParams = daParams;
        this.diversionId = str3;
    }
}
