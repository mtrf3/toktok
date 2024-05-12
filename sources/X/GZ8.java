package X;

import android.content.Context;
import com.ss.android.ugc.aweme.canvas.VideoDownloadPartialResult;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.services.story.forward.ForwardConfig;
import com.ss.android.ugc.aweme.services.story.forward.ForwardImageDownloader;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMedia;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GZ8 implements ForwardImageDownloader.ImageDownloadListener {
    public final /* synthetic */ List<ForwardMediaDownloader.DownloadConfig> LIZ;
    public final /* synthetic */ C3CK<C41703GYh> LIZIZ;
    public final /* synthetic */ CreativeInfo LIZJ;
    public final /* synthetic */ ForwardMedia LIZLLL;
    public final /* synthetic */ ForwardConfig LJ;
    public final /* synthetic */ Context LJFF;

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardImageDownloader.ImageDownloadListener
    public final void onFileHeaderInfoReady(boolean z) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardImageDownloader.ImageDownloadListener
    public final void onSuccess(List<String> sourcePath) {
        o.LJIIIZ(sourcePath, "sourcePath");
        List LLJJIII = ORZ.LLJJIII(sourcePath, this.LIZ);
        CreativeInfo creativeInfo = this.LIZJ;
        ArrayList arrayList = new ArrayList(C32I.LJJL(LLJJIII, 10));
        Iterator it = ((ArrayList) LLJJIII).iterator();
        while (it.hasNext()) {
            OSZ osz = (OSZ) it.next();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C43073GvN.LIZLLL(C62850Ola.LJ(), creativeInfo, EnumC43649HBd.CONCAT, null, false, 12));
            LIZ.append(((ForwardMediaDownloader.DownloadConfig) osz.getSecond()).getFileName());
            ?? LIZIZ = X1D.LIZIZ(LIZ);
            if (!C44694HgQ.LIZJ((String) osz.getFirst(), LIZIZ)) {
                LIZIZ = osz.getFirst();
            }
            arrayList.add(LIZIZ);
        }
        C41700GYe.LJIIIZ(this.LIZIZ, new C41703GYh(this.LIZJ, this.LIZLLL, this.LJ, C161986Xi.LIZ(this.LJFF), arrayList));
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardImageDownloader.ImageDownloadListener
    public final void onError(int i, String str, Exception exc, VideoDownloadPartialResult videoDownloadPartialResult) {
        C3CK<C41703GYh> c3ck = this.LIZIZ;
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

    /* JADX WARN: Multi-variable type inference failed */
    public GZ8(List<ForwardMediaDownloader.DownloadConfig> list, C3CK<? super C41703GYh> c3ck, CreativeInfo creativeInfo, ForwardMedia forwardMedia, ForwardConfig forwardConfig, Context context) {
        this.LIZ = list;
        this.LIZIZ = c3ck;
        this.LIZJ = creativeInfo;
        this.LIZLLL = forwardMedia;
        this.LJ = forwardConfig;
        this.LJFF = context;
    }
}
