package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C27128Akm;
import X.C27739Aud;
import X.C279017q;
import X.C61845OOz;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ShippingTextInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PdpShipping implements Parcelable {
    public static final Parcelable.Creator<PdpShipping> CREATOR = new C27128Akm();

    @InterfaceC65349Pkn("logistics")
    public final List<LogisticDTO> logistics;

    @InterfaceC65349Pkn("ship_from_info")
    public final ShipFromInfo shipFromInfo;

    @InterfaceC65349Pkn("shipping_service")
    public final ShippingService shippingService;

    @InterfaceC65349Pkn("shipping_time_notice")
    public final ShippingTextInfo shippingTimeNotice;

    @InterfaceC65349Pkn("shipping_to_address_info")
    public ShippingTOAddressInfo shippingToAddressInfo;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdpShipping)) {
            return false;
        }
        PdpShipping pdpShipping = (PdpShipping) obj;
        return o.LJ(this.logistics, pdpShipping.logistics) && o.LJ(this.shippingToAddressInfo, pdpShipping.shippingToAddressInfo) && o.LJ(this.shippingTimeNotice, pdpShipping.shippingTimeNotice) && o.LJ(this.shippingService, pdpShipping.shippingService) && o.LJ(this.shipFromInfo, pdpShipping.shipFromInfo);
    }

    public final int hashCode() {
        List<LogisticDTO> list = this.logistics;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        ShippingTOAddressInfo shippingTOAddressInfo = this.shippingToAddressInfo;
        int hashCode2 = (hashCode + (shippingTOAddressInfo == null ? 0 : shippingTOAddressInfo.hashCode())) * 31;
        ShippingTextInfo shippingTextInfo = this.shippingTimeNotice;
        int hashCode3 = (hashCode2 + (shippingTextInfo == null ? 0 : shippingTextInfo.hashCode())) * 31;
        ShippingService shippingService = this.shippingService;
        int hashCode4 = (hashCode3 + (shippingService == null ? 0 : shippingService.hashCode())) * 31;
        ShipFromInfo shipFromInfo = this.shipFromInfo;
        return hashCode4 + (shipFromInfo != null ? shipFromInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PdpShipping(logistics=");
        LIZ.append(this.logistics);
        LIZ.append(", shippingToAddressInfo=");
        LIZ.append(this.shippingToAddressInfo);
        LIZ.append(", shippingTimeNotice=");
        LIZ.append(this.shippingTimeNotice);
        LIZ.append(", shippingService=");
        LIZ.append(this.shippingService);
        LIZ.append(", shipFromInfo=");
        LIZ.append(this.shipFromInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Map<String, Object> LIZIZ() {
        String currency;
        String priceVal;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        List<LogisticDTO> list = this.logistics;
        if (list != null) {
            for (LogisticDTO logisticDTO : list) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Map<String, String> map = logisticDTO.eventTrackInfo;
                if (map != null && (str = map.get("shipping_type")) != null) {
                    linkedHashMap2.put("shipping_type", str);
                }
                Integer num = logisticDTO.deliveryMinDays;
                if (num != null) {
                    C61845OOz.LIZLLL(num, linkedHashMap2, "est_delivery_day_min");
                }
                Integer num2 = logisticDTO.deliveryMaxDays;
                if (num2 != null) {
                    C61845OOz.LIZLLL(num2, linkedHashMap2, "est_delivery_day_max");
                }
                com.ss.android.ugc.aweme.ecommerce.base.common.model.Price price = logisticDTO.shippingFee;
                if (price != null && (priceVal = price.getPriceVal()) != null) {
                    linkedHashMap2.put("shipping_price", priceVal);
                }
                com.ss.android.ugc.aweme.ecommerce.base.common.model.Price price2 = logisticDTO.shippingFee;
                if (price2 != null && (currency = price2.getCurrency()) != null) {
                    linkedHashMap2.put("shipping_currency", currency);
                }
                arrayList.add(linkedHashMap2);
            }
        }
        linkedHashMap.put("delivery_info", C27739Aud.LJI(arrayList));
        return linkedHashMap;
    }

    public final PdpShipping LIZ(PdpShipping pdpShipping) {
        List<LogisticDTO> list = pdpShipping.logistics;
        if (list == null) {
            list = this.logistics;
        }
        ShippingTOAddressInfo shippingTOAddressInfo = pdpShipping.shippingToAddressInfo;
        if (shippingTOAddressInfo == null) {
            shippingTOAddressInfo = this.shippingToAddressInfo;
        }
        ShippingTextInfo shippingTextInfo = pdpShipping.shippingTimeNotice;
        if (shippingTextInfo == null) {
            shippingTextInfo = this.shippingTimeNotice;
        }
        ShippingService shippingService = pdpShipping.shippingService;
        if (shippingService == null) {
            shippingService = this.shippingService;
        }
        ShipFromInfo shipFromInfo = pdpShipping.shipFromInfo;
        if (shipFromInfo == null) {
            shipFromInfo = this.shipFromInfo;
        }
        return new PdpShipping(list, shippingTOAddressInfo, shippingTextInfo, shippingService, shipFromInfo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        List<LogisticDTO> list = this.logistics;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((LogisticDTO) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        ShippingTOAddressInfo shippingTOAddressInfo = this.shippingToAddressInfo;
        if (shippingTOAddressInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            shippingTOAddressInfo.writeToParcel(out, i);
        }
        ShippingTextInfo shippingTextInfo = this.shippingTimeNotice;
        if (shippingTextInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            shippingTextInfo.writeToParcel(out, i);
        }
        ShippingService shippingService = this.shippingService;
        if (shippingService == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            shippingService.writeToParcel(out, i);
        }
        ShipFromInfo shipFromInfo = this.shipFromInfo;
        if (shipFromInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            shipFromInfo.writeToParcel(out, i);
        }
    }

    public PdpShipping(List<LogisticDTO> list, ShippingTOAddressInfo shippingTOAddressInfo, ShippingTextInfo shippingTextInfo, ShippingService shippingService, ShipFromInfo shipFromInfo) {
        this.logistics = list;
        this.shippingToAddressInfo = shippingTOAddressInfo;
        this.shippingTimeNotice = shippingTextInfo;
        this.shippingService = shippingService;
        this.shipFromInfo = shipFromInfo;
    }
}
