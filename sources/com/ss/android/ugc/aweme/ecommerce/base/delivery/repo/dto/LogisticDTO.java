package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C1FJ;
import X.C1FL;
import X.C27063Ajj;
import X.C279017q;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping.ShippingDialogDto;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticsDescription;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class LogisticDTO implements Parcelable {
    public static final Parcelable.Creator<LogisticDTO> CREATOR = new C27063Ajj();

    @InterfaceC65349Pkn("arrival_info")
    public final String arrivalInfo;

    @InterfaceC65349Pkn("da_info")
    public final String daInfo;

    @InterfaceC65349Pkn("delivery_max_days")
    public final Integer deliveryMaxDays;

    @InterfaceC65349Pkn("delivery_min_days")
    public final Integer deliveryMinDays;

    @InterfaceC65349Pkn("delivery_name")
    public final String deliveryName;

    @InterfaceC65349Pkn("delivery_option")
    public final Integer deliveryOption;

    @InterfaceC65349Pkn("event_tracking")
    public final Map<String, String> eventTrackInfo;

    @InterfaceC65349Pkn("free_shipping")
    public final Boolean freeShipping;

    @InterfaceC65349Pkn("has_native_page")
    public final Boolean hasNativePage;

    @InterfaceC65349Pkn("is_default")
    public final Boolean isDefault;

    @InterfaceC65349Pkn("lead_time")
    public final String leadTime;

    @InterfaceC65349Pkn("logistic_rich_text")
    public final LogisticLinkRichText logisticRichText;

    @InterfaceC65349Pkn("logistic_rich_text_list")
    public final List<LogisticLinkRichText> logisticRichTextList;

    @InterfaceC65349Pkn("logistic_text")
    public final LogisticTextDTO logisticText;

    @InterfaceC65349Pkn("logistics_description")
    public final LogisticsDescription logisticsDescription;

    @InterfaceC65349Pkn("logistics_service_id")
    public final String logisticsServiceId;

    @InterfaceC65349Pkn("order_cut_off_notice")
    public final LogisticLinkRichText orderCutOffNotice;

    @InterfaceC65349Pkn("original_shipping_fee")
    public final String originShippingFee;

    @InterfaceC65349Pkn("original_shipping_val")
    public final String originShippingVal;

    @InterfaceC65349Pkn("logistic_promotion")
    public final LogisticPromotion promotion;

    @InterfaceC65349Pkn("reachable")
    public final Boolean reachable;

    @InterfaceC65349Pkn("shipping_discount")
    public final Boolean shippingDiscount;

    @InterfaceC65349Pkn("shipping_fee")
    public final Price shippingFee;

    @InterfaceC65349Pkn("shipping_service")
    public final ShippingService shippingService;

    @InterfaceC65349Pkn("shipping_threshold_text")
    public final LogisticLinkRichText shippingThresholdText;

    @InterfaceC65349Pkn("shipping_fallback_dialog")
    public final ShippingDialogDto shopifyFallbackDialog;

    @InterfaceC65349Pkn("spend_more_jumper")
    public final SpendMoreForFree spendMoreForFree;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String LIZ() {
        String str;
        Map<String, String> map = this.eventTrackInfo;
        if (map == null || (str = map.get("is_next_day_delivery")) == null) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Integer num = this.deliveryOption;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        out.writeString(this.deliveryName);
        Boolean bool = this.isDefault;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        Boolean bool2 = this.reachable;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool2);
        }
        out.writeString(this.leadTime);
        Price price = this.shippingFee;
        if (price == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            price.writeToParcel(out, i);
        }
        out.writeString(this.originShippingFee);
        out.writeString(this.originShippingVal);
        Boolean bool3 = this.freeShipping;
        if (bool3 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool3);
        }
        Boolean bool4 = this.shippingDiscount;
        if (bool4 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool4);
        }
        LogisticTextDTO logisticTextDTO = this.logisticText;
        if (logisticTextDTO == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            logisticTextDTO.writeToParcel(out, i);
        }
        out.writeString(this.logisticsServiceId);
        Integer num2 = this.deliveryMinDays;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        Integer num3 = this.deliveryMaxDays;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num3);
        }
        out.writeString(this.daInfo);
        SpendMoreForFree spendMoreForFree = this.spendMoreForFree;
        if (spendMoreForFree == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            spendMoreForFree.writeToParcel(out, i);
        }
        Map<String, String> map = this.eventTrackInfo;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                out.writeString(entry.getKey());
                out.writeString(entry.getValue());
            }
        }
        LogisticPromotion logisticPromotion = this.promotion;
        if (logisticPromotion == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            logisticPromotion.writeToParcel(out, i);
        }
        Boolean bool5 = this.hasNativePage;
        if (bool5 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool5);
        }
        ShippingDialogDto shippingDialogDto = this.shopifyFallbackDialog;
        if (shippingDialogDto == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            shippingDialogDto.writeToParcel(out, i);
        }
        ShippingService shippingService = this.shippingService;
        if (shippingService == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            shippingService.writeToParcel(out, i);
        }
        out.writeString(this.arrivalInfo);
        LogisticLinkRichText logisticLinkRichText = this.shippingThresholdText;
        if (logisticLinkRichText == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            logisticLinkRichText.writeToParcel(out, i);
        }
        LogisticLinkRichText logisticLinkRichText2 = this.logisticRichText;
        if (logisticLinkRichText2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            logisticLinkRichText2.writeToParcel(out, i);
        }
        List<LogisticLinkRichText> list = this.logisticRichTextList;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((LogisticLinkRichText) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        LogisticLinkRichText logisticLinkRichText3 = this.orderCutOffNotice;
        if (logisticLinkRichText3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            logisticLinkRichText3.writeToParcel(out, i);
        }
        LogisticsDescription logisticsDescription = this.logisticsDescription;
        if (logisticsDescription == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            logisticsDescription.writeToParcel(out, i);
        }
    }

    public LogisticDTO(Integer num, String str, Boolean bool, Boolean bool2, String str2, Price price, String str3, String str4, Boolean bool3, Boolean bool4, LogisticTextDTO logisticTextDTO, String str5, Integer num2, Integer num3, String str6, SpendMoreForFree spendMoreForFree, Map<String, String> map, LogisticPromotion logisticPromotion, Boolean bool5, ShippingDialogDto shippingDialogDto, ShippingService shippingService, String str7, LogisticLinkRichText logisticLinkRichText, LogisticLinkRichText logisticLinkRichText2, List<LogisticLinkRichText> list, LogisticLinkRichText logisticLinkRichText3, LogisticsDescription logisticsDescription) {
        this.deliveryOption = num;
        this.deliveryName = str;
        this.isDefault = bool;
        this.reachable = bool2;
        this.leadTime = str2;
        this.shippingFee = price;
        this.originShippingFee = str3;
        this.originShippingVal = str4;
        this.freeShipping = bool3;
        this.shippingDiscount = bool4;
        this.logisticText = logisticTextDTO;
        this.logisticsServiceId = str5;
        this.deliveryMinDays = num2;
        this.deliveryMaxDays = num3;
        this.daInfo = str6;
        this.spendMoreForFree = spendMoreForFree;
        this.eventTrackInfo = map;
        this.promotion = logisticPromotion;
        this.hasNativePage = bool5;
        this.shopifyFallbackDialog = shippingDialogDto;
        this.shippingService = shippingService;
        this.arrivalInfo = str7;
        this.shippingThresholdText = logisticLinkRichText;
        this.logisticRichText = logisticLinkRichText2;
        this.logisticRichTextList = list;
        this.orderCutOffNotice = logisticLinkRichText3;
        this.logisticsDescription = logisticsDescription;
    }
}
