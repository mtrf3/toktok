package com.ss.android.ugc.aweme.feed.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class EcUgVSAData implements Serializable {

    @InterfaceC65349Pkn("custom_shop_ads_type")
    public final Integer adType;

    @InterfaceC65349Pkn("open_url")
    public final String openUrl;

    @InterfaceC65349Pkn("pdp_template_url")
    public final String pdpTemplateUrl;

    @InterfaceC65349Pkn("product_infos")
    public final List<EcUgVSAProductInfo> productInfoList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EcUgVSAData copy$default(EcUgVSAData ecUgVSAData, Integer num, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = ecUgVSAData.adType;
        }
        if ((i & 2) != 0) {
            str = ecUgVSAData.openUrl;
        }
        if ((i & 4) != 0) {
            str2 = ecUgVSAData.pdpTemplateUrl;
        }
        if ((i & 8) != 0) {
            list = ecUgVSAData.productInfoList;
        }
        return ecUgVSAData.copy(num, str, str2, list);
    }

    public final EcUgVSAData copy(Integer num, String str, String str2, List<EcUgVSAProductInfo> list) {
        return new EcUgVSAData(num, str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcUgVSAData)) {
            return false;
        }
        EcUgVSAData ecUgVSAData = (EcUgVSAData) obj;
        return o.LJ(this.adType, ecUgVSAData.adType) && o.LJ(this.openUrl, ecUgVSAData.openUrl) && o.LJ(this.pdpTemplateUrl, ecUgVSAData.pdpTemplateUrl) && o.LJ(this.productInfoList, ecUgVSAData.productInfoList);
    }

    public int hashCode() {
        Integer num = this.adType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.openUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pdpTemplateUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<EcUgVSAProductInfo> list = this.productInfoList;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    /* loaded from: classes11.dex */
    public static final class EcUgVSAProductInfo implements Serializable {

        @InterfaceC65349Pkn("biz_type")
        public final Integer bizType;

        @InterfaceC65349Pkn("product_id")
        public final String productId;

        public static /* synthetic */ EcUgVSAProductInfo copy$default(EcUgVSAProductInfo ecUgVSAProductInfo, String str, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ecUgVSAProductInfo.productId;
            }
            if ((i & 2) != 0) {
                num = ecUgVSAProductInfo.bizType;
            }
            return ecUgVSAProductInfo.copy(str, num);
        }

        public final EcUgVSAProductInfo copy(String str, Integer num) {
            return new EcUgVSAProductInfo(str, num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EcUgVSAProductInfo)) {
                return false;
            }
            EcUgVSAProductInfo ecUgVSAProductInfo = (EcUgVSAProductInfo) obj;
            return o.LJ(this.productId, ecUgVSAProductInfo.productId) && o.LJ(this.bizType, ecUgVSAProductInfo.bizType);
        }

        public int hashCode() {
            String str = this.productId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.bizType;
            return hashCode + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EcUgVSAProductInfo(productId=");
            LIZ.append(this.productId);
            LIZ.append(", bizType=");
            return s0.LIZJ(LIZ, this.bizType, ')', LIZ);
        }

        public final Integer getBizType() {
            return this.bizType;
        }

        public final String getProductId() {
            return this.productId;
        }

        public EcUgVSAProductInfo(String str, Integer num) {
            this.productId = str;
            this.bizType = num;
        }
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EcUgVSAData(adType=");
        LIZ.append(this.adType);
        LIZ.append(", openUrl=");
        LIZ.append(this.openUrl);
        LIZ.append(", pdpTemplateUrl=");
        LIZ.append(this.pdpTemplateUrl);
        LIZ.append(", productInfoList=");
        return C1NE.LIZIZ(LIZ, this.productInfoList, ')', LIZ);
    }

    public final Integer getAdType() {
        return this.adType;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final String getPdpTemplateUrl() {
        return this.pdpTemplateUrl;
    }

    public final List<EcUgVSAProductInfo> getProductInfoList() {
        return this.productInfoList;
    }

    public EcUgVSAData(Integer num, String str, String str2, List<EcUgVSAProductInfo> list) {
        this.adType = num;
        this.openUrl = str;
        this.pdpTemplateUrl = str2;
        this.productInfoList = list;
    }
}
