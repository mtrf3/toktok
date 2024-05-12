package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayViewModel;
import kotlin.jvm.internal.AqS32S0001000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.KRr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51723KRr extends AbsDownloadListener {
    public final /* synthetic */ ShoutoutsPlayViewModel LJLIL;

    public C51723KRr(ShoutoutsPlayViewModel shoutoutsPlayViewModel) {
        this.LJLIL = shoutoutsPlayViewModel;
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onCanceled(DownloadInfo downloadInfo) {
        super.onCanceled(downloadInfo);
        this.LJLIL.setState(C51724KRs.LJLIL);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo entity) {
        o.LJIIIZ(entity, "entity");
        this.LJLIL.setState(new AqS32S0001000_8((int) ((((float) entity.getCurBytes()) / ((float) entity.getTotalBytes())) * 100), 1));
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo entity) {
        o.LJIIIZ(entity, "entity");
        super.onSuccessed(entity);
        this.LJLIL.setState(C51725KRt.LJLIL);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        super.onFailed(downloadInfo, baseException);
        this.LJLIL.setState(C51722KRq.LJLIL);
    }
}
