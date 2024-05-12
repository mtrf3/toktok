package com.ss.bytertc.engine;

import com.ss.bytertc.engine.data.StandardPitchInfo;
import com.ss.bytertc.engine.handler.NativeSingScoringEventHandler;

/* loaded from: classes33.dex */
public class NativeSingScoringManagerFunctions {
    public static native int nativeGetAverageScore(long j);

    public static native int nativeGetLastSentenceScore(long j);

    public static native StandardPitchInfo[] nativeGetStandardPitchInfo(long j, String str);

    public static native int nativeGetTotalScore(long j);

    public static native int nativeInitSingScoring(long j, long j2, String str, String str2, NativeSingScoringEventHandler nativeSingScoringEventHandler);

    public static native int nativeSetSingScoringConfig(long j, int i, int i2, String str, String str2);

    public static native int nativeStartSingScoring(long j, int i, int i2);

    public static native int nativeStopSingScoring(long j);
}
