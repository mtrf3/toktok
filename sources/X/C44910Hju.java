package X;

import android.app.Activity;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.Hju, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44910Hju implements InterfaceC43172Gwy {
    public final /* synthetic */ C44913Hjx LIZ;
    public final /* synthetic */ C44904Hjo LIZIZ;

    @Override // X.InterfaceC43172Gwy
    public final void LIZ() {
    }

    @Override // X.InterfaceC43172Gwy
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC43172Gwy
    public final void LIZJ(String str) {
    }

    @Override // X.InterfaceC43172Gwy
    public final /* synthetic */ void LIZLLL(DownloadInfo downloadInfo) {
    }

    @Override // X.InterfaceC43172Gwy
    public final /* synthetic */ void onCancel() {
    }

    @Override // X.InterfaceC43172Gwy
    public final /* synthetic */ void onProgress(int i) {
    }

    @Override // X.InterfaceC43172Gwy
    public final void LJ(android.net.Uri uri) {
        Aweme aweme;
        C44913Hjx c44913Hjx = this.LIZ;
        if (c44913Hjx != null && (aweme = c44913Hjx.LJFF) != null) {
            Activity activity = this.LIZIZ.LJLIL;
            C227738wj.LIZLLL(aweme);
            String str = c44913Hjx.LIZ;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = c44913Hjx.LIZJ;
            if (str3 != null) {
                str2 = str3;
            }
            C62340OdM.LIZLLL(aweme, activity, uri, str, str2, c44913Hjx.LIZLLL);
        }
    }

    public C44910Hju(C44913Hjx c44913Hjx, C44904Hjo c44904Hjo) {
        this.LIZ = c44913Hjx;
        this.LIZIZ = c44904Hjo;
    }
}
