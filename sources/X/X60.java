package X;

import android.content.Context;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X60 implements X64 {
    public final Context LIZ;
    public final ConcurrentHashMap<String, OSJ<String, DownloadTask, VNB>> LIZIZ;
    public final ConcurrentHashMap<Integer, Object> LIZJ;
    public final Object LIZLLL;
    public final X62 LJ;

    @Override // X.X64
    public final void LIZ(String requestUrl) {
        String str;
        o.LJIIJ(requestUrl, "requestUrl");
        Collection<OSJ<String, DownloadTask, VNB>> values = this.LIZIZ.values();
        o.LJFF(values, "taskMap.values");
        String str2 = "";
        DownloadTask downloadTask = null;
        for (OSJ<String, DownloadTask, VNB> osj : values) {
            DownloadInfo downloadInfo = osj.getSecond().getDownloadInfo();
            if (downloadInfo != null) {
                str = downloadInfo.getUrl();
            } else {
                str = null;
            }
            if (ujb.o.LJJJJIZL(str, requestUrl, false)) {
                str2 = osj.getFirst();
                downloadTask = osj.getSecond();
            }
        }
        if (downloadTask != null) {
            C12310e3 c12310e3 = C12310e3.LIZIZ;
            StringBuilder LIZIZ = C25620zW.LIZIZ("[Cancel][InvokeSDK][", str2, "][WorkingTaskCount:");
            LIZIZ.append(this.LIZIZ.values().size());
            LIZIZ.append("][DownLoadID : ");
            LIZIZ.append(downloadTask.getDownloadId());
            LIZIZ.append(']');
            String LIZIZ2 = X1D.LIZIZ(LIZIZ);
            c12310e3.getClass();
            C12310e3.LIZIZ("JKL", LIZIZ2, null);
            Downloader.getInstance(this.LIZ).cancel(downloadTask.getDownloadId());
            if (!C1DF.LJJII()) {
                LIZJ(downloadTask);
            }
        }
    }

    public final void LIZJ(DownloadTask downloadTask) {
        if (this.LIZJ.get(Integer.valueOf(downloadTask.getDownloadId())) == null) {
            this.LIZJ.put(Integer.valueOf(downloadTask.getDownloadId()), new Object());
        }
        Object obj = this.LIZJ.get(Integer.valueOf(downloadTask.getDownloadId()));
        if (obj != null) {
            synchronized (obj) {
                try {
                    obj.wait();
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        this.LIZJ.remove(Integer.valueOf(downloadTask.getDownloadId()));
    }

    public final void LIZLLL(int i) {
        Object obj = this.LIZJ.get(Integer.valueOf(i));
        if (obj != null) {
            synchronized (obj) {
                try {
                    obj.notifyAll();
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
    }

    @Override // X.X62
    public final VNB fetchFromNetwork(XD6 netRequest) {
        o.LJIIJ(netRequest, "netRequest");
        return this.LJ.fetchFromNetwork(netRequest);
    }

    @Override // X.X64
    public final void pause(String requestUrl) {
        String str;
        o.LJIIJ(requestUrl, "requestUrl");
        Collection<OSJ<String, DownloadTask, VNB>> values = this.LIZIZ.values();
        o.LJFF(values, "taskMap.values");
        String str2 = null;
        String str3 = "";
        DownloadTask downloadTask = null;
        for (OSJ<String, DownloadTask, VNB> osj : values) {
            DownloadInfo downloadInfo = osj.getSecond().getDownloadInfo();
            if (downloadInfo != null) {
                str = downloadInfo.getUrl();
            } else {
                str = null;
            }
            if (ujb.o.LJJJJIZL(str, requestUrl, false)) {
                str3 = osj.getFirst();
                downloadTask = osj.getSecond();
            }
        }
        if (downloadTask != null) {
            C12310e3 c12310e3 = C12310e3.LIZIZ;
            StringBuilder LIZIZ = C25620zW.LIZIZ("[Pause][InvokeSDK][", str3, "][WorkingTaskCount:");
            LIZIZ.append(this.LIZIZ.values().size());
            LIZIZ.append("][PauseURL:");
            DownloadInfo downloadInfo2 = downloadTask.getDownloadInfo();
            if (downloadInfo2 != null) {
                str2 = downloadInfo2.getUrl();
            }
            LIZIZ.append(str2);
            LIZIZ.append(']');
            String LIZIZ2 = X1D.LIZIZ(LIZIZ);
            c12310e3.getClass();
            C12310e3.LIZLLL("JKL", LIZIZ2);
            Downloader.getInstance(this.LIZ).pause(downloadTask.getDownloadId());
            if (!C1DF.LJJII()) {
                LIZJ(downloadTask);
            }
        }
    }

    public X60(Object context, int i, X62 client) {
        o.LJIIJ(context, "context");
        o.LJIIJ(client, "client");
        this.LIZLLL = context;
        this.LJ = client;
        Context context2 = (Context) context;
        this.LIZ = context2;
        new C84213X3h(context2);
        this.LIZIZ = new ConcurrentHashMap<>();
        this.LIZJ = new ConcurrentHashMap<>();
        C16880lQ.LLLLZ(i);
    }

    @Override // X.X64
    public final VNB LIZIZ(XD6 xd6, String path, String tag, X63 x63) {
        DownloadTask downloadTask;
        VNB third;
        o.LJIIJ(path, "path");
        o.LJIIJ(tag, "tag");
        OSJ<String, DownloadTask, VNB> osj = this.LIZIZ.get(xd6.LIZ);
        Object obj = null;
        if (osj != null) {
            downloadTask = osj.getSecond();
        } else {
            downloadTask = null;
        }
        if (downloadTask == null || downloadTask.getDownloadId() == 0) {
            downloadTask = C84261X5d.with(this.LIZ);
            downloadTask.url(xd6.LIZ);
            List<String> list = xd6.LIZIZ;
            if (list != null) {
                downloadTask.backUpUrls(list);
            }
            downloadTask.savePath(XBM.LJII(path));
            downloadTask.name(XBM.LJFF(path));
            java.util.Map<String, Object> map = xd6.LJII;
            if (map != null) {
                obj = map.get("ParamsNetLimit");
            }
            if ((obj instanceof Long) && (!o.LJ(obj, 0L))) {
                downloadTask.throttleNetSpeed(((Number) obj).longValue());
            }
            downloadTask.subThreadListener(new X61(this, x63));
            osj = new OSJ<>(tag, downloadTask, new VNB(601, new C78855Ux9()));
            this.LIZIZ.put(xd6.LIZ, osj);
            downloadTask.download();
            C12310e3 c12310e3 = C12310e3.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[ReceiveRequest][SDK][");
            LIZ.append(tag);
            LIZ.append(']');
            String LIZIZ = X1D.LIZIZ(LIZ);
            c12310e3.getClass();
            C12310e3.LIZ("JKL", LIZIZ);
        } else {
            C12310e3 c12310e32 = C12310e3.LIZIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[ResumeRequest][SDK][");
            LIZ2.append(tag);
            LIZ2.append(']');
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            c12310e32.getClass();
            C12310e3.LIZ("JKL", LIZIZ2);
            Downloader.getInstance(this.LIZ).resume(downloadTask.getDownloadId());
        }
        LIZJ(downloadTask);
        if (osj != null && (third = osj.getThird()) != null) {
            return third;
        }
        return new VNB(601, new C78855Ux9());
    }
}
