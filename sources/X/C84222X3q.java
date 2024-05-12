package X;

import Y.ARunnableS51S0100000_15;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.X3q, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84222X3q implements InterfaceC84211X3f {
    public static final AtomicBoolean LJLJJLL = new AtomicBoolean(false);
    public final C84223X3r LJLIL;
    public X3Y LJLILLLLZI;
    public volatile boolean LJLJI;
    public volatile boolean LJLJJI;
    public final INK LJLJJL;

    @Override // X.InterfaceC84211X3f
    public final boolean LJJLIIIIJ() {
        if (this.LJLJI) {
            return true;
        }
        if (this.LJLIL.LJLJI) {
            LIZ();
            return this.LJLJI;
        }
        synchronized (this) {
            if (!this.LJLJI) {
                if (C65210PiY.LIZ()) {
                    C65210PiY.LIZIZ("DefaultDownloadCache", "ensureDownloadCacheSyncSuccess", "Waiting start");
                }
                try {
                    wait(5000L);
                } catch (InterruptedException e) {
                    C16880lQ.LLLLIIL(e);
                }
                if (C65210PiY.LIZ()) {
                    C65210PiY.LIZIZ("DefaultDownloadCache", "ensureDownloadCacheSyncSuccess", "Waiting end");
                }
            }
        }
        return this.LJLJI;
    }

    @Override // X.InterfaceC84211X3f
    public final void clearData() {
        try {
            this.LJLIL.clearData();
        } catch (SQLiteException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (X4P.LJIJ()) {
            X3L LIZ = X3C.LIZ(true);
            if (LIZ != null) {
                LIZ.clearData();
                return;
            } else {
                this.LJLILLLLZI.clearData();
                return;
            }
        }
        this.LJLILLLLZI.clearData();
    }

    @Override // X.InterfaceC84211X3f
    public final List<DownloadInfo> getAllDownloadInfo() {
        return this.LJLIL.getAllDownloadInfo();
    }

    public C84222X3q() {
        C84227X3v c84227X3v = new C84227X3v(this);
        this.LJLJJL = null;
        X4H x4h = X4H.LJFF;
        if (x4h.LJI("fix_sigbus_downloader_db", false)) {
            if (!X4P.LJIILJJIL() && C84212X3g.LJFF != null) {
                X3R x3r = C84212X3g.LJFF;
                C84228X3w c84228X3w = new C84228X3w(this);
                x3r.getClass();
                ServiceConnectionC84229X3x serviceConnectionC84229X3x = new ServiceConnectionC84229X3x();
                serviceConnectionC84229X3x.LJLJJI = c84228X3w;
                this.LJLILLLLZI = serviceConnectionC84229X3x;
            } else {
                this.LJLILLLLZI = new X4A();
            }
        } else {
            this.LJLILLLLZI = new X4A();
        }
        this.LJLJI = false;
        this.LJLJJL = new INK(C16880lQ.LLJJJJ(), c84227X3v);
        if (X4H.LIZIZ().optInt("lru_download_info_cache_enable", 0) > 0) {
            this.LJLIL = new C84224X3s(this.LJLILLLLZI);
        } else {
            this.LJLIL = new C84223X3r();
        }
        ARunnableS51S0100000_15 aRunnableS51S0100000_15 = new ARunnableS51S0100000_15(this, 8);
        long LJIIJ = x4h.LJIIJ("delay_init_download_cache_ms", 0L);
        if (LJIIJ > 0) {
            C84212X3g.LJJIIZ(aRunnableS51S0100000_15, LJIIJ, TimeUnit.MILLISECONDS);
        } else {
            aRunnableS51S0100000_15.run();
        }
    }

    public final void LIZ() {
        X3D LJIIL = C84212X3g.LJIIL();
        synchronized (LJIIL) {
            if (!this.LJLJI) {
                if (C65210PiY.LIZ()) {
                    C65210PiY.LIZIZ("DefaultDownloadCache", "newEnsureDownloadCacheSyncSuccess", "Waiting start");
                }
                LLZZJLIL();
                try {
                    LJIIL.wait(5000L);
                } catch (InterruptedException e) {
                    C16880lQ.LLLLIIL(e);
                }
                if (C65210PiY.LIZ()) {
                    C65210PiY.LIZIZ("DefaultDownloadCache", "newEnsureDownloadCacheSyncSuccess", "Waiting end");
                }
            }
        }
    }

    public final void LIZIZ() {
        X3D LJIIL = C84212X3g.LJIIL();
        synchronized (LJIIL) {
            this.LJLJI = true;
            LJIIL.notifyAll();
        }
    }

    @Override // X.InterfaceC84211X3f
    public final void LLZZJLIL() {
        if (C65210PiY.LIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Run isRunInit:");
            LIZ.append(LJLJJLL.get());
            C65210PiY.LIZIZ("DefaultDownloadCache", "initImmediately", X1D.LIZIZ(LIZ));
        }
        if (LJLJJLL.compareAndSet(false, true)) {
            if (C65210PiY.LIZ()) {
                C65210PiY.LIZIZ("DefaultDownloadCache", "init", "Run");
            }
            C84212X3g.LJIJJ(EnumC35469Dw1.SYNC_START);
            SparseArray sparseArray = new SparseArray();
            for (Map.Entry entry : ((ConcurrentHashMap) this.LJLIL.LJLIL).entrySet()) {
                if (((Integer) entry.getKey()).intValue() != 0 && entry.getValue() != null) {
                    sparseArray.put(((Integer) entry.getKey()).intValue(), entry.getValue());
                }
            }
            this.LJLILLLLZI.j(sparseArray, this.LJLIL.LIZLLL(), this.LJLIL.LIZIZ(), this.LJLIL.LIZJ(), new C84225X3t(this, sparseArray));
        }
    }

    @Override // X.InterfaceC84211X3f
    public final boolean isDownloadCacheSyncSuccess() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC84211X3f
    public final boolean LJIIL(int i) {
        if (X4P.LJIJ()) {
            X3L LIZ = X3C.LIZ(true);
            if (LIZ != null) {
                LIZ.LJIIL(i);
            } else {
                this.LJLILLLLZI.LJIIL(i);
            }
        } else {
            this.LJLILLLLZI.LJIIL(i);
        }
        return this.LJLIL.LJIIL(i);
    }

    @Override // X.InterfaceC84211X3f
    public final void LJIILIIL(int i) {
        try {
            updateDownloadInfo(this.LJLIL.getDownloadInfo(i));
            if (X4P.LJIJ()) {
                X3L LIZ = X3C.LIZ(true);
                if (LIZ != null) {
                    LIZ.LJIILIIL(i);
                } else {
                    this.LJLILLLLZI.LJIILIIL(i);
                }
            } else {
                this.LJLILLLLZI.LJIILIIL(i);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.InterfaceC84211X3f
    public final boolean LJIILJJIL(int i) {
        try {
            if (X4P.LJIJ()) {
                X3L LIZ = X3C.LIZ(true);
                if (LIZ != null) {
                    LIZ.LJIILJJIL(i);
                } else {
                    this.LJLILLLLZI.LJIILJJIL(i);
                }
            } else {
                this.LJLILLLLZI.LJIILJJIL(i);
            }
        } catch (SQLiteException e) {
            C16880lQ.LLLLIIL(e);
        }
        return this.LJLIL.LJIILJJIL(i);
    }

    @Override // X.InterfaceC84211X3f
    public final void LJIJ(DownloadInfo downloadInfo) {
        this.LJLIL.updateDownloadInfo(downloadInfo);
    }

    @Override // X.InterfaceC84211X3f
    public final DownloadInfo LJJI(int i) {
        DownloadInfo LJJI = this.LJLIL.LJJI(i);
        LIZJ(LJJI, true);
        return LJJI;
    }

    @Override // X.InterfaceC84211X3f
    public final DownloadInfo LJJIJIIJI(int i) {
        DownloadInfo LJJIJIIJI = this.LJLIL.LJJIJIIJI(i);
        LIZJ(LJJIJIIJI, true);
        return LJJIJIIJI;
    }

    @Override // X.InterfaceC84211X3f
    public final DownloadInfo LJJIL(int i) {
        DownloadInfo LJJIL = this.LJLIL.LJJIL(i);
        LIZJ(LJJIL, true);
        return LJJIL;
    }

    @Override // X.InterfaceC84211X3f
    public final DownloadInfo LJJLIIIJJIZ(int i) {
        DownloadInfo LJJLIIIJJIZ = this.LJLIL.LJJLIIIJJIZ(i);
        LIZJ(LJJLIIIJJIZ, true);
        return LJJLIIIJJIZ;
    }

    @Override // X.InterfaceC84211X3f
    public final void LJLJI(int i) {
        this.LJLIL.LJLJI(i);
        this.LJLILLLLZI.LJLJI(i);
    }

    @Override // X.InterfaceC84211X3f
    public final java.util.Map<Long, C84234X4c> LLJI(int i) {
        java.util.Map<Long, C84234X4c> LLJI = this.LJLIL.LLJI(i);
        if (LLJI == null || LLJI.isEmpty()) {
            java.util.Map<Long, C84234X4c> LLJI2 = this.LJLILLLLZI.LLJI(i);
            this.LJLIL.t(i, LLJI2);
            return LLJI2;
        }
        return LLJI;
    }

    @Override // X.InterfaceC84211X3f
    public final List<C84234X4c> LLJJIII(int i) {
        List<C84234X4c> LLJJIII = this.LJLIL.LLJJIII(i);
        if (LLJJIII == null || LLJJIII.size() == 0) {
            return this.LJLILLLLZI.LLJJIII(i);
        }
        return LLJJIII;
    }

    @Override // X.InterfaceC84211X3f
    public final void clearMemoryCacheData(double d) {
        try {
            this.LJLIL.clearMemoryCacheData(d);
        } catch (Throwable unused) {
        }
    }

    @Override // X.InterfaceC84211X3f
    public final DownloadInfo getDownloadInfo(int i) {
        return this.LJLIL.getDownloadInfo(i);
    }

    @Override // X.InterfaceC84211X3f
    public final List<DownloadInfo> getDownloadInfoList(String str) {
        return this.LJLIL.getDownloadInfoList(str);
    }

    @Override // X.InterfaceC84211X3f
    public final List<DownloadInfo> getDownloadInfosByFileExtension(String str) {
        return this.LJLIL.getDownloadInfosByFileExtension(str);
    }

    @Override // X.InterfaceC84211X3f
    public final List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        return this.LJLIL.getSuccessedDownloadInfosWithMimeType(str);
    }

    @Override // X.InterfaceC84211X3f
    public final List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        return this.LJLIL.getUnCompletedDownloadInfosWithMimeType(str);
    }

    @Override // X.InterfaceC84211X3f
    public final boolean updateDownloadInfo(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return false;
        }
        boolean updateDownloadInfo = this.LJLIL.updateDownloadInfo(downloadInfo);
        LIZJ(downloadInfo, true);
        return updateDownloadInfo;
    }

    public final void LIZJ(DownloadInfo downloadInfo, boolean z) {
        if (downloadInfo == null) {
            return;
        }
        if (X4P.LJIJ()) {
            if (z) {
                X3L LIZ = X3C.LIZ(true);
                if (LIZ != null) {
                    LIZ.updateDownloadInfo(downloadInfo);
                    return;
                } else {
                    this.LJLILLLLZI.updateDownloadInfo(downloadInfo);
                    return;
                }
            }
            return;
        }
        this.LJLILLLLZI.updateDownloadInfo(downloadInfo);
    }

    @Override // X.InterfaceC84211X3f
    public final DownloadInfo LJJIJIL(int i, long j) {
        DownloadInfo LJJIJIL = this.LJLIL.LJJIJIL(i, j);
        LJIILIIL(i);
        return LJJIJIL;
    }

    @Override // X.InterfaceC84211X3f
    public final DownloadInfo LJJJJLI(int i, long j) {
        DownloadInfo LJJJJLI = this.LJLIL.LJJJJLI(i, j);
        LJIILIIL(i);
        return LJJJJLI;
    }

    @Override // X.InterfaceC84211X3f
    public final DownloadInfo LJJJLZIJ(int i, long j) {
        DownloadInfo LJJJLZIJ = this.LJLIL.LJJJLZIJ(i, j);
        LJIILIIL(i);
        return LJJJLZIJ;
    }

    @Override // X.InterfaceC84211X3f
    public final DownloadInfo LJJLI(int i, long j) {
        DownloadInfo LJJLI = this.LJLIL.LJJLI(i, j);
        LIZJ(LJJLI, false);
        return LJJLI;
    }

    @Override // X.InterfaceC84211X3f
    public final boolean t(int i, java.util.Map<Long, C84234X4c> map) {
        this.LJLIL.t(i, map);
        this.LJLILLLLZI.t(i, map);
        return false;
    }

    @Override // X.InterfaceC84211X3f
    public final DownloadInfo LJIL(int i, String str, String str2, long j) {
        DownloadInfo LJIL = this.LJLIL.LJIL(i, str, str2, j);
        LIZJ(LJIL, true);
        return LJIL;
    }
}
