package X;

import android.os.Looper;
import android.os.SystemClock;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AqS175S0100000_9;

/* loaded from: classes10.dex */
public final class MDW {
    public static C10H LIZ;
    public static String LIZIZ;
    public static InterfaceC55741LuD LIZJ;
    public static final long LIZLLL = ((Number) C35026Dos.LIZIZ.getValue()).longValue();
    public static MDU LJ = MDU.DEFAULT;
    public static PthreadTimer LJFF;
    public static MDX LJI;
    public static boolean LJII;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ() {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MDW.LIZ():void");
    }

    public static void LIZIZ() {
        SystemClock.elapsedRealtime();
        C64829PcP.LIZLLL();
        SystemClock.elapsedRealtime();
        LJ = MDU.REQUEST_START;
        C36581c6 c36581c6 = null;
        LIZIZ = null;
        C10H c10h = LIZ;
        if (c10h != null) {
            try {
                c10h.LIZ();
            } catch (IllegalStateException unused) {
            }
            LIZ = null;
        }
        MDX mdx = new MDX();
        LJI = mdx;
        long j = LIZLLL;
        Long valueOf = Long.valueOf(j);
        java.util.Map<String, Long> map = mdx.LIZ;
        C56569MIb.LIZ.getClass();
        map.put(C56569MIb.LJIIIZ.LIZ, valueOf);
        MDX mdx2 = LJI;
        if (mdx2 != null) {
            C56574MIg c56574MIg = new C56574MIg(new Object[0]);
            MIZ.LIZ.getClass();
            c56574MIg.LJIILJJIL(MIZ.LIZIZ, new AqS175S0100000_9(mdx2, 580));
        }
        if (!C48203Ivv.LJ(EF7.LIZIZ())) {
            MDU mdu = MDU.RESPONSE_IN_TIME_NO_NET;
            LJ = mdu;
            LIZIZ = null;
            InterfaceC55741LuD interfaceC55741LuD = LIZJ;
            if (interfaceC55741LuD != null) {
                interfaceC55741LuD.LIZ(mdu);
            }
            MDX mdx3 = LJI;
            if (mdx3 != null) {
                C56574MIg c56574MIg2 = new C56574MIg(new Object[0]);
                MIZ.LIZ.getClass();
                c56574MIg2.LJIILJJIL(MIZ.LIZIZ, new AqS175S0100000_9(mdx3, 579));
                return;
            }
            return;
        }
        LIZ = new C10H();
        PthreadTimer pthreadTimer = LJFF;
        if (pthreadTimer != null) {
            pthreadTimer.cancel();
        }
        LJFF = null;
        PthreadTimer pthreadTimer2 = new PthreadTimer("RealTimeSplashManager");
        pthreadTimer2.schedule(new MDV(), j);
        LJFF = pthreadTimer2;
        if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
            Callable callable = LFX.LJLIL;
            ExecutorService LIZIZ2 = C38995FSd.LIZIZ();
            C10H c10h2 = LIZ;
            if (c10h2 != null) {
                c36581c6 = c10h2.LIZIZ();
            }
            C10K.LIZIZ(callable, LIZIZ2, c36581c6);
            return;
        }
        LIZ();
    }
}
