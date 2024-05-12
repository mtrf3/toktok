package X;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.LiveReplayVideoPlayerDialogFragment;
import com.zhiliaoapp.musically.R;

/* renamed from: X.SmB, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73079SmB extends C29541Dy {
    public final /* synthetic */ LiveReplayVideoPlayerDialogFragment LIZLLL;

    @Override // X.C29541Dy, X.C0EN
    public final void LIZ(DownloadInfo downloadInfo) {
        ((C239149a2) this.LIZLLL._$_findCachedViewById(R.id.g0f)).LIZIZ();
        C73078SmA.LIZJ(this.LIZLLL.LJLLLLLL);
        if (this.LIZLLL.LJZL) {
            super.LIZ(downloadInfo);
            this.LIZLLL.Hl(R.string.kxn);
        }
    }

    @Override // X.C29541Dy, X.C0EN
    public final void onPause(DownloadInfo downloadInfo) {
        int i;
        super.onPause(downloadInfo);
        C239149a2 c239149a2 = (C239149a2) this.LIZLLL._$_findCachedViewById(R.id.g0f);
        if (downloadInfo != null) {
            i = downloadInfo.getDownloadProcess();
        } else {
            i = 0;
        }
        c239149a2.setPause(i);
        LiveReplayVideoPlayerDialogFragment liveReplayVideoPlayerDialogFragment = this.LIZLLL;
        if (liveReplayVideoPlayerDialogFragment.LJZL) {
            liveReplayVideoPlayerDialogFragment.Hl(R.string.may);
        }
    }

    @Override // X.C29541Dy, X.C0EN
    public final void onProgress(DownloadInfo downloadInfo) {
        super.onProgress(downloadInfo);
        int downloadProcess = downloadInfo.getDownloadProcess();
        LiveReplayVideoPlayerDialogFragment liveReplayVideoPlayerDialogFragment = this.LIZLLL;
        liveReplayVideoPlayerDialogFragment._$_findCachedViewById(R.id.g0f).setVisibility(0);
        ((C239149a2) liveReplayVideoPlayerDialogFragment._$_findCachedViewById(R.id.g0f)).setProgress(downloadProcess);
    }

    @Override // X.C29541Dy, X.C0EN
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        if (this.LIZLLL.LJZL) {
            super.onFailed(downloadInfo, baseException);
            this.LIZLLL.Hl(R.string.lve);
        }
        ((C239149a2) this.LIZLLL._$_findCachedViewById(R.id.g0f)).LIZIZ();
        C73078SmA.LIZJ(this.LIZLLL.LJLLLLLL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73079SmB(LiveReplayVideoPlayerDialogFragment liveReplayVideoPlayerDialogFragment, String str, String str2) {
        super(str, str2, 0);
        this.LIZLLL = liveReplayVideoPlayerDialogFragment;
    }
}
