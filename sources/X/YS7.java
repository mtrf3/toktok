package X;

import android.graphics.Bitmap;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.ttvideoengine.TTVideoEngine;

/* loaded from: classes16.dex */
public interface YS7 {
    Bitmap captureVideoCurrentFrame();

    void clearSurfaceIfUseSurfaceView();

    void configResolutionByQuality(boolean z, String str, boolean z2, boolean z3, String str2);

    YSP fetchVideoSnapshotInfo();

    int getCurrentPosition();

    int getCurrentPosition(boolean z);

    String getCurrentQualityDesc();

    C47160If6 getCurrentVideoInfo();

    int getDuration();

    C79985VaH getPlayEntity();

    C46886Iag getPlaybackParams();

    EnumC47176IfM getResolution();

    TTVideoEngine getVideoEngine();

    C47164IfA getVideoModel();

    InterfaceC48221IwD getVideoStateInquirer();

    int getWatchedDuration();

    boolean isCurrentAutoQuality();

    boolean isLoop();

    boolean isPaused();

    boolean isPlayed();

    boolean isPlaying();

    boolean isPrepared();

    boolean isReleased();

    boolean isRenderStarted();

    boolean isShouldPlay();

    boolean isStarted();

    boolean isVideoPlayCompleted();

    void pause();

    void play();

    void prepare();

    void release();

    void resumeProgressUpdate();

    void resumeVideoSnapshotInfo(YSP ysp);

    void seekTo(long j);

    void setAsyncPosition(boolean z);

    void setAsyncRelease(boolean z);

    void setEngineOption(int i, Object obj);

    void setLoop(boolean z);

    void setMute(boolean z);

    void setPlayEntity(C79985VaH c79985VaH);

    void setPlayUrlConstructor(YTA yta);

    void setPlaybackParams(C46886Iag c46886Iag);

    void setReleaseEngineEnabled(boolean z);

    void setRememberVideoPosition(boolean z);

    void setRenderMode(int i);

    void setResolution(EnumC47176IfM enumC47176IfM, boolean z);

    void setStartTime(int i);

    void setSurface(Surface surface);

    void setSurfaceHolder(SurfaceHolder surfaceHolder);

    void setTryToInterceptPlay(boolean z);

    void setTtvNetClient(AbstractC47819Ipj abstractC47819Ipj);

    void setVideoEngine(TTVideoEngine tTVideoEngine);

    void setVideoEngineFactory(InterfaceC58392Mvs interfaceC58392Mvs);

    void setVideoMethodOpt(boolean z);

    void setVideoPlayConfiger(InterfaceC87405YSb interfaceC87405YSb);

    void setVideoPlayListener(InterfaceC87404YSa interfaceC87404YSa);

    void setVideoViewType(int i);

    void setVolume(float f, float f2);
}
