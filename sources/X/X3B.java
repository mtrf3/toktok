package X;

import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes16.dex */
public final class X3B implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ X38 LJLJJI;

    public final void LIZ() {
        X3D x3d = this.LJLJJI.LIZ;
        int i = this.LJLIL;
        long j = this.LJLILLLLZI;
        int i2 = this.LJLJI;
        DownloadInfo downloadInfo = x3d.LJII.getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setThrottleNetSpeed(j, i2);
        }
        X3E x3e = X3F.LJIIJJI;
        if (x3e == null) {
            return;
        }
        X4O x4o = (X4O) ((ConcurrentHashMap) x3e.LIZ).get(Integer.valueOf(i));
        if (x4o == null) {
            return;
        }
        if (X4H.LJFF(x4o.LJLLILLLL.getId(), null).LJIIIIZZ("use_default_throttle_speed", 1) != 1) {
            X5F x5f = x4o.LJLLLL;
            if (x5f == null || !(x5f instanceof X3T)) {
                return;
            }
            try {
                ((X3T) x5f).LJII(j);
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        X4V x4v = x4o.LJLJJL;
        if (x4v == null) {
            return;
        }
        DownloadInfo downloadInfo2 = x4v.LIZ;
        if (downloadInfo2 != null) {
            downloadInfo2.setThrottleNetSpeed(j, i2);
        }
        x4v.LJJIIZ = true;
        x4v.LJJIIJZLJL = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public X3B(X38 x38, int i, long j, int i2) {
        this.LJLJJI = x38;
        this.LJLIL = i;
        this.LJLILLLLZI = j;
        this.LJLJI = i2;
    }
}
