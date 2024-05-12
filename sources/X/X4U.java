package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadHttpException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.segment.SegmentApplyException;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes16.dex */
public final class X4U implements X5M {
    public final DownloadInfo LIZ;
    public final X51 LIZIZ;
    public final C84252X4u LIZJ;
    public final X5P LIZLLL;
    public final X4S LJ;
    public volatile boolean LJFF;
    public volatile boolean LJI;
    public C84244X4m LJIIIZ;
    public C84244X4m LJIIJ;
    public long LJIIL;
    public int LJIILL;
    public BaseException LJIILLIIL;
    public final X5D LJIJ;
    public final PS2 LJIJI;
    public long LJIJJLI;
    public long LJIL;
    public long LJJ;
    public float LJJI;
    public int LJJIFFI;
    public final boolean LJJII;
    public final List<X4T> LJII = new ArrayList();
    public final List<C84233X4b> LJIIIIZZ = new ArrayList();
    public volatile boolean LJIIJJI = true;
    public final LinkedList<C84234X4c> LJIILIIL = new LinkedList<>();
    public final List<C84234X4c> LJIILJJIL = new ArrayList();
    public final Object LJIIZILJ = new Object();
    public volatile boolean LJIJJ = false;
    public final C84249X4r LJJIII = new C84249X4r(this);
    public final C84251X4t LJJIIJ = new C84251X4t(this);

    public final C84233X4b LJJI() {
        C84233X4b c84233X4b;
        synchronized (this) {
            int size = this.LJIILL % ((ArrayList) this.LJIIIIZZ).size();
            if (this.LIZIZ.LIZ.optInt("url_balance", 2) > 0) {
                this.LJIILL++;
            }
            c84233X4b = (C84233X4b) ((ArrayList) this.LJIIIIZZ).get(size);
        }
        return c84233X4b;
    }

