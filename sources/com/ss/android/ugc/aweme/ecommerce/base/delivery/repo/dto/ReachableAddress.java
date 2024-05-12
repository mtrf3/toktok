package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C1FL;
import X.C26640Acu;
import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ReachableAddress implements Parcelable {
    public static final Parcelable.Creator<ReachableAddress> CREATOR = new C26640Acu();

    @InterfaceC65349Pkn("shipping_address")
    public final Address address;

    @InterfaceC65349Pkn("address_default_selection")
    public final Boolean addressDefaultSelect;

    @InterfaceC65349Pkn("address_valid")
    public final Boolean addressValid;

    @InterfaceC65349Pkn("available_for_change")
    public final Boolean availableForChange;

    @InterfaceC65349Pkn("available_for_incentive")
    public final Boolean availableForIncentive;

    @InterfaceC65349Pkn("invalid_hint_message")
    public final String invalidHintMessage;
    public boolean isSelect;

    @InterfaceC65349Pkn("address_reachable")
    public final Boolean reachable;

    @InterfaceC65349Pkn("unavailable_change_hint")
    public final String unavailableChangeHint;

    @InterfaceC65349Pkn("unavailable_incentive_hint")
    public final String unavailableIncentiveHint;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReachableAddress)) {
            return false;
        }
        ReachableAddress reachableAddress = (ReachableAddress) obj;
        return o.LJ(this.reachable, reachableAddress.reachable) && o.LJ(this.address, reachableAddress.address) && o.LJ(this.invalidHintMessage, reachableAddress.invalidHintMessage) && o.LJ(this.addressValid, reachableAddress.addressValid) && o.LJ(this.availableForIncentive, reachableAddress.availableForIncentive) && o.LJ(this.unavailableIncentiveHint, reachableAddress.unavailableIncentiveHint) && o.LJ(this.addressDefaultSelect, reachableAddress.addressDefaultSelect) && o.LJ(this.availableForChange, reachableAddress.availableForChange) && o.LJ(this.unavailableChangeHint, reachableAddress.unavailableChangeHint) && this.isSelect == reachableAddress.isSelect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Boolean bool = this.reachable;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Address address = this.address;
        int hashCode2 = (hashCode + (address == null ? 0 : address.hashCode())) * 31;
        String str = this.invalidHintMessage;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.addressValid;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.availableForIncentive;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.unavailableIncentiveHint;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool4 = this.addressDefaultSelect;
        int hashCode7 = (hashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.availableForChange;
        int hashCode8 = (hashCode7 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str3 = this.unavailableChangeHint;
        int hashCode9 = (hashCode8 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.isSelect;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode9 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReachableAddress(reachable=");
        LIZ.append(this.reachable);
        LIZ.append(", address=");
        LIZ.append(this.address);
        LIZ.append(", invalidHintMessage=");
        LIZ.append(this.invalidHintMessage);
        LIZ.append(", addressValid=");
        LIZ.append(this.addressValid);
        LIZ.append(", availableForIncentive=");
        LIZ.append(this.availableForIncentive);
        LIZ.append(", unavailableIncentiveHint=");
        LIZ.append(this.unavailableIncentiveHint);
        LIZ.append(", addressDefaultSelect=");
        LIZ.append(this.addressDefaultSelect);
        LIZ.append(", availableForChange=");
        LIZ.append(this.availableForChange);
        LIZ.append(", unavailableChangeHint=");
        LIZ.append(this.unavailableChangeHint);
        LIZ.append(", isSelect=");
        return C48339Iy7.LIZJ(LIZ, this.isSelect, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Boolean bool = this.reachable;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        Address address = this.address;
        if (address == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            address.writeToParcel(out, i);
        }
        out.writeString(this.invalidHintMessage);
        Boolean bool2 = this.addressValid;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool2);
        }
        Boolean bool3 = this.availableForIncentive;
        if (bool3 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool3);
        }
        out.writeString(this.unavailableIncentiveHint);
        Boolean bool4 = this.addressDefaultSelect;
        if (bool4 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool4);
        }
        Boolean bool5 = this.availableForChange;
        if (bool5 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool5);
        }
        out.writeString(this.unavailableChangeHint);
        out.writeInt(this.isSelect ? 1 : 0);
    }

    public static ReachableAddress LIZ(ReachableAddress reachableAddress, Boolean bool, boolean z, int i) {
        Address address;
        String str;
        Boolean bool2;
        Boolean bool3;
        String str2;
        Boolean bool4;
        Boolean bool5;
        boolean z2 = z;
        Boolean bool6 = bool;
        if ((i & 1) != 0) {
            bool6 = reachableAddress.reachable;
        }
        String str3 = null;
        if ((i & 2) != 0) {
            address = reachableAddress.address;
        } else {
            address = null;
        }
        if ((i & 4) != 0) {
            str = reachableAddress.invalidHintMessage;
        } else {
            str = null;
        }
        if ((i & 8) != 0) {
            bool2 = reachableAddress.addressValid;
        } else {
            bool2 = null;
        }
        if ((i & 16) != 0) {
            bool3 = reachableAddress.availableForIncentive;
        } else {
            bool3 = null;
        }
        if ((i & 32) != 0) {
            str2 = reachableAddress.unavailableIncentiveHint;
        } else {
            str2 = null;
        }
        if ((i & 64) != 0) {
            bool4 = reachableAddress.addressDefaultSelect;
        } else {
            bool4 = null;
        }
        if ((i & 128) != 0) {
            bool5 = reachableAddress.availableForChange;
        } else {
            bool5 = null;
        }
        if ((i & 256) != 0) {
            str3 = reachableAddress.unavailableChangeHint;
        }
        if ((i & 512) != 0) {
            z2 = reachableAddress.isSelect;
        }
        reachableAddress.getClass();
        return new ReachableAddress(bool6, address, str, bool2, bool3, str2, bool4, bool5, str3, z2);
    }

    public ReachableAddress(Boolean bool, Address address, String str, Boolean bool2, Boolean bool3, String str2, Boolean bool4, Boolean bool5, String str3, boolean z) {
        this.reachable = bool;
        this.address = address;
        this.invalidHintMessage = str;
        this.addressValid = bool2;
        this.availableForIncentive = bool3;
        this.unavailableIncentiveHint = str2;
        this.addressDefaultSelect = bool4;
        this.availableForChange = bool5;
        this.unavailableChangeHint = str3;
        this.isSelect = z;
    }

    public /* synthetic */ ReachableAddress(Boolean bool, Address address, String str, Boolean bool2, Boolean bool3, String str2, Boolean bool4, Boolean bool5, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, address, str, bool2, bool3, str2, bool4, (i & 128) != 0 ? null : bool5, (i & 256) == 0 ? str3 : null, (i & 512) != 0 ? false : z);
    }
}
