package Y;

import X.C28460BEy;
import X.InterfaceC28459BEx;
import X.InterfaceC64592gB;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class AfS0S0110200_5 implements InterfaceC64592gB {
    public final int $t;
    public long j2;
    public long j3;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS0S0110200_5 afS0S0110200_5, Object obj) {
        Exception exc;
        Throwable it = (Throwable) obj;
        InterfaceC28459BEx interfaceC28459BEx = (InterfaceC28459BEx) ((WeakReference) afS0S0110200_5.l0).get();
        if (interfaceC28459BEx != null) {
            boolean z = afS0S0110200_5.z1;
            if (it instanceof Exception) {
                exc = (Exception) it;
            } else {
                exc = null;
            }
            interfaceC28459BEx.b(exc, z);
        }
        boolean z2 = afS0S0110200_5.z1;
        long j = afS0S0110200_5.j2;
        long j2 = afS0S0110200_5.j3;
        o.LJIIIIZZ(it, "it");
        C28460BEy.LIZ(z2, j, j2, it);
    }

    public static final void accept$1(AfS0S0110200_5 afS0S0110200_5, Object obj) {
        Exception exc;
        Throwable it = (Throwable) obj;
        InterfaceC28459BEx interfaceC28459BEx = (InterfaceC28459BEx) ((WeakReference) afS0S0110200_5.l0).get();
        if (interfaceC28459BEx != null) {
            boolean z = afS0S0110200_5.z1;
            if (it instanceof Exception) {
                exc = (Exception) it;
            } else {
                exc = null;
            }
            interfaceC28459BEx.b(exc, z);
        }
        boolean z2 = afS0S0110200_5.z1;
        long j = afS0S0110200_5.j2;
        long j2 = afS0S0110200_5.j3;
        o.LJIIIIZZ(it, "it");
        C28460BEy.LIZ(z2, j, j2, it);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0009: IPUT (r6 I:long), (r0 I:Y.AfS0S0110200_5) (LINE:83886089) Y.AfS0S0110200_5.j3 long, block:B:1:0x0000 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0000: IPUT (r8 I:int), (r1 I:Y.AfS0S0110200_5) (LINE:83886080) Y.AfS0S0110200_5.$t int, block:B:1:0x0000 */
    public AfS0S0110200_5(WeakReference weakReference, WeakReference<InterfaceC28459BEx> weakReference2, boolean z, long j, long j2) {
        int i;
        long j3;
        this.$t = i;
        this.l0 = weakReference;
        this.z1 = weakReference2;
        this.j2 = z ? 1L : 0L;
        this.j3 = j3;
    }
}
