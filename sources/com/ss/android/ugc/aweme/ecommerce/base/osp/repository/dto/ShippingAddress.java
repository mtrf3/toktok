package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ShippingAddress {

    @InterfaceC65349Pkn("address_reachable")
    public final Boolean addressReachable;

    @InterfaceC65349Pkn("address_valid")
    public final Boolean addressValid;

    @InterfaceC65349Pkn("invalid_hint_message")
    public final String invalidHintMessage;

    @InterfaceC65349Pkn("shipping_address")
    public final Address shippingAddress;

    @InterfaceC65349Pkn("sku_reachables")
    public final List<SkuReachable> skuReachables;

    @InterfaceC65349Pkn("starling_texts")
    public final AddressStarling starlingTexts;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShippingAddress copy$default(ShippingAddress shippingAddress, Address address, Boolean bool, List list, String str, Boolean bool2, String str2, AddressStarling addressStarling, int i, Object obj) {
        if ((i & 1) != 0) {
            address = shippingAddress.shippingAddress;
        }
        if ((i & 2) != 0) {
            bool = shippingAddress.addressReachable;
        }
        if ((i & 4) != 0) {
            list = shippingAddress.skuReachables;
        }
        if ((i & 8) != 0) {
            str = shippingAddress.invalidHintMessage;
        }
        if ((i & 16) != 0) {
            bool2 = shippingAddress.addressValid;
        }
        if ((i & 32) != 0) {
            str2 = shippingAddress.title;
        }
        if ((i & 64) != 0) {
            addressStarling = shippingAddress.starlingTexts;
        }
        return shippingAddress.copy(address, bool, list, str, bool2, str2, addressStarling);
    }

    public final ShippingAddress copy(Address address, Boolean bool, List<SkuReachable> list, String str, Boolean bool2, String str2, AddressStarling addressStarling) {
        return new ShippingAddress(address, bool, list, str, bool2, str2, addressStarling);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingAddress)) {
            return false;
        }
        ShippingAddress shippingAddress = (ShippingAddress) obj;
        return o.LJ(this.shippingAddress, shippingAddress.shippingAddress) && o.LJ(this.addressReachable, shippingAddress.addressReachable) && o.LJ(this.skuReachables, shippingAddress.skuReachables) && o.LJ(this.invalidHintMessage, shippingAddress.invalidHintMessage) && o.LJ(this.addressValid, shippingAddress.addressValid) && o.LJ(this.title, shippingAddress.title) && o.LJ(this.starlingTexts, shippingAddress.starlingTexts);
    }

    public int hashCode() {
        Address address = this.shippingAddress;
        int hashCode = (address == null ? 0 : address.hashCode()) * 31;
        Boolean bool = this.addressReachable;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<SkuReachable> list = this.skuReachables;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.invalidHintMessage;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.addressValid;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.title;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AddressStarling addressStarling = this.starlingTexts;
        return hashCode6 + (addressStarling != null ? addressStarling.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShippingAddress(shippingAddress=");
        LIZ.append(this.shippingAddress);
        LIZ.append(", addressReachable=");
        LIZ.append(this.addressReachable);
        LIZ.append(", skuReachables=");
        LIZ.append(this.skuReachables);
        LIZ.append(", invalidHintMessage=");
        LIZ.append(this.invalidHintMessage);
        LIZ.append(", addressValid=");
        LIZ.append(this.addressValid);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", starlingTexts=");
        LIZ.append(this.starlingTexts);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Boolean getAddressReachable() {
        return this.addressReachable;
    }

    public final Boolean getAddressValid() {
        return this.addressValid;
    }

    public final String getInvalidHintMessage() {
        return this.invalidHintMessage;
    }

    public final Address getShippingAddress() {
        return this.shippingAddress;
    }

    public final List<SkuReachable> getSkuReachables() {
        return this.skuReachables;
    }

    public final AddressStarling getStarlingTexts() {
        return this.starlingTexts;
    }

    public final String getTitle() {
        return this.title;
    }

    public ShippingAddress(Address address, Boolean bool, List<SkuReachable> list, String str, Boolean bool2, String str2, AddressStarling addressStarling) {
        this.shippingAddress = address;
        this.addressReachable = bool;
        this.skuReachables = list;
        this.invalidHintMessage = str;
        this.addressValid = bool2;
        this.title = str2;
        this.starlingTexts = addressStarling;
    }

    public /* synthetic */ ShippingAddress(Address address, Boolean bool, List list, String str, Boolean bool2, String str2, AddressStarling addressStarling, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(address, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : str2, (i & 64) == 0 ? addressStarling : null);
    }
}
