package com.ss.android.ugc.aweme.image.model;

import X.C43826HHy;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ImageSourceInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<ImageSourceInfo> CREATOR = new C43826HHy();

    @InterfaceC65349Pkn("path")
    public String path;

    @InterfaceC65349Pkn("source_bit_depth")
    public final String sourceBitDepth;

    @InterfaceC65349Pkn("source_color_format")
    public final String sourceColorFormat;

    @InterfaceC65349Pkn("source_color_space")
    public final String sourceColorSpace;

    @InterfaceC65349Pkn("source_degree")
    public final int sourceDegree;

    @InterfaceC65349Pkn("source_encode_type")
    public final String sourceEncodeType;

    @InterfaceC65349Pkn("source_file_size")
    public final long sourceFileSize;

    @InterfaceC65349Pkn("source_height")
    public final int sourceHeight;

    @InterfaceC65349Pkn("source_width")
    public final int sourceWidth;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ImageSourceInfo() {
        /*
            r13 = this;
            r1 = 0
            r3 = 0
            r6 = 0
            r11 = 511(0x1ff, float:7.16E-43)
            r0 = r13
            r2 = r1
            r4 = r3
            r5 = r1
            r8 = r1
            r9 = r1
            r10 = r3
            r12 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.image.model.ImageSourceInfo.<init>():void");
    }

    public static /* synthetic */ ImageSourceInfo copy$default(ImageSourceInfo imageSourceInfo, String str, String str2, int i, int i2, String str3, long j, String str4, String str5, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = imageSourceInfo.path;
        }
        if ((i4 & 2) != 0) {
            str2 = imageSourceInfo.sourceBitDepth;
        }
        if ((i4 & 4) != 0) {
            i = imageSourceInfo.sourceWidth;
        }
        if ((i4 & 8) != 0) {
            i2 = imageSourceInfo.sourceHeight;
        }
        if ((i4 & 16) != 0) {
            str3 = imageSourceInfo.sourceEncodeType;
        }
        if ((i4 & 32) != 0) {
            j = imageSourceInfo.sourceFileSize;
        }
        if ((i4 & 64) != 0) {
            str4 = imageSourceInfo.sourceColorFormat;
        }
        if ((i4 & 128) != 0) {
            str5 = imageSourceInfo.sourceColorSpace;
        }
        if ((i4 & 256) != 0) {
            i3 = imageSourceInfo.sourceDegree;
        }
        return imageSourceInfo.copy(str, str2, i, i2, str3, j, str4, str5, i3);
    }

    public final ImageSourceInfo copy(String str, String str2, int i, int i2, String str3, long j, String str4, String str5, int i3) {
        return new ImageSourceInfo(str, str2, i, i2, str3, j, str4, str5, i3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageSourceInfo)) {
            return false;
        }
        ImageSourceInfo imageSourceInfo = (ImageSourceInfo) obj;
        return o.LJ(this.path, imageSourceInfo.path) && o.LJ(this.sourceBitDepth, imageSourceInfo.sourceBitDepth) && this.sourceWidth == imageSourceInfo.sourceWidth && this.sourceHeight == imageSourceInfo.sourceHeight && o.LJ(this.sourceEncodeType, imageSourceInfo.sourceEncodeType) && this.sourceFileSize == imageSourceInfo.sourceFileSize && o.LJ(this.sourceColorFormat, imageSourceInfo.sourceColorFormat) && o.LJ(this.sourceColorSpace, imageSourceInfo.sourceColorSpace) && this.sourceDegree == imageSourceInfo.sourceDegree;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.path);
        out.writeString(this.sourceBitDepth);
        out.writeInt(this.sourceWidth);
        out.writeInt(this.sourceHeight);
        out.writeString(this.sourceEncodeType);
        out.writeLong(this.sourceFileSize);
        out.writeString(this.sourceColorFormat);
        out.writeString(this.sourceColorSpace);
        out.writeInt(this.sourceDegree);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.path;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.sourceBitDepth;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (((((i2 + hashCode2) * 31) + this.sourceWidth) * 31) + this.sourceHeight) * 31;
        String str3 = this.sourceEncodeType;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.sourceFileSize, (i3 + hashCode3) * 31, 31);
        String str4 = this.sourceColorFormat;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i4 = (LIZJ + hashCode4) * 31;
        String str5 = this.sourceColorSpace;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return ((i4 + i) * 31) + this.sourceDegree;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ImageSourceInfo(path=");
        LIZ.append(this.path);
        LIZ.append(", sourceBitDepth=");
        LIZ.append(this.sourceBitDepth);
        LIZ.append(", sourceWidth=");
        LIZ.append(this.sourceWidth);
        LIZ.append(", sourceHeight=");
        LIZ.append(this.sourceHeight);
        LIZ.append(", sourceEncodeType=");
        LIZ.append(this.sourceEncodeType);
        LIZ.append(", sourceFileSize=");
        LIZ.append(this.sourceFileSize);
        LIZ.append(", sourceColorFormat=");
        LIZ.append(this.sourceColorFormat);
        LIZ.append(", sourceColorSpace=");
        LIZ.append(this.sourceColorSpace);
        LIZ.append(", sourceDegree=");
        return b0.LIZJ(LIZ, this.sourceDegree, ')', LIZ);
    }

    public final String getPath() {
        return this.path;
    }

    public final String getSourceBitDepth() {
        return this.sourceBitDepth;
    }

    public final String getSourceColorFormat() {
        return this.sourceColorFormat;
    }

    public final String getSourceColorSpace() {
        return this.sourceColorSpace;
    }

    public final int getSourceDegree() {
        return this.sourceDegree;
    }

    public final String getSourceEncodeType() {
        return this.sourceEncodeType;
    }

    public final long getSourceFileSize() {
        return this.sourceFileSize;
    }

    public final int getSourceHeight() {
        return this.sourceHeight;
    }

    public final int getSourceWidth() {
        return this.sourceWidth;
    }

    public final void setPath(String str) {
        this.path = str;
    }

    public ImageSourceInfo(String str, String str2, int i, int i2, String str3, long j, String str4, String str5, int i3) {
        this.path = str;
        this.sourceBitDepth = str2;
        this.sourceWidth = i;
        this.sourceHeight = i2;
        this.sourceEncodeType = str3;
        this.sourceFileSize = j;
        this.sourceColorFormat = str4;
        this.sourceColorSpace = str5;
        this.sourceDegree = i3;
    }

    public /* synthetic */ ImageSourceInfo(String str, String str2, int i, int i2, String str3, long j, String str4, String str5, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? null : str3, (i4 & 32) != 0 ? 0L : j, (i4 & 64) != 0 ? null : str4, (i4 & 128) == 0 ? str5 : null, (i4 & 256) == 0 ? i3 : 0);
    }
}
