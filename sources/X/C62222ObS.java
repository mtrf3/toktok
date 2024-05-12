package X;

import com.ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.ObS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62222ObS implements InterfaceC43172Gwy {
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LIZ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZIZ;

    @Override // X.InterfaceC43172Gwy
    public final void LIZ() {
    }

    @Override // X.InterfaceC43172Gwy
    public final /* synthetic */ void LIZLLL(DownloadInfo downloadInfo) {
    }

    @Override // X.InterfaceC43172Gwy
    public final /* synthetic */ void LJ(android.net.Uri uri) {
    }

    @Override // X.InterfaceC43172Gwy
    public final void onCancel() {
    }

    @Override // X.InterfaceC43172Gwy
    public final /* synthetic */ void onProgress(int i) {
    }

    @Override // X.InterfaceC43172Gwy
    public final void LIZIZ() {
        this.LIZIZ.invoke();
    }

    @Override // X.InterfaceC43172Gwy
    public final void LIZJ(String outPath) {
        o.LJIIIZ(outPath, "outPath");
        this.LIZ.invoke(outPath);
    }

    public C62222ObS(C62219ObP c62219ObP, AqS151S0100000_1 aqS151S0100000_1) {
        this.LIZ = c62219ObP;
        this.LIZIZ = aqS151S0100000_1;
    }
}
