package com.ss.android.ugc.aweme.video.simplayer;

import X.C00F;
import X.C34081DZd;
import X.C47154If0;
import X.C47989IsT;
import X.C47990IsU;
import X.C47992IsW;
import X.C47994IsY;
import X.C88408Ymq;
import X.DVR;
import X.FFL;
import X.IVQ;
import X.InterfaceC34940DnU;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.ss.android.ugc.playerkit.model.PlayerPowerThermalConfig;
import defpackage.e1;

/* loaded from: classes9.dex */
public class PlayerExperimentImpl extends C47989IsT {
    public static Boolean sDashABREnabled;

    @Override // X.C47989IsT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public /* bridge */ /* synthetic */ int cacheDuration(int i) {
        return -1;
    }

    @Override // X.C47989IsT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public /* bridge */ /* synthetic */ boolean enableBufferTimeControl() {
        return false;
    }

    @Override // X.C47989IsT
    public int getSuperResolutionStrategyConstDash() {
        return 4;
    }

    @Override // X.C47989IsT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public float getVolLoudUnity() {
        return InterfaceC34940DnU.LIZ;
    }

    @Override // X.C47989IsT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public /* bridge */ /* synthetic */ int memCacheVideoDurationThreshold() {
        return 0;
    }

    @Override // X.C47989IsT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public /* bridge */ /* synthetic */ int resumeFileIoBlockDurationThreshold() {
        return 0;
    }

    @Override // X.C47989IsT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public boolean enableCdnUrlExpiredExperiment() {
        if (C00F.LIZ(31744, 0, "enable_video_cdn_url_expired_tt", true) != 1) {
            return false;
        }
        return true;
    }

    @Override // X.C47989IsT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public boolean enableLazyInitMdl() {
        return ((Boolean) C47994IsY.LIZ.getValue()).booleanValue();
    }

    @Override // X.C47989IsT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int enableSplitVideoAudioPlayback() {
        return C00F.LIZ(31744, 0, "enable_engine_split_mode", true);
    }

    public PlayerPowerThermalConfig getPlayerPowerThermalConfig() {
        return new PlayerPowerThermalConfig();
    }

    @Override // X.C47989IsT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public boolean isDashABREnabled() {
        if (sDashABREnabled == null) {
            boolean z = false;
            if (C00F.LIZ(31744, 0, "player_abr_enable", true) == 1) {
                z = true;
            }
            sDashABREnabled = Boolean.valueOf(z);
        }
        return sDashABREnabled.booleanValue();
    }

    @Override // X.C47989IsT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public boolean playEventLogEnabled() {
        return ((Boolean) C47992IsW.LIZ.getValue()).booleanValue();
    }

    @Override // X.C47989IsT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public boolean videoBitRateEnabled() {
        return VideoBitRateABManager.LJFF.LJ();
    }

    @Override // X.C47989IsT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int ABR4GMaxResolutionIndex() {
        if (C88408Ymq.LJIIIIZZ()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_abr_4g_max_res_index", true);
    }

    @Override // X.C47989IsT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int ABRFixedLevel() {
        if (C88408Ymq.LJIIIIZZ()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_abr_fixed_level", true);
    }

    @Override // X.C47989IsT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public boolean Bytevc1PlayAddrPolicyUnifyExperiment() {
        if (C88408Ymq.LJIIIIZZ()) {
            return true;
        }
        return IVQ.LIZ;
    }

    @Override // X.C47989IsT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int PlayeAbDashHijackRetryEnableExp() {
        if (C88408Ymq.LJIIIIZZ()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_dash_enable_hijack_retry", true);
    }

    @Override // X.C47989IsT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int PlayeAbFixPrepareSeqTmpEnableExp() {
        if (C88408Ymq.LJIIIIZZ()) {
            return 0;
        }
        return ((Number) C47990IsU.LIZ.getValue()).intValue();
    }

    @Override // X.C47989IsT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int PlayeAbVIDDashHijackRetryEnableExp() {
        if (C88408Ymq.LJIIIIZZ()) {
            return 1;
        }
        return C00F.LIZ(31744, 1, "player_vid_dash_enable_hijack_retry", true);
    }

    @Override // X.C47989IsT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public float PlayerAbABRBandwidthParamExp() {
        if (C88408Ymq.LJIIIIZZ()) {
            return 1.0f;
        }
        FFL.LJIIIZ().getClass();
        return FFL.LJIIIIZZ(31744, "player_abr_bandwidth_param", 1.0f);
    }

    @Override // X.C47989IsT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public float PlayerAbABRStallPenaltyParamExp() {
        if (C88408Ymq.LJIIIIZZ()) {
            return 9.0f;
        }
        FFL.LJIIIZ().getClass();
        return FFL.LJIIIIZZ(31744, "player_abr_stall_penalty_param", 9.0f);
    }

    @Override // X.C47989IsT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int PlayerAbABRStartUpModelExp() {
        if (C88408Ymq.LJIIIIZZ()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_abr_startup_model", true);
    }

    @Override // X.C47989IsT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int PlayerAbABRSwitchCsModelExp() {
        if (C88408Ymq.LJIIIIZZ()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_abr_cs_model", true);
    }

    @Override // X.C47989IsT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public float PlayerAbABRSwitchPenaltyParamExp() {
        if (C88408Ymq.LJIIIIZZ()) {
            return 2.0f;
        }
        FFL.LJIIIZ().getClass();
        return FFL.LJIIIIZZ(31744, "player_abr_switch_penalty_param", 2.0f);
    }

    @Override // X.C47989IsT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int PlayerAbABRSwitchSensitivityExp() {
        if (C88408Ymq.LJIIIIZZ()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_abr_switch_sensitivity", true);
    }

    @Override // X.C47989IsT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int PlayerAbABRTimerIntervalMillExp() {
        if (C88408Ymq.LJIIIIZZ()) {
            return LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        }
        return C00F.LIZ(31744, LiveMaxRetainAlogMessageSizeSetting.DEFAULT, "player_abr_time_interval_mill", true);
    }

    @Override // X.C47989IsT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public boolean PreloadProcessDataExperiment() {
        if (C88408Ymq.LJIIIIZZ()) {
            return false;
        }
        return e1.LIZ(31744, "is_preload_process_data", true, false);
    }

    @Override // X.C47989IsT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int enableIntertrust() {
        return 0;
    }

    @Override // X.C47989IsT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int enableIntertrustDemotion() {
        return 0;
    }

    @Override // X.C47989IsT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int frameWait() {
        return DVR.LIZ;
    }

    @Override // X.C47989IsT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int get265DecodeType() {
        return C47154If0.LIZ;
    }

    @Override // X.C47989IsT, com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public boolean isAsyncInit() {
        return C34081DZd.LIZ;
    }
}
