package X;

import com.bytedance.android.livesdk.browser.dialog.DownloadProgressDialog;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.DownloadInvoiceMethod;
import kotlin.jvm.internal.o;

/* renamed from: X.V8k, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79250V8k implements InterfaceC78910Uy2 {
    public final /* synthetic */ DownloadInvoiceMethod LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LIZ(String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LIZJ(String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LJ(String str, String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LJFF(String... strArr) {
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.InterfaceC78910Uy2
    public final void LIZIZ(String... strArr) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        DownloadProgressDialog downloadProgressDialog = this.LIZ.LJLIL;
        if (downloadProgressDialog != null) {
            downloadProgressDialog.dismiss();
        }
        this.LIZ.finishWithResult(new DownloadInvoiceMethod.Result(0, this.LIZ.LJLJI));
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.InterfaceC78910Uy2
    public final void LIZLLL(String... strArr) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        C0EP LJFF = C0EP.LJFF();
        DownloadInvoiceMethod downloadInvoiceMethod = this.LIZ;
        LJFF.LIZIZ(0, downloadInvoiceMethod.LJLJJL, downloadInvoiceMethod.LJLJJI, this.LIZIZ);
    }

    public C79250V8k(DownloadInvoiceMethod downloadInvoiceMethod, String str) {
        this.LIZ = downloadInvoiceMethod;
        this.LIZIZ = str;
    }
}