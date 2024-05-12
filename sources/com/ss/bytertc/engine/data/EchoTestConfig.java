package com.ss.bytertc.engine.data;

import X.X1D;
import android.view.View;

/* loaded from: classes33.dex */
public class EchoTestConfig {
    public int audioReportInterval;
    public boolean enableAudio;
    public boolean enableVideo;
    public String roomId;
    public String token;
    public String uid;
    public View view;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EchoTestConfig{view='");
        LIZ.append(this.view);
        LIZ.append('\'');
        LIZ.append("uid='");
        LIZ.append(this.uid);
        LIZ.append('\'');
        LIZ.append(", roomId='");
        LIZ.append(this.roomId);
        LIZ.append('\'');
        LIZ.append(", token='");
        LIZ.append(this.token);
        LIZ.append('\'');
        LIZ.append(", enableAudio='");
        LIZ.append(this.enableAudio);
        LIZ.append('\'');
        LIZ.append(", enableVideo='");
        LIZ.append(this.enableVideo);
        LIZ.append('\'');
        LIZ.append(", audioReportInterval='");
        LIZ.append(this.audioReportInterval);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public int getAudioReportInterval() {
        return this.audioReportInterval;
    }

    public boolean getEchoEnabledAudio() {
        return this.enableAudio;
    }

    public boolean getEchoEnabledVideo() {
        return this.enableVideo;
    }

    public View getEchoRenderView() {
        return this.view;
    }

    public String getEchoRoomId() {
        return this.roomId;
    }

    public String getEchoToken() {
        return this.token;
    }

    public String getEchoUid() {
        return this.uid;
    }

    public EchoTestConfig(View view, String str, String str2, String str3, boolean z, boolean z2, int i) {
        this.view = view;
        this.uid = str;
        this.roomId = str2;
        this.token = str3;
        this.enableAudio = z;
        this.enableVideo = z2;
        this.audioReportInterval = i;
    }
}
