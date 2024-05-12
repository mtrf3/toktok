package com.ss.android.ugc.aweme.image.model;

import X.F9E;
import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.image.model.ImageBufferData;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class ImageBufferData extends F9E implements Parcelable, Serializable {
    public static final Parcelable.Creator<ImageBufferData> CREATOR = new Parcelable.Creator<ImageBufferData>() { // from class: X.5wv
        @Override // android.os.Parcelable.Creator
        public final ImageBufferData createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new ImageBufferData(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ImageBufferData[] newArray(int i) {
            return new ImageBufferData[i];
        }
    };

    @InterfaceC65349Pkn("height")
    public final int height;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("path")
    public final String path;

    @InterfaceC65349Pkn("width")
    public final int width;

    public static /* synthetic */ ImageBufferData copy$default(ImageBufferData imageBufferData, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = imageBufferData.path;
        }
        if ((i3 & 2) != 0) {
            i = imageBufferData.width;
        }
        if ((i3 & 4) != 0) {
            i2 = imageBufferData.height;
        }
        return imageBufferData.copy(str, i, i2);
    }

    public final ImageBufferData copy(String path, int i, int i2) {
        o.LJIIIZ(path, "path");
        return new ImageBufferData(path, i, i2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.path, Integer.valueOf(this.width), Integer.valueOf(this.height)};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.path);
        out.writeInt(this.width);
        out.writeInt(this.height);
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getPath() {
        return this.path;
    }

    public final int getWidth() {
        return this.width;
    }

    public ImageBufferData(String path, int i, int i2) {
        o.LJIIIZ(path, "path");
        this.path = path;
        this.width = i;
        this.height = i2;
    }
}
