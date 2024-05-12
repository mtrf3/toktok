package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo;

import X.C1FJ;
import X.C69667RVv;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class HeaderItem implements Parcelable {
    public static final Parcelable.Creator<HeaderItem> CREATOR = new C69667RVv();

    @InterfaceC65349Pkn("image")
    public final Image image;

    @InterfaceC65349Pkn("type")
    public final Integer type;

    @InterfaceC65349Pkn("desc_video")
    public final Video video;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderItem)) {
            return false;
        }
        HeaderItem headerItem = (HeaderItem) obj;
        return o.LJ(this.type, headerItem.type) && o.LJ(this.image, headerItem.image) && o.LJ(this.video, headerItem.video);
    }

    public final int hashCode() {
        Integer num = this.type;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Image image = this.image;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        Video video = this.video;
        return hashCode2 + (video != null ? video.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HeaderItem(type=");
        LIZ.append(this.type);
        LIZ.append(", image=");
        LIZ.append(this.image);
        LIZ.append(", video=");
        LIZ.append(this.video);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Integer num = this.type;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        out.writeParcelable(this.image, i);
        Video video = this.video;
        if (video == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            video.writeToParcel(out, i);
        }
    }

    public HeaderItem(Integer num, Image image, Video video) {
        this.type = num;
        this.image = image;
        this.video = video;
    }
}
