package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1FJ;
import X.InterfaceC65349Pkn;
import X.RV6;
import X.RV7;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class FlashSale implements Parcelable {

    @InterfaceC65349Pkn("activity_id")
    public final String activityId;

    @InterfaceC65349Pkn("atmosphere_style")
    public final Integer atmosphereStyle;

    @InterfaceC65349Pkn("countdown")
    public final String countdown;

    @InterfaceC65349Pkn("countdown_bg_img")
    public final Image countdownBg;

    @InterfaceC65349Pkn("end_time")
    public final String endTime;

    @InterfaceC65349Pkn("flash_sale_style")
    public final Integer flashSaleStyle;

    @InterfaceC65349Pkn("bg_img")
    public final Image image;

    @InterfaceC65349Pkn("log_extra")
    public final String logExtra;

    @InterfaceC65349Pkn("price")
    public final String price;

    @InterfaceC65349Pkn("reminder_button")
    public final FlashSaleReminderButton remindButton;

    @InterfaceC65349Pkn("start_time")
    public final String startTime;

    @InterfaceC65349Pkn("status")
    public final Integer status;

    @InterfaceC65349Pkn("tag_img")
    public final Image tagImg;

    @InterfaceC65349Pkn("title")
    public final String title;
    public static final RV7 Companion = new RV7();
    public static final Parcelable.Creator<FlashSale> CREATOR = new RV6();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlashSale)) {
            return false;
        }
        FlashSale flashSale = (FlashSale) obj;
        return o.LJ(this.activityId, flashSale.activityId) && o.LJ(this.status, flashSale.status) && o.LJ(this.countdown, flashSale.countdown) && o.LJ(this.startTime, flashSale.startTime) && o.LJ(this.endTime, flashSale.endTime) && o.LJ(this.title, flashSale.title) && o.LJ(this.price, flashSale.price) && o.LJ(this.image, flashSale.image) && o.LJ(this.countdownBg, flashSale.countdownBg) && o.LJ(this.tagImg, flashSale.tagImg) && o.LJ(this.remindButton, flashSale.remindButton) && o.LJ(this.flashSaleStyle, flashSale.flashSaleStyle) && o.LJ(this.logExtra, flashSale.logExtra) && o.LJ(this.atmosphereStyle, flashSale.atmosphereStyle);
    }

    public final int hashCode() {
        String str = this.activityId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.status;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.countdown;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.startTime;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.endTime;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.title;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.price;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Image image = this.image;
        int hashCode8 = (hashCode7 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.countdownBg;
        int hashCode9 = (hashCode8 + (image2 == null ? 0 : image2.hashCode())) * 31;
        Image image3 = this.tagImg;
        int hashCode10 = (hashCode9 + (image3 == null ? 0 : image3.hashCode())) * 31;
        FlashSaleReminderButton flashSaleReminderButton = this.remindButton;
        int hashCode11 = (hashCode10 + (flashSaleReminderButton == null ? 0 : flashSaleReminderButton.hashCode())) * 31;
        Integer num2 = this.flashSaleStyle;
        int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str7 = this.logExtra;
        int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num3 = this.atmosphereStyle;
        return hashCode13 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlashSale(activityId=");
        sb.append(this.activityId);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", countdown=");
        sb.append(this.countdown);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        sb.append(this.endTime);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", countdownBg=");
        sb.append(this.countdownBg);
        sb.append(", tagImg=");
        sb.append(this.tagImg);
        sb.append(", remindButton=");
        sb.append(this.remindButton);
        sb.append(", flashSaleStyle=");
        sb.append(this.flashSaleStyle);
        sb.append(", logExtra=");
        sb.append(this.logExtra);
        sb.append(", atmosphereStyle=");
        return UC7.LIZ(sb, this.atmosphereStyle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.activityId);
        Integer num = this.status;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        out.writeString(this.countdown);
        out.writeString(this.startTime);
        out.writeString(this.endTime);
        out.writeString(this.title);
        out.writeString(this.price);
        out.writeParcelable(this.image, i);
        out.writeParcelable(this.countdownBg, i);
        out.writeParcelable(this.tagImg, i);
        FlashSaleReminderButton flashSaleReminderButton = this.remindButton;
        if (flashSaleReminderButton == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            flashSaleReminderButton.writeToParcel(out, i);
        }
        Integer num2 = this.flashSaleStyle;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        out.writeString(this.logExtra);
        Integer num3 = this.atmosphereStyle;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num3);
        }
    }

    public static FlashSale LIZ(FlashSale flashSale, Integer num, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Image image;
        Image image2;
        Image image3;
        FlashSaleReminderButton flashSaleReminderButton;
        Integer num2;
        String str7;
        Integer num3 = num;
        Integer num4 = null;
        if ((i & 1) != 0) {
            str = flashSale.activityId;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            num3 = flashSale.status;
        }
        if ((i & 4) != 0) {
            str2 = flashSale.countdown;
        } else {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = flashSale.startTime;
        } else {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = flashSale.endTime;
        } else {
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = flashSale.title;
        } else {
            str5 = null;
        }
        if ((i & 64) != 0) {
            str6 = flashSale.price;
        } else {
            str6 = null;
        }
        if ((i & 128) != 0) {
            image = flashSale.image;
        } else {
            image = null;
        }
        if ((i & 256) != 0) {
            image2 = flashSale.countdownBg;
        } else {
            image2 = null;
        }
        if ((i & 512) != 0) {
            image3 = flashSale.tagImg;
        } else {
            image3 = null;
        }
        if ((i & 1024) != 0) {
            flashSaleReminderButton = flashSale.remindButton;
        } else {
            flashSaleReminderButton = null;
        }
        if ((i & 2048) != 0) {
            num2 = flashSale.flashSaleStyle;
        } else {
            num2 = null;
        }
        if ((i & 4096) != 0) {
            str7 = flashSale.logExtra;
        } else {
            str7 = null;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            num4 = flashSale.atmosphereStyle;
        }
        flashSale.getClass();
        return new FlashSale(str, num3, str2, str3, str4, str5, str6, image, image2, image3, flashSaleReminderButton, num2, str7, num4);
    }

    public FlashSale(String str, Integer num, String str2, String str3, String str4, String str5, String str6, Image image, Image image2, Image image3, FlashSaleReminderButton flashSaleReminderButton, Integer num2, String str7, Integer num3) {
        this.activityId = str;
        this.status = num;
        this.countdown = str2;
        this.startTime = str3;
        this.endTime = str4;
        this.title = str5;
        this.price = str6;
        this.image = image;
        this.countdownBg = image2;
        this.tagImg = image3;
        this.remindButton = flashSaleReminderButton;
        this.flashSaleStyle = num2;
        this.logExtra = str7;
        this.atmosphereStyle = num3;
    }

    public /* synthetic */ FlashSale(String str, Integer num, String str2, String str3, String str4, String str5, String str6, Image image, Image image2, Image image3, FlashSaleReminderButton flashSaleReminderButton, Integer num2, String str7, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, num, str2, str3, str4, str5, str6, image, image2, image3, flashSaleReminderButton, num2, (i & 4096) != 0 ? null : str7, num3);
    }
}
