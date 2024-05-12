package com.facebook.share.model;

import android.os.Parcel;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public abstract class ShareMessengerActionButton implements ShareModel {
    public final String title;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ShareMessengerActionButton(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        this.title = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        o.LJIIIZ(dest, "dest");
        dest.writeString(this.title);
    }
}
