package X;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadPauseReserveWifiException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes16.dex */
public final class X44 {
    public static final String LJIILLIIL = C16880lQ.LJLLJ(X44.class);
    public final boolean LIZ;
    public final boolean LIZIZ;
    public DownloadInfo LIZJ;
    public final InterfaceC84211X3f LIZLLL;
    public final Handler LJ;
    public final DownloadTask LJFF;
    public SparseArray<IDownloadListener> LJI;
    public SparseArray<IDownloadListener> LJII;
    public SparseArray<IDownloadListener> LJIIIIZZ;
    public boolean LJIIIZ;
    public volatile long LJIIJ;
    public final AtomicLong LJIIJJI = new AtomicLong();
    public boolean LJIIL = false;
    public int LJIILIIL;
    public long LJIILJJIL;
    public InterfaceC84194X2o LJIILL;

    public final void LIZ() {
        DownloadTask downloadTask = this.LJFF;
        if (downloadTask != null) {
            this.LIZJ = downloadTask.getDownloadInfo();
            this.LJI = this.LJFF.getDownloadListeners(EnumC84256X4y.MAIN);
            this.LJIIIIZZ = this.LJFF.getDownloadListeners(EnumC84256X4y.NOTIFICATION);
            this.LJII = this.LJFF.getDownloadListeners(EnumC84256X4y.SUB);
            this.LJIILL = this.LJFF.getMonitorDepend();
        }
    }

    public final void LIZIZ() {
        List<InterfaceC84183X2d> downloadCompleteHandlers = this.LJFF.getDownloadCompleteHandlers();
        if (!downloadCompleteHandlers.isEmpty()) {
            DownloadInfo downloadInfo = this.LIZJ;
            LJIIL(11, null, true);
            this.LIZLLL.updateDownloadInfo(downloadInfo);
            for (InterfaceC84183X2d interfaceC84183X2d : downloadCompleteHandlers) {
                try {
                    if (interfaceC84183X2d.LJJJLL(downloadInfo)) {
                        interfaceC84183X2d.LJJJJZ(downloadInfo);
                        this.LIZLLL.updateDownloadInfo(downloadInfo);
                    }
                } catch (BaseException e) {
                    throw e;
                } catch (Throwable th) {
                    throw new BaseException(1071, th);
                }
            }
        }
    }

    public final void LIZJ() {
        this.LIZJ.setStatus(8);
        this.LIZJ.setAsyncHandleStatus(EnumC84255X4x.ASYNC_HANDLE_WAITING);
        X3D LJIIL = C84212X3g.LJIIL();
        if (LJIIL != null) {
            LJIIL.LJIIZILJ(this.LIZJ.getId(), this.LJFF.getHashCodeForSameTask(), 8);
        }
    }

