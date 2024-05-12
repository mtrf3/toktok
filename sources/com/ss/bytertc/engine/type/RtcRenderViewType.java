package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum RtcRenderViewType {
    RTC_SURFACEVIEW,
    RTC_TEXTUREVIEW;

    public static RtcRenderViewType valueOf(String str) {
        return (RtcRenderViewType) V0N.LJJJ(RtcRenderViewType.class, str);
    }
}
