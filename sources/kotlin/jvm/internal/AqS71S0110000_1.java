package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C3L4;
import X.C3NQ;
import X.C81413Hl;
import X.C82523Ls;
import X.InterfaceC88471Ynr;
import X.OSZ;
import ujb.s;

/* loaded from: classes2.dex */
public class AqS71S0110000_1 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS71S0110000_1(boolean z, C82523Ls c82523Ls, int i) {
        super(2);
        this.$t = i;
        this.z1 = z;
        this.l0 = c82523Ls;
    }

    public static final Object invoke$0(AqS71S0110000_1 aqS71S0110000_1, Object obj, Object obj2) {
        boolean z;
        C3L4 session = (C3L4) obj;
        ((Boolean) obj2).booleanValue();
        o.LJIIIZ(session, "session");
        int i = 0;
        if (session.LLI && aqS71S0110000_1.z1) {
            z = true;
        } else {
            z = false;
        }
        if (session.LJIIJ() && session.LL) {
            C3NQ.LIZJ(((C82523Ls) aqS71S0110000_1.l0).LJI(), session, true, false, false, 28);
        } else if (session.LLI && z) {
            C3NQ.LIZJ(((C82523Ls) aqS71S0110000_1.l0).LJI(), session, true, false, false, 28);
        } else if (C81413Hl.LIZIZ(session)) {
            i = 0;
            C3NQ.LIZJ(((C82523Ls) aqS71S0110000_1.l0).LJI(), session, false, true, false, 22);
        } else if (C81413Hl.LJ(session)) {
            i = 0;
            C3NQ.LIZJ(((C82523Ls) aqS71S0110000_1.l0).LJI(), session, false, false, true, 14);
        } else {
            C3NQ.LIZJ(((C82523Ls) aqS71S0110000_1.l0).LJI(), session, false, false, false, 30);
            i = session.LJLLILLLL;
        }
        return Integer.valueOf(i);
    }

    public static final Object invoke$1(AqS71S0110000_1 aqS71S0110000_1, Object obj, Object obj2) {
        CharSequence $receiver = (CharSequence) obj;
        int intValue = ((Number) obj2).intValue();
        o.LJIIIZ($receiver, "$this$$receiver");
        int LJJLIIIJLJLI = s.LJJLIIIJLJLI(intValue, $receiver, aqS71S0110000_1.z1, (char[]) aqS71S0110000_1.l0);
        if (LJJLIIIJLJLI < 0) {
            return null;
        }
        return new OSZ(Integer.valueOf(LJJLIIIJLJLI), 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS71S0110000_1(char[] cArr, boolean z, int i) {
        super(2);
        this.$t = i;
        this.l0 = cArr;
        this.z1 = z;
    }
}