    public final void LJIIIIZZ() {
        int size;
        if (this.LJIIL <= 0 || (size = ((ArrayList) this.LJIILJJIL).size()) <= 1) {
            return;
        }
        ArrayList arrayList = null;
        int i = 0;
        for (int i2 = 1; i2 < size; i2++) {
            C84234X4c c84234X4c = (C84234X4c) ListProtector.get(this.LJIILJJIL, i);
            C84234X4c c84234X4c2 = (C84234X4c) ListProtector.get(this.LJIILJJIL, i2);
            if (c84234X4c.LIZIZ() > c84234X4c2.LIZ && c84234X4c2.LIZJ() <= 0 && c84234X4c2.LJFF == null) {
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                }
                arrayList.add(c84234X4c2);
                if (this.LJJII && C65210PiY.LIZ()) {
                    int id = this.LIZ.getId();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("covered = ");
                    LIZ.append(c84234X4c2);
                    LIZ.append(", prev = ");
                    LIZ.append(c84234X4c);
                    C65210PiY.LIZLLL(id, "SegmentDispatcher", "clearCoveredSegmentLocked", X1D.LIZIZ(LIZ));
                }
            } else if (c84234X4c2.LIZIZ() > c84234X4c.LIZIZ()) {
                i++;
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                ((ArrayList) this.LJIILJJIL).remove(next);
                Iterator it2 = ((ArrayList) this.LJII).iterator();
                while (it2.hasNext()) {
                    X4T x4t = (X4T) it2.next();
                    if (x4t.LJLJLJ == next) {
                        if (this.LJJII && C65210PiY.LIZ()) {
                            int id2 = this.LIZ.getId();
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("reconnect, segment = ");
                            LIZ2.append(next);
                            LIZ2.append(", threadIndex = ");
                            C0FS.LIZJ(LIZ2, x4t.LJZL, LIZ2, id2, "SegmentDispatcher", "clearCoveredSegmentLocked");
                        }
                        x4t.LJIIJ(true);
                    }
                }
            }
        }
    }

    public final void LJIIJ() {
        int i;
        if (this.LJIIL <= 0 || this.LJIIJJI) {
            i = 1;
        } else {
            i = this.LIZIZ.LIZIZ;
            long j = this.LJIIL;
            long optInt = r0.LIZ.optInt("segment_min_init_mb", 10) * 1048576;
            if (optInt < 5242880) {
                optInt = 5242880;
            }
            int i2 = (int) (j / optInt);
            if (i > i2) {
                i = i2;
            }
        }
        if (C65210PiY.LIZ()) {
            int id = this.LIZ.getId();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TotalLength = ");
            C06510Nj.LIZIZ(LIZ, this.LJIIL, ", threadCount = ", i);
            C65210PiY.LIZLLL(id, "SegmentDispatcher", "dispatchReadThread", X1D.LIZIZ(LIZ));
        }
        if (i <= 0) {
            i = 1;
        }
        synchronized (this) {
            do {
                if (((ArrayList) this.LJII).size() >= i) {
                    break;
                }
                if (!this.LJI && !this.LJFF) {
                    LJIIJJI(LJJI());
                } else {
                    return;
                }
            } while (this.LIZIZ.LIZ.optInt("segment_mode", 1) != 0);
        }
    }

    public final void LJIIZILJ() {
        List<String> backUpUrls;
        int optInt = this.LIZIZ.LIZ.optInt("ip_strategy", 0);
        if (optInt <= 0) {
            this.LJIIJJI = false;
            LJIIJ();
            return;
        }
        C84240X4i c84240X4i = X5G.LIZ;
        c84240X4i.LIZIZ.post(new RunnableC84239X4h(c84240X4i, this.LIZ.getUrl(), this));
        if (optInt > 2 && (backUpUrls = this.LIZ.getBackUpUrls()) != null) {
            for (String str : backUpUrls) {
                if (!TextUtils.isEmpty(str)) {
                    c84240X4i.LIZIZ.post(new RunnableC84239X4h(c84240X4i, str, this));
                }
            }
        }
    }

    public final void LJIJI() {
        ((ArrayList) this.LJIIIIZZ).add(new C84233X4b(this.LIZ.getUrl(), true));
        List<String> backUpUrls = this.LIZ.getBackUpUrls();
        if (backUpUrls != null) {
            for (String str : backUpUrls) {
                if (!TextUtils.isEmpty(str)) {
                    ((ArrayList) this.LJIIIIZZ).add(new C84233X4b(str, false));
                }
            }
        }
        this.LIZIZ.LIZ(((ArrayList) this.LJIIIIZZ).size());
    }

    public final void LJIJJ() {
        X51 x51 = this.LIZIZ;
        long optInt = x51.LIZ.optInt("connect_timeout", -1);
        long j = -1;
        if (optInt < 2000) {
            optInt = -1;
        }
        this.LJIJJLI = optInt;
        long optInt2 = x51.LIZ.optInt("read_timeout", -1);
        if (optInt2 >= 4000) {
            j = optInt2;
        }
        this.LJIL = j;
        this.LJJI = Math.min(Math.max(0.0f, (float) x51.LIZ.optDouble("poor_speed_ratio", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)), 1.0f);
        int i = this.LJJIFFI;
        if (i > 0) {
            this.LJIJI.LIZ(this.LJJIII, i);
        }
    }

    public final boolean LJIJJLI() {
        long j = this.LJIIL;
        long j2 = 0;
        if (j <= 0) {
            return false;
        }
        synchronized (this) {
            ArrayList arrayList = (ArrayList) this.LJIILJJIL;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C84234X4c c84234X4c = (C84234X4c) ListProtector.get(arrayList, i);
                if (c84234X4c.LIZ > j2) {
                    break;
                }
                if (c84234X4c.LIZIZ() > j2) {
                    j2 = c84234X4c.LIZIZ();
                }
            }
            if (C65210PiY.LIZ()) {
                int id = this.LIZ.getId();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("FirstOffset: ");
                LIZ.append(j2);
                C65210PiY.LIZLLL(id, "SegmentDispatcher", "isAllContentDownloaded", X1D.LIZIZ(LIZ));
            }
            if (j2 < j) {
                return false;
            }
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd A[Catch: all -> 0x00db, TryCatch #4 {all -> 0x00db, blocks: (B:36:0x0074, B:38:0x007d, B:41:0x0087, B:42:0x0099, B:44:0x009f, B:46:0x00b0, B:47:0x00b4, B:49:0x00cd, B:50:0x00d4, B:52:0x00d8), top: B:35:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d8 A[Catch: all -> 0x00db, TRY_LEAVE, TryCatch #4 {all -> 0x00db, blocks: (B:36:0x0074, B:38:0x007d, B:41:0x0087, B:42:0x0099, B:44:0x009f, B:46:0x00b0, B:47:0x00b4, B:49:0x00cd, B:50:0x00d4, B:52:0x00d8), top: B:35:0x0074 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJIL() {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X4U.LJJIJIIJIL():void");
    }

    public final void LJFF() {
        if (C65210PiY.LIZ()) {
            C65210PiY.LIZLLL(this.LIZ.getId(), "SegmentDispatcher", "cancel", "Run");
        }
        this.LJFF = true;
        synchronized (this) {
            Iterator it = ((ArrayList) this.LJII).iterator();
            while (it.hasNext()) {
                ((X4T) it.next()).LIZ();
            }
        }
        X4S x4s = this.LJ;
        x4s.LJIIJ = true;
        x4s.LJIIIIZZ = true;
        this.LIZJ.LIZIZ();
    }

    public final void LJJIFFI() {
        if (C65210PiY.LIZ()) {
            C65210PiY.LIZLLL(this.LIZ.getId(), "SegmentDispatcher", "onComplete", "Run");
        }
        this.LIZJ.LIZIZ();
        synchronized (this.LJIIZILJ) {
            this.LJIIZILJ.notify();
        }
    }

    public final void LJJIIZ() {
        if (C65210PiY.LIZ()) {
            C65210PiY.LIZLLL(this.LIZ.getId(), "SegmentDispatcher", "pause", "Run");
        }
        this.LJI = true;
        synchronized (this) {
            Iterator it = ((ArrayList) this.LJII).iterator();
            while (it.hasNext()) {
                ((X4T) it.next()).LIZ();
            }
        }
        X4S x4s = this.LJ;
        x4s.LJIIIZ = true;
        x4s.LJIIIIZZ = true;
        this.LIZJ.LIZIZ();
    }

    public final void LJI(List<C84234X4c> list) {
        long j;
        long j2;
        long j3 = 0;
        loop0: while (true) {
            j = -1;
            j2 = -1;
            for (C84234X4c c84234X4c : list) {
                if (j == -1) {
                    if (c84234X4c.LIZJ() > 0) {
                        j = c84234X4c.LIZ;
                        j2 = c84234X4c.LIZ();
                    }
                } else if (c84234X4c.LIZ <= j2) {
                    if (c84234X4c.LIZ() > j2) {
                        j2 = c84234X4c.LIZ();
                    }
                } else {
                    j3 += j2 - j;
                    if (c84234X4c.LIZJ() > 0) {
                        j = c84234X4c.LIZ;
                        j2 = c84234X4c.LIZ();
                    }
                }
            }
        }
        if (j >= 0 && j2 > j) {
            j3 += j2 - j;
        }
        if (C65210PiY.LIZ()) {
            int id = this.LIZ.getId();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("GetCurBytes = ");
            LIZ.append(this.LIZ.getCurBytes());
            LIZ.append(", totalBytes = ");
            LIZ.append(this.LIZ.getTotalBytes());
            LIZ.append(", downloadedBytes = ");
            LIZ.append(j3);
            C65210PiY.LIZLLL(id, "SegmentDispatcher", "checkDownloadedBytesLocked", X1D.LIZIZ(LIZ));
        }
        if (j3 > this.LIZ.getTotalBytes() && this.LIZ.getTotalBytes() > 0) {
            j3 = this.LIZ.getTotalBytes();
        }
        if (this.LIZ.getCurBytes() != this.LIZ.getTotalBytes() && this.LIZ.getCurBytes() != j3) {
            this.LIZ.setCurBytes(j3);
        }
    }

    public final X5B LJIIIZ(C84234X4c c84234X4c) {
        X5B x5b;
        synchronized (this) {
            C84235X4d c84235X4d = new C84235X4d(this.LIZ, this.LIZJ, c84234X4c);
            this.LJ.LIZ(c84235X4d);
            x5b = c84235X4d.LIZJ;
        }
        return x5b;
    }

    public final void LJIIJJI(C84233X4b c84233X4b) {
        X4T x4t = new X4T(this.LIZ, this, this.LIZJ, c84233X4b, ((ArrayList) this.LJII).size());
        ((ArrayList) this.LJII).add(x4t);
        if (C84212X3g.LJIILLIIL == null) {
            synchronized (C84212X3g.class) {
                if (C84212X3g.LJIILLIIL == null) {
                    int i = C84212X3g.LJJIJIIJIL;
                    PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(i, i, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC38899FOl("DownloadThreadPool-chunk-fixed"));
                    try {
                        pThreadPoolExecutor.allowCoreThreadTimeOut(true);
                    } catch (Throwable unused) {
                    }
                    C84212X3g.LJIILLIIL = pThreadPoolExecutor;
                }
            }
        }
        x4t.LJLLLL = C84212X3g.LJIILLIIL.submit(x4t);
    }

    public final C84233X4b LJIILIIL(X4T x4t) {
        C84233X4b c84233X4b;
        boolean z;
        Iterator it = ((ArrayList) this.LJIIIIZZ).iterator();
        C84233X4b c84233X4b2 = null;
        while (true) {
            if (it.hasNext()) {
                c84233X4b = (C84233X4b) it.next();
                if (c84233X4b != x4t.LJLJLLL) {
                    synchronized (c84233X4b) {
                        z = c84233X4b.LJI;
                    }
                    if (z) {
                        continue;
                    } else {
                        if (c84233X4b2 == null) {
                            c84233X4b2 = c84233X4b;
                        }
                        if (c84233X4b.LIZ() <= 0) {
                            break;
                        }
                    }
                }
            } else {
                c84233X4b = null;
                break;
            }
        }
        if (this.LIZIZ.LIZ.optInt("url_balance", 2) > 0) {
            if (c84233X4b != null) {
                return c84233X4b;
            }
            if (this.LIZIZ.LIZ.optInt("url_balance", 2) == 1) {
                return null;
            }
        }
        return c84233X4b2;
    }

    public final void LJIILL(List<C84234X4c> list) {
        C84234X4c c84234X4c = (C84234X4c) ListProtector.get(list, 0);
        long startOffset = this.LIZ.getStartOffset();
        if (startOffset < 0) {
            startOffset = 0;
        }
        long j = c84234X4c.LIZ;
        if (j > startOffset) {
            C84234X4c c84234X4c2 = new C84234X4c(startOffset, j - 1);
            if (C65210PiY.LIZ()) {
                int id = this.LIZ.getId();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("First = ");
                LIZ.append(c84234X4c);
                LIZ.append(", add new first = ");
                LIZ.append(c84234X4c2);
                C65210PiY.LIZLLL(id, "SegmentDispatcher", "fixSegmentsLocked", X1D.LIZIZ(LIZ));
            }
            LIZLLL(list, c84234X4c2, true);
        }
        Iterator<C84234X4c> it = list.iterator();
        if (it.hasNext()) {
            C84234X4c next = it.next();
            while (it.hasNext()) {
                C84234X4c next2 = it.next();
                if (next.LIZLLL < next2.LIZ - 1) {
                    if (C65210PiY.LIZ()) {
                        int id2 = this.LIZ.getId();
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Segment = ");
                        LIZ2.append(next);
                        LIZ2.append(", new end = ");
                        LIZ2.append(next2.LIZ - 1);
                        C65210PiY.LIZLLL(id2, "SegmentDispatcher", "fixSegmentsLocked", X1D.LIZIZ(LIZ2));
                    }
                    next.LJ(next2.LIZ - 1);
                }
                next = next2;
            }
        }
        C84234X4c c84234X4c3 = (C84234X4c) ListProtector.get(list, ((LinkedList) list).size() - 1);
        long endOffset = this.LIZ.getEndOffset();
        if (endOffset > 0 && endOffset > startOffset) {
            c84234X4c3.LJ(endOffset);
            return;
        }
        long totalBytes = this.LIZ.getTotalBytes();
        if (totalBytes > 0) {
            long j2 = c84234X4c3.LIZLLL;
            if (j2 == -1 || j2 >= totalBytes - 1) {
                return;
            }
        }
        if (C65210PiY.LIZ()) {
            int id3 = this.LIZ.getId();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("Last segment = ");
            LIZ3.append(c84234X4c3);
            LIZ3.append(", new end=-1");
            C65210PiY.LIZLLL(id3, "SegmentDispatcher", "fixSegmentsLocked", X1D.LIZIZ(LIZ3));
        }
        c84234X4c3.LJ(-1L);
    }

    public final long LJIILLIIL(C84234X4c c84234X4c) {
        long j;
        long j2 = c84234X4c.LIZLLL;
        if (j2 >= c84234X4c.LIZ) {
            j = (j2 - c84234X4c.LIZIZ()) + 1;
            if (j != -1) {
                return j;
            }
        } else {
            j = -1;
        }
        long j3 = this.LJIIL;
        if (j3 > 0) {
            return j3 - c84234X4c.LIZIZ();
        }
        return j;
    }

    public final void LJIJ(List<C84234X4c> list) {
        long totalBytes = this.LIZ.getTotalBytes();
        this.LJIIL = totalBytes;
        if (totalBytes <= 0) {
            this.LJIIL = this.LIZ.getExpectFileLength();
            if (C65210PiY.LIZ()) {
                int id = this.LIZ.getId();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("GetExpectFileLength: ");
                LIZ.append(this.LJIIL);
                C65210PiY.LIZLLL(id, "SegmentDispatcher", "initSegments", X1D.LIZIZ(LIZ));
            }
        }
        synchronized (this) {
            this.LJIILIIL.clear();
            if (list == null || list.isEmpty()) {
                long startOffset = this.LIZ.getStartOffset();
                long endOffset = this.LIZ.getEndOffset();
                if (startOffset < 0) {
                    startOffset = 0;
                }
                if (endOffset > 0 && endOffset < startOffset) {
                    int id2 = this.LIZ.getId();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("DownloadInfo.getEndOffset invalid, start = ");
                    LIZ2.append(startOffset);
                    LIZ2.append(", end = ");
                    LIZ2.append(endOffset);
                    C65210PiY.LJ(id2, "SegmentDispatcher", "initSegments", X1D.LIZIZ(LIZ2));
                    endOffset = -1;
                }
                LIZLLL(this.LJIILIIL, new C84234X4c(startOffset, endOffset), false);
            } else {
                Iterator<C84234X4c> it = list.iterator();
                while (it.hasNext()) {
                    LIZLLL(this.LJIILIIL, new C84234X4c(it.next()), false);
                }
                LJIILL(this.LJIILIIL);
                LJI(this.LJIILIIL);
            }
            if (C65210PiY.LIZ()) {
                C65210PiY.LIZLLL(this.LIZ.getId(), "SegmentDispatcher", "initSegments", "TotalLength: " + this.LJIIL);
            }
        }
    }

    public final void LJIL(long j) {
        this.LJIJ.LIZIZ(this.LIZ.getCurBytes(), j);
        Iterator it = ((ArrayList) this.LJII).iterator();
        while (it.hasNext()) {
            X4T x4t = (X4T) it.next();
            long j2 = x4t.LJLLJ;
            X5D x5d = x4t.LLIIIILZ;
            if (j2 >= 0 && x5d != null) {
                if (C65210PiY.LIZ()) {
                    int id = x4t.LJLJI.getId();
                    StringBuilder LIZJ = V10.LIZJ("CurSegmentReadOffset = ", j2, ", threadIndex = ");
                    C0FS.LIZJ(LIZJ, x4t.LJZL, LIZJ, id, "SegmentReader", "markProgress");
                }
                x5d.LIZIZ(j2, j);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0123, code lost:
    
        if (r11 == (-1.0f)) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C84234X4c LJJ(X.X4T r30) {
        /*
            Method dump skipped, instructions count: 1081
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X4U.LJJ(X.X4T):X.X4c");
    }

    public final void LJJIII(BaseException baseException) {
        int id = this.LIZ.getId();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Exception: ");
        LIZ.append(baseException);
        C65210PiY.LJ(id, "SegmentDispatcher", "onError", X1D.LIZIZ(LIZ));
        this.LJIILLIIL = baseException;
        this.LIZJ.LIZIZ();
        synchronized (this) {
            Iterator it = ((ArrayList) this.LJII).iterator();
            while (it.hasNext()) {
                ((X4T) it.next()).LIZ();
            }
        }
    }

    public final void LJJIIJ(X4T x4t) {
        if (C65210PiY.LIZ()) {
            int id = this.LIZ.getId();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ThreadIndex = ");
            C0FS.LIZJ(LIZ, x4t.LJZL, LIZ, id, "SegmentDispatcher", "onReaderExit");
        }
        synchronized (this) {
            x4t.getClass();
            ((ArrayList) this.LJII).remove(x4t);
            LJIIIIZZ();
            if (((ArrayList) this.LJII).isEmpty()) {
                LJJIFFI();
            } else if (LJIJJLI()) {
                if (C65210PiY.LIZ()) {
                    C65210PiY.LIZLLL(this.LIZ.getId(), "SegmentDispatcher", "onReaderExit", "allContentDownloaded");
                }
                Iterator it = ((ArrayList) this.LJII).iterator();
                while (it.hasNext()) {
                    ((X4T) it.next()).LIZ();
                }
                LJJIFFI();
            }
        }
    }

    public final void LJJIIZI(X4T x4t) {
        synchronized (this) {
            C84233X4b LJIILIIL = LJIILIIL(x4t);
            if (LJIILIIL == null) {
                return;
            }
            int i = x4t.LLI;
            if (i < 30) {
                x4t.LLI = i + 1;
                C84233X4b c84233X4b = x4t.LJLJLLL;
                if (c84233X4b != null) {
                    c84233X4b.LIZLLL(x4t);
                }
                LJIILIIL.LJ(x4t);
                x4t.LJLJLLL = LJIILIIL;
                x4t.LJIIL();
            }
        }
    }

    public final void LJJIJIIJI(C84234X4c c84234X4c) {
        synchronized (this) {
            c84234X4c.LJI--;
        }
    }

    public final void LIZ(String str, List<C84233X4b> list) {
        if (this.LJJII) {
            for (C84233X4b c84233X4b : list) {
                if (C65210PiY.LIZ()) {
                    int id = this.LIZ.getId();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("UrlRecord: ");
                    LIZ.append(c84233X4b);
                    C65210PiY.LIZLLL(id, "SegmentDispatcher", "addIpListLocked", X1D.LIZIZ(LIZ));
                }
            }
        }
        int i = 0;
        int optInt = this.LIZIZ.LIZ.optInt("ip_strategy", 0);
        if (optInt == 1 || optInt == 3) {
            int size = ((ArrayList) this.LJIIIIZZ).size();
            while (true) {
                if (i >= size) {
                    break;
                }
                if (TextUtils.equals(((C84233X4b) ListProtector.get(this.LJIIIIZZ, i)).LIZ, str)) {
                    if (i >= 0 && i < ((ArrayList) this.LJIIIIZZ).size()) {
                        ((ArrayList) this.LJIIIIZZ).addAll(i + 1, list);
                        return;
                    }
                } else {
                    i++;
                }
            }
        }
        ((ArrayList) this.LJIIIIZZ).addAll(list);
    }

    public final void LIZIZ(X4T x4t, C84234X4c c84234X4c) {
        synchronized (this) {
            LIZJ(x4t, c84234X4c);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01d6, code lost:
    
        if (r0 <= 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01da, code lost:
    
        if (r4 > r0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01e2, code lost:
    
        if (r22.LIZIZ() > r0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02c8, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append("applySegment: ");
        r1.append(r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02de, code lost:
    
        throw new com.ss.android.socialbase.downloader.segment.SegmentApplyException(6, X.X1D.LIZIZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01e4, code lost:
    
        r22.LJFF = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01ea, code lost:
    
        if (X.C65210PiY.LIZ() == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01ec, code lost:
    
        r2 = r20.LIZ.getId();
        r1 = X.X1D.LIZ();
        r1.append("ApplySegment: OK ");
        r1.append(r22);
        X.C65210PiY.LIZLLL(r2, "SegmentDispatcher", "applySegmentLocked", X.X1D.LIZIZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0205, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0192, code lost:
    
        r0 = r0 - 1;
        r22.LJ(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x019c, code lost:
    
        if (X.C65210PiY.LIZ() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x019e, code lost:
    
        r10 = r20.LIZ.getId();
        r3 = X.X1D.LIZ();
        r3.append("segment set end:");
        r3.append(r0);
        r3.append(", later = ");
        r3.append(r11);
        X.C65210PiY.LIZLLL(r10, "SegmentDispatcher", "applySegmentLocked", X.X1D.LIZIZ(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0164, code lost:
    
        r3 = 1 + r10;
        r10 = ((java.util.ArrayList) r20.LJIILJJIL).size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x016e, code lost:
    
        if (r3 >= r10) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0170, code lost:
    
        r11 = (X.C84234X4c) com.bytedance.mt.protector.impl.collections.ListProtector.get(r20.LJIILJJIL, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0180, code lost:
    
        if (r11.LIZJ() > 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0184, code lost:
    
        if (r11.LJFF == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0206, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0186, code lost:
    
        r2 = r22.LIZLLL;
        r0 = r11.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x018c, code lost:
    
        if (r2 <= 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0190, code lost:
    
        if (r2 < r0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01c3, code lost:
    
        if (X.C65210PiY.LIZ() == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01c5, code lost:
    
        X.C65210PiY.LIZLLL(r20.LIZ.getId(), "SegmentDispatcher", "applySegmentLocked", "Break 2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d0, code lost:
    
        r0 = r22.LIZLLL;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.X4T r21, X.C84234X4c r22) {
        /*
            Method dump skipped, instructions count: 906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X4U.LIZJ(X.X4T, X.X4c):void");
    }

    public final List<C84233X4b> LJ(String str, List<InetAddress> list) {
        boolean z;
        if (list != null && !list.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i = 0;
            for (InetAddress inetAddress : list) {
                if (inetAddress != null) {
                    String hostAddress = inetAddress.getHostAddress();
                    if (!TextUtils.isEmpty(hostAddress)) {
                        if (this.LJJII && C65210PiY.LIZ()) {
                            int id = this.LIZ.getId();
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Ip: ");
                            LIZ.append(hostAddress);
                            C65210PiY.LIZLLL(id, "SegmentDispatcher", "assembleIpAddress", X1D.LIZIZ(LIZ));
                        }
                        C84233X4b c84233X4b = new C84233X4b(str, hostAddress);
                        LinkedList linkedList = (LinkedList) linkedHashMap.get(c84233X4b.LIZJ);
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            linkedHashMap.put(c84233X4b.LIZJ, linkedList);
                        }
                        linkedList.add(c84233X4b);
                        i++;
                    }
                }
            }
            if (i > 0) {
                ArrayList arrayList = new ArrayList();
                do {
                    Iterator it = linkedHashMap.entrySet().iterator();
                    z = false;
                    while (it.hasNext()) {
                        LinkedList linkedList2 = (LinkedList) ((Map.Entry) it.next()).getValue();
                        if (linkedList2 != null && !linkedList2.isEmpty()) {
                            arrayList.add(linkedList2.pollFirst());
                            i--;
                            z = true;
                        }
                    }
                    if (i <= 0) {
                        break;
                    }
                } while (z);
                return arrayList;
            }
        }
        return null;
    }

    public final boolean LJIILJJIL(long j, long j2) {
        long LIZ;
        long j3 = j - j2;
        long LIZ2 = this.LJIJ.LIZ(j3, j);
        int size = ((ArrayList) this.LJII).size();
        if (size > 0) {
            LIZ2 /= size;
        }
        long max = Math.max(10.0f, ((float) LIZ2) * this.LJJI);
        int i = size / 2;
        Iterator it = ((ArrayList) this.LJII).iterator();
        long j4 = Long.MAX_VALUE;
        X4T x4t = null;
        int i2 = 0;
        while (it.hasNext()) {
            X4T x4t2 = (X4T) it.next();
            if (x4t2.LLIIIZ > 0) {
                i2++;
                if (x4t2.LLIIIZ < j3) {
                    X5D x5d = x4t2.LLIIIILZ;
                    if (x5d == null) {
                        LIZ = -1;
                    } else {
                        LIZ = x5d.LIZ(j3, j);
                    }
                    if (this.LJJII && C65210PiY.LIZ()) {
                        int id = this.LIZ.getId();
                        StringBuilder LIZJ = V10.LIZJ("Speed = ", LIZ, ", threadIndex = ");
                        C0FS.LIZJ(LIZJ, x4t2.LJZL, LIZJ, id, "SegmentDispatcher", "findPoorReadThread");
                    }
                    if (LIZ >= 0 && LIZ < j4) {
                        j4 = LIZ;
                        x4t = x4t2;
                    }
                }
            }
        }
        if (x4t != null && i2 >= i && j4 < max) {
            if (C65210PiY.LIZ()) {
                int id2 = this.LIZ.getId();
                StringBuilder LIZJ2 = V10.LIZJ("MinSpeed = ", j4, ", threadIndex = ");
                C0FS.LIZJ(LIZJ2, x4t.LJZL, LIZJ2, id2, "SegmentDispatcher", "findPoorReadThread");
            }
        } else {
            x4t = null;
        }
        if (x4t != null) {
            LJJIIZI(x4t);
            if (C65210PiY.LIZ()) {
                int id3 = this.LIZ.getId();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("HandlePoorReadThread: reconnect for poor speed, threadIndex = ");
                C0FS.LIZJ(LIZ3, x4t.LJZL, LIZ3, id3, "SegmentDispatcher", "findPoorReadThreadAndReconnect");
            }
            x4t.LJIIJ(false);
            return true;
        }
        X4T LJIIL = LJIIL(j, j2, true);
        if (LJIIL != null) {
            LJJIIZI(LJIIL);
            if (C65210PiY.LIZ()) {
                int id4 = this.LIZ.getId();
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("handlePoorReadThread: reconnect for connect timeout, threadIndex = ");
                C0FS.LIZJ(LIZ4, LJIIL.LJZL, LIZ4, id4, "SegmentDispatcher", "findPoorReadThreadAndReconnect");
            }
            LJIIL.LJIIJ(false);
            return true;
        }
        return false;
    }

    public final void LJJII(String str, List<InetAddress> list) {
        List<C84233X4b> list2;
        if (this.LJI || this.LJFF) {
            return;
        }
        try {
            list2 = LJ(str, list);
        } catch (Throwable unused) {
            list2 = null;
        }
        synchronized (this) {
            if (list2 != null) {
                LIZ(str, list2);
            }
            this.LJIIJJI = false;
            this.LIZIZ.LIZ(((ArrayList) this.LJIIIIZZ).size());
            if (C65210PiY.LIZ()) {
                C65210PiY.LIZLLL(this.LIZ.getId(), "SegmentDispatcher", "onDnsResolved", "DispatchReadThread");
            }
            LJIIJ();
        }
    }

    public final void LJJIJ(X4T x4t, C84234X4c c84234X4c) {
        synchronized (this) {
            if (c84234X4c.LJFF == x4t) {
                if (C65210PiY.LIZ()) {
                    int id = this.LIZ.getId();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Segment: ");
                    LIZ.append(c84234X4c);
                    C65210PiY.LIZLLL(id, "SegmentDispatcher", "unApplySegment", X1D.LIZIZ(LIZ));
                }
                long j = x4t.LJLLJ;
                if (j >= c84234X4c.LIZIZ.get()) {
                    c84234X4c.LIZJ = j;
                }
                c84234X4c.LJFF = null;
                x4t.LJIILIIL();
            }
        }
    }

    public X4U(DownloadInfo downloadInfo, X51 x51, X5P x5p) {
        this.LIZ = downloadInfo;
        this.LIZIZ = x51;
        C84252X4u c84252X4u = new C84252X4u(x51.LIZ.optInt("buffer_count", 512), x51.LIZ.optInt("buffer_size", FileUtils.BUFFER_SIZE));
        this.LIZJ = c84252X4u;
        this.LIZLLL = x5p;
        this.LJ = new X4S(downloadInfo, x5p, c84252X4u);
        this.LJIJI = new PS2();
        this.LJIJ = new X5D();
        this.LJJII = X4H.LJFF(downloadInfo.getId(), null).LJIIIIZZ("debug", 0) == 1;
    }

    public static void LIZLLL(List list, C84234X4c c84234X4c, boolean z) {
        long j = c84234X4c.LIZ;
        int size = list.size();
        int i = 0;
        while (i < size && j >= ((C84234X4c) ListProtector.get(list, i)).LIZ) {
            i++;
        }
        ListProtector.add(list, i, c84234X4c);
        if (z) {
            c84234X4c.LJ = size;
        }
    }

    public final X4T LJIIL(long j, long j2, boolean z) {
        Iterator it = ((ArrayList) this.LJII).iterator();
        X4T x4t = null;
        while (it.hasNext()) {
            X4T x4t2 = (X4T) it.next();
            if (x4t2.LJZL != 0 || z) {
                if (x4t2.LLIIIJ > 0 && x4t2.LLIIIL <= 0 && j - x4t2.LLIIIJ > j2 && (x4t == null || x4t2.LLIIIJ < x4t.LLIIIJ)) {
                    x4t = x4t2;
                }
            }
        }
        return x4t;
    }

    public final void LJJIIJZLJL(X4T x4t, C84234X4c c84234X4c, BaseException baseException) {
        synchronized (this) {
            int id = this.LIZ.getId();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Segment: ");
            LIZ.append(c84234X4c);
            LIZ.append(" e:");
            LIZ.append(baseException);
            C65210PiY.LJ(id, "SegmentDispatcher", "onSegmentFailed", X1D.LIZIZ(LIZ));
            x4t.LLIIII = true;
            if (x4t.LJZL == 0) {
                this.LJIILLIIL = baseException;
            }
            Iterator it = ((ArrayList) this.LJII).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((X4T) it.next()).LLIIII) {
                        break;
                    }
                } else {
                    if (this.LJIILLIIL == null) {
                        this.LJIILLIIL = baseException;
                    }
                    this.LJIJJ = true;
                    LJJIII(this.LJIILLIIL);
                }
            }
        }
    }

    public final void LJII(X4T x4t, C84234X4c c84234X4c, C84233X4b c84233X4b, C84244X4m c84244X4m) {
        X4T x4t2 = c84234X4c.LJFF;
        if (x4t2 == null || x4t2 == x4t) {
            if (x4t.LJLL == c84234X4c.LIZIZ()) {
                if (!c84244X4m.LIZ()) {
                    if (c84234X4c.LIZIZ() <= 0) {
                        int id = this.LIZ.getId();
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Segment.getCurrentOffsetRead = ");
                        LIZ.append(c84234X4c.LIZIZ());
                        C65210PiY.LJ(id, "SegmentDispatcher", "checkSegmentHttpResponseLocked", X1D.LIZIZ(LIZ));
                        int i = c84244X4m.LIZJ;
                        if (i != 200 && i != 201 && i != 0) {
                            int i2 = c84244X4m.LIZJ;
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("2: response code error : ");
                            LIZ2.append(c84244X4m.LIZJ);
                            LIZ2.append(" segment=");
                            LIZ2.append(c84234X4c);
                            throw new DownloadHttpException(1004, i2, X1D.LIZIZ(LIZ2));
                        }
                    } else {
                        int i3 = c84244X4m.LIZJ;
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("1: response code error : ");
                        LIZ3.append(c84244X4m.LIZJ);
                        LIZ3.append(" segment=");
                        LIZ3.append(c84234X4c);
                        throw new DownloadHttpException(1004, i3, X1D.LIZIZ(LIZ3));
                    }
                }
                X5P x5p = this.LIZLLL;
                if (x5p != null) {
                    ((X4O) x5p).LJFF(this.LIZ.getMaxBytes(), c84244X4m.LIZLLL());
                }
                if (c84233X4b.LIZLLL) {
                    if (this.LJIIIZ == null) {
                        this.LJIIIZ = c84244X4m;
                        synchronized (this.LJIIZILJ) {
                            this.LJIIZILJ.notify();
                        }
                        X5P x5p2 = this.LIZLLL;
                        if (x5p2 != null) {
                            ((X4O) x5p2).LJIL(c84233X4b.LIZ, c84244X4m.LIZIZ, c84234X4c.LIZIZ());
                        }
                        long LIZLLL = c84244X4m.LIZLLL();
                        if (LIZLLL > 0) {
                            Iterator it = ((ArrayList) this.LJIILJJIL).iterator();
                            while (it.hasNext()) {
                                C84234X4c c84234X4c2 = (C84234X4c) it.next();
                                long j = c84234X4c2.LIZLLL;
                                if (j <= 0 || j > LIZLLL - 1) {
                                    c84234X4c2.LJ(LIZLLL - 1);
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                C84244X4m c84244X4m2 = this.LJIIIZ;
                if (c84244X4m2 != null || (c84244X4m2 = this.LJIIJ) != null) {
                    long LIZLLL2 = c84244X4m.LIZLLL();
                    long LIZLLL3 = c84244X4m2.LIZLLL();
                    if (LIZLLL2 != LIZLLL3) {
                        StringBuilder LIZJ = V10.LIZJ("Total len not equals,len=", LIZLLL2, ",sLen=");
                        LIZJ.append(LIZLLL3);
                        LIZJ.append(",code=");
                        LIZJ.append(c84244X4m.LIZJ);
                        LIZJ.append(",sCode=");
                        LIZJ.append(c84244X4m2.LIZJ);
                        LIZJ.append(",range=");
                        LIZJ.append(X4Q.LJIILJJIL(c84244X4m.LIZIZ, "Content-Range"));
                        LIZJ.append(",sRange = ");
                        LIZJ.append(X4Q.LJIILJJIL(c84244X4m2.LIZIZ, "Content-Range"));
                        LIZJ.append(",url = ");
                        LIZJ.append(c84244X4m.LIZ);
                        LIZJ.append(",sUrl=");
                        LIZJ.append(c84244X4m2.LIZ);
                        String LIZIZ = X1D.LIZIZ(LIZJ);
                        C65210PiY.LJ(this.LIZ.getId(), "SegmentDispatcher", "validateHttpResponse", LIZIZ);
                        if (LIZLLL2 > 0 && LIZLLL3 > 0) {
                            throw new BaseException(1074, LIZIZ);
                        }
                    }
                    String LIZIZ2 = c84244X4m.LIZIZ.LIZIZ("Etag");
                    String LIZIZ3 = c84244X4m2.LIZIZ.LIZIZ("Etag");
                    if (!TextUtils.equals(LIZIZ2, LIZIZ3)) {
                        String LIZJ2 = C0ON.LIZJ("Etag not equals with main url, etag = ", LIZIZ2, ", mainEtag = ", LIZIZ3);
                        C65210PiY.LJ(this.LIZ.getId(), "SegmentDispatcher", "validateHttpResponse", LIZJ2);
                        if (!TextUtils.isEmpty(LIZIZ2) && !TextUtils.isEmpty(LIZIZ3) && !LIZIZ2.equalsIgnoreCase(LIZIZ3)) {
                            throw new BaseException(1074, LIZJ2);
                        }
                    }
                }
                if (this.LJIIJ == null) {
                    this.LJIIJ = c84244X4m;
                    if (this.LIZ.getTotalBytes() <= 0) {
                        long LIZLLL4 = c84244X4m.LIZLLL();
                        if (C65210PiY.LIZ()) {
                            int id2 = this.LIZ.getId();
                            StringBuilder LIZJ3 = V10.LIZJ("Len=", LIZLLL4, ",url=");
                            LIZJ3.append(c84233X4b.LIZ);
                            C65210PiY.LIZLLL(id2, "SegmentDispatcher", "checkSegmentHttpResponseLocked", X1D.LIZIZ(LIZJ3));
                        }
                        this.LIZ.setTotalBytes(LIZLLL4);
                    }
                    synchronized (this.LJIIZILJ) {
                        this.LJIIZILJ.notify();
                    }
                    return;
                }
                return;
            }
            throw new SegmentApplyException(5, "applySegment");
        }
        throw new SegmentApplyException(1, "segment already has an owner");
    }
}
