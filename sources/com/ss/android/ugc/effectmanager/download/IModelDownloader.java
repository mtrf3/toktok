package com.ss.android.ugc.effectmanager.download;

import com.ss.android.ugc.effectmanager.FetchModelType;
import com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.ss.android.ugc.effectmanager.model.ModelInfo;

/* loaded from: classes16.dex */
public interface IModelDownloader {
    long download(ModelInfo modelInfo, FetchModelType fetchModelType, MonitorTrace monitorTrace);
}
