package com.ss.android.ugc.aweme.ecommerce.base.osp.payment;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentGuaranteeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPrice;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class EnterParams {
    public boolean LIZ;
    public final PaymentGuaranteeInfo LIZIZ;

    @InterfaceC65349Pkn("api_duration")
    public final Long apiDuration;

    @InterfaceC65349Pkn("biz_type")
    public final Integer bizType;

    @InterfaceC65349Pkn("button_type")
    public final Integer buttonType;

    @InterfaceC65349Pkn("currency")
    public final String currency;

    @InterfaceC65349Pkn("current_progress")
    public final Integer currentProgress;

    @InterfaceC65349Pkn("default_summary")
    public final Summary defaultSummary;

    @InterfaceC65349Pkn("pay_source")
    public final String paySource;

    @InterfaceC65349Pkn("payment_data")
    public final PaymentMethodsData paymentData;

    @InterfaceC65349Pkn("payment_info")
    public final PaymentInfo paymentInfo;

    @InterfaceC65349Pkn("payment_price")
    public final List<PaymentPrice> paymentPrice;

    @InterfaceC65349Pkn("price")
    public final String price;

    @InterfaceC65349Pkn("shipping_address")
    public final Address shippingAddress;

    @InterfaceC65349Pkn("price_val")
    public final String totalPriceVal;

    @InterfaceC65349Pkn("total_progress")
    public final Integer totalProgress;

    @InterfaceC65349Pkn("track_params")
    public final HashMap<String, Object> trackParams;

    /* JADX WARN: Multi-variable type inference failed */
    public EnterParams() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 131071, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterParams)) {
            return false;
        }
        EnterParams enterParams = (EnterParams) obj;
        return o.LJ(this.currentProgress, enterParams.currentProgress) && o.LJ(this.totalProgress, enterParams.totalProgress) && o.LJ(this.buttonType, enterParams.buttonType) && o.LJ(this.paymentData, enterParams.paymentData) && o.LJ(this.price, enterParams.price) && this.LIZ == enterParams.LIZ && o.LJ(this.paymentInfo, enterParams.paymentInfo) && o.LJ(this.trackParams, enterParams.trackParams) && o.LJ(this.paymentPrice, enterParams.paymentPrice) && o.LJ(this.defaultSummary, enterParams.defaultSummary) && o.LJ(this.shippingAddress, enterParams.shippingAddress) && o.LJ(this.totalPriceVal, enterParams.totalPriceVal) && o.LJ(this.currency, enterParams.currency) && o.LJ(this.paySource, enterParams.paySource) && o.LJ(this.apiDuration, enterParams.apiDuration) && o.LJ(this.bizType, enterParams.bizType) && o.LJ(this.LIZIZ, enterParams.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Integer num = this.currentProgress;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.totalProgress;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.buttonType;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        PaymentMethodsData paymentMethodsData = this.paymentData;
        int hashCode4 = (hashCode3 + (paymentMethodsData == null ? 0 : paymentMethodsData.hashCode())) * 31;
        String str = this.price;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.LIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode5 + i) * 31;
        PaymentInfo paymentInfo = this.paymentInfo;
        int hashCode6 = (i2 + (paymentInfo == null ? 0 : paymentInfo.hashCode())) * 31;
        HashMap<String, Object> hashMap = this.trackParams;
        int hashCode7 = (hashCode6 + (hashMap == null ? 0 : hashMap.hashCode())) * 31;
        List<PaymentPrice> list = this.paymentPrice;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Summary summary = this.defaultSummary;
        int hashCode9 = (hashCode8 + (summary == null ? 0 : summary.hashCode())) * 31;
        Address address = this.shippingAddress;
        int hashCode10 = (hashCode9 + (address == null ? 0 : address.hashCode())) * 31;
        String str2 = this.totalPriceVal;
        int hashCode11 = (hashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currency;
        int hashCode12 = (hashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.paySource;
        int hashCode13 = (hashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.apiDuration;
        int hashCode14 = (hashCode13 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num4 = this.bizType;
        int hashCode15 = (hashCode14 + (num4 == null ? 0 : num4.hashCode())) * 31;
        PaymentGuaranteeInfo paymentGuaranteeInfo = this.LIZIZ;
        return hashCode15 + (paymentGuaranteeInfo != null ? paymentGuaranteeInfo.hashCode() : 0);
    }

    public final String toString() {
        return "EnterParams(currentProgress=" + this.currentProgress + ", totalProgress=" + this.totalProgress + ", buttonType=" + this.buttonType + ", paymentData=" + this.paymentData + ", price=" + this.price + ", isHalfScreen=" + this.LIZ + ", paymentInfo=" + this.paymentInfo + ", trackParams=" + this.trackParams + ", paymentPrice=" + this.paymentPrice + ", defaultSummary=" + this.defaultSummary + ", shippingAddress=" + this.shippingAddress + ", totalPriceVal=" + this.totalPriceVal + ", currency=" + this.currency + ", paySource=" + this.paySource + ", apiDuration=" + this.apiDuration + ", bizType=" + this.bizType + ", guaranteeInfo=" + this.LIZIZ + ')';
    }

    public EnterParams(Integer num, Integer num2, Integer num3, PaymentMethodsData paymentMethodsData, String str, boolean z, PaymentInfo paymentInfo, HashMap<String, Object> hashMap, List<PaymentPrice> list, Summary summary, Address address, String str2, String str3, String str4, Long l, Integer num4, PaymentGuaranteeInfo paymentGuaranteeInfo) {
        this.currentProgress = num;
        this.totalProgress = num2;
        this.buttonType = num3;
        this.paymentData = paymentMethodsData;
        this.price = str;
        this.LIZ = z;
        this.paymentInfo = paymentInfo;
        this.trackParams = hashMap;
        this.paymentPrice = list;
        this.defaultSummary = summary;
        this.shippingAddress = address;
        this.totalPriceVal = str2;
        this.currency = str3;
        this.paySource = str4;
        this.apiDuration = l;
        this.bizType = num4;
        this.LIZIZ = paymentGuaranteeInfo;
    }

    public /* synthetic */ EnterParams(Integer num, Integer num2, Integer num3, PaymentMethodsData paymentMethodsData, String str, boolean z, PaymentInfo paymentInfo, HashMap hashMap, List list, Summary summary, Address address, String str2, String str3, String str4, Long l, Integer num4, PaymentGuaranteeInfo paymentGuaranteeInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : paymentMethodsData, (i & 16) != 0 ? null : str, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : paymentInfo, (i & 128) != 0 ? null : hashMap, (i & 256) != 0 ? null : list, (i & 512) != 0 ? null : summary, (i & 1024) != 0 ? null : address, (i & 2048) != 0 ? null : str2, (i & 4096) != 0 ? null : str3, (i & FileUtils.BUFFER_SIZE) != 0 ? null : str4, (i & 16384) != 0 ? null : l, (32768 & i) != 0 ? null : num4, (i & 65536) != 0 ? null : paymentGuaranteeInfo);
    }
}
