package com.ss.android.ugc.aweme.services.storage;

import java.util.Set;

/* loaded from: classes2.dex */
public interface IAVStorageService {
    void checkStorageClean();

    Set<String> getPrefixAllowList();

    boolean isMonitorEnabled();

    void setMonitorLocalSwitch(boolean z);
}
