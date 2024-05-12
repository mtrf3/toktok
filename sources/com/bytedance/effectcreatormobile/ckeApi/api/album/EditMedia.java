package com.bytedance.effectcreatormobile.ckeapi.api.album;

import X.C93469aRN;
import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class EditMedia extends F9E implements Parcelable {
    public static final Parcelable.Creator<EditMedia> CREATOR = new C93469aRN();
    public final boolean isVideo;
    public final String path;

    public static /* synthetic */ EditMedia copy$default(EditMedia editMedia, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = editMedia.path;
        }
        if ((i & 2) != 0) {
            z = editMedia.isVideo;
        }
        return editMedia.copy(str, z);
    }

    public final EditMedia copy(String path, boolean z) {
        o.LJIIIZ(path, "path");
        return new EditMedia(path, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.path, Boolean.valueOf(this.isVideo)};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.path);
        parcel.writeInt(this.isVideo ? 1 : 0);
    }

    public final String getPath() {
        return this.path;
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    public EditMedia(String path, boolean z) {
        o.LJIIIZ(path, "path");
        this.path = path;
        this.isVideo = z;
    }
}
