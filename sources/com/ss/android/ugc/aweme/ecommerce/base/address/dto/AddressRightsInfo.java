package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C27219AmF;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AddressRightsInfo implements Parcelable {
    public static final Parcelable.Creator<AddressRightsInfo> CREATOR = new C27219AmF();

    @InterfaceC65349Pkn("icon")
    public final Icon rightIcon;

    @InterfaceC65349Pkn("rights_template")
    public final LinkRichText rightLinkRichText;

    @InterfaceC65349Pkn("text_color")
    public final String textColor;

    @InterfaceC65349Pkn("text_dark_color")
    public final String textDarkColor;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressRightsInfo)) {
            return false;
        }
        AddressRightsInfo addressRightsInfo = (AddressRightsInfo) obj;
        return o.LJ(this.rightLinkRichText, addressRightsInfo.rightLinkRichText) && o.LJ(this.rightIcon, addressRightsInfo.rightIcon) && o.LJ(this.textColor, addressRightsInfo.textColor) && o.LJ(this.textDarkColor, addressRightsInfo.textDarkColor);
    }

    public final int hashCode() {
        LinkRichText linkRichText = this.rightLinkRichText;
        int hashCode = (linkRichText == null ? 0 : linkRichText.hashCode()) * 31;
        Icon icon = this.rightIcon;
        int hashCode2 = (hashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        String str = this.textColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.textDarkColor;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        LinkRichText linkRichText = this.rightLinkRichText;
        if (linkRichText == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            linkRichText.writeToParcel(out, i);
        }
        Icon icon = this.rightIcon;
        if (icon == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon.writeToParcel(out, i);
        }
        out.writeString(this.textColor);
        out.writeString(this.textDarkColor);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddressRightsInfo(rightLinkRichText=");
        LIZ.append(this.rightLinkRichText);
        LIZ.append(", rightIcon=");
        LIZ.append(this.rightIcon);
        LIZ.append(", textColor=");
        LIZ.append(this.textColor);
        LIZ.append(", textDarkColor=");
        return q.LIZIZ(LIZ, this.textDarkColor, ')', LIZ);
    }

    public AddressRightsInfo(LinkRichText linkRichText, Icon icon, String str, String str2) {
        this.rightLinkRichText = linkRichText;
        this.rightIcon = icon;
        this.textColor = str;
        this.textDarkColor = str2;
    }
}
