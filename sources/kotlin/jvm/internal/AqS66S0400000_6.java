package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C37324Ekq;
import X.C37327Ekt;
import X.C37330Ekw;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import android.database.Cursor;

/* loaded from: classes7.dex */
public class AqS66S0400000_6 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS66S0400000_6 aqS66S0400000_6) {
        ((C37327Ekt) aqS66S0400000_6.l0).LIZ((Cursor) aqS66S0400000_6.l1, (C37324Ekq) aqS66S0400000_6.l2, (C37330Ekw) aqS66S0400000_6.l3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS66S0400000_6 aqS66S0400000_6) {
        ((C37327Ekt) aqS66S0400000_6.l0).LIZ((Cursor) aqS66S0400000_6.l1, (C37324Ekq) aqS66S0400000_6.l2, (C37330Ekw) aqS66S0400000_6.l3);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS66S0400000_6(C37327Ekt c37327Ekt, Cursor cursor, C37324Ekq c37324Ekq, C37330Ekw c37330Ekw, int i) {
        super(0);
        this.$t = i;
        this.l0 = c37327Ekt;
        this.l1 = cursor;
        this.l2 = c37324Ekq;
        this.l3 = c37330Ekw;
    }
}
