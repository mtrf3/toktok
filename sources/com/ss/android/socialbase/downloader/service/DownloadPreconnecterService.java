package com.ss.android.socialbase.downloader.service;

import X.RunnableC84247X4p;
import X.X42;
import X.X4X;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import java.util.List;

/* loaded from: classes16.dex */
public class DownloadPreconnecterService implements IDownloadPreconnecterService {
    @Override // com.ss.android.socialbase.downloader.service.IDownloadPreconnecterService
    public void asyncFetchHttpHeadInfo(String str, X42 x42) {
        X4X.LIZIZ.post(new RunnableC84247X4p(str));
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadPreconnecterService
    public void preconnect(String str, String str2, boolean z) {
        X4X.LIZIZ(-1, str, str2, null, z, true);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadPreconnecterService
    public void preconnect(int i, String str, String str2, List<HttpHeader> list, boolean z, boolean z2) {
        X4X.LIZIZ(i, str, str2, list, z, z2);
    }
}
