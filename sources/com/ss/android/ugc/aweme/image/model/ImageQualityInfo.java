package com.ss.android.ugc.aweme.image.model;

import X.C43824HHw;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ImageQualityInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<ImageQualityInfo> CREATOR = new C43824HHw();

    @InterfaceC65349Pkn("image_display_info")
    public ImageDisplayInfo imageDisplayInfo;

    @InterfaceC65349Pkn("image_encode_info")
    public ImageEncodeInfo imageEncodeInfo;

    @InterfaceC65349Pkn("image_resize_info")
    public ImageResizeInfo imageResizeInfo;

    @InterfaceC65349Pkn("image_source_info")
    public ImageSourceInfo imageSourceInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public ImageQualityInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ImageQualityInfo copy$default(ImageQualityInfo imageQualityInfo, ImageSourceInfo imageSourceInfo, ImageResizeInfo imageResizeInfo, ImageDisplayInfo imageDisplayInfo, ImageEncodeInfo imageEncodeInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            imageSourceInfo = imageQualityInfo.imageSourceInfo;
        }
        if ((i & 2) != 0) {
            imageResizeInfo = imageQualityInfo.imageResizeInfo;
        }
        if ((i & 4) != 0) {
            imageDisplayInfo = imageQualityInfo.imageDisplayInfo;
        }
        if ((i & 8) != 0) {
            imageEncodeInfo = imageQualityInfo.imageEncodeInfo;
        }
        return imageQualityInfo.copy(imageSourceInfo, imageResizeInfo, imageDisplayInfo, imageEncodeInfo);
    }

    public final ImageQualityInfo copy(ImageSourceInfo imageSourceInfo, ImageResizeInfo imageResizeInfo, ImageDisplayInfo imageDisplayInfo, ImageEncodeInfo imageEncodeInfo) {
        return new ImageQualityInfo(imageSourceInfo, imageResizeInfo, imageDisplayInfo, imageEncodeInfo);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageQualityInfo)) {
            return false;
        }
        ImageQualityInfo imageQualityInfo = (ImageQualityInfo) obj;
        return o.LJ(this.imageSourceInfo, imageQualityInfo.imageSourceInfo) && o.LJ(this.imageResizeInfo, imageQualityInfo.imageResizeInfo) && o.LJ(this.imageDisplayInfo, imageQualityInfo.imageDisplayInfo) && o.LJ(this.imageEncodeInfo, imageQualityInfo.imageEncodeInfo);
    }

    public int hashCode() {
        ImageSourceInfo imageSourceInfo = this.imageSourceInfo;
        int hashCode = (imageSourceInfo == null ? 0 : imageSourceInfo.hashCode()) * 31;
        ImageResizeInfo imageResizeInfo = this.imageResizeInfo;
        int hashCode2 = (hashCode + (imageResizeInfo == null ? 0 : imageResizeInfo.hashCode())) * 31;
        ImageDisplayInfo imageDisplayInfo = this.imageDisplayInfo;
        int hashCode3 = (hashCode2 + (imageDisplayInfo == null ? 0 : imageDisplayInfo.hashCode())) * 31;
        ImageEncodeInfo imageEncodeInfo = this.imageEncodeInfo;
        return hashCode3 + (imageEncodeInfo != null ? imageEncodeInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ImageQualityInfo(imageSourceInfo=");
        LIZ.append(this.imageSourceInfo);
        LIZ.append(", imageResizeInfo=");
        LIZ.append(this.imageResizeInfo);
        LIZ.append(", imageDisplayInfo=");
        LIZ.append(this.imageDisplayInfo);
        LIZ.append(", imageEncodeInfo=");
        LIZ.append(this.imageEncodeInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        ImageSourceInfo imageSourceInfo = this.imageSourceInfo;
        if (imageSourceInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            imageSourceInfo.writeToParcel(out, i);
        }
        ImageResizeInfo imageResizeInfo = this.imageResizeInfo;
        if (imageResizeInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            imageResizeInfo.writeToParcel(out, i);
        }
        ImageDisplayInfo imageDisplayInfo = this.imageDisplayInfo;
        if (imageDisplayInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            imageDisplayInfo.writeToParcel(out, i);
        }
        ImageEncodeInfo imageEncodeInfo = this.imageEncodeInfo;
        if (imageEncodeInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            imageEncodeInfo.writeToParcel(out, i);
        }
    }

    public final ImageDisplayInfo getImageDisplayInfo() {
        return this.imageDisplayInfo;
    }

    public final ImageEncodeInfo getImageEncodeInfo() {
        return this.imageEncodeInfo;
    }

    public final ImageResizeInfo getImageResizeInfo() {
        return this.imageResizeInfo;
    }

    public final ImageSourceInfo getImageSourceInfo() {
        return this.imageSourceInfo;
    }

    public final void setImageDisplayInfo(ImageDisplayInfo imageDisplayInfo) {
        this.imageDisplayInfo = imageDisplayInfo;
    }

    public final void setImageEncodeInfo(ImageEncodeInfo imageEncodeInfo) {
        this.imageEncodeInfo = imageEncodeInfo;
    }

    public final void setImageResizeInfo(ImageResizeInfo imageResizeInfo) {
        this.imageResizeInfo = imageResizeInfo;
    }

    public final void setImageSourceInfo(ImageSourceInfo imageSourceInfo) {
        this.imageSourceInfo = imageSourceInfo;
    }

    public ImageQualityInfo(ImageSourceInfo imageSourceInfo, ImageResizeInfo imageResizeInfo, ImageDisplayInfo imageDisplayInfo, ImageEncodeInfo imageEncodeInfo) {
        this.imageSourceInfo = imageSourceInfo;
        this.imageResizeInfo = imageResizeInfo;
        this.imageDisplayInfo = imageDisplayInfo;
        this.imageEncodeInfo = imageEncodeInfo;
    }

    public /* synthetic */ ImageQualityInfo(ImageSourceInfo imageSourceInfo, ImageResizeInfo imageResizeInfo, ImageDisplayInfo imageDisplayInfo, ImageEncodeInfo imageEncodeInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : imageSourceInfo, (i & 2) != 0 ? null : imageResizeInfo, (i & 4) != 0 ? null : imageDisplayInfo, (i & 8) != 0 ? null : imageEncodeInfo);
    }
}
