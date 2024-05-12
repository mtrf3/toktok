package X;

import android.view.Surface;
import com.ss.texturerender.VideoSurface;
import com.ss.ttvideoengine.TTVideoEngine;

/* renamed from: X.IpD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC47787IpD {
    void onABRPredictBitrate(int i, int i2);

    void onAVBadInterlaced(java.util.Map map);

    void onBufferEnd(int i);

    void onBufferStart(int i, int i2, int i3);

    void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i);

    void onCompletion(TTVideoEngine tTVideoEngine);

    void onCurrentPlaybackTimeUpdate(TTVideoEngine tTVideoEngine, int i);

    void onError(C47789IpF c47789IpF);

    void onFirstAVSyncFrame(TTVideoEngine tTVideoEngine);

    void onFrameAboutToBeRendered(TTVideoEngine tTVideoEngine, int i, long j, long j2, java.util.Map<Integer, String> map);

    void onFrameDraw(int i, java.util.Map map);

    void onInfoIdChanged(int i);

    void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i);

    void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i);

    void onPrepare(TTVideoEngine tTVideoEngine);

    void onPrepared(TTVideoEngine tTVideoEngine);

    void onReadyForDisplay(TTVideoEngine tTVideoEngine);

    void onRefreshSurface(TTVideoEngine tTVideoEngine);

    void onRenderStart(TTVideoEngine tTVideoEngine);

    void onSARChanged(int i, int i2);

    int onSetSurface(TTVideoEngine tTVideoEngine, VideoSurface videoSurface, Surface surface);

    void onStreamChanged(TTVideoEngine tTVideoEngine, int i);

    void onVideoSecondFrame(TTVideoEngine tTVideoEngine);

    void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2);

    void onVideoStatusException(int i);

    void onVideoStreamBitrateChanged(EnumC47176IfM enumC47176IfM, int i);

    void onVideoURLRouteFailed(C47789IpF c47789IpF, String str);
}
