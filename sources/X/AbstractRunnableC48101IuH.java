package X;

import Y.ARunnableS15S0000000_8;
import Y.ARunnableS27S0200000_8;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.IuH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractRunnableC48101IuH implements Runnable {
    public volatile AbstractC47939Irf LJLIL;
    public final C47961Is1 LJLILLLLZI;
    public volatile List<C48099IuF> LJLJJL;
    public volatile C48107IuN LJLJJLL;
    public volatile String LJLJL;
    public volatile String LJLJLJ;
    public volatile C48077Itt LJLJLLL;
    public volatile C48091Iu7 LJLL;
    public final AtomicInteger LJLJI = new AtomicInteger();
    public final AtomicLong LJLJJI = new AtomicLong();
    public final AtomicLong LJLLILLLL = new AtomicLong(0);
    public final AtomicLong LJLLJ = new AtomicLong(0);
    public final AtomicInteger LJLLL = new AtomicInteger(0);
    public int LJLLLL = -1;
    public volatile int LJLLI = 0;

    public final void LIZ() {
        if (this.LJLLL.get() == 1) {
            throw new C47941Irh();
        }
    }

    public final int LIZJ() {
        if (this.LJLJLLL != null) {
            return this.LJLJLLL.LIZJ.LIZ;
        }
        return 0;
    }

    public final void LJII() {
        this.LJLLILLLL.getAndAdd(SystemClock.elapsedRealtime() - this.LJLLJ.get());
    }

    public final void LJFF(String str) {
        InterfaceC47447Ijj interfaceC47447Ijj = C47455Ijr.LJ;
        if (interfaceC47447Ijj != null) {
            C48100IuG.LJIIIIZZ(new ARunnableS27S0200000_8(this, interfaceC47447Ijj, str, 70));
        }
    }

    public AbstractRunnableC48101IuH(AbstractC47939Irf abstractC47939Irf, C47961Is1 c47961Is1) {
        this.LJLIL = abstractC47939Irf;
        this.LJLILLLLZI = c47961Is1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
    
        if (r3 == 100) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
    
        if (r1 != 100) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0037, code lost:
    
        r9.LJLLLL = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0040, code lost:
    
        X.C48100IuG.LJIIIIZZ(new X.RunnableC48069Itl(r9, r5, r6, r10, r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0048, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0030, code lost:
    
        if (r3 <= r0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(int r10, int r11) {
        /*
            r9 = this;
            X.Ijj r5 = X.C47455Ijr.LJ
            if (r5 == 0) goto La
            r7 = r10
            if (r7 <= 0) goto La
            r8 = r11
            if (r8 >= 0) goto Lb
        La:
            return
        Lb:
            int r2 = X.C47455Ijr.LJJ
            r4 = r9
            int r6 = r4.LIZJ()
            r1 = 1
            if (r2 == r1) goto L1a
            r0 = 2
            if (r2 != r0) goto L48
            if (r6 != r1) goto L48
        L1a:
            float r1 = (float) r8
            float r0 = (float) r7
            float r1 = r1 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            int r3 = (int) r1
            r2 = 100
            if (r3 <= r2) goto L27
            r3 = 100
        L27:
            monitor-enter(r4)
            int r1 = r4.LJLLLL     // Catch: java.lang.Throwable -> L3d
            int r0 = X.C47455Ijr.LJIILIIL     // Catch: java.lang.Throwable -> L3d
            int r0 = r0 + r1
            if (r0 <= r2) goto L30
            goto L32
        L30:
            if (r3 > r0) goto L34
        L32:
            if (r3 != r2) goto L3b
        L34:
            if (r1 != r2) goto L37
            goto L3b
        L37:
            r4.LJLLLL = r3     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3d
            goto L40
        L3b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3d
            return
        L3d:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3d
            throw r0
        L40:
            X.Itl r3 = new X.Itl
            r3.<init>(r4, r5, r6, r7, r8)
            X.C48100IuG.LJIIIIZZ(r3)
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractRunnableC48101IuH.LIZLLL(int, int):void");
    }

    public static void LJ(int i, String str, String str2) {
        C48100IuG.LJII(new ARunnableS15S0000000_8(str, i, str2, 2));
    }

    public final void LJI(int i, String str, Throwable th) {
        C48107IuN c48107IuN = this.LJLJJLL;
        if (c48107IuN == null || c48107IuN.LJI) {
            return;
        }
        c48107IuN.LJI = true;
        try {
            C48104IuK c48104IuK = c48107IuN.LIZLLL;
            if (c48104IuK == null) {
                return;
            }
            if (c48104IuK.LJLJJI != null && C47455Ijr.LJIIJ) {
                c48107IuN.LIZJ(i, str, th);
            }
            if (c48107IuN.LIZLLL.LJLJJL == null) {
                return;
            }
            c48107IuN.LIZIZ(i, th);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:307:0x0181, code lost:
    
        if (r20 < 0) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x018a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x01a8 A[Catch: all -> 0x01c7, TryCatch #2 {all -> 0x01c7, blocks: (B:285:0x018a, B:288:0x0192, B:291:0x01a2, B:293:0x01a8, B:294:0x01ad, B:296:0x01bb), top: B:284:0x018a }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C48104IuK LIZIZ(int r20, int r21, java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 1522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractRunnableC48101IuH.LIZIZ(int, int, java.lang.String, java.lang.String):X.IuK");
    }
}
