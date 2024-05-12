package Y;

import X.C35794E3a;
import X.C61031NxL;
import X.C73140SnA;
import X.C73918Szi;
import X.C73919Szj;
import X.C73920Szk;
import X.C73923Szn;
import X.C73924Szo;
import X.InterfaceC48038ItG;
import X.OSZ;
import X.TBW;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class IDhS26S0300000_12 implements InterfaceC48038ItG {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(IDhS26S0300000_12 iDhS26S0300000_12, Object it) {
        o.LJIIJ(it, "it");
        return new C73140SnA(((TBW) iDhS26S0300000_12.l1).get(it));
    }

    public static final Object apply$1(IDhS26S0300000_12 iDhS26S0300000_12, Object obj) {
        C35794E3a cur = (C35794E3a) obj;
        o.LJIIJ(cur, "cur");
        Object invoke = ((C73920Szk) ((C73924Szo) ((IDhS105S0100000_12) iDhS26S0300000_12.l0).l0).LIZIZ).LIZJ.invoke(iDhS26S0300000_12.l1, cur.LIZ());
        if (!(!o.LJ(invoke, r3))) {
            invoke = null;
        }
        return new OSZ(iDhS26S0300000_12.l2, invoke);
    }

    public static final Object apply$2(IDhS26S0300000_12 iDhS26S0300000_12, Object obj) {
        OSZ osz = (OSZ) obj;
        o.LJIIJ(osz, "<name for destructuring parameter 0>");
        Object first = osz.getFirst();
        Object second = osz.getSecond();
        Object invoke = ((C73918Szi) ((C73923Szn) ((IDhS105S0100000_12) iDhS26S0300000_12.l0).l0).LIZIZ).LIZJ.invoke(iDhS26S0300000_12.l1, iDhS26S0300000_12.l2, second);
        C73919Szj.LIZLLL.getClass();
        if (C61031NxL.LIZ(invoke, second)) {
            invoke = null;
        }
        return new OSZ(first, invoke);
    }

    public IDhS26S0300000_12(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
