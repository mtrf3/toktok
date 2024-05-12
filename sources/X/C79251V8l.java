package X;

import com.bytedance.android.livesdk.browser.jsbridge.newmethods.DownloadInvoiceMethod;
import kotlin.jvm.internal.o;

/* renamed from: X.V8l, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79251V8l implements InterfaceC78910Uy2 {
    public final /* synthetic */ DownloadInvoiceMethod LIZ;

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

    public C79251V8l(DownloadInvoiceMethod downloadInvoiceMethod) {
        this.LIZ = downloadInvoiceMethod;
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.InterfaceC78910Uy2
    public final void LIZIZ(String... strArr) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
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
        LJFF.LIZIZ(1, downloadInvoiceMethod.LJLJJL, downloadInvoiceMethod.LJLJJI, downloadInvoiceMethod.getName());
    }
}
