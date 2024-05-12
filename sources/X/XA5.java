package X;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XA5 {
    public static final XA7 LIZ;

    static {
        XA7 xa7;
        File file = new File(C170776n3.LIZIZ);
        synchronized (XA7.class) {
            if (XA7.LJFF == null) {
                XA7.LJFF = new XA7(file);
            }
            xa7 = XA7.LJFF;
        }
        LIZ = xa7;
    }

    public static File LIZ(String key) {
        o.LJIIIZ(key, "key");
        XA7 xa7 = LIZ;
        try {
            C84381X9t LIZLLL = xa7.LIZ().LIZLLL(xa7.LIZ.LIZIZ(new C37241EjV(key)));
            if (LIZLLL != null) {
                return LIZLLL.LIZ[0];
            }
        } catch (IOException unused) {
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [X.6r5] */
    public static void LIZIZ(String key, final C173226r0 c173226r0) {
        XAA xaa;
        boolean z;
        o.LJIIIZ(key, "key");
        XA7 xa7 = LIZ;
        C37241EjV c37241EjV = new C37241EjV(key);
        ?? r7 = new Object(c173226r0) { // from class: X.6r5
            public final InterfaceC173266r4 LIZ;

            {
                this.LIZ = c173226r0;
            }

            public final boolean LIZ(File file) {
                o.LJIIIZ(file, "file");
                return this.LIZ.LIZ(file);
            }
        };
        String LIZIZ = xa7.LIZ.LIZIZ(c37241EjV);
        XA8 xa8 = xa7.LIZLLL;
        synchronized (xa8) {
            xaa = (XAA) ((HashMap) xa8.LIZ).get(LIZIZ);
            if (xaa == null) {
                xaa = xa8.LIZIZ.LIZ();
                ((HashMap) xa8.LIZ).put(LIZIZ, xaa);
            }
            xaa.LIZIZ++;
        }
        ((ReentrantLock) xaa.LIZ).lock();
        try {
            try {
                C84378X9q LIZ2 = xa7.LIZ();
                if (LIZ2.LIZLLL(LIZIZ) == null) {
                    C84380X9s LIZJ = LIZ2.LIZJ(LIZIZ);
                    if (LIZJ != null) {
                        try {
                            if (r7.LIZ(LIZJ.LIZ())) {
                                LIZJ.LIZLLL.LIZ(LIZJ, true);
                                LIZJ.LIZJ = true;
                            }
                            if (!z) {
                                LIZJ.LIZLLL.LIZ(LIZJ, false);
                            }
                        } finally {
                            if (!LIZJ.LIZJ) {
                                try {
                                    LIZJ.LIZLLL.LIZ(LIZJ, false);
                                } catch (IOException unused) {
                                }
                            }
                        }
                    } else {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("Had two simultaneous puts for: ");
                        LIZ3.append(LIZIZ);
                        throw new IllegalStateException(X1D.LIZIZ(LIZ3));
                    }
                }
            } finally {
                xa7.LIZLLL.LIZ(LIZIZ);
            }
        } catch (IOException unused2) {
        }
    }
}
