package com.ss.android.ugc.aweme.poi.uiwidget.gallery;

import X.C199117rf;
import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryAnchorData;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiGalleryAnchorData extends F9E implements Parcelable {
    public static final C199117rf CREATOR = new Parcelable.Creator<PoiGalleryAnchorData>() { // from class: X.7rf
        @Override // android.os.Parcelable.Creator
        public final PoiGalleryAnchorData createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new PoiGalleryAnchorData(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final PoiGalleryAnchorData[] newArray(int i) {
            return new PoiGalleryAnchorData[i];
        }
    };
    public final int h;
    public final int w;
    public final int x;
    public final int y;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.w), Integer.valueOf(this.h), Integer.valueOf(this.x), Integer.valueOf(this.y)};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeInt(this.w);
        parcel.writeInt(this.h);
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
    }

    public PoiGalleryAnchorData(int i, int i2, int i3, int i4) {
        this.w = i;
        this.h = i2;
        this.x = i3;
        this.y = i4;
    }
}
