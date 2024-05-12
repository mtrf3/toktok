package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C27471AqJ;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class EntranceBannerInfo implements Parcelable {
    public static final Parcelable.Creator<EntranceBannerInfo> CREATOR = new C27471AqJ();

    @InterfaceC65349Pkn("button")
    public final EntranceButtonInfo buttonInfo;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("title_img")
    public final Image titleImg;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntranceBannerInfo)) {
            return false;
        }
        EntranceBannerInfo entranceBannerInfo = (EntranceBannerInfo) obj;
        return o.LJ(this.title, entranceBannerInfo.title) && o.LJ(this.titleImg, entranceBannerInfo.titleImg) && o.LJ(this.buttonInfo, entranceBannerInfo.buttonInfo);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Image image = this.titleImg;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        EntranceButtonInfo entranceButtonInfo = this.buttonInfo;
        return hashCode2 + (entranceButtonInfo != null ? entranceButtonInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EntranceBannerInfo(title=");
        LIZ.append(this.title);
        LIZ.append(", titleImg=");
        LIZ.append(this.titleImg);
        LIZ.append(", buttonInfo=");
        LIZ.append(this.buttonInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.title);
        out.writeParcelable(this.titleImg, i);
        EntranceButtonInfo entranceButtonInfo = this.buttonInfo;
        if (entranceButtonInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            entranceButtonInfo.writeToParcel(out, i);
        }
    }

    public EntranceBannerInfo(String str, Image image, EntranceButtonInfo entranceButtonInfo) {
        this.title = str;
        this.titleImg = image;
        this.buttonInfo = entranceButtonInfo;
    }
}
