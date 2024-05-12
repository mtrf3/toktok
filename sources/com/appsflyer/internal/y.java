package com.appsflyer.internal;

import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class y {
    public final bj AFInAppEventType;
    public final ExecutorService AFKeystoreWrapper;

    /* loaded from: classes.dex */
    public interface a {
        void AFInAppEventType(String str, String str2);

        void AFKeystoreWrapper(String str, Exception exc);
    }

    public y() {
    }

    public y(bj bjVar, ExecutorService executorService) {
        this.AFInAppEventType = bjVar;
        this.AFKeystoreWrapper = executorService;
    }
}
