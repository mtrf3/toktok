package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1FJ;
import X.C69640RUu;
import X.C69641RUv;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PlatformPromotionItem implements Parcelable {
    public static final int PROMOTION_TYPE_UNKNOWN = 0;

    @InterfaceC65349Pkn("da_info")
    public final String daInfo;

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("promotion_type")
    public final Integer promotionType;

    @InterfaceC65349Pkn("sub_promotion_text")
    public final String subTitle;

    @InterfaceC65349Pkn("promotion_text")
    public final String title;

    @InterfaceC65349Pkn("vap_intro_text")
    public final String vapIntroText;

    @InterfaceC65349Pkn("vap_text")
    public final String vapText;

    @InterfaceC65349Pkn("voucher_info")
    public Voucher voucherInfo;
    public static final C69641RUv Companion = new C69641RUv();
    public static final Parcelable.Creator<PlatformPromotionItem> CREATOR = new C69640RUu();
    public static final int PROMOTION_TYPE_VHOUCHER = 1;
    public static final int PROMOTION_TYPE_ACTIVITY = 2;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformPromotionItem)) {
            return false;
        }
        PlatformPromotionItem platformPromotionItem = (PlatformPromotionItem) obj;
        return o.LJ(this.id, platformPromotionItem.id) && o.LJ(this.title, platformPromotionItem.title) && o.LJ(this.subTitle, platformPromotionItem.subTitle) && o.LJ(this.vapIntroText, platformPromotionItem.vapIntroText) && o.LJ(this.vapText, platformPromotionItem.vapText) && o.LJ(this.voucherInfo, platformPromotionItem.voucherInfo) && o.LJ(this.promotionType, platformPromotionItem.promotionType) && o.LJ(this.daInfo, platformPromotionItem.daInfo);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subTitle;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.vapIntroText;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.vapText;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Voucher voucher = this.voucherInfo;
        int hashCode6 = (hashCode5 + (voucher == null ? 0 : voucher.hashCode())) * 31;
        Integer num = this.promotionType;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.daInfo;
        return hashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PlatformPromotionItem(id=");
        LIZ.append(this.id);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", subTitle=");
        LIZ.append(this.subTitle);
        LIZ.append(", vapIntroText=");
        LIZ.append(this.vapIntroText);
        LIZ.append(", vapText=");
        LIZ.append(this.vapText);
        LIZ.append(", voucherInfo=");
        LIZ.append(this.voucherInfo);
        LIZ.append(", promotionType=");
        LIZ.append(this.promotionType);
        LIZ.append(", daInfo=");
        return q.LIZIZ(LIZ, this.daInfo, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.id);
        out.writeString(this.title);
        out.writeString(this.subTitle);
        out.writeString(this.vapIntroText);
        out.writeString(this.vapText);
        Voucher voucher = this.voucherInfo;
        if (voucher == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            voucher.writeToParcel(out, i);
        }
        Integer num = this.promotionType;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        out.writeString(this.daInfo);
    }

    public PlatformPromotionItem(String str, String str2, String str3, String str4, String str5, Voucher voucher, Integer num, String str6) {
        this.id = str;
        this.title = str2;
        this.subTitle = str3;
        this.vapIntroText = str4;
        this.vapText = str5;
        this.voucherInfo = voucher;
        this.promotionType = num;
        this.daInfo = str6;
    }
}
