package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C0Q2;
import X.C10370av;
import X.C11P;
import X.C13O;
import X.C17N;
import X.C18810oX;
import X.C18830oZ;
import X.C1N0;
import X.C1ZD;
import X.C20140qg;
import X.C20160qi;
import X.C3T4;
import X.C76800UCe;
import X.EnumC18570o9;
import X.EnumC21450sn;
import X.InterfaceC274415w;
import X.InterfaceC78936UyS;
import X.InterfaceC88472Yns;
import com.google.android.play.core.appupdate.u;

/* loaded from: classes.dex */
public class IDqS0S0210000 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(IDqS0S0210000 iDqS0S0210000, Object obj) {
        C11P event = (C11P) obj;
        o.LJIIIZ(event, "event");
        C17N.LJI((C13O) iDqS0S0210000.l0, event);
        long LJJIJLIJ = u.LJJIJLIJ(event, false);
        event.LIZ();
        C3T4 c3t4 = (C3T4) iDqS0S0210000.l1;
        if (iDqS0S0210000.z2) {
            LJJIJLIJ = C10370av.LJII(-1.0f, LJJIJLIJ);
        }
        c3t4.LJIILLIIL(new C1N0(LJJIJLIJ));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS0S0210000 iDqS0S0210000, Object obj) {
        InterfaceC274415w it = (InterfaceC274415w) obj;
        o.LJIIIZ(it, "it");
        C18810oX c18810oX = (C18810oX) iDqS0S0210000.l0;
        c18810oX.LJI = it;
        if (iDqS0S0210000.z2) {
            if (c18810oX.LIZ() == EnumC18570o9.Selection) {
                if (((C18810oX) iDqS0S0210000.l0).LJIIJ) {
                    ((C20140qg) iDqS0S0210000.l1).LJIILIIL();
                } else {
                    ((C20140qg) iDqS0S0210000.l1).LJIIJ();
                }
                ((C18810oX) iDqS0S0210000.l0).LJIIJJI.setValue(Boolean.valueOf(C20160qi.LIZIZ((C20140qg) iDqS0S0210000.l1, true)));
                ((C18810oX) iDqS0S0210000.l0).LJIIL.setValue(Boolean.valueOf(C20160qi.LIZIZ((C20140qg) iDqS0S0210000.l1, false)));
            } else if (((C18810oX) iDqS0S0210000.l0).LIZ() == EnumC18570o9.Cursor) {
                ((C18810oX) iDqS0S0210000.l0).LJIILIIL.setValue(Boolean.valueOf(C20160qi.LIZIZ((C20140qg) iDqS0S0210000.l1, true)));
            }
        }
        C18830oZ LIZJ = ((C18810oX) iDqS0S0210000.l0).LIZJ();
        if (LIZJ != null) {
            LIZJ.LIZIZ = it;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS0S0210000 iDqS0S0210000, Object obj) {
        EnumC21450sn it = (EnumC21450sn) obj;
        o.LJIIIZ(it, "it");
        return new C1ZD(it, (C0Q2) iDqS0S0210000.l0, iDqS0S0210000.z2, (InterfaceC88472Yns) iDqS0S0210000.l1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS0S0210000(C0Q2 c0q2, InterfaceC88472Yns interfaceC88472Yns, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0q2;
        this.z2 = false;
        this.l1 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS0S0210000(C18810oX c18810oX, boolean z, C20140qg c20140qg, int i) {
        super(1);
        this.$t = i;
        this.l0 = c18810oX;
        this.z2 = z;
        this.l1 = c20140qg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS0S0210000(C13O c13o, InterfaceC78936UyS interfaceC78936UyS, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c13o;
        this.l1 = interfaceC78936UyS;
        this.z2 = z;
    }
}
