package com.ss.ttm.player;

import android.util.AndroidRuntimeException;

/* loaded from: classes9.dex */
public class NativeABRStrategy extends ABRStrategy {
    public NativeABRStrategy(long j) {
        this.LIZ = j;
        this.LIZIZ = false;
    }

    public static boolean isNativeABRStrategy(ABRStrategy aBRStrategy) {
        return aBRStrategy instanceof NativeABRStrategy;
    }

    @Override // com.ss.ttm.player.ABRStrategy
    public final int probeBitrate(int i) {
        throw new AndroidRuntimeException("Should not be here");
    }

    @Override // com.ss.ttm.player.ABRStrategy
    public final String probeBitrate(String str) {
        throw new AndroidRuntimeException("Should not be here");
    }
}
