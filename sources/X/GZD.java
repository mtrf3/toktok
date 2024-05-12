package X;

import com.ss.android.ugc.aweme.canvas.StreamEditConfigure;
import com.ss.android.ugc.aweme.canvas.VideoDownloadPartialResult;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaKt;
import defpackage.e1;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GZD implements ForwardMediaDownloader.DownloadListener {
    public final /* synthetic */ InterfaceC67352kd<GY8> LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ GZB LIZJ;

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadListener
    public final void onFileHeaderInfoReady(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadListener
    public final void onSuccess(String sourcePath) {
        o.LJIIIZ(sourcePath, "sourcePath");
        C78966Uyw.LJJL(new GY8(sourcePath, null, null, 30), this.LIZ);
    }

    public GZD(C84654XKg c84654XKg, boolean z, GZB gzb) {
        this.LIZ = c84654XKg;
        this.LIZIZ = z;
        this.LIZJ = gzb;
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadListener
    public final void onError(int i, String str, Exception exc, VideoDownloadPartialResult videoDownloadPartialResult) {
        long j;
        if (i == ForwardMediaDownloader.DownloadErrorType.LOCAL_FILE_UNAVAILABLE.getValue() && this.LIZIZ) {
            if (videoDownloadPartialResult != null) {
                j = videoDownloadPartialResult.getCacheSizeFromZero();
            } else {
                j = 0;
            }
            boolean LIZ = e1.LIZ(31744, "creation_stream_edit_wait_header_loaded", true, true);
            C41848Gbc c41848Gbc = C41848Gbc.LIZ;
            GZB gzb = this.LIZJ;
            c41848Gbc.download(gzb.LIZ, gzb.LIZIZ, videoDownloadPartialResult, new GZC(LIZ, this.LIZ, gzb, j, i, str));
            if (!LIZ) {
                C78966Uyw.LJJL(new GY8(ForwardMediaKt.getDownloadUrl(this.LIZJ.LIZ), new StreamEditConfigure(this.LIZJ.LIZIZ.getCacheDir(), this.LIZJ.LIZIZ.getFileName(), null, 4, null), null, 16), this.LIZ);
                return;
            }
            return;
        }
        InterfaceC67352kd<GY8> interfaceC67352kd = this.LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(i);
        LIZ2.append(':');
        LIZ2.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ2);
        C38333F2r c38333F2r = new C38333F2r(i);
        c38333F2r.setErrorMsg(str);
        CancellationException cancellationException = new CancellationException(LIZIZ);
        cancellationException.initCause(c38333F2r);
        C78966Uyw.LJJL(new GY8("", null, cancellationException, 14), interfaceC67352kd);
    }
}
