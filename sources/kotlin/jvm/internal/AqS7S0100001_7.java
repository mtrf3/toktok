package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C41855Gbj;
import X.C43366H0g;
import X.C43421H2j;
import X.C43422H2k;
import X.C67996QmO;
import X.C76800UCe;
import X.EnumC43531H6p;
import X.InterfaceC44507HdP;
import X.InterfaceC65784Pro;

/* loaded from: classes8.dex */
public class AqS7S0100001_7 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public float f1;
    public Object l0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS7S0100001_7 aqS7S0100001_7) {
        ((InterfaceC44507HdP) aqS7S0100001_7.l0).onCompileProgress(aqS7S0100001_7.f1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS7S0100001_7 aqS7S0100001_7) {
        C67996QmO c67996QmO = ((C43422H2k) aqS7S0100001_7.l0).LJIILJJIL;
        if (c67996QmO == null) {
            o.LJIJI("nodeCallback");
            throw null;
        }
        c67996QmO.LIZIZ(new C41855Gbj(aqS7S0100001_7.f1), EnumC43531H6p.OUTER);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS7S0100001_7 aqS7S0100001_7) {
        ((C43422H2k) aqS7S0100001_7.l0).LJIILIIL(aqS7S0100001_7.f1 * 100);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS7S0100001_7 aqS7S0100001_7) {
        C67996QmO c67996QmO = ((C43421H2j) aqS7S0100001_7.l0).LJIILLIIL;
        if (c67996QmO == null) {
            o.LJIJI("nodeCallback");
            throw null;
        }
        c67996QmO.LIZIZ(new C41855Gbj(aqS7S0100001_7.f1), EnumC43531H6p.OUTER);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS7S0100001_7 aqS7S0100001_7) {
        C43421H2j c43421H2j = (C43421H2j) aqS7S0100001_7.l0;
        float f = aqS7S0100001_7.f1;
        if (c43421H2j.LJJIII.getValue() == null) {
            C67996QmO c67996QmO = c43421H2j.LJIILLIIL;
            if (c67996QmO == null) {
                o.LJIJI("nodeCallback");
                throw null;
            }
            c67996QmO.LIZIZ(new C41855Gbj(f), EnumC43531H6p.OUTER);
        } else {
            C43366H0g c43366H0g = (C43366H0g) c43421H2j.LJJIII.getValue();
            if (c43366H0g != null) {
                C43366H0g.LIZ(c43366H0g, new AqS7S0100001_7(c43421H2j, f, 3));
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS7S0100001_7(C43421H2j c43421H2j, float f, int i) {
        super(0);
        this.$t = i;
        this.l0 = c43421H2j;
        this.f1 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS7S0100001_7(C43422H2k c43422H2k, float f, int i) {
        super(0);
        this.$t = i;
        this.l0 = c43422H2k;
        this.f1 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS7S0100001_7(InterfaceC44507HdP interfaceC44507HdP, float f, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC44507HdP;
        this.f1 = f;
    }
}
