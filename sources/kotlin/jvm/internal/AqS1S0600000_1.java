package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C109544Rq;
import X.C4MX;
import X.C63120Opw;
import X.C63623Oy3;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.InterfaceC92803ka;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class AqS1S0600000_1 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS1S0600000_1 aqS1S0600000_1, Object obj) {
        InterfaceC92803ka LIZLLL = ((C4MX) aqS1S0600000_1.l0).LIZLLL();
        if (LIZLLL != null) {
            LIZLLL.LJFF((C63120Opw) aqS1S0600000_1.l1, (C109544Rq) aqS1S0600000_1.l2);
        }
        List list = (List) aqS1S0600000_1.l3;
        if (obj == null) {
            obj = (C109544Rq) aqS1S0600000_1.l2;
        }
        list.add(obj);
        ((C4MX) aqS1S0600000_1.l0).LIZJ((C63120Opw) aqS1S0600000_1.l1, (List) aqS1S0600000_1.l4, (List) aqS1S0600000_1.l3, (Map) aqS1S0600000_1.l5);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS1S0600000_1 aqS1S0600000_1, Object obj) {
        C63623Oy3 c63623Oy3 = (C63623Oy3) obj;
        InterfaceC92803ka LIZLLL = ((C4MX) aqS1S0600000_1.l0).LIZLLL();
        if (LIZLLL != null) {
            LIZLLL.LJ((C63120Opw) aqS1S0600000_1.l1, (C109544Rq) aqS1S0600000_1.l2, c63623Oy3);
        }
        Map map = (Map) aqS1S0600000_1.l3;
        C109544Rq c109544Rq = (C109544Rq) aqS1S0600000_1.l2;
        if (c63623Oy3 == null) {
            c63623Oy3 = C63623Oy3.LIZIZ().LIZ;
            c63623Oy3.LIZJ = "Unknown error";
        }
        map.put(c109544Rq, c63623Oy3);
        ((C4MX) aqS1S0600000_1.l0).LIZJ((C63120Opw) aqS1S0600000_1.l1, (List) aqS1S0600000_1.l4, (List) aqS1S0600000_1.l5, (Map) aqS1S0600000_1.l3);
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS1S0600000_1(X.C4MX r3, X.C4MX r4, X.C63120Opw r5, X.C109544Rq r6, java.util.List<X.C109544Rq> r7, java.util.List<X.C109544Rq> r8, java.util.Map<X.C109544Rq, X.C63623Oy3> r9) {
        /*
            r2 = this;
            r2.$t = r9
            switch(r9) {
                case 0: goto L17;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.l2 = r5
            r1.l3 = r8
            r1.l4 = r6
            r1.l5 = r7
            r0 = 1
        L13:
            r1.<init>(r0)
            return
        L17:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.l2 = r5
            r1.l3 = r6
            r1.l4 = r7
            r1.l5 = r8
            r0 = 1
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS1S0600000_1.<init>(X.4MX, X.Opw, X.4Rq, java.util.List, java.util.List, java.util.Map, int):void");
    }
}
