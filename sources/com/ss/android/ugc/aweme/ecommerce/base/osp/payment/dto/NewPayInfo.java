package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class NewPayInfo {

    @InterfaceC65349Pkn("channel_sdk_data")
    public final String channelSdkData;

    @InterfaceC65349Pkn("package_name")
    public final String packageName;

    @InterfaceC65349Pkn("pay_error_toast")
    public final PayErrorToast payErrorToast;

    @InterfaceC65349Pkn("pay_result")
    public final PayResult payResult;

    @InterfaceC65349Pkn("redirect_url")
    public final String redirectUrl;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewPayInfo)) {
            return false;
        }
        NewPayInfo newPayInfo = (NewPayInfo) obj;
        return o.LJ(this.redirectUrl, newPayInfo.redirectUrl) && this.payResult == newPayInfo.payResult && o.LJ(this.payErrorToast, newPayInfo.payErrorToast) && o.LJ(this.packageName, newPayInfo.packageName) && o.LJ(this.channelSdkData, newPayInfo.channelSdkData);
    }

    public final int hashCode() {
        String str = this.redirectUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        PayResult payResult = this.payResult;
        int hashCode2 = (hashCode + (payResult == null ? 0 : payResult.hashCode())) * 31;
        PayErrorToast payErrorToast = this.payErrorToast;
        int hashCode3 = (hashCode2 + (payErrorToast == null ? 0 : payErrorToast.hashCode())) * 31;
        String str2 = this.packageName;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.channelSdkData;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NewPayInfo(redirectUrl=");
        LIZ.append(this.redirectUrl);
        LIZ.append(", payResult=");
        LIZ.append(this.payResult);
        LIZ.append(", payErrorToast=");
        LIZ.append(this.payErrorToast);
        LIZ.append(", packageName=");
        LIZ.append(this.packageName);
        LIZ.append(", channelSdkData=");
        return q.LIZIZ(LIZ, this.channelSdkData, ')', LIZ);
    }

    public NewPayInfo(String str, PayResult payResult, PayErrorToast payErrorToast, String str2, String str3) {
        this.redirectUrl = str;
        this.payResult = payResult;
        this.payErrorToast = payErrorToast;
        this.packageName = str2;
        this.channelSdkData = str3;
    }
}
