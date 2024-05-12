package com.byted.cast.common.sink;

import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.byted.cast.common.api.MediaAssetBean;

/* loaded from: classes29.dex */
public class CastInfo implements Parcelable {
    public static final Parcelable.Creator<CastInfo> CREATOR = new Parcelable.Creator<CastInfo>() { // from class: com.byted.cast.common.sink.CastInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CastInfo createFromParcel(Parcel parcel) {
            return new CastInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CastInfo[] newArray(int i) {
            return new CastInfo[i];
        }
    };
    public String aesIV;
    public String aesKey;
    public int audioSessionId;
    public int castType;
    public String clientID;
    public ClientInfo clientInfo;
    public String connectID;
    public String danmaku;
    public String extra;
    public boolean handleInside;
    public String header;
    public int infoType;
    public String key;
    public String localPath;
    public String loopMode;
    public String mediaAlbum;
    public String mediaAlbumUrl;
    public String mediaArtist;
    public MediaAssetBean mediaAssetBean;
    public String mediaTitle;
    public int mimeType;
    public int protocol;
    public SizeInfo sizeInfo;
    public int sourceDeviceType;
    public String speed;
    public StartInfo startInfo;
    public long startPosition;
    public StopInfo stopInfo;
    public String url;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* loaded from: classes29.dex */
    public static class SizeInfo implements Parcelable {
        public static final Parcelable.Creator<SizeInfo> CREATOR = new Parcelable.Creator<SizeInfo>() { // from class: com.byted.cast.common.sink.CastInfo.SizeInfo.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SizeInfo createFromParcel(Parcel parcel) {
                return new SizeInfo(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SizeInfo[] newArray(int i) {
                return new SizeInfo[i];
            }
        };
        public int height;
        public int width;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SizeInfo{width=");
            LIZ.append(this.width);
            LIZ.append(", height=");
            LIZ.append(this.height);
            LIZ.append('}');
            return X1D.LIZIZ(LIZ);
        }

        public SizeInfo() {
        }

        public SizeInfo(Parcel parcel) {
            this.width = parcel.readInt();
            this.height = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.width);
            parcel.writeInt(this.height);
        }
    }

    /* loaded from: classes29.dex */
    public static class StartInfo implements Parcelable {
        public static final Parcelable.Creator<StartInfo> CREATOR = new Parcelable.Creator<StartInfo>() { // from class: com.byted.cast.common.sink.CastInfo.StartInfo.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public StartInfo createFromParcel(Parcel parcel) {
                return new StartInfo(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public StartInfo[] newArray(int i) {
                return new StartInfo[i];
            }
        };
        public int bitRate;
        public int frameRate;
        public int height;
        public int type;
        public int width;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("StartInfo{width=");
            LIZ.append(this.width);
            LIZ.append(", height=");
            LIZ.append(this.height);
            LIZ.append(", frameRate=");
            LIZ.append(this.frameRate);
            LIZ.append(", bitRate=");
            LIZ.append(this.bitRate);
            LIZ.append(", type=");
            LIZ.append(this.type);
            LIZ.append('}');
            return X1D.LIZIZ(LIZ);
        }

        public StartInfo() {
        }

