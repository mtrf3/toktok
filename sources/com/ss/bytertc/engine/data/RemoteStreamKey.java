package com.ss.bytertc.engine.data;

import X.X1D;

/* loaded from: classes33.dex */
public class RemoteStreamKey {
    public String roomId;
    public StreamIndex streamIndex;
    public String userId;

    public boolean hasNullProperty() {
        if (this.roomId == null || this.userId == null || this.streamIndex == null) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RemoteStreamKey{roomId='");
        LIZ.append(this.roomId);
        LIZ.append('\'');
        LIZ.append(", userId='");
        LIZ.append(this.userId);
        LIZ.append('\'');
        LIZ.append(", streamIndex=");
        LIZ.append(this.streamIndex);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public String getRoomId() {
        return this.roomId;
    }

    public StreamIndex getStreamIndex() {
        return this.streamIndex;
    }

    public String getUserId() {
        return this.userId;
    }

    public RemoteStreamKey(String str, String str2, StreamIndex streamIndex) {
        this.roomId = str;
        this.userId = str2;
        this.streamIndex = streamIndex;
    }
}
