package X;

import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: X.Hjl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44901Hjl implements InterfaceC43172Gwy {
    public final /* synthetic */ C44902Hjm LIZ;

    @Override // X.InterfaceC43172Gwy
    public final void LIZ() {
        C44896Hjg.LJIILIIL(null);
    }

    @Override // X.InterfaceC43172Gwy
    public final /* synthetic */ void LJ(android.net.Uri uri) {
    }

    @Override // X.InterfaceC43172Gwy
    public final void LIZIZ() {
        C44896Hjg.LIZ.LJIIL();
    }

    @Override // X.InterfaceC43172Gwy
    public final void onCancel() {
        C44896Hjg.LIZ.onCancel();
    }

    public C44901Hjl(C44902Hjm c44902Hjm) {
        this.LIZ = c44902Hjm;
    }

    @Override // X.InterfaceC43172Gwy
    public final void LIZJ(String str) {
        C44896Hjg.LIZ.LJIILJJIL(str, false, new C44909Hjt(this.LIZ));
    }

    @Override // X.InterfaceC43172Gwy
    public final void LIZLLL(DownloadInfo downloadInfo) {
        C44896Hjg.LJIILIIL(downloadInfo);
    }

    @Override // X.InterfaceC43172Gwy
    public final void onProgress(int i) {
        C44896Hjg.LJIIJJI(i);
    }
}
