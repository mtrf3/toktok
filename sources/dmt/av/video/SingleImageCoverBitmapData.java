package dmt.av.video;

import X.C42267GiN;
import X.JBR;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SingleImageCoverBitmapData implements Parcelable, Serializable {
    public static final Parcelable.Creator<SingleImageCoverBitmapData> CREATOR = new C42267GiN();
    public final long date;
    public final int itemCoverWidth;
    public final int mediaType;
    public final String previewBitmap;
    public final String sourcePath;
    public final int srcHeight;
    public final int srcWidth;

    public static /* synthetic */ SingleImageCoverBitmapData copy$default(SingleImageCoverBitmapData singleImageCoverBitmapData, String str, int i, long j, int i2, int i3, int i4, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = singleImageCoverBitmapData.sourcePath;
        }
        if ((i5 & 2) != 0) {
            i = singleImageCoverBitmapData.itemCoverWidth;
        }
        if ((i5 & 4) != 0) {
            j = singleImageCoverBitmapData.date;
        }
        if ((i5 & 8) != 0) {
            i2 = singleImageCoverBitmapData.mediaType;
        }
        if ((i5 & 16) != 0) {
            i3 = singleImageCoverBitmapData.srcWidth;
        }
        if ((i5 & 32) != 0) {
            i4 = singleImageCoverBitmapData.srcHeight;
        }
        if ((i5 & 64) != 0) {
            str2 = singleImageCoverBitmapData.previewBitmap;
        }
        return singleImageCoverBitmapData.copy(str, i, j, i2, i3, i4, str2);
    }

    public final SingleImageCoverBitmapData copy(String sourcePath, int i, long j, int i2, int i3, int i4, String str) {
        o.LJIIIZ(sourcePath, "sourcePath");
        return new SingleImageCoverBitmapData(sourcePath, i, j, i2, i3, i4, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingleImageCoverBitmapData)) {
            return false;
        }
        SingleImageCoverBitmapData singleImageCoverBitmapData = (SingleImageCoverBitmapData) obj;
        return o.LJ(this.sourcePath, singleImageCoverBitmapData.sourcePath) && this.itemCoverWidth == singleImageCoverBitmapData.itemCoverWidth && this.date == singleImageCoverBitmapData.date && this.mediaType == singleImageCoverBitmapData.mediaType && this.srcWidth == singleImageCoverBitmapData.srcWidth && this.srcHeight == singleImageCoverBitmapData.srcHeight && o.LJ(this.previewBitmap, singleImageCoverBitmapData.previewBitmap);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.sourcePath);
        out.writeInt(this.itemCoverWidth);
        out.writeLong(this.date);
        out.writeInt(this.mediaType);
        out.writeInt(this.srcWidth);
        out.writeInt(this.srcHeight);
        out.writeString(this.previewBitmap);
    }

    public int hashCode() {
        int hashCode;
        int LIZJ = (((((JBR.LIZJ(this.date, ((this.sourcePath.hashCode() * 31) + this.itemCoverWidth) * 31, 31) + this.mediaType) * 31) + this.srcWidth) * 31) + this.srcHeight) * 31;
        String str = this.previewBitmap;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LIZJ + hashCode;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SingleImageCoverBitmapData(sourcePath=");
        LIZ.append(this.sourcePath);
        LIZ.append(", itemCoverWidth=");
        LIZ.append(this.itemCoverWidth);
        LIZ.append(", date=");
        LIZ.append(this.date);
        LIZ.append(", mediaType=");
        LIZ.append(this.mediaType);
        LIZ.append(", srcWidth=");
        LIZ.append(this.srcWidth);
        LIZ.append(", srcHeight=");
        LIZ.append(this.srcHeight);
        LIZ.append(", previewBitmap=");
        return q.LIZIZ(LIZ, this.previewBitmap, ')', LIZ);
    }

    public final long getDate() {
        return this.date;
    }

    public final int getItemCoverWidth() {
        return this.itemCoverWidth;
    }

    public final int getMediaType() {
        return this.mediaType;
    }

    public final String getPreviewBitmap() {
        return this.previewBitmap;
    }

    public final String getSourcePath() {
        return this.sourcePath;
    }

    public final int getSrcHeight() {
        return this.srcHeight;
    }

    public final int getSrcWidth() {
        return this.srcWidth;
    }

    public SingleImageCoverBitmapData(String sourcePath, int i, long j, int i2, int i3, int i4, String str) {
        o.LJIIIZ(sourcePath, "sourcePath");
        this.sourcePath = sourcePath;
        this.itemCoverWidth = i;
        this.date = j;
        this.mediaType = i2;
        this.srcWidth = i3;
        this.srcHeight = i4;
        this.previewBitmap = str;
    }

    public /* synthetic */ SingleImageCoverBitmapData(String str, int i, long j, int i2, int i3, int i4, String str2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, j, i2, i3, i4, (i5 & 64) != 0 ? null : str2);
    }
}
