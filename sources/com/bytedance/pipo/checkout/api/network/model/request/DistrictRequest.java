package com.bytedance.pipo.checkout.api.network.model.request;

import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class DistrictRequest {
    public final String code;
    public final String geonameid;
    public final String language;

    /* JADX WARN: Multi-variable type inference failed */
    public DistrictRequest() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DistrictRequest copy$default(DistrictRequest districtRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = districtRequest.language;
        }
        if ((i & 2) != 0) {
            str2 = districtRequest.geonameid;
        }
        if ((i & 4) != 0) {
            str3 = districtRequest.code;
        }
        return districtRequest.copy(str, str2, str3);
    }

    public final DistrictRequest copy(String str, String str2, String str3) {
        return new DistrictRequest(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistrictRequest)) {
            return false;
        }
        DistrictRequest districtRequest = (DistrictRequest) obj;
        return o.LJ(this.language, districtRequest.language) && o.LJ(this.geonameid, districtRequest.geonameid) && o.LJ(this.code, districtRequest.code);
    }

    public int hashCode() {
        String str = this.language;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.geonameid;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.code;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DistrictRequest(language=");
        LIZ.append((Object) this.language);
        LIZ.append(", geonameid=");
        LIZ.append((Object) this.geonameid);
        LIZ.append(", code=");
        LIZ.append((Object) this.code);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getGeonameid() {
        return this.geonameid;
    }

    public final String getLanguage() {
        return this.language;
    }

    public DistrictRequest(String str, String str2, String str3) {
        this.language = str;
        this.geonameid = str2;
        this.code = str3;
    }

    public /* synthetic */ DistrictRequest(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
