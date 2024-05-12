package com.ss.android.ugc.aweme.image.model;

import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.image.model.ImageSurfaceData;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class ImageSurfaceData implements Parcelable, Serializable {
    public static final Parcelable.Creator<ImageSurfaceData> CREATOR = new Parcelable.Creator<ImageSurfaceData>() { // from class: X.5xG
        @Override // android.os.Parcelable.Creator
        public final ImageSurfaceData createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new ImageSurfaceData(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ImageSurfaceData[] newArray(int i) {
            return new ImageSurfaceData[i];
        }
    };

    @InterfaceC65349Pkn("surface_view_height")
    public int surfaceViewHeight;

    @InterfaceC65349Pkn("surface_view_width")
    public int surfaceViewWidth;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ImageSurfaceData() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.image.model.ImageSurfaceData.<init>():void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.surfaceViewWidth);
        out.writeInt(this.surfaceViewHeight);
    }

    public final float getSurfaceViewRatio() {
        int i = this.surfaceViewHeight;
        if (i == 0) {
            return 0.0f;
        }
        return this.surfaceViewWidth / i;
    }

    public final int getSurfaceViewHeight() {
        return this.surfaceViewHeight;
    }

    public final int getSurfaceViewWidth() {
        return this.surfaceViewWidth;
    }

    public final void setSurfaceViewHeight(int i) {
        this.surfaceViewHeight = i;
    }

    public final void setSurfaceViewWidth(int i) {
        this.surfaceViewWidth = i;
    }

    public ImageSurfaceData(int i, int i2) {
        this.surfaceViewWidth = i;
        this.surfaceViewHeight = i2;
    }

    public /* synthetic */ ImageSurfaceData(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
