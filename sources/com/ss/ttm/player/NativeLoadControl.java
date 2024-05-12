package com.ss.ttm.player;

import android.util.AndroidRuntimeException;

/* loaded from: classes9.dex */
public class NativeLoadControl extends LoadControl {
    public static boolean isNativeLoadControl(LoadControl loadControl) {
        return loadControl instanceof NativeLoadControl;
    }

    @Override // com.ss.ttm.player.LoadControl
    public final int onCodecStackSelected(int i) {
        throw new AndroidRuntimeException("Should not be here");
    }

    @Override // com.ss.ttm.player.LoadControl
    public final int onFilterStackSelected(int i) {
        throw new AndroidRuntimeException("Should not be here");
    }

    @Override // com.ss.ttm.player.LoadControl
    public final int onTrackSelected(int i) {
        throw new AndroidRuntimeException("Should not be here");
    }

    @Override // com.ss.ttm.player.LoadControl
    public final boolean shouldStartPlayback(long j, float f, boolean z) {
        throw new AndroidRuntimeException("Should not be here");
    }
}
