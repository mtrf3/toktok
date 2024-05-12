package com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import defpackage.b0;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class NewUserPopUp {

    @InterfaceC65349Pkn("bottom_info_style")
    public final int bottomInfoStyle;

    @InterfaceC65349Pkn("next_available_time")
    public final long nextAvailableTime;

    @InterfaceC65349Pkn("pin_voucher_style")
    public final int pinVoucherStyle;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @InterfaceC65349Pkn("show_seconds_with_card")
    public final long showSecondsWithCard;

    @InterfaceC65349Pkn("show_seconds_with_pin")
    public final long showSecondsWithPin;

    @InterfaceC65349Pkn("show_seconds_without_card")
    public final long showSecondsWithoutCard;

    @InterfaceC65349Pkn("voucher_infos")
    public final VoucherInfo[] voucher;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewUserPopUp)) {
            return false;
        }
        NewUserPopUp newUserPopUp = (NewUserPopUp) obj;
        return o.LJ(this.schema, newUserPopUp.schema) && this.showSecondsWithCard == newUserPopUp.showSecondsWithCard && this.showSecondsWithoutCard == newUserPopUp.showSecondsWithoutCard && this.showSecondsWithPin == newUserPopUp.showSecondsWithPin && o.LJ(this.voucher, newUserPopUp.voucher) && this.nextAvailableTime == newUserPopUp.nextAvailableTime && this.pinVoucherStyle == newUserPopUp.pinVoucherStyle && this.bottomInfoStyle == newUserPopUp.bottomInfoStyle;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.schema;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.showSecondsWithPin, JBR.LIZJ(this.showSecondsWithoutCard, JBR.LIZJ(this.showSecondsWithCard, hashCode * 31, 31), 31), 31);
        VoucherInfo[] voucherInfoArr = this.voucher;
        if (voucherInfoArr != null) {
            i = Arrays.hashCode(voucherInfoArr);
        }
        return ((JBR.LIZJ(this.nextAvailableTime, (LIZJ + i) * 31, 31) + this.pinVoucherStyle) * 31) + this.bottomInfoStyle;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NewUserPopUp(schema=");
        LIZ.append(this.schema);
        LIZ.append(", showSecondsWithCard=");
        LIZ.append(this.showSecondsWithCard);
        LIZ.append(", showSecondsWithoutCard=");
        LIZ.append(this.showSecondsWithoutCard);
        LIZ.append(", showSecondsWithPin=");
        LIZ.append(this.showSecondsWithPin);
        LIZ.append(", voucher=");
        LIZ.append(Arrays.toString(this.voucher));
        LIZ.append(", nextAvailableTime=");
        LIZ.append(this.nextAvailableTime);
        LIZ.append(", pinVoucherStyle=");
        LIZ.append(this.pinVoucherStyle);
        LIZ.append(", bottomInfoStyle=");
        return b0.LIZJ(LIZ, this.bottomInfoStyle, ')', LIZ);
    }

    public NewUserPopUp(String str, long j, long j2, long j3, VoucherInfo[] voucherInfoArr, long j4, int i, int i2) {
        this.schema = str;
        this.showSecondsWithCard = j;
        this.showSecondsWithoutCard = j2;
        this.showSecondsWithPin = j3;
        this.voucher = voucherInfoArr;
        this.nextAvailableTime = j4;
        this.pinVoucherStyle = i;
        this.bottomInfoStyle = i2;
    }
}
