package X;

import com.ss.android.ugc.aweme.canvas.ForwardVideo;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GZG implements InterfaceC47650In0 {
    public final /* synthetic */ ForwardMediaDownloader.DownloadListener LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ ForwardVideo LIZJ;
    public final /* synthetic */ ForwardMediaDownloader.DownloadConfig LIZLLL;

    @Override // X.InterfaceC47650In0
    public final void onFailed() {
        if (this.LIZIZ) {
            C41821GbB.LIZ(this.LIZJ.getPlayAddressList(), this.LIZLLL.getCacheDir(), this.LIZLLL.getFileName(), this.LIZ);
        } else {
            ForwardMediaDownloader.DownloadListener.DefaultImpls.onError$default(this.LIZ, ForwardMediaDownloader.DownloadErrorType.LOCAL_FILE_UNAVAILABLE.getValue(), null, null, null, 8, null);
        }
    }

    @Override // X.InterfaceC47650In0
    public final void onSuccess(String filePath) {
        o.LJIIIZ(filePath, "filePath");
        this.LIZ.onSuccess(filePath);
    }

    public GZG(ForwardMediaDownloader.DownloadListener downloadListener, boolean z, ForwardVideo forwardVideo, ForwardMediaDownloader.DownloadConfig downloadConfig) {
        this.LIZ = downloadListener;
        this.LIZIZ = z;
        this.LIZJ = forwardVideo;
        this.LIZLLL = downloadConfig;
    }
}
