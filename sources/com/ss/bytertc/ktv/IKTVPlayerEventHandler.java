package com.ss.bytertc.ktv;

import com.ss.bytertc.ktv.data.KTVPlayerErrorCode;
import com.ss.bytertc.ktv.data.PlayState;

/* loaded from: classes33.dex */
public abstract class IKTVPlayerEventHandler {
    public abstract void onPlayProgress(String str, long j);

    public abstract void onPlayStateChanged(String str, PlayState playState, KTVPlayerErrorCode kTVPlayerErrorCode);
}
