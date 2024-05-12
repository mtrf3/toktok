package com.ss.android.ugc.aweme.mediachoose.helper;

import X.C45495HtL;
import X.C77800Ug8;
import X.Q89;
import X.X1D;
import Y.IDCreatorS51S0000000_7;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public class MediaModel implements Comparable<MediaModel>, Parcelable, Cloneable {
    public static final Parcelable.Creator<MediaModel> CREATOR = new IDCreatorS51S0000000_7(6);
    public String albumClass;
    public long date;
    public long duration;
    public int endTime;
    public String extra;
    public String fileLocalUriPath;
    public String fileName;
    public long fileSize;
    public int fps;
    public int height;
    public String id;
    public C45495HtL libraryState;
    public Uri localUri;
    public String mediaSource;
    public String mimeType;
    public long modify;
    public String relativePath;
    public float speed = 1.0f;
    public int startTime;
    public String thumbnail;
    public int type;
    public String userName;
    public int width;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean LJ() {
        if (this.type == 1) {
            return true;
        }
        return false;
    }

    public final boolean LJI() {
        if (this.type == 4) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    /* renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    public final MediaModel clone() {
        return (MediaModel) super.clone();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MediaModel{id=");
        LIZ.append(this.id);
        LIZ.append(", filePath='");
        Q89.LIZIZ(LIZ, this.fileLocalUriPath, '\'', ", date=");
        LIZ.append(this.date);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", duration=");
        LIZ.append(this.duration);
        LIZ.append(", fileSize=");
        LIZ.append(this.fileSize);
        LIZ.append(", mimeType='");
        Q89.LIZIZ(LIZ, this.mimeType, '\'', ", thumbnail='");
        Q89.LIZIZ(LIZ, this.thumbnail, '\'', ", width=");
        LIZ.append(this.width);
        LIZ.append(", height=");
        LIZ.append(this.height);
        LIZ.append(", fps=");
        LIZ.append(this.fps);
        LIZ.append(", modify=");
        LIZ.append(this.modify);
        LIZ.append(", userName=");
        LIZ.append(this.userName);
        LIZ.append(", libraryState=");
        LIZ.append(this.libraryState);
        LIZ.append(", mediaSource=");
        LIZ.append(this.mediaSource);
        LIZ.append(", startTime=");
        LIZ.append(this.startTime);
        LIZ.append(", endTime=");
        LIZ.append(this.endTime);
        LIZ.append(", speed=");
        LIZ.append(this.speed);
        LIZ.append(", extra='");
        return C77800Ug8.LIZJ(LIZ, this.extra, '\'', '}', LIZ);
    }

    public MediaModel(Parcel parcel) {
        this.id = parcel.readString();
        this.fileLocalUriPath = parcel.readString();
        this.relativePath = parcel.readString();
        this.fileName = parcel.readString();
        this.albumClass = parcel.readString();
        this.date = parcel.readLong();
        this.type = parcel.readInt();
        this.duration = parcel.readLong();
        this.fileSize = parcel.readLong();
        this.mimeType = parcel.readString();
        this.thumbnail = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.fps = parcel.readInt();
        this.userName = parcel.readString();
        this.libraryState = (C45495HtL) parcel.readSerializable();
        this.mediaSource = parcel.readString();
        this.startTime = parcel.readInt();
        this.endTime = parcel.readInt();
        this.extra = parcel.readString();
    }

    @Override // java.lang.Comparable
    public final int compareTo(MediaModel mediaModel) {
        long j = this.date;
        long j2 = mediaModel.date;
        if (j > j2) {
            return -1;
        }
        if (j < j2) {
            return 1;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaModel)) {
            return false;
        }
        return ((MediaModel) obj).id.equals(this.id);
    }

    public MediaModel(long j) {
        this.id = String.valueOf(j);
    }

    public MediaModel(String str) {
        this.id = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.fileLocalUriPath);
        parcel.writeString(this.relativePath);
        parcel.writeString(this.fileName);
        parcel.writeString(this.albumClass);
        parcel.writeLong(this.date);
        parcel.writeInt(this.type);
        parcel.writeLong(this.duration);
        parcel.writeLong(this.fileSize);
        parcel.writeString(this.mimeType);
        parcel.writeString(this.thumbnail);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.fps);
        parcel.writeString(this.userName);
        parcel.writeSerializable(this.libraryState);
        parcel.writeString(this.mediaSource);
        parcel.writeInt(this.startTime);
        parcel.writeInt(this.endTime);
        parcel.writeString(this.extra);
    }
}
