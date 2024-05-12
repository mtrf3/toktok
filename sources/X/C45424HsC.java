package X;

import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.HsC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C45424HsC implements IDownloadListener {
    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onCanceled(DownloadInfo entity) {
        o.LJIIIZ(entity, "entity");
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        throw null;
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFirstStart(DownloadInfo entity) {
        o.LJIIIZ(entity, "entity");
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFirstSuccess(DownloadInfo entity) {
        o.LJIIIZ(entity, "entity");
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPause(DownloadInfo entity) {
        o.LJIIIZ(entity, "entity");
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPrepare(DownloadInfo entity) {
        o.LJIIIZ(entity, "entity");
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo entity) {
        o.LJIIIZ(entity, "entity");
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onRetry(DownloadInfo entity, BaseException e) {
        o.LJIIIZ(entity, "entity");
        o.LJIIIZ(e, "e");
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onRetryDelay(DownloadInfo entity, BaseException e) {
        o.LJIIIZ(entity, "entity");
        o.LJIIIZ(e, "e");
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onStart(DownloadInfo entity) {
        o.LJIIIZ(entity, "entity");
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onSuccessed(DownloadInfo downloadInfo) {
        throw null;
    }
}
