package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1FJ;
import X.C26714Ae6;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class UserRightDescBlock implements Parcelable {
    public static final Parcelable.Creator<UserRightDescBlock> CREATOR = new C26714Ae6();

    @InterfaceC65349Pkn("link_text")
    public final LinkText linkText;

    @InterfaceC65349Pkn("logos")
    public final List<Icon> logos;

    @InterfaceC65349Pkn("mix_link_description")
    public final LinkRichText mixLinkDescription;

    @InterfaceC65349Pkn("plain_description")
    public final String plainDescription;

    @InterfaceC65349Pkn("type")
    public final Integer type;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserRightDescBlock)) {
            return false;
        }
        UserRightDescBlock userRightDescBlock = (UserRightDescBlock) obj;
        return o.LJ(this.type, userRightDescBlock.type) && o.LJ(this.plainDescription, userRightDescBlock.plainDescription) && o.LJ(this.logos, userRightDescBlock.logos) && o.LJ(this.mixLinkDescription, userRightDescBlock.mixLinkDescription) && o.LJ(this.linkText, userRightDescBlock.linkText);
    }

    public final int hashCode() {
        Integer num = this.type;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.plainDescription;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<Icon> list = this.logos;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        LinkRichText linkRichText = this.mixLinkDescription;
        int hashCode4 = (hashCode3 + (linkRichText == null ? 0 : linkRichText.hashCode())) * 31;
        LinkText linkText = this.linkText;
        return hashCode4 + (linkText != null ? linkText.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserRightDescBlock(type=");
        LIZ.append(this.type);
        LIZ.append(", plainDescription=");
        LIZ.append(this.plainDescription);
        LIZ.append(", logos=");
        LIZ.append(this.logos);
        LIZ.append(", mixLinkDescription=");
        LIZ.append(this.mixLinkDescription);
        LIZ.append(", linkText=");
        LIZ.append(this.linkText);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Integer num = this.type;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        out.writeString(this.plainDescription);
        List<Icon> list = this.logos;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((Icon) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        LinkRichText linkRichText = this.mixLinkDescription;
        if (linkRichText == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            linkRichText.writeToParcel(out, i);
        }
        LinkText linkText = this.linkText;
        if (linkText == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            linkText.writeToParcel(out, i);
        }
    }

    public UserRightDescBlock(Integer num, String str, List<Icon> list, LinkRichText linkRichText, LinkText linkText) {
        this.type = num;
        this.plainDescription = str;
        this.logos = list;
        this.mixLinkDescription = linkRichText;
        this.linkText = linkText;
    }
}
