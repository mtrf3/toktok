package com.facebook.share.model;

import X.Q83;
import X.Q87;
import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ShareLinkContent extends ShareContent<ShareLinkContent, Q83> {
    public final String quote;
    public static final Q87 Companion = new Q87();
    public static final Parcelable.Creator<ShareLinkContent> CREATOR = new IDCreatorS54S0000000_11(36);

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareLinkContent(Parcel source) {
        super(source);
        o.LJIIIZ(source, "source");
        this.quote = source.readString();
    }

    public ShareLinkContent(Q83 q83) {
        super(q83);
        this.quote = q83.LJI;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        super.writeToParcel(out, i);
        out.writeString(this.quote);
    }
}
