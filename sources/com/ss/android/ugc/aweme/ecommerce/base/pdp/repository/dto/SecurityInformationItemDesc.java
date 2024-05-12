package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1FJ;
import X.C26711Ae3;
import X.C26712Ae4;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SecurityInformationItemDesc implements Parcelable {

    @InterfaceC65349Pkn("logos")
    public final List<Icon> logos;

    @InterfaceC65349Pkn("mix_link_description")
    public final LinkRichText mixLinkDescription;

    @InterfaceC65349Pkn("plain_description")
    public final String plainDescription;

    @InterfaceC65349Pkn("type")
    public final Integer type;
    public static final C26712Ae4 Companion = new C26712Ae4();
    public static final Parcelable.Creator<SecurityInformationItemDesc> CREATOR = new C26711Ae3();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecurityInformationItemDesc)) {
            return false;
        }
        SecurityInformationItemDesc securityInformationItemDesc = (SecurityInformationItemDesc) obj;
        return o.LJ(this.type, securityInformationItemDesc.type) && o.LJ(this.plainDescription, securityInformationItemDesc.plainDescription) && o.LJ(this.logos, securityInformationItemDesc.logos) && o.LJ(this.mixLinkDescription, securityInformationItemDesc.mixLinkDescription);
    }

    public final int hashCode() {
        Integer num = this.type;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.plainDescription;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<Icon> list = this.logos;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        LinkRichText linkRichText = this.mixLinkDescription;
        return hashCode3 + (linkRichText != null ? linkRichText.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SecurityInformationItemDesc(type=");
        LIZ.append(this.type);
        LIZ.append(", plainDescription=");
        LIZ.append(this.plainDescription);
        LIZ.append(", logos=");
        LIZ.append(this.logos);
        LIZ.append(", mixLinkDescription=");
        LIZ.append(this.mixLinkDescription);
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
    }

    public SecurityInformationItemDesc(Integer num, String str, List<Icon> list, LinkRichText linkRichText) {
        this.type = num;
        this.plainDescription = str;
        this.logos = list;
        this.mixLinkDescription = linkRichText;
    }
}
