package com.ss.android.ugc.aweme.services.function;

import X.V0N;

/* loaded from: classes11.dex */
public enum IFunctionKey {
    QR_CODE,
    SHARE_PROFILE,
    PROFILE_VIDEO_HEAD,
    AD,
    DUET,
    GENERATE_GIF;

    public static IFunctionKey valueOf(String str) {
        return (IFunctionKey) V0N.LJJJ(IFunctionKey.class, str);
    }
}
