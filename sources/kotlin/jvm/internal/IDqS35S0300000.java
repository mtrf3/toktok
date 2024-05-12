package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C1JX;
import X.C24400xY;
import X.C24570xp;
import X.C35871ax;
import X.C76800UCe;
import X.InterfaceC24350xT;
import X.InterfaceC24420xa;
import X.InterfaceC37501da;
import X.InterfaceC67352kd;
import X.InterfaceC88471Ynr;
import X.InterfaceC88473Ynt;
import android.os.Trace;
import java.util.List;

/* loaded from: classes.dex */
public class IDqS35S0300000 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS35S0300000(C35871ax c35871ax, C35871ax c35871ax2, List<InterfaceC88473Ynt<InterfaceC24420xa<?>, C24570xp, InterfaceC24350xT, C76800UCe>> list, C24400xY c24400xY) {
        super(3);
        this.$t = c24400xY;
        this.l0 = c35871ax;
        this.l1 = c35871ax2;
        this.l2 = list;
    }

    public static final Object invoke$0(IDqS35S0300000 iDqS35S0300000, Object obj, Object obj2, Object obj3) {
        InterfaceC24420xa interfaceC24420xa = (InterfaceC24420xa) obj;
        C24570xp c24570xp = (C24570xp) obj2;
        InterfaceC24350xT interfaceC24350xT = (InterfaceC24350xT) obj3;
        C1JX.LJIIIZ(interfaceC24420xa, "applier", c24570xp, "slots", interfaceC24350xT, "rememberManager");
        C35871ax c35871ax = (C35871ax) iDqS35S0300000.l0;
        List list = (List) iDqS35S0300000.l1;
        C24400xY c24400xY = (C24400xY) iDqS35S0300000.l2;
        Trace.beginSection("change:slots.tablefixup");
        try {
            Trace.beginSection("change:slots.tablefixup_p1");
            try {
                C24570xp LJIILJJIL = c35871ax.LJIILJJIL();
                try {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((InterfaceC88473Ynt) list.get(i)).invoke(interfaceC24420xa, LJIILJJIL, interfaceC24350xT);
                    }
                    Trace.endSection();
                    Trace.beginSection("change:slots.tablefixup_p2");
                    try {
                        c24570xp.LJ();
                        c24400xY.getClass();
                        c24570xp.LJIJJLI(c35871ax, c35871ax.LJII(c24400xY));
                        c24570xp.LJIIIZ();
                        Trace.endSection();
                        return C76800UCe.LIZ;
                    } finally {
                    }
                } finally {
                    LJIILJJIL.LJFF();
                }
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0035, code lost:
    
        if (r5 == X.C24500xi.LIZIZ) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.IDqS35S0300000 r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            X.0Sh r7 = (X.InterfaceC07790Sh) r7
            X.0xk r8 = (X.InterfaceC24520xk) r8
            java.lang.Number r9 = (java.lang.Number) r9
            java.lang.String r1 = "$this$composed"
            r0 = 1175567217(0x4611bb71, float:9326.86)
            X.C111074Xn.LIZIZ(r9, r7, r1, r8, r0)
            X.1o7 r0 = X.AnonymousClass057.LJ
            java.lang.Object r2 = r8.LJIILLIIL(r0)
            X.0vt r2 = (X.InterfaceC23370vt) r2
            X.1o7 r0 = X.AnonymousClass057.LJIILJJIL
            java.lang.Object r1 = r8.LJIILLIIL(r0)
            X.04g r1 = (X.InterfaceC015404g) r1
            r0 = 1157296644(0x44faf204, float:2007.563)
            r8.LJJIIJ(r0)
            boolean r0 = r8.LJIJJ(r2)
            java.lang.Object r5 = r8.LJIILL()
            if (r0 != 0) goto L37
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r5 != r0) goto L3f
        L37:
            X.27m r5 = new X.27m
            r5.<init>(r1, r2)
            r8.LJJIII(r5)
        L3f:
            r8.LJJIJIIJIL()
            java.lang.Object r4 = r6.l0
            java.lang.Object r3 = r6.l1
            java.lang.Object r2 = r6.l2
            X.Ynr r2 = (X.InterfaceC88471Ynr) r2
            X.27m r5 = (X.C533427m) r5
            X.2Gs r1 = new X.2Gs
            r0 = 0
            r1.<init>(r5, r2, r0)
            X.C24610xt.LIZJ(r5, r4, r3, r1, r8)
            r8.LJJIJIIJIL()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDqS35S0300000.invoke$1(kotlin.jvm.internal.IDqS35S0300000, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS35S0300000(Object obj, Object obj2, Object obj3, InterfaceC88471Ynr<? super InterfaceC37501da, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88471Ynr) {
        super(3);
        this.$t = interfaceC88471Ynr;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
