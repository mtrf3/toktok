package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C05040Hs;
import X.C1FJ;
import X.C69655RVj;
import X.C69657RVl;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RecallBox implements Parcelable {
    public static final C69657RVl BoxType = new C69657RVl();
    public static final Parcelable.Creator<RecallBox> CREATOR = new C69655RVj();

    @InterfaceC65349Pkn("box_type")
    public final Integer boxType;

    @InterfaceC65349Pkn("da_info")
    public final String daInfo;

    @InterfaceC65349Pkn("disappear_second")
    public final Long disappearSecond;

    @InterfaceC65349Pkn("remind_box")
    public final RemindBox remindBox;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("title_icon")
    public final Icon titleIcon;

    @InterfaceC65349Pkn("voucher_box")
    public final VoucherBox voucherBox;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecallBox)) {
            return false;
        }
        RecallBox recallBox = (RecallBox) obj;
        return o.LJ(this.title, recallBox.title) && o.LJ(this.titleIcon, recallBox.titleIcon) && o.LJ(this.boxType, recallBox.boxType) && o.LJ(this.disappearSecond, recallBox.disappearSecond) && o.LJ(this.voucherBox, recallBox.voucherBox) && o.LJ(this.remindBox, recallBox.remindBox) && o.LJ(this.daInfo, recallBox.daInfo);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Icon icon = this.titleIcon;
        int hashCode2 = (hashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        Integer num = this.boxType;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.disappearSecond;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        VoucherBox voucherBox = this.voucherBox;
        int hashCode5 = (hashCode4 + (voucherBox == null ? 0 : voucherBox.hashCode())) * 31;
        RemindBox remindBox = this.remindBox;
        int hashCode6 = (hashCode5 + (remindBox == null ? 0 : remindBox.hashCode())) * 31;
        String str2 = this.daInfo;
        return hashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecallBox(title=");
        LIZ.append(this.title);
        LIZ.append(", titleIcon=");
        LIZ.append(this.titleIcon);
        LIZ.append(", boxType=");
        LIZ.append(this.boxType);
        LIZ.append(", disappearSecond=");
        LIZ.append(this.disappearSecond);
        LIZ.append(", voucherBox=");
        LIZ.append(this.voucherBox);
        LIZ.append(", remindBox=");
        LIZ.append(this.remindBox);
        LIZ.append(", daInfo=");
        return q.LIZIZ(LIZ, this.daInfo, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.title);
        Icon icon = this.titleIcon;
        if (icon == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon.writeToParcel(out, i);
        }
        Integer num = this.boxType;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Long l = this.disappearSecond;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        VoucherBox voucherBox = this.voucherBox;
        if (voucherBox == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            voucherBox.writeToParcel(out, i);
        }
        RemindBox remindBox = this.remindBox;
        if (remindBox == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            remindBox.writeToParcel(out, i);
        }
        out.writeString(this.daInfo);
    }

    public RecallBox(String str, Icon icon, Integer num, Long l, VoucherBox voucherBox, RemindBox remindBox, String str2) {
        this.title = str;
        this.titleIcon = icon;
        this.boxType = num;
        this.disappearSecond = l;
        this.voucherBox = voucherBox;
        this.remindBox = remindBox;
        this.daInfo = str2;
    }
}
