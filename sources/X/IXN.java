package X;

import android.content.Context;
import android.os.Build;
import com.ss.android.ugc.playerkit.injector.InjectedConfigManager;
import com.ss.android.ugc.playerkit.model.PlayerGlobalConfig;

/* loaded from: classes9.dex */
public final class IXN implements PlayerGlobalConfig {
    public static final IXN LIZJ = new IXN();
    public final IXR LIZ = new IXR();
    public PlayerGlobalConfig LIZIZ;

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final /* synthetic */ boolean isDebug() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final /* synthetic */ boolean isPrepareAhead() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final /* synthetic */ void setForceHttps(boolean z) {
    }

    public final void LIZIZ() {
        if (this.LIZIZ == null) {
            this.LIZIZ = (PlayerGlobalConfig) InjectedConfigManager.getConfig(PlayerGlobalConfig.class);
        }
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final float getAdjustedVolume() {
        PlayerGlobalConfig playerGlobalConfig = this.LIZIZ;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.getAdjustedVolume();
        }
        this.LIZ.getClass();
        return -1.0f;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final Context context() {
        LIZIZ();
        PlayerGlobalConfig playerGlobalConfig = this.LIZIZ;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.context();
        }
        this.LIZ.getClass();
        return IXR.LIZ;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean forceHttps() {
        LIZIZ();
        PlayerGlobalConfig playerGlobalConfig = this.LIZIZ;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.forceHttps();
        }
        this.LIZ.getClass();
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final String getAudioRoute() {
        LIZIZ();
        PlayerGlobalConfig playerGlobalConfig = this.LIZIZ;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.getAudioRoute();
        }
        this.LIZ.getClass();
        return "";
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean getAutoAudioFocus() {
        LIZIZ();
        PlayerGlobalConfig playerGlobalConfig = this.LIZIZ;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.getAutoAudioFocus();
        }
        this.LIZ.getClass();
        return true;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final int getBitrateSelectMode() {
        LIZIZ();
        PlayerGlobalConfig playerGlobalConfig = this.LIZIZ;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.getBitrateSelectMode();
        }
        this.LIZ.getClass();
        return 0;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final int getEnableSAMISDKAB() {
        LIZIZ();
        PlayerGlobalConfig playerGlobalConfig = this.LIZIZ;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.getEnableSAMISDKAB();
        }
        this.LIZ.getClass();
        return -1;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final String getGraphJson() {
        LIZIZ();
        PlayerGlobalConfig playerGlobalConfig = this.LIZIZ;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.getGraphJson();
        }
        this.LIZ.getClass();
        return "";
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final int getPlaybackAbility() {
        LIZIZ();
        PlayerGlobalConfig playerGlobalConfig = this.LIZIZ;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.getPlaybackAbility();
        }
        this.LIZ.getClass();
        return -1;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final int getPlayerBackgroundSleepStrategy() {
        LIZIZ();
        PlayerGlobalConfig playerGlobalConfig = this.LIZIZ;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.getPlayerBackgroundSleepStrategy();
        }
        this.LIZ.getClass();
        return 0;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final int getPlayerFramesWait() {
        LIZIZ();
        PlayerGlobalConfig playerGlobalConfig = this.LIZIZ;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.getPlayerFramesWait();
        }
        this.LIZ.getClass();
        return 1;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final ITZ getPlayerType() {
        LIZIZ();
        PlayerGlobalConfig playerGlobalConfig = this.LIZIZ;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.getPlayerType();
        }
        this.LIZ.getClass();
        return ITZ.TT;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final String getPredictLabelResult() {
        LIZIZ();
        PlayerGlobalConfig playerGlobalConfig = this.LIZIZ;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.getPredictLabelResult();
        }
        this.LIZ.getClass();
        return null;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final int getPreloadType() {
        LIZIZ();
        PlayerGlobalConfig playerGlobalConfig = this.LIZIZ;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.getPreloadType();
        }
        this.LIZ.getClass();
        return 2;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final int getRenderType() {
        LIZIZ();
        PlayerGlobalConfig playerGlobalConfig = this.LIZIZ;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.getRenderType();
        }
        this.LIZ.getClass();
        return 0;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isAsyncInit() {
        LIZIZ();
        PlayerGlobalConfig playerGlobalConfig = this.LIZIZ;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.isAsyncInit();
        }
        this.LIZ.getClass();
        return true;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isCallbackCompletionFix() {
        LIZIZ();
        PlayerGlobalConfig playerGlobalConfig = this.LIZIZ;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.isCallbackCompletionFix();
        }
        this.LIZ.getClass();
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isDynamicBitrateEnable() {
        LIZIZ();
        PlayerGlobalConfig playerGlobalConfig = this.LIZIZ;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.isDynamicBitrateEnable();
        }
        this.LIZ.getClass();
        return true;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isEnableBytevc1() {
        LIZIZ();
        PlayerGlobalConfig playerGlobalConfig = this.LIZIZ;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.isEnableBytevc1();
        }
        this.LIZ.getClass();
        return true;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isEnableBytevc1BlackList() {
        LIZIZ();
        PlayerGlobalConfig playerGlobalConfig = this.LIZIZ;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.isEnableBytevc1BlackList();
        }
        this.LIZ.getClass();
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isEnablePlayerLogV2() {
        LIZIZ();
        PlayerGlobalConfig playerGlobalConfig = this.LIZIZ;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.isEnablePlayerLogV2();
        }
        this.LIZ.getClass();
        return true;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isEnableSurfaceLifeCycleNotification() {
        LIZIZ();
        PlayerGlobalConfig playerGlobalConfig = this.LIZIZ;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.isEnableSurfaceLifeCycleNotification();
        }
        this.LIZ.getClass();
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isMultiPlayer() {
        LIZIZ();
        PlayerGlobalConfig playerGlobalConfig = this.LIZIZ;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.isMultiPlayer();
        }
        this.LIZ.getClass();
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isPowerModeHandlerEnable() {
        LIZIZ();
        PlayerGlobalConfig playerGlobalConfig = this.LIZIZ;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.isPowerModeHandlerEnable();
        }
        this.LIZ.getClass();
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isPrerenderSurfaceSlowSetFix() {
        LIZIZ();
        PlayerGlobalConfig playerGlobalConfig = this.LIZIZ;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.isPrerenderSurfaceSlowSetFix();
        }
        this.LIZ.getClass();
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isUseSurfaceControl() {
        LIZIZ();
        PlayerGlobalConfig playerGlobalConfig = this.LIZIZ;
        if (playerGlobalConfig != null) {
            if (!playerGlobalConfig.isUseSurfaceControl() || Build.VERSION.SDK_INT < 29) {
                return false;
            }
            return true;
        }
        this.LIZ.getClass();
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isUseSurfaceView() {
        LIZIZ();
        PlayerGlobalConfig playerGlobalConfig = this.LIZIZ;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.isUseSurfaceView();
        }
        this.LIZ.getClass();
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isUseVideoTextureRenderer() {
        LIZIZ();
        PlayerGlobalConfig playerGlobalConfig = this.LIZIZ;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.isUseVideoTextureRenderer();
        }
        this.LIZ.getClass();
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final ITS prepareConfig() {
        LIZIZ();
        PlayerGlobalConfig playerGlobalConfig = this.LIZIZ;
        if (playerGlobalConfig != null) {
            return playerGlobalConfig.prepareConfig();
        }
        this.LIZ.getClass();
        return new IXU();
    }

    public static IXN LIZ() {
        return LIZJ;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final C74152vb getVideoEffectInfo(String str) {
        LIZIZ();
        try {
            PlayerGlobalConfig playerGlobalConfig = this.LIZIZ;
            if (playerGlobalConfig != null) {
                return playerGlobalConfig.getVideoEffectInfo(str);
            }
            this.LIZ.getClass();
            return null;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final void setAutoAudioFocus(boolean z) {
        LIZIZ();
        PlayerGlobalConfig playerGlobalConfig = this.LIZIZ;
        if (playerGlobalConfig != null) {
            playerGlobalConfig.setAutoAudioFocus(z);
        }
        this.LIZ.getClass();
    }
}
