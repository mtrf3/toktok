package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3RG, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3RG<R> {
    public InterfaceC82613Mb<R> LIZ;

    public abstract boolean LIZ();

    public final void LIZIZ(List<R> list, boolean z) {
        o.LJIIIZ(list, "list");
        if (z) {
            InterfaceC82613Mb<R> interfaceC82613Mb = this.LIZ;
            if (interfaceC82613Mb != null) {
                interfaceC82613Mb.L20(list, LIZ());
                return;
            } else {
                o.LJIJI("loadSubscriber");
                throw null;
            }
        }
        InterfaceC82613Mb<R> interfaceC82613Mb2 = this.LIZ;
        if (interfaceC82613Mb2 != null) {
            interfaceC82613Mb2.zr0(list, LIZ());
        } else {
            o.LJIJI("loadSubscriber");
            throw null;
        }
    }
}
