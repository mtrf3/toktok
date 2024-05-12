package X;

import Y.ARunnableS0S0121000_15;
import Y.ARunnableS18S0400000_15;
import Y.ARunnableS4S0401000_15;
import Y.ARunnableS7S0001000_15;
import android.database.sqlite.SQLiteException;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes16.dex */
public abstract class X3D implements INL {
    public final boolean LJIIIIZZ;
    public final SparseArray<DownloadTask> LIZ = new SparseArray<>();
    public final SparseArray<DownloadTask> LIZIZ = new SparseArray<>();
    public final SparseArray<DownloadTask> LIZJ = new SparseArray<>();
    public final SparseArray<DownloadTask> LIZLLL = new SparseArray<>();
    public final SparseArray<SparseArray<DownloadTask>> LJ = new SparseArray<>();
    public final X40<Integer, DownloadTask> LJFF = new X40<>();
    public final LinkedBlockingDeque<DownloadTask> LJI = new LinkedBlockingDeque<>();
    public final INK LJIIIZ = new INK(C16880lQ.LLJJJJ(), this);
    public final InterfaceC84211X3f LJII = C84212X3g.LJIIJ();

    public abstract X4O LJI(int i);

    public abstract void LJII(int i);

    public abstract boolean LJIILJJIL(int i);

    public X3D() {
        this.LJIIIIZZ = X4H.LJFF.LJIIIIZZ("fix_anr_isolate_engine_and_cache", 0) > 0;
    }

    public static void LIZJ(DownloadInfo downloadInfo) {
        try {
            if (downloadInfo.getStatus() == 7 || downloadInfo.getRetryDelayStatus() != EnumC84257X4z.DELAY_RETRY_NONE) {
                downloadInfo.setStatus(5);
                downloadInfo.setRetryDelayStatus(EnumC84257X4z.DELAY_RETRY_NONE);
            }
        } catch (Throwable unused) {
        }
    }

