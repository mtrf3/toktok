package com.ss.android.ugc.playerkit.model;

import X.C74152vb;
import X.ITS;
import X.ITZ;
import android.content.Context;

/* loaded from: classes9.dex */
public interface PlayerGlobalConfig {
    Context context();

    boolean forceHttps();

    float getAdjustedVolume();

    String getAudioRoute();

    boolean getAutoAudioFocus();

    int getBitrateSelectMode();

    int getEnableSAMISDKAB();

    String getGraphJson();

    int getPlaybackAbility();

    int getPlayerBackgroundSleepStrategy();

    int getPlayerFramesWait();

    ITZ getPlayerType();

    String getPredictLabelResult();

    int getPreloadType();

    int getRenderType();

    C74152vb getVideoEffectInfo(String str);

    boolean isAsyncInit();

    boolean isCallbackCompletionFix();

    boolean isDebug();

    boolean isDynamicBitrateEnable();

    boolean isEnableBytevc1();

    boolean isEnableBytevc1BlackList();

    boolean isEnablePlayerLogV2();

    boolean isEnableSurfaceLifeCycleNotification();

    boolean isMultiPlayer();

    boolean isPowerModeHandlerEnable();

    boolean isPrepareAhead();

    boolean isPrerenderSurfaceSlowSetFix();

    boolean isUseSurfaceControl();

    boolean isUseSurfaceView();

    boolean isUseVideoTextureRenderer();

    ITS prepareConfig();

    void setAutoAudioFocus(boolean z);

    void setForceHttps(boolean z);
}
