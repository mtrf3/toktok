package Y;

import X.BEU;
import X.C28460BEy;
import X.C73943T0h;
import X.InterfaceC28459BEx;
import X.InterfaceC64592gB;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class AfS0S1110200_5 implements InterfaceC64592gB {
    public final int $t;
    public long j3;
    public long j4;
    public Object l1;
    public String s0;
    public boolean z2;

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

    public static final void accept$0(AfS0S1110200_5 afS0S1110200_5, Object obj) {
        InterfaceC28459BEx interfaceC28459BEx = (InterfaceC28459BEx) ((WeakReference) afS0S1110200_5.l1).get();
        if (interfaceC28459BEx != null) {
            interfaceC28459BEx.l(afS0S1110200_5.z2);
        }
        if (o.LJ(afS0S1110200_5.s0, "KickOutDialog")) {
            C73943T0h.LIZ().LIZIZ(new BEU(afS0S1110200_5.z2, afS0S1110200_5.j3));
        }
        C28460BEy.LIZIZ(afS0S1110200_5.j4, afS0S1110200_5.j3, afS0S1110200_5.z2);
    }

    public static final void accept$1(AfS0S1110200_5 afS0S1110200_5, Object obj) {
        InterfaceC28459BEx interfaceC28459BEx = (InterfaceC28459BEx) ((WeakReference) afS0S1110200_5.l1).get();
        if (interfaceC28459BEx != null) {
            interfaceC28459BEx.l(afS0S1110200_5.z2);
        }
        if (o.LJ(afS0S1110200_5.s0, "KickOutDialog")) {
            C73943T0h.LIZ().LIZIZ(new BEU(afS0S1110200_5.z2, afS0S1110200_5.j3));
        }
        C28460BEy.LIZIZ(afS0S1110200_5.j4, afS0S1110200_5.j3, afS0S1110200_5.z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x000b: IPUT (r7 I:long), (r0 I:Y.AfS0S1110200_5) (LINE:100663307) Y.AfS0S1110200_5.j4 long, block:B:1:0x0000 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0000: IPUT (r9 I:int), (r1 I:Y.AfS0S1110200_5) (LINE:100663296) Y.AfS0S1110200_5.$t int, block:B:1:0x0000 */
    public AfS0S1110200_5(WeakReference weakReference, WeakReference<InterfaceC28459BEx> weakReference2, boolean z, String str, long j, long j2) {
        int i;
        long j3;
        this.$t = i;
        this.l1 = weakReference;
        this.z2 = weakReference2;
        this.s0 = z;
        this.j3 = str;
        this.j4 = j3;
    }
}
