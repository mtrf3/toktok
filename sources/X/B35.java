package X;

import android.content.Context;

/* loaded from: classes6.dex */
public interface B35 {
    void attach(Context context, B4E b4e, InterfaceC28740BPs interfaceC28740BPs);

    void changeSRSupportScene(boolean z);

    String getCurrentResolution();

    String getCurrentUrl();

    int getDecodeStatus();

    boolean getIsPreparePlayer();

    B4F getLogger();

    String getMediaErrorMessage();

    boolean getPlayerHasLogPrePlayerHitCache();

    String getPlayerTag();

    long getStartTime();

    void getVideoSize(int[] iArr);

    void initialize(long j, C28644BMa c28644BMa);

    boolean isPlaying();

    boolean isVideoHorizontal();

    void onBackground();

    void onForeground();

    boolean pipResumePlay();

    boolean preCreatedSurface(Context context);

    void preparePlayer();

    void recycle();

    void release();

    void restoreAudioStatus();

    void saveAudioStatus();

    void setAnchorInteractMode(boolean z);

    void setAudioRespondDisableForQuiz(boolean z);

    void setEnterRoomScene(String str);

    void setIsPreparePlayer(boolean z);

    void setMute(boolean z, String str);

    void setMuteNew(boolean z, String str);

    void setPlayerHashLogPrePlayerHitCache(boolean z);

    void setPrePullStream(boolean z);

    void setReusePlayer(boolean z, String str, boolean z2);

    void setScreenOrientation(boolean z);

    void setSeiOpen(boolean z);

    boolean start();

    boolean startWithNewLivePlayer();

    void stop(boolean z);

    void stopWhenJoinInteract(Context context);

    void stopWhenPlayingOther(Context context);

    void switchResolution(String str);

    void switchResolution(String str, VCA vca);

    boolean tryResumePlay();

    void tryToStartAudioDevice();

    void tryToUploadFirstScreenTime();

    boolean warmUp();
}
