package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1FJ;
import X.C27078Ajy;
import X.C279017q;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SelfOperatedPolicy implements Parcelable {
    public static final Parcelable.Creator<SelfOperatedPolicy> CREATOR = new C27078Ajy();

    @InterfaceC65349Pkn("background_color")
    public final String backgroundColor;

    @InterfaceC65349Pkn("background_dark_color")
    public final String backgroundDarkColor;

    @InterfaceC65349Pkn("background_dark_image")
    public final Image backgroundDarkImage;

    @InterfaceC65349Pkn("background_image")
    public final Image backgroundImage;

    @InterfaceC65349Pkn("font_color")
    public final String fontColor;

    @InterfaceC65349Pkn("font_dark_color")
    public final String fontDarkColor;

    @InterfaceC65349Pkn("icon_color")
    public final String iconColor;

    @InterfaceC65349Pkn("icon_dark_color")
    public final String iconDarkColor;

    @InterfaceC65349Pkn("link_icon_color")
    public final String linkIconColor;

    @InterfaceC65349Pkn("link_icon_dark_color")
    public final String linkIconDarkColor;

    @InterfaceC65349Pkn("self_operated_type")
    public final Integer selfOperatedType;

    @InterfaceC65349Pkn("btn_text")
    public final String text;

    @InterfaceC65349Pkn("page_title")
    public final String title;

    @InterfaceC65349Pkn("right_detail")
    public final List<UserRightDetail> userRightDetails;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelfOperatedPolicy)) {
            return false;
        }
        SelfOperatedPolicy selfOperatedPolicy = (SelfOperatedPolicy) obj;
        return o.LJ(this.selfOperatedType, selfOperatedPolicy.selfOperatedType) && o.LJ(this.iconColor, selfOperatedPolicy.iconColor) && o.LJ(this.iconDarkColor, selfOperatedPolicy.iconDarkColor) && o.LJ(this.linkIconColor, selfOperatedPolicy.linkIconColor) && o.LJ(this.linkIconDarkColor, selfOperatedPolicy.linkIconDarkColor) && o.LJ(this.text, selfOperatedPolicy.text) && o.LJ(this.backgroundColor, selfOperatedPolicy.backgroundColor) && o.LJ(this.backgroundDarkColor, selfOperatedPolicy.backgroundDarkColor) && o.LJ(this.backgroundImage, selfOperatedPolicy.backgroundImage) && o.LJ(this.backgroundDarkImage, selfOperatedPolicy.backgroundDarkImage) && o.LJ(this.fontColor, selfOperatedPolicy.fontColor) && o.LJ(this.fontDarkColor, selfOperatedPolicy.fontDarkColor) && o.LJ(this.title, selfOperatedPolicy.title) && o.LJ(this.userRightDetails, selfOperatedPolicy.userRightDetails);
    }

    public final int hashCode() {
        Integer num = this.selfOperatedType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.iconColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconDarkColor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.linkIconColor;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.linkIconDarkColor;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.text;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.backgroundColor;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.backgroundDarkColor;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Image image = this.backgroundImage;
        int hashCode9 = (hashCode8 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.backgroundDarkImage;
        int hashCode10 = (hashCode9 + (image2 == null ? 0 : image2.hashCode())) * 31;
        String str8 = this.fontColor;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.fontDarkColor;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.title;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<UserRightDetail> list = this.userRightDetails;
        return hashCode13 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "SelfOperatedPolicy(selfOperatedType=" + this.selfOperatedType + ", iconColor=" + this.iconColor + ", iconDarkColor=" + this.iconDarkColor + ", linkIconColor=" + this.linkIconColor + ", linkIconDarkColor=" + this.linkIconDarkColor + ", text=" + this.text + ", backgroundColor=" + this.backgroundColor + ", backgroundDarkColor=" + this.backgroundDarkColor + ", backgroundImage=" + this.backgroundImage + ", backgroundDarkImage=" + this.backgroundDarkImage + ", fontColor=" + this.fontColor + ", fontDarkColor=" + this.fontDarkColor + ", title=" + this.title + ", userRightDetails=" + this.userRightDetails + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Integer num = this.selfOperatedType;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        out.writeString(this.iconColor);
        out.writeString(this.iconDarkColor);
        out.writeString(this.linkIconColor);
        out.writeString(this.linkIconDarkColor);
        out.writeString(this.text);
        out.writeString(this.backgroundColor);
        out.writeString(this.backgroundDarkColor);
        out.writeParcelable(this.backgroundImage, i);
        out.writeParcelable(this.backgroundDarkImage, i);
        out.writeString(this.fontColor);
        out.writeString(this.fontDarkColor);
        out.writeString(this.title);
        List<UserRightDetail> list = this.userRightDetails;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
        while (LIZIZ.hasNext()) {
            ((UserRightDetail) LIZIZ.next()).writeToParcel(out, i);
        }
    }

    public SelfOperatedPolicy(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, Image image, Image image2, String str8, String str9, String str10, List<UserRightDetail> list) {
        this.selfOperatedType = num;
        this.iconColor = str;
        this.iconDarkColor = str2;
        this.linkIconColor = str3;
        this.linkIconDarkColor = str4;
        this.text = str5;
        this.backgroundColor = str6;
        this.backgroundDarkColor = str7;
        this.backgroundImage = image;
        this.backgroundDarkImage = image2;
        this.fontColor = str8;
        this.fontDarkColor = str9;
        this.title = str10;
        this.userRightDetails = list;
    }
}
