package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1FJ;
import X.InterfaceC65349Pkn;
import X.RW6;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PdpButton implements Parcelable {
    public static final Parcelable.Creator<PdpButton> CREATOR = new RW6();

    @InterfaceC65349Pkn("action")
    public final Integer buttonAction;

    @InterfaceC65349Pkn("status")
    public final Integer buttonStatus;

    @InterfaceC65349Pkn("style")
    public final Integer buttonStyle;

    @InterfaceC65349Pkn("click_hint")
    public final String clickHint;

    @InterfaceC65349Pkn("desc")
    public final String desc;
    public final Integer descId;

    @InterfaceC65349Pkn("link")
    public final String link;

    @InterfaceC65349Pkn("single_desc")
    public final String singleDesc;

    /* JADX WARN: Multi-variable type inference failed */
    public PdpButton() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdpButton)) {
            return false;
        }
        PdpButton pdpButton = (PdpButton) obj;
        return o.LJ(this.desc, pdpButton.desc) && o.LJ(this.singleDesc, pdpButton.singleDesc) && o.LJ(this.clickHint, pdpButton.clickHint) && o.LJ(this.link, pdpButton.link) && o.LJ(this.buttonAction, pdpButton.buttonAction) && o.LJ(this.buttonStatus, pdpButton.buttonStatus) && o.LJ(this.buttonStyle, pdpButton.buttonStyle) && o.LJ(this.descId, pdpButton.descId);
    }

    public final int hashCode() {
        String str = this.desc;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.singleDesc;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.clickHint;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.link;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.buttonAction;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.buttonStatus;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.buttonStyle;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.descId;
        return hashCode7 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PdpButton(desc=");
        LIZ.append(this.desc);
        LIZ.append(", singleDesc=");
        LIZ.append(this.singleDesc);
        LIZ.append(", clickHint=");
        LIZ.append(this.clickHint);
        LIZ.append(", link=");
        LIZ.append(this.link);
        LIZ.append(", buttonAction=");
        LIZ.append(this.buttonAction);
        LIZ.append(", buttonStatus=");
        LIZ.append(this.buttonStatus);
        LIZ.append(", buttonStyle=");
        LIZ.append(this.buttonStyle);
        LIZ.append(", descId=");
        return s0.LIZJ(LIZ, this.descId, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.desc);
        out.writeString(this.singleDesc);
        out.writeString(this.clickHint);
        out.writeString(this.link);
        Integer num = this.buttonAction;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Integer num2 = this.buttonStatus;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        Integer num3 = this.buttonStyle;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num3);
        }
        Integer num4 = this.descId;
        if (num4 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num4);
        }
    }

    public static PdpButton LIZ(PdpButton pdpButton, String str, Integer num, int i) {
        String str2;
        String str3;
        String str4;
        Integer num2;
        Integer num3;
        Integer num4 = num;
        String str5 = str;
        Integer num5 = null;
        if ((i & 1) != 0) {
            str2 = pdpButton.desc;
        } else {
            str2 = null;
        }
        if ((i & 2) != 0) {
            str3 = pdpButton.singleDesc;
        } else {
            str3 = null;
        }
        if ((i & 4) != 0) {
            str5 = pdpButton.clickHint;
        }
        if ((i & 8) != 0) {
            str4 = pdpButton.link;
        } else {
            str4 = null;
        }
        if ((i & 16) != 0) {
            num2 = pdpButton.buttonAction;
        } else {
            num2 = null;
        }
        if ((i & 32) != 0) {
            num3 = pdpButton.buttonStatus;
        } else {
            num3 = null;
        }
        if ((i & 64) != 0) {
            num4 = pdpButton.buttonStyle;
        }
        if ((i & 128) != 0) {
            num5 = pdpButton.descId;
        }
        return new PdpButton(str2, str3, str5, str4, num2, num3, num4, num5);
    }

    public PdpButton(String str, String str2, String str3, String str4, Integer num, Integer num2, Integer num3, Integer num4) {
        this.desc = str;
        this.singleDesc = str2;
        this.clickHint = str3;
        this.link = str4;
        this.buttonAction = num;
        this.buttonStatus = num2;
        this.buttonStyle = num3;
        this.descId = num4;
    }

    public /* synthetic */ PdpButton(String str, String str2, String str3, String str4, Integer num, Integer num2, Integer num3, Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : num3, (i & 128) == 0 ? num4 : null);
    }
}
