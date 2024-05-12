package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C27349AoL;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SelfOperatedSloganInfo implements Parcelable {
    public static final Parcelable.Creator<SelfOperatedSloganInfo> CREATOR = new C27349AoL();

    @InterfaceC65349Pkn("arrow_color")
    public final com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor arrowColor;

    @InterfaceC65349Pkn("background_color")
    public final com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor backgroundColor;

    @InterfaceC65349Pkn("background_image")
    public final Icon backgroundImage;

    @InterfaceC65349Pkn("logo_image")
    public final Image logoImage;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @InterfaceC65349Pkn("text")
    public final LinkText text;

    @InterfaceC65349Pkn("title")
    public final LinkText title;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelfOperatedSloganInfo)) {
            return false;
        }
        SelfOperatedSloganInfo selfOperatedSloganInfo = (SelfOperatedSloganInfo) obj;
        return o.LJ(this.logoImage, selfOperatedSloganInfo.logoImage) && o.LJ(this.backgroundImage, selfOperatedSloganInfo.backgroundImage) && o.LJ(this.backgroundColor, selfOperatedSloganInfo.backgroundColor) && o.LJ(this.title, selfOperatedSloganInfo.title) && o.LJ(this.text, selfOperatedSloganInfo.text) && o.LJ(this.schema, selfOperatedSloganInfo.schema) && o.LJ(this.arrowColor, selfOperatedSloganInfo.arrowColor);
    }

    public final int hashCode() {
        Image image = this.logoImage;
        int hashCode = (image == null ? 0 : image.hashCode()) * 31;
        Icon icon = this.backgroundImage;
        int hashCode2 = (hashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor commonColor = this.backgroundColor;
        int hashCode3 = (hashCode2 + (commonColor == null ? 0 : commonColor.hashCode())) * 31;
        LinkText linkText = this.title;
        int hashCode4 = (hashCode3 + (linkText == null ? 0 : linkText.hashCode())) * 31;
        LinkText linkText2 = this.text;
        int hashCode5 = (hashCode4 + (linkText2 == null ? 0 : linkText2.hashCode())) * 31;
        String str = this.schema;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor commonColor2 = this.arrowColor;
        return hashCode6 + (commonColor2 != null ? commonColor2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SelfOperatedSloganInfo(logoImage=");
        LIZ.append(this.logoImage);
        LIZ.append(", backgroundImage=");
        LIZ.append(this.backgroundImage);
        LIZ.append(", backgroundColor=");
        LIZ.append(this.backgroundColor);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", text=");
        LIZ.append(this.text);
        LIZ.append(", schema=");
        LIZ.append(this.schema);
        LIZ.append(", arrowColor=");
        LIZ.append(this.arrowColor);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeParcelable(this.logoImage, i);
        Icon icon = this.backgroundImage;
        if (icon == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon.writeToParcel(out, i);
        }
        com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor commonColor = this.backgroundColor;
        if (commonColor == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            commonColor.writeToParcel(out, i);
        }
        LinkText linkText = this.title;
        if (linkText == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            linkText.writeToParcel(out, i);
        }
        LinkText linkText2 = this.text;
        if (linkText2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            linkText2.writeToParcel(out, i);
        }
        out.writeString(this.schema);
        com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor commonColor2 = this.arrowColor;
        if (commonColor2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            commonColor2.writeToParcel(out, i);
        }
    }

    public SelfOperatedSloganInfo(Image image, Icon icon, com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor commonColor, LinkText linkText, LinkText linkText2, String str, com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor commonColor2) {
        this.logoImage = image;
        this.backgroundImage = icon;
        this.backgroundColor = commonColor;
        this.title = linkText;
        this.text = linkText2;
        this.schema = str;
        this.arrowColor = commonColor2;
    }
}
