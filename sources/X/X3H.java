package X;

import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.List;

/* loaded from: classes16.dex */
public final class X3H extends X3I {
    public final /* synthetic */ X4O LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X3H(X4O x4o) {
        super(0);
        this.LIZIZ = x4o;
    }

    @Override // X.X3I, X.X15
    public final void LJJJJZI(List<String> list) {
        boolean z;
        super.LJJJJZI(list);
        X4O x4o = this.LIZIZ;
        x4o.getClass();
        if (list == null || list.isEmpty()) {
            return;
        }
        DownloadInfo downloadInfo = x4o.LJLLILLLL;
        if (x4o.LJLL == EnumC84254X4w.RUN_STATUS_WAITING_ASYNC_HANDLER) {
            z = true;
        } else {
            z = false;
        }
        downloadInfo.setForbiddenBackupUrls(list, z);
        X3D LJIIL = C84212X3g.LJIIL();
        if (LJIIL == null) {
            return;
        }
        LJIIL.LJIJJ(x4o.LJLLILLLL.getId());
    }
}
