package com.orbu.core.api;

import X.V0N;

/* loaded from: classes7.dex */
public enum Channel {
    DEFAULT,
    NETWORK,
    WEB,
    WEB_ROUTER,
    APP_TO_APP,
    SETTINGS,
    SDK,
    GECKO,
    SYSTEM_API;

    public static Channel valueOf(String str) {
        return (Channel) V0N.LJJJ(Channel.class, str);
    }
}
