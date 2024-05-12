package X;

import Y.ARunnableS42S0100000_6;
import android.os.Looper;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0200000_6;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.Dxe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35570Dxe {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C35264Dsi.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C35262Dsg.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C35263Dsh.LJLIL);
    public static final java.util.Map<Object, Runnable> LIZLLL = new LinkedHashMap();
    public static final java.util.Map<Object, Runnable> LJ = new LinkedHashMap();
    public static boolean LJFF;

    public static void LIZIZ(InterfaceC65784Pro interfaceC65784Pro) {
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            interfaceC65784Pro.invoke();
        } else {
            C57022Lq.LIZ.LJLIL.post(new ARunnableS42S0100000_6(interfaceC65784Pro, 159));
        }
    }

    public static final void LIZJ(Object obj) {
        if (obj == null || !((Boolean) LIZJ.getValue()).booleanValue()) {
            return;
        }
        LIZIZ(new AqS156S0100000_6(obj, 154));
    }

    public static final void LIZ(Runnable runnable, Object obj) {
        if (obj == null || !((Boolean) LIZJ.getValue()).booleanValue()) {
            runnable.run();
        } else {
            LIZIZ(new AqS153S0200000_6(runnable, obj, 30));
        }
    }
}
