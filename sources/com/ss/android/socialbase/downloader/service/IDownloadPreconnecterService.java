package com.ss.android.socialbase.downloader.service;

import X.X42;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import java.util.List;

/* loaded from: classes16.dex */
public interface IDownloadPreconnecterService {

    /* loaded from: classes16.dex */
    public static class DefaultDownloadPreconnecterService implements IDownloadPreconnecterService {
        @Override // com.ss.android.socialbase.downloader.service.IDownloadPreconnecterService
        public void asyncFetchHttpHeadInfo(String str, X42 x42) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadPreconnecterService
        public void preconnect(int i, String str, String str2, List<HttpHeader> list, boolean z, boolean z2) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadPreconnecterService
        public void preconnect(String str, String str2, boolean z) {
        }
    }

    void asyncFetchHttpHeadInfo(String str, X42 x42);

    void preconnect(int i, String str, String str2, List<HttpHeader> list, boolean z, boolean z2);

    void preconnect(String str, String str2, boolean z);
}
