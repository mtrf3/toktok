package com.facebook.share.model;

import X.Q8O;
import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes12.dex */
public final class ShareOpenGraphContent extends ShareContent<ShareOpenGraphContent, Object> {
    public static final Parcelable.Creator<ShareOpenGraphContent> CREATOR = new IDCreatorS54S0000000_11(40);
    public final ShareOpenGraphAction action;
    public final String previewPropertyName;

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ShareOpenGraphContent(Parcel parcel) {
        super(parcel);
        Q8O q8o = new Q8O();
        ShareOpenGraphValueContainer shareOpenGraphValueContainer = (ShareOpenGraphValueContainer) parcel.readParcelable(ShareOpenGraphAction.class.getClassLoader());
        if (shareOpenGraphValueContainer != null) {
            q8o.LIZ.putAll(shareOpenGraphValueContainer.LIZIZ());
            q8o.LIZ.putString("og:type", shareOpenGraphValueContainer.LIZLLL());
        }
        this.action = new ShareOpenGraphAction(q8o);
        this.previewPropertyName = parcel.readString();
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.action, 0);
        parcel.writeString(this.previewPropertyName);
    }
}
