package Y;

import X.C76L;
import X.EnumC84256X4y;
import X.XPG;
import X.XQ2;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;

/* loaded from: classes16.dex */
public class ARunnableS4S0401000_15 implements Runnable {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
        IDownloadListener iDownloadListener = (IDownloadListener) this.l0;
        if (iDownloadListener != null) {
            int i = this.i4;
            if (i == -3) {
                iDownloadListener.onSuccessed((DownloadInfo) this.l1);
                ((DownloadTask) this.l2).removeCallback((EnumC84256X4y) this.l3, (IDownloadListener) this.l0);
            } else {
                if (i != -1) {
                    return;
                }
                iDownloadListener.onFailed((DownloadInfo) this.l1, new BaseException(1000, "try add listener for failed task"));
                ((DownloadTask) this.l2).removeCallback((EnumC84256X4y) this.l3, (IDownloadListener) this.l0);
            }
        }
    }

    public static final void run$0(ARunnableS4S0401000_15 aRunnableS4S0401000_15) {
        boolean LIZ;
        try {
            aRunnableS4S0401000_15.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS4S0401000_15 aRunnableS4S0401000_15) {
        boolean LIZ;
        try {
            ((XQ2) aRunnableS4S0401000_15.l3).LJIIIIZZ(aRunnableS4S0401000_15.l0, aRunnableS4S0401000_15.i4, (XPG) aRunnableS4S0401000_15.l1, (C76L) aRunnableS4S0401000_15.l2);
        } finally {
            try {
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    public ARunnableS4S0401000_15(Object obj, int i, Object obj2, Object obj3, Object obj4, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i4 = i;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
