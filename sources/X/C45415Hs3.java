package X;

import Y.ACallableS110S0100000_7;
import Y.ARunnableS11S0101000_7;
import Y.ARunnableS26S0200000_7;
import android.app.Activity;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity;
import com.ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import java.io.File;

/* renamed from: X.Hs3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45415Hs3 extends AbsDownloadListener {
    public final /* synthetic */ Activity LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ C45417Hs5 LJLJJLL;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
        super.onProgress(downloadInfo);
        int curBytes = (int) ((downloadInfo.getCurBytes() * 100) / downloadInfo.getTotalBytes());
        C45417Hs5 c45417Hs5 = this.LJLJJLL;
        c45417Hs5.getClass();
        C10K.LIZIZ(new ACallableS110S0100000_7((Runnable) new ARunnableS11S0101000_7(curBytes, c45417Hs5, 7), 24), C10K.LJIIIIZZ, null);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onStart(DownloadInfo downloadInfo) {
        super.onStart(downloadInfo);
        C45417Hs5 c45417Hs5 = this.LJLJJLL;
        Activity activity = this.LJLIL;
        c45417Hs5.getClass();
        C10K.LIZIZ(new ACallableS110S0100000_7((Runnable) new ARunnableS26S0200000_7(activity, c45417Hs5, 11), 24), C10K.LJIIIIZZ, null);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        final String LIZIZ;
        super.onSuccessed(downloadInfo);
        if (downloadInfo.getSavePath().endsWith("/")) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(downloadInfo.getSavePath());
            LIZ.append(downloadInfo.getName());
            LIZIZ = X1D.LIZIZ(LIZ);
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(downloadInfo.getSavePath());
            LIZ2.append(File.separator);
            LIZ2.append(downloadInfo.getName());
            LIZIZ = X1D.LIZIZ(LIZ2);
        }
        final C45417Hs5 c45417Hs5 = this.LJLJJLL;
        final Activity activity = this.LJLIL;
        final Aweme aweme = this.LJLILLLLZI;
        final String str = this.LJLJI;
        final String str2 = this.LJLJJI;
        c45417Hs5.getClass();
        C10K.LIZIZ(new ACallableS110S0100000_7(new Runnable() { // from class: X.Hs4
            @Override // java.lang.Runnable
            public final void run() {
                C45417Hs5 c45417Hs52 = C45417Hs5.this;
                Activity activity2 = activity;
                Aweme aweme2 = aweme;
                String str3 = LIZIZ;
                String str4 = str;
                String str5 = str2;
                c45417Hs52.getClass();
                if (activity2.isFinishing()) {
                    return;
                }
                A90 a90 = c45417Hs52.LIZIZ;
                if (a90 != null) {
                    a90.dismiss();
                }
                VideoShare2GifEditActivity.LLFII(activity2, aweme2.getAid(), aweme2.getAuthorUid(), C45417Hs5.LIZJ(aweme2), str3, str4, str5);
                FeedPanelStateViewModel feedPanelStateViewModel = c45417Hs52.LIZ;
                if (feedPanelStateViewModel == null) {
                    return;
                }
                feedPanelStateViewModel.LJLJLLL.setValue(false);
            }
        }, 24), C10K.LJIIIIZZ, null);
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("tools_use_downloader", Boolean.TRUE);
        c198517qh.LIZ.put("url", this.LJLJJL);
        c198517qh.LIZ.put("from", "gifshare");
        C09900aA.LJIIJJI("aweme_download_error_rate", 0, c198517qh.LJ());
        C45441HsT.LIZIZ(this.LJLILLLLZI, "gif", this.LJLJJL, 1);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        super.onFailed(downloadInfo, baseException);
        C45417Hs5 c45417Hs5 = this.LJLJJLL;
        Activity activity = this.LJLIL;
        c45417Hs5.getClass();
        C10K.LIZIZ(new ACallableS110S0100000_7((Runnable) new RunnableC45421Hs9(4, c45417Hs5, activity), 24), C10K.LJIIIIZZ, null);
        if (baseException != null) {
            str = J7I.LJII(baseException);
        } else {
            str = "null exception";
        }
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("tools_use_downloader", Boolean.TRUE);
        c198517qh.LIZ.put("url", this.LJLJJL);
        c198517qh.LIZ.put("from", "gifshare");
        c198517qh.LIZ.put("exception", str);
        C09900aA.LJIIJJI("aweme_download_error_rate", 1, c198517qh.LJ());
    }

    public C45415Hs3(C45417Hs5 c45417Hs5, Activity activity, Aweme aweme, String str, String str2, String str3) {
        this.LJLJJLL = c45417Hs5;
        this.LJLIL = activity;
        this.LJLILLLLZI = aweme;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
    }
}
