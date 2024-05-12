package com.ss.android.socialbase.downloader.service;

import X.C84213X3h;
import X.C84215X3j;
import X.InterfaceC84169X1p;
import X.InterfaceC84208X3c;
import X.InterfaceC84209X3d;
import X.InterfaceC84210X3e;
import X.InterfaceC84214X3i;
import X.X3A;
import X.X3U;
import android.content.Context;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public interface IDownloadComponentManagerService {

    /* loaded from: classes16.dex */
    public static class DefaultDownloadComponentManagerService implements IDownloadComponentManagerService {
        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void clearMemoryCacheData(double d) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void clearSqlDownloadCacheData() {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void coverComponent(C84213X3h c84213X3h) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public Context getAppContext() {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public InterfaceC84169X1p getDownloadInterceptor() {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public X3A getReserveWifiStatusListener() {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void initComponent(C84213X3h c84213X3h) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void initDownloadCacheImmediately() {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public boolean isInit() {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void setAppContext(Context context) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void setDownloadDBListener(InterfaceC84209X3d interfaceC84209X3d) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void setDownloadInMultiProcess() {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void setDownloadMemoryInfoListener(InterfaceC84210X3e interfaceC84210X3e) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void setDownloadThreadCheckListener(InterfaceC84208X3c interfaceC84208X3c) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void setReserveWifiStatusListener(X3A x3a) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void submitSingleTask(Runnable runnable) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void unRegisterDownloadReceiver() {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public void updateDownloadInfo(DownloadInfo downloadInfo) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public InterfaceC84214X3i getTTNetHandler() {
            return new C84215X3j();
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService
        public JSONObject getDownloadSetting() {
            return X3U.LIZIZ;
        }
    }

    void clearMemoryCacheData(double d);

    void clearSqlDownloadCacheData();

    void coverComponent(C84213X3h c84213X3h);

    Context getAppContext();

    InterfaceC84169X1p getDownloadInterceptor();

    JSONObject getDownloadSetting();

    X3A getReserveWifiStatusListener();

    InterfaceC84214X3i getTTNetHandler();

    void initComponent(C84213X3h c84213X3h);

    void initDownloadCacheImmediately();

    boolean isInit();

    void setAppContext(Context context);

    void setDownloadDBListener(InterfaceC84209X3d interfaceC84209X3d);

    void setDownloadInMultiProcess();

    void setDownloadMemoryInfoListener(InterfaceC84210X3e interfaceC84210X3e);

    void setDownloadThreadCheckListener(InterfaceC84208X3c interfaceC84208X3c);

    void setReserveWifiStatusListener(X3A x3a);

    void submitSingleTask(Runnable runnable);

    void unRegisterDownloadReceiver();

    void updateDownloadInfo(DownloadInfo downloadInfo);
}
