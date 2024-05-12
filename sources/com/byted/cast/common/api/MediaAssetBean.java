package com.byted.cast.common.api;

import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes29.dex */
public class MediaAssetBean implements Parcelable {
    public static final Parcelable.Creator<MediaAssetBean> CREATOR = new Parcelable.Creator<MediaAssetBean>() { // from class: com.byted.cast.common.api.MediaAssetBean.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MediaAssetBean createFromParcel(Parcel parcel) {
            return new MediaAssetBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MediaAssetBean[] newArray(int i) {
            return new MediaAssetBean[i];
        }
    };
    public String album;
    public String albumArtURI;
    public String artist;
    public int bitrate;
    public int commentCount;
    public String coverURL;
    public String creator;
    public String customDlnaXmlElement;
    public String danmakuURL;
    public String desc;
    public int diggCount;
    public long duration;
    public String extra;
    public String genre;
    public int height;
    public boolean isLike;
    public String lyrics;
    public String mimeType;
    public String publisher;
    public String resolution;
    public String storageMedium;
    public String title;
    public int width;
    public String writeStatus;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MediaAssetBean{title='");
        LIZ.append(this.title);
        LIZ.append('\'');
        LIZ.append(", creator='");
        LIZ.append(this.creator);
        LIZ.append('\'');
        LIZ.append(", artist='");
        LIZ.append(this.artist);
        LIZ.append('\'');
        LIZ.append(", album='");
        LIZ.append(this.album);
        LIZ.append('\'');
        LIZ.append(", albumArtURI='");
        LIZ.append(this.albumArtURI);
        LIZ.append('\'');
        LIZ.append(", storageMedium='");
        LIZ.append(this.storageMedium);
        LIZ.append('\'');
        LIZ.append(", writeStatus='");
        LIZ.append(this.writeStatus);
        LIZ.append('\'');
        LIZ.append(", genre='");
        LIZ.append(this.genre);
        LIZ.append('\'');
        LIZ.append(", publisher='");
        LIZ.append(this.publisher);
        LIZ.append('\'');
        LIZ.append(", customDlnaXmlElement='");
        LIZ.append(this.customDlnaXmlElement);
        LIZ.append('\'');
        LIZ.append(", desc='");
        LIZ.append(this.desc);
        LIZ.append('\'');
        LIZ.append(", coverURL='");
        LIZ.append(this.coverURL);
        LIZ.append('\'');
        LIZ.append(", danmakuURL='");
        LIZ.append(this.danmakuURL);
        LIZ.append('\'');
        LIZ.append(", duration=");
        LIZ.append(this.duration);
        LIZ.append(", width=");
        LIZ.append(this.width);
        LIZ.append(", height=");
        LIZ.append(this.height);
        LIZ.append(", resolution='");
        LIZ.append(this.resolution);
        LIZ.append('\'');
        LIZ.append(", mimeType='");
        LIZ.append(this.mimeType);
        LIZ.append('\'');
        LIZ.append(", bitrate=");
        LIZ.append(this.bitrate);
        LIZ.append(", isLike=");
        LIZ.append(this.isLike);
        LIZ.append(", diggCount=");
        LIZ.append(this.diggCount);
        LIZ.append(", commentCount=");
        LIZ.append(this.commentCount);
        LIZ.append(", lyrics='");
        LIZ.append(this.lyrics);
        LIZ.append('\'');
        LIZ.append(", extra='");
        LIZ.append(this.extra);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public MediaAssetBean() {
    }

    public String getAlbum() {
        return this.album;
    }

    public String getAlbumArtURI() {
        return this.albumArtURI;
    }

    public String getArtist() {
        return this.artist;
    }

    public int getBitrate() {
        return this.bitrate;
    }

    public int getCommentCount() {
        return this.commentCount;
    }

    public String getCoverURL() {
        return this.coverURL;
    }

    public String getCreator() {
        return this.creator;
    }

    public String getCustomDlnaXmlElement() {
        return this.customDlnaXmlElement;
    }

    public String getDanmakuURL() {
        return this.danmakuURL;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getDiggCount() {
        return this.diggCount;
    }

    public long getDuration() {
        return this.duration;
    }

    public String getExtra() {
        return this.extra;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getHeight() {
        return this.height;
    }

    public boolean getIsLike() {
        return this.isLike;
    }

    public String getLyrics() {
        return this.lyrics;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public String getResolution() {
        return this.resolution;
    }

    public String getStorageMedium() {
        return this.storageMedium;
    }

    public String getTitle() {
        return this.title;
    }

    public int getWidth() {
        return this.width;
    }

    public String getWriteStatus() {
        return this.writeStatus;
    }

    public MediaAssetBean(Parcel parcel) {
        boolean z;
        this.title = parcel.readString();
        this.creator = parcel.readString();
        this.artist = parcel.readString();
        this.album = parcel.readString();
        this.albumArtURI = parcel.readString();
        this.storageMedium = parcel.readString();
        this.writeStatus = parcel.readString();
        this.genre = parcel.readString();
        this.publisher = parcel.readString();
        this.customDlnaXmlElement = parcel.readString();
        this.desc = parcel.readString();
        this.coverURL = parcel.readString();
        this.danmakuURL = parcel.readString();
        this.duration = parcel.readLong();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.resolution = parcel.readString();
        this.mimeType = parcel.readString();
        this.bitrate = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isLike = z;
        this.diggCount = parcel.readInt();
        this.commentCount = parcel.readInt();
        this.lyrics = parcel.readString();
        this.extra = parcel.readString();
    }

    public void setAlbum(String str) {
        this.album = str;
    }

    public void setAlbumArtURI(String str) {
        this.albumArtURI = str;
    }

    public void setArtist(String str) {
        this.artist = str;
    }

    public void setBitrate(int i) {
        this.bitrate = i;
    }

    public void setCommentCount(int i) {
        this.commentCount = i;
    }

    public void setCoverURL(String str) {
        this.coverURL = str;
    }

    public void setCreator(String str) {
        this.creator = str;
    }

    public void setCustomDlnaXmlElement(String str) {
        this.customDlnaXmlElement = str;
    }

    public void setDanmakuURL(String str) {
        this.danmakuURL = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setDiggCount(int i) {
        this.diggCount = i;
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setGenre(String str) {
        this.genre = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setIsLike(boolean z) {
        this.isLike = z;
    }

    public void setLyrics(String str) {
        this.lyrics = str;
    }

    public void setMimeType(String str) {
        this.mimeType = str;
    }

    public void setPublisher(String str) {
        this.publisher = str;
    }

    public void setResolution(String str) {
        this.resolution = str;
    }

    public void setStorageMedium(String str) {
        this.storageMedium = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public void setWriteStatus(String str) {
        this.writeStatus = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.creator);
        parcel.writeString(this.artist);
        parcel.writeString(this.album);
        parcel.writeString(this.albumArtURI);
        parcel.writeString(this.storageMedium);
        parcel.writeString(this.writeStatus);
        parcel.writeString(this.genre);
        parcel.writeString(this.publisher);
        parcel.writeString(this.customDlnaXmlElement);
        parcel.writeString(this.desc);
        parcel.writeString(this.coverURL);
        parcel.writeString(this.danmakuURL);
        parcel.writeLong(this.duration);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeString(this.resolution);
        parcel.writeString(this.mimeType);
        parcel.writeInt(this.bitrate);
        parcel.writeByte(this.isLike ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.diggCount);
        parcel.writeInt(this.commentCount);
        parcel.writeString(this.lyrics);
        parcel.writeString(this.extra);
    }
}
