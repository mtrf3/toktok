package X;

import Y.ARunnableS2S0010000_8;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J28 {
    public static int LIZ;
    public static Choreographer LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static J2B LJ;
    public static final ConcurrentHashMap<Long, ConcurrentHashMap<J27, ArrayList<J25>>> LJFF;
    public static final LinkedBlockingQueue<J25> LJI;
    public static final AtomicLong LJII;
    public static final AtomicLong LJIIIIZZ;
    public static Method LJIIIZ;
    public static final J2C LJIIJ;
    public static final J2D LJIIJJI;
    public static final J2A LJIIL;
    public static long LJIILIIL;

    public static void LIZ(Object obj, Method method, Object[] objArr) {
        if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-8279379841760457509")).LIZ) {
            return;
        }
        method.invoke(obj, objArr);
    }

    static {
        J28 j28 = new J28();
        LIZ = 4;
        LJ = new J2B(new J2E());
        LJFF = new ConcurrentHashMap<>();
        LJI = new LinkedBlockingQueue<>();
        LJII = new AtomicLong(1L);
        LJIIIIZZ = new AtomicLong(0L);
        LJIIJ = new J2C(j28);
        LJIIJJI = new J2D(j28);
        LJIIL = new J2A(j28);
    }

    public static void LIZJ(boolean z) {
        if (z) {
            Choreographer choreographer = LIZIZ;
            if (choreographer != null) {
                choreographer.postFrameCallback(LJIIJJI);
            }
            Method method = LJIIIZ;
            if (method != null) {
                LIZ(LIZIZ, method, new Object[]{Integer.valueOf(LIZ), LJIIL, null, 0});
                return;
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        C16880lQ.LLIIIJ().postFrameCallback(LJIIJ);
    }

    public static void LIZLLL(boolean z) {
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            LIZJ(z);
        } else {
            C57022Lq.LIZ.LJLIL.post(new ARunnableS2S0010000_8(z, 0));
        }
    }

    public static long LJ(J25 j25) {
        long nanoTime = System.nanoTime();
        j25.LIZ();
        long nanoTime2 = System.nanoTime() - nanoTime;
        ConcurrentHashMap<String, OSZ<Long, Long>> concurrentHashMap = J25.LIZIZ;
        if (concurrentHashMap.get(j25.LIZ) == null) {
            concurrentHashMap.put(j25.LIZ, new OSZ<>(1L, Long.valueOf(nanoTime2)));
        } else {
            OSZ<Long, Long> osz = concurrentHashMap.get(j25.LIZ);
            if (osz != null) {
                OSZ<Long, Long> osz2 = osz;
                concurrentHashMap.put(j25.LIZ, new OSZ<>(Long.valueOf(osz2.getFirst().longValue() + 1), Long.valueOf(((osz2.getFirst().longValue() * osz2.getSecond().longValue()) + nanoTime2) / (osz2.getFirst().longValue() + 1))));
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        return nanoTime2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e3, code lost:
    
        r3 = r1;
        r0 = r9.get(X.J27.NORMAL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ea, code lost:
    
        if (r0 == null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f2, code lost:
    
        if (r0.size() != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f4, code lost:
    
        X.J28.LJFF.remove(java.lang.Long.valueOf(X.J28.LJII.getAndAdd(1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0105, code lost:
    
        r20 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0109, code lost:
    
        if (r1 > 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0211, code lost:
    
        r5 = 0;
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010b, code lost:
    
        r1 = X.J28.LJFF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0111, code lost:
    
        if (r1.size() > 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0119, code lost:
    
        if (X.J28.LJI.size() <= 0) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011b, code lost:
    
        LIZLLL(r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0122, code lost:
    
        if (r1.size() != 1) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0124, code lost:
    
        r6 = r1.entrySet().iterator();
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0131, code lost:
    
        if (r6.hasNext() == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014b, code lost:
    
        if (r6.next().getKey().longValue() >= X.J28.LJII.get()) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014d, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x021f, code lost:
    
        if (r5 == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0221, code lost:
    
        X.J28.LJFF.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0226, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0227, code lost:
    
        kotlin.jvm.internal.o.LJIIZILJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x022b, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(long r20, boolean r22) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J28.LIZIZ(long, boolean):void");
    }
}
