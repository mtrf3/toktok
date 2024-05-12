package X;

import android.app.Activity;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.Hjt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44909Hjt implements InterfaceC43172Gwy {
    public final /* synthetic */ C44902Hjm LIZ;

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

    public C44909Hjt(C44902Hjm c44902Hjm) {
        this.LIZ = c44902Hjm;
    }

    @Override // X.InterfaceC43172Gwy
    public final void LJ(android.net.Uri uri) {
        Aweme aweme;
        C44902Hjm c44902Hjm = this.LIZ;
        C44913Hjx c44913Hjx = c44902Hjm.LJFF;
        if (c44913Hjx != null && (aweme = c44913Hjx.LJFF) != null) {
            Activity activity = c44902Hjm.LJ;
            C227738wj.LIZLLL(aweme);
            C44913Hjx c44913Hjx2 = c44902Hjm.LJFF;
            String str = c44913Hjx2.LIZ;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = c44913Hjx2.LIZJ;
            if (str3 != null) {
                str2 = str3;
            }
            C62340OdM.LIZLLL(aweme, activity, uri, str, str2, c44913Hjx2.LIZLLL);
        }
    }
}
