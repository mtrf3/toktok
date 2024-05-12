package com.ss.android.ugc.aweme.image.model;

import X.C43827HHz;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ImageResizeInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<ImageResizeInfo> CREATOR = new C43827HHz();

    @InterfaceC65349Pkn("resize_decode_type")
    public final String resizeDecodeType;

    @InterfaceC65349Pkn("resize_format")
    public final String resizeFormat;

    @InterfaceC65349Pkn("resize_height")
    public final int resizeHeight;

    @InterfaceC65349Pkn("resize_mode")
    public final String resizeMode;

    @InterfaceC65349Pkn("resize_width")
    public final int resizeWidth;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ImageResizeInfo() {
        /*
            r8 = this;
            r1 = 0
            r3 = 0
            r6 = 31
            r0 = r8
            r2 = r1
            r4 = r3
            r5 = r3
            r7 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.image.model.ImageResizeInfo.<init>():void");
    }

    public static /* synthetic */ ImageResizeInfo copy$default(ImageResizeInfo imageResizeInfo, int i, int i2, String str, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = imageResizeInfo.resizeWidth;
        }
        if ((i3 & 2) != 0) {
            i2 = imageResizeInfo.resizeHeight;
        }
        if ((i3 & 4) != 0) {
            str = imageResizeInfo.resizeFormat;
        }
        if ((i3 & 8) != 0) {
            str2 = imageResizeInfo.resizeDecodeType;
        }
        if ((i3 & 16) != 0) {
            str3 = imageResizeInfo.resizeMode;
        }
        return imageResizeInfo.copy(i, i2, str, str2, str3);
    }

    public final ImageResizeInfo copy(int i, int i2, String str, String str2, String str3) {
        return new ImageResizeInfo(i, i2, str, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageResizeInfo)) {
            return false;
        }
        ImageResizeInfo imageResizeInfo = (ImageResizeInfo) obj;
        return this.resizeWidth == imageResizeInfo.resizeWidth && this.resizeHeight == imageResizeInfo.resizeHeight && o.LJ(this.resizeFormat, imageResizeInfo.resizeFormat) && o.LJ(this.resizeDecodeType, imageResizeInfo.resizeDecodeType) && o.LJ(this.resizeMode, imageResizeInfo.resizeMode);
    }

    public int hashCode() {
        int i = ((this.resizeWidth * 31) + this.resizeHeight) * 31;
        String str = this.resizeFormat;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.resizeDecodeType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.resizeMode;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.resizeWidth);
        out.writeInt(this.resizeHeight);
        out.writeString(this.resizeFormat);
        out.writeString(this.resizeDecodeType);
        out.writeString(this.resizeMode);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ImageResizeInfo(resizeWidth=");
        LIZ.append(this.resizeWidth);
        LIZ.append(", resizeHeight=");
        LIZ.append(this.resizeHeight);
        LIZ.append(", resizeFormat=");
        LIZ.append(this.resizeFormat);
        LIZ.append(", resizeDecodeType=");
        LIZ.append(this.resizeDecodeType);
        LIZ.append(", resizeMode=");
        return q.LIZIZ(LIZ, this.resizeMode, ')', LIZ);
    }

    public final String getResizeDecodeType() {
        return this.resizeDecodeType;
    }

    public final String getResizeFormat() {
        return this.resizeFormat;
    }

    public final int getResizeHeight() {
        return this.resizeHeight;
    }

    public final String getResizeMode() {
        return this.resizeMode;
    }

    public final int getResizeWidth() {
        return this.resizeWidth;
    }

    public ImageResizeInfo(int i, int i2, String str, String str2, String str3) {
        this.resizeWidth = i;
        this.resizeHeight = i2;
        this.resizeFormat = str;
        this.resizeDecodeType = str2;
        this.resizeMode = str3;
    }

    public /* synthetic */ ImageResizeInfo(int i, int i2, String str, String str2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) == 0 ? i2 : 0, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? null : str2, (i3 & 16) == 0 ? str3 : null);
    }
}
