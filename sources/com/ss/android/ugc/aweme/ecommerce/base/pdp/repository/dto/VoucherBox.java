package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C05040Hs;
import X.C1FL;
import X.C69653RVh;
import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class VoucherBox implements Parcelable {
    public static final Parcelable.Creator<VoucherBox> CREATOR = new C69653RVh();

    @InterfaceC65349Pkn("background")
    public final Icon background;

    @InterfaceC65349Pkn("button_text")
    public final String buttonText;

    @InterfaceC65349Pkn("discount_text")
    public final String discountText;

    @InterfaceC65349Pkn("guide_text")
    public final String guideText;

    @InterfaceC65349Pkn("is_claimed")
    public final Boolean isClaimed;

    @InterfaceC65349Pkn("is_special")
    public final String isSpecial;

    @InterfaceC65349Pkn("usable_end_time")
    public final Long usableEndTime;

    @InterfaceC65349Pkn("voucher_id")
    public final String voucherId;

    @InterfaceC65349Pkn("voucher_type_id")
    public final String voucherTypeId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoucherBox)) {
            return false;
        }
        VoucherBox voucherBox = (VoucherBox) obj;
        return o.LJ(this.voucherId, voucherBox.voucherId) && o.LJ(this.voucherTypeId, voucherBox.voucherTypeId) && o.LJ(this.discountText, voucherBox.discountText) && o.LJ(this.guideText, voucherBox.guideText) && o.LJ(this.usableEndTime, voucherBox.usableEndTime) && o.LJ(this.background, voucherBox.background) && o.LJ(this.buttonText, voucherBox.buttonText) && o.LJ(this.isSpecial, voucherBox.isSpecial) && o.LJ(this.isClaimed, voucherBox.isClaimed);
    }

    public final int hashCode() {
        String str = this.voucherId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.voucherTypeId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.discountText;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.guideText;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.usableEndTime;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Icon icon = this.background;
        int hashCode6 = (hashCode5 + (icon == null ? 0 : icon.hashCode())) * 31;
        String str5 = this.buttonText;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.isSpecial;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.isClaimed;
        return hashCode8 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VoucherBox(voucherId=");
        LIZ.append(this.voucherId);
        LIZ.append(", voucherTypeId=");
        LIZ.append(this.voucherTypeId);
        LIZ.append(", discountText=");
        LIZ.append(this.discountText);
        LIZ.append(", guideText=");
        LIZ.append(this.guideText);
        LIZ.append(", usableEndTime=");
        LIZ.append(this.usableEndTime);
        LIZ.append(", background=");
        LIZ.append(this.background);
        LIZ.append(", buttonText=");
        LIZ.append(this.buttonText);
        LIZ.append(", isSpecial=");
        LIZ.append(this.isSpecial);
        LIZ.append(", isClaimed=");
        return C78920UyC.LIZIZ(LIZ, this.isClaimed, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.voucherId);
        out.writeString(this.voucherTypeId);
        out.writeString(this.discountText);
        out.writeString(this.guideText);
        Long l = this.usableEndTime;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        Icon icon = this.background;
        if (icon == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon.writeToParcel(out, i);
        }
        out.writeString(this.buttonText);
        out.writeString(this.isSpecial);
        Boolean bool = this.isClaimed;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
    }

    public VoucherBox(String str, String str2, String str3, String str4, Long l, Icon icon, String str5, String str6, Boolean bool) {
        this.voucherId = str;
        this.voucherTypeId = str2;
        this.discountText = str3;
        this.guideText = str4;
        this.usableEndTime = l;
        this.background = icon;
        this.buttonText = str5;
        this.isSpecial = str6;
        this.isClaimed = bool;
    }
}
