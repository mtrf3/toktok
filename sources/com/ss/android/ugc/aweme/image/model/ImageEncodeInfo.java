package com.ss.android.ugc.aweme.image.model;

import X.C43825HHx;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.UPJ;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ImageEncodeInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<ImageEncodeInfo> CREATOR = new C43825HHx();

    @InterfaceC65349Pkn("encode_api")
    public String encodeApi;

    @InterfaceC65349Pkn("encode_color_format")
    public String encodeColorFormat;

    @InterfaceC65349Pkn("encode_color_space")
    public String encodeColorSpace;

    @InterfaceC65349Pkn("encode_depth")
    public String encodeDepth;

    @InterfaceC65349Pkn("encode_quality")
    public int encodeQuality;

    @InterfaceC65349Pkn("encode_quality_ori")
    public int encodeQualityOri;

    @InterfaceC65349Pkn("encode_type")
    public String encodeType;

    @InterfaceC65349Pkn("file_size")
    public long fileSize;

    @InterfaceC65349Pkn("height")
    public int height;

    @InterfaceC65349Pkn("isreencode")
    public int isreencode;

    @InterfaceC65349Pkn("path")
    public String path;

    @InterfaceC65349Pkn("width")
    public int width;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ImageEncodeInfo() {
        /*
            r16 = this;
            r1 = 0
            r2 = 0
            r4 = 0
            r14 = 4095(0xfff, float:5.738E-42)
            r0 = r16
            r3 = r2
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r1
            r11 = r2
            r12 = r2
            r13 = r2
            r15 = r1
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.image.model.ImageEncodeInfo.<init>():void");
    }

    public static /* synthetic */ ImageEncodeInfo copy$default(ImageEncodeInfo imageEncodeInfo, String str, int i, int i2, long j, String str2, String str3, String str4, String str5, String str6, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = imageEncodeInfo.path;
        }
        if ((i6 & 2) != 0) {
            i = imageEncodeInfo.width;
        }
        if ((i6 & 4) != 0) {
            i2 = imageEncodeInfo.height;
        }
        if ((i6 & 8) != 0) {
            j = imageEncodeInfo.fileSize;
        }
        if ((i6 & 16) != 0) {
            str2 = imageEncodeInfo.encodeType;
        }
        if ((i6 & 32) != 0) {
            str3 = imageEncodeInfo.encodeDepth;
        }
        if ((i6 & 64) != 0) {
            str4 = imageEncodeInfo.encodeColorFormat;
        }
        if ((i6 & 128) != 0) {
            str5 = imageEncodeInfo.encodeColorSpace;
        }
        if ((i6 & 256) != 0) {
            str6 = imageEncodeInfo.encodeApi;
        }
        if ((i6 & 512) != 0) {
            i3 = imageEncodeInfo.isreencode;
        }
        if ((i6 & 1024) != 0) {
            i4 = imageEncodeInfo.encodeQuality;
        }
        if ((i6 & 2048) != 0) {
            i5 = imageEncodeInfo.encodeQualityOri;
        }
        return imageEncodeInfo.copy(str, i, i2, j, str2, str3, str4, str5, str6, i3, i4, i5);
    }

    public final ImageEncodeInfo copy(String str, int i, int i2, long j, String str2, String str3, String str4, String str5, String str6, int i3, int i4, int i5) {
        return new ImageEncodeInfo(str, i, i2, j, str2, str3, str4, str5, str6, i3, i4, i5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageEncodeInfo)) {
            return false;
        }
        ImageEncodeInfo imageEncodeInfo = (ImageEncodeInfo) obj;
        return o.LJ(this.path, imageEncodeInfo.path) && this.width == imageEncodeInfo.width && this.height == imageEncodeInfo.height && this.fileSize == imageEncodeInfo.fileSize && o.LJ(this.encodeType, imageEncodeInfo.encodeType) && o.LJ(this.encodeDepth, imageEncodeInfo.encodeDepth) && o.LJ(this.encodeColorFormat, imageEncodeInfo.encodeColorFormat) && o.LJ(this.encodeColorSpace, imageEncodeInfo.encodeColorSpace) && o.LJ(this.encodeApi, imageEncodeInfo.encodeApi) && this.isreencode == imageEncodeInfo.isreencode && this.encodeQuality == imageEncodeInfo.encodeQuality && this.encodeQualityOri == imageEncodeInfo.encodeQualityOri;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.path);
        out.writeInt(this.width);
        out.writeInt(this.height);
        out.writeLong(this.fileSize);
        out.writeString(this.encodeType);
        out.writeString(this.encodeDepth);
        out.writeString(this.encodeColorFormat);
        out.writeString(this.encodeColorSpace);
        out.writeString(this.encodeApi);
        out.writeInt(this.isreencode);
        out.writeInt(this.encodeQuality);
        out.writeInt(this.encodeQualityOri);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        String str = this.path;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.fileSize, ((((hashCode * 31) + this.width) * 31) + this.height) * 31, 31);
        String str2 = this.encodeType;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (LIZJ + hashCode2) * 31;
        String str3 = this.encodeDepth;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        String str4 = this.encodeColorFormat;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        String str5 = this.encodeColorSpace;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        String str6 = this.encodeApi;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return ((((((i5 + i) * 31) + this.isreencode) * 31) + this.encodeQuality) * 31) + this.encodeQualityOri;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ImageEncodeInfo(path=");
        sb.append(this.path);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", fileSize=");
        sb.append(this.fileSize);
        sb.append(", encodeType=");
        sb.append(this.encodeType);
        sb.append(", encodeDepth=");
        sb.append(this.encodeDepth);
        sb.append(", encodeColorFormat=");
        sb.append(this.encodeColorFormat);
        sb.append(", encodeColorSpace=");
        sb.append(this.encodeColorSpace);
        sb.append(", encodeApi=");
        sb.append(this.encodeApi);
        sb.append(", isreencode=");
        sb.append(this.isreencode);
        sb.append(", encodeQuality=");
        sb.append(this.encodeQuality);
        sb.append(", encodeQualityOri=");
        return UPJ.LIZLLL(sb, this.encodeQualityOri, ')');
    }

    public final String getEncodeApi() {
        return this.encodeApi;
    }

    public final String getEncodeColorFormat() {
        return this.encodeColorFormat;
    }

    public final String getEncodeColorSpace() {
        return this.encodeColorSpace;
    }

    public final String getEncodeDepth() {
        return this.encodeDepth;
    }

    public final int getEncodeQuality() {
        return this.encodeQuality;
    }

    public final int getEncodeQualityOri() {
        return this.encodeQualityOri;
    }

    public final String getEncodeType() {
        return this.encodeType;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getIsreencode() {
        return this.isreencode;
    }

    public final String getPath() {
        return this.path;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setEncodeApi(String str) {
        this.encodeApi = str;
    }

    public final void setEncodeColorFormat(String str) {
        this.encodeColorFormat = str;
    }

    public final void setEncodeColorSpace(String str) {
        this.encodeColorSpace = str;
    }

    public final void setEncodeDepth(String str) {
        this.encodeDepth = str;
    }

    public final void setEncodeQuality(int i) {
        this.encodeQuality = i;
    }

    public final void setEncodeQualityOri(int i) {
        this.encodeQualityOri = i;
    }

    public final void setEncodeType(String str) {
        this.encodeType = str;
    }

    public final void setFileSize(long j) {
        this.fileSize = j;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setIsreencode(int i) {
        this.isreencode = i;
    }

    public final void setPath(String str) {
        this.path = str;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public ImageEncodeInfo(String str, int i, int i2, long j, String str2, String str3, String str4, String str5, String str6, int i3, int i4, int i5) {
        this.path = str;
        this.width = i;
        this.height = i2;
        this.fileSize = j;
        this.encodeType = str2;
        this.encodeDepth = str3;
        this.encodeColorFormat = str4;
        this.encodeColorSpace = str5;
        this.encodeApi = str6;
        this.isreencode = i3;
        this.encodeQuality = i4;
        this.encodeQualityOri = i5;
    }

    public /* synthetic */ ImageEncodeInfo(String str, int i, int i2, long j, String str2, String str3, String str4, String str5, String str6, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? null : str, (i6 & 2) != 0 ? 0 : i, (i6 & 4) != 0 ? 0 : i2, (i6 & 8) != 0 ? 0L : j, (i6 & 16) != 0 ? null : str2, (i6 & 32) != 0 ? null : str3, (i6 & 64) != 0 ? null : str4, (i6 & 128) != 0 ? null : str5, (i6 & 256) == 0 ? str6 : null, (i6 & 512) != 0 ? 1 : i3, (i6 & 1024) != 0 ? 0 : i4, (i6 & 2048) == 0 ? i5 : 0);
    }
}
