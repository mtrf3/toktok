package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C27151Al9;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PDPAppendix implements Parcelable {
    public static final Parcelable.Creator<PDPAppendix> CREATOR = new C27151Al9();

    @InterfaceC65349Pkn("link_icon")
    public final Icon linkIcon;

    @InterfaceC65349Pkn("rich_text")
    public final LinkRichText richText;

    /* JADX WARN: Multi-variable type inference failed */
    public PDPAppendix() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PDPAppendix)) {
            return false;
        }
        PDPAppendix pDPAppendix = (PDPAppendix) obj;
        return o.LJ(this.richText, pDPAppendix.richText) && o.LJ(this.linkIcon, pDPAppendix.linkIcon);
    }

    public final int hashCode() {
        LinkRichText linkRichText = this.richText;
        int hashCode = (linkRichText == null ? 0 : linkRichText.hashCode()) * 31;
        Icon icon = this.linkIcon;
        return hashCode + (icon != null ? icon.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PDPAppendix(richText=");
        LIZ.append(this.richText);
        LIZ.append(", linkIcon=");
        LIZ.append(this.linkIcon);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        LinkRichText linkRichText = this.richText;
        if (linkRichText == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            linkRichText.writeToParcel(out, i);
        }
        Icon icon = this.linkIcon;
        if (icon == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon.writeToParcel(out, i);
        }
    }

    public PDPAppendix(LinkRichText linkRichText, Icon icon) {
        this.richText = linkRichText;
        this.linkIcon = icon;
    }

    public /* synthetic */ PDPAppendix(LinkRichText linkRichText, Icon icon, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : linkRichText, (i & 2) != 0 ? null : icon);
    }
}