    public final void LJIIIIZZ(DownloadTask downloadTask) {
        DownloadInfo downloadInfo;
        if (downloadTask == null || (downloadInfo = downloadTask.getDownloadInfo()) == null) {
            return;
        }
        try {
            if (this.LJI.isEmpty()) {
                LJIJJLI(downloadTask);
                this.LJI.put(downloadTask);
                return;
            }
            if (downloadInfo.getEnqueueType() == VFA.ENQUEUE_TAIL) {
                if (this.LJI.getFirst().getDownloadId() == downloadTask.getDownloadId() && LJIILJJIL(downloadTask.getDownloadId())) {
                    return;
                }
                Iterator<DownloadTask> it = this.LJI.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    DownloadTask next = it.next();
                    if (next != null && next.getDownloadId() == downloadTask.getDownloadId()) {
                        it.remove();
                        break;
                    }
                }
                this.LJI.put(downloadTask);
                if (!X4H.LJFF.LJI("fix_enqueue_tail_duplicated_prepare", true)) {
                    X44 x44 = new X44(downloadTask, this.LJIIIZ);
                    if (!x44.LIZJ.canSkipStatusHandler()) {
                        x44.LIZJ.setStatus(1);
                        return;
                    }
                    return;
                }
                return;
            }
            DownloadTask first = this.LJI.getFirst();
            if (first.getDownloadId() == downloadTask.getDownloadId() && LJIILJJIL(downloadTask.getDownloadId())) {
                return;
            }
            LJIILL(first.getDownloadId());
            LJIJJLI(downloadTask);
            if (first.getDownloadId() != downloadTask.getDownloadId()) {
                this.LJI.putFirst(downloadTask);
            }
        } catch (InterruptedException unused) {
        }
    }

    public final DownloadInfo LJIIIZ(int i) {
        if (!this.LJIIIIZZ) {
            return LJIIJ(i);
        }
        DownloadInfo downloadInfo = this.LJII.getDownloadInfo(i);
        if (downloadInfo == null) {
            synchronized (this) {
                DownloadTask downloadTask = this.LIZ.get(i);
                if (downloadTask != null) {
                    downloadInfo = downloadTask.getDownloadInfo();
                }
            }
        }
        return downloadInfo;
    }

    public final synchronized DownloadInfo LJIIJ(int i) {
        DownloadInfo downloadInfo;
        DownloadTask downloadTask;
        downloadInfo = this.LJII.getDownloadInfo(i);
        if (downloadInfo == null && (downloadTask = this.LIZ.get(i)) != null) {
            downloadInfo = downloadTask.getDownloadInfo();
        }
        return downloadInfo;
    }

    public final synchronized List<DownloadInfo> LJIIJJI(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List<DownloadInfo> downloadInfoList = this.LJII.getDownloadInfoList(str);
        if (downloadInfoList == null || downloadInfoList.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            int size = this.LIZ.size();
            for (int i = 0; i < size; i++) {
                DownloadTask valueAt = this.LIZ.valueAt(i);
                if (valueAt != null && valueAt.getDownloadInfo() != null && str.equals(valueAt.getDownloadInfo().getUrl())) {
                    arrayList.add(valueAt.getDownloadInfo());
                }
            }
            return arrayList;
        }
        return downloadInfoList;
    }

    public final DownloadTask LJIIL(int i) {
        DownloadTask downloadTask;
        if (!this.LJIIIIZZ) {
            DownloadTask downloadTask2 = this.LIZ.get(i);
            if (downloadTask2 == null) {
                DownloadTask downloadTask3 = this.LIZJ.get(i);
                if (downloadTask3 == null) {
                    DownloadTask downloadTask4 = this.LIZIZ.get(i);
                    if (downloadTask4 == null) {
                        return this.LIZLLL.get(i);
                    }
                    return downloadTask4;
                }
                return downloadTask3;
            }
            return downloadTask2;
        }
        synchronized (this) {
            downloadTask = this.LIZ.get(i);
            if (downloadTask == null && (downloadTask = this.LIZJ.get(i)) == null && (downloadTask = this.LIZIZ.get(i)) == null) {
                downloadTask = this.LIZLLL.get(i);
            }
        }
        return downloadTask;
    }

    public final void LJIILL(int i) {
        if (!this.LJIIIIZZ) {
            LJIILLIIL(i);
            return;
        }
        if (C65210PiY.LIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Trace:");
            LIZ.append(android.util.Log.getStackTraceString(new Throwable()));
            C65210PiY.LIZLLL(i, "AbsDownloadEngine", "pause", X1D.LIZIZ(LIZ));
        }
        DownloadInfo downloadInfo = this.LJII.getDownloadInfo(i);
        if (downloadInfo != null && downloadInfo.getStatus() == 11) {
            return;
        }
        LJII(i);
        synchronized (this) {
            if (downloadInfo == null) {
                DownloadTask downloadTask = this.LIZ.get(i);
                if (downloadTask != null) {
                    new X44(downloadTask, this.LJIIIZ).LJIIIIZZ();
                }
            } else {
                LIZJ(downloadInfo);
                if (downloadInfo.getStatus() == 1) {
                    DownloadTask downloadTask2 = this.LIZ.get(i);
                    if (downloadTask2 != null) {
                        new X44(downloadTask2, this.LJIIIZ).LJIIIIZZ();
                    }
                } else if (C47261Igj.LJJIIJZLJL(downloadInfo.getStatus())) {
                    downloadInfo.setStatus(-2);
                }
            }
        }
    }

    public final synchronized boolean LJIILLIIL(int i) {
        if (C65210PiY.LIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Trace:");
            LIZ.append(android.util.Log.getStackTraceString(new Throwable()));
            C65210PiY.LIZLLL(i, "AbsDownloadEngine", "pause", X1D.LIZIZ(LIZ));
        }
        DownloadInfo downloadInfo = this.LJII.getDownloadInfo(i);
        if (downloadInfo != null && downloadInfo.getStatus() == 11) {
            return false;
        }
        synchronized (this.LIZ) {
            LJII(i);
        }
        if (downloadInfo == null) {
            DownloadTask downloadTask = this.LIZ.get(i);
            if (downloadTask != null) {
                new X44(downloadTask, this.LJIIIZ).LJIIIIZZ();
                return true;
            }
        } else {
            LIZJ(downloadInfo);
            if (downloadInfo.getStatus() == 1) {
                DownloadTask downloadTask2 = this.LIZ.get(i);
                if (downloadTask2 != null) {
                    new X44(downloadTask2, this.LJIIIZ).LJIIIIZZ();
                    return true;
                }
            } else if (C47261Igj.LJJIIJZLJL(downloadInfo.getStatus())) {
                downloadInfo.setStatus(-2);
                return true;
            }
        }
        return false;
    }

    public final synchronized void LJIJI(int i) {
        if (C65210PiY.LIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Trace:");
            LIZ.append(android.util.Log.getStackTraceString(new Throwable()));
            C65210PiY.LIZLLL(i, "AbsDownloadEngine", "restart", X1D.LIZIZ(LIZ));
        }
        DownloadTask downloadTask = this.LIZJ.get(i);
        if (downloadTask != null) {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            if (downloadInfo != null) {
                downloadInfo.setDownloadFromReserveWifi(false);
            }
            LJIL(downloadTask);
        }
    }

    public final synchronized void LJIJJ(int i) {
        DownloadInfo downloadInfo;
        DownloadTask downloadTask = this.LIZLLL.get(i);
        if (downloadTask != null && (downloadInfo = downloadTask.getDownloadInfo()) != null) {
            if (downloadInfo.canReStartAsyncTask()) {
                LJIL(downloadTask);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x02ab, code lost:
    
        if (r2 != null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x029f, code lost:
    
        if (r2 == null) goto L114;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI(com.ss.android.socialbase.downloader.model.DownloadTask r12) {
        /*
            Method dump skipped, instructions count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X3D.LJIJJLI(com.ss.android.socialbase.downloader.model.DownloadTask):void");
    }

    public final synchronized void LJIL(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
        if (downloadInfo == null) {
            return;
        }
        downloadInfo.setDownloadFromReserveWifi(false);
        if (downloadInfo.getEnqueueType() != VFA.ENQUEUE_NONE) {
            LJIIIIZZ(downloadTask);
        } else {
            LJIJJLI(downloadTask);
        }
    }

    public final void LJJ(int i) {
        DownloadTask first;
        if (this.LJI.isEmpty()) {
            return;
        }
        DownloadTask first2 = this.LJI.getFirst();
        if (first2 != null && first2.getDownloadId() == i) {
            this.LJI.poll();
        }
        if (!this.LJI.isEmpty() && (first = this.LJI.getFirst()) != null) {
            LJIJJLI(first);
        }
    }

    @Override // X.INL
    public final void handleMsg(Message message) {
        BaseException baseException;
        DownloadTask downloadTask;
        boolean z;
        int i = message.arg1;
        int i2 = message.arg2;
        if (C65210PiY.LIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Listener hashCode: ");
            LIZ.append(i2);
            C65210PiY.LIZLLL(i, "AbsDownloadEngine", "handleMsg", X1D.LIZIZ(LIZ));
        }
        Object obj = message.obj;
        if (obj instanceof Exception) {
            baseException = (BaseException) obj;
        } else {
            baseException = null;
        }
        synchronized (this) {
            if (i2 == 0) {
                downloadTask = this.LIZ.get(i);
            } else {
                SparseArray<DownloadTask> sparseArray = this.LJ.get(i);
                if (sparseArray != null) {
                    downloadTask = sparseArray.get(i2);
                }
            }
            if (downloadTask != null) {
                int i3 = message.what;
                DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
                if (downloadInfo == null) {
                    C65210PiY.LIZJ("AbsDownloadEngine", "notifyDownloadTaskStatus", "DownloadInfo is null\"");
                } else {
                    EnumC84256X4y enumC84256X4y = EnumC84256X4y.MAIN;
                    SparseArray<IDownloadListener> downloadListeners = downloadTask.getDownloadListeners(enumC84256X4y);
                    EnumC84256X4y enumC84256X4y2 = EnumC84256X4y.NOTIFICATION;
                    SparseArray<IDownloadListener> downloadListeners2 = downloadTask.getDownloadListeners(enumC84256X4y2);
                    if (!downloadTask.canShowNotification() && !downloadInfo.isAutoInstallWithoutNotification()) {
                        z = false;
                        C78598Ut0.LJIILL(i3, downloadListeners, true, downloadInfo, baseException, enumC84256X4y, downloadTask);
                        C78598Ut0.LJIILL(i3, downloadListeners2, z, downloadInfo, baseException, enumC84256X4y2, downloadTask);
                    }
                    z = true;
                    C78598Ut0.LJIILL(i3, downloadListeners, true, downloadInfo, baseException, enumC84256X4y, downloadTask);
                    C78598Ut0.LJIILL(i3, downloadListeners2, z, downloadInfo, baseException, enumC84256X4y2, downloadTask);
                }
                LJIIZILJ(i, i2, message.what);
            }
        }
    }

    public final DownloadTask LJIILIIL(int i, int i2) {
        DownloadTask downloadTask;
        synchronized (this) {
            if (i2 == 0) {
                downloadTask = this.LIZ.get(i);
            } else {
                SparseArray<DownloadTask> sparseArray = this.LJ.get(i);
                if (sparseArray != null) {
                    downloadTask = sparseArray.get(i2);
                } else {
                    downloadTask = null;
                }
            }
        }
        return downloadTask;
    }

    public final void LJIJ(int i, int i2) {
        if (C65210PiY.LIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Listener hashCode: ");
            LIZ.append(i2);
            C65210PiY.LIZLLL(i, "AbsDownloadEngine", "removeTask", X1D.LIZIZ(LIZ));
        }
        if (i2 == 0) {
            this.LIZ.remove(i);
            this.LJ.remove(i);
            return;
        }
        SparseArray<DownloadTask> sparseArray = this.LJ.get(i);
        if (sparseArray != null) {
            sparseArray.remove(i2);
            if (C65210PiY.LIZ()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("After downloadTaskWithListenerMap removeTask taskArray.size: ");
                LIZ2.append(sparseArray.size());
                C65210PiY.LIZLLL(i, "AbsDownloadEngine", "removeTask", X1D.LIZIZ(LIZ2));
            }
            if (sparseArray.size() != 0) {
                return;
            }
            this.LIZ.remove(i);
            this.LJ.remove(i);
            return;
        }
        this.LIZ.remove(i);
    }

    public final void LIZLLL(int i, boolean z, boolean z2) {
        if (C65210PiY.LIZ()) {
            StringBuilder LIZLLL = C00F.LIZLLL("DeleteFile:", z, " deleteFileIgnoreSecurity:", z2, "Trace:");
            LIZLLL.append(android.util.Log.getStackTraceString(new Throwable()));
            C65210PiY.LIZLLL(i, "AbsDownloadEngine", "clearDownloadData", X1D.LIZIZ(LIZLLL));
        }
        DownloadInfo downloadInfo = this.LJII.getDownloadInfo(i);
        if (downloadInfo != null) {
            LIZJ(downloadInfo);
        }
        this.LJIIIZ.post(new ARunnableS7S0001000_15(i, 0));
        C84212X3g.LJJIII(new ARunnableS0S0121000_15(this, i, z, z2, 0));
    }

    public final void LJ(int i, boolean z, boolean z2) {
        if (!this.LJIIIIZZ) {
            LJFF(i, z, z2);
            return;
        }
        if (C65210PiY.LIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DeleteFile:");
            LIZ.append(z);
            LIZ.append(" deleteFileIgnoreSecurity:");
            LIZ.append(z2);
            C65210PiY.LIZLLL(i, "AbsDownloadEngine", "clearDownloadDataInSubThread", X1D.LIZIZ(LIZ));
        }
        try {
            DownloadInfo downloadInfo = this.LJII.getDownloadInfo(i);
            if (downloadInfo != null) {
                if (z) {
                    if (z2) {
                        new C84238X4g(downloadInfo.getSavePath(), downloadInfo.getName(), false, false).LJIIL();
                    }
                    X4Q.LJ(downloadInfo, z);
                } else {
                    X4Q.LJI(downloadInfo.getTempPath(), downloadInfo.getTempName());
                }
                downloadInfo.erase();
            }
            try {
                this.LJII.LJIIL(i);
            } catch (SQLiteException e) {
                C16880lQ.LLLLIIL(e);
            }
            synchronized (this) {
                LJIIZILJ(i, 0, -4);
                if (this.LIZJ.get(i) != null) {
                    this.LIZJ.remove(i);
                }
                if (this.LIZIZ.get(i) != null) {
                    this.LIZIZ.remove(i);
                }
                this.LJFF.remove(Integer.valueOf(i));
                X4H.LJIIL(i);
            }
        } catch (Throwable unused) {
        }
    }

    public final synchronized void LJFF(int i, boolean z, boolean z2) {
        if (C65210PiY.LIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DeleteFile:");
            LIZ.append(z);
            LIZ.append(" deleteFileIgnoreSecurity:");
            LIZ.append(z2);
            C65210PiY.LIZLLL(i, "AbsDownloadEngine", "clearDownloadDataInSubThread", X1D.LIZIZ(LIZ));
        }
        try {
            DownloadInfo downloadInfo = this.LJII.getDownloadInfo(i);
            if (downloadInfo != null) {
                if (z) {
                    if (z2) {
                        new C84238X4g(downloadInfo.getSavePath(), downloadInfo.getName(), false, false).LJIIL();
                    }
                    X4Q.LJ(downloadInfo, z);
                } else {
                    X4Q.LJI(downloadInfo.getTempPath(), downloadInfo.getTempName());
                }
                downloadInfo.erase();
            }
            try {
                this.LJII.LJIIL(i);
            } catch (SQLiteException e) {
                C16880lQ.LLLLIIL(e);
            }
            LJIIZILJ(i, 0, -4);
            if (this.LIZJ.get(i) != null) {
                this.LIZJ.remove(i);
            }
            if (this.LIZIZ.get(i) != null) {
                this.LIZIZ.remove(i);
            }
            this.LJFF.remove(Integer.valueOf(i));
            X4H.LJIIL(i);
        } catch (Throwable unused) {
        }
    }

    public final synchronized void LJIIZILJ(int i, int i2, int i3) {
        if (i3 != -7) {
            if (i3 != -6) {
                if (i3 != -4) {
                    if (i3 != -3) {
                        if (i3 != -1) {
                            if (i3 != 7) {
                                if (i3 == 8) {
                                    DownloadTask downloadTask = this.LIZ.get(i);
                                    if (downloadTask != null && this.LIZLLL.get(i) == null) {
                                        this.LIZLLL.put(i, downloadTask);
                                    }
                                    LJJ(i);
                                }
                            } else if (C65210PiY.LIZ()) {
                                C65210PiY.LJ(i, "AbsDownloadEngine", "refreshDownloadTaskMap", "Retry delay disable");
                            }
                        }
                    } else {
                        this.LIZIZ.put(i, this.LIZ.get(i));
                        LJIJ(i, i2);
                        LJJ(i);
                    }
                } else {
                    LJIJ(i, i2);
                    LJJ(i);
                }
            } else {
                this.LIZIZ.put(i, this.LIZ.get(i));
                LJIJ(i, i2);
            }
        }
        DownloadTask downloadTask2 = this.LIZ.get(i);
        if (downloadTask2 != null) {
            if (this.LIZJ.get(i) == null) {
                this.LIZJ.put(i, downloadTask2);
            }
            LJIJ(i, i2);
        }
        LJJ(i);
    }

    public final void LIZ(int i, int i2, IDownloadListener iDownloadListener, EnumC84256X4y enumC84256X4y, boolean z, boolean z2) {
        if (!this.LJIIIIZZ) {
            LIZIZ(i, i2, iDownloadListener, enumC84256X4y, z, z2);
            return;
        }
        synchronized (this) {
            DownloadTask LJIIL = LJIIL(i);
            if (LJIIL != null) {
                LJIIL.addDownloadListener(i2, iDownloadListener, enumC84256X4y, z);
                DownloadInfo downloadInfo = LJIIL.getDownloadInfo();
                if (z2 && downloadInfo != null && !LJIILJJIL(i) && ((enumC84256X4y == EnumC84256X4y.MAIN || enumC84256X4y == EnumC84256X4y.NOTIFICATION) && (enumC84256X4y != EnumC84256X4y.NOTIFICATION || downloadInfo.canShowNotification()))) {
                    this.LJIIIZ.post(new ARunnableS4S0401000_15(iDownloadListener, downloadInfo.getStatus(), downloadInfo, LJIIL, enumC84256X4y, 0));
                }
                return;
            }
            DownloadInfo downloadInfo2 = this.LJII.getDownloadInfo(i);
            synchronized (this) {
                if (downloadInfo2 != null) {
                    if (downloadInfo2.getStatus() != -3) {
                        DownloadTask downloadTask = this.LJFF.get(Integer.valueOf(i));
                        if (downloadTask == null) {
                            downloadTask = new DownloadTask(downloadInfo2);
                            this.LJFF.put(Integer.valueOf(i), downloadTask);
                        }
                        downloadTask.addDownloadListener(i2, iDownloadListener, enumC84256X4y, z);
                    }
                }
            }
        }
    }

    public final synchronized void LIZIZ(int i, int i2, IDownloadListener iDownloadListener, EnumC84256X4y enumC84256X4y, boolean z, boolean z2) {
        DownloadTask LJIIL = LJIIL(i);
        if (LJIIL != null) {
            LJIIL.addDownloadListener(i2, iDownloadListener, enumC84256X4y, z);
            DownloadInfo downloadInfo = LJIIL.getDownloadInfo();
            if (z2 && downloadInfo != null && !LJIILJJIL(i) && ((enumC84256X4y == EnumC84256X4y.MAIN || enumC84256X4y == EnumC84256X4y.NOTIFICATION) && (enumC84256X4y != EnumC84256X4y.NOTIFICATION || downloadInfo.canShowNotification()))) {
                this.LJIIIZ.post(new ARunnableS18S0400000_15(iDownloadListener, downloadInfo, LJIIL, enumC84256X4y, 2));
            }
        } else {
            DownloadInfo downloadInfo2 = this.LJII.getDownloadInfo(i);
            if (downloadInfo2 != null && downloadInfo2.getStatus() != -3) {
                DownloadTask downloadTask = this.LJFF.get(Integer.valueOf(i));
                if (downloadTask == null) {
                    downloadTask = new DownloadTask(downloadInfo2);
                    this.LJFF.put(Integer.valueOf(i), downloadTask);
                }
                downloadTask.addDownloadListener(i2, iDownloadListener, enumC84256X4y, z);
            }
        }
    }
}
