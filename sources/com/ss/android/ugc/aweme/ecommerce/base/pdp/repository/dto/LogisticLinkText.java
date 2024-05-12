package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1FJ;
import X.C1FL;
import X.C27119Akd;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class LogisticLinkText implements Parcelable {
    public static final Parcelable.Creator<LogisticLinkText> CREATOR = new C27119Akd();

    @InterfaceC65349Pkn("color")
    public final String color;

    @InterfaceC65349Pkn("dark_color")
    public final String darkColor;

    @InterfaceC65349Pkn("has_underscore")
    public final Boolean hasUnderscore;

    @InterfaceC65349Pkn("icon_type")
    public final Integer iconType;

    @InterfaceC65349Pkn("is_bold")
    public final Boolean isBold;

    @InterfaceC65349Pkn("is_italic")
    public final Boolean isItalic;

    @InterfaceC65349Pkn("replace_with_icon")
    public final Boolean replaceWithIcon;

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("text_color_type")
    public final Integer textColorType;

    @InterfaceC65349Pkn("text_font_type")
    public final Integer textFontType;

    /* JADX WARN: Multi-variable type inference failed */
    public LogisticLinkText() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1023, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogisticLinkText)) {
            return false;
        }
        LogisticLinkText logisticLinkText = (LogisticLinkText) obj;
        return o.LJ(this.text, logisticLinkText.text) && o.LJ(this.isBold, logisticLinkText.isBold) && o.LJ(this.hasUnderscore, logisticLinkText.hasUnderscore) && o.LJ(this.color, logisticLinkText.color) && o.LJ(this.darkColor, logisticLinkText.darkColor) && o.LJ(this.isItalic, logisticLinkText.isItalic) && o.LJ(this.replaceWithIcon, logisticLinkText.replaceWithIcon) && o.LJ(this.iconType, logisticLinkText.iconType) && o.LJ(this.textColorType, logisticLinkText.textColorType) && o.LJ(this.textFontType, logisticLinkText.textFontType);
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isBold;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasUnderscore;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.color;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.darkColor;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool3 = this.isItalic;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.replaceWithIcon;
        int hashCode7 = (hashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num = this.iconType;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.textColorType;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.textFontType;
        return hashCode9 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LogisticLinkText(text=");
        LIZ.append(this.text);
        LIZ.append(", isBold=");
        LIZ.append(this.isBold);
        LIZ.append(", hasUnderscore=");
        LIZ.append(this.hasUnderscore);
        LIZ.append(", color=");
        LIZ.append(this.color);
        LIZ.append(", darkColor=");
        LIZ.append(this.darkColor);
        LIZ.append(", isItalic=");
        LIZ.append(this.isItalic);
        LIZ.append(", replaceWithIcon=");
        LIZ.append(this.replaceWithIcon);
        LIZ.append(", iconType=");
        LIZ.append(this.iconType);
        LIZ.append(", textColorType=");
        LIZ.append(this.textColorType);
        LIZ.append(", textFontType=");
        return s0.LIZJ(LIZ, this.textFontType, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.text);
        Boolean bool = this.isBold;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        Boolean bool2 = this.hasUnderscore;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool2);
        }
        out.writeString(this.color);
        out.writeString(this.darkColor);
        Boolean bool3 = this.isItalic;
        if (bool3 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool3);
        }
        Boolean bool4 = this.replaceWithIcon;
        if (bool4 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool4);
        }
        Integer num = this.iconType;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Integer num2 = this.textColorType;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        Integer num3 = this.textFontType;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num3);
        }
    }

    public LogisticLinkText(String str, Boolean bool, Boolean bool2, String str2, String str3, Boolean bool3, Boolean bool4, Integer num, Integer num2, Integer num3) {
        this.text = str;
        this.isBold = bool;
        this.hasUnderscore = bool2;
        this.color = str2;
        this.darkColor = str3;
        this.isItalic = bool3;
        this.replaceWithIcon = bool4;
        this.iconType = num;
        this.textColorType = num2;
        this.textFontType = num3;
    }

    public /* synthetic */ LogisticLinkText(String str, Boolean bool, Boolean bool2, String str2, String str3, Boolean bool3, Boolean bool4, Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : bool4, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : num2, (i & 512) == 0 ? num3 : null);
    }
}
