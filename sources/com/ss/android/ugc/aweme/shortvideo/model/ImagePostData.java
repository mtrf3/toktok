package com.ss.android.ugc.aweme.shortvideo.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ImagePostData extends F9E implements Parcelable {
    public static final Parcelable.Creator<ImagePostData> CREATOR = new Creator();

    @InterfaceC65349Pkn("height_px")
    public final int imageHeight;

    @InterfaceC65349Pkn("uri")
    public final String imageUri;

    @InterfaceC65349Pkn("width_px")
    public final int imageWidth;

    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<ImagePostData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImagePostData createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new ImagePostData(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImagePostData[] newArray(int i) {
            return new ImagePostData[i];
        }
    }

    public static /* synthetic */ ImagePostData copy$default(ImagePostData imagePostData, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = imagePostData.imageUri;
        }
        if ((i3 & 2) != 0) {
            i = imagePostData.imageHeight;
        }
        if ((i3 & 4) != 0) {
            i2 = imagePostData.imageWidth;
        }
        return imagePostData.copy(str, i, i2);
    }

    public final ImagePostData copy(String imageUri, int i, int i2) {
        o.LJIIIZ(imageUri, "imageUri");
        return new ImagePostData(imageUri, i, i2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.imageUri, Integer.valueOf(this.imageHeight), Integer.valueOf(this.imageWidth)};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.imageUri);
        out.writeInt(this.imageHeight);
        out.writeInt(this.imageWidth);
    }

    public ImagePostData(String imageUri, int i, int i2) {
        o.LJIIIZ(imageUri, "imageUri");
        this.imageUri = imageUri;
        this.imageHeight = i;
        this.imageWidth = i2;
    }
}
