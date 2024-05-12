package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C07670Rv;
import X.C1FJ;
import X.C1FL;
import X.C27086Ak6;
import X.C279017q;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class UserRightDetail implements Parcelable {
    public static final Parcelable.Creator<UserRightDetail> CREATOR = new C27086Ak6();

    @InterfaceC65349Pkn("background_image")
    public final Icon background;

    @InterfaceC65349Pkn("desc_expand")
    public final Boolean descExpand;

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("expose")
    public final Boolean expose;

    @InterfaceC65349Pkn("flag")
    public final Integer flag;

    @InterfaceC65349Pkn("header_background_image")
    public final Icon headerBackgroundImage;

    @InterfaceC65349Pkn("header_font_color")
    public final String headerFontColor;

    @InterfaceC65349Pkn("header_font_dark_color")
    public final String headerFontDarkColor;

    @InterfaceC65349Pkn("icon")
    public final Icon icon;

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("name_en")
    public final String nameEn;

    @InterfaceC65349Pkn("popup_style")
    public final Integer popupStyle;

    @InterfaceC65349Pkn("show_chevron")
    public final Boolean showChevron;

    @InterfaceC65349Pkn("show_popup")
    public final Boolean showPopup;

    @InterfaceC65349Pkn("theme_color")
    public final Integer themeColor;

    @InterfaceC65349Pkn("user_right_desc")
    public final List<UserRightDesc> userRightDesc;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserRightDetail)) {
            return false;
        }
        UserRightDetail userRightDetail = (UserRightDetail) obj;
        return o.LJ(this.id, userRightDetail.id) && o.LJ(this.name, userRightDetail.name) && o.LJ(this.icon, userRightDetail.icon) && o.LJ(this.userRightDesc, userRightDetail.userRightDesc) && o.LJ(this.description, userRightDetail.description) && o.LJ(this.descExpand, userRightDetail.descExpand) && o.LJ(this.expose, userRightDetail.expose) && o.LJ(this.nameEn, userRightDetail.nameEn) && o.LJ(this.background, userRightDetail.background) && o.LJ(this.flag, userRightDetail.flag) && o.LJ(this.showChevron, userRightDetail.showChevron) && o.LJ(this.headerBackgroundImage, userRightDetail.headerBackgroundImage) && o.LJ(this.themeColor, userRightDetail.themeColor) && o.LJ(this.popupStyle, userRightDetail.popupStyle) && o.LJ(this.showPopup, userRightDetail.showPopup) && o.LJ(this.headerFontColor, userRightDetail.headerFontColor) && o.LJ(this.headerFontDarkColor, userRightDetail.headerFontDarkColor);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Icon icon = this.icon;
        int hashCode3 = (hashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
        List<UserRightDesc> list = this.userRightDesc;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.description;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.descExpand;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.expose;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.nameEn;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Icon icon2 = this.background;
        int hashCode9 = (hashCode8 + (icon2 == null ? 0 : icon2.hashCode())) * 31;
        Integer num = this.flag;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool3 = this.showChevron;
        int hashCode11 = (hashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Icon icon3 = this.headerBackgroundImage;
        int hashCode12 = (hashCode11 + (icon3 == null ? 0 : icon3.hashCode())) * 31;
        Integer num2 = this.themeColor;
        int hashCode13 = (hashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.popupStyle;
        int hashCode14 = (hashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool4 = this.showPopup;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str5 = this.headerFontColor;
        int hashCode16 = (hashCode15 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.headerFontDarkColor;
        return hashCode16 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserRightDetail(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", userRightDesc=");
        sb.append(this.userRightDesc);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", descExpand=");
        sb.append(this.descExpand);
        sb.append(", expose=");
        sb.append(this.expose);
        sb.append(", nameEn=");
        sb.append(this.nameEn);
        sb.append(", background=");
        sb.append(this.background);
        sb.append(", flag=");
        sb.append(this.flag);
        sb.append(", showChevron=");
        sb.append(this.showChevron);
        sb.append(", headerBackgroundImage=");
        sb.append(this.headerBackgroundImage);
        sb.append(", themeColor=");
        sb.append(this.themeColor);
        sb.append(", popupStyle=");
        sb.append(this.popupStyle);
        sb.append(", showPopup=");
        sb.append(this.showPopup);
        sb.append(", headerFontColor=");
        sb.append(this.headerFontColor);
        sb.append(", headerFontDarkColor=");
        return C07670Rv.LIZIZ(sb, this.headerFontDarkColor, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.id);
        out.writeString(this.name);
        Icon icon = this.icon;
        if (icon == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon.writeToParcel(out, i);
        }
        List<UserRightDesc> list = this.userRightDesc;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((UserRightDesc) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        out.writeString(this.description);
        Boolean bool = this.descExpand;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        Boolean bool2 = this.expose;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool2);
        }
        out.writeString(this.nameEn);
        Icon icon2 = this.background;
        if (icon2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon2.writeToParcel(out, i);
        }
        Integer num = this.flag;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Boolean bool3 = this.showChevron;
        if (bool3 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool3);
        }
        Icon icon3 = this.headerBackgroundImage;
        if (icon3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon3.writeToParcel(out, i);
        }
        Integer num2 = this.themeColor;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        Integer num3 = this.popupStyle;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num3);
        }
        Boolean bool4 = this.showPopup;
        if (bool4 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool4);
        }
        out.writeString(this.headerFontColor);
        out.writeString(this.headerFontDarkColor);
    }

    public UserRightDetail(String str, String str2, Icon icon, List<UserRightDesc> list, String str3, Boolean bool, Boolean bool2, String str4, Icon icon2, Integer num, Boolean bool3, Icon icon3, Integer num2, Integer num3, Boolean bool4, String str5, String str6) {
        this.id = str;
        this.name = str2;
        this.icon = icon;
        this.userRightDesc = list;
        this.description = str3;
        this.descExpand = bool;
        this.expose = bool2;
        this.nameEn = str4;
        this.background = icon2;
        this.flag = num;
        this.showChevron = bool3;
        this.headerBackgroundImage = icon3;
        this.themeColor = num2;
        this.popupStyle = num3;
        this.showPopup = bool4;
        this.headerFontColor = str5;
        this.headerFontDarkColor = str6;
    }
}
