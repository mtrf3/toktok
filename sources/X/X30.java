package X;

import android.os.Handler;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.model.DownloadTask;

/* loaded from: classes16.dex */
public final class X30 {
    public static final Handler LIZ = new Handler(C16880lQ.LLJJJJ());

    public static X31 LIZ(X32 x32) {
        if (x32 == null) {
            return null;
        }
        return new X31(x32);
    }

    public static void LIZIZ(DownloadTask downloadTask, InterfaceC84198X2s interfaceC84198X2s, EnumC84256X4y enumC84256X4y) {
        SparseArray<IDownloadListener> sparseArray = new SparseArray<>();
        for (int i = 0; i < interfaceC84198X2s.W9(enumC84256X4y.ordinal()); i++) {
            X32 Q9 = interfaceC84198X2s.Q9(enumC84256X4y.ordinal(), i);
            if (Q9 != null) {
                sparseArray.put(Q9.LJLI(), LIZ(Q9));
            }
        }
        downloadTask.setDownloadListeners(sparseArray, enumC84256X4y);
    }
}
