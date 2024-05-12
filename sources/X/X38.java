package X;

import Y.ARunnableS0S0121000_15;
import Y.ARunnableS19S0101000_15;
import Y.ARunnableS34S0200000_15;
import Y.ARunnableS3S0111000_15;
import Y.ARunnableS51S0100000_15;
import android.app.Notification;
import android.app.Service;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes16.dex */
public final class X38 implements X3L {
    public final X3D LIZ = C84212X3g.LJIIL();
    public final InterfaceC84211X3f LIZIZ = C84212X3g.LJIIJ();
    public final InterfaceC84204X2y LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    @Override // X.X3L
    public final void LIZ() {
    }

    @Override // X.X3L
    public final boolean LIZJ() {
        InterfaceC84204X2y interfaceC84204X2y;
        if (!this.LIZLLL || (interfaceC84204X2y = this.LIZJ) == null || !((X36) interfaceC84204X2y).LJLJI) {
            return false;
        }
        return true;
    }

    @Override // X.X3L
    public final boolean LJJIJLIJ() {
        X36 x36 = (X36) this.LIZJ;
        if (C65210PiY.LIZ()) {
            x36.getClass();
            String str = X36.LJLJLJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("IsServiceForeground = ");
            LIZ.append(x36.LJLJJI);
            C65210PiY.LIZIZ(str, "isServiceForeground", X1D.LIZIZ(LIZ));
        }
        return x36.LJLJJI;
    }

    @Override // X.X3L
    public final void clearData() {
        this.LIZIZ.clearData();
    }

    @Override // X.X3L
    public final List<DownloadInfo> getAllDownloadInfo() {
        InterfaceC84211X3f interfaceC84211X3f = this.LIZIZ;
        if (interfaceC84211X3f != null) {
            return interfaceC84211X3f.getAllDownloadInfo();
        }
        return null;
    }

    @Override // X.X3L
    public final boolean isDownloadCacheSyncSuccess() {
        return this.LIZIZ.isDownloadCacheSyncSuccess();
    }

    @Override // X.X3L
    public final void pauseAll() {
        LJFF(new ARunnableS51S0100000_15(this, 10));
    }

    public X38(boolean z) {
        if (!z) {
            if (C84212X3g.LIZLLL == null) {
                synchronized (C84212X3g.class) {
                    if (C84212X3g.LIZLLL == null) {
                        C84212X3g.LIZLLL = new X37();
                    }
                }
            }
            this.LIZJ = C84212X3g.LIZLLL;
        } else {
            this.LIZJ = C84212X3g.LJIILLIIL();
        }
        X4H x4h = X4H.LJFF;
        this.LIZLLL = x4h.LJI("service_alive", false);
        this.LJ = x4h.LJIIIIZZ("single_async_handle_operation", 0) > 0;
    }

