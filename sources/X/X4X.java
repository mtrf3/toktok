package X;

import Y.ARunnableS21S0000000_15;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes16.dex */
public final class X4X {
    public static final HandlerThread LIZ;
    public static final Handler LIZIZ;
    public static RunnableC84253X4v LIZJ;
    public static long LIZLLL;
    public static long LJ;

    static {
        HandlerThread handlerThread = new HandlerThread("Downloader-preconnecter");
        LIZ = handlerThread;
        X4H x4h = X4H.LJFF;
        LIZLLL = x4h.LJIIJ("preconnect_connection_outdate_time", LivePreviewNetworkSpeedThresholdSetting.DEFAULT);
        LJ = x4h.LJIIJ("preconnect_head_info_outdate_time", LivePreviewNetworkSpeedThresholdSetting.DEFAULT);
        X5I.LIZ.LIZJ = x4h.LJIIIIZZ("preconnect_max_cache_size", 3);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        LIZIZ = handler;
        handler.post(new ARunnableS21S0000000_15(1));
    }

    public static void LIZ(int i, long j, String str, List list) {
        C84241X4j c84241X4j;
        Map.Entry entry;
        C84243X4l c84243X4l = X5I.LIZ;
        C84241X4j c84241X4j2 = (C84241X4j) ((LinkedHashMap) c84243X4l.LIZIZ).get(str);
        if (c84241X4j2 != null) {
            if (c84241X4j2.LJ) {
                return;
            }
            if (System.currentTimeMillis() - c84241X4j2.LJFF < LIZLLL && c84241X4j2.LJ()) {
                return;
            }
        }
        C84241X4j c84241X4j3 = new C84241X4j(i, str, list);
        synchronized (c84243X4l.LIZIZ) {
            if (c84243X4l.LIZIZ.size() == c84243X4l.LIZJ) {
                Iterator it = ((LinkedHashMap) c84243X4l.LIZIZ).entrySet().iterator();
                if (it.hasNext() && (entry = (Map.Entry) it.next()) != null) {
                    c84241X4j = c84243X4l.LIZIZ.remove(entry.getKey());
                    c84243X4l.LIZIZ.put(str, c84241X4j3);
                }
            }
            c84241X4j = null;
            c84243X4l.LIZIZ.put(str, c84241X4j3);
        }
        if (c84241X4j != null) {
            try {
                c84241X4j.end();
            } catch (Throwable unused) {
            }
        }
        try {
            c84241X4j3.LIZLLL();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LIZIZ(int i, String str, String str2, List<HttpHeader> list, boolean z, boolean z2) {
        long j;
        String str3;
        DownloadInfo downloadInfo = Downloader.getInstance(C84212X3g.LJ()).getDownloadInfo(str, str2);
        if (downloadInfo != null) {
            if (downloadInfo.isDownloadingStatus() || downloadInfo.isDownloaded() || downloadInfo.getChunkCount() > 1) {
                return;
            }
            j = downloadInfo.getCurBytes();
            str3 = downloadInfo.geteTag();
        } else {
            j = 0;
            str3 = null;
        }
        LIZIZ.post(new RunnableC84245X4n(i, j, str, X4P.LIZ(j, 0L, str3, list), z2, z));
    }
}
