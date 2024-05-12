package X;

import Y.ARunnableS34S0200000_15;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.aweme.download.component_api.activity.DownloadDelegateActivity;
import com.ss.android.ugc.aweme.download.component_api.depend.DownloadMonitorDepend;
import com.ss.android.ugc.aweme.download.impl.component_impl.DownloadServiceImpl;
import java.io.File;
import kotlin.jvm.internal.AqS104S0300000_15;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X5Q extends X5R implements InterfaceC78602Ut4 {
    public final DownloadTask LJJIFFI;

    @Override // X.X5R
    public final int LIZJ() {
        return LIZLLL(N33.DEFAULT);
    }

    @Override // X.InterfaceC78602Ut4
    public final void LIZ(DownloadInfo downloadInfo) {
        N33 n33 = N33.IMAGE;
        if (N33.ZIP == this.LJIILJJIL && this.LJIILLIIL) {
            if (!this.LJIIZILJ) {
                LJFF(downloadInfo, this.LJIJI);
            } else {
                C38995FSd.LIZLLL().execute(new ARunnableS34S0200000_15(this, downloadInfo, 0));
            }
        }
        if (this.LJJI && downloadInfo != null) {
            C78977Uz7.LJJL(this.LIZ, this);
        }
    }

    @Override // X.X5R
    public final int LIZLLL(N33 scene) {
        o.LJIIIZ(scene, "scene");
        this.LJIILJJIL = scene;
        LJII(this.LJJIFFI);
        LJIIIIZZ(this.LJJIFFI);
        LJI(new AqS162S0200000_15(this, this.LJJIFFI, 0));
        return Downloader.getInstance(this.LIZ).getDownloadId(this.LIZLLL, this.LJ);
    }

    @Override // X.X5R
    public final int LJ(X5O x5o) {
        this.LJIILJJIL = N33.DEFAULT;
        LJII(this.LJJIFFI);
        LJIIIIZZ(this.LJJIFFI);
        LJI(new AqS104S0300000_15(this.LJJIFFI, x5o, this, 0));
        return Downloader.getInstance(this.LIZ).getDownloadId(this.LIZLLL, this.LJ);
    }

    public final void LJI(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        boolean z;
        String[] strArr;
        int i = this.LIZ.getApplicationInfo().targetSdkVersion;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || (i != 29 ? i <= 29 : Environment.isExternalStorageLegacy())) {
            z = false;
        } else {
            z = true;
        }
        if (this.LJIILIIL && !z) {
            Context context = this.LIZ;
            X5T x5t = new X5T(interfaceC65784Pro);
            if (i2 >= 33) {
                strArr = new String[]{"android.permission.READ_MEDIA_VIDEO", "bpea-download_api_read_media_video"};
            } else {
                strArr = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "bpea-download_api_write_external_storage"};
            }
            String str = strArr[0];
            if (context != null && C04330Ez.LIZ(context, str) == 0) {
                x5t.LIZ();
                return;
            }
            String[] strArr2 = {str};
            if (context == null) {
                return;
            }
            String valueOf = String.valueOf(System.currentTimeMillis());
            if (!TextUtils.isEmpty(valueOf)) {
                C58214Mt0.LIZ.put(valueOf, x5t);
            }
            Intent intent = new Intent(context, (Class<?>) DownloadDelegateActivity.class);
            intent.addFlags(268435456);
            intent.putExtra("type", 1);
            intent.putExtra("permission_id_key", valueOf);
            intent.putExtra("permission_content_key", strArr2);
            C16880lQ.LIZJ(context, intent);
            return;
        }
        interfaceC65784Pro.invoke();
    }

    public final void LJII(DownloadTask downloadTask) {
        downloadTask.url(this.LIZLLL);
        downloadTask.backUpUrls(this.LJIIIIZZ);
        downloadTask.name(this.LIZJ);
        downloadTask.title(null);
        downloadTask.savePath(this.LJ);
        downloadTask.onlyWifi(false);
        downloadTask.extraHeaders(this.LJI);
        downloadTask.addTTNetCommonParam(this.LJFF);
        downloadTask.depend(null);
        downloadTask.retryCount(this.LJII);
        downloadTask.backUpUrlRetryCount(this.LJIJJLI);
        downloadTask.showNotification(false);
        downloadTask.extra(null);
        downloadTask.mimeType(null);
        downloadTask.force(this.LJJ);
        downloadTask.minProgressTimeMsInterval(0);
        downloadTask.maxProgressCount(0);
        downloadTask.notificationListener(null);
        downloadTask.notificationEventListener(null);
        downloadTask.autoResumed(false);
        downloadTask.showNotificationForAutoResumed(false);
        downloadTask.needHttpsToHttpRetry(false);
        downloadTask.packageName(null);
        downloadTask.md5(this.LJIIIZ);
        downloadTask.fileUriProvider(null);
        downloadTask.expectFileLength(0L);
        downloadTask.retryDelayTimeCalculator(null);
        downloadTask.iconUrl(null);
        downloadTask.addListenerToSameTask(this.LJIL);
        downloadTask.needSDKMonitor(true);
        downloadTask.monitorScene(this.LJIIJ);
    }

    public final void LJIIIIZZ(DownloadTask downloadTask) {
        IDownloadListener iDownloadListener = this.LJIIJJI;
        if (iDownloadListener != null) {
            downloadTask.mainThreadListener(new C78599Ut1(iDownloadListener, this));
        }
        IDownloadListener iDownloadListener2 = this.LJIIL;
        if (iDownloadListener2 != null) {
            downloadTask.subThreadListener(new C78599Ut1(iDownloadListener2, this));
        }
        if (this.LJIJJ) {
            DownloadMonitorDepend downloadMonitorDepend = this.LJIILL;
            if (downloadMonitorDepend == null) {
                downloadMonitorDepend = new DownloadMonitorDepend(DownloadServiceImpl.LIZJ, null, null, null);
            }
            downloadTask.monitorDepend(downloadMonitorDepend);
        }
    }

    public X5Q(Context context, String str) {
        super(context, str);
        DownloadTask with = C84261X5d.with(context);
        o.LJIIIIZZ(with, "with(context)");
        this.LJJIFFI = with;
    }

    public final void LJFF(DownloadInfo downloadInfo, X5Z x5z) {
        if (downloadInfo == null) {
            return;
        }
        try {
            String targetFilePath = downloadInfo.getTargetFilePath();
            if (TextUtils.isEmpty(targetFilePath)) {
                return;
            }
            if (!X4Q.LJIJ(downloadInfo, downloadInfo.isForce(), downloadInfo.getMd5())) {
                X4Q.LJ(downloadInfo, true);
                return;
            }
            if (TextUtils.isEmpty(this.LJIJ)) {
                return;
            }
            File file = new File(this.LJIJ);
            if (file.exists()) {
                File[] listFiles = file.listFiles();
                o.LJIIIIZZ(listFiles, "unzipFile.listFiles()");
                if (listFiles.length != 0) {
                    String path = file.getPath();
                    o.LJIIIIZZ(path, "unzipFile.path");
                    try {
                        C64872gd.LIZ(path);
                    } catch (Exception e) {
                        C78983UzD.LJIIZILJ(e);
                    }
                }
            }
            C37246Eja c37246Eja = C37247Ejb.LIZIZ;
            String unzipPath = this.LJIJ;
            o.LJIIIIZZ(unzipPath, "unzipPath");
            c37246Eja.getClass();
            File LIZIZ = C37246Eja.LIZIZ(unzipPath);
            o.LJI(LIZIZ);
            if (x5z != null) {
                x5z.LIZJ();
            }
            FQ8.LIZ(new File(targetFilePath), LIZIZ);
            if (x5z != null) {
                x5z.LIZ(LIZIZ.getPath());
            }
        } catch (Exception e2) {
            C78983UzD.LJIIZILJ(e2);
            if (x5z != null) {
                x5z.LIZIZ();
            }
        }
    }

    @Override // X.X5R
    public final void LIZIZ(int i, C51723KRr downloadListener, EnumC84256X4y main) {
        o.LJIIIZ(downloadListener, "downloadListener");
        o.LJIIIZ(main, "main");
        this.LJJIFFI.addDownloadListener(i, downloadListener, main, true);
    }
}
