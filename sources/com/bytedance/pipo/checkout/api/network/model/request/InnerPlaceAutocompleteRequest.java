package com.bytedance.pipo.checkout.api.network.model.request;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class InnerPlaceAutocompleteRequest {

    @InterfaceC65349Pkn("country_code")
    public final String countryCode;

    @InterfaceC65349Pkn("key")
    public final String key;

    @InterfaceC65349Pkn("keyword")
    public final String keyword;

    @InterfaceC65349Pkn("language")
    public final String language;

    @InterfaceC65349Pkn("session_key")
    public final String sessionKey;

    public static /* synthetic */ InnerPlaceAutocompleteRequest copy$default(InnerPlaceAutocompleteRequest innerPlaceAutocompleteRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = innerPlaceAutocompleteRequest.keyword;
        }
        if ((i & 2) != 0) {
            str2 = innerPlaceAutocompleteRequest.countryCode;
        }
        if ((i & 4) != 0) {
            str3 = innerPlaceAutocompleteRequest.language;
        }
        if ((i & 8) != 0) {
            str4 = innerPlaceAutocompleteRequest.sessionKey;
        }
        if ((i & 16) != 0) {
            str5 = innerPlaceAutocompleteRequest.key;
        }
        return innerPlaceAutocompleteRequest.copy(str, str2, str3, str4, str5);
    }

    public final InnerPlaceAutocompleteRequest copy(String str, String str2, String str3, String str4, String key) {
        o.LJIIIZ(key, "key");
        return new InnerPlaceAutocompleteRequest(str, str2, str3, str4, key);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerPlaceAutocompleteRequest)) {
            return false;
        }
        InnerPlaceAutocompleteRequest innerPlaceAutocompleteRequest = (InnerPlaceAutocompleteRequest) obj;
        return o.LJ(this.keyword, innerPlaceAutocompleteRequest.keyword) && o.LJ(this.countryCode, innerPlaceAutocompleteRequest.countryCode) && o.LJ(this.language, innerPlaceAutocompleteRequest.language) && o.LJ(this.sessionKey, innerPlaceAutocompleteRequest.sessionKey) && o.LJ(this.key, innerPlaceAutocompleteRequest.key);
    }

    public int hashCode() {
        String str = this.keyword;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.countryCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.language;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sessionKey;
        return ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.key.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InnerPlaceAutocompleteRequest(keyword=");
        LIZ.append((Object) this.keyword);
        LIZ.append(", countryCode=");
        LIZ.append((Object) this.countryCode);
        LIZ.append(", language=");
        LIZ.append((Object) this.language);
        LIZ.append(", sessionKey=");
        LIZ.append((Object) this.sessionKey);
        LIZ.append(", key=");
        LIZ.append(this.key);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Map<String, String> buildParams() {
        HashMap hashMap = new HashMap();
        if (getKeyword() != null) {
            hashMap.put("keyword", getKeyword());
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

    public final String getKey() {
        return this.key;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getSessionKey() {
        return this.sessionKey;
    }

    public InnerPlaceAutocompleteRequest(String str, String str2, String str3, String str4, String key) {
        o.LJIIIZ(key, "key");
        this.keyword = str;
        this.countryCode = str2;
        this.language = str3;
        this.sessionKey = str4;
        this.key = key;
    }

    public /* synthetic */ InnerPlaceAutocompleteRequest(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) == 0 ? str4 : null, str5);
    }
}
