package com.ss.android.ugc.aweme.ecommerce.base.sku;

import X.C1XY;
import X.C26867AgZ;
import X.C27739Aud;
import X.C3C5;
import X.C48339Iy7;
import X.C61845OOz;
import X.C69821Raj;
import X.C77275UUl;
import X.C78555UsJ;
import X.C79234V7u;
import X.C84654XKg;
import X.EnumC70126Rfe;
import X.InterfaceC65349Pkn;
import X.InterfaceC67352kd;
import X.InterfaceC71003Rtn;
import X.M2D;
import X.O9C;
import X.UC7;
import X.X1D;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPaymentModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import defpackage.b0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SkuPanelStarter {
    public static C84654XKg LIZ;
    public static Long LIZIZ;
    public static final HashSet<String> LIZJ = C77275UUl.LIZLLL("author_id", "campaign_channel", "campaign_id", "campaign_type", "campaign_user_tag", "enter_from", "enter_from_info", "enter_method", "entrance_form", "entrance_info", "follow_status", "filter_name", "filter_result", "is_fullscreen", "list_name", "list_num", "list_set", "original_price", "original_price_value", "product_id", "product_source", "product_type", "purchase_path", "request_id", "rights_cnt", "rights_content", "saleable_sku_num", "sales_price", "shop_id", "source", "source_button", "source_content_id", "source_page_type", "source_previous_page", "track_id", "volume", "video_shopping_list_style", "compo_name", "compo_type", "shop_status", "ad_id", "is_ad", "creative_id", "previous_page", "source_module");

    /* loaded from: classes13.dex */
    public static final class SkuEnterParams implements Serializable {

        @InterfaceC65349Pkn("biz_type")
        public final Integer bizType;

        @InterfaceC65349Pkn("buyer_addr_id")
        public final String buyerAddrId;

        @InterfaceC65349Pkn("checked_spec_ids")
        public final String[] checkedSkuIds;

        @InterfaceC65349Pkn("click_from")
        public final int clickFrom;

        @InterfaceC65349Pkn("display_favourite_btn")
        public final Integer displayFavouriteBtn;

        @InterfaceC65349Pkn("enter_from")
        public final String enterFrom;

        @InterfaceC65349Pkn("hide_pdp_entrance")
        public final Integer hidePdpEntrance;

        @InterfaceC65349Pkn("is_from_bundle_deal")
        public final Boolean isFromBundleDeal;

        @InterfaceC65349Pkn("logistics_service_id")
        public final String logisticsServiceID;

        @InterfaceC65349Pkn("need_request")
        public final boolean needRequest;

        @InterfaceC65349Pkn("old_price")
        public final String oldPrice;

        @InterfaceC65349Pkn("one_step_order_type")
        public final Integer oneStepOrderType;

        @InterfaceC65349Pkn("orderRequestParams")
        public final HashMap<String, Object> orderRequestParams;

        @InterfaceC65349Pkn("pdp_from")
        public final String pdpFrom;

        @InterfaceC65349Pkn("needs_dim")
        public final Boolean pdpFullScreen;

        @InterfaceC65349Pkn("pdpPageType")
        public final Integer pdpPageType;

        @InterfaceC65349Pkn("previous_page")
        public final String previousPage;

        @InterfaceC65349Pkn("product_enter_context")
        public final HashMap<String, Object> productEnterContext;

        @InterfaceC65349Pkn("product_id")
        public final String productId;

        @InterfaceC65349Pkn("quantity")
        public Integer productQuantity;

        @InterfaceC65349Pkn("sku_type")
        public final Integer skuType;

        @InterfaceC65349Pkn("source_info")
        public final String sourceInfo;

        @InterfaceC65349Pkn("trackParams")
        public final HashMap<String, Object> trackParams;

        @InterfaceC65349Pkn("use_prefetch")
        public final Integer usePrefetch;

        @InterfaceC65349Pkn("visitReportParams")
        public final HashMap<String, Object> visitReportParams;

        @InterfaceC65349Pkn("voucher_type_id")
        public final String voucherTypeId;

        public static /* synthetic */ SkuEnterParams copy$default(SkuEnterParams skuEnterParams, String str, Boolean bool, boolean z, int i, String str2, String[] strArr, Integer num, HashMap hashMap, HashMap hashMap2, HashMap hashMap3, Integer num2, String str3, String str4, String str5, HashMap hashMap4, String str6, String str7, String str8, Integer num3, Boolean bool2, String str9, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, int i2, Object obj) {
            String str10 = str;
            String str11 = str4;
            String str12 = str3;
            Integer num9 = num2;
            HashMap hashMap5 = hashMap3;
            HashMap hashMap6 = hashMap2;
            HashMap hashMap7 = hashMap;
            boolean z2 = z;
            Boolean bool3 = bool;
            int i3 = i;
            String str13 = str5;
            String str14 = str2;
            String[] strArr2 = strArr;
            Integer num10 = num;
            Integer num11 = num8;
            Integer num12 = num6;
            Integer num13 = num5;
            Integer num14 = num4;
            String str15 = str9;
            String str16 = str6;
            Integer num15 = num7;
            HashMap hashMap8 = hashMap4;
            String str17 = str7;
            String str18 = str8;
            Integer num16 = num3;
            Boolean bool4 = bool2;
            if ((i2 & 1) != 0) {
                str10 = skuEnterParams.productId;
            }
            if ((i2 & 2) != 0) {
                bool3 = skuEnterParams.pdpFullScreen;
            }
            if ((i2 & 4) != 0) {
                z2 = skuEnterParams.needRequest;
            }
            if ((i2 & 8) != 0) {
                i3 = skuEnterParams.clickFrom;
            }
            if ((i2 & 16) != 0) {
                str14 = skuEnterParams.enterFrom;
            }
            if ((i2 & 32) != 0) {
                strArr2 = skuEnterParams.checkedSkuIds;
            }
            if ((i2 & 64) != 0) {
                num10 = skuEnterParams.productQuantity;
            }
            if ((i2 & 128) != 0) {
                hashMap7 = skuEnterParams.trackParams;
            }
            if ((i2 & 256) != 0) {
                hashMap6 = skuEnterParams.orderRequestParams;
            }
            if ((i2 & 512) != 0) {
                hashMap5 = skuEnterParams.visitReportParams;
            }
            if ((i2 & 1024) != 0) {
                num9 = skuEnterParams.usePrefetch;
            }
            if ((i2 & 2048) != 0) {
                str12 = skuEnterParams.sourceInfo;
            }
            if ((i2 & 4096) != 0) {
                str11 = skuEnterParams.buyerAddrId;
            }
            if ((i2 & FileUtils.BUFFER_SIZE) != 0) {
                str13 = skuEnterParams.logisticsServiceID;
            }
            if ((i2 & 16384) != 0) {
                hashMap8 = skuEnterParams.productEnterContext;
            }
            if ((32768 & i2) != 0) {
                str16 = skuEnterParams.pdpFrom;
            }
            if ((65536 & i2) != 0) {
                str17 = skuEnterParams.oldPrice;
            }
            if ((131072 & i2) != 0) {
                str18 = skuEnterParams.voucherTypeId;
            }
            if ((262144 & i2) != 0) {
                num16 = skuEnterParams.pdpPageType;
            }
            if ((524288 & i2) != 0) {
                bool4 = skuEnterParams.isFromBundleDeal;
            }
            if ((1048576 & i2) != 0) {
                str15 = skuEnterParams.previousPage;
            }
            if ((2097152 & i2) != 0) {
                num14 = skuEnterParams.hidePdpEntrance;
            }
            if ((4194304 & i2) != 0) {
                num13 = skuEnterParams.bizType;
            }
            if ((8388608 & i2) != 0) {
                num12 = skuEnterParams.skuType;
            }
            if ((16777216 & i2) != 0) {
                num15 = skuEnterParams.displayFavouriteBtn;
            }
            if ((i2 & 33554432) != 0) {
                num11 = skuEnterParams.oneStepOrderType;
            }
            return skuEnterParams.copy(str10, bool3, z2, i3, str14, strArr2, num10, hashMap7, hashMap6, hashMap5, num9, str12, str11, str13, hashMap8, str16, str17, str18, num16, bool4, str15, num14, num13, num12, num15, num11);
        }

        public final SkuEnterParams copy(String str, Boolean bool, boolean z, int i, String str2, String[] strArr, Integer num, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2, HashMap<String, Object> hashMap3, Integer num2, String str3, String str4, String str5, HashMap<String, Object> hashMap4, String str6, String str7, String str8, Integer num3, Boolean bool2, String str9, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8) {
            return new SkuEnterParams(str, bool, z, i, str2, strArr, num, hashMap, hashMap2, hashMap3, num2, str3, str4, str5, hashMap4, str6, str7, str8, num3, bool2, str9, num4, num5, num6, num7, num8);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SkuEnterParams)) {
                return false;
            }
            SkuEnterParams skuEnterParams = (SkuEnterParams) obj;
            return o.LJ(this.productId, skuEnterParams.productId) && o.LJ(this.pdpFullScreen, skuEnterParams.pdpFullScreen) && this.needRequest == skuEnterParams.needRequest && this.clickFrom == skuEnterParams.clickFrom && o.LJ(this.enterFrom, skuEnterParams.enterFrom) && o.LJ(this.checkedSkuIds, skuEnterParams.checkedSkuIds) && o.LJ(this.productQuantity, skuEnterParams.productQuantity) && o.LJ(this.trackParams, skuEnterParams.trackParams) && o.LJ(this.orderRequestParams, skuEnterParams.orderRequestParams) && o.LJ(this.visitReportParams, skuEnterParams.visitReportParams) && o.LJ(this.usePrefetch, skuEnterParams.usePrefetch) && o.LJ(this.sourceInfo, skuEnterParams.sourceInfo) && o.LJ(this.buyerAddrId, skuEnterParams.buyerAddrId) && o.LJ(this.logisticsServiceID, skuEnterParams.logisticsServiceID) && o.LJ(this.productEnterContext, skuEnterParams.productEnterContext) && o.LJ(this.pdpFrom, skuEnterParams.pdpFrom) && o.LJ(this.oldPrice, skuEnterParams.oldPrice) && o.LJ(this.voucherTypeId, skuEnterParams.voucherTypeId) && o.LJ(this.pdpPageType, skuEnterParams.pdpPageType) && o.LJ(this.isFromBundleDeal, skuEnterParams.isFromBundleDeal) && o.LJ(this.previousPage, skuEnterParams.previousPage) && o.LJ(this.hidePdpEntrance, skuEnterParams.hidePdpEntrance) && o.LJ(this.bizType, skuEnterParams.bizType) && o.LJ(this.skuType, skuEnterParams.skuType) && o.LJ(this.displayFavouriteBtn, skuEnterParams.displayFavouriteBtn) && o.LJ(this.oneStepOrderType, skuEnterParams.oneStepOrderType);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            String str = this.productId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.pdpFullScreen;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            boolean z = this.needRequest;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (((hashCode2 + i) * 31) + this.clickFrom) * 31;
            String str2 = this.enterFrom;
            int hashCode3 = (i2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String[] strArr = this.checkedSkuIds;
            int hashCode4 = (hashCode3 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
            Integer num = this.productQuantity;
            int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            HashMap<String, Object> hashMap = this.trackParams;
            int hashCode6 = (hashCode5 + (hashMap == null ? 0 : hashMap.hashCode())) * 31;
            HashMap<String, Object> hashMap2 = this.orderRequestParams;
            int hashCode7 = (hashCode6 + (hashMap2 == null ? 0 : hashMap2.hashCode())) * 31;
            HashMap<String, Object> hashMap3 = this.visitReportParams;
            int hashCode8 = (hashCode7 + (hashMap3 == null ? 0 : hashMap3.hashCode())) * 31;
            Integer num2 = this.usePrefetch;
            int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str3 = this.sourceInfo;
            int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.buyerAddrId;
            int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.logisticsServiceID;
            int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
            HashMap<String, Object> hashMap4 = this.productEnterContext;
            int hashCode13 = (hashCode12 + (hashMap4 == null ? 0 : hashMap4.hashCode())) * 31;
            String str6 = this.pdpFrom;
            int hashCode14 = (hashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.oldPrice;
            int hashCode15 = (hashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.voucherTypeId;
            int hashCode16 = (hashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
            Integer num3 = this.pdpPageType;
            int hashCode17 = (hashCode16 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Boolean bool2 = this.isFromBundleDeal;
            int hashCode18 = (hashCode17 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str9 = this.previousPage;
            int hashCode19 = (hashCode18 + (str9 == null ? 0 : str9.hashCode())) * 31;
            Integer num4 = this.hidePdpEntrance;
            int hashCode20 = (hashCode19 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.bizType;
            int hashCode21 = (hashCode20 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.skuType;
            int hashCode22 = (hashCode21 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Integer num7 = this.displayFavouriteBtn;
            int hashCode23 = (hashCode22 + (num7 == null ? 0 : num7.hashCode())) * 31;
            Integer num8 = this.oneStepOrderType;
            return hashCode23 + (num8 != null ? num8.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("SkuEnterParams(productId=");
            sb.append(this.productId);
            sb.append(", pdpFullScreen=");
            sb.append(this.pdpFullScreen);
            sb.append(", needRequest=");
            sb.append(this.needRequest);
            sb.append(", clickFrom=");
            sb.append(this.clickFrom);
            sb.append(", enterFrom=");
            sb.append(this.enterFrom);
            sb.append(", checkedSkuIds=");
            sb.append(Arrays.toString(this.checkedSkuIds));
            sb.append(", productQuantity=");
            sb.append(this.productQuantity);
            sb.append(", trackParams=");
            sb.append(this.trackParams);
            sb.append(", orderRequestParams=");
            sb.append(this.orderRequestParams);
            sb.append(", visitReportParams=");
            sb.append(this.visitReportParams);
            sb.append(", usePrefetch=");
            sb.append(this.usePrefetch);
            sb.append(", sourceInfo=");
            sb.append(this.sourceInfo);
            sb.append(", buyerAddrId=");
            sb.append(this.buyerAddrId);
            sb.append(", logisticsServiceID=");
            sb.append(this.logisticsServiceID);
            sb.append(", productEnterContext=");
            sb.append(this.productEnterContext);
            sb.append(", pdpFrom=");
            sb.append(this.pdpFrom);
            sb.append(", oldPrice=");
            sb.append(this.oldPrice);
            sb.append(", voucherTypeId=");
            sb.append(this.voucherTypeId);
            sb.append(", pdpPageType=");
            sb.append(this.pdpPageType);
            sb.append(", isFromBundleDeal=");
            sb.append(this.isFromBundleDeal);
            sb.append(", previousPage=");
            sb.append(this.previousPage);
            sb.append(", hidePdpEntrance=");
            sb.append(this.hidePdpEntrance);
            sb.append(", bizType=");
            sb.append(this.bizType);
            sb.append(", skuType=");
            sb.append(this.skuType);
            sb.append(", displayFavouriteBtn=");
            sb.append(this.displayFavouriteBtn);
            sb.append(", oneStepOrderType=");
            return UC7.LIZ(sb, this.oneStepOrderType, ')');
        }

        public final Integer getBizType() {
            return this.bizType;
        }

        public final String getBuyerAddrId() {
            return this.buyerAddrId;
        }

        public final String[] getCheckedSkuIds() {
            return this.checkedSkuIds;
        }

        public final int getClickFrom() {
            return this.clickFrom;
        }

        public final Integer getDisplayFavouriteBtn() {
            return this.displayFavouriteBtn;
        }

        public final String getEnterFrom() {
            return this.enterFrom;
        }

        public final Integer getHidePdpEntrance() {
            return this.hidePdpEntrance;
        }

        public final String getLogisticsServiceID() {
            return this.logisticsServiceID;
        }

        public final boolean getNeedRequest() {
            return this.needRequest;
        }

        public final String getOldPrice() {
            return this.oldPrice;
        }

        public final Integer getOneStepOrderType() {
            return this.oneStepOrderType;
        }

        public final HashMap<String, Object> getOrderRequestParams() {
            return this.orderRequestParams;
        }

        public final String getPdpFrom() {
            return this.pdpFrom;
        }

        public final Boolean getPdpFullScreen() {
            return this.pdpFullScreen;
        }

        public final Integer getPdpPageType() {
            return this.pdpPageType;
        }

        public final String getPreviousPage() {
            return this.previousPage;
        }

        public final HashMap<String, Object> getProductEnterContext() {
            return this.productEnterContext;
        }

        public final String getProductId() {
            return this.productId;
        }

        public final Integer getProductQuantity() {
            return this.productQuantity;
        }

        public final Integer getSkuType() {
            return this.skuType;
        }

        public final String getSourceInfo() {
            return this.sourceInfo;
        }

        public final HashMap<String, Object> getTrackParams() {
            return this.trackParams;
        }

        public final Integer getUsePrefetch() {
            return this.usePrefetch;
        }

        public final HashMap<String, Object> getVisitReportParams() {
            return this.visitReportParams;
        }

        public final String getVoucherTypeId() {
            return this.voucherTypeId;
        }

        public final Boolean isFromBundleDeal() {
            return this.isFromBundleDeal;
        }

        public final void setProductQuantity(Integer num) {
            this.productQuantity = num;
        }

        public SkuEnterParams(String str, Boolean bool, boolean z, int i, String str2, String[] strArr, Integer num, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2, HashMap<String, Object> hashMap3, Integer num2, String str3, String str4, String str5, HashMap<String, Object> hashMap4, String str6, String str7, String str8, Integer num3, Boolean bool2, String str9, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8) {
            this.productId = str;
            this.pdpFullScreen = bool;
            this.needRequest = z;
            this.clickFrom = i;
            this.enterFrom = str2;
            this.checkedSkuIds = strArr;
            this.productQuantity = num;
            this.trackParams = hashMap;
            this.orderRequestParams = hashMap2;
            this.visitReportParams = hashMap3;
            this.usePrefetch = num2;
            this.sourceInfo = str3;
            this.buyerAddrId = str4;
            this.logisticsServiceID = str5;
            this.productEnterContext = hashMap4;
            this.pdpFrom = str6;
            this.oldPrice = str7;
            this.voucherTypeId = str8;
            this.pdpPageType = num3;
            this.isFromBundleDeal = bool2;
            this.previousPage = str9;
            this.hidePdpEntrance = num4;
            this.bizType = num5;
            this.skuType = num6;
            this.displayFavouriteBtn = num7;
            this.oneStepOrderType = num8;
        }

        public /* synthetic */ SkuEnterParams(String str, Boolean bool, boolean z, int i, String str2, String[] strArr, Integer num, HashMap hashMap, HashMap hashMap2, HashMap hashMap3, Integer num2, String str3, String str4, String str5, HashMap hashMap4, String str6, String str7, String str8, Integer num3, Boolean bool2, String str9, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, bool, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : strArr, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? null : hashMap, (i2 & 256) != 0 ? null : hashMap2, (i2 & 512) != 0 ? null : hashMap3, (i2 & 1024) != 0 ? null : num2, (i2 & 2048) != 0 ? null : str3, (i2 & 4096) != 0 ? null : str4, (i2 & FileUtils.BUFFER_SIZE) != 0 ? null : str5, (i2 & 16384) != 0 ? null : hashMap4, (32768 & i2) != 0 ? null : str6, (65536 & i2) != 0 ? null : str7, (131072 & i2) != 0 ? null : str8, (262144 & i2) != 0 ? null : num3, (524288 & i2) != 0 ? null : bool2, (1048576 & i2) != 0 ? null : str9, (2097152 & i2) != 0 ? null : num4, (4194304 & i2) != 0 ? null : num5, (8388608 & i2) != 0 ? null : num6, (16777216 & i2) != 0 ? null : num7, (i2 & 33554432) == 0 ? num8 : null);
        }
    }

    /* loaded from: classes5.dex */
    public static final class SkuKeyboardVisibilityParams {

        @InterfaceC65349Pkn("keyboard_visibility")
        public final boolean keyboardVisibility;

        public static /* synthetic */ SkuKeyboardVisibilityParams copy$default(SkuKeyboardVisibilityParams skuKeyboardVisibilityParams, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = skuKeyboardVisibilityParams.keyboardVisibility;
            }
            return skuKeyboardVisibilityParams.copy(z);
        }

        public final SkuKeyboardVisibilityParams copy(boolean z) {
            return new SkuKeyboardVisibilityParams(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SkuKeyboardVisibilityParams) && this.keyboardVisibility == ((SkuKeyboardVisibilityParams) obj).keyboardVisibility;
        }

        public int hashCode() {
            boolean z = this.keyboardVisibility;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SkuKeyboardVisibilityParams(keyboardVisibility=");
            return C48339Iy7.LIZJ(LIZ, this.keyboardVisibility, ')', LIZ);
        }

        public final boolean getKeyboardVisibility() {
            return this.keyboardVisibility;
        }

        public SkuKeyboardVisibilityParams(boolean z) {
            this.keyboardVisibility = z;
        }
    }

    /* loaded from: classes13.dex */
    public static final class SkuOperationParams {

        @InterfaceC65349Pkn("product_id")
        public final String productId;

        @InterfaceC65349Pkn("type")
        public final int type;

        public static /* synthetic */ SkuOperationParams copy$default(SkuOperationParams skuOperationParams, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = skuOperationParams.productId;
            }
            if ((i2 & 2) != 0) {
                i = skuOperationParams.type;
            }
            return skuOperationParams.copy(str, i);
        }

        public final SkuOperationParams copy(String productId, int i) {
            o.LJIIIZ(productId, "productId");
            return new SkuOperationParams(productId, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SkuOperationParams)) {
                return false;
            }
            SkuOperationParams skuOperationParams = (SkuOperationParams) obj;
            return o.LJ(this.productId, skuOperationParams.productId) && this.type == skuOperationParams.type;
        }

        public int hashCode() {
            return (this.productId.hashCode() * 31) + this.type;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SkuOperationParams(productId=");
            LIZ.append(this.productId);
            LIZ.append(", type=");
            return b0.LIZJ(LIZ, this.type, ')', LIZ);
        }

        public final String getProductId() {
            return this.productId;
        }

        public final int getType() {
            return this.type;
        }

        public SkuOperationParams(String productId, int i) {
            o.LJIIIZ(productId, "productId");
            this.productId = productId;
            this.type = i;
        }
    }

    /* loaded from: classes13.dex */
    public static final class SkuRenderParams {

        @InterfaceC65349Pkn("add_to_cart_button")
        public final AddToCartButton addToCartButton;

        @InterfaceC65349Pkn("checked_sku_ids")
        public String[] checkedSkuIds;

        @InterfaceC65349Pkn("click_spec_group_ids")
        public ArrayList<Integer> clickSpecGroupIds;

        @InterfaceC65349Pkn("enter_from")
        public final String enterFrom;

        @InterfaceC65349Pkn("product_image")
        public final Image mainPicture;

        @InterfaceC65349Pkn("payment_module")
        public final PdpPaymentModule paymentModule;

        @InterfaceC65349Pkn("product_price")
        public final ProductPrice price;

        @InterfaceC65349Pkn("product_id")
        public final String productId;

        @InterfaceC65349Pkn("product")
        public final ProductPackStruct productInfoPack;

        @InterfaceC65349Pkn("quantity")
        public Integer productQuantity;

        @InterfaceC65349Pkn("specs")
        public final List<SaleProp> salePropList;

        @InterfaceC65349Pkn("address_id")
        public String selectedAddressId;

        @InterfaceC65349Pkn("seller_id")
        public final String sellerId;

        @InterfaceC65349Pkn("skus")
        public final List<SkuItem> skuList;

        public final AddToCartButton getAddToCartButton() {
            return this.addToCartButton;
        }

        public final String[] getCheckedSkuIds() {
            return this.checkedSkuIds;
        }

        public final ArrayList<Integer> getClickSpecGroupIds() {
            return this.clickSpecGroupIds;
        }

        public final String getEnterFrom() {
            return this.enterFrom;
        }

        public final Image getMainPicture() {
            return this.mainPicture;
        }

        public final PdpPaymentModule getPaymentModule() {
            return this.paymentModule;
        }

        public final ProductPrice getPrice() {
            return this.price;
        }

        public final String getProductId() {
            return this.productId;
        }

        public final ProductPackStruct getProductInfoPack() {
            return this.productInfoPack;
        }

        public final Integer getProductQuantity() {
            return this.productQuantity;
        }

        public final List<SaleProp> getSalePropList() {
            return this.salePropList;
        }

        public final String getSelectedAddressId() {
            return this.selectedAddressId;
        }

        public final String getSellerId() {
            return this.sellerId;
        }

        public final List<SkuItem> getSkuList() {
            return this.skuList;
        }

        public final void setCheckedSkuIds(String[] strArr) {
            this.checkedSkuIds = strArr;
        }

        public final void setClickSpecGroupIds(ArrayList<Integer> arrayList) {
            this.clickSpecGroupIds = arrayList;
        }

        public final void setProductQuantity(Integer num) {
            this.productQuantity = num;
        }

        public final void setSelectedAddressId(String str) {
            this.selectedAddressId = str;
        }

        public SkuRenderParams(String productId, String[] strArr, Integer num, List<SkuItem> list, List<SaleProp> list2, String str, ProductPrice productPrice, Image image, String str2, AddToCartButton addToCartButton, PdpPaymentModule pdpPaymentModule, ProductPackStruct productPackStruct, String str3, ArrayList<Integer> arrayList) {
            o.LJIIIZ(productId, "productId");
            this.productId = productId;
            this.checkedSkuIds = strArr;
            this.productQuantity = num;
            this.skuList = list;
            this.salePropList = list2;
            this.enterFrom = str;
            this.price = productPrice;
            this.mainPicture = image;
            this.sellerId = str2;
            this.addToCartButton = addToCartButton;
            this.paymentModule = pdpPaymentModule;
            this.productInfoPack = productPackStruct;
            this.selectedAddressId = str3;
            this.clickSpecGroupIds = arrayList;
        }

        public /* synthetic */ SkuRenderParams(String str, String[] strArr, Integer num, List list, List list2, String str2, ProductPrice productPrice, Image image, String str3, AddToCartButton addToCartButton, PdpPaymentModule pdpPaymentModule, ProductPackStruct productPackStruct, String str4, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, strArr, num, list, list2, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : productPrice, (i & 128) != 0 ? null : image, str3, addToCartButton, pdpPaymentModule, productPackStruct, str4, (i & FileUtils.BUFFER_SIZE) == 0 ? arrayList : null);
        }
    }

    public static void LIZ(SkuPanelState skuPanelState) {
        C84654XKg c84654XKg = LIZ;
        if (c84654XKg != null) {
            C3C5.m7constructorimpl(skuPanelState);
            c84654XKg.resumeWith(skuPanelState);
        }
        LIZ = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter.PdpEnterParam LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter.SkuEnterParams r22) {
        /*
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            if (r22 == 0) goto L27
            java.lang.String r0 = r22.getProductId()
            if (r0 == 0) goto L16
            java.util.List r1 = X.C47261Igj.LJJIJ(r0)
            java.lang.String r0 = "product_id"
            r2.put(r0, r1)
        L16:
            java.util.HashMap r0 = r22.getOrderRequestParams()
            if (r0 == 0) goto L27
            java.lang.String r1 = "is_from_follow"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L27
            r2.put(r1, r0)
        L27:
            r7 = 0
            if (r22 == 0) goto L6a
            java.util.HashMap r3 = r22.getOrderRequestParams()
            java.util.HashMap r5 = r22.getVisitReportParams()
            java.util.HashMap r4 = r22.getTrackParams()
            java.lang.Boolean r0 = r22.getPdpFullScreen()
            if (r0 == 0) goto L6d
            boolean r6 = r0.booleanValue()
        L40:
            java.util.HashMap r13 = r22.getProductEnterContext()
            java.lang.Integer r19 = r22.getBizType()
        L48:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam r1 = new com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam
            r8 = 0
            r10 = 0
            r0 = r1
            r20 = 128992(0x1f7e0, float:1.80756E-40)
            r9 = r7
            r11 = r10
            r12 = r10
            r14 = r7
            r15 = r7
            r16 = r7
            r17 = r7
            r18 = r7
            r21 = r7
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            if (r22 == 0) goto L66
            java.lang.String r7 = r22.getSourceInfo()
        L66:
            r0.setSourceInfo(r7)
            return r0
        L6a:
            r3 = r7
            r5 = r7
            r4 = r7
        L6d:
            r6 = 0
            if (r22 == 0) goto L71
            goto L40
        L71:
            r13 = r7
            r19 = r7
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter.LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter$SkuEnterParams):com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam");
    }

    public static Map LIZJ(SkuEnterParams skuEnterParams, String str, HashMap hashMap) {
        boolean z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String productId = skuEnterParams.getProductId();
        if (productId == null) {
            productId = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("product_id", productId);
        Boolean pdpFullScreen = skuEnterParams.getPdpFullScreen();
        if (pdpFullScreen != null) {
            z = pdpFullScreen.booleanValue();
        } else {
            z = true;
        }
        linkedHashMap.put("needs_dim", Boolean.valueOf(z));
        linkedHashMap.put("need_request", Boolean.valueOf(skuEnterParams.getNeedRequest()));
        linkedHashMap.put("click_from", Integer.valueOf(skuEnterParams.getClickFrom()));
        String enterFrom = skuEnterParams.getEnterFrom();
        if (enterFrom != null) {
            linkedHashMap.put("enter_from", enterFrom);
        }
        Integer hidePdpEntrance = skuEnterParams.getHidePdpEntrance();
        if (hidePdpEntrance != null) {
            C61845OOz.LIZLLL(hidePdpEntrance, linkedHashMap, "hide_pdp_entrance");
        }
        Integer skuType = skuEnterParams.getSkuType();
        if (skuType != null) {
            C61845OOz.LIZLLL(skuType, linkedHashMap, "sku_type");
        }
        String[] checkedSkuIds = skuEnterParams.getCheckedSkuIds();
        if (checkedSkuIds != null) {
            linkedHashMap.put("checked_spec_ids", checkedSkuIds);
        }
        Integer productQuantity = skuEnterParams.getProductQuantity();
        if (productQuantity != null) {
            C61845OOz.LIZLLL(productQuantity, linkedHashMap, "quantity");
        }
        HashMap<String, Object> trackParams = skuEnterParams.getTrackParams();
        if (trackParams != null) {
            linkedHashMap.put("trackParams", trackParams);
            if (str != null && hashMap != null) {
                hashMap.put("previous_page", str);
            }
        }
        HashMap<String, Object> orderRequestParams = skuEnterParams.getOrderRequestParams();
        if (orderRequestParams != null) {
            linkedHashMap.put("orderRequestParams", orderRequestParams);
        }
        HashMap<String, Object> visitReportParams = skuEnterParams.getVisitReportParams();
        if (visitReportParams != null) {
            linkedHashMap.put("visitReportParams", visitReportParams);
        }
        String sourceInfo = skuEnterParams.getSourceInfo();
        if (sourceInfo != null) {
            linkedHashMap.put("source_info", sourceInfo);
        }
        String buyerAddrId = skuEnterParams.getBuyerAddrId();
        if (buyerAddrId != null) {
            linkedHashMap.put("buyer_addr_id", buyerAddrId);
        }
        String logisticsServiceID = skuEnterParams.getLogisticsServiceID();
        if (logisticsServiceID != null) {
            linkedHashMap.put("logistics_service_id", logisticsServiceID);
        }
        String pdpFrom = skuEnterParams.getPdpFrom();
        if (pdpFrom != null) {
            linkedHashMap.put("pdp_from", pdpFrom);
        }
        String oldPrice = skuEnterParams.getOldPrice();
        if (oldPrice != null) {
            linkedHashMap.put("old_price", oldPrice);
        }
        String voucherTypeId = skuEnterParams.getVoucherTypeId();
        if (voucherTypeId != null) {
            linkedHashMap.put("voucher_type_id", voucherTypeId);
        }
        Integer pdpPageType = skuEnterParams.getPdpPageType();
        if (pdpPageType != null) {
            C61845OOz.LIZLLL(pdpPageType, linkedHashMap, "pdp_page_type");
        }
        linkedHashMap.put("start_click_time", Long.valueOf(System.currentTimeMillis()));
        Integer bizType = skuEnterParams.getBizType();
        if (bizType != null) {
            C61845OOz.LIZLLL(bizType, linkedHashMap, "biz_type");
        }
        return linkedHashMap;
    }

    public static Object LJ(Context context, SkuEnterParams skuEnterParams, String str, InterfaceC71003Rtn interfaceC71003Rtn, InterfaceC67352kd interfaceC67352kd) {
        if (skuEnterParams.getProductId() == null) {
            return null;
        }
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        LIZ = c84654XKg;
        SmartRoute LIZIZ2 = C26867AgZ.LIZIZ(context, "aweme://ec/sku", LIZJ(skuEnterParams, str, skuEnterParams.getTrackParams()), false);
        if (interfaceC71003Rtn != null) {
            C79234V7u.LJJIJIIJIL(LIZIZ2, interfaceC71003Rtn, null);
        }
        LIZIZ2.open();
        return c84654XKg.LIZ();
    }

    public static Object LIZLLL(Context context, SkuEnterParams skuEnterParams, String str, InterfaceC71003Rtn interfaceC71003Rtn, int i, String str2, ProductPackStruct productPackStruct, boolean z, C69821Raj c69821Raj) {
        int i2;
        SkcInfo skcInfo;
        String str3;
        String builder;
        if (skuEnterParams.getProductId() == null) {
            return null;
        }
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(c69821Raj));
        LIZ = c84654XKg;
        Map LIZJ2 = LIZJ(skuEnterParams, str, skuEnterParams.getTrackParams());
        if (i == 2) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        LIZJ2.put("is_add_to_cart", Integer.valueOf(i2));
        LIZJ2.put("is_from_pdp", 1);
        LIZJ2.put("page_hash", str2);
        LIZJ2.put("sku_type", Integer.valueOf(EnumC70126Rfe.SKC.getValue()));
        LIZJ2.put("adjust_minipdp", 1);
        if (z) {
            if (C1XY.LJIL() && productPackStruct != null && (skcInfo = productPackStruct.skcInfo) != null && (str3 = skcInfo.miniPanelSchema) != null && (builder = C26867AgZ.LIZJ(str3, LIZJ2).toString()) != null) {
                M2D m2d = new M2D();
                m2d.LJIILLIIL = builder;
                if (productPackStruct != null) {
                    m2d.LIZ = TemplateData.LJFF(C27739Aud.LJI(productPackStruct));
                }
                O9C.LIZJ(context, m2d);
            }
        } else if (productPackStruct != null && productPackStruct.LIZLLL()) {
            SmartRoute LIZIZ2 = C26867AgZ.LIZIZ(context, "aweme://ec/sku", LIZJ2, false);
            if (interfaceC71003Rtn != null) {
                C79234V7u.LJJIJIIJIL(LIZIZ2, interfaceC71003Rtn, null);
            }
            LIZIZ2.open();
        }
        return c84654XKg.LIZ();
    }
}
