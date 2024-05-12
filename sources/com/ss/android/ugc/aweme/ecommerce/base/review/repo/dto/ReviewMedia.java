package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C1FJ;
import X.C27643At5;
import X.C27644At6;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ReviewMedia implements Parcelable {

    @InterfaceC65349Pkn("image")
    public final Image image;

    @InterfaceC65349Pkn("media_type")
    public final Integer mediaType;

    @InterfaceC65349Pkn("video")
    public final Video video;
    public static final C27644At6 Companion = new C27644At6();
    public static final Parcelable.Creator<ReviewMedia> CREATOR = new C27643At5();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewMedia)) {
            return false;
        }
        ReviewMedia reviewMedia = (ReviewMedia) obj;
        return o.LJ(this.mediaType, reviewMedia.mediaType) && o.LJ(this.image, reviewMedia.image) && o.LJ(this.video, reviewMedia.video);
    }

    public final int hashCode() {
        Integer num = this.mediaType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Image image = this.image;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        Video video = this.video;
        return hashCode2 + (video != null ? video.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReviewMedia(mediaType=");
        LIZ.append(this.mediaType);
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
        Integer num = this.mediaType;
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

    public ReviewMedia(Integer num, Image image, Video video) {
        this.mediaType = num;
        this.image = image;
        this.video = video;
    }

    public /* synthetic */ ReviewMedia(Integer num, Image image, Video video, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, (i & 2) != 0 ? null : image, (i & 4) != 0 ? null : video);
    }
}
