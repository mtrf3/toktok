package com.ss.android.ugc.aweme.services.external.ui;

import X.C43588H8u;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ChangeBanMusicConfig {
    public final String creationId;
    public final String mp4Path;
    public final String originVideo;
    public String outputDir;
    public int videoHeight;
    public int videoWidth;
    public final String voicePath;
    public final String wavPath;

    public final String getOutputDir() {
        String str = this.outputDir;
        if (str != null) {
            return str;
        }
        o.LJIJI("outputDir");
        throw null;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final String getMp4Path() {
        return this.mp4Path;
    }

    public final String getOriginVideo() {
        return this.originVideo;
    }

    public final int getVideoHeight() {
        return this.videoHeight;
    }

    public final int getVideoWidth() {
        return this.videoWidth;
    }

    public final String getVoicePath() {
        return this.voicePath;
    }

    public final String getWavPath() {
        return this.wavPath;
    }

    public final void setOutputDir(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.outputDir = str;
    }

    public final void setVideoHeight(int i) {
        this.videoHeight = i;
    }

    public final void setVideoWidth(int i) {
        this.videoWidth = i;
    }

    public ChangeBanMusicConfig(String str, String str2, String str3, String str4, String str5) {
        C43588H8u.LIZLLL(str, "originVideo", str2, "mp4Path", str3, "wavPath", str5, "creationId");
        this.originVideo = str;
        this.mp4Path = str2;
        this.wavPath = str3;
        this.voicePath = str4;
        this.creationId = str5;
    }
}
