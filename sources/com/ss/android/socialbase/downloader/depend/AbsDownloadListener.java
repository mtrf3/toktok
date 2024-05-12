package com.ss.android.socialbase.downloader.depend;

import X.C16880lQ;
import X.C65210PiY;
import X.X1D;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes16.dex */
public abstract class AbsDownloadListener implements IDownloadListener {
    public static final String TAG = C16880lQ.LJLLJ(AbsDownloadListener.class);

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onCanceled(DownloadInfo downloadInfo) {
        if (C65210PiY.LIZ() && downloadInfo != null) {
            String str = TAG;
            int id = downloadInfo.getId();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Name: ");
            LIZ.append(downloadInfo.getName());
            C65210PiY.LIZLLL(id, str, "onCanceled", X1D.LIZIZ(LIZ));
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onFirstStart(DownloadInfo downloadInfo) {
        if (C65210PiY.LIZ() && downloadInfo != null) {
            String str = TAG;
            int id = downloadInfo.getId();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Name: ");
            LIZ.append(downloadInfo.getName());
            C65210PiY.LIZLLL(id, str, "onFirstStart", X1D.LIZIZ(LIZ));
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onFirstSuccess(DownloadInfo downloadInfo) {
        if (C65210PiY.LIZ() && downloadInfo != null) {
            String str = TAG;
            int id = downloadInfo.getId();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Name: ");
            LIZ.append(downloadInfo.getName());
            C65210PiY.LIZLLL(id, str, "onFirstSuccess", X1D.LIZIZ(LIZ));
        }
    }

    public void onIntercept(DownloadInfo downloadInfo) {
        if (C65210PiY.LIZ() && downloadInfo != null) {
            String str = TAG;
            int id = downloadInfo.getId();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Name: ");
            LIZ.append(downloadInfo.getName());
            C65210PiY.LIZLLL(id, str, "onIntercept", X1D.LIZIZ(LIZ));
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onPause(DownloadInfo downloadInfo) {
        if (C65210PiY.LIZ() && downloadInfo != null) {
            String str = TAG;
            int id = downloadInfo.getId();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Name: ");
            LIZ.append(downloadInfo.getName());
            C65210PiY.LIZLLL(id, str, "onPause", X1D.LIZIZ(LIZ));
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onPrepare(DownloadInfo downloadInfo) {
        if (C65210PiY.LIZ() && downloadInfo != null) {
            String str = TAG;
            int id = downloadInfo.getId();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Name: ");
            LIZ.append(downloadInfo.getName());
            C65210PiY.LIZLLL(id, str, "onPrepare", X1D.LIZIZ(LIZ));
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onProgress(DownloadInfo downloadInfo) {
        if (C65210PiY.LIZ() && downloadInfo != null && downloadInfo.getTotalBytes() != 0) {
            float curBytes = (((float) downloadInfo.getCurBytes()) / ((float) downloadInfo.getTotalBytes())) * 100.0f;
            C65210PiY.LIZLLL(downloadInfo.getId(), TAG, "onProgress", C16880lQ.LLLZ("Name: %s %.2f%%", new Object[]{downloadInfo.getName(), Float.valueOf(curBytes)}));
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onStart(DownloadInfo downloadInfo) {
        if (C65210PiY.LIZ() && downloadInfo != null) {
            String str = TAG;
            int id = downloadInfo.getId();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Name: ");
            LIZ.append(downloadInfo.getName());
            C65210PiY.LIZLLL(id, str, "onStart", X1D.LIZIZ(LIZ));
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onSuccessed(DownloadInfo downloadInfo) {
        if (C65210PiY.LIZ() && downloadInfo != null) {
            String str = TAG;
            int id = downloadInfo.getId();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Name: ");
            LIZ.append(downloadInfo.getName());
            LIZ.append(" ");
            LIZ.append(downloadInfo.isSuccessByCache());
            C65210PiY.LIZLLL(id, str, "onSuccessed", X1D.LIZIZ(LIZ));
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        if (C65210PiY.LIZ() && downloadInfo != null) {
            String str2 = TAG;
            int id = downloadInfo.getId();
            Object[] objArr = new Object[2];
            objArr[0] = downloadInfo.getName();
            if (baseException != null) {
                str = baseException.getErrorMessage();
            } else {
                str = "unkown";
            }
            objArr[1] = str;
            C65210PiY.LIZLLL(id, str2, "onFailed", C16880lQ.LLLZ("Name: %s because of : %s", objArr));
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        if (C65210PiY.LIZ() && downloadInfo != null) {
            String str2 = TAG;
            int id = downloadInfo.getId();
            Object[] objArr = new Object[2];
            objArr[0] = downloadInfo.getName();
            if (baseException != null) {
                str = baseException.getErrorMessage();
            } else {
                str = "unkown";
            }
            objArr[1] = str;
            C65210PiY.LIZLLL(id, str2, "onRetry", C16880lQ.LLLZ("Name: %s because of : %s", objArr));
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        if (C65210PiY.LIZ() && downloadInfo != null) {
            String str2 = TAG;
            int id = downloadInfo.getId();
            Object[] objArr = new Object[2];
            objArr[0] = downloadInfo.getName();
            if (baseException != null) {
                str = baseException.getErrorMessage();
            } else {
                str = "unkown";
            }
            objArr[1] = str;
            C65210PiY.LIZLLL(id, str2, "onRetryDelay", C16880lQ.LLLZ("Name: %s because of : %s", objArr));
        }
    }
}
