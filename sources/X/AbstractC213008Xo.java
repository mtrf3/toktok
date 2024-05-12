package X;

import X.InterfaceC212998Xn;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS42S0001000_3;
import kotlin.jvm.internal.AqS93S0101000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8Xo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC213008Xo<R extends InterfaceC212998Xn<R, ITEM>, ITEM> implements InterfaceC212878Xb<R, ITEM> {
    public final ConcurrentHashMap<String, C212988Xm<R, ITEM>> LIZ = new ConcurrentHashMap<>();

    public abstract String LJ(ITEM item);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC212878Xb
    public final void LIZIZ(C8RL item, InterfaceC212998Xn<?, ?> interfaceC212998Xn, int i, List<? extends Object> list) {
        o.LJIIIZ(item, "item");
        String LJ = LJ(item);
        C212988Xm<R, ITEM> c212988Xm = this.LIZ.get(LJ);
        if (c212988Xm == null) {
            InterfaceC212978Xl<?, ?> child = interfaceC212998Xn.getChild();
            if (!(child instanceof InterfaceC212978Xl)) {
                child = null;
            }
            c212988Xm = new C212988Xm<>(C65352Pkq.LIZ(interfaceC212998Xn.getClass()), child);
            this.LIZ.put(LJ, c212988Xm);
        }
        C212988Xm<?, ?> proxy = interfaceC212998Xn.getProxy();
        if (proxy != null) {
            proxy.LIZIZ();
        }
        c212988Xm.LIZ(i, interfaceC212998Xn, item, list, new AqS93S0101000_3(c212988Xm, i, 18), new AqS42S0001000_3(i, 1));
    }
}
