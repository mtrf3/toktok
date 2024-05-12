package X;

import com.bytedance.frameworks.baselib.network.dispatcher.NetThreadPoolManager;

/* renamed from: X.PcR, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64831PcR {
    public static volatile boolean LIZ = true;
    public static volatile C64833PcT LIZIZ;
    public static volatile C64831PcR LIZJ;

    public static synchronized C64833PcT LIZJ() {
        C64833PcT c64833PcT;
        synchronized (C64831PcR.class) {
            if (LIZIZ == null) {
                C64832PcS c64832PcS = new C64832PcS();
                c64832PcS.LIZ(8, 8);
                c64832PcS.LIZIZ(8, 8);
                c64832PcS.LJ = 30L;
                c64832PcS.LJI = 10L;
                c64832PcS.LJFF = 10L;
                c64832PcS.LJII = true;
                LIZIZ = new C64833PcT(c64832PcS);
            }
            c64833PcT = LIZIZ;
        }
        return c64833PcT;
    }

    public C64831PcR() {
        if (LIZIZ == null) {
            C64832PcS c64832PcS = new C64832PcS();
            c64832PcS.LIZ(8, 8);
            c64832PcS.LIZIZ(8, 8);
            c64832PcS.LJ = 30L;
            c64832PcS.LJI = 10L;
            c64832PcS.LJFF = 10L;
            c64832PcS.LJII = true;
            LIZIZ = new C64833PcT(c64832PcS);
        }
    }

    public static synchronized void LIZLLL(boolean z) {
        synchronized (C64831PcR.class) {
            LIZ = z;
            if (LIZIZ != null) {
                LIZIZ.LJII = LIZ;
            }
        }
    }

    public final synchronized void LIZ(C64834PcU c64834PcU) {
        NetThreadPoolManager.INSTANCE.executeApi(c64834PcU);
    }

    public final synchronized void LIZIZ(C64834PcU c64834PcU) {
        NetThreadPoolManager.INSTANCE.executeDownload(c64834PcU);
    }
}
