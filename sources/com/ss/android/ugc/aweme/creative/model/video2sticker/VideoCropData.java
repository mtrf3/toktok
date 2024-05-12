package com.ss.android.ugc.aweme.creative.model.video2sticker;

import X.C0MT;
import X.C144765mC;
import X.C47959Irz;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.video2sticker.VideoCropData;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class VideoCropData implements Parcelable {

    @InterfaceC65349Pkn("clip_ratio")
    public int cropRatioMode;

    @InterfaceC65349Pkn("scale")
    public Float scaleAfterCrop;

    @InterfaceC65349Pkn("transform_x")
    public float transformX;

    @InterfaceC65349Pkn("transform_y")
    public float transformY;
    public static final C144765mC Companion = new Object() { // from class: X.5mC
    };
    public static final Parcelable.Creator<VideoCropData> CREATOR = new Parcelable.Creator<VideoCropData>() { // from class: X.5m9
        @Override // android.os.Parcelable.Creator
        public final VideoCropData createFromParcel(Parcel parcel) {
            Float valueOf;
            o.LJIIIZ(parcel, "parcel");
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Float.valueOf(parcel.readFloat());
            }
            return new VideoCropData(valueOf, parcel.readFloat(), parcel.readFloat(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoCropData[] newArray(int i) {
            return new VideoCropData[i];
        }
    };

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VideoCropData() {
        /*
            r7 = this;
            r1 = 0
            r2 = 0
            r4 = 0
            r5 = 15
            r0 = r7
            r3 = r2
            r6 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.video2sticker.VideoCropData.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoCropData)) {
            return false;
        }
        VideoCropData videoCropData = (VideoCropData) obj;
        return o.LJ(this.scaleAfterCrop, videoCropData.scaleAfterCrop) && Float.compare(this.transformX, videoCropData.transformX) == 0 && Float.compare(this.transformY, videoCropData.transformY) == 0 && this.cropRatioMode == videoCropData.cropRatioMode;
    }

    public final int hashCode() {
        int hashCode;
        Float f = this.scaleAfterCrop;
        if (f == null) {
            hashCode = 0;
        } else {
            hashCode = f.hashCode();
        }
        return C47959Irz.LIZIZ(this.transformY, C47959Irz.LIZIZ(this.transformX, hashCode * 31, 31), 31) + this.cropRatioMode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoCropData(scaleAfterCrop=");
        LIZ.append(this.scaleAfterCrop);
        LIZ.append(", transformX=");
        LIZ.append(this.transformX);
        LIZ.append(", transformY=");
        LIZ.append(this.transformY);
        LIZ.append(", cropRatioMode=");
        return b0.LIZJ(LIZ, this.cropRatioMode, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Float f = this.scaleAfterCrop;
        if (f == null) {
            out.writeInt(0);
        } else {
            C0MT.LIZJ(out, 1, f);
        }
        out.writeFloat(this.transformX);
        out.writeFloat(this.transformY);
        out.writeInt(this.cropRatioMode);
    }

    public VideoCropData(Float f, float f2, float f3, int i) {
        this.scaleAfterCrop = f;
        this.transformX = f2;
        this.transformY = f3;
        this.cropRatioMode = i;
    }

    public /* synthetic */ VideoCropData(Float f, float f2, float f3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : f, (i2 & 2) != 0 ? 0.0f : f2, (i2 & 4) != 0 ? 0.0f : f3, (i2 & 8) != 0 ? 1 : i);
    }
}
