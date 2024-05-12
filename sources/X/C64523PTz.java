package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.PTz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64523PTz extends AbsDownloadListener {
    public final /* synthetic */ C64520PTw LJLIL;
    public final /* synthetic */ C32420Cnw LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ InterfaceC64509PTl<String> LJLJJI;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo entity) {
        o.LJIIIZ(entity, "entity");
        super.onProgress(entity);
        int curBytes = (int) ((((float) entity.getCurBytes()) / ((float) entity.getTotalBytes())) * 100);
        QZP.LIZJ("Progress ", curBytes, "ColdDataDownloadProducer");
        this.LJLJJI.LIZ(this.LJLILLLLZI, curBytes);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo entity) {
        o.LJIIIZ(entity, "entity");
        super.onSuccessed(entity);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("produce thread ");
        LIZ.append(C16880lQ.LLLLIIIILLL());
        C0NB.LJIIIZ("ColdDataDownloadProducer", X1D.LIZIZ(LIZ));
        C64520PTw c64520PTw = this.LJLIL;
        InterfaceC64509PTl<String> interfaceC64509PTl = c64520PTw.LIZIZ;
        if (interfaceC64509PTl != null) {
            C32420Cnw c32420Cnw = this.LJLILLLLZI;
            interfaceC64509PTl.LIZJ(c32420Cnw, c64520PTw.LIZ.LIZIZ(c32420Cnw));
        }
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.LJLJI);
        String LIZ2 = this.LJLILLLLZI.LIZ();
        o.LJIIIIZZ(LIZ2, "request.nextUrl");
        C77285UUv.LIZJ(millis, LIZ2, null, 0);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo entity, BaseException e) {
        o.LJIIIZ(entity, "entity");
        o.LJIIIZ(e, "e");
        super.onFailed(entity, e);
        C32429Co5 c32429Co5 = new C32429Co5(e.getErrorMessage(), e, this.LJLILLLLZI, e.getErrorCode(), new C63932P7g(entity.getUrl()));
        InterfaceC64509PTl<String> interfaceC64509PTl = this.LJLIL.LIZIZ;
        if (interfaceC64509PTl != null) {
            interfaceC64509PTl.LIZIZ(this.LJLILLLLZI, c32429Co5);
        }
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.LJLJI);
        String LIZ = this.LJLILLLLZI.LIZ();
        o.LJIIIIZZ(LIZ, "request.nextUrl");
        C77285UUv.LIZJ(millis, LIZ, e.getErrorMessage(), Integer.valueOf(e.getErrorCode()));
    }

    public C64523PTz(C64520PTw c64520PTw, C32420Cnw c32420Cnw, long j, InterfaceC64509PTl<String> interfaceC64509PTl) {
        this.LJLIL = c64520PTw;
        this.LJLILLLLZI = c32420Cnw;
        this.LJLJI = j;
        this.LJLJJI = interfaceC64509PTl;
    }
}
