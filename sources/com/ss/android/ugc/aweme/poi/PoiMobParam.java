package com.ss.android.ugc.aweme.poi;

import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class PoiMobParam implements Serializable {
    public final Integer awemeType;
    public final String contentType;
    public final String creationId;
    public final String enterFrom;
    public final String enterMethod;
    public final String searchId;
    public final String shootWay;

    /* JADX WARN: Multi-variable type inference failed */
    public PoiMobParam() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PoiMobParam copy$default(PoiMobParam poiMobParam, String str, String str2, String str3, String str4, String str5, Integer num, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = poiMobParam.creationId;
        }
        if ((i & 2) != 0) {
            str2 = poiMobParam.contentType;
        }
        if ((i & 4) != 0) {
            str3 = poiMobParam.shootWay;
        }
        if ((i & 8) != 0) {
            str4 = poiMobParam.enterMethod;
        }
        if ((i & 16) != 0) {
            str5 = poiMobParam.enterFrom;
        }
        if ((i & 32) != 0) {
            num = poiMobParam.awemeType;
        }
        if ((i & 64) != 0) {
            str6 = poiMobParam.searchId;
        }
        return poiMobParam.copy(str, str2, str3, str4, str5, num, str6);
    }

    public final PoiMobParam copy(String str, String str2, String str3, String str4, String str5, Integer num, String str6) {
        return new PoiMobParam(str, str2, str3, str4, str5, num, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiMobParam)) {
            return false;
        }
        PoiMobParam poiMobParam = (PoiMobParam) obj;
        return o.LJ(this.creationId, poiMobParam.creationId) && o.LJ(this.contentType, poiMobParam.contentType) && o.LJ(this.shootWay, poiMobParam.shootWay) && o.LJ(this.enterMethod, poiMobParam.enterMethod) && o.LJ(this.enterFrom, poiMobParam.enterFrom) && o.LJ(this.awemeType, poiMobParam.awemeType) && o.LJ(this.searchId, poiMobParam.searchId);
    }

    public int hashCode() {
        String str = this.creationId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.contentType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shootWay;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.enterMethod;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.enterFrom;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.awemeType;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.searchId;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiMobParam(creationId=");
        LIZ.append(this.creationId);
        LIZ.append(", contentType=");
        LIZ.append(this.contentType);
        LIZ.append(", shootWay=");
        LIZ.append(this.shootWay);
        LIZ.append(", enterMethod=");
        LIZ.append(this.enterMethod);
        LIZ.append(", enterFrom=");
        LIZ.append(this.enterFrom);
        LIZ.append(", awemeType=");
        LIZ.append(this.awemeType);
        LIZ.append(", searchId=");
        return q.LIZIZ(LIZ, this.searchId, ')', LIZ);
    }

    public final Integer getAwemeType() {
        return this.awemeType;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final String getSearchId() {
        return this.searchId;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public PoiMobParam(String str, String str2, String str3, String str4, String str5, Integer num, String str6) {
        this.creationId = str;
        this.contentType = str2;
        this.shootWay = str3;
        this.enterMethod = str4;
        this.enterFrom = str5;
        this.awemeType = num;
        this.searchId = str6;
    }

    public /* synthetic */ PoiMobParam(String str, String str2, String str3, String str4, String str5, Integer num, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : num, (i & 64) == 0 ? str6 : null);
    }
}
