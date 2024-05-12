package X;

import Y.ARunnableS17S0300000_6;
import Y.ARunnableS25S0200000_6;
import Y.ARunnableS42S0100000_6;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.o;

/* renamed from: X.Efl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37009Efl extends AbstractC37780EsC {
    public static final CopyOnWriteArraySet<InterfaceC37007Efj> LIZIZ = new CopyOnWriteArraySet<>();
    public static final C37010Efm LIZJ = new C37010Efm();

    @Override // X.InterfaceC37774Es6
    public final String getName() {
        return "__prefetch";
    }

    @Override // X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns params, InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH type) {
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        C37012Efo c37012Efo = new C37012Efo(this, interfaceC31943CgF, params);
        ARunnableS17S0300000_6 aRunnableS17S0300000_6 = new ARunnableS17S0300000_6(params, c37012Efo, new ARunnableS25S0200000_6(c37012Efo, params, 72), 12);
        C37000Efc.LIZLLL.getClass();
        Executor executor = C37000Efc.LIZIZ;
        if (executor != null) {
            executor.execute(new ARunnableS42S0100000_6(aRunnableS17S0300000_6, 167));
        } else {
            aRunnableS17S0300000_6.run();
        }
    }
}
