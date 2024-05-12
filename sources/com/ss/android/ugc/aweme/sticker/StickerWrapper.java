package com.ss.android.ugc.aweme.sticker;

import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* loaded from: classes15.dex */
public class StickerWrapper implements Parcelable {
    public static final Parcelable.Creator<StickerWrapper> CREATOR = new IDCreatorS56S0000000_14(10);
    public boolean autoDownloadFormActivity;
    public int downloadProgress;
    public boolean hasUpdated;
    public boolean isDownloaded;
    public String mCategory;
    public Effect mEffect;
    public int mState;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public StickerWrapper() {
    }

    public StickerWrapper(Parcel parcel) {
        boolean z;
        boolean z2;
        this.mEffect = (Effect) parcel.readParcelable(Effect.class.getClassLoader());
        this.mCategory = parcel.readString();
        this.mState = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isDownloaded = z;
        this.downloadProgress = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.hasUpdated = z2;
        this.autoDownloadFormActivity = parcel.readByte() != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.mEffect.equals(((StickerWrapper) obj).mEffect);
    }

    public StickerWrapper(Effect effect) {
        this.mEffect = effect;
        this.mCategory = "";
        this.mState = 3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mEffect, i);
        parcel.writeString(this.mCategory);
        parcel.writeInt(this.mState);
        parcel.writeByte(this.isDownloaded ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.downloadProgress);
        parcel.writeByte(this.hasUpdated ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.autoDownloadFormActivity ? (byte) 1 : (byte) 0);
    }
}
