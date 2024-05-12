package com.ss.android.ugc.feed.platform.panel.player;

import X.C2K0;
import X.C46319IFv;
import X.IDP;
import X.InterfaceC46330IGg;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes2.dex */
public interface IPlayerComponentAbility extends C2K0 {
    float B80();

    void Cm0();

    void LJJJLIIL();

    void TH(String str, boolean z);

    int d0();

    long getCurrentPlayDuration();

    long getCurrentPosition();

    C46319IFv getDynamicOnUIPlayDelegate();

    IDP getPlayerController();

    InterfaceC46330IGg getPlayerManager();

    String getSimKitSceneID();

    int gu();

    void handleMobShowEvent();

    void handlePause(boolean z);

    void handlePlay(Aweme aweme, boolean z);

    void handlePlay(Aweme aweme, boolean z, boolean z2);

    void handlePlay(Aweme aweme, boolean z, boolean z2, boolean z3);

    boolean isUseSurfaceView();

    String ji(Aweme aweme, int i, boolean z);

    void makeCurrentPlayScene();

    void pauseCurrentPlayerWithListener();

    void pausePlayer();

    void playAdStoryVideo();

    void seekProgress(float f);

    void setPlayerManager(InterfaceC46330IGg interfaceC46330IGg);

    void setVideoAppLogDuration(long j);

    void stopCalPlayTime(String str);

    void stopPlayer();

    String tryPlay(Aweme aweme);

    void tryPlay();

    void tryResumePlay();

    void tryResumePlay(Aweme aweme);

    void tryResumePlay(boolean z);

    void tryResumePlayByOnResume(boolean z);
}
