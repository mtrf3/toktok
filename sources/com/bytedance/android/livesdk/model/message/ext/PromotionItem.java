package com.bytedance.android.livesdk.model.message.ext;

import X.C1FJ;
import X.F9E;
import X.InterfaceC65349Pkn;
import X.RUL;
import X.RUN;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PromotionItem extends F9E implements Serializable, Parcelable {

    @InterfaceC65349Pkn("addition_waist_img")
    public final GImage additionWaistImg;

    @InterfaceC65349Pkn("back_ground")
    public final GImage backGround;

    @InterfaceC65349Pkn("countdown")
    public final String countDown;

    @InterfaceC65349Pkn("dark_icon")
    public final GImage darkIcon;

    @InterfaceC65349Pkn("end_time")
    public final String endTime;

    @InterfaceC65349Pkn("extra_property")
    public final List<PromotionProperty> extraProperty;

    @InterfaceC65349Pkn("icon")
    public final GImage icon;

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("log_extra")
    public final String log_extra;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("preview_show_text")
    public final String previewShowText;

    @InterfaceC65349Pkn("price")
    public final String price;

    @InterfaceC65349Pkn("start_time")
    public final String startTime;

    @InterfaceC65349Pkn("status")
    public final Integer status;

    @InterfaceC65349Pkn("style")
    public final Integer style;

    @InterfaceC65349Pkn("subheaders")
    public final List<String> subHeaders;

    @InterfaceC65349Pkn("type")
    public final Integer type;

    @InterfaceC65349Pkn("voucher_id")
    public final String voucherId;

    @InterfaceC65349Pkn("waist_img")
    public final GImage waistImg;
    public static final RUN Companion = new RUN();
    public static final Parcelable.Creator<PromotionItem> CREATOR = new RUL();

    /* JADX WARN: Multi-variable type inference failed */
    public PromotionItem() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 524287, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PromotionItem copy$default(PromotionItem promotionItem, String str, String str2, List list, GImage gImage, GImage gImage2, Integer num, String str3, Integer num2, String str4, String str5, String str6, String str7, List list2, GImage gImage3, Integer num3, String str8, GImage gImage4, GImage gImage5, String str9, int i, Object obj) {
        String str10 = str;
        String str11 = str2;
        Integer num4 = num2;
        String str12 = str3;
        Integer num5 = num;
        GImage gImage6 = gImage2;
        List list3 = list;
        GImage gImage7 = gImage;
        GImage gImage8 = gImage3;
        List list4 = list2;
        String str13 = str7;
        String str14 = str6;
        String str15 = str4;
        String str16 = str5;
        String str17 = str9;
        GImage gImage9 = gImage5;
        GImage gImage10 = gImage4;
        Integer num6 = num3;
        String str18 = str8;
        if ((i & 1) != 0) {
            str10 = promotionItem.id;
        }
        if ((i & 2) != 0) {
            str11 = promotionItem.name;
        }
        if ((i & 4) != 0) {
            list3 = promotionItem.subHeaders;
        }
        if ((i & 8) != 0) {
            gImage7 = promotionItem.icon;
        }
        if ((i & 16) != 0) {
            gImage6 = promotionItem.backGround;
        }
        if ((i & 32) != 0) {
            num5 = promotionItem.style;
        }
        if ((i & 64) != 0) {
            str12 = promotionItem.voucherId;
        }
        if ((i & 128) != 0) {
            num4 = promotionItem.type;
        }
        if ((i & 256) != 0) {
            str15 = promotionItem.log_extra;
        }
        if ((i & 512) != 0) {
            str16 = promotionItem.countDown;
        }
        if ((i & 1024) != 0) {
            str14 = promotionItem.startTime;
        }
        if ((i & 2048) != 0) {
            str13 = promotionItem.endTime;
        }
        if ((i & 4096) != 0) {
            list4 = promotionItem.extraProperty;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            gImage8 = promotionItem.waistImg;
        }
        if ((i & 16384) != 0) {
            num6 = promotionItem.status;
        }
        if ((32768 & i) != 0) {
            str18 = promotionItem.price;
        }
        if ((65536 & i) != 0) {
            gImage10 = promotionItem.additionWaistImg;
        }
        if ((131072 & i) != 0) {
            gImage9 = promotionItem.darkIcon;
        }
        if ((i & 262144) != 0) {
            str17 = promotionItem.previewShowText;
        }
        String str19 = str12;
        return promotionItem.copy(str10, str11, list3, gImage7, gImage6, num5, str19, num4, str15, str16, str14, str13, list4, gImage8, num6, str18, gImage10, gImage9, str17);
    }

    public final PromotionItem copy(String str, String str2, List<String> list, GImage gImage, GImage gImage2, Integer num, String str3, Integer num2, String str4, String str5, String str6, String str7, List<PromotionProperty> list2, GImage gImage3, Integer num3, String str8, GImage gImage4, GImage gImage5, String str9) {
        return new PromotionItem(str, str2, list, gImage, gImage2, num, str3, num2, str4, str5, str6, str7, list2, gImage3, num3, str8, gImage4, gImage5, str9);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.id, this.name, this.subHeaders, this.icon, this.backGround, this.style, this.voucherId, this.type, this.log_extra, this.countDown, this.startTime, this.endTime, this.extraProperty, this.waistImg, this.status, this.price, this.additionWaistImg, this.darkIcon, this.previewShowText};
    }

    public final GImage getAdditionWaistImg() {
        return this.additionWaistImg;
    }

    public final GImage getBackGround() {
        return this.backGround;
    }

    public final String getCountDown() {
        return this.countDown;
    }

    public final GImage getDarkIcon() {
        return this.darkIcon;
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final List<PromotionProperty> getExtraProperty() {
        return this.extraProperty;
    }

    public final GImage getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLog_extra() {
        return this.log_extra;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPreviewShowText() {
        return this.previewShowText;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final Integer getStyle() {
        return this.style;
    }

    public final List<String> getSubHeaders() {
        return this.subHeaders;
    }

    public final Integer getType() {
        return this.type;
    }

    public final String getVoucherId() {
        return this.voucherId;
    }

    public final GImage getWaistImg() {
        return this.waistImg;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeStringList(this.subHeaders);
        GImage gImage = this.icon;
        if (gImage != null) {
            parcel.writeInt(1);
            gImage.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        GImage gImage2 = this.backGround;
        if (gImage2 != null) {
            parcel.writeInt(1);
            gImage2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Integer num = this.style;
        if (num != null) {
            C1FJ.LJ(parcel, 1, num);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.voucherId);
        Integer num2 = this.type;
        if (num2 != null) {
            C1FJ.LJ(parcel, 1, num2);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.log_extra);
        parcel.writeString(this.countDown);
        parcel.writeString(this.startTime);
        parcel.writeString(this.endTime);
        List<PromotionProperty> list = this.extraProperty;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<PromotionProperty> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        GImage gImage3 = this.waistImg;
        if (gImage3 != null) {
            parcel.writeInt(1);
            gImage3.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Integer num3 = this.status;
        if (num3 != null) {
            C1FJ.LJ(parcel, 1, num3);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.price);
        GImage gImage4 = this.additionWaistImg;
        if (gImage4 != null) {
            parcel.writeInt(1);
            gImage4.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        GImage gImage5 = this.darkIcon;
        if (gImage5 != null) {
            parcel.writeInt(1);
            gImage5.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.previewShowText);
    }

    public PromotionItem(String str, String str2, List<String> list, GImage gImage, GImage gImage2, Integer num, String str3, Integer num2, String str4, String str5, String str6, String str7, List<PromotionProperty> list2, GImage gImage3, Integer num3, String str8, GImage gImage4, GImage gImage5, String str9) {
        this.id = str;
        this.name = str2;
        this.subHeaders = list;
        this.icon = gImage;
        this.backGround = gImage2;
        this.style = num;
        this.voucherId = str3;
        this.type = num2;
        this.log_extra = str4;
        this.countDown = str5;
        this.startTime = str6;
        this.endTime = str7;
        this.extraProperty = list2;
        this.waistImg = gImage3;
        this.status = num3;
        this.price = str8;
        this.additionWaistImg = gImage4;
        this.darkIcon = gImage5;
        this.previewShowText = str9;
    }

    public /* synthetic */ PromotionItem(String str, String str2, List list, GImage gImage, GImage gImage2, Integer num, String str3, Integer num2, String str4, String str5, String str6, String str7, List list2, GImage gImage3, Integer num3, String str8, GImage gImage4, GImage gImage5, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : gImage, (i & 16) != 0 ? null : gImage2, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : str7, (i & 4096) != 0 ? null : list2, (i & FileUtils.BUFFER_SIZE) != 0 ? null : gImage3, (i & 16384) != 0 ? null : num3, (32768 & i) != 0 ? null : str8, (65536 & i) != 0 ? null : gImage4, (131072 & i) != 0 ? null : gImage5, (i & 262144) != 0 ? null : str9);
    }
}
