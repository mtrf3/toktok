package com.ss.android.ugc.aweme.ecommerce.base.common.model;

import X.C69669RVx;
import X.C69670RVy;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class MediaItem implements Parcelable {

    @InterfaceC65349Pkn("image")
    public final Image image;

    @InterfaceC65349Pkn("type")
    public final int type;

    @InterfaceC65349Pkn("video")
    public final Video video;
    public static final C69670RVy Companion = new C69670RVy();
    public static final Parcelable.Creator<MediaItem> CREATOR = new C69669RVx();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaItem)) {
            return false;
        }
        MediaItem mediaItem = (MediaItem) obj;
        return o.LJ(this.image, mediaItem.image) && o.LJ(this.video, mediaItem.video) && this.type == mediaItem.type;
    }

    public final int hashCode() {
        Image image = this.image;
        int hashCode = (image == null ? 0 : image.hashCode()) * 31;
        Video video = this.video;
        return ((hashCode + (video != null ? video.hashCode() : 0)) * 31) + this.type;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeParcelable(this.image, i);
        Video video = this.video;
        if (video == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            video.writeToParcel(out, i);
        }
        out.writeInt(this.type);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MediaItem(image=");
        LIZ.append(this.image);
        LIZ.append(", video=");
        LIZ.append(this.video);
        LIZ.append(", type=");
        return b0.LIZJ(LIZ, this.type, ')', LIZ);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaItem(Video video) {
        this(null, video, 2, 1, 0 == true ? 1 : 0);
        o.LJIIIZ(video, "video");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaItem(Image image) {
        this(image, null, 1, 2, 0 == true ? 1 : 0);
        o.LJIIIZ(image, "image");
    }

    public MediaItem(Image image, Video video, int i) {
        this.image = image;
        this.video = video;
        this.type = i;
    }

    public /* synthetic */ MediaItem(Image image, Video video, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : image, (i2 & 2) != 0 ? null : video, i);
    }
}
