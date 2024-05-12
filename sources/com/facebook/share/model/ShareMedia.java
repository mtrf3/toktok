package com.facebook.share.model;

import X.AbstractC66499Q7z;
import X.EnumC66492Q7s;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.share.model.ShareMedia;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public abstract class ShareMedia<M extends ShareMedia<M, B>, B extends AbstractC66499Q7z<M, B>> implements ShareModel {
    public final Bundle params;

    public abstract EnumC66492Q7s LIZ();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ShareMedia(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.params = readBundle == null ? new Bundle() : readBundle;
    }

    public ShareMedia(AbstractC66499Q7z<M, B> builder) {
        o.LJIIIZ(builder, "builder");
        this.params = new Bundle(builder.LIZ);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        o.LJIIIZ(dest, "dest");
        dest.writeBundle(this.params);
    }
}
