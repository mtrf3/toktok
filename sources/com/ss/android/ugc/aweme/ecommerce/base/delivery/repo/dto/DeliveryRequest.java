package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C27002Aik;
import X.C279017q;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class DeliveryRequest implements Parcelable {
    public static final Parcelable.Creator<DeliveryRequest> CREATOR = new C27002Aik();

    @InterfaceC65349Pkn("buyer_addr_id")
    public final String addressId;

    @InterfaceC65349Pkn("ship_to_addr")
    public final List<Region> area;

    @InterfaceC65349Pkn("experiment")
    public final Map<String, Map<String, Integer>> experiment;

    @InterfaceC65349Pkn("order_skus")
    public final List<OrderSKUDTO> orderSKUs;

    @InterfaceC65349Pkn("pdp_to_logistic_list_info")
    public final String pdpToLogisticListInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public DeliveryRequest() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        List<OrderSKUDTO> list = this.orderSKUs;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((OrderSKUDTO) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        out.writeString(this.addressId);
        List<Region> list2 = this.area;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ2 = C279017q.LIZIZ(out, 1, list2);
            while (LIZIZ2.hasNext()) {
                ((Region) LIZIZ2.next()).writeToParcel(out, i);
            }
        }
        Map<String, Map<String, Integer>> map = this.experiment;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry<String, Map<String, Integer>> entry : map.entrySet()) {
                out.writeString(entry.getKey());
                Map<String, Integer> value = entry.getValue();
                out.writeInt(value.size());
                for (Map.Entry<String, Integer> entry2 : value.entrySet()) {
                    out.writeString(entry2.getKey());
                    out.writeInt(entry2.getValue().intValue());
                }
            }
        }
        out.writeString(this.pdpToLogisticListInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeliveryRequest(List<OrderSKUDTO> list, String str, List<Region> list2, Map<String, ? extends Map<String, Integer>> map, String str2) {
        this.orderSKUs = list;
        this.addressId = str;
        this.area = list2;
        this.experiment = map;
        this.pdpToLogisticListInfo = str2;
    }

    public /* synthetic */ DeliveryRequest(List list, String str, List list2, Map map, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : map, (i & 16) == 0 ? str2 : null);
    }
}
