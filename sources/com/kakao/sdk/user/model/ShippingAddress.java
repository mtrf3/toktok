package com.kakao.sdk.user.model;

import X.C16880lQ;
import X.InterfaceC65349Pkn;
import X.InterfaceC65404Plg;
import com.kakao.sdk.common.json.KakaoIntDateTypeAdapter;
import java.util.Date;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ShippingAddress {
    public final String baseAddress;
    public final String detailAddress;
    public final long id;

    @InterfaceC65349Pkn("default")
    public final boolean isDefault;
    public final String name;
    public final String receiverName;
    public final String receiverPhoneNumber1;
    public final String receiverPhoneNumber2;
    public final ShippingAddressType type;

    @InterfaceC65404Plg(KakaoIntDateTypeAdapter.class)
    public final Date updatedAt;
    public final String zipCode;
    public final String zoneNumber;

    public static /* synthetic */ ShippingAddress copy$default(ShippingAddress shippingAddress, long j, String str, boolean z, Date date, ShippingAddressType shippingAddressType, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            j = shippingAddress.id;
        }
        if ((i & 2) != 0) {
            str = shippingAddress.name;
        }
        if ((i & 4) != 0) {
            z = shippingAddress.isDefault;
        }
        if ((i & 8) != 0) {
            date = shippingAddress.updatedAt;
        }
        if ((i & 16) != 0) {
            shippingAddressType = shippingAddress.type;
        }
        if ((i & 32) != 0) {
            str2 = shippingAddress.baseAddress;
        }
        if ((i & 64) != 0) {
            str3 = shippingAddress.detailAddress;
        }
        if ((i & 128) != 0) {
            str4 = shippingAddress.receiverName;
        }
        if ((i & 256) != 0) {
            str5 = shippingAddress.receiverPhoneNumber1;
        }
        if ((i & 512) != 0) {
            str6 = shippingAddress.receiverPhoneNumber2;
        }
        if ((i & 1024) != 0) {
            str7 = shippingAddress.zoneNumber;
        }
        if ((i & 2048) != 0) {
            str8 = shippingAddress.zipCode;
        }
        return shippingAddress.copy(j, str, z, date, shippingAddressType, str2, str3, str4, str5, str6, str7, str8);
    }

    public final ShippingAddress copy(long j, String str, boolean z, Date date, ShippingAddressType shippingAddressType, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return new ShippingAddress(j, str, z, date, shippingAddressType, str2, str3, str4, str5, str6, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingAddress)) {
            return false;
        }
        ShippingAddress shippingAddress = (ShippingAddress) obj;
        return this.id == shippingAddress.id && o.LJ(this.name, shippingAddress.name) && this.isDefault == shippingAddress.isDefault && o.LJ(this.updatedAt, shippingAddress.updatedAt) && this.type == shippingAddress.type && o.LJ(this.baseAddress, shippingAddress.baseAddress) && o.LJ(this.detailAddress, shippingAddress.detailAddress) && o.LJ(this.receiverName, shippingAddress.receiverName) && o.LJ(this.receiverPhoneNumber1, shippingAddress.receiverPhoneNumber1) && o.LJ(this.receiverPhoneNumber2, shippingAddress.receiverPhoneNumber2) && o.LJ(this.zoneNumber, shippingAddress.zoneNumber) && o.LJ(this.zipCode, shippingAddress.zipCode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int LLJIJIL = C16880lQ.LLJIJIL(this.id) * 31;
        String str = this.name;
        int hashCode = (LLJIJIL + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.isDefault;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        Date date = this.updatedAt;
        int hashCode2 = (i2 + (date == null ? 0 : date.hashCode())) * 31;
        ShippingAddressType shippingAddressType = this.type;
        int hashCode3 = (hashCode2 + (shippingAddressType == null ? 0 : shippingAddressType.hashCode())) * 31;
        String str2 = this.baseAddress;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.detailAddress;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.receiverName;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.receiverPhoneNumber1;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.receiverPhoneNumber2;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.zoneNumber;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.zipCode;
        return hashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        return "ShippingAddress(id=" + this.id + ", name=" + ((Object) this.name) + ", isDefault=" + this.isDefault + ", updatedAt=" + this.updatedAt + ", type=" + this.type + ", baseAddress=" + ((Object) this.baseAddress) + ", detailAddress=" + ((Object) this.detailAddress) + ", receiverName=" + ((Object) this.receiverName) + ", receiverPhoneNumber1=" + ((Object) this.receiverPhoneNumber1) + ", receiverPhoneNumber2=" + ((Object) this.receiverPhoneNumber2) + ", zoneNumber=" + ((Object) this.zoneNumber) + ", zipCode=" + ((Object) this.zipCode) + ')';
    }

    public final String getBaseAddress() {
        return this.baseAddress;
    }

    public final String getDetailAddress() {
        return this.detailAddress;
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getReceiverName() {
        return this.receiverName;
    }

    public final String getReceiverPhoneNumber1() {
        return this.receiverPhoneNumber1;
    }

    public final String getReceiverPhoneNumber2() {
        return this.receiverPhoneNumber2;
    }

    public final ShippingAddressType getType() {
        return this.type;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getZipCode() {
        return this.zipCode;
    }

    public final String getZoneNumber() {
        return this.zoneNumber;
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public ShippingAddress(long j, String str, boolean z, Date date, ShippingAddressType shippingAddressType, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.id = j;
        this.name = str;
        this.isDefault = z;
        this.updatedAt = date;
        this.type = shippingAddressType;
        this.baseAddress = str2;
        this.detailAddress = str3;
        this.receiverName = str4;
        this.receiverPhoneNumber1 = str5;
        this.receiverPhoneNumber2 = str6;
        this.zoneNumber = str7;
        this.zipCode = str8;
    }
}
