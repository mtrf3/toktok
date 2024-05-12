package com.ss.android.ugc.aweme.shortvideo.model;

/* loaded from: classes8.dex */
public final class VideoCoverConfigKt {
    public static final boolean isValid(VideoCoverConfig videoCoverConfig) {
        if (videoCoverConfig != null && videoCoverConfig.displayWidth > 0 && videoCoverConfig.displayHeight > 0) {
            return true;
        }
        return false;
    }
}
