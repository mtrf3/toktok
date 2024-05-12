package X;

import android.content.Intent;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.impls.DownloadHandleService;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes16.dex */
public final class X3K {
    public static volatile X3K LIZJ;
    public volatile SparseArray<Boolean> LIZ = new SparseArray<>();
    public volatile List<X35> LIZIZ = new ArrayList();

    public static X3K LJ() {
        if (LIZJ == null) {
            synchronized (X3K.class) {
                LIZJ = new X3K();
            }
        }
        return LIZJ;
    }

    public final X3L LIZIZ(int i) {
        boolean z = true;
        if (LIZJ(i) != 1 || X4P.LJIIL()) {
            z = false;
        }
        return X3C.LIZ(z);
    }

    public final int LIZJ(int i) {
        if (C84212X3g.LJFF != null) {
            if (!X4P.LJIIL() && X3C.LIZ(true).LIZJ()) {
                return X3C.LIZ(true).LJJJJ(i);
            }
            return LIZLLL(i);
        }
        return -1;
    }

    public final synchronized int LIZLLL(int i) {
        if (this.LIZ.get(i) == null) {
            return -1;
        }
        return this.LIZ.get(i).booleanValue() ? 1 : 0;
    }

    public final synchronized void LJII(int i, boolean z) {
        Boolean bool;
        SparseArray<Boolean> sparseArray = this.LIZ;
        if (z) {
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        sparseArray.put(i, bool);
    }

    public final void LJIIIIZZ(int i, boolean z) {
        boolean z2;
        LJII(i, z);
        if (C84212X3g.LJFF != null && !X4P.LJIIL() && X3C.LIZ(true).LIZJ()) {
            X3C.LIZ(true).LJJJJIZL(i, z);
        }
        synchronized (C84212X3g.class) {
            z2 = C84212X3g.LJJII;
        }
        if (!z2 && !X4P.LJIIL() && !X4P.LJIILJJIL()) {
            try {
                Intent intent = new Intent(C84212X3g.LJ(), (Class<?>) DownloadHandleService.class);
                intent.setAction("com.ss.android.downloader.action.PROCESS_NOTIFY");
                intent.putExtra("extra_download_id", i);
                C16880lQ.LLLL(C84212X3g.LJ(), intent);
            } catch (Throwable unused) {
            }
        }
    }

    public static List LJFF(List list, List list2, SparseArray sparseArray) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DownloadInfo downloadInfo = (DownloadInfo) it.next();
                if (downloadInfo != null && sparseArray.get(downloadInfo.getId()) == null) {
                    sparseArray.put(downloadInfo.getId(), downloadInfo);
                }
            }
        }
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                DownloadInfo downloadInfo2 = (DownloadInfo) it2.next();
                if (downloadInfo2 != null && sparseArray.get(downloadInfo2.getId()) == null) {
                    sparseArray.put(downloadInfo2.getId(), downloadInfo2);
                }
            }
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            arrayList.add(sparseArray.get(sparseArray.keyAt(i)));
        }
        return arrayList;
    }

    public final void LIZ(int i, IDownloadListener iDownloadListener, EnumC84256X4y enumC84256X4y, boolean z) {
        X3L LIZIZ = LIZIZ(i);
        if (LIZIZ == null) {
            return;
        }
        LIZIZ.LJ(i, iDownloadListener.hashCode(), iDownloadListener, enumC84256X4y, z);
    }

    public final void LJI(int i, IDownloadListener iDownloadListener, EnumC84256X4y enumC84256X4y, boolean z) {
        int hashCode;
        X3L LIZIZ = LIZIZ(i);
        if (LIZIZ == null) {
            return;
        }
        if (iDownloadListener == null) {
            hashCode = 0;
        } else {
            hashCode = iDownloadListener.hashCode();
        }
        LIZIZ.LIZIZ(i, hashCode, iDownloadListener, enumC84256X4y, z);
    }
}
