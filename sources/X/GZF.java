package X;

import com.ss.android.ugc.aweme.canvas.ForwardVideo;
import com.ss.android.ugc.aweme.canvas.VideoDownloadPartialResult;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;

/* loaded from: classes8.dex */
public final class GZF implements InterfaceC47084Ids {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ ForwardVideo LJLILLLLZI;
    public final /* synthetic */ ForwardMediaDownloader.DownloadConfig LJLJI;
    public final /* synthetic */ ForwardMediaDownloader.DownloadListener LJLJJI;
    public final /* synthetic */ C68322mC<VideoDownloadPartialResult> LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    @Override // X.InterfaceC47084Ids
    public final void LJIILJJIL(int i) {
        LIZ(i, null);
    }

    public final void LIZ(int i, VideoDownloadPartialResult videoDownloadPartialResult) {
        if (this.LJLIL) {
            C41821GbB.LIZ(this.LJLILLLLZI.getPlayAddressList(), this.LJLJI.getCacheDir(), this.LJLJI.getFileName(), this.LJLJJI);
        } else {
            this.LJLJJI.onError(i, null, null, videoDownloadPartialResult);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.ss.android.ugc.aweme.canvas.VideoDownloadPartialResult, T] */
    @Override // X.InterfaceC47084Ids
    public final void LJIIJ(long j, long j2) {
        this.LJLJJL.element = new VideoDownloadPartialResult(j, j2, this.LJLJJLL);
    }

    @Override // X.InterfaceC47084Ids
    public final void LJIILIIL(boolean z, String str) {
        VideoDownloadPartialResult videoDownloadPartialResult = this.LJLJJL.element;
        if (z) {
            if (!this.LJLJI.getForceCopyUnfinished() || videoDownloadPartialResult == null || (videoDownloadPartialResult.getMediaSize() > 0 && videoDownloadPartialResult.getMediaSize() == videoDownloadPartialResult.getCacheSizeFromZero())) {
                this.LJLJJI.onSuccess(this.LJLJJLL);
                return;
            } else {
                LIZ(ForwardMediaDownloader.DownloadErrorType.LOCAL_FILE_UNAVAILABLE.getValue(), videoDownloadPartialResult);
                return;
            }
        }
        LIZ(ForwardMediaDownloader.DownloadErrorType.LOCAL_FILE_UNAVAILABLE.getValue(), videoDownloadPartialResult);
    }

    public GZF(boolean z, ForwardVideo forwardVideo, ForwardMediaDownloader.DownloadConfig downloadConfig, ForwardMediaDownloader.DownloadListener downloadListener, C68322mC<VideoDownloadPartialResult> c68322mC, String str) {
        this.LJLIL = z;
        this.LJLILLLLZI = forwardVideo;
        this.LJLJI = downloadConfig;
        this.LJLJJI = downloadListener;
        this.LJLJJL = c68322mC;
        this.LJLJJLL = str;
    }
}
