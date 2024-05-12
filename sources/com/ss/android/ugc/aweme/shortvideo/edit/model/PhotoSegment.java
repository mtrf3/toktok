package com.ss.android.ugc.aweme.shortvideo.edit.model;

import X.C36482ETm;
import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PhotoSegment extends F9E implements Parcelable {
    public static final Parcelable.Creator<PhotoSegment> CREATOR = new C36482ETm();
    public final int height;
    public final String path;
    public final int width;

    public static /* synthetic */ PhotoSegment copy$default(PhotoSegment photoSegment, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = photoSegment.path;
        }
        if ((i3 & 2) != 0) {
            i = photoSegment.width;
        }
        if ((i3 & 4) != 0) {
            i2 = photoSegment.height;
        }
        return photoSegment.copy(str, i, i2);
    }

    public final PhotoSegment copy(String path, int i, int i2) {
        o.LJIIIZ(path, "path");
        return new PhotoSegment(path, i, i2);
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
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.path);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
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

    public PhotoSegment(String path, int i, int i2) {
        o.LJIIIZ(path, "path");
        this.path = path;
        this.width = i;
        this.height = i2;
    }
}
