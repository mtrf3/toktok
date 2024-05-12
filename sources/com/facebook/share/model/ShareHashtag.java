package com.facebook.share.model;

import X.C66485Q7l;
import X.C66487Q7n;
import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ShareHashtag implements ShareModel {
    public final String hashtag;
    public static final C66487Q7n Companion = new C66487Q7n();
    public static final Parcelable.Creator<ShareHashtag> CREATOR = new IDCreatorS54S0000000_11(35);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ShareHashtag(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        this.hashtag = parcel.readString();
    }

    public ShareHashtag(C66485Q7l c66485Q7l) {
        this.hashtag = c66485Q7l.LIZ;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        o.LJIIIZ(dest, "dest");
        dest.writeString(this.hashtag);
    }
}
