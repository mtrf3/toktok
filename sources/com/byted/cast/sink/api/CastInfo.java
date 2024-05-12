package com.byted.cast.sink.api;

import X.X1D;

/* loaded from: classes29.dex */
public class CastInfo {
    public int audioSessionId;
    public int castType;
    public String clientID;
    public boolean handleInside;
    public int infoType;
    public String mediaAlbum;
    public String mediaAlbumUrl;
    public String mediaArtist;
    public String mediaTitle;
    public int mimeType;
    public int protocol;
    public int rotation;
    public SizeInfo sizeInfo;
    public int sourceDeviceType;
    public StartInfo startInfo;
    public double startPosition;
    public StopInfo stopInfo;
    public String token;
    public String url;

    /* loaded from: classes29.dex */
    public static class SizeInfo {
        public int height;
        public int width;
    }

    /* loaded from: classes29.dex */
    public static class StartInfo {
        public int bitRate;
        public int frameRate;
        public int height;
        public int type;
        public int width;
    }

    /* loaded from: classes29.dex */
    public static class StopInfo {
        public int stopDetail;
        public int stopReason;

        public StopInfo(int i, int i2) {
            this.stopReason = i;
            this.stopDetail = i2;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("StopInfo{stopReason=");
            LIZ.append(this.stopReason);
            LIZ.append(", stopDetail=");
            LIZ.append(this.stopDetail);
            LIZ.append('}');
            return X1D.LIZIZ(LIZ);
        }
    }

    public CastInfo() {
        this.handleInside = true;
        this.sourceDeviceType = -1;
    }

    public CastInfo(CastInfo castInfo) {
        this.handleInside = true;
        this.sourceDeviceType = -1;
        this.castType = castInfo.castType;
        this.protocol = castInfo.protocol;
        this.mimeType = castInfo.mimeType;
        this.rotation = castInfo.rotation;
        this.handleInside = true;
        this.clientID = castInfo.clientID;
        this.audioSessionId = castInfo.audioSessionId;
        this.infoType = castInfo.infoType;
        this.sourceDeviceType = castInfo.sourceDeviceType;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CastInfo{clientID='");
        LIZ.append(this.clientID);
        LIZ.append('\'');
        LIZ.append(", token='");
        LIZ.append(this.token);
        LIZ.append('\'');
        LIZ.append(", stopInfo=");
        LIZ.append(this.stopInfo);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }
}
