package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo;

import X.C05040Hs;
import X.C0MT;
import X.C69621RUb;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SellerInfoBizData implements Parcelable {
    public static final Parcelable.Creator<SellerInfoBizData> CREATOR = new C69621RUb();

    @InterfaceC65349Pkn("avatar")
    public final Image avatar;

    @InterfaceC65349Pkn("button_name")
    public final String buttonName;

    @InterfaceC65349Pkn("follow_count")
    public final Long followers;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("product_count")
    public final Long productCount;

    @InterfaceC65349Pkn("rating")
    public final Float rating;

    @InterfaceC65349Pkn("seller_id")
    public final String sellerId;

    @InterfaceC65349Pkn("link")
    public final String sellerLink;

    @InterfaceC65349Pkn("shop_link")
    public final String shopLink;

    @InterfaceC65349Pkn("verified_icon")
    public final Image verifiedIcon;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellerInfoBizData)) {
            return false;
        }
        SellerInfoBizData sellerInfoBizData = (SellerInfoBizData) obj;
        return o.LJ(this.name, sellerInfoBizData.name) && o.LJ(this.sellerId, sellerInfoBizData.sellerId) && o.LJ(this.avatar, sellerInfoBizData.avatar) && o.LJ(this.followers, sellerInfoBizData.followers) && o.LJ(this.buttonName, sellerInfoBizData.buttonName) && o.LJ(this.verifiedIcon, sellerInfoBizData.verifiedIcon) && o.LJ(this.shopLink, sellerInfoBizData.shopLink) && o.LJ(this.rating, sellerInfoBizData.rating) && o.LJ(this.productCount, sellerInfoBizData.productCount) && o.LJ(this.sellerLink, sellerInfoBizData.sellerLink);
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sellerId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.avatar;
        int hashCode3 = (hashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        Long l = this.followers;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.buttonName;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Image image2 = this.verifiedIcon;
        int hashCode6 = (hashCode5 + (image2 == null ? 0 : image2.hashCode())) * 31;
        String str4 = this.shopLink;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Float f = this.rating;
        int hashCode8 = (hashCode7 + (f == null ? 0 : f.hashCode())) * 31;
        Long l2 = this.productCount;
        int hashCode9 = (hashCode8 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str5 = this.sellerLink;
        return hashCode9 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SellerInfoBizData(name=");
        LIZ.append(this.name);
        LIZ.append(", sellerId=");
        LIZ.append(this.sellerId);
        LIZ.append(", avatar=");
        LIZ.append(this.avatar);
        LIZ.append(", followers=");
        LIZ.append(this.followers);
        LIZ.append(", buttonName=");
        LIZ.append(this.buttonName);
        LIZ.append(", verifiedIcon=");
        LIZ.append(this.verifiedIcon);
        LIZ.append(", shopLink=");
        LIZ.append(this.shopLink);
        LIZ.append(", rating=");
        LIZ.append(this.rating);
        LIZ.append(", productCount=");
        LIZ.append(this.productCount);
        LIZ.append(", sellerLink=");
        return q.LIZIZ(LIZ, this.sellerLink, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.name);
        out.writeString(this.sellerId);
        out.writeParcelable(this.avatar, i);
        Long l = this.followers;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        out.writeString(this.buttonName);
        out.writeParcelable(this.verifiedIcon, i);
        out.writeString(this.shopLink);
        Float f = this.rating;
        if (f == null) {
            out.writeInt(0);
        } else {
            C0MT.LIZJ(out, 1, f);
        }
        Long l2 = this.productCount;
        if (l2 == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l2);
        }
        out.writeString(this.sellerLink);
    }

    public SellerInfoBizData(String str, String str2, Image image, Long l, String str3, Image image2, String str4, Float f, Long l2, String str5) {
        this.name = str;
        this.sellerId = str2;
        this.avatar = image;
        this.followers = l;
        this.buttonName = str3;
        this.verifiedIcon = image2;
        this.shopLink = str4;
        this.rating = f;
        this.productCount = l2;
        this.sellerLink = str5;
    }
}
