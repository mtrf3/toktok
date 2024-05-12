package com.facebook.share.internal;

import X.C66486Q7m;
import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ShareFeedContent extends ShareContent<ShareFeedContent, Object> {
    public final String link;
    public final String linkCaption;
    public final String linkDescription;
    public final String linkName;
    public final String mediaSource;
    public final String picture;
    public final String toId;
    public static final C66486Q7m Companion = new C66486Q7m();
    public static final Parcelable.Creator<ShareFeedContent> CREATOR = new IDCreatorS54S0000000_11(29);

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareFeedContent(Parcel parcel) {
        super(parcel);
        o.LJIIIZ(parcel, "parcel");
        this.toId = parcel.readString();
        this.link = parcel.readString();
        this.linkName = parcel.readString();
        this.linkCaption = parcel.readString();
        this.linkDescription = parcel.readString();
        this.picture = parcel.readString();
        this.mediaSource = parcel.readString();
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        super.writeToParcel(out, i);
        out.writeString(this.toId);
        out.writeString(this.link);
        out.writeString(this.linkName);
        out.writeString(this.linkCaption);
        out.writeString(this.linkDescription);
        out.writeString(this.picture);
        out.writeString(this.mediaSource);
    }
}
