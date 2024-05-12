package com.ss.android.ugc.aweme.services;

import android.app.Application;

/* loaded from: classes7.dex */
public interface IAVInitializer {
    void initAVEnv(Application application);

    void initMonitor(Application application);

    void initialize(Application application);

    void updateAB();
}
