package com.ss.bytertc.engine.handler;

import com.ss.bytertc.engine.IMediaPlayerEventHandler;
import com.ss.bytertc.engine.data.PlayerError;
import com.ss.bytertc.engine.data.PlayerState;

/* loaded from: classes33.dex */
public class RTCMediaPlayerEventHandler {
    public IMediaPlayerEventHandler mMediaPlayerHandler;

    public void setMediaPlayerEventHandler(IMediaPlayerEventHandler iMediaPlayerEventHandler) {
        this.mMediaPlayerHandler = iMediaPlayerEventHandler;
    }

    public void onMediaPlayerPlayingProgress(int i, long j) {
        IMediaPlayerEventHandler iMediaPlayerEventHandler = this.mMediaPlayerHandler;
        if (iMediaPlayerEventHandler != null) {
            iMediaPlayerEventHandler.onMediaPlayerPlayingProgress(i, j);
        }
    }

    public void onMediaPlayerStateChanged(int i, PlayerState playerState, PlayerError playerError) {
        IMediaPlayerEventHandler iMediaPlayerEventHandler = this.mMediaPlayerHandler;
        if (iMediaPlayerEventHandler != null) {
            iMediaPlayerEventHandler.onMediaPlayerStateChanged(i, playerState, playerError);
        }
    }
}
