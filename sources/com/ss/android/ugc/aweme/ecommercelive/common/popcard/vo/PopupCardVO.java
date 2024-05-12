package com.ss.android.ugc.aweme.ecommercelive.common.popcard.vo;

import X.AnonymousClass391;
import X.C35579Dxn;
import X.C71196Rwu;
import X.C79062V1e;
import X.JBR;
import X.UPJ;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.ss.android.ugc.aweme.ecommercebase.view.PromotionLogo;
import com.ss.android.ugc.aweme.ecommercelive.business.common.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.data.PromotionSkin;
import com.ss.android.ugc.aweme.ecommercelive.common.data.SellingView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PopupCardVO {
    public static final C71196Rwu Companion = new C71196Rwu();
    public final List<Object> assistantModules;
    public final Boolean assistantSwitch;
    public final List<AtmosphereTag> atmosphereTags;
    public int bagIndex;
    public final Integer bizType;
    public final String chainKey;
    public final long createTime;
    public final String daInfo;
    public final String discount;
    public final Map<String, String> extra;
    public final C35579Dxn flashSaleInfo;
    public final String formatAvailablePrice;
    public final String formatOriginPrice;
    public String fromMessageId;
    public boolean hasElasticImg;
    public String imageUrl;
    public String imageUrlKey;
    public boolean isFromMessage;
    public int liveBagAndPinCardType;
    public final String openUrl;
    public final int platform;
    public final String price;
    public final String priceCurrency;
    public final String priceDecimalNum;
    public final String priceIntegerNum;
    public final String pricePrefix;
    public final long productId;
    public final String productRating;
    public int productStatus;
    public final List<PromotionLogo> promotionLogos;
    public PromotionSkin promotionSkin;
    public final PromotionView promotionView;
    public final String schema;
    public final String sellerId;
    public final SellingView sellingView;
    public final long serverTime;
    public final List<Object> skcInfo;
    public final List<String> skuIds;
    public final String soldCount;
    public final String source;
    public final int sourceFrom;
    public ECommerceMessage sourceMessage;
    public String title;
    public final String visitReportParams;

    public static /* synthetic */ PopupCardVO copy$default(PopupCardVO popupCardVO, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, int i2, int i3, String str10, String str11, boolean z, long j, String str12, String str13, C35579Dxn c35579Dxn, List list, PromotionSkin promotionSkin, PromotionView promotionView, int i4, List list2, Map map, String str14, String str15, SellingView sellingView, List list3, String str16, String str17, String str18, Boolean bool, List list4, long j2, long j3, Integer num, List list5, String str19, String str20, int i5, int i6, int i7, Object obj) {
        int i8 = i2;
        String str21 = str9;
        int i9 = i;
        String str22 = str11;
        String str23 = str8;
        String str24 = str7;
        String str25 = str2;
        String str26 = str;
        int i10 = i3;
        String str27 = str3;
        String str28 = str4;
        String str29 = str10;
        String str30 = str5;
        String str31 = str6;
        int i11 = i5;
        String str32 = str19;
        long j4 = j3;
        Integer num2 = num;
        Boolean bool2 = bool;
        String str33 = str18;
        String str34 = str17;
        List list6 = list;
        C35579Dxn c35579Dxn2 = c35579Dxn;
        String str35 = str12;
        String str36 = str16;
        String str37 = str13;
        boolean z2 = z;
        int i12 = i4;
        PromotionSkin promotionSkin2 = promotionSkin;
        List list7 = list4;
        PromotionView promotionView2 = promotionView;
        String str38 = str20;
        List list8 = list2;
        long j5 = j2;
        long j6 = j;
        Map map2 = map;
        String str39 = str14;
        String str40 = str15;
        List list9 = list5;
        SellingView sellingView2 = sellingView;
        List list10 = list3;
        if ((i6 & 1) != 0) {
            str26 = popupCardVO.title;
        }
        if ((i6 & 2) != 0) {
            str25 = popupCardVO.price;
        }
        if ((i6 & 4) != 0) {
            str27 = popupCardVO.pricePrefix;
        }
        if ((i6 & 8) != 0) {
            str28 = popupCardVO.priceIntegerNum;
        }
        if ((i6 & 16) != 0) {
            str30 = popupCardVO.priceDecimalNum;
        }
        if ((i6 & 32) != 0) {
            str31 = popupCardVO.priceCurrency;
        }
        if ((i6 & 64) != 0) {
            str24 = popupCardVO.openUrl;
        }
        if ((i6 & 128) != 0) {
            str23 = popupCardVO.source;
        }
        if ((i6 & 256) != 0) {
            i9 = popupCardVO.sourceFrom;
        }
        if ((i6 & 512) != 0) {
            str21 = popupCardVO.schema;
        }
        if ((i6 & 1024) != 0) {
            i8 = popupCardVO.platform;
        }
        if ((i6 & 2048) != 0) {
            i10 = popupCardVO.productStatus;
        }
        if ((i6 & 4096) != 0) {
            str29 = popupCardVO.imageUrl;
        }
        if ((i6 & FileUtils.BUFFER_SIZE) != 0) {
            str22 = popupCardVO.imageUrlKey;
        }
        if ((i6 & 16384) != 0) {
            z2 = popupCardVO.hasElasticImg;
        }
        if ((32768 & i6) != 0) {
            j6 = popupCardVO.productId;
        }
        if ((65536 & i6) != 0) {
            str35 = popupCardVO.formatOriginPrice;
        }
        if ((131072 & i6) != 0) {
            str37 = popupCardVO.formatAvailablePrice;
        }
        if ((262144 & i6) != 0) {
            c35579Dxn2 = popupCardVO.flashSaleInfo;
        }
        if ((524288 & i6) != 0) {
            list6 = popupCardVO.promotionLogos;
        }
        if ((1048576 & i6) != 0) {
            promotionSkin2 = popupCardVO.promotionSkin;
        }
        if ((2097152 & i6) != 0) {
            promotionView2 = popupCardVO.promotionView;
        }
        if ((4194304 & i6) != 0) {
            i12 = popupCardVO.bagIndex;
        }
        if ((8388608 & i6) != 0) {
            list8 = popupCardVO.atmosphereTags;
        }
        if ((16777216 & i6) != 0) {
            map2 = popupCardVO.extra;
        }
        if ((33554432 & i6) != 0) {
            str39 = popupCardVO.soldCount;
        }
        if ((67108864 & i6) != 0) {
            str40 = popupCardVO.productRating;
        }
        if ((134217728 & i6) != 0) {
            sellingView2 = popupCardVO.sellingView;
        }
        if ((268435456 & i6) != 0) {
            list10 = popupCardVO.skuIds;
        }
        if ((536870912 & i6) != 0) {
            str36 = popupCardVO.visitReportParams;
        }
        if ((1073741824 & i6) != 0) {
            str34 = popupCardVO.chainKey;
        }
        if ((i6 & LiveLayoutPreloadThreadPriority.DEFAULT) != 0) {
            str33 = popupCardVO.sellerId;
        }
        if ((i7 & 1) != 0) {
            bool2 = popupCardVO.assistantSwitch;
        }
        if ((i7 & 2) != 0) {
            list7 = popupCardVO.assistantModules;
        }
        if ((i7 & 4) != 0) {
            j5 = popupCardVO.createTime;
        }
        if ((i7 & 8) != 0) {
            j4 = popupCardVO.serverTime;
        }
        if ((i7 & 16) != 0) {
            num2 = popupCardVO.bizType;
        }
        if ((i7 & 32) != 0) {
            list9 = popupCardVO.skcInfo;
        }
        if ((i7 & 64) != 0) {
            str32 = popupCardVO.discount;
        }
        if ((i7 & 128) != 0) {
            str38 = popupCardVO.daInfo;
        }
        if ((i7 & 256) != 0) {
            i11 = popupCardVO.liveBagAndPinCardType;
        }
        return popupCardVO.copy(str26, str25, str27, str28, str30, str31, str24, str23, i9, str21, i8, i10, str29, str22, z2, j6, str35, str37, c35579Dxn2, list6, promotionSkin2, promotionView2, i12, list8, map2, str39, str40, sellingView2, list10, str36, str34, str33, bool2, list7, j5, j4, num2, list9, str32, str38, i11);
    }

    public final PopupCardVO copy(String title, String price, String str, String str2, String str3, String str4, String openUrl, String source, int i, String schema, int i2, int i3, String imageUrl, String imageUrlKey, boolean z, long j, String str5, String str6, C35579Dxn c35579Dxn, List<PromotionLogo> list, PromotionSkin promotionSkin, PromotionView promotionView, int i4, List<AtmosphereTag> atmosphereTags, Map<String, String> map, String str7, String str8, SellingView sellingView, List<String> list2, String str9, String str10, String str11, Boolean bool, List<Object> list3, long j2, long j3, Integer num, List<Object> list4, String str12, String str13, int i5) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(price, "price");
        o.LJIIIZ(openUrl, "openUrl");
        o.LJIIIZ(source, "source");
        o.LJIIIZ(schema, "schema");
        o.LJIIIZ(imageUrl, "imageUrl");
        o.LJIIIZ(imageUrlKey, "imageUrlKey");
        o.LJIIIZ(atmosphereTags, "atmosphereTags");
        return new PopupCardVO(title, price, str, str2, str3, str4, openUrl, source, i, schema, i2, i3, imageUrl, imageUrlKey, z, j, str5, str6, c35579Dxn, list, promotionSkin, promotionView, i4, atmosphereTags, map, str7, str8, sellingView, list2, str9, str10, str11, bool, list3, j2, j3, num, list4, str12, str13, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupCardVO)) {
            return false;
        }
        PopupCardVO popupCardVO = (PopupCardVO) obj;
        return o.LJ(this.title, popupCardVO.title) && o.LJ(this.price, popupCardVO.price) && o.LJ(this.pricePrefix, popupCardVO.pricePrefix) && o.LJ(this.priceIntegerNum, popupCardVO.priceIntegerNum) && o.LJ(this.priceDecimalNum, popupCardVO.priceDecimalNum) && o.LJ(this.priceCurrency, popupCardVO.priceCurrency) && o.LJ(this.openUrl, popupCardVO.openUrl) && o.LJ(this.source, popupCardVO.source) && this.sourceFrom == popupCardVO.sourceFrom && o.LJ(this.schema, popupCardVO.schema) && this.platform == popupCardVO.platform && this.productStatus == popupCardVO.productStatus && o.LJ(this.imageUrl, popupCardVO.imageUrl) && o.LJ(this.imageUrlKey, popupCardVO.imageUrlKey) && this.hasElasticImg == popupCardVO.hasElasticImg && this.productId == popupCardVO.productId && o.LJ(this.formatOriginPrice, popupCardVO.formatOriginPrice) && o.LJ(this.formatAvailablePrice, popupCardVO.formatAvailablePrice) && o.LJ(this.flashSaleInfo, popupCardVO.flashSaleInfo) && o.LJ(this.promotionLogos, popupCardVO.promotionLogos) && o.LJ(this.promotionSkin, popupCardVO.promotionSkin) && o.LJ(this.promotionView, popupCardVO.promotionView) && this.bagIndex == popupCardVO.bagIndex && o.LJ(this.atmosphereTags, popupCardVO.atmosphereTags) && o.LJ(this.extra, popupCardVO.extra) && o.LJ(this.soldCount, popupCardVO.soldCount) && o.LJ(this.productRating, popupCardVO.productRating) && o.LJ(this.sellingView, popupCardVO.sellingView) && o.LJ(this.skuIds, popupCardVO.skuIds) && o.LJ(this.visitReportParams, popupCardVO.visitReportParams) && o.LJ(this.chainKey, popupCardVO.chainKey) && o.LJ(this.sellerId, popupCardVO.sellerId) && o.LJ(this.assistantSwitch, popupCardVO.assistantSwitch) && o.LJ(this.assistantModules, popupCardVO.assistantModules) && this.createTime == popupCardVO.createTime && this.serverTime == popupCardVO.serverTime && o.LJ(this.bizType, popupCardVO.bizType) && o.LJ(this.skcInfo, popupCardVO.skcInfo) && o.LJ(this.discount, popupCardVO.discount) && o.LJ(this.daInfo, popupCardVO.daInfo) && this.liveBagAndPinCardType == popupCardVO.liveBagAndPinCardType;
    }

    public final String getPromotionLogoLog() {
        List<PromotionLogo> list = this.promotionLogos;
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<PromotionLogo> it = this.promotionLogos.iterator();
        while (it.hasNext()) {
            sb.append(it.next().promotionId);
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "builder.toString()");
        return sb2;
    }

    public final String hasFansPrice() {
        List<PromotionItem> list;
        PromotionView promotionView = this.promotionView;
        if (promotionView != null && (list = promotionView.promotion_items) != null) {
            Iterator<PromotionItem> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PromotionItem next = it.next();
                Integer type = next.getType();
                if (type != null && type.intValue() == 3) {
                    if (next != null) {
                        return "1";
                    }
                }
            }
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int hashCode21;
        int hashCode22;
        int hashCode23;
        int LJ = C79062V1e.LJ(this.price, this.title.hashCode() * 31, 31);
        String str = this.pricePrefix;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str2 = this.priceIntegerNum;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.priceDecimalNum;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.priceCurrency;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int LJ2 = C79062V1e.LJ(this.imageUrlKey, C79062V1e.LJ(this.imageUrl, (((C79062V1e.LJ(this.schema, (C79062V1e.LJ(this.source, C79062V1e.LJ(this.openUrl, (i4 + hashCode4) * 31, 31), 31) + this.sourceFrom) * 31, 31) + this.platform) * 31) + this.productStatus) * 31, 31), 31);
        boolean z = this.hasElasticImg;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        int LIZJ = JBR.LIZJ(this.productId, (LJ2 + i5) * 31, 31);
        String str5 = this.formatOriginPrice;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (LIZJ + hashCode5) * 31;
        String str6 = this.formatAvailablePrice;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        C35579Dxn c35579Dxn = this.flashSaleInfo;
        if (c35579Dxn == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = c35579Dxn.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        List<PromotionLogo> list = this.promotionLogos;
        if (list == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = list.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        PromotionSkin promotionSkin = this.promotionSkin;
        if (promotionSkin == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = promotionSkin.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        PromotionView promotionView = this.promotionView;
        if (promotionView == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = promotionView.hashCode();
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.atmosphereTags, (((i10 + hashCode10) * 31) + this.bagIndex) * 31, 31);
        Map<String, String> map = this.extra;
        if (map == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = map.hashCode();
        }
        int i11 = (LIZIZ + hashCode11) * 31;
        String str7 = this.soldCount;
        if (str7 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str7.hashCode();
        }
        int i12 = (i11 + hashCode12) * 31;
        String str8 = this.productRating;
        if (str8 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str8.hashCode();
        }
        int i13 = (i12 + hashCode13) * 31;
        SellingView sellingView = this.sellingView;
        if (sellingView == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = sellingView.hashCode();
        }
        int i14 = (i13 + hashCode14) * 31;
        List<String> list2 = this.skuIds;
        if (list2 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = list2.hashCode();
        }
        int i15 = (i14 + hashCode15) * 31;
        String str9 = this.visitReportParams;
        if (str9 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = str9.hashCode();
        }
        int i16 = (i15 + hashCode16) * 31;
        String str10 = this.chainKey;
        if (str10 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str10.hashCode();
        }
        int i17 = (i16 + hashCode17) * 31;
        String str11 = this.sellerId;
        if (str11 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = str11.hashCode();
        }
        int i18 = (i17 + hashCode18) * 31;
        Boolean bool = this.assistantSwitch;
        if (bool == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = bool.hashCode();
        }
        int i19 = (i18 + hashCode19) * 31;
        List<Object> list3 = this.assistantModules;
        if (list3 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = list3.hashCode();
        }
        int LIZJ2 = JBR.LIZJ(this.serverTime, JBR.LIZJ(this.createTime, (i19 + hashCode20) * 31, 31), 31);
        Integer num = this.bizType;
        if (num == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = num.hashCode();
        }
        int i20 = (LIZJ2 + hashCode21) * 31;
        List<Object> list4 = this.skcInfo;
        if (list4 == null) {
            hashCode22 = 0;
        } else {
            hashCode22 = list4.hashCode();
        }
        int i21 = (i20 + hashCode22) * 31;
        String str12 = this.discount;
        if (str12 == null) {
            hashCode23 = 0;
        } else {
            hashCode23 = str12.hashCode();
        }
        int i22 = (i21 + hashCode23) * 31;
        String str13 = this.daInfo;
        if (str13 != null) {
            i = str13.hashCode();
        }
        return ((i22 + i) * 31) + this.liveBagAndPinCardType;
    }

    public final boolean isInStock() {
        if (this.productStatus == 90) {
            return true;
        }
        return false;
    }

    public final boolean isSoldOut() {
        if (this.productStatus == 80) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PopupCardVO(title=");
        sb.append(this.title);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", pricePrefix=");
        sb.append(this.pricePrefix);
        sb.append(", priceIntegerNum=");
        sb.append(this.priceIntegerNum);
        sb.append(", priceDecimalNum=");
        sb.append(this.priceDecimalNum);
        sb.append(", priceCurrency=");
        sb.append(this.priceCurrency);
        sb.append(", openUrl=");
        sb.append(this.openUrl);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", sourceFrom=");
        sb.append(this.sourceFrom);
        sb.append(", schema=");
        sb.append(this.schema);
        sb.append(", platform=");
        sb.append(this.platform);
        sb.append(", productStatus=");
        sb.append(this.productStatus);
        sb.append(", imageUrl=");
        sb.append(this.imageUrl);
        sb.append(", imageUrlKey=");
        sb.append(this.imageUrlKey);
        sb.append(", hasElasticImg=");
        sb.append(this.hasElasticImg);
        sb.append(", productId=");
        sb.append(this.productId);
        sb.append(", formatOriginPrice=");
        sb.append(this.formatOriginPrice);
        sb.append(", formatAvailablePrice=");
        sb.append(this.formatAvailablePrice);
        sb.append(", flashSaleInfo=");
        sb.append(this.flashSaleInfo);
        sb.append(", promotionLogos=");
        sb.append(this.promotionLogos);
        sb.append(", promotionSkin=");
        sb.append(this.promotionSkin);
        sb.append(", promotionView=");
        sb.append(this.promotionView);
        sb.append(", bagIndex=");
        sb.append(this.bagIndex);
        sb.append(", atmosphereTags=");
        sb.append(this.atmosphereTags);
        sb.append(", extra=");
        sb.append(this.extra);
        sb.append(", soldCount=");
        sb.append(this.soldCount);
        sb.append(", productRating=");
        sb.append(this.productRating);
        sb.append(", sellingView=");
        sb.append(this.sellingView);
        sb.append(", skuIds=");
        sb.append(this.skuIds);
        sb.append(", visitReportParams=");
        sb.append(this.visitReportParams);
        sb.append(", chainKey=");
        sb.append(this.chainKey);
        sb.append(", sellerId=");
        sb.append(this.sellerId);
        sb.append(", assistantSwitch=");
        sb.append(this.assistantSwitch);
        sb.append(", assistantModules=");
        sb.append(this.assistantModules);
        sb.append(", createTime=");
        sb.append(this.createTime);
        sb.append(", serverTime=");
        sb.append(this.serverTime);
        sb.append(", bizType=");
        sb.append(this.bizType);
        sb.append(", skcInfo=");
        sb.append(this.skcInfo);
        sb.append(", discount=");
        sb.append(this.discount);
        sb.append(", daInfo=");
        sb.append(this.daInfo);
        sb.append(", liveBagAndPinCardType=");
        return UPJ.LIZLLL(sb, this.liveBagAndPinCardType, ')');
    }

    public final List<Object> getAssistantModules() {
        return this.assistantModules;
    }

    public final Boolean getAssistantSwitch() {
        return this.assistantSwitch;
    }

    public final List<AtmosphereTag> getAtmosphereTags() {
        return this.atmosphereTags;
    }

    public final int getBagIndex() {
        return this.bagIndex;
    }

    public final Integer getBizType() {
        return this.bizType;
    }

    public final String getChainKey() {
        return this.chainKey;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final String getDaInfo() {
        return this.daInfo;
    }

    public final String getDiscount() {
        return this.discount;
    }

    public final Map<String, String> getExtra() {
        return this.extra;
    }

    public final C35579Dxn getFlashSaleInfo() {
        return this.flashSaleInfo;
    }

    public final String getFormatAvailablePrice() {
        return this.formatAvailablePrice;
    }

    public final String getFormatOriginPrice() {
        return this.formatOriginPrice;
    }

    public final String getFromMessageId() {
        return this.fromMessageId;
    }

    public final boolean getHasElasticImg() {
        return this.hasElasticImg;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getImageUrlKey() {
        return this.imageUrlKey;
    }

    public final int getLiveBagAndPinCardType() {
        return this.liveBagAndPinCardType;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final int getPlatform() {
        return this.platform;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getPriceCurrency() {
        return this.priceCurrency;
    }

    public final String getPriceDecimalNum() {
        return this.priceDecimalNum;
    }

    public final String getPriceIntegerNum() {
        return this.priceIntegerNum;
    }

    public final String getPricePrefix() {
        return this.pricePrefix;
    }

    public final long getProductId() {
        return this.productId;
    }

    public final String getProductRating() {
        return this.productRating;
    }

    public final int getProductStatus() {
        return this.productStatus;
    }

    public final List<PromotionLogo> getPromotionLogos() {
        return this.promotionLogos;
    }

    public final PromotionSkin getPromotionSkin() {
        return this.promotionSkin;
    }

    public final PromotionView getPromotionView() {
        return this.promotionView;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getSellerId() {
        return this.sellerId;
    }

    public final SellingView getSellingView() {
        return this.sellingView;
    }

    public final long getServerTime() {
        return this.serverTime;
    }

    public final List<Object> getSkcInfo() {
        return this.skcInfo;
    }

    public final List<String> getSkuIds() {
        return this.skuIds;
    }

    public final String getSoldCount() {
        return this.soldCount;
    }

    public final String getSource() {
        return this.source;
    }

    public final int getSourceFrom() {
        return this.sourceFrom;
    }

    public final ECommerceMessage getSourceMessage() {
        return this.sourceMessage;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getVisitReportParams() {
        return this.visitReportParams;
    }

    public final boolean isFromMessage() {
        return this.isFromMessage;
    }

    public final void fromMessage(ECommerceMessage message) {
        o.LJIIIZ(message, "message");
        this.isFromMessage = true;
        this.sourceMessage = message;
        this.fromMessageId = String.valueOf(message.getMessageId());
    }

    public final void setBagIndex(int i) {
        this.bagIndex = i;
    }

    public final void setFromMessage(boolean z) {
        this.isFromMessage = z;
    }

    public final void setFromMessageId(String str) {
        this.fromMessageId = str;
    }

    public final void setHasElasticImg(boolean z) {
        this.hasElasticImg = z;
    }

    public final void setImageUrl(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.imageUrl = str;
    }

    public final void setImageUrlKey(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.imageUrlKey = str;
    }

    public final void setLiveBagAndPinCardType(int i) {
        this.liveBagAndPinCardType = i;
    }

    public final void setProductStatus(int i) {
        this.productStatus = i;
    }

    public final void setPromotionSkin(PromotionSkin promotionSkin) {
        this.promotionSkin = promotionSkin;
    }

    public final void setSourceMessage(ECommerceMessage eCommerceMessage) {
        this.sourceMessage = eCommerceMessage;
    }

    public final void setTitle(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.title = str;
    }

    public PopupCardVO(String title, String price, String str, String str2, String str3, String str4, String openUrl, String source, int i, String schema, int i2, int i3, String imageUrl, String imageUrlKey, boolean z, long j, String str5, String str6, C35579Dxn c35579Dxn, List<PromotionLogo> list, PromotionSkin promotionSkin, PromotionView promotionView, int i4, List<AtmosphereTag> atmosphereTags, Map<String, String> map, String str7, String str8, SellingView sellingView, List<String> list2, String str9, String str10, String str11, Boolean bool, List<Object> list3, long j2, long j3, Integer num, List<Object> list4, String str12, String str13, int i5) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(price, "price");
        o.LJIIIZ(openUrl, "openUrl");
        o.LJIIIZ(source, "source");
        o.LJIIIZ(schema, "schema");
        o.LJIIIZ(imageUrl, "imageUrl");
        o.LJIIIZ(imageUrlKey, "imageUrlKey");
        o.LJIIIZ(atmosphereTags, "atmosphereTags");
        this.title = title;
        this.price = price;
        this.pricePrefix = str;
        this.priceIntegerNum = str2;
        this.priceDecimalNum = str3;
        this.priceCurrency = str4;
        this.openUrl = openUrl;
        this.source = source;
        this.sourceFrom = i;
        this.schema = schema;
        this.platform = i2;
        this.productStatus = i3;
        this.imageUrl = imageUrl;
        this.imageUrlKey = imageUrlKey;
        this.hasElasticImg = z;
        this.productId = j;
        this.formatOriginPrice = str5;
        this.formatAvailablePrice = str6;
        this.flashSaleInfo = c35579Dxn;
        this.promotionLogos = list;
        this.promotionSkin = promotionSkin;
        this.promotionView = promotionView;
        this.bagIndex = i4;
        this.atmosphereTags = atmosphereTags;
        this.extra = map;
        this.soldCount = str7;
        this.productRating = str8;
        this.sellingView = sellingView;
        this.skuIds = list2;
        this.visitReportParams = str9;
        this.chainKey = str10;
        this.sellerId = str11;
        this.assistantSwitch = bool;
        this.assistantModules = list3;
        this.createTime = j2;
        this.serverTime = j3;
        this.bizType = num;
        this.skcInfo = list4;
        this.discount = str12;
        this.daInfo = str13;
        this.liveBagAndPinCardType = i5;
    }

    public /* synthetic */ PopupCardVO(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, int i2, int i3, String str10, String str11, boolean z, long j, String str12, String str13, C35579Dxn c35579Dxn, List list, PromotionSkin promotionSkin, PromotionView promotionView, int i4, List list2, Map map, String str14, String str15, SellingView sellingView, List list3, String str16, String str17, String str18, Boolean bool, List list4, long j2, long j3, Integer num, List list5, String str19, String str20, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, i, str9, i2, i3, (i6 & 4096) != 0 ? "" : str10, (i6 & FileUtils.BUFFER_SIZE) == 0 ? str11 : "", z, j, str12, str13, c35579Dxn, list, promotionSkin, promotionView, (i6 & 4194304) != 0 ? 0 : i4, list2, map, str14, str15, sellingView, list3, str16, str17, str18, (i7 & 1) != 0 ? Boolean.FALSE : bool, list4, j2, j3, num, (i7 & 32) != 0 ? null : list5, (i7 & 64) != 0 ? null : str19, (i7 & 128) == 0 ? str20 : null, i5);
    }
}
