package com.facebook.share.model;

import X.C66491Q7r;
import X.Q80;
import X.Q81;
import X.Q8B;
import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ShareVideoContent extends ShareContent<ShareVideoContent, Q81> {
    public final String contentDescription;
    public final String contentTitle;
    public final SharePhoto previewPhoto;
    public final ShareVideo video;
    public static final Q8B Companion = new Q8B();
    public static final Parcelable.Creator<ShareVideoContent> CREATOR = new IDCreatorS54S0000000_11(46);

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareVideoContent(Parcel parcel) {
        super(parcel);
        SharePhoto sharePhoto;
        o.LJIIIZ(parcel, "parcel");
        this.contentDescription = parcel.readString();
        this.contentTitle = parcel.readString();
        C66491Q7r c66491Q7r = new C66491Q7r();
        c66491Q7r.LIZ((SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader()));
        if (c66491Q7r.LIZLLL != null || c66491Q7r.LIZJ != null) {
            sharePhoto = new SharePhoto(c66491Q7r);
        } else {
            sharePhoto = null;
        }
        this.previewPhoto = sharePhoto;
        Q80 q80 = new Q80();
        ShareVideo shareVideo = (ShareVideo) parcel.readParcelable(ShareVideo.class.getClassLoader());
        if (shareVideo != null) {
            q80.LIZJ = shareVideo.localUrl;
        }
        this.video = new ShareVideo(q80);
    }

    public ShareVideoContent(Q81 q81) {
        super(q81);
        this.contentDescription = null;
        this.contentTitle = null;
        this.previewPhoto = null;
        this.video = q81.LJI;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        super.writeToParcel(out, i);
        out.writeString(this.contentDescription);
        out.writeString(this.contentTitle);
        out.writeParcelable(this.previewPhoto, 0);
        out.writeParcelable(this.video, 0);
    }
}
