package com.ss.android.ugc.aweme.player.sdk.api;

import X.EnumC47177IfN;
import X.IPG;
import X.IPH;
import X.IT4;
import X.ITW;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public interface OnUIPlayListener {
    OnUIPlayListener getWrapperedListener();

    void onBufferedPercent(String str, long j, int i);

    void onBufferedTimeMs(String str, long j);

    void onBuffering(String str, boolean z);

    void onBuffering(String str, boolean z, IPH iph);

    void onBuffering(boolean z);

    void onCompleteLoaded(String str, boolean z);

    void onDecoderBuffering(String str, boolean z);

    void onDecoderBuffering(String str, boolean z, IPH iph);

    void onDecoderBuffering(boolean z);

    void onFrameAboutToBeRendered(int i, long j, long j2, Map<Integer, String> map);

    void onMaskInfoCallback(String str, ITW itw);

    void onPausePlay(String str);

    void onPausePlay(String str, IPH iph);

    void onPlayCompleted(String str);

    void onPlayCompleted(String str, int i);

    void onPlayCompletedFirstTime(String str);

    void onPlayCompletedFirstTime(String str, IPH iph);

    void onPlayFailed(IPG ipg);

    void onPlayFailed(String str, IPG ipg);

    void onPlayFailed(String str, IPG ipg, IPH iph);

    void onPlayPause(String str);

    void onPlayPrepare(String str);

    void onPlayPrepared(String str);

    void onPlayProgressChange(float f);

    void onPlayProgressChange(String str, long j, long j2);

    void onPlayRelease(String str);

    void onPlayStop(String str);

    void onPlayStop(String str, JSONObject jSONObject);

    void onPlayStop(String str, JSONObject jSONObject, IPH iph);

    void onPlayStop(String str, boolean z);

    void onPlayerInternalEvent(String str, int i, JSONObject jSONObject);

    void onPlaying(String str);

    void onPlaying(String str, IPH iph);

    void onPreRenderSessionMissed(String str);

    void onPreparePlay(String str);

    void onPreparePlay(String str, IPH iph);

    void onRenderFirstFrame(IT4 it4);

    void onRenderFirstFrame(String str, IT4 it4);

    void onRenderFirstFrameFromResume(String str);

    void onRenderReady(IPH iph);

    void onResumePlay(String str);

    void onResumePlay(String str, IPH iph);

    void onRetryOnError(IPG ipg);

    void onRetryOnError(String str, IPG ipg);

    void onSeekEnd(String str, boolean z);

    void onSeekStart(String str, int i, float f);

    void onSpeedChanged(String str, float f);

    void onVideoBitrateChanged(String str, EnumC47177IfN enumC47177IfN, int i);

    void onVideoSizeChanged(String str, int i, int i2);
}
