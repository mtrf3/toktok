package X;

import android.os.Build;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.PcP, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64829PcP {
    public static volatile boolean LIZIZ;
    public static volatile boolean LIZLLL;
    public static final Object LIZ = new Object();
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C58202Mso.LJLIL);
    public static final List<String> LJ = C47261Igj.LJJIJIIJI("MI PAD 2", "YT3-X90L", "YT3-X90F", "GT-810");

    public static final C64830PcQ LIZ() {
        return (C64830PcQ) LIZJ.getValue();
    }

    public static void LIZJ() {
        Object obj = LIZ;
        synchronized (obj) {
            LIZIZ = true;
            obj.notifyAll();
        }
    }

    public static void LIZLLL() {
        if (KZZ.LIZ || LIZIZ) {
            return;
        }
        Object obj = LIZ;
        synchronized (obj) {
            if (!LIZIZ) {
                try {
                    obj.wait();
                    LIZIZ = true;
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static boolean LIZIZ(boolean z) {
        try {
            String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
            o.LJIIIIZZ(SUPPORTED_ABIS, "SUPPORTED_ABIS");
            List LJIILL = C61898ORa.LJIILL(SUPPORTED_ABIS);
            if (LJIILL.contains("x86") || LJIILL.contains("x86_64")) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Cronet unsupported CPU arch: ");
                LIZ2.append(LJIILL);
                X1D.LIZIZ(LIZ2);
                return true;
            }
            if (LJ.contains(Build.MODEL)) {
                return true;
            }
            if (z && Build.VERSION.SDK_INT == 22) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }
}
