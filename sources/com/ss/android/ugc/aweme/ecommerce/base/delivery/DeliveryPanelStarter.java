package com.ss.android.ugc.aweme.ecommerce.base.delivery;

import X.C07670Rv;
import X.C1FJ;
import X.C26964Ai8;
import X.C26995Aid;
import X.C26996Aie;
import X.C26997Aif;
import X.C27000Aii;
import X.C279017q;
import X.C79062V1e;
import X.C84654XKg;
import X.InterfaceC65349Pkn;
import X.UC7;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingTOAddressInfo;
import defpackage.q;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class DeliveryPanelStarter {
    public static final DeliveryPanelStarter LIZ = new DeliveryPanelStarter();
    public static C84654XKg LIZIZ;

    /* loaded from: classes5.dex */
    public static final class EnterParam implements Parcelable {

        @InterfaceC65349Pkn("biz_type")
        public final Integer bizType;

        @InterfaceC65349Pkn("currency")
        public final String currency;

        @InterfaceC65349Pkn("logistic_list")
        public final List<LogisticDTO> logisticList;

        @InterfaceC65349Pkn("panel_title")
        public final String panelTitle;

        @InterfaceC65349Pkn("price_val")
        public final String priceVal;

        @InterfaceC65349Pkn("product_id")
        public final String productId;

        @InterfaceC65349Pkn("quantity")
        public final int quantity;

        @InterfaceC65349Pkn("area")
        public final List<Region> selectedArea;

        @InterfaceC65349Pkn("address_id")
        public final String selectedBuyerAddressId;

        @InterfaceC65349Pkn("delivery_type")
        public final String selectedDeliveryTypeId;

        @InterfaceC65349Pkn("sku_id")
        public final String skuId;

        @InterfaceC65349Pkn("track_params")
        public final String trackParams;
        public static final C26997Aif Companion = new C26997Aif();
        public static final Parcelable.Creator<EnterParam> CREATOR = new C27000Aii();

        /* JADX WARN: Multi-variable type inference failed */
        public EnterParam() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4095, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EnterParam)) {
                return false;
            }
            EnterParam enterParam = (EnterParam) obj;
            return o.LJ(this.selectedDeliveryTypeId, enterParam.selectedDeliveryTypeId) && o.LJ(this.selectedBuyerAddressId, enterParam.selectedBuyerAddressId) && o.LJ(this.selectedArea, enterParam.selectedArea) && o.LJ(this.productId, enterParam.productId) && o.LJ(this.skuId, enterParam.skuId) && this.quantity == enterParam.quantity && o.LJ(this.logisticList, enterParam.logisticList) && o.LJ(this.trackParams, enterParam.trackParams) && o.LJ(this.priceVal, enterParam.priceVal) && o.LJ(this.currency, enterParam.currency) && o.LJ(this.bizType, enterParam.bizType) && o.LJ(this.panelTitle, enterParam.panelTitle);
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5;
            int hashCode6;
            int hashCode7;
            int hashCode8;
            String str = this.selectedDeliveryTypeId;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = hashCode * 31;
            String str2 = this.selectedBuyerAddressId;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            List<Region> list = this.selectedArea;
            if (list == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = list.hashCode();
            }
            int LJ = (C79062V1e.LJ(this.skuId, C79062V1e.LJ(this.productId, (i3 + hashCode3) * 31, 31), 31) + this.quantity) * 31;
            List<LogisticDTO> list2 = this.logisticList;
            if (list2 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = list2.hashCode();
            }
            int i4 = (LJ + hashCode4) * 31;
            String str3 = this.trackParams;
            if (str3 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str3.hashCode();
            }
            int i5 = (i4 + hashCode5) * 31;
            String str4 = this.priceVal;
            if (str4 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str4.hashCode();
            }
            int i6 = (i5 + hashCode6) * 31;
            String str5 = this.currency;
            if (str5 == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = str5.hashCode();
            }
            int i7 = (i6 + hashCode7) * 31;
            Integer num = this.bizType;
            if (num == null) {
                hashCode8 = 0;
            } else {
                hashCode8 = num.hashCode();
            }
            int i8 = (i7 + hashCode8) * 31;
            String str6 = this.panelTitle;
            if (str6 != null) {
                i = str6.hashCode();
            }
            return i8 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EnterParam(selectedDeliveryTypeId=");
            sb.append(this.selectedDeliveryTypeId);
            sb.append(", selectedBuyerAddressId=");
            sb.append(this.selectedBuyerAddressId);
            sb.append(", selectedArea=");
            sb.append(this.selectedArea);
            sb.append(", productId=");
            sb.append(this.productId);
            sb.append(", skuId=");
            sb.append(this.skuId);
            sb.append(", quantity=");
            sb.append(this.quantity);
            sb.append(", logisticList=");
            sb.append(this.logisticList);
            sb.append(", trackParams=");
            sb.append(this.trackParams);
            sb.append(", priceVal=");
            sb.append(this.priceVal);
            sb.append(", currency=");
            sb.append(this.currency);
            sb.append(", bizType=");
            sb.append(this.bizType);
            sb.append(", panelTitle=");
            return C07670Rv.LIZIZ(sb, this.panelTitle, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            out.writeString(this.selectedDeliveryTypeId);
            out.writeString(this.selectedBuyerAddressId);
            List<Region> list = this.selectedArea;
            if (list == null) {
                out.writeInt(0);
            } else {
                Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
                while (LIZIZ.hasNext()) {
                    ((Region) LIZIZ.next()).writeToParcel(out, i);
                }
            }
            out.writeString(this.productId);
            out.writeString(this.skuId);
            out.writeInt(this.quantity);
            List<LogisticDTO> list2 = this.logisticList;
            if (list2 == null) {
                out.writeInt(0);
            } else {
                Iterator LIZIZ2 = C279017q.LIZIZ(out, 1, list2);
                while (LIZIZ2.hasNext()) {
                    ((LogisticDTO) LIZIZ2.next()).writeToParcel(out, i);
                }
            }
            out.writeString(this.trackParams);
            out.writeString(this.priceVal);
            out.writeString(this.currency);
            Integer num = this.bizType;
            if (num == null) {
                out.writeInt(0);
            } else {
                C1FJ.LJ(out, 1, num);
            }
            out.writeString(this.panelTitle);
        }

        public EnterParam(String str, String str2, List<Region> list, String productId, String skuId, int i, List<LogisticDTO> list2, String str3, String str4, String str5, Integer num, String str6) {
            o.LJIIIZ(productId, "productId");
            o.LJIIIZ(skuId, "skuId");
            this.selectedDeliveryTypeId = str;
            this.selectedBuyerAddressId = str2;
            this.selectedArea = list;
            this.productId = productId;
            this.skuId = skuId;
            this.quantity = i;
            this.logisticList = list2;
            this.trackParams = str3;
            this.priceVal = str4;
            this.currency = str5;
            this.bizType = num;
            this.panelTitle = str6;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ EnterParam(java.lang.String r15, java.lang.String r16, java.util.List r17, java.lang.String r18, java.lang.String r19, int r20, java.util.List r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.Integer r25, java.lang.String r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
            /*
                r14 = this;
                r1 = r27
                r12 = r25
                r11 = r24
                r10 = r23
                r9 = r22
                r3 = r16
                r2 = r15
                r4 = r17
                r5 = r18
                r7 = r20
                r8 = r21
                r0 = r1 & 1
                r13 = 0
                if (r0 == 0) goto L1b
                r2 = r13
            L1b:
                r0 = r1 & 2
                if (r0 == 0) goto L20
                r3 = r13
            L20:
                r0 = r1 & 4
                if (r0 == 0) goto L25
                r4 = r13
            L25:
                r0 = r1 & 8
                java.lang.String r6 = "0"
                if (r0 == 0) goto L2c
                r5 = r6
            L2c:
                r0 = r1 & 16
                if (r0 == 0) goto L5a
            L30:
                r0 = r1 & 32
                if (r0 == 0) goto L35
                r7 = 1
            L35:
                r0 = r1 & 64
                if (r0 == 0) goto L3a
                r8 = r13
            L3a:
                r0 = r1 & 128(0x80, float:1.8E-43)
                if (r0 == 0) goto L3f
                r9 = r13
            L3f:
                r0 = r1 & 256(0x100, float:3.59E-43)
                if (r0 == 0) goto L44
                r10 = r13
            L44:
                r0 = r1 & 512(0x200, float:7.17E-43)
                if (r0 == 0) goto L49
                r11 = r13
            L49:
                r0 = r1 & 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L4e
                r12 = r13
            L4e:
                r0 = r1 & 2048(0x800, float:2.87E-42)
                if (r0 == 0) goto L57
            L52:
                r1 = r14
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            L57:
                r13 = r26
                goto L52
            L5a:
                r6 = r19
                goto L30
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter.EnterParam.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, int, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    /* loaded from: classes5.dex */
    public static final class EnterParamForProductDetailPage implements Parcelable {
        public static final Parcelable.Creator<EnterParamForProductDetailPage> CREATOR = new C26996Aie();
        public final String current;
        public final String priceVal;
        public final String productId;
        public final int quantity;
        public final List<Region> selectedArea;
        public final String selectedBuyerAddressId;
        public final String selectedLogisticTypeId;
        public final String skuId;
        public final String trackParams;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EnterParamForProductDetailPage)) {
                return false;
            }
            EnterParamForProductDetailPage enterParamForProductDetailPage = (EnterParamForProductDetailPage) obj;
            return o.LJ(this.selectedLogisticTypeId, enterParamForProductDetailPage.selectedLogisticTypeId) && o.LJ(this.selectedBuyerAddressId, enterParamForProductDetailPage.selectedBuyerAddressId) && o.LJ(this.selectedArea, enterParamForProductDetailPage.selectedArea) && o.LJ(this.productId, enterParamForProductDetailPage.productId) && o.LJ(this.skuId, enterParamForProductDetailPage.skuId) && this.quantity == enterParamForProductDetailPage.quantity && o.LJ(this.trackParams, enterParamForProductDetailPage.trackParams) && o.LJ(this.priceVal, enterParamForProductDetailPage.priceVal) && o.LJ(this.current, enterParamForProductDetailPage.current);
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5;
            String str = this.selectedLogisticTypeId;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = hashCode * 31;
            String str2 = this.selectedBuyerAddressId;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            List<Region> list = this.selectedArea;
            if (list == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = list.hashCode();
            }
            int LJ = (C79062V1e.LJ(this.skuId, C79062V1e.LJ(this.productId, (i3 + hashCode3) * 31, 31), 31) + this.quantity) * 31;
            String str3 = this.trackParams;
            if (str3 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str3.hashCode();
            }
            int i4 = (LJ + hashCode4) * 31;
            String str4 = this.priceVal;
            if (str4 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str4.hashCode();
            }
            int i5 = (i4 + hashCode5) * 31;
            String str5 = this.current;
            if (str5 != null) {
                i = str5.hashCode();
            }
            return i5 + i;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EnterParamForProductDetailPage(selectedLogisticTypeId=");
            LIZ.append(this.selectedLogisticTypeId);
            LIZ.append(", selectedBuyerAddressId=");
            LIZ.append(this.selectedBuyerAddressId);
            LIZ.append(", selectedArea=");
            LIZ.append(this.selectedArea);
            LIZ.append(", productId=");
            LIZ.append(this.productId);
            LIZ.append(", skuId=");
            LIZ.append(this.skuId);
            LIZ.append(", quantity=");
            LIZ.append(this.quantity);
            LIZ.append(", trackParams=");
            LIZ.append(this.trackParams);
            LIZ.append(", priceVal=");
            LIZ.append(this.priceVal);
            LIZ.append(", current=");
            return q.LIZIZ(LIZ, this.current, ')', LIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            out.writeString(this.selectedLogisticTypeId);
            out.writeString(this.selectedBuyerAddressId);
            List<Region> list = this.selectedArea;
            if (list == null) {
                out.writeInt(0);
            } else {
                Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
                while (LIZIZ.hasNext()) {
                    ((Region) LIZIZ.next()).writeToParcel(out, i);
                }
            }
            out.writeString(this.productId);
            out.writeString(this.skuId);
            out.writeInt(this.quantity);
            out.writeString(this.trackParams);
            out.writeString(this.priceVal);
            out.writeString(this.current);
        }

        public EnterParamForProductDetailPage(String str, String str2, List<Region> list, String productId, String skuId, int i, String str3, String str4, String str5) {
            o.LJIIIZ(productId, "productId");
            o.LJIIIZ(skuId, "skuId");
            this.selectedLogisticTypeId = str;
            this.selectedBuyerAddressId = str2;
            this.selectedArea = list;
            this.productId = productId;
            this.skuId = skuId;
            this.quantity = i;
            this.trackParams = str3;
            this.priceVal = str4;
            this.current = str5;
        }
    }

    /* loaded from: classes5.dex */
    public static final class EnterParamForOrderSubmitPage implements Parcelable {
        public static final Parcelable.Creator<EnterParamForOrderSubmitPage> CREATOR = new C26964Ai8();
        public final List<LogisticDTO> logisticList;
        public final String panelTitle;
        public final String selectedLogisticTypeId;
        public final String trackParams;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EnterParamForOrderSubmitPage)) {
                return false;
            }
            EnterParamForOrderSubmitPage enterParamForOrderSubmitPage = (EnterParamForOrderSubmitPage) obj;
            return o.LJ(this.logisticList, enterParamForOrderSubmitPage.logisticList) && o.LJ(this.selectedLogisticTypeId, enterParamForOrderSubmitPage.selectedLogisticTypeId) && o.LJ(this.trackParams, enterParamForOrderSubmitPage.trackParams) && o.LJ(this.panelTitle, enterParamForOrderSubmitPage.panelTitle);
        }

        public final int hashCode() {
            int hashCode = this.logisticList.hashCode() * 31;
            String str = this.selectedLogisticTypeId;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.trackParams;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.panelTitle;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EnterParamForOrderSubmitPage(logisticList=");
            LIZ.append(this.logisticList);
            LIZ.append(", selectedLogisticTypeId=");
            LIZ.append(this.selectedLogisticTypeId);
            LIZ.append(", trackParams=");
            LIZ.append(this.trackParams);
            LIZ.append(", panelTitle=");
            return q.LIZIZ(LIZ, this.panelTitle, ')', LIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            Iterator LIZJ = UC7.LIZJ(this.logisticList, out);
            while (LIZJ.hasNext()) {
                ((LogisticDTO) LIZJ.next()).writeToParcel(out, i);
            }
            out.writeString(this.selectedLogisticTypeId);
            out.writeString(this.trackParams);
            out.writeString(this.panelTitle);
        }

        public EnterParamForOrderSubmitPage(List<LogisticDTO> logisticList, String str, String str2, String str3) {
            o.LJIIIZ(logisticList, "logisticList");
            this.logisticList = logisticList;
            this.selectedLogisticTypeId = str;
            this.trackParams = str2;
            this.panelTitle = str3;
        }
    }

    /* loaded from: classes5.dex */
    public static final class PackedDeliverySelectResult implements Parcelable {
        public static final Parcelable.Creator<PackedDeliverySelectResult> CREATOR = new C26995Aid();

        @InterfaceC65349Pkn("logistics")
        public final List<LogisticDTO> logistics;

        @InterfaceC65349Pkn("pdp_logistic_module")
        public final PDPLogisticModule pdpLogisticModule;

        @InterfaceC65349Pkn("area")
        public final List<Region> selectedArea;

        @InterfaceC65349Pkn("address_id")
        public final String selectedBuyerAddressId;

        @InterfaceC65349Pkn("logistic")
        public final LogisticDTO selectedLogistic;

        @InterfaceC65349Pkn("shipping_to_address_info")
        public final ShippingTOAddressInfo shippingToAddressInfo;

        /* JADX WARN: Multi-variable type inference failed */
        public PackedDeliverySelectResult() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PackedDeliverySelectResult)) {
                return false;
            }
            PackedDeliverySelectResult packedDeliverySelectResult = (PackedDeliverySelectResult) obj;
            return o.LJ(this.selectedLogistic, packedDeliverySelectResult.selectedLogistic) && o.LJ(this.selectedBuyerAddressId, packedDeliverySelectResult.selectedBuyerAddressId) && o.LJ(this.selectedArea, packedDeliverySelectResult.selectedArea) && o.LJ(this.shippingToAddressInfo, packedDeliverySelectResult.shippingToAddressInfo) && o.LJ(this.logistics, packedDeliverySelectResult.logistics) && o.LJ(this.pdpLogisticModule, packedDeliverySelectResult.pdpLogisticModule);
        }

        public final int hashCode() {
            LogisticDTO logisticDTO = this.selectedLogistic;
            int hashCode = (logisticDTO == null ? 0 : logisticDTO.hashCode()) * 31;
            String str = this.selectedBuyerAddressId;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<Region> list = this.selectedArea;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            ShippingTOAddressInfo shippingTOAddressInfo = this.shippingToAddressInfo;
            int hashCode4 = (hashCode3 + (shippingTOAddressInfo == null ? 0 : shippingTOAddressInfo.hashCode())) * 31;
            List<LogisticDTO> list2 = this.logistics;
            int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
            PDPLogisticModule pDPLogisticModule = this.pdpLogisticModule;
            return hashCode5 + (pDPLogisticModule != null ? pDPLogisticModule.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PackedDeliverySelectResult(selectedLogistic=");
            LIZ.append(this.selectedLogistic);
            LIZ.append(", selectedBuyerAddressId=");
            LIZ.append(this.selectedBuyerAddressId);
            LIZ.append(", selectedArea=");
            LIZ.append(this.selectedArea);
            LIZ.append(", shippingToAddressInfo=");
            LIZ.append(this.shippingToAddressInfo);
            LIZ.append(", logistics=");
            LIZ.append(this.logistics);
            LIZ.append(", pdpLogisticModule=");
            LIZ.append(this.pdpLogisticModule);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            LogisticDTO logisticDTO = this.selectedLogistic;
            if (logisticDTO == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                logisticDTO.writeToParcel(out, i);
            }
            out.writeString(this.selectedBuyerAddressId);
            List<Region> list = this.selectedArea;
            if (list == null) {
                out.writeInt(0);
            } else {
                Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
                while (LIZIZ.hasNext()) {
                    ((Region) LIZIZ.next()).writeToParcel(out, i);
                }
            }
            ShippingTOAddressInfo shippingTOAddressInfo = this.shippingToAddressInfo;
            if (shippingTOAddressInfo == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                shippingTOAddressInfo.writeToParcel(out, i);
            }
            List<LogisticDTO> list2 = this.logistics;
            if (list2 == null) {
                out.writeInt(0);
            } else {
                Iterator LIZIZ2 = C279017q.LIZIZ(out, 1, list2);
                while (LIZIZ2.hasNext()) {
                    ((LogisticDTO) LIZIZ2.next()).writeToParcel(out, i);
                }
            }
            PDPLogisticModule pDPLogisticModule = this.pdpLogisticModule;
            if (pDPLogisticModule == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                pDPLogisticModule.writeToParcel(out, i);
            }
        }

        public PackedDeliverySelectResult(LogisticDTO logisticDTO, String str, List<Region> list, ShippingTOAddressInfo shippingTOAddressInfo, List<LogisticDTO> list2, PDPLogisticModule pDPLogisticModule) {
            this.selectedLogistic = logisticDTO;
            this.selectedBuyerAddressId = str;
            this.selectedArea = list;
            this.shippingToAddressInfo = shippingTOAddressInfo;
            this.logistics = list2;
            this.pdpLogisticModule = pDPLogisticModule;
        }

        public /* synthetic */ PackedDeliverySelectResult(LogisticDTO logisticDTO, String str, List list, ShippingTOAddressInfo shippingTOAddressInfo, List list2, PDPLogisticModule pDPLogisticModule, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : logisticDTO, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : shippingTOAddressInfo, (i & 16) != 0 ? null : list2, (i & 32) == 0 ? pDPLogisticModule : null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(android.content.Context r7, java.lang.Boolean r8, com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter.EnterParam r9, boolean r10, java.lang.String r11, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter.PackedDeliverySelectResult> r12) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter.LIZ(android.content.Context, java.lang.Boolean, com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter$EnterParam, boolean, java.lang.String, X.2kd):java.lang.Object");
    }
}