    public final void LJFF(Runnable runnable) {
        if (this.LJ) {
            C84212X3g.LJJIIZI(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // X.X3L
    public final boolean LJIIL(int i) {
        return this.LIZIZ.LJIIL(i);
    }

    @Override // X.X3L
    public final void LJIILIIL(int i) {
        this.LIZIZ.LJIILIIL(i);
    }

    @Override // X.X3L
    public final boolean LJIILJJIL(int i) {
        return this.LIZIZ.LJIILJJIL(i);
    }

    @Override // X.X3L
    public final void LJIJ(DownloadInfo downloadInfo) {
        this.LIZIZ.LJIJ(downloadInfo);
    }

    @Override // X.X3L
    public final void LJJIIJZLJL(boolean z) {
        X36 x36 = (X36) this.LIZJ;
        WeakReference<Service> weakReference = x36.LJLIL;
        if (weakReference != null && weakReference.get() != null) {
            if (C65210PiY.LIZ()) {
                String str = X36.LJLJLJ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Service = ");
                LIZ.append(x36.LJLIL.get());
                LIZ.append(",  isServiceAlive = ");
                LIZ.append(x36.LJLJI);
                C65210PiY.LIZIZ(str, "stopForeground", X1D.LIZIZ(LIZ));
            }
            try {
                x36.LJLJJI = false;
                x36.LJLIL.get().stopForeground(z);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    @Override // X.X3L
    public final int LJJJJ(int i) {
        return X3K.LJ().LIZJ(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if (r2.LIZJ.get(r4) != null) goto L13;
     */
    @Override // X.X3L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean canResume(int r4) {
        /*
            r3 = this;
            X.X3D r2 = r3.LIZ
            r1 = 0
            if (r2 == 0) goto L1e
            monitor-enter(r2)
            if (r4 == 0) goto L1d
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r2.LIZ     // Catch: java.lang.Throwable -> L17
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L1c
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r2.LIZJ     // Catch: java.lang.Throwable -> L17
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L17
            goto L1a
        L17:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L1a:
            if (r0 == 0) goto L1d
        L1c:
            r1 = 1
        L1d:
            monitor-exit(r2)
        L1e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X38.canResume(int):boolean");
    }

    @Override // X.X3L
    public final void forceDownloadIngoreRecommendSize(int i) {
        LJFF(new ARunnableS19S0101000_15(this, i, 1));
    }

    @Override // X.X3L
    public final long getCurBytes(int i) {
        DownloadInfo downloadInfo;
        InterfaceC84211X3f interfaceC84211X3f = this.LIZIZ;
        if (interfaceC84211X3f == null || (downloadInfo = interfaceC84211X3f.getDownloadInfo(i)) == null) {
            return 0L;
        }
        return downloadInfo.getCurBytes();
    }

    @Override // X.X3L
    public final X2C getDownloadFileUriProvider(int i) {
        X3D x3d = this.LIZ;
        synchronized (x3d) {
            DownloadTask downloadTask = x3d.LIZ.get(i);
            if (downloadTask != null) {
                return downloadTask.getFileUriProvider();
            }
            DownloadTask downloadTask2 = x3d.LIZIZ.get(i);
            if (downloadTask2 != null) {
                return downloadTask2.getFileUriProvider();
            }
            DownloadTask downloadTask3 = x3d.LIZJ.get(i);
            if (downloadTask3 != null) {
                return downloadTask3.getFileUriProvider();
            }
            DownloadTask downloadTask4 = x3d.LIZLLL.get(i);
            if (downloadTask4 != null) {
                return downloadTask4.getFileUriProvider();
            }
            return null;
        }
    }

    @Override // X.X3L
    public final DownloadInfo getDownloadInfo(int i) {
        return this.LIZ.LJIIIZ(i);
    }

    @Override // X.X3L
    public final List<DownloadInfo> getDownloadInfoList(String str) {
        ArrayList arrayList;
        X3D x3d = this.LIZ;
        if (!x3d.LJIIIIZZ) {
            return x3d.LJIIJJI(str);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List<DownloadInfo> downloadInfoList = x3d.LJII.getDownloadInfoList(str);
        if (downloadInfoList != null && !downloadInfoList.isEmpty()) {
            return downloadInfoList;
        }
        synchronized (x3d) {
            arrayList = new ArrayList();
            int size = x3d.LIZ.size();
            for (int i = 0; i < size; i++) {
                DownloadTask valueAt = x3d.LIZ.valueAt(i);
                if (valueAt != null && valueAt.getDownloadInfo() != null && str.equals(valueAt.getDownloadInfo().getUrl())) {
                    arrayList.add(valueAt.getDownloadInfo());
                }
            }
        }
        return arrayList;
    }

    @Override // X.X3L
    public final List<DownloadInfo> getDownloadInfosByFileExtension(String str) {
        return this.LIZIZ.getDownloadInfosByFileExtension(str);
    }

    @Override // X.X3L
    public final InterfaceC84187X2h getDownloadNotificationEventListener(int i) {
        X3D x3d = this.LIZ;
        synchronized (x3d) {
            DownloadTask downloadTask = x3d.LIZ.get(i);
            if (downloadTask != null) {
                return downloadTask.getNotificationEventListener();
            }
            DownloadTask downloadTask2 = x3d.LIZIZ.get(i);
            if (downloadTask2 != null) {
                return downloadTask2.getNotificationEventListener();
            }
            DownloadTask downloadTask3 = x3d.LIZJ.get(i);
            if (downloadTask3 != null) {
                return downloadTask3.getNotificationEventListener();
            }
            DownloadTask downloadTask4 = x3d.LIZLLL.get(i);
            if (downloadTask4 != null) {
                return downloadTask4.getNotificationEventListener();
            }
            return null;
        }
    }

    @Override // X.X3L
    public final List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str) {
        X3D x3d = this.LIZ;
        x3d.getClass();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        X3E x3e = X3F.LJIIJJI;
        x3e.LIZIZ();
        Iterator it = new ArrayList(((ConcurrentHashMap) x3e.LIZ).keySet()).iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            DownloadInfo LJIIIZ = x3d.LJIIIZ(((Integer) it.next()).intValue());
            if (LJIIIZ != null && str.equals(LJIIIZ.getMimeType())) {
                arrayList.add(LJIIIZ);
            }
        }
        return arrayList;
    }

    @Override // X.X3L
    public final InterfaceC84186X2g getNotificationClickCallback(int i) {
        InterfaceC84186X2g notificationClickCallback;
        X3D x3d = this.LIZ;
        synchronized (x3d) {
            DownloadTask downloadTask = x3d.LIZ.get(i);
            if (downloadTask != null) {
                notificationClickCallback = downloadTask.getNotificationClickCallback();
            } else {
                DownloadTask downloadTask2 = x3d.LIZIZ.get(i);
                if (downloadTask2 != null) {
                    notificationClickCallback = downloadTask2.getNotificationClickCallback();
                } else {
                    DownloadTask downloadTask3 = x3d.LIZJ.get(i);
                    if (downloadTask3 != null) {
                        notificationClickCallback = downloadTask3.getNotificationClickCallback();
                    } else {
                        DownloadTask downloadTask4 = x3d.LIZLLL.get(i);
                        if (downloadTask4 == null) {
                            return null;
                        }
                        notificationClickCallback = downloadTask4.getNotificationClickCallback();
                    }
                }
            }
            if (notificationClickCallback == null) {
                return null;
            }
            return notificationClickCallback;
        }
    }

    @Override // X.X3L
    public final int getStatus(int i) {
        DownloadInfo LJIIIZ = this.LIZ.LJIIIZ(i);
        if (LJIIIZ == null) {
            return 0;
        }
        return LJIIIZ.getStatus();
    }

    @Override // X.X3L
    public final List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        return this.LIZIZ.getSuccessedDownloadInfosWithMimeType(str);
    }

    @Override // X.X3L
    public final List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        return this.LIZIZ.getUnCompletedDownloadInfosWithMimeType(str);
    }

    @Override // X.X3L
    public final boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return false;
        }
        int status = downloadInfo.getStatus();
        String savePath = downloadInfo.getSavePath();
        String name = downloadInfo.getName();
        if (status != -3 || X4Q.LJIJI(savePath, name)) {
            return false;
        }
        LJFF(new ARunnableS3S0111000_15(this, downloadInfo.getId(), 3));
        return true;
    }

    @Override // X.X3L
    public final boolean isDownloading(int i) {
        return this.LIZ.LJIILJJIL(i);
    }

    @Override // X.X3L
    public final void restart(int i) {
        LJFF(new ARunnableS19S0101000_15(this, i, 4));
    }

    @Override // X.X3L
    public final void restartAllFailedDownloadTasks(List<String> list) {
        LJFF(new ARunnableS34S0200000_15(list, this, 10));
    }

    @Override // X.X3L
    public final void restartAllPauseReserveOnWifiDownloadTasks(List<String> list) {
        LJFF(new ARunnableS34S0200000_15(list, this, 11));
    }

    @Override // X.X3L
    public final void resume(int i) {
        LJFF(new ARunnableS19S0101000_15(this, i, 3));
    }

    @Override // X.X3L
    public final void setLogLevel(int i) {
        C65210PiY.LIZ = i;
    }

    @Override // X.X3L
    public final void tryDownload(DownloadTask downloadTask) {
        LJFF(new ARunnableS34S0200000_15(downloadTask, this, 9));
    }

    @Override // X.X3L
    public final boolean updateDownloadInfo(DownloadInfo downloadInfo) {
        return this.LIZIZ.updateDownloadInfo(downloadInfo);
    }

    @Override // X.X3L
    public final void LJJJI(int i, boolean z) {
        ARunnableS19S0101000_15 aRunnableS19S0101000_15 = new ARunnableS19S0101000_15(this, i, 2);
        if (z) {
            aRunnableS19S0101000_15.run();
        } else {
            LJFF(aRunnableS19S0101000_15);
        }
    }

    @Override // X.X3L
    public final void LJJJJIZL(int i, boolean z) {
        X3K.LJ().LJIIIIZZ(i, z);
    }

    @Override // X.X3L
    public final void LJJLIIIJJI(int i, Notification notification) {
        X36 x36 = (X36) this.LIZJ;
        WeakReference<Service> weakReference = x36.LJLIL;
        if (weakReference != null && weakReference.get() != null) {
            if (C65210PiY.LIZ()) {
                String str = X36.LJLJLJ;
                StringBuilder LJ = C7MY.LJ("Id = ", i, ", service = ");
                LJ.append(x36.LJLIL.get());
                LJ.append(",  isServiceAlive = ");
                LJ.append(x36.LJLJI);
                C65210PiY.LIZIZ(str, "startForeground", X1D.LIZIZ(LJ));
            }
            try {
                C16880lQ.LLLILZ(x36.LJLIL.get(), i, notification);
                x36.LJLJJI = true;
                return;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return;
            }
        }
        if (C65210PiY.LIZ()) {
            C65210PiY.LIZIZ(X36.LJLJLJ, "startForeground", "DownloadService is null");
        }
    }

    @Override // X.X3L
    public final void LJJLIIIJLLLLLLLZ(int i, int i2) {
        if (C84212X3g.LJJIFFI != null) {
            Iterator it = ((CopyOnWriteArrayList) C84212X3g.LJJIFFI).iterator();
            while (it.hasNext()) {
                InterfaceC84163X1j interfaceC84163X1j = (InterfaceC84163X1j) it.next();
                if (interfaceC84163X1j != null) {
                    interfaceC84163X1j.LJJJIL(i2, i);
                }
            }
        }
    }

    @Override // X.X3L
    public final void cancel(int i, boolean z) {
        LJFF(new ARunnableS3S0111000_15(this, i, z, 2));
    }

    @Override // X.X3L
    public final void setDownloadNotificationEventListener(int i, InterfaceC84187X2h interfaceC84187X2h) {
        X3D x3d = this.LIZ;
        synchronized (x3d) {
            DownloadTask downloadTask = x3d.LIZ.get(i);
            if (downloadTask != null) {
                downloadTask.setNotificationEventListener(interfaceC84187X2h);
            }
        }
    }

    @Override // X.X3L
    public final void LJJIFFI(int i, boolean z, boolean z2) {
        LJFF(new ARunnableS0S0121000_15(this, i, z, z2, 1));
    }

    @Override // X.X3L
    public final void setThrottleNetSpeed(int i, long j, int i2) {
        LJFF(new X3B(this, i, j, i2));
    }

    @Override // X.X3L
    public final void LIZIZ(int i, int i2, IDownloadListener iDownloadListener, EnumC84256X4y enumC84256X4y, boolean z) {
        X3D x3d = this.LIZ;
        synchronized (x3d) {
            DownloadTask LJIIL = x3d.LJIIL(i);
            if (LJIIL != null || (LJIIL = x3d.LJFF.get(Integer.valueOf(i))) != null) {
                LJIIL.removeDownloadListener(i2, iDownloadListener, enumC84256X4y, z);
            }
        }
    }

    @Override // X.X3L
    public final void LJ(int i, int i2, IDownloadListener iDownloadListener, EnumC84256X4y enumC84256X4y, boolean z) {
        this.LIZ.LIZ(i, i2, iDownloadListener, enumC84256X4y, z, true);
    }

    @Override // X.X3L
    public final void LIZLLL(int i, int i2, IDownloadListener iDownloadListener, EnumC84256X4y enumC84256X4y, boolean z, boolean z2) {
        this.LIZ.LIZ(i, i2, iDownloadListener, enumC84256X4y, z, z2);
    }
}
