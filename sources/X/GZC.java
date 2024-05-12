package X;

import com.ss.android.ugc.aweme.canvas.StreamEditConfigure;
import com.ss.android.ugc.aweme.services.story.forward.EmptyDownloadListener;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaKt;
import java.util.concurrent.CancellationException;

/* loaded from: classes8.dex */
public final class GZC extends EmptyDownloadListener {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ InterfaceC67352kd<GY8> LIZIZ;
    public final /* synthetic */ GZB LIZJ;
    public final /* synthetic */ int LIZLLL;
    public final /* synthetic */ String LJ;

    @Override // com.ss.android.ugc.aweme.services.story.forward.EmptyDownloadListener, com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadListener
    public final void onFileHeaderInfoReady(boolean z) {
        if (this.LIZ) {
            if (z) {
                C78966Uyw.LJJL(new GY8(ForwardMediaKt.getDownloadUrl(this.LIZJ.LIZ), new StreamEditConfigure(this.LIZJ.LIZIZ.getCacheDir(), this.LIZJ.LIZIZ.getFileName(), null, 4, null), null, 16), this.LIZIZ);
                return;
            }
            InterfaceC67352kd<GY8> interfaceC67352kd = this.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LIZLLL);
            LIZ.append(':');
            LIZ.append(this.LJ);
            String LIZIZ = X1D.LIZIZ(LIZ);
            C38333F2r c38333F2r = new C38333F2r(this.LIZLLL);
            String str = this.LJ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append("|load head info for stream edit error");
            c38333F2r.setErrorMsg(X1D.LIZIZ(LIZ2));
            CancellationException cancellationException = new CancellationException(LIZIZ);
            cancellationException.initCause(c38333F2r);
            C78966Uyw.LJJL(new GY8("", null, cancellationException, 8), interfaceC67352kd);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GZC(boolean z, InterfaceC67352kd<? super GY8> interfaceC67352kd, GZB gzb, long j, int i, String str) {
        this.LIZ = z;
        this.LIZIZ = interfaceC67352kd;
        this.LIZJ = gzb;
        this.LIZLLL = i;
        this.LJ = str;
    }
}
