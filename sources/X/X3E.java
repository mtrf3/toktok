package X;

import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class X3E {
    public final java.util.Map<Integer, X4O> LIZ = new ConcurrentHashMap();
    public final AtomicInteger LIZIZ = new AtomicInteger(0);

    public final void LIZIZ() {
        Iterator it = ((ConcurrentHashMap) this.LIZ).entrySet().iterator();
        while (it.hasNext()) {
            if (!((X4O) ((Map.Entry) it.next()).getValue()).LJLJLLL.get()) {
                it.remove();
            }
        }
    }

    public static void LIZJ(X4O x4o) {
        int i;
        Future future;
        try {
            ExecutorService LJIIZILJ = C84212X3g.LJIIZILJ();
            DownloadTask downloadTask = x4o.LJLILLLLZI;
            if (downloadTask != null && downloadTask.getDownloadInfo() != null) {
                int executorGroup = downloadTask.getDownloadInfo().getExecutorGroup();
                if (executorGroup == 3) {
                    LJIIZILJ = C84212X3g.LJIILIIL != null ? C84212X3g.LJIILIIL : C84212X3g.LJIIZILJ();
                } else if (executorGroup == 4) {
                    LJIIZILJ = C84212X3g.LJIILJJIL != null ? C84212X3g.LJIILJJIL : C84212X3g.LJIIZILJ();
                }
            }
            if (LJIIZILJ != null && (LJIIZILJ instanceof ThreadPoolExecutor)) {
                ((ThreadPoolExecutor) LJIIZILJ).remove(x4o);
                DownloadInfo downloadInfo = x4o.LJLLILLLL;
                if (downloadInfo != null) {
                    i = downloadInfo.getId();
                } else {
                    i = 0;
                }
                if (X4H.LJFF(i, null).LJI("pause_with_interrupt", false) && (future = x4o.LJLIL) != null) {
                    future.cancel(true);
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static boolean LIZ(DownloadInfo downloadInfo, X4O x4o) {
        JSONObject LJIIIZ;
        if (downloadInfo.getExpectFileLength() > 0 && (LJIIIZ = X4H.LJFF(downloadInfo.getId(), null).LJIIIZ("segment_config")) != null) {
            long optLong = LJIIIZ.optLong("expect_min_download_size");
            if (optLong >= 104857600) {
                if (downloadInfo.getExpectFileLength() > optLong) {
                    return true;
                }
                x4o.LLII = false;
                return false;
            }
        }
        return false;
    }
}
