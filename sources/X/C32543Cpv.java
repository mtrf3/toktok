package X;

import android.os.Looper;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Cpv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32543Cpv {
    public EnumC32545Cpx LIZ = EnumC32545Cpx.INIT;
    public final List<InterfaceC32548Cq0> LIZIZ = new ArrayList();

    public static void LIZIZ(String str) {
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            return;
        }
        String LJ = a1.LJ("Method ", str, " must be called on the main thread");
        LJ.toString();
        throw new IllegalStateException(LJ);
    }

    public final void LIZ(InterfaceC32548Cq0 interfaceC32548Cq0) {
        LIZIZ("addObserver");
        ((ArrayList) this.LIZIZ).add(interfaceC32548Cq0);
    }

    public final void LIZJ(EnumC32545Cpx state) {
        EnumC32542Cpu enumC32542Cpu;
        o.LJIIIZ(state, "state");
        LIZIZ("setCurrentState");
        if (this.LIZ == state) {
            return;
        }
        this.LIZ = state;
        Iterator it = ((ArrayList) this.LIZIZ).iterator();
        while (it.hasNext()) {
            InterfaceC32548Cq0 interfaceC32548Cq0 = (InterfaceC32548Cq0) it.next();
            int i = C32544Cpw.LIZ[state.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        enumC32542Cpu = EnumC32542Cpu.ON_END;
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    enumC32542Cpu = EnumC32542Cpu.ON_START;
                }
            } else {
                enumC32542Cpu = EnumC32542Cpu.ON_END;
            }
            interfaceC32548Cq0.LIZ(this, enumC32542Cpu);
        }
    }
}
