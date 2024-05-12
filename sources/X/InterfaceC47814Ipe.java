package X;

import android.view.Surface;
import com.ss.texturerender.VideoSurface;
import com.ss.ttvideoengine.TTVideoEngine;

/* renamed from: X.Ipe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC47814Ipe {
    void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i);

    void onCompletion(TTVideoEngine tTVideoEngine);

    void onError(C47789IpF c47789IpF);

    void onFirstAVSyncFrame(TTVideoEngine tTVideoEngine);

    void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i);

    void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i);

    void onPrepare(TTVideoEngine tTVideoEngine);

    void onPrepared(TTVideoEngine tTVideoEngine);

    void onRefreshSurface(TTVideoEngine tTVideoEngine);

    void onRenderStart(TTVideoEngine tTVideoEngine);

    int onSetSurface(TTVideoEngine tTVideoEngine, VideoSurface videoSurface, Surface surface);

    void onStreamChanged(TTVideoEngine tTVideoEngine, int i);

    void onVideoSecondFrame(TTVideoEngine tTVideoEngine);

    void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2);

    void onVideoStatusException(int i);
}
