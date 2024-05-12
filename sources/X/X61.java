package X;

import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.io.File;
import java.io.FileInputStream;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X61 implements IDownloadListener {
    public final /* synthetic */ X60 LJLIL;
    public final /* synthetic */ X63 LJLILLLLZI;

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFirstStart(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFirstSuccess(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPrepare(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onCanceled(DownloadInfo entity) {
        String str;
        VNB third;
        o.LJIIJ(entity, "entity");
        OSJ<String, DownloadTask, VNB> osj = this.LJLIL.LIZIZ.get(entity.getUrl());
        if (osj == null || (str = osj.getFirst()) == null) {
            str = "";
        }
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZIZ = C25620zW.LIZIZ("[Cancel][SDK][", str, "][StatusCode：");
        LIZIZ.append(entity.getHttpStatusCode());
        LIZIZ.append("][Duration:");
        LIZIZ.append(entity.getDownloadTime());
        LIZIZ.append(']');
        String LIZIZ2 = X1D.LIZIZ(LIZIZ);
        c12310e3.getClass();
        C12310e3.LIZIZ("JKL", LIZIZ2, null);
        OSJ<String, DownloadTask, VNB> osj2 = this.LJLIL.LIZIZ.get(entity.getUrl());
        if (osj2 != null && (third = osj2.getThird()) != null) {
            third.LIZIZ = 600;
            third.LIZJ = new C78855Ux9();
            third.LIZLLL = -3L;
        }
        X60 x60 = this.LJLIL;
        String url = entity.getUrl();
        o.LJFF(url, "entity.url");
        x60.LIZIZ.remove(url);
        this.LJLIL.LIZLLL(entity.getId());
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPause(DownloadInfo entity) {
        String str;
        VNB third;
        o.LJIIJ(entity, "entity");
        OSJ<String, DownloadTask, VNB> osj = this.LJLIL.LIZIZ.get(entity.getUrl());
        if (osj == null || (str = osj.getFirst()) == null) {
            str = "";
        }
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZIZ = C25620zW.LIZIZ("[Pause][SDK][", str, "][NetworkCode:");
        LIZIZ.append(entity.getHttpStatusCode());
        LIZIZ.append("][Progress:");
        LIZIZ.append(entity.getDownloadProcess());
        LIZIZ.append(']');
        String LIZIZ2 = X1D.LIZIZ(LIZIZ);
        c12310e3.getClass();
        C12310e3.LIZLLL("JKL", LIZIZ2);
        OSJ<String, DownloadTask, VNB> osj2 = this.LJLIL.LIZIZ.get(entity.getUrl());
        if (osj2 != null && (third = osj2.getThird()) != null) {
            third.LIZIZ = 206;
            third.LIZJ = new C78855Ux9();
            third.LIZLLL = -2L;
        }
        this.LJLIL.LIZLLL(entity.getId());
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo entity) {
        o.LJIIJ(entity, "entity");
        X63 x63 = this.LJLILLLLZI;
        if (x63 != null) {
            x63.onProgress(entity.getDownloadProcess(), entity.getTotalBytes());
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onStart(DownloadInfo entity) {
        String str;
        o.LJIIJ(entity, "entity");
        OSJ<String, DownloadTask, VNB> osj = this.LJLIL.LIZIZ.get(entity.getUrl());
        if (osj == null || (str = osj.getFirst()) == null) {
            str = "";
        }
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[Start][SDK][");
        LIZ.append(str);
        LIZ.append(']');
        String LIZIZ = X1D.LIZIZ(LIZ);
        c12310e3.getClass();
        C12310e3.LIZ("JKL", LIZIZ);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo entity) {
        String str;
        VNB third;
        o.LJIIJ(entity, "entity");
        OSJ<String, DownloadTask, VNB> osj = this.LJLIL.LIZIZ.get(entity.getUrl());
        if (osj == null || (str = osj.getFirst()) == null) {
            str = "";
        }
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZIZ = C25620zW.LIZIZ("[Suc][SDK][", str, "][StatusCode:");
        LIZIZ.append(entity.getHttpStatusCode());
        LIZIZ.append("][TotalSize:");
        LIZIZ.append(entity.getTotalBytes());
        LIZIZ.append(']');
        LIZIZ.append("[Duration:");
        LIZIZ.append(entity.getDownloadTime());
        LIZIZ.append(']');
        String LIZIZ2 = X1D.LIZIZ(LIZIZ);
        c12310e3.getClass();
        C12310e3.LIZ("JKL", LIZIZ2);
        FileInputStream fileInputStream = new FileInputStream(new File(entity.getTargetFilePath()));
        VXI vxi = new VXI(new VXH(fileInputStream, fileInputStream));
        OSJ<String, DownloadTask, VNB> osj2 = this.LJLIL.LIZIZ.get(entity.getUrl());
        if (osj2 != null && (third = osj2.getThird()) != null) {
            third.LIZIZ = 200;
            third.LIZJ = vxi;
            third.LIZLLL = entity.getTotalBytes();
        }
        X60 x60 = this.LJLIL;
        String url = entity.getUrl();
        o.LJFF(url, "entity.url");
        x60.LIZIZ.remove(url);
        this.LJLIL.LIZLLL(entity.getId());
    }

    public X61(X60 x60, X63 x63) {
        this.LJLIL = x60;
        this.LJLILLLLZI = x63;
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo entity, BaseException e) {
        String str;
        VNB third;
        int httpStatusCode;
        o.LJIIJ(entity, "entity");
        o.LJIIJ(e, "e");
        OSJ<String, DownloadTask, VNB> osj = this.LJLIL.LIZIZ.get(entity.getUrl());
        if (osj == null || (str = osj.getFirst()) == null) {
            str = "";
        }
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZIZ = C25620zW.LIZIZ("[Fail][SDK][", str, "][Duration:");
        LIZIZ.append(entity.getDownloadTime());
        LIZIZ.append(']');
        LIZIZ.append("[StatusCode:");
        LIZIZ.append(entity.getHttpStatusCode());
        LIZIZ.append("][Size：");
        LIZIZ.append(entity.getExpectFileLength());
        LIZIZ.append("][ErrorMsg:");
        LIZIZ.append(e.getErrorMessage());
        LIZIZ.append(']');
        String LIZIZ2 = X1D.LIZIZ(LIZIZ);
        c12310e3.getClass();
        C12310e3.LIZIZ("JKL", LIZIZ2, null);
        OSJ<String, DownloadTask, VNB> osj2 = this.LJLIL.LIZIZ.get(entity.getUrl());
        if (osj2 != null && (third = osj2.getThird()) != null) {
            if (entity.getHttpStatusCode() == 200) {
                httpStatusCode = 601;
            } else {
                httpStatusCode = entity.getHttpStatusCode();
            }
            third.LIZIZ = httpStatusCode;
            third.LIZJ = new C78855Ux9();
            third.LIZLLL = -1L;
            third.LJ = e.getErrorMessage();
        }
        C16880lQ.LLLLIIL(e);
        X60 x60 = this.LJLIL;
        String url = entity.getUrl();
        o.LJFF(url, "entity.url");
        x60.LIZIZ.remove(url);
        this.LJLIL.LIZLLL(entity.getId());
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onRetry(DownloadInfo entity, BaseException baseException) {
        o.LJIIJ(entity, "entity");
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[Retry][SDK] : ");
        LIZ.append(entity.getId());
        String LIZIZ = X1D.LIZIZ(LIZ);
        c12310e3.getClass();
        C12310e3.LIZIZ("JKL", LIZIZ, null);
    }
}
