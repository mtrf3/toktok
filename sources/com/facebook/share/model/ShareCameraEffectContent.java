package com.facebook.share.model;

import X.Q8P;
import X.Q8Q;
import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes12.dex */
public class ShareCameraEffectContent extends ShareContent<ShareCameraEffectContent, Object> {
    public static final Parcelable.Creator<ShareCameraEffectContent> CREATOR = new IDCreatorS54S0000000_11(34);
    public CameraEffectArguments arguments;
    public String effectId;
    public CameraEffectTextures textures;

    public ShareCameraEffectContent(Parcel parcel) {
        super(parcel);
        this.effectId = parcel.readString();
        Q8P q8p = new Q8P();
        CameraEffectArguments cameraEffectArguments = (CameraEffectArguments) parcel.readParcelable(CameraEffectArguments.class.getClassLoader());
        if (cameraEffectArguments != null) {
            q8p.LIZ.putAll(cameraEffectArguments.params);
        }
        this.arguments = new CameraEffectArguments(q8p);
        Q8Q q8q = new Q8Q();
        CameraEffectTextures cameraEffectTextures = (CameraEffectTextures) parcel.readParcelable(CameraEffectTextures.class.getClassLoader());
        if (cameraEffectTextures != null) {
            q8q.LIZ.putAll(cameraEffectTextures.textures);
        }
        this.textures = new CameraEffectTextures(q8q);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.effectId);
        parcel.writeParcelable(this.arguments, 0);
        parcel.writeParcelable(this.textures, 0);
    }
}
