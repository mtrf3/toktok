package X;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes16.dex */
public final class X4S {
    public final DownloadInfo LIZJ;
    public final X4H LJ;
    public final X5P LJFF;
    public final C84252X4u LJI;
    public BaseException LJII;
    public final boolean LJIIL;
    public final long LJIILIIL;
    public final long LJIILJJIL;
    public final long LJIILL;
    public final boolean LJIIZILJ;
    public long LJIJ;
    public final List<C84235X4d> LIZ = new LinkedList();
    public final List<C84235X4d> LIZIZ = new ArrayList();
    public volatile boolean LJIIIIZZ = false;
    public volatile boolean LJIIIZ = false;
    public volatile boolean LJIIJ = false;
    public boolean LJIILLIIL = true;
    public volatile long LJIJI = 0;
    public volatile long LJIJJ = 0;
    public final InterfaceC84211X3f LIZLLL = C84212X3g.LJIIJ();
    public final X4M LJIIJJI = C84221X3p.LIZ;

    public final void LIZLLL() {
        long j;
        boolean z;
        boolean z2 = this.LJIIZILJ;
        if (z2) {
            j = System.nanoTime();
        } else {
            j = 0;
        }
        DownloadInfo downloadInfo = this.LIZJ;
        InterfaceC84211X3f interfaceC84211X3f = this.LIZLLL;
        List<C84235X4d> list = this.LIZ;
        List<C84235X4d> list2 = this.LIZIZ;
        java.util.Map<Long, C84234X4c> LLJI = interfaceC84211X3f.LLJI(downloadInfo.getId());
        if (LLJI == null) {
            LLJI = new HashMap<>(4);
        }
        synchronized (this) {
            Iterator<C84235X4d> it = list.iterator();
            while (it.hasNext()) {
                it.next().LIZIZ.LJLIL.flush();
            }
            try {
                if (this.LJIILLIIL) {
                    Iterator<C84235X4d> it2 = list.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZIZ.LJLIL.LIZ();
                    }
                }
                z = true;
            } catch (Throwable unused) {
                z = false;
            }
            LJI(list, LLJI);
            ArrayList arrayList = (ArrayList) list2;
            if (arrayList.size() > 0) {
                LIZJ(arrayList);
                list.removeAll(arrayList);
                arrayList.clear();
            }
        }
        if (z) {
            downloadInfo.updateRealDownloadTime(true);
            interfaceC84211X3f.t(downloadInfo.getId(), LLJI);
            interfaceC84211X3f.updateDownloadInfo(downloadInfo);
            this.LJIJI = downloadInfo.getCurBytes();
        }
        if (z2) {
            this.LJIJ += System.nanoTime() - j;
        }
    }

    public static void LIZJ(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            X4Q.LJJIIJ(((C84235X4d) it.next()).LIZIZ);
        }
    }

    public final void LIZ(C84235X4d c84235X4d) {
        synchronized (this) {
            ((LinkedList) this.LIZ).add(c84235X4d);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:272:0x00fa, code lost:
    
        if (r8 <= 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x00fd, code lost:
    
        ((X.X4O) r4).LJJIIJZLJL(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0217, code lost:
    
        ((X.X4O) r4).LJJIIJZLJL(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0398 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02b8 A[Catch: all -> 0x038b, TryCatch #26 {all -> 0x038b, blocks: (B:23:0x01df, B:25:0x01e3, B:28:0x01e8, B:30:0x01ee, B:32:0x0209, B:33:0x020f, B:36:0x0211, B:37:0x0213, B:40:0x0216, B:137:0x02ae, B:139:0x02b8, B:141:0x02bc, B:144:0x02c2), top: B:12:0x0035, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0354 A[Catch: all -> 0x0375, TryCatch #14 {all -> 0x0375, blocks: (B:187:0x034e, B:189:0x0354, B:190:0x0372, B:191:0x0374), top: B:186:0x034e }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01e3 A[Catch: all -> 0x038b, TryCatch #26 {all -> 0x038b, blocks: (B:23:0x01df, B:25:0x01e3, B:28:0x01e8, B:30:0x01ee, B:32:0x0209, B:33:0x020f, B:36:0x0211, B:37:0x0213, B:40:0x0216, B:137:0x02ae, B:139:0x02b8, B:141:0x02bc, B:144:0x02c2), top: B:12:0x0035, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01ee A[Catch: all -> 0x038b, TRY_LEAVE, TryCatch #26 {all -> 0x038b, blocks: (B:23:0x01df, B:25:0x01e3, B:28:0x01e8, B:30:0x01ee, B:32:0x0209, B:33:0x020f, B:36:0x0211, B:37:0x0213, B:40:0x0216, B:137:0x02ae, B:139:0x02b8, B:141:0x02bc, B:144:0x02c2), top: B:12:0x0035, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x024a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0220 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x038e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.C84252X4u r45) {
        /*
            Method dump skipped, instructions count: 1050
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X4S.LJ(X.X4u):void");
    }

    public final void LJFF(X5L x5l) {
        synchronized (this) {
            ((ArrayList) this.LIZIZ).add((C84235X4d) x5l);
        }
    }

    public static void LJI(List list, java.util.Map map) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C84234X4c c84234X4c = ((C84235X4d) it.next()).LIZ;
            C84234X4c c84234X4c2 = (C84234X4c) map.get(Long.valueOf(c84234X4c.LIZ));
            if (c84234X4c2 == null) {
                map.put(Long.valueOf(c84234X4c.LIZ), new C84234X4c(c84234X4c));
            } else {
                c84234X4c2.LIZLLL(c84234X4c.LIZ());
                c84234X4c2.LJ(c84234X4c.LIZLLL);
            }
        }
    }

    public final void LIZIZ(long j, boolean z) {
        long j2;
        long j3 = j - this.LJIJJ;
        if (this.LJIIL) {
            if (this.LJIIJJI.LIZIZ()) {
                j2 = this.LJIILIIL;
            } else {
                j2 = this.LJIILJJIL;
            }
            if (j3 > j2) {
                LIZLLL();
                this.LJIJJ = j;
                return;
            }
            return;
        }
        long curBytes = this.LIZJ.getCurBytes() - this.LJIJI;
        if (!z && (curBytes <= 65536 || j3 <= 500)) {
            return;
        }
        LIZLLL();
        this.LJIJJ = j;
    }

    public X4S(DownloadInfo downloadInfo, X5P x5p, C84252X4u c84252X4u) {
        boolean z;
        this.LIZJ = downloadInfo;
        this.LJFF = x5p;
        this.LJI = c84252X4u;
        X4H LJFF = X4H.LJFF(downloadInfo.getId(), null);
        this.LJ = LJFF;
        if (LJFF.LJIIIIZZ("sync_strategy", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LJIIL = z;
        if (z) {
            long LJIIIIZZ = LJFF.LJIIIIZZ("sync_interval_ms_fg", 5000);
            long LJIIIIZZ2 = LJFF.LJIIIIZZ("sync_interval_ms_bg", 1000);
            this.LJIILIIL = Math.max(LJIIIIZZ, 500L);
            this.LJIILJJIL = Math.max(LJIIIIZZ2, 500L);
            this.LJIILL = LJFF.LJIIJ("sync_min_length", 10485760L);
        } else {
            this.LJIILIIL = 0L;
            this.LJIILJJIL = 0L;
            this.LJIILL = 0L;
        }
        this.LJIIZILJ = LJFF.LJIIIIZZ("monitor_rw", 0) == 1;
    }
}
