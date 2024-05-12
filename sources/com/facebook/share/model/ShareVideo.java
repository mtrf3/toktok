package com.facebook.share.model;

import X.EnumC66492Q7s;
import X.Q80;
import X.Q8A;
import Y.IDCreatorS54S0000000_11;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ShareVideo extends ShareMedia<ShareVideo, Q80> {
    public final Uri localUrl;
    public final EnumC66492Q7s mediaType;
    public static final Q8A Companion = new Q8A();
    public static final Parcelable.Creator<ShareVideo> CREATOR = new IDCreatorS54S0000000_11(45);

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareMedia
    public final EnumC66492Q7s LIZ() {
        return this.mediaType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareVideo(Parcel parcel) {
        super(parcel);
        o.LJIIIZ(parcel, "parcel");
        this.mediaType = EnumC66492Q7s.VIDEO;
        this.localUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }

    public ShareVideo(Q80 q80) {
        super(q80);
        this.mediaType = EnumC66492Q7s.VIDEO;
        this.localUrl = q80.LIZJ;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        super.writeToParcel(out, i);
        out.writeParcelable(this.localUrl, 0);
    }
}
