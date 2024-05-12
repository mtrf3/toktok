package com.ss.android.ugc.aweme.poi.map;

import X.C15890jp;
import X.X1D;
import com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class LocationDetailMobParam implements Serializable {
    public final String authorId;
    public final PoiAnchorData data;
    public final String enterMethod;
    public final String entranceEnterMethod;
    public final String entranceEnterPage;
    public final String groupId;
    public final String logPb;
    public final String previousPage;
    public final Map<String, String> searchParams;

    /* JADX WARN: Multi-variable type inference failed */
    public LocationDetailMobParam() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LocationDetailMobParam copy$default(LocationDetailMobParam locationDetailMobParam, PoiAnchorData poiAnchorData, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            poiAnchorData = locationDetailMobParam.data;
        }
        if ((i & 2) != 0) {
            str = locationDetailMobParam.enterMethod;
        }
        if ((i & 4) != 0) {
            str2 = locationDetailMobParam.entranceEnterMethod;
        }
        if ((i & 8) != 0) {
            str3 = locationDetailMobParam.entranceEnterPage;
        }
        if ((i & 16) != 0) {
            str4 = locationDetailMobParam.groupId;
        }
        if ((i & 32) != 0) {
            str5 = locationDetailMobParam.authorId;
        }
        if ((i & 64) != 0) {
            str6 = locationDetailMobParam.logPb;
        }
        if ((i & 128) != 0) {
            str7 = locationDetailMobParam.previousPage;
        }
        if ((i & 256) != 0) {
            map = locationDetailMobParam.searchParams;
        }
        return locationDetailMobParam.copy(poiAnchorData, str, str2, str3, str4, str5, str6, str7, map);
    }

    public final LocationDetailMobParam copy(PoiAnchorData poiAnchorData, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map<String, String> map) {
        return new LocationDetailMobParam(poiAnchorData, str, str2, str3, str4, str5, str6, str7, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationDetailMobParam)) {
            return false;
        }
        LocationDetailMobParam locationDetailMobParam = (LocationDetailMobParam) obj;
        return o.LJ(this.data, locationDetailMobParam.data) && o.LJ(this.enterMethod, locationDetailMobParam.enterMethod) && o.LJ(this.entranceEnterMethod, locationDetailMobParam.entranceEnterMethod) && o.LJ(this.entranceEnterPage, locationDetailMobParam.entranceEnterPage) && o.LJ(this.groupId, locationDetailMobParam.groupId) && o.LJ(this.authorId, locationDetailMobParam.authorId) && o.LJ(this.logPb, locationDetailMobParam.logPb) && o.LJ(this.previousPage, locationDetailMobParam.previousPage) && o.LJ(this.searchParams, locationDetailMobParam.searchParams);
    }

    public int hashCode() {
        PoiAnchorData poiAnchorData = this.data;
        int hashCode = (poiAnchorData == null ? 0 : poiAnchorData.hashCode()) * 31;
        String str = this.enterMethod;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.entranceEnterMethod;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.entranceEnterPage;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.groupId;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.authorId;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.logPb;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.previousPage;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map<String, String> map = this.searchParams;
        return hashCode8 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocationDetailMobParam(data=");
        LIZ.append(this.data);
        LIZ.append(", enterMethod=");
        LIZ.append(this.enterMethod);
        LIZ.append(", entranceEnterMethod=");
        LIZ.append(this.entranceEnterMethod);
        LIZ.append(", entranceEnterPage=");
        LIZ.append(this.entranceEnterPage);
        LIZ.append(", groupId=");
        LIZ.append(this.groupId);
        LIZ.append(", authorId=");
        LIZ.append(this.authorId);
        LIZ.append(", logPb=");
        LIZ.append(this.logPb);
        LIZ.append(", previousPage=");
        LIZ.append(this.previousPage);
        LIZ.append(", searchParams=");
        return C15890jp.LIZ(LIZ, this.searchParams, ')', LIZ);
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final PoiAnchorData getData() {
        return this.data;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final String getEntranceEnterMethod() {
        return this.entranceEnterMethod;
    }

    public final String getEntranceEnterPage() {
        return this.entranceEnterPage;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getLogPb() {
        return this.logPb;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final Map<String, String> getSearchParams() {
        return this.searchParams;
    }

    public LocationDetailMobParam(PoiAnchorData poiAnchorData, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map<String, String> map) {
        this.data = poiAnchorData;
        this.enterMethod = str;
        this.entranceEnterMethod = str2;
        this.entranceEnterPage = str3;
        this.groupId = str4;
        this.authorId = str5;
        this.logPb = str6;
        this.previousPage = str7;
        this.searchParams = map;
    }

    public /* synthetic */ LocationDetailMobParam(PoiAnchorData poiAnchorData, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : poiAnchorData, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) == 0 ? map : null);
    }
}
