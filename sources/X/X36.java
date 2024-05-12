package X;

import Y.ARunnableS51S0100000_15;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes16.dex */
public abstract class X36 implements InterfaceC84204X2y {
    public static final String LJLJLJ = C16880lQ.LJLLJ(X36.class);
    public WeakReference<Service> LJLIL;
    public volatile boolean LJLJJI;
    public final SparseArray<List<DownloadTask>> LJLILLLLZI = new SparseArray<>();
    public volatile boolean LJLJI = false;
    public volatile boolean LJLJJL = false;
    public final Handler LJLJJLL = new Handler(C16880lQ.LLJJJJ());
    public final ARunnableS51S0100000_15 LJLJL = new ARunnableS51S0100000_15(this, 135);

    @Override // X.InterfaceC84204X2y
    public void LIZJ() {
    }

    @Override // X.InterfaceC84204X2y
    public void LIZLLL(DownloadTask downloadTask) {
    }

    @Override // X.InterfaceC84204X2y
    public void LJ() {
    }

    public void LJII(Context context, ServiceConnection serviceConnection) {
    }

    @Override // X.InterfaceC84204X2y
    public void LIZ() {
        if (!this.LJLJI) {
            if (C65210PiY.LIZ()) {
                C65210PiY.LIZIZ(LJLJLJ, "startService", "Run StartService");
            }
            LJII(C84212X3g.LJ(), null);
        }
    }

    public final void LJI() {
        SparseArray<List<DownloadTask>> clone;
        synchronized (this.LJLILLLLZI) {
            if (C65210PiY.LIZ()) {
                String str = LJLJLJ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("PendingTasks.size:");
                LIZ.append(this.LJLILLLLZI.size());
                C65210PiY.LIZIZ(str, "resumePendingTask", X1D.LIZIZ(LIZ));
            }
            clone = this.LJLILLLLZI.clone();
            this.LJLILLLLZI.clear();
        }
        X3D LJIIL = C84212X3g.LJIIL();
        if (LJIIL != null) {
            for (int i = 0; i < clone.size(); i++) {
                List<DownloadTask> list = clone.get(clone.keyAt(i));
                if (list != null) {
                    for (DownloadTask downloadTask : list) {
                        if (C65210PiY.LIZ()) {
                            C65210PiY.LIZLLL(downloadTask.getDownloadId(), LJLJLJ, "resumePendingTask", "Resume Task");
                        }
                        LJIIL.LJIL(downloadTask);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC84204X2y
    public IBinder LIZIZ(Intent intent) {
        if (C65210PiY.LIZ()) {
            C65210PiY.LIZIZ(LJLJLJ, "onBind", "OnBind Abs");
        }
        return new Binder();
    }

    public final void LJFF(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        int downloadId = downloadTask.getDownloadId();
        synchronized (this.LJLILLLLZI) {
            if (C65210PiY.LIZ()) {
                String str = LJLJLJ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("PendingTasks.size:");
                LIZ.append(this.LJLILLLLZI.size());
                C65210PiY.LIZLLL(downloadId, str, "pendDownloadTask", X1D.LIZIZ(LIZ));
            }
            List<DownloadTask> list = this.LJLILLLLZI.get(downloadId);
            if (list == null) {
                list = new ArrayList<>();
                this.LJLILLLLZI.put(downloadId, list);
            }
            if (C65210PiY.LIZ()) {
                String str2 = LJLJLJ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Before taskArray.size:");
                LIZ2.append(list.size());
                C65210PiY.LIZLLL(downloadId, str2, "pendDownloadTask", X1D.LIZIZ(LIZ2));
            }
            list.add(downloadTask);
            if (C65210PiY.LIZ()) {
                String str3 = LJLJLJ;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("After pendingTasks.size:");
                LIZ3.append(this.LJLILLLLZI.size());
                C65210PiY.LIZLLL(downloadId, str3, "pendDownloadTask", X1D.LIZIZ(LIZ3));
            }
        }
    }

    @Override // X.InterfaceC84204X2y
    public void setLogLevel(int i) {
        C65210PiY.LIZ = i;
    }

    @Override // X.InterfaceC84204X2y
    public void tryDownload(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        boolean LJI = X4H.LJFF(downloadTask.getDownloadId(), null).LJI("ignore_service_alive", false);
        if (!this.LJLJI) {
            if (C65210PiY.LIZ()) {
                C65210PiY.LIZLLL(downloadTask.getDownloadId(), LJLJLJ, "tryDownload", "Service is not alive");
            }
            if (!LJI) {
                LJFF(downloadTask);
            }
            if (!this.LJLJJL) {
                if (C65210PiY.LIZ()) {
                    C65210PiY.LIZLLL(downloadTask.getDownloadId(), LJLJLJ, "tryDownload", "Do StartService");
                }
                LJII(C84212X3g.LJ(), null);
                this.LJLJJL = true;
            } else {
                this.LJLJJLL.removeCallbacks(this.LJLJL);
                this.LJLJJLL.postDelayed(this.LJLJL, 10L);
            }
        }
        if (this.LJLJI || LJI) {
            if (this.LJLILLLLZI.get(downloadTask.getDownloadId()) != null) {
                synchronized (this.LJLILLLLZI) {
                    if (this.LJLILLLLZI.get(downloadTask.getDownloadId()) != null) {
                        this.LJLILLLLZI.remove(downloadTask.getDownloadId());
                    }
                }
            }
            X3D LJIIL = C84212X3g.LJIIL();
            if (LJIIL != null) {
                LJIIL.LJIL(downloadTask);
            }
            LJI();
        }
    }
}
