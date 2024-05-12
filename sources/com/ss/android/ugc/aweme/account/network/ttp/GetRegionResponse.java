package com.ss.android.ugc.aweme.account.network.ttp;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GetRegionResponse {

    @InterfaceC65349Pkn("data")
    public final Data data;

    @InterfaceC65349Pkn("message")
    public final String message;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetRegionResponse)) {
            return false;
        }
        GetRegionResponse getRegionResponse = (GetRegionResponse) obj;
        return o.LJ(this.message, getRegionResponse.message) && o.LJ(this.data, getRegionResponse.data);
    }

    public final int hashCode() {
        String str = this.message;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Data data = this.data;
        return hashCode + (data != null ? data.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GetRegionResponse(message=");
        LIZ.append(this.message);
        LIZ.append(", data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* loaded from: classes12.dex */
    public static final class Data {

        @InterfaceC65349Pkn("captcha_domain")
        public final String captchaDomain;

        @InterfaceC65349Pkn("country_code")
        public String countryCode;

        @InterfaceC65349Pkn("device_redirect_info")
        public final String deviceRedirectInfo;

        @InterfaceC65349Pkn("domain")
        public final String domain;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return o.LJ(this.countryCode, data.countryCode) && o.LJ(this.domain, data.domain) && o.LJ(this.captchaDomain, data.captchaDomain) && o.LJ(this.deviceRedirectInfo, data.deviceRedirectInfo);
        }

        public final int hashCode() {
            String str = this.countryCode;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.domain;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.captchaDomain;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.deviceRedirectInfo;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Data(countryCode=");
            LIZ.append(this.countryCode);
            LIZ.append(", domain=");
            LIZ.append(this.domain);
            LIZ.append(", captchaDomain=");
            LIZ.append(this.captchaDomain);
            LIZ.append(", deviceRedirectInfo=");
            return q.LIZIZ(LIZ, this.deviceRedirectInfo, ')', LIZ);
        }

        public Data(String str, String str2, String str3, String str4) {
            this.countryCode = str;
            this.domain = str2;
            this.captchaDomain = str3;
            this.deviceRedirectInfo = str4;
        }
    }

    public GetRegionResponse(String str, Data data) {
        this.message = str;
        this.data = data;
    }
}
