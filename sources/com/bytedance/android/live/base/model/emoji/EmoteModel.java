package com.bytedance.android.live.base.model.emoji;

import X.C31061Ju;
import X.InterfaceC65349Pkn;
import Y.IDCreatorS45S0000000;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.base.model.ImageModel;

/* loaded from: classes.dex */
public class EmoteModel extends C31061Ju implements Parcelable {
    public static final Parcelable.Creator<EmoteModel> CREATOR = new IDCreatorS45S0000000(40);

    @InterfaceC65349Pkn("audit_status")
    public int auditStatus;

    @InterfaceC65349Pkn("content_source")
    public int contentSource;

    @InterfaceC65349Pkn("emote_id")
    public String emoteId;

    @InterfaceC65349Pkn("emote_private_type")
    public int emotePrivateType;
    public transient Drawable emoteResource;

    @InterfaceC65349Pkn("emote_type")
    public int emoteType;

    @InterfaceC65349Pkn("image")
    public ImageModel image;
    public boolean inputLimited;
    public boolean readOnly;
    public boolean shine;

    @InterfaceC65349Pkn("uuid")
    public String uuid;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public EmoteModel() {
        this.readOnly = true;
    }

    public EmoteModel(Parcel parcel) {
        boolean z;
        this.readOnly = true;
        this.emoteId = parcel.readString();
        this.image = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.auditStatus = parcel.readInt();
        this.uuid = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.readOnly = z;
        this.inputLimited = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.emoteId);
        parcel.writeParcelable(this.image, i);
        parcel.writeInt(this.auditStatus);
        parcel.writeString(this.uuid);
        parcel.writeByte(this.readOnly ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.inputLimited ? (byte) 1 : (byte) 0);
    }
}
