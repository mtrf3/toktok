package X;

import com.ss.android.ugc.aweme.canvas.VideoDownloadPartialResult;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GZ9 implements ForwardMediaDownloader.DownloadListener {
    public final /* synthetic */ CreativeInfo LIZ;
    public final /* synthetic */ ForwardMediaDownloader.DownloadConfig LIZIZ;
    public final /* synthetic */ C3CK<String> LIZJ;

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadListener
    public final void onFileHeaderInfoReady(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadListener
    public final void onSuccess(String sourcePath) {
        o.LJIIIZ(sourcePath, "sourcePath");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C43073GvN.LIZLLL(C62850Ola.LJ(), this.LIZ, EnumC43649HBd.CONCAT, null, false, 12));
        LIZ.append(this.LIZIZ.getFileName());
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (C44694HgQ.LIZJ(sourcePath, LIZIZ)) {
            sourcePath = LIZIZ;
        }
        C41700GYe.LJIIIZ(this.LIZJ, sourcePath);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GZ9(CreativeInfo creativeInfo, ForwardMediaDownloader.DownloadConfig downloadConfig, C3CK<? super String> c3ck) {
        this.LIZ = creativeInfo;
        this.LIZIZ = downloadConfig;
        this.LIZJ = c3ck;
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadListener
    public final void onError(int i, String str, Exception exc, VideoDownloadPartialResult videoDownloadPartialResult) {
        C3CK<String> c3ck = this.LIZJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(i);
        LIZ.append(':');
        LIZ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ);
        C38333F2r c38333F2r = new C38333F2r(i);
        c38333F2r.setErrorMsg(str);
        CancellationException cancellationException = new CancellationException(LIZIZ);
        cancellationException.initCause(c38333F2r);
        C48841JEv.LIZJ(c3ck, cancellationException);
    }
}
