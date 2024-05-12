package com.ss.android.ugc.aweme.download.component_api.service;

import X.AbstractC84258X5a;
import X.AbstractC84259X5b;
import X.X5R;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes8.dex */
public interface IBaseDownloadService {
    void cancel(int i);

    int getDownloadId(String str, String str2);

    DownloadInfo getDownloadInfo(int i);

    DownloadInfo getDownloadInfo(String str, String str2);

    X5R getDownloadTask(int i);

    AbstractC84258X5a getPageLifeMonitor(int i);

    AbstractC84259X5b getViewLifeMonitor(int i);

    void restart(int i);

    X5R with(String str);
}
