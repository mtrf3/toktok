package com.facebook.share.model;

import X.C66500Q8a;
import X.EnumC48390Iyw;
import Y.IDCreatorS54S0000000_11;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ShareMessengerURLActionButton extends ShareMessengerActionButton {
    public final Uri fallbackUrl;
    public final boolean isMessengerExtensionURL;
    public final boolean shouldHideWebviewShareButton;
    public final Uri url;
    public final EnumC48390Iyw webviewHeightRatio;
    public static final C66500Q8a Companion = new C66500Q8a();
    public static final Parcelable.Creator<ShareMessengerURLActionButton> CREATOR = new IDCreatorS54S0000000_11(38);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareMessengerURLActionButton(Parcel parcel) {
        super(parcel);
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        this.url = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isMessengerExtensionURL = z;
        this.fallbackUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.webviewHeightRatio = (EnumC48390Iyw) parcel.readSerializable();
        this.shouldHideWebviewShareButton = parcel.readByte() != 0;
    }

    @Override // com.facebook.share.model.ShareMessengerActionButton, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        o.LJIIIZ(dest, "dest");
        super.writeToParcel(dest, i);
        dest.writeParcelable(this.url, 0);
        dest.writeByte(this.isMessengerExtensionURL ? (byte) 1 : (byte) 0);
        dest.writeParcelable(this.fallbackUrl, 0);
        dest.writeSerializable(this.webviewHeightRatio);
        dest.writeByte(this.isMessengerExtensionURL ? (byte) 1 : (byte) 0);
    }
}
