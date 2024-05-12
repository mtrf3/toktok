package com.ss.android.ugc.aweme.relation.auth.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EmailUploadResponse extends BaseResponse {

    @InterfaceC65349Pkn("data")
    public final Data data;

    /* JADX WARN: Multi-variable type inference failed */
    public EmailUploadResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EmailUploadResponse) && o.LJ(this.data, ((EmailUploadResponse) obj).data);
    }

    public final int hashCode() {
        Data data = this.data;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EmailUploadResponse(data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* loaded from: classes2.dex */
    public static final class Data {

        @InterfaceC65349Pkn("captcha")
        public final String captcha;

        @InterfaceC65349Pkn("desc_url")
        public final String desc_url;

        @InterfaceC65349Pkn("error_code")
        public final Integer errorCode;

        @InterfaceC65349Pkn("description")
        public final String errorDescription;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return o.LJ(this.captcha, data.captcha) && o.LJ(this.desc_url, data.desc_url) && o.LJ(this.errorCode, data.errorCode) && o.LJ(this.errorDescription, data.errorDescription);
        }

        public final int hashCode() {
            String str = this.captcha;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.desc_url;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.errorCode;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str3 = this.errorDescription;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Data(captcha=");
            LIZ.append(this.captcha);
            LIZ.append(", desc_url=");
            LIZ.append(this.desc_url);
            LIZ.append(", errorCode=");
            LIZ.append(this.errorCode);
            LIZ.append(", errorDescription=");
            return q.LIZIZ(LIZ, this.errorDescription, ')', LIZ);
        }

        public Data(String str, String str2, Integer num, String str3) {
            this.captcha = str;
            this.desc_url = str2;
            this.errorCode = num;
            this.errorDescription = str3;
        }
    }

    public EmailUploadResponse(Data data) {
        this.data = data;
    }

    public /* synthetic */ EmailUploadResponse(Data data, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : data);
    }
}