        public StartInfo(Parcel parcel) {
            this.width = parcel.readInt();
            this.height = parcel.readInt();
            this.frameRate = parcel.readInt();
            this.bitRate = parcel.readInt();
            this.type = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.width);
            parcel.writeInt(this.height);
            parcel.writeInt(this.frameRate);
            parcel.writeInt(this.bitRate);
            parcel.writeInt(this.type);
        }
    }

    /* loaded from: classes29.dex */
    public static class StopInfo implements Parcelable {
        public static final Parcelable.Creator<StopInfo> CREATOR = new Parcelable.Creator<StopInfo>() { // from class: com.byted.cast.common.sink.CastInfo.StopInfo.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public StopInfo createFromParcel(Parcel parcel) {
                return new StopInfo(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public StopInfo[] newArray(int i) {
                return new StopInfo[i];
            }
        };
        public int stopDetail;
        public int stopReason;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("StopInfo{stopReason=");
            LIZ.append(this.stopReason);
            LIZ.append(", stopDetail=");
            LIZ.append(this.stopDetail);
            LIZ.append("}");
            return X1D.LIZIZ(LIZ);
        }

        public StopInfo() {
        }

        public StopInfo(Parcel parcel) {
            this.stopReason = parcel.readInt();
            this.stopDetail = parcel.readInt();
        }

        public StopInfo(int i, int i2) {
            this.stopReason = i;
            this.stopDetail = i2;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.stopReason);
            parcel.writeInt(this.stopDetail);
        }
    }

    public CastInfo() {
        this.handleInside = true;
        this.sourceDeviceType = -1;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CastInfo{key='");
        LIZ.append(this.key);
        LIZ.append('\'');
        LIZ.append(", url='");
        LIZ.append(this.url);
        LIZ.append('\'');
        LIZ.append(", castType=");
        LIZ.append(this.castType);
        LIZ.append(", protocol=");
        LIZ.append(this.protocol);
        LIZ.append(", mimeType=");
        LIZ.append(this.mimeType);
        LIZ.append(", handleInside=");
        LIZ.append(this.handleInside);
        LIZ.append(", startPosition=");
        LIZ.append(this.startPosition);
        LIZ.append(", clientID='");
        LIZ.append(this.clientID);
        LIZ.append('\'');
        LIZ.append(", connectID='");
        LIZ.append(this.connectID);
        LIZ.append('\'');
        LIZ.append(", mediaTitle='");
        LIZ.append(this.mediaTitle);
        LIZ.append('\'');
        LIZ.append(", mediaArtist='");
        LIZ.append(this.mediaArtist);
        LIZ.append('\'');
        LIZ.append(", mediaAlbum='");
        LIZ.append(this.mediaAlbum);
        LIZ.append('\'');
        LIZ.append(", mediaAlbumUrl='");
        LIZ.append(this.mediaAlbumUrl);
        LIZ.append('\'');
        LIZ.append(", mediaAssetBean=");
        LIZ.append(this.mediaAssetBean);
        LIZ.append(", audioSessionId=");
        LIZ.append(this.audioSessionId);
        LIZ.append(", infoType=");
        LIZ.append(this.infoType);
        LIZ.append(", sourceDeviceType=");
        LIZ.append(this.sourceDeviceType);
        LIZ.append(", header='");
        LIZ.append(this.header);
        LIZ.append('\'');
        LIZ.append(", aesKey='");
        LIZ.append(this.aesKey);
        LIZ.append('\'');
        LIZ.append(", aesIV='");
        LIZ.append(this.aesIV);
        LIZ.append('\'');
        LIZ.append(", startInfo=");
        LIZ.append(this.startInfo);
        LIZ.append(", stopInfo=");
        LIZ.append(this.stopInfo);
        LIZ.append(", sizeInfo=");
        LIZ.append(this.sizeInfo);
        LIZ.append(", clientInfo=");
        LIZ.append(this.clientInfo);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public CastInfo(Parcel parcel) {
        this.handleInside = true;
        this.sourceDeviceType = -1;
        this.key = parcel.readString();
        this.url = parcel.readString();
        this.castType = parcel.readInt();
        this.protocol = parcel.readInt();
        this.mimeType = parcel.readInt();
        this.handleInside = parcel.readByte() != 0;
        this.startPosition = parcel.readLong();
        this.clientID = parcel.readString();
        this.connectID = parcel.readString();
        this.mediaTitle = parcel.readString();
        this.mediaArtist = parcel.readString();
        this.mediaAlbum = parcel.readString();
        this.mediaAlbumUrl = parcel.readString();
        this.mediaAssetBean = (MediaAssetBean) parcel.readParcelable(MediaAssetBean.class.getClassLoader());
        this.audioSessionId = parcel.readInt();
        this.infoType = parcel.readInt();
        this.sourceDeviceType = parcel.readInt();
        this.header = parcel.readString();
        this.aesKey = parcel.readString();
        this.aesIV = parcel.readString();
        this.startInfo = (StartInfo) parcel.readParcelable(StartInfo.class.getClassLoader());
        this.stopInfo = (StopInfo) parcel.readParcelable(StopInfo.class.getClassLoader());
        this.sizeInfo = (SizeInfo) parcel.readParcelable(SizeInfo.class.getClassLoader());
    }

    public CastInfo(CastInfo castInfo) {
        this.handleInside = true;
        this.sourceDeviceType = -1;
        this.key = castInfo.key;
        this.url = castInfo.url;
        this.castType = castInfo.castType;
        this.protocol = castInfo.protocol;
        this.mimeType = castInfo.mimeType;
        this.handleInside = castInfo.handleInside;
        this.mediaAssetBean = castInfo.mediaAssetBean;
        this.startPosition = castInfo.startPosition;
        this.clientID = castInfo.clientID;
        this.mediaTitle = castInfo.mediaTitle;
        this.mediaArtist = castInfo.mediaArtist;
        this.mediaAlbum = castInfo.mediaAlbum;
        this.mediaAlbumUrl = castInfo.mediaAlbumUrl;
        this.audioSessionId = castInfo.audioSessionId;
        this.infoType = castInfo.infoType;
        this.sourceDeviceType = castInfo.sourceDeviceType;
        this.header = castInfo.header;
        this.aesKey = castInfo.aesKey;
        this.aesIV = castInfo.aesIV;
        this.speed = castInfo.speed;
        this.danmaku = castInfo.danmaku;
        this.localPath = castInfo.localPath;
        this.loopMode = castInfo.loopMode;
        this.extra = castInfo.extra;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.key);
        parcel.writeString(this.url);
        parcel.writeInt(this.castType);
        parcel.writeInt(this.protocol);
        parcel.writeInt(this.mimeType);
        parcel.writeByte(this.handleInside ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.startPosition);
        parcel.writeString(this.clientID);
        parcel.writeString(this.connectID);
        parcel.writeString(this.mediaTitle);
        parcel.writeString(this.mediaArtist);
        parcel.writeString(this.mediaAlbum);
        parcel.writeString(this.mediaAlbumUrl);
        parcel.writeParcelable(this.mediaAssetBean, i);
        parcel.writeInt(this.audioSessionId);
        parcel.writeInt(this.infoType);
        parcel.writeInt(this.sourceDeviceType);
        parcel.writeString(this.header);
        parcel.writeString(this.aesKey);
        parcel.writeString(this.aesIV);
        parcel.writeParcelable(this.startInfo, i);
        parcel.writeParcelable(this.stopInfo, i);
        parcel.writeParcelable(this.sizeInfo, i);
    }
}