    public final void LIZLLL() {
        if (this.LIZJ != null) {
            if (this.LIZ) {
                LIZIZ();
                if (C65210PiY.LIZ()) {
                    C65210PiY.LIZLLL(this.LIZJ.getId(), LJIILLIIL, "onCompleteForFileExist", "Success for fixStartWithFileExistUpdateError");
                }
                this.LIZJ.setSuccessByCache(true);
                LJIIL(-3, null, true);
                this.LIZLLL.LJJJJLI(this.LIZJ.getId(), this.LIZJ.getTotalBytes());
                this.LIZLLL.updateDownloadInfo(this.LIZJ);
                this.LIZLLL.LJLJI(this.LIZJ.getId());
                return;
            }
            LIZIZ();
            if (C65210PiY.LIZ()) {
                C65210PiY.LIZLLL(this.LIZJ.getId(), LJIILLIIL, "onCompleteForFileExist", "Success");
            }
            this.LIZJ.setSuccessByCache(true);
            LJIIL(-3, null, true);
            this.LIZLLL.LJJJJLI(this.LIZJ.getId(), this.LIZJ.getTotalBytes());
            this.LIZLLL.LJLJI(this.LIZJ.getId());
            return;
        }
        throw new BaseException(1087, "onCompleteForFileExist DownloadInfo is null");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:99:0x0374
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    public final void LJFF() {
        /*
            Method dump skipped, instructions count: 1017
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X44.LJFF():void");
    }

    public final void LJIIIIZZ() {
        this.LIZJ.setStatus(-2);
        try {
            this.LIZLLL.LJJIJIL(this.LIZJ.getId(), this.LIZJ.getCurBytes());
        } catch (SQLiteException e) {
            C16880lQ.LLLLIIL(e);
        }
        LJIIL(-2, null, true);
    }

    public final void LJIIJ() {
        if (this.LIZJ.canSkipStatusHandler()) {
            this.LIZJ.changeSkipStatus();
            return;
        }
        if (this.LIZJ.getDownloadStartTimeStamp() <= 0) {
            this.LIZJ.setDownloadStartTimeStamp(System.currentTimeMillis());
        }
        this.LIZLLL.LJJIL(this.LIZJ.getId());
        if (this.LIZJ.isFirstDownload()) {
            LJIIL(6, null, true);
        }
        LJIIL(2, null, true);
    }

    public final void LJI(BaseException baseException) {
        int i;
        Context LJ;
        this.LIZJ.setFirstDownload(false);
        String str = LJIILLIIL;
        int id = this.LIZJ.getId();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Exception:");
        LIZ.append(baseException);
        C65210PiY.LJ(id, str, "handleError", X1D.LIZIZ(LIZ));
        if (C65210PiY.LIZ()) {
            int id2 = this.LIZJ.getId();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Exception Trace:");
            LIZ2.append(android.util.Log.getStackTraceString(new Throwable()));
            C65210PiY.LJ(id2, str, "handleError", X1D.LIZIZ(LIZ2));
        }
        if (baseException != null && baseException.getCause() != null && (baseException.getCause() instanceof SQLiteFullException)) {
            try {
                this.LIZLLL.LJIIL(this.LIZJ.getId());
            } catch (SQLiteException e) {
                C16880lQ.LLLLIIL(e);
            }
        } else {
            try {
                try {
                    this.LIZLLL.LJJJLZIJ(this.LIZJ.getId(), this.LIZJ.getCurBytes());
                } catch (SQLiteException unused) {
                    this.LIZLLL.LJIIL(this.LIZJ.getId());
                }
            } catch (SQLiteException e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
        if (X4H.LJFF(this.LIZJ.getId(), null).LJIIIIZZ("download_failed_check_net", 1) == 1 && X4Q.LJJ(baseException) && (LJ = C84212X3g.LJ()) != null && !X4Q.LJIL(LJ) && !X4H.LIZIZ().optBoolean("disable_check_no_network")) {
            baseException = new BaseException(1049, baseException.getErrorMessage());
        }
        this.LIZJ.setFailedException(baseException);
        if (baseException instanceof DownloadPauseReserveWifiException) {
            i = -2;
        } else {
            i = -1;
        }
        LJIIJJI(i, baseException);
        if (X4H.LJFF(this.LIZJ.getId(), null).LJIIIIZZ("retry_schedule", 0) > 0) {
            X47.LIZ().tryStartScheduleRetry(this.LIZJ);
        }
    }

    public X44(DownloadTask downloadTask, INK ink) {
        this.LJFF = downloadTask;
        LIZ();
        this.LJ = ink;
        this.LIZLLL = C84212X3g.LJIIJ();
        DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
        if (downloadInfo != null) {
            this.LIZ = X4H.LJFF(downloadInfo.getId(), null).LJI("fix_start_with_file_exist_update_error", false);
        } else {
            this.LIZ = false;
        }
        this.LIZIZ = X4H.LJFF.LJIIIIZZ("fix_anr_progress_handle_msg", 0) > 0;
    }

    public final void LJ(String str, String str2) {
        if (C65210PiY.LIZ()) {
            String str3 = LJIILLIIL;
            int id = this.LIZJ.getId();
            StringBuilder LIZIZ = C25620zW.LIZIZ("ExistTargetFileName:", str2, " but curName is ");
            LIZIZ.append(this.LIZJ.getName());
            C65210PiY.LIZLLL(id, str3, "onCompleteForFileExist", X1D.LIZIZ(LIZIZ));
        }
        if (this.LIZ) {
            X4P.LJI(this.LIZJ, str, str2);
            LIZIZ();
            this.LIZJ.setSuccessByCache(true);
            LJIIL(-3, null, true);
            this.LIZLLL.updateDownloadInfo(this.LIZJ);
            return;
        }
        this.LIZLLL.updateDownloadInfo(this.LIZJ);
        X4P.LJI(this.LIZJ, str, str2);
        this.LIZJ.setSuccessByCache(true);
        LIZIZ();
        LJIIL(-3, null, true);
    }

    public final void LJIIIZ(BaseException baseException, boolean z) {
        int i;
        this.LIZJ.setFirstDownload(false);
        this.LJIIJJI.set(0L);
        this.LIZLLL.LJJLIIIJJIZ(this.LIZJ.getId());
        if (z) {
            i = 7;
        } else {
            i = 5;
        }
        LJIIL(i, baseException, true);
    }

    public final void LJIIJJI(int i, BaseException baseException) {
        LJIIL(i, baseException, true);
    }

    public final void LJII(long j, String str, String str2) {
        this.LIZJ.setTotalBytes(j);
        this.LIZJ.seteTag(str);
        if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(this.LIZJ.getName())) {
            this.LIZJ.setName(str2);
        }
        try {
            this.LIZLLL.LJIL(this.LIZJ.getId(), str, str2, j);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        LJIIL(3, null, true);
        this.LJIILJJIL = this.LIZJ.getMinByteIntervalForPostToMainThread(j);
        this.LJIILIIL = this.LIZJ.getMinProgressTimeMsInterval();
        this.LJIIIZ = true;
        X47.LIZ().scheduleRetryWhenHasTaskConnected();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(int r19, com.ss.android.socialbase.downloader.exception.BaseException r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X44.LJIIL(int, com.ss.android.socialbase.downloader.exception.BaseException, boolean):void");
    }
}
