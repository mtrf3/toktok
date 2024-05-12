package com.ss.android.ugc.aweme.shortvideo.model;

import X.C279117r;
import X.C47959Irz;
import X.InterfaceC65349Pkn;
import X.UC7;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PhotoPostContent implements Parcelable {
    public static final Parcelable.Creator<PhotoPostContent> CREATOR = new Creator();

    @InterfaceC65349Pkn("cover")
    public final ImagePostData imageCover;

    @InterfaceC65349Pkn("images")
    public final List<ImagePostData> images;

    @InterfaceC65349Pkn("music_volume")
    public final float musicVolume;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhotoPostContent copy$default(PhotoPostContent photoPostContent, List list, ImagePostData imagePostData, float f, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = photoPostContent.images;
        }
        if ((i & 2) != 0) {
            imagePostData = photoPostContent.imageCover;
        }
        if ((i & 4) != 0) {
            f = photoPostContent.musicVolume;
        }
        if ((i & 8) != 0) {
            str = photoPostContent.title;
        }
        return photoPostContent.copy(list, imagePostData, f, str);
    }

    public final PhotoPostContent copy(List<ImagePostData> images, ImagePostData imageCover, float f, String str) {
        o.LJIIIZ(images, "images");
        o.LJIIIZ(imageCover, "imageCover");
        return new PhotoPostContent(images, imageCover, f, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoPostContent)) {
            return false;
        }
        PhotoPostContent photoPostContent = (PhotoPostContent) obj;
        return o.LJ(this.images, photoPostContent.images) && o.LJ(this.imageCover, photoPostContent.imageCover) && Float.compare(this.musicVolume, photoPostContent.musicVolume) == 0 && o.LJ(this.title, photoPostContent.title);
    }

    public int hashCode() {
        int hashCode;
        int LIZIZ = C47959Irz.LIZIZ(this.musicVolume, (this.imageCover.hashCode() + (this.images.hashCode() * 31)) * 31, 31);
        String str = this.title;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LIZIZ + hashCode;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PhotoPostContent(images=");
        LIZ.append(this.images);
        LIZ.append(", imageCover=");
        LIZ.append(this.imageCover);
        LIZ.append(", musicVolume=");
        LIZ.append(this.musicVolume);
        LIZ.append(", title=");
        return q.LIZIZ(LIZ, this.title, ')', LIZ);
    }

    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<PhotoPostContent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhotoPostContent[] newArray(int i) {
            return new PhotoPostContent[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhotoPostContent createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(ImagePostData.CREATOR, parcel, arrayList, i, 1);
            }
            return new PhotoPostContent(arrayList, ImagePostData.CREATOR.createFromParcel(parcel), parcel.readFloat(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Iterator LIZJ = UC7.LIZJ(this.images, out);
        while (LIZJ.hasNext()) {
            ((ImagePostData) LIZJ.next()).writeToParcel(out, i);
        }
        this.imageCover.writeToParcel(out, i);
        out.writeFloat(this.musicVolume);
        out.writeString(this.title);
    }

    public PhotoPostContent(List<ImagePostData> images, ImagePostData imageCover, float f, String str) {
        o.LJIIIZ(images, "images");
        o.LJIIIZ(imageCover, "imageCover");
        this.images = images;
        this.imageCover = imageCover;
        this.musicVolume = f;
        this.title = str;
    }
}
