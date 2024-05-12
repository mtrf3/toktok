package com.ss.android.ugc.aweme.account.login.auth.ui.ru_instant_login;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GetVendorInfoResponse {

    @InterfaceC65349Pkn("code")
    public final int code;

    @InterfaceC65349Pkn("data")
    public final List<VendorInfo> data;

    @InterfaceC65349Pkn("message")
    public final String message;

    /* loaded from: classes2.dex */
    public static final class VendorInfo {

        @InterfaceC65349Pkn("body")
        public final String body;

        @InterfaceC65349Pkn("header")
        public final String header;

        @InterfaceC65349Pkn("method")
        public final String method;

        @InterfaceC65349Pkn("mode")
        public final String mode;

        @InterfaceC65349Pkn("other")
        public final String other;

        @InterfaceC65349Pkn("url")
        public final String url;

        @InterfaceC65349Pkn("vendor_id")
        public final String vendorId;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VendorInfo)) {
                return false;
            }
            VendorInfo vendorInfo = (VendorInfo) obj;
            return o.LJ(this.mode, vendorInfo.mode) && o.LJ(this.vendorId, vendorInfo.vendorId) && o.LJ(this.url, vendorInfo.url) && o.LJ(this.method, vendorInfo.method) && o.LJ(this.header, vendorInfo.header) && o.LJ(this.body, vendorInfo.body) && o.LJ(this.other, vendorInfo.other);
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int LJ = C79062V1e.LJ(this.vendorId, this.mode.hashCode() * 31, 31);
            String str = this.url;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (LJ + hashCode) * 31;
            String str2 = this.method;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            String str3 = this.header;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i4 = (i3 + hashCode3) * 31;
            String str4 = this.body;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i5 = (i4 + hashCode4) * 31;
            String str5 = this.other;
            if (str5 != null) {
                i = str5.hashCode();
            }
            return i5 + i;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VendorInfo(mode=");
            LIZ.append(this.mode);
            LIZ.append(", vendorId=");
            LIZ.append(this.vendorId);
            LIZ.append(", url=");
            LIZ.append(this.url);
            LIZ.append(", method=");
            LIZ.append(this.method);
            LIZ.append(", header=");
            LIZ.append(this.header);
            LIZ.append(", body=");
            LIZ.append(this.body);
            LIZ.append(", other=");
            return q.LIZIZ(LIZ, this.other, ')', LIZ);
        }

        public VendorInfo(String mode, String vendorId, String str, String str2, String str3, String str4, String str5) {
            o.LJIIIZ(mode, "mode");
            o.LJIIIZ(vendorId, "vendorId");
            this.mode = mode;
            this.vendorId = vendorId;
            this.url = str;
            this.method = str2;
            this.header = str3;
            this.body = str4;
            this.other = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetVendorInfoResponse)) {
            return false;
        }
        GetVendorInfoResponse getVendorInfoResponse = (GetVendorInfoResponse) obj;
        return o.LJ(this.message, getVendorInfoResponse.message) && o.LJ(this.data, getVendorInfoResponse.data) && this.code == getVendorInfoResponse.code;
    }

    public final int hashCode() {
        int hashCode = this.message.hashCode() * 31;
        List<VendorInfo> list = this.data;
        return ((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.code;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GetVendorInfoResponse(message=");
        LIZ.append(this.message);
        LIZ.append(", data=");
        LIZ.append(this.data);
        LIZ.append(", code=");
        return b0.LIZJ(LIZ, this.code, ')', LIZ);
    }

    public GetVendorInfoResponse(String message, List<VendorInfo> list, int i) {
        o.LJIIIZ(message, "message");
        this.message = message;
        this.data = list;
        this.code = i;
    }
}
