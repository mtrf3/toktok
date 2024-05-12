package com.facebook.share.model;

import X.C66491Q7r;
import X.EnumC66492Q7s;
import X.Q88;
import Y.IDCreatorS54S0000000_11;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class SharePhoto extends ShareMedia<SharePhoto, C66491Q7r> {
    public final Bitmap bitmap;
    public final String caption;
    public final Uri imageUrl;
    public final EnumC66492Q7s mediaType;
    public final boolean userGenerated;
    public static final Q88 Companion = new Q88();
    public static final Parcelable.Creator<SharePhoto> CREATOR = new IDCreatorS54S0000000_11(42);

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareMedia
    public final EnumC66492Q7s LIZ() {
        return this.mediaType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharePhoto(Parcel parcel) {
        super(parcel);
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        this.mediaType = EnumC66492Q7s.PHOTO;
        this.bitmap = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.imageUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.userGenerated = z;
        this.caption = parcel.readString();
    }

    public SharePhoto(C66491Q7r c66491Q7r) {
        super(c66491Q7r);
        this.mediaType = EnumC66492Q7s.PHOTO;
        this.bitmap = c66491Q7r.LIZJ;
        this.imageUrl = c66491Q7r.LIZLLL;
        this.userGenerated = c66491Q7r.LJ;
        this.caption = c66491Q7r.LJFF;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        super.writeToParcel(out, i);
        out.writeParcelable(this.bitmap, 0);
        out.writeParcelable(this.imageUrl, 0);
        out.writeByte(this.userGenerated ? (byte) 1 : (byte) 0);
        out.writeString(this.caption);
    }
}
