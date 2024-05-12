package X;

import com.bytedance.android.livesdk.browser.dialog.DownloadProgressDialog;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.DownloadInvoiceMethod;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.V8j, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79249V8j implements C0EN {
    public final String LIZ;
    public final /* synthetic */ DownloadInvoiceMethod LIZIZ;

    @Override // X.C0EN
    public final void onPause(DownloadInfo entity) {
        o.LJIIIZ(entity, "entity");
    }

    @Override // X.C0EN
    public final void LIZ(DownloadInfo entity) {
        o.LJIIIZ(entity, "entity");
        DownloadProgressDialog downloadProgressDialog = this.LIZIZ.LJLIL;
        if (downloadProgressDialog != null) {
            downloadProgressDialog.dismiss();
        }
        this.LIZIZ.finishWithResult(new DownloadInvoiceMethod.Result(1, this.LIZIZ.LJLJI));
    }

    @Override // X.C0EN
    public final void onProgress(DownloadInfo entity) {
        o.LJIIIZ(entity, "entity");
        DownloadProgressDialog downloadProgressDialog = this.LIZIZ.LJLIL;
        if (downloadProgressDialog != null) {
            int downloadProcess = entity.getDownloadProcess();
            C5CT c5ct = downloadProgressDialog.LJLIL;
            if (c5ct != null) {
                c5ct.LJLJLJ = downloadProcess;
            }
        }
    }

    public C79249V8j(DownloadInvoiceMethod downloadInvoiceMethod, String str) {
        this.LIZIZ = downloadInvoiceMethod;
        this.LIZ = str;
    }

    @Override // X.C0EN
    public final void onFailed(DownloadInfo entity, BaseException e) {
        o.LJIIIZ(entity, "entity");
        o.LJIIIZ(e, "e");
        DownloadProgressDialog downloadProgressDialog = this.LIZIZ.LJLIL;
        if (downloadProgressDialog != null) {
            downloadProgressDialog.dismiss();
        }
        C0EP LJFF = C0EP.LJFF();
        String str = this.LIZ;
        DownloadInvoiceMethod downloadInvoiceMethod = this.LIZIZ;
        LJFF.LIZIZ(1, str, downloadInvoiceMethod.LJLJJI, downloadInvoiceMethod.getName());
        this.LIZIZ.finishWithResult(new DownloadInvoiceMethod.Result(0, this.LIZIZ.LJLJI));
    }
}
