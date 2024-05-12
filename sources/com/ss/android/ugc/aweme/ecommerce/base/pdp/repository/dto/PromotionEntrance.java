package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C07670Rv;
import X.C1FJ;
import X.C27522Ar8;
import X.C27524ArA;
import X.C279017q;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PromotionEntrance implements Parcelable {
    public static final int DEFAULT = 0;

    @InterfaceC65349Pkn("banner_info")
    public final EntranceBannerInfo bannerInfo;

    @InterfaceC65349Pkn("button_text")
    public final String buttonText;

    @InterfaceC65349Pkn("countdown")
    public final String countdown;

    @InterfaceC65349Pkn("da_info")
    public final String daInfo;

    @InterfaceC65349Pkn("end_time")
    public final String endTime;

    @InterfaceC65349Pkn("entrance_style")
    public final Integer entranceStyle;

    @InterfaceC65349Pkn("flash_sale_status")
    public final Integer flashSaleStatus;

    @InterfaceC65349Pkn("relate_products")
    public final List<RelateProduct> relateProducts;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @InterfaceC65349Pkn("start_time")
    public final String startTime;

    @InterfaceC65349Pkn("title")
    public final String title;
    public static final C27524ArA Companion = new C27524ArA();
    public static final Parcelable.Creator<PromotionEntrance> CREATOR = new C27522Ar8();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionEntrance)) {
            return false;
        }
        PromotionEntrance promotionEntrance = (PromotionEntrance) obj;
        return o.LJ(this.title, promotionEntrance.title) && o.LJ(this.buttonText, promotionEntrance.buttonText) && o.LJ(this.schema, promotionEntrance.schema) && o.LJ(this.entranceStyle, promotionEntrance.entranceStyle) && o.LJ(this.flashSaleStatus, promotionEntrance.flashSaleStatus) && o.LJ(this.startTime, promotionEntrance.startTime) && o.LJ(this.countdown, promotionEntrance.countdown) && o.LJ(this.endTime, promotionEntrance.endTime) && o.LJ(this.relateProducts, promotionEntrance.relateProducts) && o.LJ(this.bannerInfo, promotionEntrance.bannerInfo) && o.LJ(this.daInfo, promotionEntrance.daInfo);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.buttonText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.schema;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.entranceStyle;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.flashSaleStatus;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.startTime;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.countdown;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.endTime;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<RelateProduct> list = this.relateProducts;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        EntranceBannerInfo entranceBannerInfo = this.bannerInfo;
        int hashCode10 = (hashCode9 + (entranceBannerInfo == null ? 0 : entranceBannerInfo.hashCode())) * 31;
        String str7 = this.daInfo;
        return hashCode10 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromotionEntrance(title=");
        sb.append(this.title);
        sb.append(", buttonText=");
        sb.append(this.buttonText);
        sb.append(", schema=");
        sb.append(this.schema);
        sb.append(", entranceStyle=");
        sb.append(this.entranceStyle);
        sb.append(", flashSaleStatus=");
        sb.append(this.flashSaleStatus);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", countdown=");
        sb.append(this.countdown);
        sb.append(", endTime=");
        sb.append(this.endTime);
        sb.append(", relateProducts=");
        sb.append(this.relateProducts);
        sb.append(", bannerInfo=");
        sb.append(this.bannerInfo);
        sb.append(", daInfo=");
        return C07670Rv.LIZIZ(sb, this.daInfo, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.title);
        out.writeString(this.buttonText);
        out.writeString(this.schema);
        Integer num = this.entranceStyle;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Integer num2 = this.flashSaleStatus;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        out.writeString(this.startTime);
        out.writeString(this.countdown);
        out.writeString(this.endTime);
        List<RelateProduct> list = this.relateProducts;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((RelateProduct) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        EntranceBannerInfo entranceBannerInfo = this.bannerInfo;
        if (entranceBannerInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            entranceBannerInfo.writeToParcel(out, i);
        }
        out.writeString(this.daInfo);
    }

    public PromotionEntrance(String str, String str2, String str3, Integer num, Integer num2, String str4, String str5, String str6, List<RelateProduct> list, EntranceBannerInfo entranceBannerInfo, String str7) {
        this.title = str;
        this.buttonText = str2;
        this.schema = str3;
        this.entranceStyle = num;
        this.flashSaleStatus = num2;
        this.startTime = str4;
        this.countdown = str5;
        this.endTime = str6;
        this.relateProducts = list;
        this.bannerInfo = entranceBannerInfo;
        this.daInfo = str7;
    }
}
