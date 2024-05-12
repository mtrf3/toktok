package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.legoImp.task.TrafficDeteriorationTask;
import com.ss.android.ugc.aweme.services.TrafficStatisticsServiceImpl;
import java.io.File;

/* renamed from: X.Fnh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40049Fnh extends AbsDownloadListener {
    public final /* synthetic */ String LJLIL;

    public C40049Fnh(String str) {
        this.LJLIL = str;
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        try {
            if (TrafficDeteriorationTask.LJLIL) {
                C56463MDz.LJI(new File(this.LJLIL));
            }
            TrafficStatisticsServiceImpl.createITrafficStatisticsbyMonsterPlugin(false).addRecord(downloadInfo.getCurBytes(), C12460eI.LJFF(), "redundancy", downloadInfo.getAllConnectTime());
        } catch (Exception unused) {
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        super.onFailed(downloadInfo, baseException);
        try {
            if (TrafficDeteriorationTask.LJLIL) {
                C56463MDz.LJI(new File(this.LJLIL));
            }
            TrafficStatisticsServiceImpl.createITrafficStatisticsbyMonsterPlugin(false).addRecord(downloadInfo.getCurBytes(), C12460eI.LJFF(), "redundancy", downloadInfo.getAllConnectTime());
        } catch (Exception unused) {
        }
    }
}
