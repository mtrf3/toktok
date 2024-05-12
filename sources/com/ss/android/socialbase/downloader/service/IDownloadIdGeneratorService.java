package com.ss.android.socialbase.downloader.service;

import X.X43;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes16.dex */
public interface IDownloadIdGeneratorService extends X43 {

    /* loaded from: classes16.dex */
    public static class DefaultDownloadIdGeneratorService implements IDownloadIdGeneratorService {
        @Override // com.ss.android.socialbase.downloader.service.IDownloadIdGeneratorService
        public int generate(DownloadInfo downloadInfo) {
            return 0;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadIdGeneratorService, X.X43
        public int generate(String str, String str2) {
            return 0;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadIdGeneratorService
        public boolean isDefaultIdGenerator() {
            return true;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadIdGeneratorService
        public void setDownloadIdGenerator(X43 x43) {
        }
    }

    int generate(DownloadInfo downloadInfo);

    @Override // X.X43
    /* synthetic */ int generate(String str, String str2);

    boolean isDefaultIdGenerator();

    void setDownloadIdGenerator(X43 x43);
}
