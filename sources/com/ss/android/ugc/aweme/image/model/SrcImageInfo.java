package com.ss.android.ugc.aweme.image.model;

import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.image.model.SrcImageInfo;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class SrcImageInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<SrcImageInfo> CREATOR = new Parcelable.Creator<SrcImageInfo>() { // from class: X.5wX
        @Override // android.os.Parcelable.Creator
        public final SrcImageInfo createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new SrcImageInfo(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final SrcImageInfo[] newArray(int i) {
            return new SrcImageInfo[i];
        }
    };

    @InterfaceC65349Pkn("height")
    public int height;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("path")
    public final String path;

    @InterfaceC65349Pkn("width")
    public int width;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.path);
        out.writeInt(this.height);
        out.writeInt(this.width);
    }

    public final float getImageRadio() {
        return this.width / this.height;
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

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public SrcImageInfo(String path, int i, int i2) {
        o.LJIIIZ(path, "path");
        this.path = path;
        this.height = i;
        this.width = i2;
    }
}
