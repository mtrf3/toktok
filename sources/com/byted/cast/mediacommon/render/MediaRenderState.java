package com.byted.cast.mediacommon.render;

import X.V0N;

/* loaded from: classes29.dex */
public enum MediaRenderState {
    STATE_UNINITIALIZED,
    STATE_EXECUTING;

    public static MediaRenderState valueOf(String str) {
        return (MediaRenderState) V0N.LJJJ(MediaRenderState.class, str);
    }
}
