package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C1FJ;
import X.C1FL;
import X.C26858AgQ;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CommonColor;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class LinkText implements Parcelable {
    public static final Parcelable.Creator<LinkText> CREATOR = new C26858AgQ();

    @InterfaceC65349Pkn("color")
    public final String color;

    @InterfaceC65349Pkn("has_strike")
    public final Boolean hasStrike;

    @InterfaceC65349Pkn("has_underscore")
    public final Boolean hasUnderscore;

    @InterfaceC65349Pkn("icon")
    public final Icon icon;

    @InterfaceC65349Pkn("is_bold")
    public final Boolean isBold;

    @InterfaceC65349Pkn("is_third_party_link")
    public final Boolean isThirdPartyLink;

    @InterfaceC65349Pkn("link")
    public final String link;

    @InterfaceC65349Pkn("link_text_type")
    public final Integer linkTextType;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("show_arrow")
    public final Boolean showArrow;

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("text_color")
    public final Integer textColor;

    @InterfaceC65349Pkn("text_raw_color")
    public final CommonColor textRawColor;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkText)) {
            return false;
        }
        LinkText linkText = (LinkText) obj;
        return o.LJ(this.text, linkText.text) && o.LJ(this.link, linkText.link) && o.LJ(this.isThirdPartyLink, linkText.isThirdPartyLink) && o.LJ(this.name, linkText.name) && o.LJ(this.isBold, linkText.isBold) && o.LJ(this.hasUnderscore, linkText.hasUnderscore) && o.LJ(this.color, linkText.color) && o.LJ(this.textColor, linkText.textColor) && o.LJ(this.showArrow, linkText.showArrow) && o.LJ(this.textRawColor, linkText.textRawColor) && o.LJ(this.hasStrike, linkText.hasStrike) && o.LJ(this.linkTextType, linkText.linkTextType) && o.LJ(this.icon, linkText.icon);
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.link;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isThirdPartyLink;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.name;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.isBold;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hasUnderscore;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str4 = this.color;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.textColor;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool4 = this.showArrow;
        int hashCode9 = (hashCode8 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        CommonColor commonColor = this.textRawColor;
        int hashCode10 = (hashCode9 + (commonColor == null ? 0 : commonColor.hashCode())) * 31;
        Boolean bool5 = this.hasStrike;
        int hashCode11 = (hashCode10 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num2 = this.linkTextType;
        int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Icon icon = this.icon;
        return hashCode12 + (icon != null ? icon.hashCode() : 0);
    }

    public final String toString() {
        return "LinkText(text=" + this.text + ", link=" + this.link + ", isThirdPartyLink=" + this.isThirdPartyLink + ", name=" + this.name + ", isBold=" + this.isBold + ", hasUnderscore=" + this.hasUnderscore + ", color=" + this.color + ", textColor=" + this.textColor + ", showArrow=" + this.showArrow + ", textRawColor=" + this.textRawColor + ", hasStrike=" + this.hasStrike + ", linkTextType=" + this.linkTextType + ", icon=" + this.icon + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.text);
        out.writeString(this.link);
        Boolean bool = this.isThirdPartyLink;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        out.writeString(this.name);
        Boolean bool2 = this.isBold;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool2);
        }
        Boolean bool3 = this.hasUnderscore;
        if (bool3 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool3);
        }
        out.writeString(this.color);
        Integer num = this.textColor;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Boolean bool4 = this.showArrow;
        if (bool4 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool4);
        }
        CommonColor commonColor = this.textRawColor;
        if (commonColor == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            commonColor.writeToParcel(out, i);
        }
        Boolean bool5 = this.hasStrike;
        if (bool5 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool5);
        }
        Integer num2 = this.linkTextType;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        Icon icon = this.icon;
        if (icon == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon.writeToParcel(out, i);
        }
    }

    public LinkText(String str, String str2, Boolean bool, String str3, Boolean bool2, Boolean bool3, String str4, Integer num, Boolean bool4, CommonColor commonColor, Boolean bool5, Integer num2, Icon icon) {
        this.text = str;
        this.link = str2;
        this.isThirdPartyLink = bool;
        this.name = str3;
        this.isBold = bool2;
        this.hasUnderscore = bool3;
        this.color = str4;
        this.textColor = num;
        this.showArrow = bool4;
        this.textRawColor = commonColor;
        this.hasStrike = bool5;
        this.linkTextType = num2;
        this.icon = icon;
    }
}
