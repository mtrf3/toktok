package X;

import Y.ARunnableS24S0200000_5;
import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.CpK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32506CpK<T> {
    public final java.util.Map<InterfaceC32521CpZ<T>, C32513CpR<T>> LIZ = new LinkedHashMap();

    public final void LIZ(T t) {
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            LIZIZ(t);
        } else {
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS24S0200000_5(this, t, 5));
        }
    }

    public final void LIZIZ(T t) {
        C62819Ol5.LJIIJ("emitOnMainThread");
        for (Map.Entry entry : ((LinkedHashMap) this.LIZ).entrySet()) {
            if (((C32513CpR) entry.getValue()).LIZIZ) {
                ((InterfaceC32521CpZ) entry.getKey()).LIZ(t);
            }
        }
    }

    public final void LIZJ(C32543Cpv leafStateManager, InterfaceC32521CpZ<T> observer) {
        o.LJIIIZ(leafStateManager, "leafStateManager");
        o.LJIIIZ(observer, "observer");
        C62819Ol5.LJIIJ("observer");
        if (leafStateManager.LIZ != EnumC32545Cpx.END && !this.LIZ.containsKey(observer)) {
            C32513CpR<T> c32513CpR = new C32513CpR<>(observer);
            this.LIZ.put(observer, c32513CpR);
            leafStateManager.LIZ(c32513CpR);
        }
    }
}
