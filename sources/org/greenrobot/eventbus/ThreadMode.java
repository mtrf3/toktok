package org.greenrobot.eventbus;

import X.V0N;

/* loaded from: classes12.dex */
public enum ThreadMode {
    POSTING,
    MAIN,
    MAIN_ORDERED,
    BACKGROUND,
    ASYNC;

    public static ThreadMode valueOf(String str) {
        return (ThreadMode) V0N.LJJJ(ThreadMode.class, str);
    }
}
