package X;

import android.graphics.Typeface;
import com.lynx.tasm.LynxEnv;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.Fn7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40013Fn7 {
    public static boolean LIZIZ;
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final ConcurrentHashMap<String, Typeface> LIZJ = new ConcurrentHashMap<>();

    public static void LIZ(C39935Flr c39935Flr) {
        if (c39935Flr.LJIIIIZZ) {
            LIZIZ = true;
            LIZ.compareAndSet(false, true);
            C39048FUe.LIZIZ(C39048FUe.LIZIZ, "Lynx has been initialized at other place", null, null, 6);
            return;
        }
        if (!LIZIZ && !LIZ.compareAndSet(false, true)) {
            return;
        }
        try {
            C40017FnB.LIZ = new C40012Fn6();
            C61590OFe.LIZ(C40014Fn8.LIZ);
            C40053Fnl.LIZ.getClass();
            C39943Flz.LIZ(c39935Flr);
            LynxEnv LJIIIZ = LynxEnv.LJIIIZ();
            o.LJFF(LJIIIZ, "LynxEnv.inst()");
            LJIIIZ.LJIIL();
            if (LJIIIZ.LJIILIIL) {
                LIZIZ = true;
            } else {
                LIZ.set(false);
                throw new RuntimeException("Lynx so Init Failed");
            }
        } catch (Throwable th) {
            LIZ.set(false);
            C39048FUe.LIZJ(C39048FUe.LIZIZ, th, "LynxKit Init Failed", 4);
        }
    }
}
