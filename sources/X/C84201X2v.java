package X;

import android.app.Notification;
import android.os.RemoteException;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.downloader.IndependentProcessDownloadService;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;

/* renamed from: X.X2v, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84201X2v implements X3L, InterfaceC84203X2x {
    public static final String LIZLLL = C16880lQ.LJLLJ(C84201X2v.class);
    public volatile InterfaceC84202X2w LIZ;
    public final InterfaceC84204X2y<IndependentProcessDownloadService> LIZIZ;
    public final X38 LIZJ = new X38(false);

    @Override // X.X3L
    public final void LJIJ(DownloadInfo downloadInfo) {
    }

    @Override // X.X3L
    public final void LIZ() {
        InterfaceC84204X2y<IndependentProcessDownloadService> interfaceC84204X2y = this.LIZIZ;
        if (interfaceC84204X2y != null) {
            interfaceC84204X2y.LIZ();
        }
    }

    @Override // X.X3L
    public final boolean LIZJ() {
        if (this.LIZ != null) {
            return true;
        }
        return false;
    }

    @Override // X.X3L
    public final boolean LJJIJLIJ() {
        if (this.LIZ == null) {
            if (C65210PiY.LIZ()) {
                C65210PiY.LIZIZ(LIZLLL, "isServiceForeground", "AidlService is null");
            }
            return false;
        }
        if (C65210PiY.LIZ()) {
            C65210PiY.LIZIZ(LIZLLL, "isServiceForeground", "AidlService.isServiceForeground");
        }
        try {
            return this.LIZ.LJJIJLIJ();
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    @Override // X.X3L
    public final void clearData() {
        if (this.LIZ == null) {
            this.LIZJ.clearData();
            return;
        }
        try {
            this.LIZ.clearData();
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.X3L
    public final List<DownloadInfo> getAllDownloadInfo() {
        if (this.LIZ == null) {
            return this.LIZJ.getAllDownloadInfo();
        }
        try {
            return this.LIZ.getAllDownloadInfo();
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // X.X3L
    public final boolean isDownloadCacheSyncSuccess() {
        if (this.LIZ == null) {
            return this.LIZJ.isDownloadCacheSyncSuccess();
        }
        try {
            return this.LIZ.isDownloadCacheSyncSuccess();
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    @Override // X.X3L
    public final void pauseAll() {
        if (this.LIZ == null) {
            return;
        }
        try {
            this.LIZ.pauseAll();
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public C84201X2v() {
        InterfaceC84204X2y<IndependentProcessDownloadService> LJIILLIIL = C84212X3g.LJIILLIIL();
        this.LIZIZ = LJIILLIIL;
        ((X34) LJIILLIIL).LJLL = this;
    }

    @Override // X.X3L
    public final boolean LJIIL(int i) {
        if (this.LIZ == null) {
            return this.LIZJ.LJIIL(i);
        }
        try {
            return this.LIZ.LJIIL(i);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    @Override // X.X3L
    public final void LJIILIIL(int i) {
        if (this.LIZ == null) {
            this.LIZJ.LJIILIIL(i);
            return;
        }
        try {
            this.LIZ.LJIILIIL(i);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.X3L
    public final boolean LJIILJJIL(int i) {
        if (this.LIZ == null) {
            return this.LIZJ.LJIILJJIL(i);
        }
        try {
            return this.LIZ.LJIILJJIL(i);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    @Override // X.X3L
    public final void LJJIIJZLJL(boolean z) {
        if (this.LIZ == null) {
            if (C65210PiY.LIZ()) {
                C65210PiY.LIZIZ(LIZLLL, "stopForeground", "AidlService is null");
            }
        } else {
            if (C65210PiY.LIZ()) {
                C65210PiY.LIZIZ(LIZLLL, "stopForeground", "AidlService.stopForeground");
            }
            try {
                this.LIZ.LJJIIJZLJL(true);
            } catch (RemoteException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    @Override // X.X3L
    public final int LJJJJ(int i) {
        if (this.LIZ == null) {
            return X3K.LJ().LIZLLL(i);
        }
        try {
            return this.LIZ.LJJJJ(i);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return -1;
        }
    }

    @Override // X.X3L
    public final boolean canResume(int i) {
        if (this.LIZ == null) {
            return false;
        }
        try {
            return this.LIZ.canResume(i);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    @Override // X.X3L
    public final void forceDownloadIngoreRecommendSize(int i) {
        if (this.LIZ == null) {
            this.LIZJ.forceDownloadIngoreRecommendSize(i);
            return;
        }
        try {
            this.LIZ.forceDownloadIngoreRecommendSize(i);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.X3L
    public final long getCurBytes(int i) {
        if (this.LIZ == null) {
            return 0L;
        }
        try {
            return this.LIZ.getCurBytes(i);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return 0L;
        }
    }

    @Override // X.X3L
    public final X2C getDownloadFileUriProvider(int i) {
        X2B x2b = null;
        if (this.LIZ != null) {
            try {
                X29 downloadFileUriProvider = this.LIZ.getDownloadFileUriProvider(i);
                if (downloadFileUriProvider == null) {
                    return null;
                }
                x2b = new X2B(downloadFileUriProvider);
                return x2b;
            } catch (RemoteException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return x2b;
    }

    @Override // X.X3L
    public final DownloadInfo getDownloadInfo(int i) {
        if (this.LIZ == null) {
            return this.LIZJ.getDownloadInfo(i);
        }
        try {
            return this.LIZ.getDownloadInfo(i);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // X.X3L
    public final List<DownloadInfo> getDownloadInfoList(String str) {
        if (this.LIZ == null) {
            return this.LIZJ.getDownloadInfoList(str);
        }
        try {
            return this.LIZ.getDownloadInfoList(str);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // X.X3L
    public final List<DownloadInfo> getDownloadInfosByFileExtension(String str) {
        if (this.LIZ == null) {
            return this.LIZJ.getDownloadInfosByFileExtension(str);
        }
        try {
            return this.LIZ.getDownloadInfosByFileExtension(str);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // X.X3L
    public final InterfaceC84187X2h getDownloadNotificationEventListener(int i) {
        C84184X2e c84184X2e = null;
        if (this.LIZ != null) {
            try {
                X2X downloadNotificationEventListener = this.LIZ.getDownloadNotificationEventListener(i);
                if (downloadNotificationEventListener == null) {
                    return null;
                }
                c84184X2e = new C84184X2e(downloadNotificationEventListener);
                return c84184X2e;
            } catch (RemoteException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return c84184X2e;
    }

    @Override // X.X3L
    public final List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str) {
        if (this.LIZ != null) {
            try {
                return this.LIZ.getDownloadingDownloadInfosWithMimeType(str);
            } catch (RemoteException e) {
                C16880lQ.LLLLIIL(e);
                return null;
            }
        }
        return null;
    }

    @Override // X.X3L
    public final InterfaceC84186X2g getNotificationClickCallback(int i) {
        C84185X2f c84185X2f = null;
        if (this.LIZ != null) {
            try {
                X2W notificationClickCallback = this.LIZ.getNotificationClickCallback(i);
                if (notificationClickCallback == null) {
                    return null;
                }
                c84185X2f = new C84185X2f(notificationClickCallback);
                return c84185X2f;
            } catch (RemoteException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return c84185X2f;
    }

    @Override // X.X3L
    public final int getStatus(int i) {
        if (this.LIZ == null) {
            return 0;
        }
        try {
            return this.LIZ.getStatus(i);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return 0;
        }
    }

    @Override // X.X3L
    public final List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        if (this.LIZ == null) {
            return this.LIZJ.getSuccessedDownloadInfosWithMimeType(str);
        }
        try {
            return this.LIZ.getSuccessedDownloadInfosWithMimeType(str);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // X.X3L
    public final List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        if (this.LIZ == null) {
            return this.LIZJ.getUnCompletedDownloadInfosWithMimeType(str);
        }
        try {
            return this.LIZ.getUnCompletedDownloadInfosWithMimeType(str);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // X.X3L
    public final boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo) {
        if (this.LIZ == null) {
            return this.LIZJ.isDownloadSuccessAndFileNotExist(downloadInfo);
        }
        try {
            this.LIZ.isDownloadSuccessAndFileNotExist(downloadInfo);
            return false;
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    @Override // X.X3L
    public final boolean isDownloading(int i) {
        if (this.LIZ == null) {
            return false;
        }
        try {
            return this.LIZ.isDownloading(i);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    @Override // X.X3L
    public final void restart(int i) {
        if (this.LIZ == null) {
            return;
        }
        try {
            this.LIZ.restart(i);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.X3L
    public final void restartAllFailedDownloadTasks(List<String> list) {
        if (this.LIZ == null) {
            this.LIZJ.restartAllFailedDownloadTasks(list);
            return;
        }
        try {
            this.LIZ.restartAllFailedDownloadTasks(list);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.X3L
    public final void restartAllPauseReserveOnWifiDownloadTasks(List<String> list) {
        if (this.LIZ == null) {
            this.LIZJ.restartAllPauseReserveOnWifiDownloadTasks(list);
            return;
        }
        try {
            this.LIZ.restartAllPauseReserveOnWifiDownloadTasks(list);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.X3L
    public final void resume(int i) {
        if (this.LIZ == null) {
            return;
        }
        try {
            this.LIZ.resume(i);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.X3L
    public final void setLogLevel(int i) {
        InterfaceC84204X2y<IndependentProcessDownloadService> interfaceC84204X2y = this.LIZIZ;
        if (interfaceC84204X2y != null) {
            interfaceC84204X2y.setLogLevel(i);
        }
    }

    @Override // X.X3L
    public final void tryDownload(DownloadTask downloadTask) {
        InterfaceC84204X2y<IndependentProcessDownloadService> interfaceC84204X2y;
        if (downloadTask != null && (interfaceC84204X2y = this.LIZIZ) != null) {
            interfaceC84204X2y.tryDownload(downloadTask);
        }
    }

    @Override // X.X3L
    public final boolean updateDownloadInfo(DownloadInfo downloadInfo) {
        if (this.LIZ == null) {
            return this.LIZJ.updateDownloadInfo(downloadInfo);
        }
        try {
            return this.LIZ.updateDownloadInfo(downloadInfo);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    @Override // X.X3L
    public final void LJJJI(int i, boolean z) {
        if (this.LIZ == null) {
            return;
        }
        try {
            this.LIZ.LJJJI(i, z);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.X3L
    public final void LJJJJIZL(int i, boolean z) {
        if (this.LIZ == null) {
            return;
        }
        try {
            this.LIZ.LJJJJIZL(i, z);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.X3L
    public final void LJJLIIIJJI(int i, Notification notification) {
        if (this.LIZ == null) {
            if (C65210PiY.LIZ()) {
                C65210PiY.LIZIZ(LIZLLL, "startForeground", "AidlService is null");
                return;
            }
            return;
        }
        if (C65210PiY.LIZ()) {
            String str = LIZLLL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Id = ");
            LIZ.append(i);
            C65210PiY.LIZIZ(str, "startForeground", X1D.LIZIZ(LIZ));
        }
        try {
            this.LIZ.LJJLIIIJJI(i, notification);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.X3L
    public final void LJJLIIIJLLLLLLLZ(int i, int i2) {
        if (this.LIZ != null) {
            try {
                this.LIZ.LJJLIIIJLLLLLLLZ(i, i2);
            } catch (RemoteException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    @Override // X.X3L
    public final void cancel(int i, boolean z) {
        if (this.LIZ == null) {
            return;
        }
        try {
            this.LIZ.cancel(i, z);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.X3L
    public final void setDownloadNotificationEventListener(int i, InterfaceC84187X2h interfaceC84187X2h) {
        X2T x2t;
        if (this.LIZ != null) {
            try {
                InterfaceC84202X2w interfaceC84202X2w = this.LIZ;
                if (interfaceC84187X2h == null) {
                    x2t = null;
                } else {
                    x2t = new X2T(interfaceC84187X2h);
                }
                interfaceC84202X2w.LLLF(i, x2t);
            } catch (RemoteException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    @Override // X.X3L
    public final void LJJIFFI(int i, boolean z, boolean z2) {
        if (this.LIZ == null) {
            this.LIZJ.LJJIFFI(i, z, true);
            return;
        }
        try {
            this.LIZ.LJJIFFI(i, z, true);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.X3L
    public final void setThrottleNetSpeed(int i, long j, int i2) {
        if (this.LIZ == null) {
            return;
        }
        try {
            this.LIZ.setThrottleNetSpeed(i, j, i2);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.X3L
    public final void LIZIZ(int i, int i2, IDownloadListener iDownloadListener, EnumC84256X4y enumC84256X4y, boolean z) {
        boolean z2;
        BinderC84205X2z binderC84205X2z;
        if (this.LIZ == null) {
            return;
        }
        try {
            InterfaceC84202X2w interfaceC84202X2w = this.LIZ;
            if (enumC84256X4y == EnumC84256X4y.SUB) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (iDownloadListener == null) {
                binderC84205X2z = null;
            } else {
                binderC84205X2z = new BinderC84205X2z(iDownloadListener, z2);
            }
            interfaceC84202X2w.d0(i, i2, binderC84205X2z, enumC84256X4y.ordinal(), z);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.X3L
    public final void LJ(int i, int i2, IDownloadListener iDownloadListener, EnumC84256X4y enumC84256X4y, boolean z) {
        boolean z2;
        BinderC84205X2z binderC84205X2z;
        if (this.LIZ == null) {
            return;
        }
        try {
            InterfaceC84202X2w interfaceC84202X2w = this.LIZ;
            if (enumC84256X4y == EnumC84256X4y.SUB) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (iDownloadListener == null) {
                binderC84205X2z = null;
            } else {
                binderC84205X2z = new BinderC84205X2z(iDownloadListener, z2);
            }
            interfaceC84202X2w.LLJJL(i, i2, binderC84205X2z, enumC84256X4y.ordinal(), z);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.X3L
    public final void LIZLLL(int i, int i2, IDownloadListener iDownloadListener, EnumC84256X4y enumC84256X4y, boolean z, boolean z2) {
        boolean z3;
        BinderC84205X2z binderC84205X2z;
        if (this.LIZ == null) {
            return;
        }
        try {
            InterfaceC84202X2w interfaceC84202X2w = this.LIZ;
            if (enumC84256X4y == EnumC84256X4y.SUB) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (iDownloadListener == null) {
                binderC84205X2z = null;
            } else {
                binderC84205X2z = new BinderC84205X2z(iDownloadListener, z3);
            }
            interfaceC84202X2w.LLLLIILL(i, i2, binderC84205X2z, enumC84256X4y.ordinal(), z, z2);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
