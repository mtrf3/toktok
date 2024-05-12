package X;

import java.util.Queue;
import kotlin.jvm.internal.o;

/* renamed from: X.6mC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C170246mC extends AbstractC65781Prl implements InterfaceC65784Pro<C84507XEp> {
    public static final C170246mC LJLIL = new C170246mC();

    public C170246mC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C84507XEp invoke() {
        InterfaceC84511XEt interfaceC84511XEt = new InterfaceC84511XEt() { // from class: X.6mF
            @Override // X.InterfaceC84511XEt
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC84511XEt
            public final void LIZIZ(Queue queue) {
                o.LJIIIZ(queue, "queue");
            }

            @Override // X.InterfaceC84511XEt
            public final void LJFF() {
            }
        };
        C170266mE c170266mE = new C170266mE();
        c170266mE.LIZ = 3;
        c170266mE.LIZIZ = interfaceC84511XEt;
        return c170266mE.LIZ();
    }
}
