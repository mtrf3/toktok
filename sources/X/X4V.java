package X;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.InputStream;

/* loaded from: classes16.dex */
public final class X4V {
    public final DownloadInfo LIZ;
    public final String LIZIZ;
    public final X5F LIZJ;
    public final InterfaceC84211X3f LIZLLL;
    public final X3Y LJ;
    public C65205PiT LJFF;
    public BaseException LJI;
    public volatile boolean LJII;
    public volatile boolean LJIIIIZZ;
    public final X5P LJIIIZ;
    public long LJIIJ;
    public final long LJIIJJI;
    public volatile long LJIIL;
    public volatile long LJIILIIL;
    public final X4H LJIILJJIL;
    public final X4M LJIILL;
    public boolean LJIILLIIL = true;
    public final boolean LJIIZILJ;
    public final long LJIJ;
    public final long LJIJI;
    public final long LJIJJ;
    public final boolean LJIJJLI;
    public boolean LJIL;
    public long LJJ;
    public long LJJI;
    public long LJJIFFI;
    public long LJJII;
    public final X4Y LJJIII;
    public boolean LJJIIJ;
    public volatile boolean LJJIIJZLJL;
    public volatile boolean LJJIIZ;
    public volatile long LJJIIZI;
    public volatile long LJJIJ;

    public final boolean LIZIZ() {
        if (this.LJII || this.LJIIIIZZ) {
            return true;
        }
        return false;
    }

    public final void LIZJ(boolean z) {
        long j;
        if (!z && !this.LJIILLIIL) {
            return;
        }
        if (this.LJIJJLI) {
            j = System.nanoTime();
        } else {
            j = 0;
        }
        try {
            if (this.LJIILLIIL) {
                this.LJFF.LJLIL.LIZLLL();
            } else {
                this.LJFF.LJLIL.flush();
            }
            this.LIZ.updateRealDownloadTime(true);
            X3L LIZ = X3C.LIZ(X4P.LJIJ());
            if (LIZ != null) {
                LIZ.updateDownloadInfo(this.LIZ);
            } else {
                this.LJ.LJJLI(this.LIZ.getId(), this.LJIIJ);
            }
            this.LJJIIZI = this.LJIIJ;
        } catch (Exception unused) {
        }
        if (this.LJIJJLI) {
            this.LJJIFFI += System.nanoTime() - j;
        }
    }

    public final WBL LIZLLL(InputStream inputStream) {
        WBL wbm;
        if (inputStream instanceof WBL) {
            wbm = (WBL) inputStream;
        } else {
            wbm = new WBM(inputStream, (float) this.LJIILJJIL.LJII("throttle_factor_min", 0.10000000149011612d), (float) this.LJIILJJIL.LJII("throttle_factor_max", 0.699999988079071d));
        }
        long throttleNetSpeed = this.LIZ.getThrottleNetSpeed();
        int throttleSmoothness = this.LIZ.getThrottleSmoothness();
        wbm.LJLILLLLZI = throttleNetSpeed;
        if (throttleSmoothness >= 1 && throttleSmoothness <= 100) {
            wbm.LJLJI = throttleSmoothness;
        }
        wbm.LJLJJI = 1000 / wbm.LJLJI;
        wbm.LJLJJL = throttleNetSpeed / wbm.LJLJI;
        return wbm;
    }

    public final void LIZ(long j, boolean z) {
        long j2;
        long j3 = j - this.LJJIJ;
        if (this.LJIIZILJ) {
            if (this.LJIILL.LIZIZ()) {
                j2 = this.LJIJ;
            } else {
                j2 = this.LJIJI;
            }
            if (j3 > j2) {
                LIZJ(false);
                this.LJJIJ = j;
                return;
            }
            return;
        }
        long j4 = this.LJIIJ - this.LJJIIZI;
        if (!z && (j4 <= 65536 || j3 <= 500)) {
            return;
        }
        LIZJ(false);
        this.LJJIJ = j;
    }

    public X4V(DownloadInfo downloadInfo, String str, X5F x5f, long j, long j2, X4Y x4y, X5P x5p) {
        boolean z;
        this.LIZ = downloadInfo;
        this.LIZIZ = str;
        InterfaceC84211X3f LJIIJ = C84212X3g.LJIIJ();
        this.LIZLLL = LJIIJ;
        if (LJIIJ instanceof C84222X3q) {
            this.LJ = ((C84222X3q) LJIIJ).LJLILLLLZI;
        }
        this.LIZJ = x5f;
        this.LJIIIZ = x5p;
        this.LJIIJ = j;
        this.LJIIJJI = j;
        this.LJIILIIL = j2;
        this.LJIIL = downloadInfo.getEndOffset();
        this.LJIILL = C84221X3p.LIZ;
        X4H LJFF = X4H.LJFF(downloadInfo.getId(), null);
        this.LJIILJJIL = LJFF;
        if (LJFF.LJIIIIZZ("sync_strategy", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LJIIZILJ = z;
        if (z) {
            long LJIIIIZZ = LJFF.LJIIIIZZ("sync_interval_ms_fg", 5000);
            long LJIIIIZZ2 = LJFF.LJIIIIZZ("sync_interval_ms_bg", 1000);
            this.LJIJ = Math.max(LJIIIIZZ, 500L);
            this.LJIJI = Math.max(LJIIIIZZ2, 500L);
            this.LJIJJ = LJFF.LJIIJ("sync_min_length", 10485760L);
        } else {
            this.LJIJ = 0L;
            this.LJIJI = 0L;
            this.LJIJJ = 0L;
        }
        this.LJIJJLI = LJFF.LJIIIIZZ("monitor_rw", 0) == 1;
        this.LJJIII = x4y;
        this.LJJIIJ = true;
    }
}
