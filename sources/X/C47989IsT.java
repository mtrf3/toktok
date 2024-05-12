package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.ss.android.ugc.aweme.video.config.IPlayerExperiment;

/* renamed from: X.IsT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47989IsT implements IPlayerExperiment {
    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int ABR4GMaxResolutionIndex() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int ABRFixedLevel() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public boolean Bytevc1PlayAddrPolicyUnifyExperiment() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int PlayeAbDashHijackRetryEnableExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int PlayeAbEnableCustomizeThreadPoolExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int PlayeAbFixPrepareSeqTmpEnableExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int PlayeAbVIDDashHijackRetryEnableExp() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public float PlayerAbABRBandwidthParamExp() {
        return 1.0f;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public float PlayerAbABRStallPenaltyParamExp() {
        return 9.0f;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int PlayerAbABRStartUpModelExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int PlayerAbABRSwitchCsModelExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public float PlayerAbABRSwitchPenaltyParamExp() {
        return 2.0f;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int PlayerAbABRSwitchSensitivityExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int PlayerAbABRTimerIntervalMillExp() {
        return LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
    }

    public int PlayerAbSuperResolutionVideoDurationExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public boolean PreloadProcessDataExperiment() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public /* synthetic */ int cacheDuration(int i) {
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public long cdnUrlExpiredOffset() {
        return 0L;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public /* synthetic */ boolean enableBufferTimeControl() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public boolean enableCdnUrlExpiredExperiment() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int enableIntertrust() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int enableIntertrustDemotion() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public /* synthetic */ boolean enableLazyInitMdl() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public /* synthetic */ int enableSplitVideoAudioPlayback() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int frameWait() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public int get265DecodeType() {
        return 0;
    }

    public int getSuperResolutionStrategyConstDash() {
        return 4;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public float getVolLoudUnity() {
        return 0.0f;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public boolean isAsyncInit() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public boolean isDashABREnabled() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public boolean isDirectUrlCheckInfoEnable() {
        return false;
    }

    public boolean isPlayerPreferchCaption() {
        return false;
    }

    public boolean isPlayerPreferchTtsAudio() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public /* synthetic */ int memCacheVideoDurationThreshold() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public boolean playEventLogEnabled() {
        return true;
    }

    public float playerPreferchCaptionSize() {
        return 0.0f;
    }

    public float playerPreferchTtsAudioSize() {
        return 0.0f;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public /* synthetic */ int resumeFileIoBlockDurationThreshold() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.config.IPlayerExperiment
    public boolean videoBitRateEnabled() {
        return false;
    }
}
