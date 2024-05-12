package Y;

import X.C16880lQ;
import X.C65210PiY;
import X.C84212X3g;
import X.C84923XUp;
import X.EnumC84256X4y;
import X.InterfaceC84927XUt;
import X.X1D;
import X.X38;
import X.X3D;
import X.X44;
import X.X4H;
import X.X4J;
import X.X4K;
import X.X4Q;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes16.dex */
public class ARunnableS3S0111000_15 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public boolean z1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        int LIZLLL;
        try {
            X4J x4j = (X4J) this.l0;
            if (x4j.LJLJJLL <= 0 || (LIZLLL = x4j.LIZLLL()) == 0) {
                return;
            }
            if (C65210PiY.LIZ()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("WaitingRetryTasksCount = ");
                LIZ.append(((X4J) this.l0).LJLJJLL);
                C65210PiY.LIZIZ("RetryScheduler", "doScheduleAllTaskRetry", X1D.LIZIZ(LIZ));
            }
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            synchronized (((X4J) this.l0).LJLJI) {
                for (int i = 0; i < ((X4J) this.l0).LJLJI.size(); i++) {
                    X4K valueAt = ((X4J) this.l0).LJLJI.valueAt(i);
                    if (valueAt != null && valueAt.LIZ(this.i2, LIZLLL, currentTimeMillis, this.z1)) {
                        if (this.z1) {
                            valueAt.LJII.set(valueAt.LIZLLL);
                        }
                        arrayList.add(valueAt);
                    }
                }
            }
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((X4J) this.l0).LIZIZ(((X4K) it.next()).LIZ, LIZLLL, false);
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void LIZ$1() {
        ((X3D) this.l0).LJI(this.i2);
        X3D x3d = (X3D) this.l0;
        int i = this.i2;
        boolean z = this.z1;
        try {
            if (!x3d.LJIIIIZZ) {
                DownloadInfo downloadInfo = x3d.LJII.getDownloadInfo(i);
                if (downloadInfo != null) {
                    X4Q.LJ(downloadInfo, z);
                    downloadInfo.erase();
                }
                try {
                    x3d.LJII.updateDownloadInfo(downloadInfo);
                } catch (SQLiteException e) {
                    C16880lQ.LLLLIIL(e);
                }
                if (x3d.LIZJ.get(i) != null) {
                    x3d.LIZJ.remove(i);
                }
                if (x3d.LIZIZ.get(i) != null) {
                    x3d.LIZIZ.remove(i);
                }
                x3d.LJFF.remove(Integer.valueOf(i));
                X4H.LJIIL(i);
                return;
            }
            DownloadInfo downloadInfo2 = x3d.LJII.getDownloadInfo(i);
            if (downloadInfo2 != null) {
                X4Q.LJ(downloadInfo2, z);
                downloadInfo2.erase();
            }
            try {
                x3d.LJII.updateDownloadInfo(downloadInfo2);
            } catch (SQLiteException e2) {
                C16880lQ.LLLLIIL(e2);
            }
            synchronized (x3d) {
                if (x3d.LIZJ.get(i) != null) {
                    x3d.LIZJ.remove(i);
                }
                if (x3d.LIZIZ.get(i) != null) {
                    x3d.LIZIZ.remove(i);
                }
                x3d.LJFF.remove(Integer.valueOf(i));
                X4H.LJIIL(i);
            }
        } catch (Throwable unused) {
        }
    }

    public final void LIZ$2() {
        X3D x3d = ((X38) this.l0).LIZ;
        int i = this.i2;
        boolean z = this.z1;
        if (!x3d.LJIIIIZZ) {
            synchronized (x3d) {
                if (C65210PiY.LIZ()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Trace:");
                    LIZ.append(Log.getStackTraceString(new Throwable()));
                    C65210PiY.LIZLLL(i, "AbsDownloadEngine", "cancel", X1D.LIZIZ(LIZ));
                }
                DownloadTask LJIIL = x3d.LJIIL(i);
                if (LJIIL != null) {
                    if (!X4H.LJFF(i, null).LJI("fix_on_cancel_call_twice", true)) {
                        new X44(LJIIL, x3d.LJIIIZ).LJIIL(-4, null, true);
                    }
                    DownloadInfo downloadInfo = LJIIL.getDownloadInfo();
                    x3d.LJIIIZ.post(new ARunnableS18S0400000_15(LJIIL.getDownloadListeners(EnumC84256X4y.MAIN), downloadInfo, LJIIL, LJIIL.getDownloadListeners(EnumC84256X4y.NOTIFICATION), 1));
                }
                DownloadInfo downloadInfo2 = x3d.LJII.getDownloadInfo(i);
                if (downloadInfo2 != null) {
                    downloadInfo2.setStatus(-4);
                }
                x3d.LIZLLL(i, z, false);
            }
            return;
        }
        if (C65210PiY.LIZ()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Trace:");
            LIZ2.append(Log.getStackTraceString(new Throwable()));
            C65210PiY.LIZLLL(i, "AbsDownloadEngine", "cancel", X1D.LIZIZ(LIZ2));
        }
        DownloadTask LJIIL2 = x3d.LJIIL(i);
        if (LJIIL2 != null) {
            DownloadInfo downloadInfo3 = LJIIL2.getDownloadInfo();
            if (downloadInfo3 != null) {
                downloadInfo3.setStatus(-4);
            }
            x3d.LJIIIZ.post(new ARunnableS18S0400000_15(LJIIL2.getDownloadListeners(EnumC84256X4y.MAIN), downloadInfo3, LJIIL2, LJIIL2.getDownloadListeners(EnumC84256X4y.NOTIFICATION), 0));
        }
        DownloadInfo downloadInfo4 = x3d.LJII.getDownloadInfo(i);
        if (downloadInfo4 != null) {
            downloadInfo4.setStatus(-4);
        }
        x3d.LIZLLL(i, z, false);
    }

    public final void LIZ$3() {
        X3D x3d = ((X38) this.l0).LIZ;
        int i = this.i2;
        boolean z = this.z1;
        if (C65210PiY.LIZ()) {
            x3d.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DeleteFile:");
            LIZ.append(z);
            LIZ.append("Trace:");
            LIZ.append(Log.getStackTraceString(new Throwable()));
            C65210PiY.LIZLLL(i, "AbsDownloadEngine", "resetDownloadData", X1D.LIZIZ(LIZ));
        }
        DownloadInfo downloadInfo = x3d.LJII.getDownloadInfo(i);
        if (downloadInfo != null) {
            X3D.LIZJ(downloadInfo);
        }
        x3d.LJIIIZ.post(new ARunnableS7S0001000_15(i, 1));
        C84212X3g.LJJIII(new ARunnableS3S0111000_15(x3d, i, z, 1));
    }

    public static final void run$0(ARunnableS3S0111000_15 aRunnableS3S0111000_15) {
        boolean LIZ;
        try {
            aRunnableS3S0111000_15.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS3S0111000_15 aRunnableS3S0111000_15) {
        boolean LIZ;
        try {
            aRunnableS3S0111000_15.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS3S0111000_15 aRunnableS3S0111000_15) {
        boolean LIZ;
        try {
            aRunnableS3S0111000_15.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS3S0111000_15 aRunnableS3S0111000_15) {
        boolean LIZ;
        try {
            aRunnableS3S0111000_15.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS3S0111000_15 aRunnableS3S0111000_15) {
        C84923XUp c84923XUp = (C84923XUp) aRunnableS3S0111000_15.l0;
        int i = aRunnableS3S0111000_15.i2;
        boolean z = aRunnableS3S0111000_15.z1;
        InterfaceC84927XUt interfaceC84927XUt = c84923XUp.LJFF.LJ;
        if (interfaceC84927XUt != null) {
            interfaceC84927XUt.LLLLLLLLLL(i, z);
        }
    }

    public ARunnableS3S0111000_15(X38 x38, int i, int i2) {
        this.$t = i2;
        this.l0 = x38;
        this.i2 = i;
        this.z1 = true;
    }

    public ARunnableS3S0111000_15(Object obj, int i, boolean z, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.z1 = z;
    }
}
