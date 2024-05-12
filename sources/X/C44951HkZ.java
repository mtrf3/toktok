package X;

import android.app.Activity;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.improve.pkg.PhotoSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.HkZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C44951HkZ implements InterfaceC43172Gwy {
    public final Activity LIZ;
    public final Aweme LIZIZ;
    public final SharePackage LIZJ;
    public final AlertDialogC45396Hrk LIZLLL;

    @Override // X.InterfaceC43172Gwy
    public final void LIZ() {
    }

    @Override // X.InterfaceC43172Gwy
    public final /* synthetic */ void LJ(android.net.Uri uri) {
    }

    @Override // X.InterfaceC43172Gwy
    public final void onCancel() {
        C62233Obd.LIZ(this.LIZ, this.LIZLLL);
    }

    @Override // X.InterfaceC43172Gwy
    public void LIZJ(String str) {
        C62233Obd.LIZ(this.LIZ, this.LIZLLL);
    }

    @Override // X.InterfaceC43172Gwy
    public void LIZLLL(DownloadInfo downloadInfo) {
        this.LIZLLL.LIZJ(0);
        Aweme aweme = this.LIZIZ;
        if (aweme != null) {
            C62340OdM.LJIJI(this.LIZ, aweme, this.LIZJ, this.LIZLLL);
        }
    }

    @Override // X.InterfaceC43172Gwy
    public final void onProgress(int i) {
        AlertDialogC45396Hrk alertDialogC45396Hrk = this.LIZLLL;
        if (alertDialogC45396Hrk.isShowing()) {
            alertDialogC45396Hrk.LIZJ(i);
        }
    }

    public C44951HkZ(Activity activity, Aweme aweme, PhotoSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        this.LIZ = activity;
        this.LIZIZ = aweme;
        this.LIZJ = sharePackage;
        this.LIZLLL = AlertDialogC45396Hrk.LIZLLL(activity, activity.getResources().getString(R.string.q_k), R.style.hq);
    }
}
