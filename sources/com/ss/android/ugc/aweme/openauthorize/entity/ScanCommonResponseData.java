package com.ss.android.ugc.aweme.openauthorize.entity;

import X.C79062V1e;
import X.HH1;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ScanCommonResponseData {

    @InterfaceC65349Pkn("captcha")
    public final String captcha;

    @InterfaceC65349Pkn("desc_url")
    public final String descUrl;

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("error_code")
    public final Integer errorCode;

    /* JADX WARN: Multi-variable type inference failed */
    public ScanCommonResponseData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScanCommonResponseData)) {
            return false;
        }
        ScanCommonResponseData scanCommonResponseData = (ScanCommonResponseData) obj;
        return o.LJ(this.captcha, scanCommonResponseData.captcha) && o.LJ(this.descUrl, scanCommonResponseData.descUrl) && o.LJ(this.description, scanCommonResponseData.description) && o.LJ(this.errorCode, scanCommonResponseData.errorCode);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.description, C79062V1e.LJ(this.descUrl, this.captcha.hashCode() * 31, 31), 31);
        Integer num = this.errorCode;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ScanCommonResponseData(captcha=");
        LIZ.append(this.captcha);
        LIZ.append(", descUrl=");
        LIZ.append(this.descUrl);
        LIZ.append(", description=");
        LIZ.append(this.description);
        LIZ.append(", errorCode=");
        return s0.LIZJ(LIZ, this.errorCode, ')', LIZ);
    }

    public ScanCommonResponseData(String str, String str2, String str3, Integer num) {
        HH1.LIZ(str, "captcha", str2, "descUrl", str3, "description");
        this.captcha = str;
        this.descUrl = str2;
        this.description = str3;
        this.errorCode = num;
    }

    public /* synthetic */ ScanCommonResponseData(String str, String str2, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : num);
    }
}
