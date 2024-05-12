package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.PTy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64522PTy extends AbsDownloadListener {
    public final /* synthetic */ C32420Cnw LJLIL;
    public final /* synthetic */ InterfaceC64509PTl<String> LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo entity) {
        o.LJIIIZ(entity, "entity");
        super.onProgress(entity);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo entity) {
        o.LJIIIZ(entity, "entity");
        PU0 LJI = PU0.LJI();
        long nanoTime = System.nanoTime();
        C32420Cnw c32420Cnw = this.LJLIL;
        Iterator it = ((CopyOnWriteArrayList) LJI.LIZJ).iterator();
        while (it.hasNext()) {
            ((InterfaceC64518PTu) it.next()).LJI(nanoTime, c32420Cnw);
        }
        super.onSuccessed(entity);
        this.LJLILLLLZI.LIZJ(this.LJLIL, this.LJLJI);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo entity, BaseException e) {
        o.LJIIIZ(entity, "entity");
        o.LJIIIZ(e, "e");
        PU0 LJI = PU0.LJI();
        long nanoTime = System.nanoTime();
        C32420Cnw c32420Cnw = this.LJLIL;
        Iterator it = ((CopyOnWriteArrayList) LJI.LIZJ).iterator();
        while (it.hasNext()) {
            ((InterfaceC64518PTu) it.next()).LJI(nanoTime, c32420Cnw);
        }
        super.onFailed(entity, e);
        this.LJLILLLLZI.LIZIZ(this.LJLIL, new C32429Co5(e.getErrorMessage(), e, this.LJLIL, e.getErrorCode(), new C63932P7g(entity.getUrl())));
    }

    public C64522PTy(C32420Cnw c32420Cnw, InterfaceC64509PTl<String> interfaceC64509PTl, String str) {
        this.LJLIL = c32420Cnw;
        this.LJLILLLLZI = interfaceC64509PTl;
        this.LJLJI = str;
    }
}
