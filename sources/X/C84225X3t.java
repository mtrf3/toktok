package X;

import android.os.Build;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: X.X3t, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84225X3t implements X3X {
    public final /* synthetic */ SparseArray LIZ;
    public final /* synthetic */ C84222X3q LIZIZ;

    public final void LIZ() {
        long j;
        if (this.LIZ != null) {
            for (int i = 0; i < this.LIZ.size(); i++) {
                int keyAt = this.LIZ.keyAt(i);
                if (keyAt != 0) {
                    this.LIZIZ.LJLIL.LIZ((DownloadInfo) this.LIZ.get(keyAt));
                }
            }
        }
        C84222X3q c84222X3q = this.LIZIZ;
        if (C65210PiY.LIZ()) {
            c84222X3q.getClass();
            C65210PiY.LIZIZ("DefaultDownloadCache", "onDownloadCacheSyncSuccess", "Run");
        }
        if (c84222X3q.LJLIL.LJLJI) {
            c84222X3q.LIZIZ();
        } else {
            synchronized (c84222X3q) {
                c84222X3q.LJLJI = true;
                c84222X3q.notifyAll();
            }
        }
        C84222X3q c84222X3q2 = this.LIZIZ;
        c84222X3q2.getClass();
        if (X4H.LJFF.LJI("task_resume_delay", false)) {
            j = 4000;
        } else if (Build.VERSION.SDK_INT >= 23) {
            j = 1000;
        } else {
            j = 5000;
        }
        c84222X3q2.LJLJJL.sendMessageDelayed(c84222X3q2.LJLJJL.obtainMessage(1), j);
        C84212X3g.LJIJJ(EnumC35469Dw1.SYNC_SUCCESS);
    }

    public C84225X3t(C84222X3q c84222X3q, SparseArray sparseArray) {
        this.LIZIZ = c84222X3q;
        this.LIZ = sparseArray;
    }
}
