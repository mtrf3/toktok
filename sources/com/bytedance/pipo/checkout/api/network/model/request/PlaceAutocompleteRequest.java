package com.bytedance.pipo.checkout.api.network.model.request;

import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PlaceAutocompleteRequest {
    public final String countryCode;
    public final String keyword;
    public final String language;
    public final String sessionKey;

    /* JADX WARN: Multi-variable type inference failed */
    public PlaceAutocompleteRequest() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PlaceAutocompleteRequest copy$default(PlaceAutocompleteRequest placeAutocompleteRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = placeAutocompleteRequest.keyword;
        }
        if ((i & 2) != 0) {
            str2 = placeAutocompleteRequest.countryCode;
        }
        if ((i & 4) != 0) {
            str3 = placeAutocompleteRequest.language;
        }
        if ((i & 8) != 0) {
            str4 = placeAutocompleteRequest.sessionKey;
        }
        return placeAutocompleteRequest.copy(str, str2, str3, str4);
    }

    public final PlaceAutocompleteRequest copy(String str, String str2, String str3, String str4) {
        return new PlaceAutocompleteRequest(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceAutocompleteRequest)) {
            return false;
        }
        PlaceAutocompleteRequest placeAutocompleteRequest = (PlaceAutocompleteRequest) obj;
        return o.LJ(this.keyword, placeAutocompleteRequest.keyword) && o.LJ(this.countryCode, placeAutocompleteRequest.countryCode) && o.LJ(this.language, placeAutocompleteRequest.language) && o.LJ(this.sessionKey, placeAutocompleteRequest.sessionKey);
    }

    public int hashCode() {
        String str = this.keyword;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.countryCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.language;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sessionKey;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PlaceAutocompleteRequest(keyword=");
        LIZ.append((Object) this.keyword);
        LIZ.append(", countryCode=");
        LIZ.append((Object) this.countryCode);
        LIZ.append(", language=");
        LIZ.append((Object) this.language);
        LIZ.append(", sessionKey=");
        LIZ.append((Object) this.sessionKey);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getCountryCode() {
        return this.countryCode;
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

    public PlaceAutocompleteRequest(String str, String str2, String str3, String str4) {
        this.keyword = str;
        this.countryCode = str2;
        this.language = str3;
        this.sessionKey = str4;
    }

    public /* synthetic */ PlaceAutocompleteRequest(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
