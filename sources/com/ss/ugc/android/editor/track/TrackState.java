package com.ss.ugc.android.editor.track;

import X.V0N;

/* loaded from: classes3.dex */
public enum TrackState {
    NORMAL,
    STICKER,
    TEXT,
    PIP,
    AUDIO,
    VIDEOEFFECT,
    AUDIORECORD,
    ADJUST,
    FILTER;

    public static TrackState valueOf(String str) {
        return (TrackState) V0N.LJJJ(TrackState.class, str);
    }
}
