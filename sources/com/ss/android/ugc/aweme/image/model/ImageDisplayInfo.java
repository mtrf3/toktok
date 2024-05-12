package com.ss.android.ugc.aweme.image.model;

import X.HI0;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ImageDisplayInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<ImageDisplayInfo> CREATOR = new HI0();

    @InterfaceC65349Pkn("display_color_space")
    public final String displayColorSpace;

    @InterfaceC65349Pkn("display_depth")
    public final String displayDepth;

    @InterfaceC65349Pkn("display_format")
    public final String displayFormat;

    /* JADX WARN: Multi-variable type inference failed */
    public ImageDisplayInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ImageDisplayInfo copy$default(ImageDisplayInfo imageDisplayInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = imageDisplayInfo.displayColorSpace;
        }
        if ((i & 2) != 0) {
            str2 = imageDisplayInfo.displayFormat;
        }
        if ((i & 4) != 0) {
            str3 = imageDisplayInfo.displayDepth;
        }
        return imageDisplayInfo.copy(str, str2, str3);
    }

    public final ImageDisplayInfo copy(String str, String str2, String str3) {
        return new ImageDisplayInfo(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageDisplayInfo)) {
            return false;
        }
        ImageDisplayInfo imageDisplayInfo = (ImageDisplayInfo) obj;
        return o.LJ(this.displayColorSpace, imageDisplayInfo.displayColorSpace) && o.LJ(this.displayFormat, imageDisplayInfo.displayFormat) && o.LJ(this.displayDepth, imageDisplayInfo.displayDepth);
    }

    public int hashCode() {
        String str = this.displayColorSpace;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.displayFormat;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displayDepth;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.displayColorSpace);
        out.writeString(this.displayFormat);
        out.writeString(this.displayDepth);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ImageDisplayInfo(displayColorSpace=");
        LIZ.append(this.displayColorSpace);
        LIZ.append(", displayFormat=");
        LIZ.append(this.displayFormat);
        LIZ.append(", displayDepth=");
        return q.LIZIZ(LIZ, this.displayDepth, ')', LIZ);
    }

    public final String getDisplayColorSpace() {
        return this.displayColorSpace;
    }

    public final String getDisplayDepth() {
        return this.displayDepth;
    }

    public final String getDisplayFormat() {
        return this.displayFormat;
    }

    public ImageDisplayInfo(String str, String str2, String str3) {
        this.displayColorSpace = str;
        this.displayFormat = str2;
        this.displayDepth = str3;
    }

    public /* synthetic */ ImageDisplayInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
