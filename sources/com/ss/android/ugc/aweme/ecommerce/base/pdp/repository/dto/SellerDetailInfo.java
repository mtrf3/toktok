package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C05040Hs;
import X.C27554Are;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SellerDetailInfo implements Parcelable {
    public static final Parcelable.Creator<SellerDetailInfo> CREATOR = new C27554Are();

    @InterfaceC65349Pkn("content")
    public final String content;

    @InterfaceC65349Pkn("count")
    public final Long count;

    @InterfaceC65349Pkn("count_show_content")
    public final String countShowContent;

    @InterfaceC65349Pkn("head_tag")
    public final String headTag;

    @InterfaceC65349Pkn("key")
    public final String key;

    @InterfaceC65349Pkn("seller_detail_popup")
    public final SellerDetailPopup sellerDetailPopup;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellerDetailInfo)) {
            return false;
        }
        SellerDetailInfo sellerDetailInfo = (SellerDetailInfo) obj;
        return o.LJ(this.key, sellerDetailInfo.key) && o.LJ(this.countShowContent, sellerDetailInfo.countShowContent) && o.LJ(this.count, sellerDetailInfo.count) && o.LJ(this.content, sellerDetailInfo.content) && o.LJ(this.headTag, sellerDetailInfo.headTag) && o.LJ(this.sellerDetailPopup, sellerDetailInfo.sellerDetailPopup);
    }

    public final int hashCode() {
        String str = this.key;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.countShowContent;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.count;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.content;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.headTag;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        SellerDetailPopup sellerDetailPopup = this.sellerDetailPopup;
        return hashCode5 + (sellerDetailPopup != null ? sellerDetailPopup.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SellerDetailInfo(key=");
        LIZ.append(this.key);
        LIZ.append(", countShowContent=");
        LIZ.append(this.countShowContent);
        LIZ.append(", count=");
        LIZ.append(this.count);
        LIZ.append(", content=");
        LIZ.append(this.content);
        LIZ.append(", headTag=");
        LIZ.append(this.headTag);
        LIZ.append(", sellerDetailPopup=");
        LIZ.append(this.sellerDetailPopup);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.key);
        out.writeString(this.countShowContent);
        Long l = this.count;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        out.writeString(this.content);
        out.writeString(this.headTag);
        SellerDetailPopup sellerDetailPopup = this.sellerDetailPopup;
        if (sellerDetailPopup == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            sellerDetailPopup.writeToParcel(out, i);
        }
    }

    public SellerDetailInfo(String str, String str2, Long l, String str3, String str4, SellerDetailPopup sellerDetailPopup) {
        this.key = str;
        this.countShowContent = str2;
        this.count = l;
        this.content = str3;
        this.headTag = str4;
        this.sellerDetailPopup = sellerDetailPopup;
    }
}
