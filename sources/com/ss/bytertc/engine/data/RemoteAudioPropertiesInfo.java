package com.ss.bytertc.engine.data;

import X.X1D;

/* loaded from: classes33.dex */
public class RemoteAudioPropertiesInfo {
    public AudioPropertiesInfo audioPropertiesInfo;
    public RemoteStreamKey streamKey;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RemoteAudioPropertiesInfo{user_id='");
        LIZ.append(this.streamKey.getUserId());
        LIZ.append('\'');
        LIZ.append("room_id='");
        LIZ.append(this.streamKey.getUserId());
        LIZ.append('\'');
        LIZ.append("stream_index='");
        LIZ.append(this.streamKey.getStreamIndex());
        LIZ.append('\'');
        LIZ.append("audioPropertiesInfo [");
        LIZ.append('\'');
        LIZ.append("linear_volume='");
        LIZ.append(this.audioPropertiesInfo.linearVolume);
        LIZ.append('\'');
        LIZ.append("nonlinear_volume='");
        LIZ.append(this.audioPropertiesInfo.nonlinearVolume);
        LIZ.append('\'');
        LIZ.append("]}");
        return X1D.LIZIZ(LIZ);
    }

    public RemoteAudioPropertiesInfo(RemoteStreamKey remoteStreamKey, AudioPropertiesInfo audioPropertiesInfo) {
        this.streamKey = remoteStreamKey;
        this.audioPropertiesInfo = audioPropertiesInfo;
    }

    public static RemoteAudioPropertiesInfo create(String str, String str2, int i, int i2, int i3, float[] fArr, int i4) {
        return new RemoteAudioPropertiesInfo(new RemoteStreamKey(str, str2, StreamIndex.fromId(i)), new AudioPropertiesInfo(i2, i3, fArr, i4));
    }
}
