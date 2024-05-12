package com.bytedance.pipo.checkout.api.network.model.request;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class InnerPlaceDetailRequest {

    @InterfaceC65349Pkn("country_code")
    public final String countryCode;

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("key")
    public final String key;

    @InterfaceC65349Pkn("language")
    public final String language;

    @InterfaceC65349Pkn("session_key")
    public final String sessionKey;

    public static /* synthetic */ InnerPlaceDetailRequest copy$default(InnerPlaceDetailRequest innerPlaceDetailRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = innerPlaceDetailRequest.id;
        }
        if ((i & 2) != 0) {
            str2 = innerPlaceDetailRequest.language;
        }
        if ((i & 4) != 0) {
            str3 = innerPlaceDetailRequest.sessionKey;
        }
        if ((i & 8) != 0) {
            str4 = innerPlaceDetailRequest.countryCode;
        }
        if ((i & 16) != 0) {
            str5 = innerPlaceDetailRequest.key;
        }
        return innerPlaceDetailRequest.copy(str, str2, str3, str4, str5);
    }

    public final InnerPlaceDetailRequest copy(String str, String str2, String str3, String str4, String key) {
        o.LJIIIZ(key, "key");
        return new InnerPlaceDetailRequest(str, str2, str3, str4, key);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerPlaceDetailRequest)) {
            return false;
        }
        InnerPlaceDetailRequest innerPlaceDetailRequest = (InnerPlaceDetailRequest) obj;
        return o.LJ(this.id, innerPlaceDetailRequest.id) && o.LJ(this.language, innerPlaceDetailRequest.language) && o.LJ(this.sessionKey, innerPlaceDetailRequest.sessionKey) && o.LJ(this.countryCode, innerPlaceDetailRequest.countryCode) && o.LJ(this.key, innerPlaceDetailRequest.key);
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.language;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sessionKey;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.countryCode;
        return ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.key.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InnerPlaceDetailRequest(id=");
        LIZ.append((Object) this.id);
        LIZ.append(", language=");
        LIZ.append((Object) this.language);
        LIZ.append(", sessionKey=");
        LIZ.append((Object) this.sessionKey);
        LIZ.append(", countryCode=");
        LIZ.append((Object) this.countryCode);
        LIZ.append(", key=");
        LIZ.append(this.key);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Map<String, String> buildParams() {
        HashMap hashMap = new HashMap();
        if (getId() != null) {
            hashMap.put("id", getId());
        }
        if (getCountryCode() != null) {
            hashMap.put("country_code", getCountryCode());
        }
        if (getLanguage() != null) {
            hashMap.put("language", getLanguage());
        }
        if (getSessionKey() != null) {
            hashMap.put("session_key", getSessionKey());
        }
        hashMap.put("key", getKey());
        return hashMap;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getId() {
        return this.id;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getSessionKey() {
        return this.sessionKey;
    }

    public InnerPlaceDetailRequest(String str, String str2, String str3, String str4, String key) {
        o.LJIIIZ(key, "key");
        this.id = str;
        this.language = str2;
        this.sessionKey = str3;
        this.countryCode = str4;
        this.key = key;
    }

    public /* synthetic */ InnerPlaceDetailRequest(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) == 0 ? str4 : null, str5);
    }
}
