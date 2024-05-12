package com.ss.android.ugc.aweme.video.simkit;

import X.C00F;
import X.C16880lQ;
import X.C33927DTf;
import X.C47131Ied;
import X.C47285Ih7;
import X.C47483IkJ;
import X.C47516Ikq;
import X.C47636Imm;
import X.C47655In5;
import X.C47656In6;
import X.C47657In7;
import X.C58122Pw;
import X.C74152vb;
import X.C88408Ymq;
import X.EF7;
import X.FFL;
import X.ITS;
import X.ITZ;
import X.IWI;
import X.InterfaceC47659In9;
import X.InterfaceC47660InA;
import X.InterfaceC47661InB;
import X.X1D;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.ss.android.ugc.playerkit.model.PlayerGlobalConfig;
import defpackage.e1;
import java.io.FileInputStream;
import org.apache.http.util.EncodingUtils;

/* loaded from: classes9.dex */
public class PlayerGlobalConfigImpl implements PlayerGlobalConfig {
    public static volatile boolean autoAudioFocus = true;
    public static int isEnableSurfaceLifeCycleExpCachedVal = -1;
    public static boolean sForceHttps;
    public static ITZ sPlayerType;

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public /* bridge */ /* synthetic */ float getAdjustedVolume() {
        return -1.0f;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public /* bridge */ /* synthetic */ int getBitrateSelectMode() {
        return 0;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public /* bridge */ /* synthetic */ int getPlayerBackgroundSleepStrategy() {
        return 0;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public /* bridge */ /* synthetic */ String getPredictLabelResult() {
        return null;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public /* bridge */ /* synthetic */ C74152vb getVideoEffectInfo(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public /* bridge */ /* synthetic */ boolean isDebug() {
        return false;
    }

    public /* bridge */ /* synthetic */ boolean isEnableByteVC1AutoRetry() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public /* bridge */ /* synthetic */ boolean isPowerModeHandlerEnable() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public /* bridge */ /* synthetic */ boolean isPrepareAhead() {
        return false;
    }

    public /* bridge */ /* synthetic */ boolean isStrategyCenterInitialized() {
        return false;
    }

    public boolean isSurfaceControlClearSurface() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isUseSurfaceControl() {
        return false;
    }

    public /* bridge */ /* synthetic */ void releaseTextureRender() {
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean forceHttps() {
        if (sForceHttps) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public String getGraphJson() {
        String str;
        boolean z = true;
        if (C33927DTf.LIZ != 1) {
            z = false;
        }
        if (!z) {
            return "";
        }
        C47656In6 LIZ = C47656In6.LIZ();
        synchronized (LIZ) {
            if (!LIZ.LJFF) {
                str = LIZ.LIZLLL;
                if (str == null) {
                    str = "";
                }
            } else {
                if (LIZ.LJ) {
                    LIZ.LJ = false;
                    IAVEffectService effectService = AVExternalServiceImpl.LIZ().abilityService().effectService();
                    if (effectService != null) {
                        effectService.fetchEffectResourcePathById("36619792", new C47655In5(LIZ));
                    }
                }
                if (TextUtils.isEmpty(LIZ.LIZJ)) {
                    str = "";
                } else {
                    if (LIZ.LJFF) {
                        LIZ.LJFF = false;
                        try {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(LIZ.LIZJ);
                            LIZ2.append("/graph.json");
                            FileInputStream fileInputStream = new FileInputStream(X1D.LIZIZ(LIZ2));
                            byte[] bArr = new byte[fileInputStream.available()];
                            fileInputStream.read(bArr);
                            str = EncodingUtils.getString(bArr, "UTF-8");
                            LIZ.LIZLLL = str;
                        } catch (Exception e) {
                            C16880lQ.LLLLIIL(e);
                        }
                    }
                    str = LIZ.LIZLLL;
                    if (str == null) {
                        str = "";
                    }
                }
            }
        }
        return str;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public int getPlayerFramesWait() {
        return C00F.LIZ(31744, 1, "player_framews_wait", true);
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public ITZ getPlayerType() {
        if (sPlayerType == null) {
            sPlayerType = C47285Ih7.LIZIZ();
        }
        return sPlayerType;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isCallbackCompletionFix() {
        return e1.LIZ(31744, "player_callback_completion_fix_experiment", true, false);
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isDynamicBitrateEnable() {
        return VideoBitRateABManager.LJFF.LJ();
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isEnablePlayerLogV2() {
        return e1.LIZ(31744, "player_event_log_v2_open", true, true);
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isPrerenderSurfaceSlowSetFix() {
        if (C58122Pw.LIZ) {
            return ((Boolean) C47657In7.LIZ.getValue()).booleanValue();
        }
        return e1.LIZ(31744, "player_prerender_surface_slow_set_fix", true, false);
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isUseSurfaceView() {
        if (Build.VERSION.SDK_INT < 24 || C00F.LIZ(31744, 0, "player_enable_surface_surfaceview", true) != 1) {
            return false;
        }
        return true;
    }

    public boolean isUseTTNet() {
        if (C00F.LIZ(31744, 1, "use_ttnet", true) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public Context context() {
        return EF7.LIZIZ();
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public String getAudioRoute() {
        String str;
        synchronized (C47656In6.LIZ()) {
            int LIZLLL = C47636Imm.LIZLLL();
            if (LIZLLL != -1) {
                if (LIZLLL != 0) {
                    if (LIZLLL != 2) {
                        if (LIZLLL != 3) {
                            if (LIZLLL != 4) {
                                if (LIZLLL != 5) {
                                    str = "empty";
                                } else {
                                    str = "usb";
                                }
                            } else {
                                str = "wired";
                            }
                        } else {
                            str = "others";
                        }
                    } else {
                        str = "bluetooth";
                    }
                } else {
                    str = "speaker";
                }
            } else {
                str = LiveGiftNewGifterBadgeSetting.DEFAULT;
            }
        }
        return str;
    }

    public double getBitrateModelThreshold() {
        if (C88408Ymq.LJ()) {
            return -1.0d;
        }
        FFL.LJIIIZ().getClass();
        return FFL.LJII(31744, "video_auto_model_threshold", -1.0d);
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public int getEnableSAMISDKAB() {
        int i;
        synchronized (C47656In6.LIZ()) {
            i = 1;
            if (!C47516Ikq.LIZ) {
                i = 0;
            }
        }
        return i;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public int getPlaybackAbility() {
        C47656In6 LIZ = C47656In6.LIZ();
        synchronized (LIZ) {
            int LIZLLL = C47636Imm.LIZLLL();
            if (LIZLLL == LIZ.LIZ) {
                int i = LIZ.LIZIZ;
                if (i != -1) {
                    return i;
                }
            }
            try {
                LIZ.LIZ = LIZLLL;
                int L = C47131Ied.LIZ.L(LIZLLL);
                LIZ.LIZIZ = L;
                return L;
            } catch (Throwable unused) {
                return -1;
            }
        }
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public int getPreloadType() {
        return u.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public int getRenderType() {
        if (C88408Ymq.LJ()) {
            return 0;
        }
        return InterfaceC47661InB.LIZ;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isAsyncInit() {
        if (C88408Ymq.LJ()) {
            return true;
        }
        return e1.LIZ(31744, "is_ttplayer_async_init", true, true);
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isEnableBytevc1BlackList() {
        if (C88408Ymq.LJ()) {
            return false;
        }
        return e1.LIZ(31744, "enable_bytevc1_black_list", true, false);
    }

    public boolean isEnableLocalVideoPlay() {
        if (C88408Ymq.LJ()) {
            return true;
        }
        return e1.LIZ(31744, "is_local_video_play_enable", true, true);
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isEnableSurfaceLifeCycleNotification() {
        if (C88408Ymq.LJ()) {
            return false;
        }
        if (-1 == isEnableSurfaceLifeCycleExpCachedVal) {
            isEnableSurfaceLifeCycleExpCachedVal = C00F.LIZ(31744, 0, "surface_lifecycle_notification_enabled", true);
        }
        if (1 != isEnableSurfaceLifeCycleExpCachedVal) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isMultiPlayer() {
        if (C88408Ymq.LJ()) {
            return false;
        }
        return e1.LIZ(31744, "enable_multi_player", true, false);
    }

    public boolean isPlayLinkSelectEnabled() {
        if (C88408Ymq.LJ()) {
            return true;
        }
        return C47483IkJ.LJ();
    }

    public boolean isUseVideoCacheHttpDns() {
        if (C88408Ymq.LJ()) {
            return true;
        }
        return e1.LIZ(31744, "use_video_cache_http_dns", true, false);
    }

    public boolean shouldForceToKeepSurfaceBelowKITKAT() {
        if (C88408Ymq.LJ()) {
            return false;
        }
        return e1.LIZ(31744, "should_force_to_keep_surface_below_kitkat", true, false);
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean getAutoAudioFocus() {
        return autoAudioFocus;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isEnableBytevc1() {
        return InterfaceC47660InA.LIZ;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public boolean isUseVideoTextureRenderer() {
        return InterfaceC47659In9.LIZ;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public ITS prepareConfig() {
        return IWI.Normal;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public void setAutoAudioFocus(boolean z) {
        autoAudioFocus = z;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public void setForceHttps(boolean z) {
        sForceHttps = z;
    }
}
