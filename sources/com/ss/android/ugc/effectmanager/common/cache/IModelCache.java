package com.ss.android.ugc.effectmanager.common.cache;

import com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.ss.android.ugc.effectmanager.model.LocalModelInfo;
import java.util.Map;

/* loaded from: classes16.dex */
public interface IModelCache {
    String getCacheDir();

    LocalModelInfo getLocalModelInfoByName(String str, MonitorTrace monitorTrace);

    Map<String, LocalModelInfo> getLocalModelInfoList();

    boolean isBuiltInResource(String str);
}
