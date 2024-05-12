package X;

import com.bytedance.pitaya.bdcomponentimpl.network.DownloaderFileDownloaderImpl;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.HashSet;

/* renamed from: X.aPD, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class C93335aPD extends AbsDownloadListener {
    public final /* synthetic */ InterfaceC93313aOr LJLIL;

    public C93335aPD(InterfaceC93313aOr interfaceC93313aOr) {
        this.LJLIL = interfaceC93313aOr;
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        String str;
        InterfaceC93313aOr interfaceC93313aOr = this.LJLIL;
        if (downloadInfo != null) {
            str = downloadInfo.getUrl();
        } else {
            str = null;
        }
        interfaceC93313aOr.onSuccess(str);
        C93267aO7 c93267aO7 = DownloaderFileDownloaderImpl.Companion;
        c93267aO7.getClass();
        HashSet<Integer> hashSet = DownloaderFileDownloaderImpl.downloadingIds;
        synchronized (hashSet) {
            if (downloadInfo != null) {
                int id = downloadInfo.getId();
                c93267aO7.getClass();
                hashSet.remove(Integer.valueOf(id));
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        InterfaceC93313aOr interfaceC93313aOr = this.LJLIL;
        String str2 = null;
        if (downloadInfo != null) {
            str = downloadInfo.getUrl();
        } else {
            str = null;
        }
        if (baseException != null) {
            str2 = baseException.getErrorMessage();
        }
        interfaceC93313aOr.onFail(str, str2);
        C93267aO7 c93267aO7 = DownloaderFileDownloaderImpl.Companion;
        c93267aO7.getClass();
        HashSet<Integer> hashSet = DownloaderFileDownloaderImpl.downloadingIds;
        synchronized (hashSet) {
            if (downloadInfo != null) {
                int id = downloadInfo.getId();
                c93267aO7.getClass();
                hashSet.remove(Integer.valueOf(id));
            }
        }
    }
}
