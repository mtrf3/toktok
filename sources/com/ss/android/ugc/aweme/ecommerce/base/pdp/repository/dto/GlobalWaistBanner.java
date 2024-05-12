package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C05040Hs;
import X.C1FJ;
import X.C69622RUc;
import X.C69623RUd;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class GlobalWaistBanner implements Parcelable {

    @InterfaceC65349Pkn("banner_img")
    public final Image banner_img;

    @InterfaceC65349Pkn("count_down")
    public final Long countDown;

    @InterfaceC65349Pkn("dark_banner_img")
    public final Image dark_banner_img;

    @InterfaceC65349Pkn("desc_text")
    public final String desc_text;

    @InterfaceC65349Pkn("promotion_da_info")
    public final String log_extra;

    @InterfaceC65349Pkn("promotion_type")
    public final Integer promotion_type;

    @InterfaceC65349Pkn("title")
    public final String title;
    public static final C69623RUd PromotionType = new C69623RUd();
    public static final Parcelable.Creator<GlobalWaistBanner> CREATOR = new C69622RUc();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GlobalWaistBanner)) {
            return false;
        }
        GlobalWaistBanner globalWaistBanner = (GlobalWaistBanner) obj;
        return o.LJ(this.promotion_type, globalWaistBanner.promotion_type) && o.LJ(this.title, globalWaistBanner.title) && o.LJ(this.desc_text, globalWaistBanner.desc_text) && o.LJ(this.banner_img, globalWaistBanner.banner_img) && o.LJ(this.dark_banner_img, globalWaistBanner.dark_banner_img) && o.LJ(this.countDown, globalWaistBanner.countDown) && o.LJ(this.log_extra, globalWaistBanner.log_extra);
    }

    public final int hashCode() {
        Integer num = this.promotion_type;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.desc_text;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.banner_img;
        int hashCode4 = (hashCode3 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.dark_banner_img;
        int hashCode5 = (hashCode4 + (image2 == null ? 0 : image2.hashCode())) * 31;
        Long l = this.countDown;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.log_extra;
        return hashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GlobalWaistBanner(promotion_type=");
        LIZ.append(this.promotion_type);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", desc_text=");
        LIZ.append(this.desc_text);
        LIZ.append(", banner_img=");
        LIZ.append(this.banner_img);
        LIZ.append(", dark_banner_img=");
        LIZ.append(this.dark_banner_img);
        LIZ.append(", countDown=");
        LIZ.append(this.countDown);
        LIZ.append(", log_extra=");
        return q.LIZIZ(LIZ, this.log_extra, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Integer num = this.promotion_type;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        out.writeString(this.title);
        out.writeString(this.desc_text);
        out.writeParcelable(this.banner_img, i);
        out.writeParcelable(this.dark_banner_img, i);
        Long l = this.countDown;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        out.writeString(this.log_extra);
    }

    public GlobalWaistBanner(Integer num, String str, String str2, Image image, Image image2, Long l, String str3) {
        this.promotion_type = num;
        this.title = str;
        this.desc_text = str2;
        this.banner_img = image;
        this.dark_banner_img = image2;
        this.countDown = l;
        this.log_extra = str3;
    }

    public /* synthetic */ GlobalWaistBanner(Integer num, String str, String str2, Image image, Image image2, Long l, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : image, (i & 16) == 0 ? image2 : null, l, (i & 64) != 0 ? "" : str3);
    }
}
