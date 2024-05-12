package com.bytedance.pipo.checkout.api.network.model.request;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class InnerDistrictRequest {

    @InterfaceC65349Pkn("code")
    public final String code;

    @InterfaceC65349Pkn("geonameid")
    public final String geonameid;

    @InterfaceC65349Pkn("key")
    public final String key;

    @InterfaceC65349Pkn("language")
    public final String language;

    public static /* synthetic */ InnerDistrictRequest copy$default(InnerDistrictRequest innerDistrictRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = innerDistrictRequest.language;
        }
        if ((i & 2) != 0) {
            str2 = innerDistrictRequest.key;
        }
        if ((i & 4) != 0) {
            str3 = innerDistrictRequest.geonameid;
        }
        if ((i & 8) != 0) {
            str4 = innerDistrictRequest.code;
        }
        return innerDistrictRequest.copy(str, str2, str3, str4);
    }

    public final InnerDistrictRequest copy(String str, String key, String str2, String str3) {
        o.LJIIIZ(key, "key");
        return new InnerDistrictRequest(str, key, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerDistrictRequest)) {
            return false;
        }
        InnerDistrictRequest innerDistrictRequest = (InnerDistrictRequest) obj;
        return o.LJ(this.language, innerDistrictRequest.language) && o.LJ(this.key, innerDistrictRequest.key) && o.LJ(this.geonameid, innerDistrictRequest.geonameid) && o.LJ(this.code, innerDistrictRequest.code);
    }

    public int hashCode() {
        String str = this.language;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.key.hashCode()) * 31;
        String str2 = this.geonameid;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.code;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InnerDistrictRequest(language=");
        LIZ.append((Object) this.language);
        LIZ.append(", key=");
        LIZ.append(this.key);
        LIZ.append(", geonameid=");
        LIZ.append((Object) this.geonameid);
        LIZ.append(", code=");
        LIZ.append((Object) this.code);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Map<String, String> buildParams() {
        HashMap hashMap = new HashMap();
        if (getLanguage() != null) {
            hashMap.put("language", getLanguage());
        }
        if (getGeonameid() != null) {
            hashMap.put("geonameid", getGeonameid());
        }
        if (getCode() != null) {
            hashMap.put("code", getCode());
        }
        hashMap.put("key", getKey());
        return hashMap;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getGeonameid() {
        return this.geonameid;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLanguage() {
        return this.language;
    }

    public InnerDistrictRequest(String str, String key, String str2, String str3) {
        o.LJIIIZ(key, "key");
        this.language = str;
        this.key = key;
        this.geonameid = str2;
        this.code = str3;
    }

    public /* synthetic */ InnerDistrictRequest(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
