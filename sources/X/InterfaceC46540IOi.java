package X;

import com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener;
import org.json.JSONObject;

/* renamed from: X.IOi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC46540IOi extends OnPreRenderListener {
    void onBufferedPercent(String str, long j, int i);

    void onBufferedTimeMs(String str, long j);

    void onBuffering(String str, boolean z);

    void onBuffering(boolean z);

    void onCompleteLoaded(String str, boolean z);

    void onDecoderBuffering(String str, boolean z);

    void onDecoderBuffering(boolean z);

    void onPausePlay(String str);

    void onPlayCompleted(String str);

    void onPlayCompleted(String str, int i);

    void onPlayCompletedFirstTime(String str);

    void onPlayFailed(IPG ipg);

    void onPlayFailed(String str, IPG ipg);

    void onPlayPause(String str);

    void onPlayPrepare(String str);

    void onPlayProgressChange(float f);

    void onPlayProgressChange(String str, long j, long j2);

    void onPlayRelease(String str);

    void onPlayStop(String str);

    void onPlayStop(String str, JSONObject jSONObject);

    void onPlayerInternalEvent(String str, int i, JSONObject jSONObject);

    void onPlaying(String str);

    void onPreparePlay(String str);

    void onRenderFirstFrame(IT4 it4);

    void onRenderFirstFrame(String str, IT4 it4);

    void onRenderFirstFrameFromResume(String str);

    void onRenderReady(IPH iph);

    void onResumePlay(String str);

    void onRetryOnError(IPG ipg);

    void onRetryOnError(String str, IPG ipg);

    void onSeekEnd(String str, boolean z);

    void onSeekStart(String str, int i, float f);

    void onVideoBitrateChanged(String str, EnumC47177IfN enumC47177IfN, int i);

    void onVideoSizeChanged(String str, int i, int i2);
}
