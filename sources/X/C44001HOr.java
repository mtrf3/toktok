package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.HOr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44001HOr extends AbsDownloadListener {
    public final /* synthetic */ InterfaceC44004HOu LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onCanceled(DownloadInfo downloadInfo) {
        super.onCanceled(downloadInfo);
        try {
            EF7.LIZIZ().getContentResolver().delete(UriProtector.parse(this.LJLILLLLZI), null, null);
        } catch (Exception unused) {
        }
        InterfaceC44004HOu interfaceC44004HOu = this.LJLIL;
        if (interfaceC44004HOu != null) {
            interfaceC44004HOu.onFailed();
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo entity) {
        o.LJIIIZ(entity, "entity");
        super.onProgress(entity);
        InterfaceC44004HOu interfaceC44004HOu = this.LJLIL;
        if (interfaceC44004HOu != null) {
            interfaceC44004HOu.onProgress(entity);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo entity) {
        o.LJIIIZ(entity, "entity");
        super.onSuccessed(entity);
        InterfaceC44004HOu interfaceC44004HOu = this.LJLIL;
        if (interfaceC44004HOu != null) {
            String savePath = entity.getSavePath();
            o.LJIIIIZZ(savePath, "entity.savePath");
            String name = entity.getName();
            o.LJIIIIZZ(name, "entity.name");
            interfaceC44004HOu.LJFF(savePath, name);
        }
    }

    public C44001HOr(InterfaceC44004HOu interfaceC44004HOu, String str) {
        this.LJLIL = interfaceC44004HOu;
        this.LJLILLLLZI = str;
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo entity, BaseException e) {
        o.LJIIIZ(entity, "entity");
        o.LJIIIZ(e, "e");
        super.onFailed(entity, e);
        InterfaceC44004HOu interfaceC44004HOu = this.LJLIL;
        if (interfaceC44004HOu != null) {
            e.getMessage();
            interfaceC44004HOu.onFailed();
        }
    }
}
