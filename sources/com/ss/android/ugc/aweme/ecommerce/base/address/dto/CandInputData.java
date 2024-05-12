package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CandInputData {

    @InterfaceC65349Pkn("shipping_address")
    public final Address address;

    @InterfaceC65349Pkn("autocomplete_address_id")
    public final String autocompleteAddressId;

    @InterfaceC65349Pkn("item_type")
    public final Integer itemType;

    @InterfaceC65349Pkn("latitude")
    public final String latitude;

    @InterfaceC65349Pkn("longitude")
    public final String longitude;

    @InterfaceC65349Pkn("place_type")
    public final Integer placeType;

    @InterfaceC65349Pkn("type")
    public final Integer type;

    @InterfaceC65349Pkn("view_items")
    public final List<ViewItem> viewItems;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CandInputData)) {
            return false;
        }
        CandInputData candInputData = (CandInputData) obj;
        return o.LJ(this.type, candInputData.type) && o.LJ(this.itemType, candInputData.itemType) && o.LJ(this.viewItems, candInputData.viewItems) && o.LJ(this.address, candInputData.address) && o.LJ(this.autocompleteAddressId, candInputData.autocompleteAddressId) && o.LJ(this.placeType, candInputData.placeType) && o.LJ(this.longitude, candInputData.longitude) && o.LJ(this.latitude, candInputData.latitude);
    }

    public final int hashCode() {
        Integer num = this.type;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.itemType;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<ViewItem> list = this.viewItems;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Address address = this.address;
        int hashCode4 = (hashCode3 + (address == null ? 0 : address.hashCode())) * 31;
        String str = this.autocompleteAddressId;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.placeType;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.longitude;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.latitude;
        return hashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CandInputData(type=");
        LIZ.append(this.type);
        LIZ.append(", itemType=");
        LIZ.append(this.itemType);
        LIZ.append(", viewItems=");
        LIZ.append(this.viewItems);
        LIZ.append(", address=");
        LIZ.append(this.address);
        LIZ.append(", autocompleteAddressId=");
        LIZ.append(this.autocompleteAddressId);
        LIZ.append(", placeType=");
        LIZ.append(this.placeType);
        LIZ.append(", longitude=");
        LIZ.append(this.longitude);
        LIZ.append(", latitude=");
        return q.LIZIZ(LIZ, this.latitude, ')', LIZ);
    }

    public CandInputData(Integer num, Integer num2, List<ViewItem> list, Address address, String str, Integer num3, String str2, String str3) {
        this.type = num;
        this.itemType = num2;
        this.viewItems = list;
        this.address = address;
        this.autocompleteAddressId = str;
        this.placeType = num3;
        this.longitude = str2;
        this.latitude = str3;
    }

    public /* synthetic */ CandInputData(Integer num, Integer num2, List list, Address address, String str, Integer num3, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, num2, list, address, str, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : str2, (i & 128) == 0 ? str3 : null);
    }
}
