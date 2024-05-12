package bytedance.io;

import X.Q89;
import X.X1D;
import Y.IDCreatorS45S0000000;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;

/* loaded from: classes.dex */
public class BdMediaItem implements Parcelable {
    public static final Parcelable.Creator<BdMediaItem> CREATOR = new IDCreatorS45S0000000(35);
    public String album;
    public long albumId;
    public String artist;
    public long bucketId;
    public String bucketName;
    public long dateAdded;
    public long dateToken;
    public long duration;
    public long fileSize;
    public int height;
    public long id;
    public String mimeType;
    public long modify;
    public int musicType;
    public String name;
    public int orientation;
    public String relativePath;
    public String resolution;
    public String title;
    public Uri uri;
    public int width;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BdMediaItem{id=");
        LIZ.append(this.id);
        LIZ.append(", name='");
        Q89.LIZIZ(LIZ, this.name, '\'', ", modify=");
        LIZ.append(this.modify);
        LIZ.append(", dateAdded=");
        LIZ.append(this.dateAdded);
        LIZ.append(", mimeType='");
        Q89.LIZIZ(LIZ, this.mimeType, '\'', ", duration=");
        LIZ.append(this.duration);
        LIZ.append(", fileSize=");
        LIZ.append(this.fileSize);
        LIZ.append(", width=");
        LIZ.append(this.width);
        LIZ.append(", height=");
        LIZ.append(this.height);
        LIZ.append(", musicType=");
        LIZ.append(this.musicType);
        LIZ.append(", uri=");
        LIZ.append(this.uri);
        LIZ.append(", relativePath='");
        Q89.LIZIZ(LIZ, this.relativePath, '\'', ", dateToken=");
        LIZ.append(this.dateToken);
        LIZ.append(", orientation=");
        LIZ.append(this.orientation);
        LIZ.append(", resolution='");
        Q89.LIZIZ(LIZ, this.resolution, '\'', ", album='");
        Q89.LIZIZ(LIZ, this.album, '\'', ", artist='");
        Q89.LIZIZ(LIZ, this.artist, '\'', ", title='");
        Q89.LIZIZ(LIZ, this.title, '\'', ", albumId=");
        LIZ.append(this.albumId);
        LIZ.append(", bucketId=");
        LIZ.append(this.bucketId);
        LIZ.append(", bucketName=");
        return q.LIZIZ(LIZ, this.bucketName, '}', LIZ);
    }

    public BdMediaItem() {
    }

    public BdMediaItem(Parcel parcel) {
        this.id = parcel.readLong();
        this.name = parcel.readString();
        this.modify = parcel.readLong();
        this.dateAdded = parcel.readLong();
        this.mimeType = parcel.readString();
        this.duration = parcel.readLong();
        this.fileSize = parcel.readLong();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.musicType = parcel.readInt();
        this.uri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.relativePath = parcel.readString();
        this.dateToken = parcel.readLong();
        this.orientation = parcel.readInt();
        this.resolution = parcel.readString();
        this.album = parcel.readString();
        this.artist = parcel.readString();
        this.title = parcel.readString();
        this.albumId = parcel.readLong();
        this.bucketId = parcel.readLong();
        this.bucketName = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
        parcel.writeString(this.name);
        parcel.writeLong(this.modify);
        parcel.writeLong(this.dateAdded);
        parcel.writeString(this.mimeType);
        parcel.writeLong(this.duration);
        parcel.writeLong(this.fileSize);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.musicType);
        parcel.writeParcelable(this.uri, i);
        parcel.writeString(this.relativePath);
        parcel.writeLong(this.dateToken);
        parcel.writeInt(this.orientation);
        parcel.writeString(this.resolution);
        parcel.writeString(this.album);
        parcel.writeString(this.artist);
        parcel.writeString(this.title);
        parcel.writeLong(this.albumId);
        parcel.writeLong(this.bucketId);
        parcel.writeString(this.bucketName);
    }
}
