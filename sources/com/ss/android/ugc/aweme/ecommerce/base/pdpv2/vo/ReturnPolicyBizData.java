package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo;

import X.C1FL;
import X.C27166AlO;
import X.C279017q;
import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ReturnPolicyBizData implements Parcelable {
    public static final Parcelable.Creator<ReturnPolicyBizData> CREATOR = new C27166AlO();

    @InterfaceC65349Pkn("desc")
    public final String desc;

    @InterfaceC65349Pkn("has_native_page")
    public final Boolean hasNativePage;

    @InterfaceC65349Pkn("items")
    public final List<PolicyItem> items;

    @InterfaceC65349Pkn("link_info")
    public final CheckoutLink linkInfo;

    @InterfaceC65349Pkn("title")
    public final String title;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReturnPolicyBizData)) {
            return false;
        }
        ReturnPolicyBizData returnPolicyBizData = (ReturnPolicyBizData) obj;
        return o.LJ(this.title, returnPolicyBizData.title) && o.LJ(this.desc, returnPolicyBizData.desc) && o.LJ(this.items, returnPolicyBizData.items) && o.LJ(this.linkInfo, returnPolicyBizData.linkInfo) && o.LJ(this.hasNativePage, returnPolicyBizData.hasNativePage);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<PolicyItem> list = this.items;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        CheckoutLink checkoutLink = this.linkInfo;
        int hashCode4 = (hashCode3 + (checkoutLink == null ? 0 : checkoutLink.hashCode())) * 31;
        Boolean bool = this.hasNativePage;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReturnPolicyBizData(title=");
        LIZ.append(this.title);
        LIZ.append(", desc=");
        LIZ.append(this.desc);
        LIZ.append(", items=");
        LIZ.append(this.items);
        LIZ.append(", linkInfo=");
        LIZ.append(this.linkInfo);
        LIZ.append(", hasNativePage=");
        return C78920UyC.LIZIZ(LIZ, this.hasNativePage, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.title);
        out.writeString(this.desc);
        List<PolicyItem> list = this.items;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((PolicyItem) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        CheckoutLink checkoutLink = this.linkInfo;
        if (checkoutLink == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            checkoutLink.writeToParcel(out, i);
        }
        Boolean bool = this.hasNativePage;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
    }

    public ReturnPolicyBizData(String str, String str2, List<PolicyItem> list, CheckoutLink checkoutLink, Boolean bool) {
        this.title = str;
        this.desc = str2;
        this.items = list;
        this.linkInfo = checkoutLink;
        this.hasNativePage = bool;
    }
}
