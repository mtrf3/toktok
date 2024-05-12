package X;

import com.ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.ObR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62221ObR implements InterfaceC43172Gwy {
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

    /* JADX WARN: Multi-variable type inference failed */
    public C62221ObR(InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LIZ = interfaceC88472Yns;
        this.LIZIZ = interfaceC65784Pro;
    }
}
