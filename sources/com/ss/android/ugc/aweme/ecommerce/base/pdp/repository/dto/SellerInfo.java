package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C05040Hs;
import X.C1FJ;
import X.C1FL;
import X.C27556Arg;
import X.C279017q;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreLabel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SellerInfo implements Parcelable {
    public static final Parcelable.Creator<SellerInfo> CREATOR = new C27556Arg();

    @InterfaceC65349Pkn("avatar")
    public final Image avatar;

    @InterfaceC65349Pkn("im_schema")
    public final String imSchema;

    @InterfaceC65349Pkn("is_hide")
    public final Boolean isHide;

    @InterfaceC65349Pkn("link")
    public final String link;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("phone_contact")
    public PhoneContact phoneContact;

    @InterfaceC65349Pkn("product_count")
    public final Long productCount;

    @InterfaceC65349Pkn("rating")
    public final String rating;

    @InterfaceC65349Pkn("exp_rate_percentile")
    public final Integer ratingPercentile;

    @InterfaceC65349Pkn("show_rate_not_applicable")
    public final Boolean ratingShowNA;

    @InterfaceC65349Pkn("rate_display_style")
    public final Integer ratingStyle;

    @InterfaceC65349Pkn("seller_detail_infos")
    public final List<SellerDetailInfo> sellerDetailInfos;

    @InterfaceC65349Pkn("seller_id")
    public final String sellerId;

    @InterfaceC65349Pkn("seller_selling_point")
    public final SellerSellingPoint sellerSellingPoint;

    @InterfaceC65349Pkn("shop_link")
    public final String shopLink;

    @InterfaceC65349Pkn("shop_recommend")
    public final ShopRecommend shopRecommend;

    @InterfaceC65349Pkn("slogan_text")
    public final String sloganText;

    @InterfaceC65349Pkn("store_label")
    public final StoreLabel storeLabel;

    @InterfaceC65349Pkn("unread_message_count")
    public final Integer unreadMsgCount;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellerInfo)) {
            return false;
        }
        SellerInfo sellerInfo = (SellerInfo) obj;
        return o.LJ(this.sellerId, sellerInfo.sellerId) && o.LJ(this.name, sellerInfo.name) && o.LJ(this.avatar, sellerInfo.avatar) && o.LJ(this.productCount, sellerInfo.productCount) && o.LJ(this.rating, sellerInfo.rating) && o.LJ(this.link, sellerInfo.link) && o.LJ(this.imSchema, sellerInfo.imSchema) && o.LJ(this.phoneContact, sellerInfo.phoneContact) && o.LJ(this.shopLink, sellerInfo.shopLink) && o.LJ(this.storeLabel, sellerInfo.storeLabel) && o.LJ(this.shopRecommend, sellerInfo.shopRecommend) && o.LJ(this.isHide, sellerInfo.isHide) && o.LJ(this.sellerDetailInfos, sellerInfo.sellerDetailInfos) && o.LJ(this.ratingPercentile, sellerInfo.ratingPercentile) && o.LJ(this.ratingStyle, sellerInfo.ratingStyle) && o.LJ(this.unreadMsgCount, sellerInfo.unreadMsgCount) && o.LJ(this.ratingShowNA, sellerInfo.ratingShowNA) && o.LJ(this.sloganText, sellerInfo.sloganText) && o.LJ(this.sellerSellingPoint, sellerInfo.sellerSellingPoint);
    }

    public final int hashCode() {
        String str = this.sellerId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.avatar;
        int hashCode3 = (hashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        Long l = this.productCount;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.rating;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.link;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.imSchema;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        PhoneContact phoneContact = this.phoneContact;
        int hashCode8 = (hashCode7 + (phoneContact == null ? 0 : phoneContact.hashCode())) * 31;
        String str6 = this.shopLink;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        StoreLabel storeLabel = this.storeLabel;
        int hashCode10 = (hashCode9 + (storeLabel == null ? 0 : storeLabel.hashCode())) * 31;
        ShopRecommend shopRecommend = this.shopRecommend;
        int hashCode11 = (hashCode10 + (shopRecommend == null ? 0 : shopRecommend.hashCode())) * 31;
        Boolean bool = this.isHide;
        int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<SellerDetailInfo> list = this.sellerDetailInfos;
        int hashCode13 = (hashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.ratingPercentile;
        int hashCode14 = (hashCode13 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.ratingStyle;
        int hashCode15 = (hashCode14 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.unreadMsgCount;
        int hashCode16 = (hashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool2 = this.ratingShowNA;
        int hashCode17 = (hashCode16 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str7 = this.sloganText;
        int hashCode18 = (hashCode17 + (str7 == null ? 0 : str7.hashCode())) * 31;
        SellerSellingPoint sellerSellingPoint = this.sellerSellingPoint;
        return hashCode18 + (sellerSellingPoint != null ? sellerSellingPoint.hashCode() : 0);
    }

    public final String toString() {
        return "SellerInfo(sellerId=" + this.sellerId + ", name=" + this.name + ", avatar=" + this.avatar + ", productCount=" + this.productCount + ", rating=" + this.rating + ", link=" + this.link + ", imSchema=" + this.imSchema + ", phoneContact=" + this.phoneContact + ", shopLink=" + this.shopLink + ", storeLabel=" + this.storeLabel + ", shopRecommend=" + this.shopRecommend + ", isHide=" + this.isHide + ", sellerDetailInfos=" + this.sellerDetailInfos + ", ratingPercentile=" + this.ratingPercentile + ", ratingStyle=" + this.ratingStyle + ", unreadMsgCount=" + this.unreadMsgCount + ", ratingShowNA=" + this.ratingShowNA + ", sloganText=" + this.sloganText + ", sellerSellingPoint=" + this.sellerSellingPoint + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.sellerId);
        out.writeString(this.name);
        out.writeParcelable(this.avatar, i);
        Long l = this.productCount;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        out.writeString(this.rating);
        out.writeString(this.link);
        out.writeString(this.imSchema);
        PhoneContact phoneContact = this.phoneContact;
        if (phoneContact == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            phoneContact.writeToParcel(out, i);
        }
        out.writeString(this.shopLink);
        out.writeParcelable(this.storeLabel, i);
        ShopRecommend shopRecommend = this.shopRecommend;
        if (shopRecommend == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            shopRecommend.writeToParcel(out, i);
        }
        Boolean bool = this.isHide;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        List<SellerDetailInfo> list = this.sellerDetailInfos;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((SellerDetailInfo) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        Integer num = this.ratingPercentile;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Integer num2 = this.ratingStyle;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        Integer num3 = this.unreadMsgCount;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num3);
        }
        Boolean bool2 = this.ratingShowNA;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool2);
        }
        out.writeString(this.sloganText);
        SellerSellingPoint sellerSellingPoint = this.sellerSellingPoint;
        if (sellerSellingPoint == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            sellerSellingPoint.writeToParcel(out, i);
        }
    }

    public SellerInfo(String str, String str2, Image image, Long l, String str3, String str4, String str5, PhoneContact phoneContact, String str6, StoreLabel storeLabel, ShopRecommend shopRecommend, Boolean bool, List<SellerDetailInfo> list, Integer num, Integer num2, Integer num3, Boolean bool2, String str7, SellerSellingPoint sellerSellingPoint) {
        this.sellerId = str;
        this.name = str2;
        this.avatar = image;
        this.productCount = l;
        this.rating = str3;
        this.link = str4;
        this.imSchema = str5;
        this.phoneContact = phoneContact;
        this.shopLink = str6;
        this.storeLabel = storeLabel;
        this.shopRecommend = shopRecommend;
        this.isHide = bool;
        this.sellerDetailInfos = list;
        this.ratingPercentile = num;
        this.ratingStyle = num2;
        this.unreadMsgCount = num3;
        this.ratingShowNA = bool2;
        this.sloganText = str7;
        this.sellerSellingPoint = sellerSellingPoint;
    }

    public /* synthetic */ SellerInfo(String str, String str2, Image image, Long l, String str3, String str4, String str5, PhoneContact phoneContact, String str6, StoreLabel storeLabel, ShopRecommend shopRecommend, Boolean bool, List list, Integer num, Integer num2, Integer num3, Boolean bool2, String str7, SellerSellingPoint sellerSellingPoint, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, image, l, str3, str4, str5, phoneContact, str6, storeLabel, shopRecommend, (i & 2048) != 0 ? Boolean.FALSE : bool, list, num, num2, num3, bool2, str7, (i & 262144) != 0 ? null : sellerSellingPoint);
    }
}
