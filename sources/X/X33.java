package X;

import android.util.SparseArray;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;

/* loaded from: classes16.dex */
public final class X33 implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ SparseArray LJLILLLLZI;
    public final /* synthetic */ DownloadInfo LJLJI;
    public final /* synthetic */ BaseException LJLJJI;
    public final /* synthetic */ DownloadTask LJLJJL;
    public final /* synthetic */ SparseArray LJLJJLL;
    public final /* synthetic */ boolean LJLJL;

    public final void LIZ() {
        C78598Ut0.LJIILL(this.LJLIL, this.LJLILLLLZI, true, this.LJLJI, this.LJLJJI, EnumC84256X4y.MAIN, this.LJLJJL);
        C78598Ut0.LJIILL(this.LJLIL, this.LJLJJLL, this.LJLJL, this.LJLJI, this.LJLJJI, EnumC84256X4y.NOTIFICATION, this.LJLJJL);
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

    public X33(int i, SparseArray sparseArray, DownloadInfo downloadInfo, BaseException baseException, DownloadTask downloadTask, SparseArray sparseArray2, boolean z) {
        this.LJLIL = i;
        this.LJLILLLLZI = sparseArray;
        this.LJLJI = downloadInfo;
        this.LJLJJI = baseException;
        this.LJLJJL = downloadTask;
        this.LJLJJLL = sparseArray2;
        this.LJLJL = z;
    }
}
