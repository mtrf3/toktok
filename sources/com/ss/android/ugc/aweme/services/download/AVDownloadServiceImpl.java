package com.ss.android.ugc.aweme.services.download;

import X.C45419Hs7;
import X.C60903NvH;
import X.C84261X5d;
import X.HH1;
import X.InterfaceC45420Hs8;
import X.X1D;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ujb.o;

/* loaded from: classes8.dex */
public final class AVDownloadServiceImpl implements InterfaceC45420Hs8 {
    public static final Companion Companion = new Companion();

    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final String getFullFilePath(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return "";
        }
        String savePath = downloadInfo.getSavePath();
        if (savePath != null && o.LJJJJ(savePath, "/", false)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(downloadInfo.getSavePath());
            LIZ.append(downloadInfo.getName());
            return X1D.LIZIZ(LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(downloadInfo.getSavePath());
        LIZ2.append(File.separator);
        LIZ2.append(downloadInfo.getName());
        return X1D.LIZIZ(LIZ2);
    }

    @Override // X.InterfaceC45420Hs8
    public void downloadFile(String str, String str2, String str3, final C45419Hs7 c45419Hs7) {
        HH1.LIZ(str, "url", str2, "filePath", str3, "fileName");
        DownloadTask with = C84261X5d.with(C60903NvH.LJ);
        with.url(str);
        with.savePath(str2);
        with.name(str3);
        with.subThreadListener(new AbsDownloadListener() { // from class: com.ss.android.ugc.aweme.services.download.AVDownloadServiceImpl$downloadFile$1
            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public void onProgress(DownloadInfo downloadInfo) {
                super.onProgress(downloadInfo);
                if (downloadInfo != null) {
                    downloadInfo.getCurBytes();
                    downloadInfo.getTotalBytes();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public void onStart(DownloadInfo downloadInfo) {
                super.onStart(downloadInfo);
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public void onSuccessed(DownloadInfo downloadInfo) {
                String str4;
                super.onSuccessed(downloadInfo);
                C45419Hs7 c45419Hs72 = C45419Hs7.this;
                if (c45419Hs72 != null) {
                    if (downloadInfo == null || (str4 = downloadInfo.getUrl()) == null) {
                        str4 = "";
                    }
                    c45419Hs72.LIZIZ(str4, this.getFullFilePath(downloadInfo));
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                super.onFailed(downloadInfo, baseException);
                C45419Hs7 c45419Hs72 = C45419Hs7.this;
                if (c45419Hs72 != null) {
                    if (baseException != null) {
                        baseException.getErrorMessage();
                        baseException.getErrorCode();
                    }
                    c45419Hs72.LIZ();
                }
            }
        });
        with.download();
    }
}
