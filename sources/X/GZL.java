package X;

import com.ss.android.ugc.aweme.canvas.VideoDownloadPartialResult;
import com.ss.android.ugc.aweme.services.story.forward.ForwardImageDownloader;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GZL implements ForwardMediaDownloader.DownloadListener {
    public final /* synthetic */ InterfaceC67352kd<String> LIZ;
    public final /* synthetic */ ForwardImageDownloader.ImageDownloadListener LIZIZ;

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadListener
    public final void onFileHeaderInfoReady(boolean z) {
        this.LIZIZ.onFileHeaderInfoReady(z);
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadListener
    public final void onSuccess(String sourcePath) {
        o.LJIIIZ(sourcePath, "sourcePath");
        InterfaceC67352kd<String> interfaceC67352kd = this.LIZ;
        C3C5.m7constructorimpl(sourcePath);
        interfaceC67352kd.resumeWith(sourcePath);
    }

    public GZL(C84654XKg c84654XKg, ForwardImageDownloader.ImageDownloadListener imageDownloadListener) {
        this.LIZ = c84654XKg;
        this.LIZIZ = imageDownloadListener;
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadListener
    public final void onError(int i, String str, Exception exc, VideoDownloadPartialResult videoDownloadPartialResult) {
        C76800UCe c76800UCe;
        ForwardImageDownloader.ImageDownloadListener.DefaultImpls.onError$default(this.LIZIZ, i, str, exc, null, 8, null);
        InterfaceC67352kd<String> interfaceC67352kd = this.LIZ;
        StringBuilder LIZ = C06830Op.LIZ("down_image_fail code:", i, " msg:", str, " exception:");
        if (exc != null) {
            C16880lQ.LLLLIIL(exc);
            c76800UCe = C76800UCe.LIZ;
        } else {
            c76800UCe = null;
        }
        LIZ.append(c76800UCe);
        OUR.LJ(new Throwable(X1D.LIZIZ(LIZ)), interfaceC67352kd);
    }
}
