package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C07670Rv;
import X.C28019Az9;
import X.C32I;
import X.C78983UzD;
import X.EnumC28010Az0;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.google.android.play.core.appupdate.u;
import com.google.gson.m;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Promotion;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.extrafee.ExtraFeeStatement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonConfig;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.global.osp.dto.UserTrustModule;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import defpackage.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BillInfoData {

    @InterfaceC65349Pkn("addon_order")
    public final AddonOrder addonOrder;

    @InterfaceC65349Pkn("address_input_item")
    public final InputItemData addressInputItemData;

    @InterfaceC65349Pkn("announcements")
    public final List<Announcement> announcement;

    @InterfaceC65349Pkn("auto_claimed_vouchers")
    public final List<com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher> autoVouchers;

    @InterfaceC65349Pkn("begin_render_chunk")
    public final Boolean beginRenderChunk;

    @InterfaceC65349Pkn("bill_info_server_params")
    public final String billInfoParams;

    @InterfaceC65349Pkn("bottom_notice")
    public final OSPBottomNotice bottomNotice;

    @InterfaceC65349Pkn("button_pop_tips")
    public final String buttonPopTips;

    @InterfaceC65349Pkn("buyer_protection_program")
    public final LinkRichText buyerProtectionProgram;

    @InterfaceC65349Pkn("chunk_debug_info")
    public final ChunkDebugInfo chunkDebugInfo;

    @InterfaceC65349Pkn("cpf_info")
    public final BillCpfInfo cpfInfo;

    @InterfaceC65349Pkn("create_order_info_from_bill")
    public final String createOrderInfoFromBill;

    @InterfaceC65349Pkn("da_info")
    public final String daInfo;

    @InterfaceC65349Pkn("exception_ux")
    public final ExceptionUX exceptionUX;

    @InterfaceC65349Pkn("extra_fee_statement")
    public final ExtraFeeStatement extraFeeStatement;
    public Boolean isFromChunk;

    @InterfaceC65349Pkn("last_chunk")
    public final Boolean lastChunk;

    @InterfaceC65349Pkn("logistic_data")
    public final LogisticData logisticData;

    @InterfaceC65349Pkn("shop_orders_new")
    public final List<ShopOrderNew> newShopOrders;

    @InterfaceC65349Pkn("order_secret")
    public final String orderSecret;

    @InterfaceC65349Pkn("payment_methods")
    public final PaymentMethodsData paymentMethods;

    @InterfaceC65349Pkn("payment_summary")
    public final List<PaymentBillSummary> paymentSummary;

    @InterfaceC65349Pkn("place_order_button_text")
    public final StarlingKeyValue placeOrderButtonText;

    @InterfaceC65349Pkn("platform_promotion")
    public final PlatformPromotion platformPromotion;

    @InterfaceC65349Pkn("policy_data")
    public final PolicyModule policyModule;

    @InterfaceC65349Pkn("pre_risk_param")
    public final m preRiskParam;

    @InterfaceC65349Pkn("privacy_policy_statement")
    public final LinkRichText privacyPolicyStatement;

    @InterfaceC65349Pkn("promotion_da_info")
    public final String promotionDaInfo;

    @InterfaceC65349Pkn("layout")
    public final Map<String, ModuleLayout> remoteLayoutMap;

    @InterfaceC65349Pkn("request_id")
    public final String requestId;

    @InterfaceC65349Pkn("schema_info")
    public final DynamicSchema schemaInfo;

    @InterfaceC65349Pkn("shipping_address")
    public final ShippingAddress shippingAddress;

    @InterfaceC65349Pkn("sku_common_config")
    public final SkuCommonConfig skuCommonConfig;

    @InterfaceC65349Pkn("starling_texts")
    public final BillStarling starlingTexts;

    @InterfaceC65349Pkn("summary")
    public final Summary summary;

    @InterfaceC65349Pkn("toast")
    public final String toast;

    @InterfaceC65349Pkn("top_notice")
    public final String topNotice;

    @InterfaceC65349Pkn("user_trust_module")
    public final UserTrustModule userTrustModule;

    @InterfaceC65349Pkn("version")
    public final String version;

    public static /* synthetic */ BillInfoData copy$default(BillInfoData billInfoData, AddonOrder addonOrder, Map map, List list, Summary summary, ShippingAddress shippingAddress, ExceptionUX exceptionUX, InputItemData inputItemData, PaymentMethodsData paymentMethodsData, String str, DynamicSchema dynamicSchema, OSPBottomNotice oSPBottomNotice, String str2, LinkRichText linkRichText, StarlingKeyValue starlingKeyValue, List list2, PlatformPromotion platformPromotion, String str3, String str4, List list3, String str5, ExtraFeeStatement extraFeeStatement, String str6, SkuCommonConfig skuCommonConfig, String str7, Boolean bool, Boolean bool2, String str8, m mVar, BillCpfInfo billCpfInfo, Boolean bool3, String str9, LogisticData logisticData, PolicyModule policyModule, UserTrustModule userTrustModule, BillStarling billStarling, List list4, LinkRichText linkRichText2, ChunkDebugInfo chunkDebugInfo, String str10, int i, int i2, Object obj) {
        LinkRichText linkRichText3 = linkRichText;
        String str11 = str2;
        OSPBottomNotice oSPBottomNotice2 = oSPBottomNotice;
        DynamicSchema dynamicSchema2 = dynamicSchema;
        String str12 = str;
        PaymentMethodsData paymentMethodsData2 = paymentMethodsData;
        InputItemData inputItemData2 = inputItemData;
        StarlingKeyValue starlingKeyValue2 = starlingKeyValue;
        Map map2 = map;
        AddonOrder addonOrder2 = addonOrder;
        List list5 = list;
        Summary summary2 = summary;
        ShippingAddress shippingAddress2 = shippingAddress;
        ExceptionUX exceptionUX2 = exceptionUX;
        List list6 = list4;
        BillStarling billStarling2 = billStarling;
        PolicyModule policyModule2 = policyModule;
        LogisticData logisticData2 = logisticData;
        String str13 = str5;
        List list7 = list3;
        String str14 = str4;
        LinkRichText linkRichText4 = linkRichText2;
        String str15 = str3;
        List list8 = list2;
        PlatformPromotion platformPromotion2 = platformPromotion;
        ExtraFeeStatement extraFeeStatement2 = extraFeeStatement;
        String str16 = str6;
        String str17 = str9;
        SkuCommonConfig skuCommonConfig2 = skuCommonConfig;
        UserTrustModule userTrustModule2 = userTrustModule;
        String str18 = str7;
        String str19 = str10;
        Boolean bool4 = bool;
        Boolean bool5 = bool2;
        ChunkDebugInfo chunkDebugInfo2 = chunkDebugInfo;
        String str20 = str8;
        m mVar2 = mVar;
        BillCpfInfo billCpfInfo2 = billCpfInfo;
        Boolean bool6 = bool3;
        if ((i & 1) != 0) {
            addonOrder2 = billInfoData.addonOrder;
        }
        if ((i & 2) != 0) {
            map2 = billInfoData.remoteLayoutMap;
        }
        if ((i & 4) != 0) {
            list5 = billInfoData.announcement;
        }
        if ((i & 8) != 0) {
            summary2 = billInfoData.summary;
        }
        if ((i & 16) != 0) {
            shippingAddress2 = billInfoData.shippingAddress;
        }
        if ((i & 32) != 0) {
            exceptionUX2 = billInfoData.exceptionUX;
        }
        if ((i & 64) != 0) {
            inputItemData2 = billInfoData.addressInputItemData;
        }
        if ((i & 128) != 0) {
            paymentMethodsData2 = billInfoData.paymentMethods;
        }
        if ((i & 256) != 0) {
            str12 = billInfoData.orderSecret;
        }
        if ((i & 512) != 0) {
            dynamicSchema2 = billInfoData.schemaInfo;
        }
        if ((i & 1024) != 0) {
            oSPBottomNotice2 = billInfoData.bottomNotice;
        }
        if ((i & 2048) != 0) {
            str11 = billInfoData.topNotice;
        }
        if ((i & 4096) != 0) {
            linkRichText3 = billInfoData.privacyPolicyStatement;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            starlingKeyValue2 = billInfoData.placeOrderButtonText;
        }
        if ((i & 16384) != 0) {
            list8 = billInfoData.newShopOrders;
        }
        if ((32768 & i) != 0) {
            platformPromotion2 = billInfoData.platformPromotion;
        }
        if ((65536 & i) != 0) {
            str15 = billInfoData.buttonPopTips;
        }
        if ((131072 & i) != 0) {
            str14 = billInfoData.version;
        }
        if ((262144 & i) != 0) {
            list7 = billInfoData.autoVouchers;
        }
        if ((524288 & i) != 0) {
            str13 = billInfoData.requestId;
        }
        if ((1048576 & i) != 0) {
            extraFeeStatement2 = billInfoData.extraFeeStatement;
        }
        if ((2097152 & i) != 0) {
            str16 = billInfoData.daInfo;
        }
        if ((4194304 & i) != 0) {
            skuCommonConfig2 = billInfoData.skuCommonConfig;
        }
        if ((8388608 & i) != 0) {
            str18 = billInfoData.toast;
        }
        if ((16777216 & i) != 0) {
            bool4 = billInfoData.beginRenderChunk;
        }
        if ((33554432 & i) != 0) {
            bool5 = billInfoData.lastChunk;
        }
        if ((67108864 & i) != 0) {
            str20 = billInfoData.promotionDaInfo;
        }
        if ((134217728 & i) != 0) {
            mVar2 = billInfoData.preRiskParam;
        }
        if ((268435456 & i) != 0) {
            billCpfInfo2 = billInfoData.cpfInfo;
        }
        if ((536870912 & i) != 0) {
            bool6 = billInfoData.isFromChunk;
        }
        if ((1073741824 & i) != 0) {
            str17 = billInfoData.createOrderInfoFromBill;
        }
        if ((i & LiveLayoutPreloadThreadPriority.DEFAULT) != 0) {
            logisticData2 = billInfoData.logisticData;
        }
        if ((i2 & 1) != 0) {
            policyModule2 = billInfoData.policyModule;
        }
        if ((i2 & 2) != 0) {
            userTrustModule2 = billInfoData.userTrustModule;
        }
        if ((i2 & 4) != 0) {
            billStarling2 = billInfoData.starlingTexts;
        }
        if ((i2 & 8) != 0) {
            list6 = billInfoData.paymentSummary;
        }
        if ((i2 & 16) != 0) {
            linkRichText4 = billInfoData.buyerProtectionProgram;
        }
        if ((i2 & 32) != 0) {
            chunkDebugInfo2 = billInfoData.chunkDebugInfo;
        }
        if ((i2 & 64) != 0) {
            str19 = billInfoData.billInfoParams;
        }
        return billInfoData.copy(addonOrder2, map2, list5, summary2, shippingAddress2, exceptionUX2, inputItemData2, paymentMethodsData2, str12, dynamicSchema2, oSPBottomNotice2, str11, linkRichText3, starlingKeyValue2, list8, platformPromotion2, str15, str14, list7, str13, extraFeeStatement2, str16, skuCommonConfig2, str18, bool4, bool5, str20, mVar2, billCpfInfo2, bool6, str17, logisticData2, policyModule2, userTrustModule2, billStarling2, list6, linkRichText4, chunkDebugInfo2, str19);
    }

    public static /* synthetic */ void getBottomNotice$annotations() {
    }

    public static /* synthetic */ void getTopNotice$annotations() {
    }

    public final BillInfoData copy(AddonOrder addonOrder, Map<String, ModuleLayout> map, List<Announcement> list, Summary summary, ShippingAddress shippingAddress, ExceptionUX exceptionUX, InputItemData inputItemData, PaymentMethodsData paymentMethodsData, String str, DynamicSchema dynamicSchema, OSPBottomNotice oSPBottomNotice, String str2, LinkRichText linkRichText, StarlingKeyValue starlingKeyValue, List<ShopOrderNew> list2, PlatformPromotion platformPromotion, String str3, String str4, List<com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher> list3, String str5, ExtraFeeStatement extraFeeStatement, String str6, SkuCommonConfig skuCommonConfig, String str7, Boolean bool, Boolean bool2, String str8, m mVar, BillCpfInfo billCpfInfo, Boolean bool3, String str9, LogisticData logisticData, PolicyModule policyModule, UserTrustModule userTrustModule, BillStarling billStarling, List<PaymentBillSummary> list4, LinkRichText linkRichText2, ChunkDebugInfo chunkDebugInfo, String str10) {
        return new BillInfoData(addonOrder, map, list, summary, shippingAddress, exceptionUX, inputItemData, paymentMethodsData, str, dynamicSchema, oSPBottomNotice, str2, linkRichText, starlingKeyValue, list2, platformPromotion, str3, str4, list3, str5, extraFeeStatement, str6, skuCommonConfig, str7, bool, bool2, str8, mVar, billCpfInfo, bool3, str9, logisticData, policyModule, userTrustModule, billStarling, list4, linkRichText2, chunkDebugInfo, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillInfoData)) {
            return false;
        }
        BillInfoData billInfoData = (BillInfoData) obj;
        return o.LJ(this.addonOrder, billInfoData.addonOrder) && o.LJ(this.remoteLayoutMap, billInfoData.remoteLayoutMap) && o.LJ(this.announcement, billInfoData.announcement) && o.LJ(this.summary, billInfoData.summary) && o.LJ(this.shippingAddress, billInfoData.shippingAddress) && o.LJ(this.exceptionUX, billInfoData.exceptionUX) && o.LJ(this.addressInputItemData, billInfoData.addressInputItemData) && o.LJ(this.paymentMethods, billInfoData.paymentMethods) && o.LJ(this.orderSecret, billInfoData.orderSecret) && o.LJ(this.schemaInfo, billInfoData.schemaInfo) && o.LJ(this.bottomNotice, billInfoData.bottomNotice) && o.LJ(this.topNotice, billInfoData.topNotice) && o.LJ(this.privacyPolicyStatement, billInfoData.privacyPolicyStatement) && o.LJ(this.placeOrderButtonText, billInfoData.placeOrderButtonText) && o.LJ(this.newShopOrders, billInfoData.newShopOrders) && o.LJ(this.platformPromotion, billInfoData.platformPromotion) && o.LJ(this.buttonPopTips, billInfoData.buttonPopTips) && o.LJ(this.version, billInfoData.version) && o.LJ(this.autoVouchers, billInfoData.autoVouchers) && o.LJ(this.requestId, billInfoData.requestId) && o.LJ(this.extraFeeStatement, billInfoData.extraFeeStatement) && o.LJ(this.daInfo, billInfoData.daInfo) && o.LJ(this.skuCommonConfig, billInfoData.skuCommonConfig) && o.LJ(this.toast, billInfoData.toast) && o.LJ(this.beginRenderChunk, billInfoData.beginRenderChunk) && o.LJ(this.lastChunk, billInfoData.lastChunk) && o.LJ(this.promotionDaInfo, billInfoData.promotionDaInfo) && o.LJ(this.preRiskParam, billInfoData.preRiskParam) && o.LJ(this.cpfInfo, billInfoData.cpfInfo) && o.LJ(this.isFromChunk, billInfoData.isFromChunk) && o.LJ(this.createOrderInfoFromBill, billInfoData.createOrderInfoFromBill) && o.LJ(this.logisticData, billInfoData.logisticData) && o.LJ(this.policyModule, billInfoData.policyModule) && o.LJ(this.userTrustModule, billInfoData.userTrustModule) && o.LJ(this.starlingTexts, billInfoData.starlingTexts) && o.LJ(this.paymentSummary, billInfoData.paymentSummary) && o.LJ(this.buyerProtectionProgram, billInfoData.buyerProtectionProgram) && o.LJ(this.chunkDebugInfo, billInfoData.chunkDebugInfo) && o.LJ(this.billInfoParams, billInfoData.billInfoParams);
    }

    public int hashCode() {
        AddonOrder addonOrder = this.addonOrder;
        int hashCode = (addonOrder == null ? 0 : addonOrder.hashCode()) * 31;
        Map<String, ModuleLayout> map = this.remoteLayoutMap;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        List<Announcement> list = this.announcement;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Summary summary = this.summary;
        int hashCode4 = (hashCode3 + (summary == null ? 0 : summary.hashCode())) * 31;
        ShippingAddress shippingAddress = this.shippingAddress;
        int hashCode5 = (hashCode4 + (shippingAddress == null ? 0 : shippingAddress.hashCode())) * 31;
        ExceptionUX exceptionUX = this.exceptionUX;
        int hashCode6 = (hashCode5 + (exceptionUX == null ? 0 : exceptionUX.hashCode())) * 31;
        InputItemData inputItemData = this.addressInputItemData;
        int hashCode7 = (hashCode6 + (inputItemData == null ? 0 : inputItemData.hashCode())) * 31;
        PaymentMethodsData paymentMethodsData = this.paymentMethods;
        int hashCode8 = (hashCode7 + (paymentMethodsData == null ? 0 : paymentMethodsData.hashCode())) * 31;
        String str = this.orderSecret;
        int hashCode9 = (hashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        DynamicSchema dynamicSchema = this.schemaInfo;
        int hashCode10 = (hashCode9 + (dynamicSchema == null ? 0 : dynamicSchema.hashCode())) * 31;
        OSPBottomNotice oSPBottomNotice = this.bottomNotice;
        int hashCode11 = (hashCode10 + (oSPBottomNotice == null ? 0 : oSPBottomNotice.hashCode())) * 31;
        String str2 = this.topNotice;
        int hashCode12 = (hashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LinkRichText linkRichText = this.privacyPolicyStatement;
        int hashCode13 = (hashCode12 + (linkRichText == null ? 0 : linkRichText.hashCode())) * 31;
        StarlingKeyValue starlingKeyValue = this.placeOrderButtonText;
        int hashCode14 = (hashCode13 + (starlingKeyValue == null ? 0 : starlingKeyValue.hashCode())) * 31;
        List<ShopOrderNew> list2 = this.newShopOrders;
        int hashCode15 = (hashCode14 + (list2 == null ? 0 : list2.hashCode())) * 31;
        PlatformPromotion platformPromotion = this.platformPromotion;
        int hashCode16 = (hashCode15 + (platformPromotion == null ? 0 : platformPromotion.hashCode())) * 31;
        String str3 = this.buttonPopTips;
        int hashCode17 = (hashCode16 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.version;
        int hashCode18 = (hashCode17 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher> list3 = this.autoVouchers;
        int hashCode19 = (hashCode18 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str5 = this.requestId;
        int hashCode20 = (hashCode19 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ExtraFeeStatement extraFeeStatement = this.extraFeeStatement;
        int hashCode21 = (hashCode20 + (extraFeeStatement == null ? 0 : extraFeeStatement.hashCode())) * 31;
        String str6 = this.daInfo;
        int hashCode22 = (hashCode21 + (str6 == null ? 0 : str6.hashCode())) * 31;
        SkuCommonConfig skuCommonConfig = this.skuCommonConfig;
        int hashCode23 = (hashCode22 + (skuCommonConfig == null ? 0 : skuCommonConfig.hashCode())) * 31;
        String str7 = this.toast;
        int hashCode24 = (hashCode23 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.beginRenderChunk;
        int hashCode25 = (hashCode24 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.lastChunk;
        int hashCode26 = (hashCode25 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str8 = this.promotionDaInfo;
        int hashCode27 = (hashCode26 + (str8 == null ? 0 : str8.hashCode())) * 31;
        m mVar = this.preRiskParam;
        int hashCode28 = (hashCode27 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        BillCpfInfo billCpfInfo = this.cpfInfo;
        int hashCode29 = (hashCode28 + (billCpfInfo == null ? 0 : billCpfInfo.hashCode())) * 31;
        Boolean bool3 = this.isFromChunk;
        int hashCode30 = (hashCode29 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str9 = this.createOrderInfoFromBill;
        int hashCode31 = (hashCode30 + (str9 == null ? 0 : str9.hashCode())) * 31;
        LogisticData logisticData = this.logisticData;
        int hashCode32 = (hashCode31 + (logisticData == null ? 0 : logisticData.hashCode())) * 31;
        PolicyModule policyModule = this.policyModule;
        int hashCode33 = (hashCode32 + (policyModule == null ? 0 : policyModule.hashCode())) * 31;
        UserTrustModule userTrustModule = this.userTrustModule;
        int hashCode34 = (hashCode33 + (userTrustModule == null ? 0 : userTrustModule.hashCode())) * 31;
        BillStarling billStarling = this.starlingTexts;
        int hashCode35 = (hashCode34 + (billStarling == null ? 0 : billStarling.hashCode())) * 31;
        List<PaymentBillSummary> list4 = this.paymentSummary;
        int hashCode36 = (hashCode35 + (list4 == null ? 0 : list4.hashCode())) * 31;
        LinkRichText linkRichText2 = this.buyerProtectionProgram;
        int hashCode37 = (hashCode36 + (linkRichText2 == null ? 0 : linkRichText2.hashCode())) * 31;
        ChunkDebugInfo chunkDebugInfo = this.chunkDebugInfo;
        int hashCode38 = (hashCode37 + (chunkDebugInfo == null ? 0 : chunkDebugInfo.hashCode())) * 31;
        String str10 = this.billInfoParams;
        return hashCode38 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String getBuyerAddressId() {
        Address shippingAddress;
        ShippingAddress shippingAddress2 = this.shippingAddress;
        if (shippingAddress2 != null && (shippingAddress = shippingAddress2.getShippingAddress()) != null) {
            return shippingAddress.id;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String[] getLayout() {
        Object obj;
        int i;
        String value;
        String str;
        Map<String, ModuleLayout> map = this.remoteLayoutMap;
        if (map == null || map.isEmpty()) {
            C78983UzD.LJIIZILJ(new RuntimeException("orderSubmit layout is null or empty"));
            return new String[0];
        }
        TreeMap treeMap = new TreeMap();
        Map<String, ModuleLayout> map2 = this.remoteLayoutMap;
        if (map2 != null) {
            for (Map.Entry<String, ModuleLayout> entry : map2.entrySet()) {
                String key = entry.getKey();
                ModuleLayout value2 = entry.getValue();
                value2.getClass();
                Map<String, String> map3 = value2.module_config;
                if (map3 != null && (str = map3.get("position")) != null) {
                    i = CastIntegerProtector.parseInt(str);
                } else {
                    i = 0;
                }
                Map<String, String> map4 = value2.module_config;
                if (map4 == null || (value = map4.get("style")) == null) {
                    value = EnumC28010Az0.OSP_PAGE.getValue();
                }
                C28019Az9 c28019Az9 = new C28019Az9(i, value);
                if (ujb.o.LJJJJIZL((String) c28019Az9.LJLJI, EnumC28010Az0.OSP_PAGE.getValue(), true)) {
                    treeMap.put(Integer.valueOf(c28019Az9.LJLILLLLZI), key);
                }
            }
        }
        int size = treeMap.size();
        String[] strArr = new String[size];
        for (int i2 = 0; i2 < size; i2++) {
            Map.Entry pollFirstEntry = treeMap.pollFirstEntry();
            if (pollFirstEntry == null || (obj = pollFirstEntry.getValue()) == null) {
                obj = "";
            }
            strArr[i2] = obj;
        }
        return strArr;
    }

    public final int getTotalItems() {
        int i;
        List<ShopOrderNew> list = this.newShopOrders;
        int i2 = 0;
        if (list != null) {
            Iterator<ShopOrderNew> it = list.iterator();
            i2 = 0;
            while (it.hasNext()) {
                List<MainOrderInfo> list2 = it.next().mainOrderInfos;
                if (list2 != null) {
                    Iterator<MainOrderInfo> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        List<PackedSku> list3 = it2.next().packedSkus;
                        if (list3 != null) {
                            i = list3.size();
                        } else {
                            i = 0;
                        }
                        i2 += i;
                    }
                }
            }
        }
        return i2;
    }

    public final boolean hasAddress() {
        boolean z;
        Address shippingAddress;
        List<AddressItem> list;
        ShippingAddress shippingAddress2 = this.shippingAddress;
        if (shippingAddress2 == null || (shippingAddress = shippingAddress2.getShippingAddress()) == null || (list = shippingAddress.items) == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public final boolean hasCpfInfo() {
        Map<String, ModuleLayout> map = this.remoteLayoutMap;
        if (map != null) {
            return map.containsKey("cpf");
        }
        return false;
    }

    public final boolean hasPromotion() {
        Price total;
        List<Promotion> promotions;
        Price total2;
        List<Promotion> promotions2;
        Price price;
        List<Promotion> promotions3;
        List<ShopOrderNew> list = this.newShopOrders;
        if (list != null) {
            for (ShopOrderNew shopOrderNew : list) {
                List<MainOrderInfo> list2 = shopOrderNew.mainOrderInfos;
                if (list2 != null) {
                    Iterator<MainOrderInfo> it = list2.iterator();
                    while (it.hasNext()) {
                        List<PackedSku> list3 = it.next().packedSkus;
                        if (list3 != null) {
                            Iterator<PackedSku> it2 = list3.iterator();
                            while (it2.hasNext()) {
                                SkuPrice price2 = it2.next().getPrice();
                                if (price2 != null && (price = price2.realPrice) != null && (promotions3 = price.getPromotions()) != null && (!promotions3.isEmpty())) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                ShopBill shopBill = shopOrderNew.shopBill;
                if (shopBill != null && (total2 = shopBill.getTotal()) != null && (promotions2 = total2.getPromotions()) != null && (!promotions2.isEmpty())) {
                    return true;
                }
            }
        }
        Summary summary = this.summary;
        if (summary == null || (total = summary.getTotal()) == null || (promotions = total.getPromotions()) == null) {
            return false;
        }
        return !promotions.isEmpty();
    }

    public final boolean isEmpty() {
        if (this.newShopOrders == null && this.summary == null && this.shippingAddress == null) {
            return true;
        }
        return false;
    }

    public final boolean reachableAny() {
        List<ShopOrderNew> list = this.newShopOrders;
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<ShopOrderNew> it = list.iterator();
        while (it.hasNext()) {
            List<MainOrderInfo> list2 = it.next().mainOrderInfos;
            if (list2 != null && !list2.isEmpty()) {
                Iterator<MainOrderInfo> it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (o.LJ(it2.next().reachable, Boolean.TRUE)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BillInfoData(addonOrder=");
        sb.append(this.addonOrder);
        sb.append(", remoteLayoutMap=");
        sb.append(this.remoteLayoutMap);
        sb.append(", announcement=");
        sb.append(this.announcement);
        sb.append(", summary=");
        sb.append(this.summary);
        sb.append(", shippingAddress=");
        sb.append(this.shippingAddress);
        sb.append(", exceptionUX=");
        sb.append(this.exceptionUX);
        sb.append(", addressInputItemData=");
        sb.append(this.addressInputItemData);
        sb.append(", paymentMethods=");
        sb.append(this.paymentMethods);
        sb.append(", orderSecret=");
        sb.append(this.orderSecret);
        sb.append(", schemaInfo=");
        sb.append(this.schemaInfo);
        sb.append(", bottomNotice=");
        sb.append(this.bottomNotice);
        sb.append(", topNotice=");
        sb.append(this.topNotice);
        sb.append(", privacyPolicyStatement=");
        sb.append(this.privacyPolicyStatement);
        sb.append(", placeOrderButtonText=");
        sb.append(this.placeOrderButtonText);
        sb.append(", newShopOrders=");
        sb.append(this.newShopOrders);
        sb.append(", platformPromotion=");
        sb.append(this.platformPromotion);
        sb.append(", buttonPopTips=");
        sb.append(this.buttonPopTips);
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", autoVouchers=");
        sb.append(this.autoVouchers);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", extraFeeStatement=");
        sb.append(this.extraFeeStatement);
        sb.append(", daInfo=");
        sb.append(this.daInfo);
        sb.append(", skuCommonConfig=");
        sb.append(this.skuCommonConfig);
        sb.append(", toast=");
        sb.append(this.toast);
        sb.append(", beginRenderChunk=");
        sb.append(this.beginRenderChunk);
        sb.append(", lastChunk=");
        sb.append(this.lastChunk);
        sb.append(", promotionDaInfo=");
        sb.append(this.promotionDaInfo);
        sb.append(", preRiskParam=");
        sb.append(this.preRiskParam);
        sb.append(", cpfInfo=");
        sb.append(this.cpfInfo);
        sb.append(", isFromChunk=");
        sb.append(this.isFromChunk);
        sb.append(", createOrderInfoFromBill=");
        sb.append(this.createOrderInfoFromBill);
        sb.append(", logisticData=");
        sb.append(this.logisticData);
        sb.append(", policyModule=");
        sb.append(this.policyModule);
        sb.append(", userTrustModule=");
        sb.append(this.userTrustModule);
        sb.append(", starlingTexts=");
        sb.append(this.starlingTexts);
        sb.append(", paymentSummary=");
        sb.append(this.paymentSummary);
        sb.append(", buyerProtectionProgram=");
        sb.append(this.buyerProtectionProgram);
        sb.append(", chunkDebugInfo=");
        sb.append(this.chunkDebugInfo);
        sb.append(", billInfoParams=");
        return C07670Rv.LIZIZ(sb, this.billInfoParams, ')');
    }

    public final AddonOrder getAddonOrder() {
        return this.addonOrder;
    }

    public final InputItemData getAddressInputItemData() {
        return this.addressInputItemData;
    }

    public final List<Announcement> getAnnouncement() {
        return this.announcement;
    }

    public final List<com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher> getAutoVouchers() {
        return this.autoVouchers;
    }

    public final Boolean getBeginRenderChunk() {
        return this.beginRenderChunk;
    }

    public final String getBillInfoParams() {
        return this.billInfoParams;
    }

    public final OSPBottomNotice getBottomNotice() {
        return this.bottomNotice;
    }

    public final String getButtonPopTips() {
        return this.buttonPopTips;
    }

    public final LinkRichText getBuyerProtectionProgram() {
        return this.buyerProtectionProgram;
    }

    public final ChunkDebugInfo getChunkDebugInfo() {
        return this.chunkDebugInfo;
    }

    public final BillCpfInfo getCpfInfo() {
        return this.cpfInfo;
    }

    public final String getCreateOrderInfoFromBill() {
        return this.createOrderInfoFromBill;
    }

    public final String getDaInfo() {
        return this.daInfo;
    }

    public final ExceptionUX getExceptionUX() {
        return this.exceptionUX;
    }

    public final ExtraFeeStatement getExtraFeeStatement() {
        return this.extraFeeStatement;
    }

    public final Boolean getLastChunk() {
        return this.lastChunk;
    }

    public final LogisticData getLogisticData() {
        return this.logisticData;
    }

    public final List<ShopOrderNew> getNewShopOrders() {
        return this.newShopOrders;
    }

    public final String getOrderSecret() {
        return this.orderSecret;
    }

    public final PaymentMethodsData getPaymentMethods() {
        return this.paymentMethods;
    }

    public final List<PaymentBillSummary> getPaymentSummary() {
        return this.paymentSummary;
    }

    public final StarlingKeyValue getPlaceOrderButtonText() {
        return this.placeOrderButtonText;
    }

    public final PlatformPromotion getPlatformPromotion() {
        return this.platformPromotion;
    }

    public final PolicyModule getPolicyModule() {
        return this.policyModule;
    }

    public final m getPreRiskParam() {
        return this.preRiskParam;
    }

    public final LinkRichText getPrivacyPolicyStatement() {
        return this.privacyPolicyStatement;
    }

    public final String getPromotionDaInfo() {
        return this.promotionDaInfo;
    }

    public final Map<String, ModuleLayout> getRemoteLayoutMap() {
        return this.remoteLayoutMap;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final DynamicSchema getSchemaInfo() {
        return this.schemaInfo;
    }

    public final ShippingAddress getShippingAddress() {
        return this.shippingAddress;
    }

    public final SkuCommonConfig getSkuCommonConfig() {
        return this.skuCommonConfig;
    }

    public final BillStarling getStarlingTexts() {
        return this.starlingTexts;
    }

    public final Summary getSummary() {
        return this.summary;
    }

    public final String getToast() {
        return this.toast;
    }

    public final String getTopNotice() {
        return this.topNotice;
    }

    public final UserTrustModule getUserTrustModule() {
        return this.userTrustModule;
    }

    public final String getVersion() {
        return this.version;
    }

    public final Boolean isFromChunk() {
        return this.isFromChunk;
    }

    public final String getTotal(String str) {
        Price total;
        String priceStr;
        Summary LJII = u.LJII(this, str);
        if (LJII == null || (total = LJII.getTotal()) == null || (priceStr = total.getPriceStr()) == null) {
            return "";
        }
        return priceStr;
    }

    public final String getTotalDesc(String str) {
        String desc;
        Summary LJII = u.LJII(this, str);
        if (LJII == null || (desc = LJII.getDesc()) == null) {
            return "";
        }
        return desc;
    }

    public final BillInfoData mergeChunk(BillInfoData billInfoData) {
        PaymentMethodsData paymentMethodsData;
        if (billInfoData == null) {
            return this;
        }
        Map<String, ModuleLayout> map = this.remoteLayoutMap;
        if (map == null) {
            map = billInfoData.remoteLayoutMap;
        }
        List<Announcement> list = this.announcement;
        if (list == null) {
            list = billInfoData.announcement;
        }
        Summary summary = this.summary;
        if (summary == null) {
            summary = billInfoData.summary;
        }
        List<PaymentBillSummary> list2 = this.paymentSummary;
        if (list2 == null) {
            list2 = billInfoData.paymentSummary;
        }
        ShippingAddress shippingAddress = this.shippingAddress;
        if (shippingAddress == null) {
            shippingAddress = billInfoData.shippingAddress;
        }
        ExceptionUX exceptionUX = this.exceptionUX;
        if (exceptionUX == null) {
            exceptionUX = billInfoData.exceptionUX;
        }
        InputItemData inputItemData = this.addressInputItemData;
        if (inputItemData == null) {
            inputItemData = billInfoData.addressInputItemData;
        }
        PaymentMethodsData paymentMethodsData2 = this.paymentMethods;
        if (paymentMethodsData2 == null && (paymentMethodsData = billInfoData.paymentMethods) != null) {
            paymentMethodsData2 = paymentMethodsData;
        }
        String str = this.orderSecret;
        if (str == null) {
            str = billInfoData.orderSecret;
        }
        DynamicSchema dynamicSchema = this.schemaInfo;
        if (dynamicSchema == null) {
            dynamicSchema = billInfoData.schemaInfo;
        }
        OSPBottomNotice oSPBottomNotice = this.bottomNotice;
        if (oSPBottomNotice == null) {
            oSPBottomNotice = billInfoData.bottomNotice;
        }
        String str2 = this.topNotice;
        if (str2 == null) {
            str2 = billInfoData.topNotice;
        }
        LinkRichText linkRichText = this.privacyPolicyStatement;
        if (linkRichText == null) {
            linkRichText = billInfoData.privacyPolicyStatement;
        }
        StarlingKeyValue starlingKeyValue = this.placeOrderButtonText;
        if (starlingKeyValue == null) {
            starlingKeyValue = billInfoData.placeOrderButtonText;
        }
        List<ShopOrderNew> list3 = this.newShopOrders;
        if (list3 == null) {
            list3 = billInfoData.newShopOrders;
        }
        String str3 = this.version;
        if (str3 == null) {
            str3 = billInfoData.version;
        }
        PlatformPromotion platformPromotion = this.platformPromotion;
        if (platformPromotion == null) {
            platformPromotion = billInfoData.platformPromotion;
        }
        String str4 = this.buttonPopTips;
        if (str4 == null) {
            str4 = billInfoData.buttonPopTips;
        }
        List<com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher> list4 = this.autoVouchers;
        if (list4 == null) {
            list4 = billInfoData.autoVouchers;
        }
        AddonOrder addonOrder = this.addonOrder;
        if (addonOrder == null) {
            addonOrder = billInfoData.addonOrder;
        }
        String str5 = this.requestId;
        if (str5 == null) {
            str5 = billInfoData.requestId;
        }
        ExtraFeeStatement extraFeeStatement = this.extraFeeStatement;
        if (extraFeeStatement == null) {
            extraFeeStatement = billInfoData.extraFeeStatement;
        }
        String str6 = this.daInfo;
        if (str6 == null) {
            str6 = billInfoData.daInfo;
        }
        SkuCommonConfig skuCommonConfig = this.skuCommonConfig;
        if (skuCommonConfig == null) {
            skuCommonConfig = billInfoData.skuCommonConfig;
        }
        Boolean bool = this.beginRenderChunk;
        if (bool == null) {
            bool = billInfoData.beginRenderChunk;
        }
        Boolean bool2 = this.lastChunk;
        if (bool2 == null) {
            bool2 = billInfoData.lastChunk;
        }
        Boolean bool3 = this.isFromChunk;
        String str7 = this.toast;
        if (str7 == null) {
            str7 = billInfoData.toast;
        }
        String str8 = this.promotionDaInfo;
        if (str8 == null) {
            str8 = billInfoData.promotionDaInfo;
        }
        String str9 = this.createOrderInfoFromBill;
        if (str9 == null) {
            str9 = billInfoData.createOrderInfoFromBill;
        }
        LogisticData logisticData = this.logisticData;
        if (logisticData == null) {
            logisticData = billInfoData.logisticData;
        }
        m mVar = this.preRiskParam;
        if (mVar == null) {
            mVar = billInfoData.preRiskParam;
        }
        PolicyModule policyModule = this.policyModule;
        if (policyModule == null) {
            policyModule = billInfoData.policyModule;
        }
        BillCpfInfo billCpfInfo = this.cpfInfo;
        if (billCpfInfo == null) {
            billCpfInfo = billInfoData.cpfInfo;
        }
        UserTrustModule userTrustModule = this.userTrustModule;
        if (userTrustModule == null) {
            userTrustModule = billInfoData.userTrustModule;
        }
        BillStarling billStarling = this.starlingTexts;
        if (billStarling == null) {
            billStarling = billInfoData.starlingTexts;
        }
        LinkRichText linkRichText2 = this.buyerProtectionProgram;
        if (linkRichText2 == null) {
            linkRichText2 = billInfoData.buyerProtectionProgram;
        }
        ChunkDebugInfo chunkDebugInfo = billInfoData.chunkDebugInfo;
        if (chunkDebugInfo == null) {
            chunkDebugInfo = this.chunkDebugInfo;
        }
        String str10 = this.billInfoParams;
        if (str10 == null) {
            str10 = billInfoData.billInfoParams;
        }
        return new BillInfoData(addonOrder, map, list, summary, shippingAddress, exceptionUX, inputItemData, paymentMethodsData2, str, dynamicSchema, oSPBottomNotice, str2, linkRichText, starlingKeyValue, list3, platformPromotion, str4, str3, list4, str5, extraFeeStatement, str6, skuCommonConfig, str7, bool, bool2, str8, mVar, billCpfInfo, bool3, str9, logisticData, policyModule, userTrustModule, billStarling, list2, linkRichText2, chunkDebugInfo, str10);
    }

    public final void setFromChunk(Boolean bool) {
        this.isFromChunk = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo>] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v3 */
    /* JADX WARN: Type inference failed for: r41v4 */
    /* JADX WARN: Type inference failed for: r41v5 */
    /* JADX WARN: Type inference failed for: r41v6 */
    /* JADX WARN: Type inference failed for: r41v7 */
    /* JADX WARN: Type inference failed for: r41v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.Collection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku>] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku>] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku>] */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final BillInfoData merge(BillInfoData billInfoData, BillInfoRequest request) {
        Object obj;
        SellerInfo sellerInfo;
        List list;
        ShopBill shopBill;
        MainOrderInfo mainOrderInfo;
        List list2;
        PackedSku packedSku;
        int i;
        int i2;
        o.LJIIIZ(request, "request");
        if (billInfoData == null) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        ?? arrayList2 = new ArrayList();
        List<ShopOrderNew> list3 = billInfoData.newShopOrders;
        if (list3 != null) {
            arrayList2.addAll(list3);
        }
        List<ShopOrderNew> list4 = this.newShopOrders;
        if (list4 != null) {
            for (ShopOrderNew shopOrderNew : list4) {
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (o.LJ(shopOrderNew.sellerId, ((ShopOrderNew) obj).sellerId)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                ShopOrderNew shopOrderNew2 = (ShopOrderNew) obj;
                if (shopOrderNew2 != null) {
                    shopOrderNew.getClass();
                    if (request.getWithSellerInfo()) {
                        sellerInfo = shopOrderNew2.seller;
                    } else {
                        sellerInfo = shopOrderNew.seller;
                    }
                    List<MainOrderInfo> list5 = shopOrderNew2.mainOrderInfos;
                    if (list5 != null) {
                        list = new ArrayList(C32I.LJJL(list5, 10));
                        for (MainOrderInfo mainOrderInfo2 : list5) {
                            List<MainOrderInfo> list6 = shopOrderNew.mainOrderInfos;
                            if (list6 != null) {
                                Iterator<MainOrderInfo> it2 = list6.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        mainOrderInfo = it2.next();
                                        if (o.LJ(mainOrderInfo.warehouseId, mainOrderInfo2.warehouseId)) {
                                            break;
                                        }
                                    } else {
                                        mainOrderInfo = null;
                                        break;
                                    }
                                }
                                MainOrderInfo mainOrderInfo3 = mainOrderInfo;
                                if (mainOrderInfo3 != null) {
                                    if (mainOrderInfo2 == null) {
                                        mainOrderInfo2 = mainOrderInfo3;
                                    } else {
                                        if (request.getWithProductInfo()) {
                                            List<PackedSku> list7 = mainOrderInfo3.packedSkus;
                                            if (list7 == null || list7.isEmpty()) {
                                                list2 = mainOrderInfo2.packedSkus;
                                            } else {
                                                list2 = mainOrderInfo2.packedSkus;
                                                if (list2 != 0) {
                                                    list2 = new ArrayList();
                                                    for (PackedSku packedSku2 : mainOrderInfo2.packedSkus) {
                                                        Iterator<PackedSku> it3 = mainOrderInfo3.packedSkus.iterator();
                                                        while (true) {
                                                            if (it3.hasNext()) {
                                                                packedSku = it3.next();
                                                                if (o.LJ(packedSku.getSkuId(), packedSku2.getSkuId())) {
                                                                    break;
                                                                }
                                                            } else {
                                                                packedSku = null;
                                                                break;
                                                            }
                                                        }
                                                        PackedSku packedSku3 = packedSku;
                                                        if (packedSku3 != null) {
                                                            Integer promotionLimitQuantity = packedSku3.getPromotionLimitQuantity();
                                                            if (promotionLimitQuantity != null) {
                                                                i = promotionLimitQuantity.intValue();
                                                            } else {
                                                                i = 0;
                                                            }
                                                            Integer promotionLimitQuantity2 = packedSku2.getPromotionLimitQuantity();
                                                            if (promotionLimitQuantity2 != null) {
                                                                i2 = promotionLimitQuantity2.intValue();
                                                            } else {
                                                                i2 = 0;
                                                            }
                                                            if (i >= 1 && i2 < 1) {
                                                                list2.add(PackedSku.copy$default(packedSku2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(i), null, null, null, null, null, null, null, -134217729, 7, null));
                                                            }
                                                        }
                                                        list2.add(packedSku2);
                                                    }
                                                }
                                            }
                                        } else {
                                            list2 = mainOrderInfo3.packedSkus;
                                        }
                                        mainOrderInfo2 = new MainOrderInfo(mainOrderInfo2.warehouseId, list2, mainOrderInfo2.reachable, mainOrderInfo2.unreachableReason, mainOrderInfo2.logistics, mainOrderInfo2.selectedLogisticsServiceId, mainOrderInfo2.warehouseTag, mainOrderInfo2.shippingTitle, mainOrderInfo2.mainOrderId, mainOrderInfo2.availableInfo);
                                    }
                                }
                            }
                            list.add(mainOrderInfo2);
                        }
                    } else {
                        list = shopOrderNew.mainOrderInfos;
                    }
                    String str = shopOrderNew2.sellerId;
                    ShopBill shopBill2 = shopOrderNew.shopBill;
                    if (shopBill2 == null || (shopBill = shopBill2.merge(shopOrderNew2.shopBill)) == null) {
                        shopBill = shopOrderNew2.shopBill;
                    }
                    ShopPromotionActivity shopPromotionActivity = shopOrderNew2.bannerPromotionActivity;
                    String str2 = shopOrderNew2.shopPromotionCacheKey;
                    List<VoucherInfoNew> list8 = shopOrderNew2.voucherSelectedInfo;
                    Integer num = shopOrderNew2.productType;
                    PhoneCredit phoneCredit = shopOrderNew2.phoneCredit;
                    String str3 = shopOrderNew2.couponSchema;
                    String str4 = shopOrderNew2.title;
                    String str5 = shopOrderNew2.expandAllTitle;
                    String str6 = shopOrderNew2.sellerText;
                    if (str6 == null) {
                        str6 = shopOrderNew.sellerText;
                    }
                    arrayList.add(new ShopOrderNew(sellerInfo, str, shopBill, shopPromotionActivity, str2, list, list8, num, phoneCredit, str3, str4, str5, str6, shopOrderNew2.itemText, shopOrderNew2.shopOrderStarling));
                    arrayList2.remove(shopOrderNew2);
                }
            }
        }
        arrayList.addAll(arrayList2);
        Map<String, ModuleLayout> map = billInfoData.remoteLayoutMap;
        List<Announcement> list9 = billInfoData.announcement;
        Summary summary = billInfoData.summary;
        List<PaymentBillSummary> list10 = billInfoData.paymentSummary;
        ShippingAddress shippingAddress = billInfoData.shippingAddress;
        ExceptionUX exceptionUX = billInfoData.exceptionUX;
        InputItemData inputItemData = billInfoData.addressInputItemData;
        PaymentMethodsData paymentMethodsData = billInfoData.paymentMethods;
        if (paymentMethodsData == null) {
            paymentMethodsData = this.paymentMethods;
        }
        String str7 = billInfoData.orderSecret;
        DynamicSchema dynamicSchema = billInfoData.schemaInfo;
        if (dynamicSchema == null) {
            dynamicSchema = this.schemaInfo;
        }
        OSPBottomNotice oSPBottomNotice = billInfoData.bottomNotice;
        if (oSPBottomNotice == null) {
            oSPBottomNotice = this.bottomNotice;
        }
        String str8 = billInfoData.topNotice;
        LinkRichText linkRichText = billInfoData.privacyPolicyStatement;
        if (linkRichText == null) {
            linkRichText = this.privacyPolicyStatement;
        }
        StarlingKeyValue starlingKeyValue = billInfoData.placeOrderButtonText;
        if (starlingKeyValue == null) {
            starlingKeyValue = this.placeOrderButtonText;
        }
        String str9 = billInfoData.version;
        PlatformPromotion platformPromotion = billInfoData.platformPromotion;
        String str10 = billInfoData.buttonPopTips;
        List<com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher> list11 = billInfoData.autoVouchers;
        AddonOrder addonOrder = billInfoData.addonOrder;
        String str11 = billInfoData.requestId;
        ExtraFeeStatement extraFeeStatement = billInfoData.extraFeeStatement;
        String str12 = billInfoData.daInfo;
        SkuCommonConfig skuCommonConfig = billInfoData.skuCommonConfig;
        String str13 = billInfoData.toast;
        if (str13 == null) {
            str13 = this.toast;
        }
        String str14 = billInfoData.promotionDaInfo;
        String str15 = billInfoData.createOrderInfoFromBill;
        LogisticData logisticData = billInfoData.logisticData;
        return new BillInfoData(addonOrder, map, list9, summary, shippingAddress, exceptionUX, inputItemData, paymentMethodsData, str7, dynamicSchema, oSPBottomNotice, str8, linkRichText, starlingKeyValue, arrayList, platformPromotion, str10, str9, list11, str11, extraFeeStatement, str12, skuCommonConfig, str13, null, 0 == true ? 1 : 0, str14, billInfoData.preRiskParam, billInfoData.cpfInfo, 0 == true ? 1 : 0, str15, logisticData, billInfoData.policyModule, billInfoData.userTrustModule, billInfoData.starlingTexts, list10, billInfoData.buyerProtectionProgram, 0 == true ? 1 : 0, billInfoData.billInfoParams, 587202560, 32, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ String getTotal$default(BillInfoData billInfoData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return billInfoData.getTotal(str);
    }

    public static /* synthetic */ String getTotalDesc$default(BillInfoData billInfoData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return billInfoData.getTotalDesc(str);
    }

    public final List<OrderShopDigest> getShopOrderDigestList(int i, String str, int i2, boolean z) {
        LogisticDTO logisticDTO;
        String entranceInfo;
        ArrayList arrayList = new ArrayList();
        List<ShopOrderNew> list = this.newShopOrders;
        if (list != null) {
            for (ShopOrderNew shopOrderNew : list) {
                List<MainOrderInfo> list2 = shopOrderNew.mainOrderInfos;
                if (list2 != null) {
                    for (MainOrderInfo mainOrderInfo : list2) {
                        String str2 = shopOrderNew.sellerId;
                        ArrayList arrayList2 = new ArrayList();
                        List<PackedSku> list3 = mainOrderInfo.packedSkus;
                        if (list3 != null) {
                            for (PackedSku packedSku : list3) {
                                String productId = packedSku.getProductId();
                                String skuId = packedSku.getSkuId();
                                Integer valueOf = Integer.valueOf(g0.LJJIII(packedSku));
                                String cartItemId = packedSku.getCartItemId();
                                Integer valueOf2 = Integer.valueOf(i);
                                String sourceInfo = packedSku.getSourceInfo();
                                if (i2 == 1 || z) {
                                    entranceInfo = packedSku.getEntranceInfo();
                                } else {
                                    entranceInfo = str;
                                }
                                arrayList2.add(new OrderSKUDTO(productId, skuId, valueOf, cartItemId, valueOf2, sourceInfo, entranceInfo, packedSku.getChainKey(), null, mainOrderInfo.selectedLogisticsServiceId, null, null, null, packedSku.getBundleId(), packedSku.getAggregationKey(), packedSku.getAggregationCount(), packedSku.getSkuCardStyleInfo(), 7424, null));
                            }
                        }
                        List<LogisticDTO> list4 = mainOrderInfo.logistics;
                        Integer num = null;
                        if (list4 != null) {
                            Iterator<LogisticDTO> it = list4.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    logisticDTO = it.next();
                                    if (o.LJ(logisticDTO.logisticsServiceId, mainOrderInfo.selectedLogisticsServiceId)) {
                                        break;
                                    }
                                } else {
                                    logisticDTO = null;
                                    break;
                                }
                            }
                            LogisticDTO logisticDTO2 = logisticDTO;
                            if (logisticDTO2 != null) {
                                num = logisticDTO2.deliveryOption;
                            }
                        }
                        arrayList.add(new OrderShopDigest(str2, arrayList2, num));
                    }
                }
            }
        }
        return arrayList;
    }

    public static /* synthetic */ List getShopOrderDigestList$default(BillInfoData billInfoData, int i, String str, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        return billInfoData.getShopOrderDigestList(i, str, i2, z);
    }

    public BillInfoData(AddonOrder addonOrder, Map<String, ModuleLayout> map, List<Announcement> list, Summary summary, ShippingAddress shippingAddress, ExceptionUX exceptionUX, InputItemData inputItemData, PaymentMethodsData paymentMethodsData, String str, DynamicSchema dynamicSchema, OSPBottomNotice oSPBottomNotice, String str2, LinkRichText linkRichText, StarlingKeyValue starlingKeyValue, List<ShopOrderNew> list2, PlatformPromotion platformPromotion, String str3, String str4, List<com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher> list3, String str5, ExtraFeeStatement extraFeeStatement, String str6, SkuCommonConfig skuCommonConfig, String str7, Boolean bool, Boolean bool2, String str8, m mVar, BillCpfInfo billCpfInfo, Boolean bool3, String str9, LogisticData logisticData, PolicyModule policyModule, UserTrustModule userTrustModule, BillStarling billStarling, List<PaymentBillSummary> list4, LinkRichText linkRichText2, ChunkDebugInfo chunkDebugInfo, String str10) {
        this.addonOrder = addonOrder;
        this.remoteLayoutMap = map;
        this.announcement = list;
        this.summary = summary;
        this.shippingAddress = shippingAddress;
        this.exceptionUX = exceptionUX;
        this.addressInputItemData = inputItemData;
        this.paymentMethods = paymentMethodsData;
        this.orderSecret = str;
        this.schemaInfo = dynamicSchema;
        this.bottomNotice = oSPBottomNotice;
        this.topNotice = str2;
        this.privacyPolicyStatement = linkRichText;
        this.placeOrderButtonText = starlingKeyValue;
        this.newShopOrders = list2;
        this.platformPromotion = platformPromotion;
        this.buttonPopTips = str3;
        this.version = str4;
        this.autoVouchers = list3;
        this.requestId = str5;
        this.extraFeeStatement = extraFeeStatement;
        this.daInfo = str6;
        this.skuCommonConfig = skuCommonConfig;
        this.toast = str7;
        this.beginRenderChunk = bool;
        this.lastChunk = bool2;
        this.promotionDaInfo = str8;
        this.preRiskParam = mVar;
        this.cpfInfo = billCpfInfo;
        this.isFromChunk = bool3;
        this.createOrderInfoFromBill = str9;
        this.logisticData = logisticData;
        this.policyModule = policyModule;
        this.userTrustModule = userTrustModule;
        this.starlingTexts = billStarling;
        this.paymentSummary = list4;
        this.buyerProtectionProgram = linkRichText2;
        this.chunkDebugInfo = chunkDebugInfo;
        this.billInfoParams = str10;
    }

    public /* synthetic */ BillInfoData(AddonOrder addonOrder, Map map, List list, Summary summary, ShippingAddress shippingAddress, ExceptionUX exceptionUX, InputItemData inputItemData, PaymentMethodsData paymentMethodsData, String str, DynamicSchema dynamicSchema, OSPBottomNotice oSPBottomNotice, String str2, LinkRichText linkRichText, StarlingKeyValue starlingKeyValue, List list2, PlatformPromotion platformPromotion, String str3, String str4, List list3, String str5, ExtraFeeStatement extraFeeStatement, String str6, SkuCommonConfig skuCommonConfig, String str7, Boolean bool, Boolean bool2, String str8, m mVar, BillCpfInfo billCpfInfo, Boolean bool3, String str9, LogisticData logisticData, PolicyModule policyModule, UserTrustModule userTrustModule, BillStarling billStarling, List list4, LinkRichText linkRichText2, ChunkDebugInfo chunkDebugInfo, String str10, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(addonOrder, map, list, summary, shippingAddress, exceptionUX, inputItemData, paymentMethodsData, str, dynamicSchema, oSPBottomNotice, str2, linkRichText, starlingKeyValue, list2, platformPromotion, str3, str4, list3, str5, extraFeeStatement, str6, (i & 4194304) != 0 ? null : skuCommonConfig, str7, (i & 16777216) != 0 ? Boolean.FALSE : bool, (i & 33554432) != 0 ? Boolean.FALSE : bool2, str8, mVar, billCpfInfo, (i & 536870912) != 0 ? Boolean.FALSE : bool3, (i & 1073741824) != 0 ? null : str9, (i & LiveLayoutPreloadThreadPriority.DEFAULT) != 0 ? null : logisticData, (i2 & 1) != 0 ? null : policyModule, (i2 & 2) != 0 ? null : userTrustModule, (i2 & 4) != 0 ? null : billStarling, (i2 & 8) != 0 ? null : list4, (i2 & 16) != 0 ? null : linkRichText2, (i2 & 32) != 0 ? null : chunkDebugInfo, (i2 & 64) == 0 ? str10 : null);
    }
}
