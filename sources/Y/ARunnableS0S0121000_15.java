package Y;

import X.EnumC84256X4y;
import X.X38;
import X.X3D;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;

/* loaded from: classes16.dex */
public class ARunnableS0S0121000_15 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public boolean z1;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        DownloadTask LJIIL;
        if (((X3D) this.l0).LJI(this.i3) == null && (LJIIL = ((X3D) this.l0).LJIIL(this.i3)) != null) {
            DownloadInfo downloadInfo = LJIIL.getDownloadInfo();
            SparseArray<IDownloadListener> downloadListeners = LJIIL.getDownloadListeners(EnumC84256X4y.SUB);
            if (downloadListeners != null) {
                synchronized (downloadListeners) {
                    for (int i = 0; i < downloadListeners.size(); i++) {
                        IDownloadListener iDownloadListener = downloadListeners.get(downloadListeners.keyAt(i));
                        if (iDownloadListener != null) {
                            iDownloadListener.onCanceled(downloadInfo);
                            LJIIL.removeCallback(EnumC84256X4y.SUB, iDownloadListener);
                        }
                    }
                }
            }
        }
        ((X3D) this.l0).LJ(this.i3, this.z1, this.z2);
    }

    public static final void run$0(ARunnableS0S0121000_15 aRunnableS0S0121000_15) {
        boolean LIZ;
        try {
            aRunnableS0S0121000_15.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S0121000_15 aRunnableS0S0121000_15) {
        boolean LIZ;
        try {
            ((X38) aRunnableS0S0121000_15.l0).LIZ.LIZLLL(aRunnableS0S0121000_15.i3, aRunnableS0S0121000_15.z1, aRunnableS0S0121000_15.z2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S0121000_15(Object obj, int i, boolean z, boolean z2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i3 = i;
        this.z1 = z;
        this.z2 = z2;
    }
}
