package com.ss.bytertc.engine;

import com.ss.bytertc.engine.audio.ISingScoringManager;
import com.ss.bytertc.engine.data.SingScoringConfig;
import com.ss.bytertc.engine.data.StandardPitchInfo;
import com.ss.bytertc.engine.handler.NativeSingScoringEventHandler;
import com.ss.bytertc.engine.utils.LogUtil;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes33.dex */
public class SingScoringManager extends ISingScoringManager {
    public NativeSingScoringEventHandler mNativeHandler = new NativeSingScoringEventHandler(this);
    public long mNativeRTCVideoEngine;
    public long mNativeSingScoringManager;
    public WeakReference<ISingScoringEventHandler> mSingScoringEventHandler;

    @Override // com.ss.bytertc.engine.audio.ISingScoringManager
    public int getAverageScore() {
        long j = this.mNativeSingScoringManager;
        if (j == 0) {
            LogUtil.e("SingScoringManager", "native SingScoringManager is invalid, getAverageScore failed.");
            return -1;
        }
        return NativeSingScoringManagerFunctions.nativeGetAverageScore(j);
    }

    @Override // com.ss.bytertc.engine.audio.ISingScoringManager
    public int getLastSentenceScore() {
        long j = this.mNativeSingScoringManager;
        if (j == 0) {
            LogUtil.e("SingScoringManager", "native SingScoringManager is invalid, getLastSentenceScore failed.");
            return -1;
        }
        return NativeSingScoringManagerFunctions.nativeGetLastSentenceScore(j);
    }

    public ISingScoringEventHandler getSingScoringEventHandler() {
        return this.mSingScoringEventHandler.get();
    }

    @Override // com.ss.bytertc.engine.audio.ISingScoringManager
    public int getTotalScore() {
        long j = this.mNativeSingScoringManager;
        if (j == 0) {
            LogUtil.e("SingScoringManager", "native SingScoringManager is invalid, getTotalScore failed.");
            return -1;
        }
        return NativeSingScoringManagerFunctions.nativeGetTotalScore(j);
    }

    @Override // com.ss.bytertc.engine.audio.ISingScoringManager
    public int stopSingScoring() {
        long j = this.mNativeSingScoringManager;
        if (j == 0) {
            LogUtil.e("SingScoringManager", "native SingScoringManager is invalid, stopSingScoring failed.");
            return -1;
        }
        return NativeSingScoringManagerFunctions.nativeStopSingScoring(j);
    }

    @Override // com.ss.bytertc.engine.audio.ISingScoringManager
    public List<StandardPitchInfo> getStandardPitchInfo(String str) {
        long j = this.mNativeSingScoringManager;
        if (j == 0) {
            LogUtil.e("SingScoringManager", "native SingScoringManager is invalid, getStandardPitchInfo failed.");
            return null;
        }
        return Arrays.asList(NativeSingScoringManagerFunctions.nativeGetStandardPitchInfo(j, str));
    }

    @Override // com.ss.bytertc.engine.audio.ISingScoringManager
    public int setSingScoringConfig(SingScoringConfig singScoringConfig) {
        long j = this.mNativeSingScoringManager;
        if (j == 0) {
            LogUtil.e("SingScoringManager", "native SingScoringManager is invalid, setSingScoringConfig failed.");
            return -1;
        }
        return NativeSingScoringManagerFunctions.nativeSetSingScoringConfig(j, singScoringConfig.sampleRate.value(), singScoringConfig.mode.value(), singScoringConfig.lyricsFilepath, singScoringConfig.midiFilepath);
    }

    public SingScoringManager(long j, long j2) {
        this.mNativeRTCVideoEngine = j;
        this.mNativeSingScoringManager = j2;
    }

    @Override // com.ss.bytertc.engine.audio.ISingScoringManager
    public int startSingScoring(int i, int i2) {
        long j = this.mNativeSingScoringManager;
        if (j == 0) {
            LogUtil.e("SingScoringManager", "native SingScoringManager is invalid, startSingScoring failed.");
            return -1;
        }
        return NativeSingScoringManagerFunctions.nativeStartSingScoring(j, i, i2);
    }

    @Override // com.ss.bytertc.engine.audio.ISingScoringManager
    public int initSingScoring(String str, String str2, ISingScoringEventHandler iSingScoringEventHandler) {
        if (this.mNativeSingScoringManager == 0) {
            LogUtil.e("SingScoringManager", "native SingScoringManager is invalid, initSingScoring failed.");
            return -1;
        }
        this.mSingScoringEventHandler = new WeakReference<>(iSingScoringEventHandler);
        if (iSingScoringEventHandler == null) {
            return NativeSingScoringManagerFunctions.nativeInitSingScoring(this.mNativeRTCVideoEngine, this.mNativeSingScoringManager, str, str2, null);
        }
        return NativeSingScoringManagerFunctions.nativeInitSingScoring(this.mNativeRTCVideoEngine, this.mNativeSingScoringManager, str, str2, this.mNativeHandler);
    }
}
