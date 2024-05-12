package kotlin.jvm.internal;

import X.AbstractC60240Nka;
import X.AbstractC65781Prl;
import X.C60219NkF;
import X.C60222NkI;
import X.C60223NkJ;
import X.C76800UCe;
import X.F21;
import X.F3T;
import X.InterfaceC40516FvE;
import X.InterfaceC60201Njx;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.X1D;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class AqS1S0800000_10 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public Object l7;

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

    public static final Object invoke$0(AqS1S0800000_10 aqS1S0800000_10, Object obj) {
        C60222NkI unit = (C60222NkI) obj;
        o.LJIIJ(unit, "unit");
        C60223NkJ c60223NkJ = (C60223NkJ) unit.LJLILLLLZI.LIZJ(C60223NkJ.class);
        if (c60223NkJ != null) {
            InterfaceC40516FvE interfaceC40516FvE = c60223NkJ.LJLIL;
            if ((interfaceC40516FvE instanceof AbstractC60240Nka) && interfaceC40516FvE != null) {
                ((ArrayList) ((AbstractC60240Nka) interfaceC40516FvE).LJLLLL).add(new AqS176S0100000_10(aqS1S0800000_10, 151));
            }
            ((InterfaceC88473Ynt) aqS1S0800000_10.l6).invoke(c60223NkJ.LJLIL, unit.LJLIL, Boolean.valueOf(c60223NkJ.LJLILLLLZI));
        } else {
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS1S0800000_10.l7;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("No result resolved for uri ");
            LIZ.append((Uri) aqS1S0800000_10.l1);
            interfaceC88472Yns.invoke(new IllegalStateException(X1D.LIZIZ(LIZ)));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS1S0800000_10 aqS1S0800000_10, Object obj) {
        Throwable throwable = (Throwable) obj;
        o.LJIIJ(throwable, "throwable");
        ((C60219NkF) aqS1S0800000_10.l0).LIZIZ(throwable, (Uri) aqS1S0800000_10.l1, (F3T) aqS1S0800000_10.l2, (InterfaceC60201Njx) aqS1S0800000_10.l3, (F21) aqS1S0800000_10.l4, (List) aqS1S0800000_10.l5, (InterfaceC88473Ynt) aqS1S0800000_10.l6, (InterfaceC88472Yns) aqS1S0800000_10.l7);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S0800000_10(C60219NkF c60219NkF, Uri uri, F3T f3t, InterfaceC60201Njx interfaceC60201Njx, F21 f21, List list, InterfaceC88473Ynt interfaceC88473Ynt, InterfaceC88472Yns interfaceC88472Yns, int i) {
        super(1);
        this.$t = i;
        this.l0 = c60219NkF;
        this.l1 = uri;
        this.l2 = f3t;
        this.l3 = interfaceC60201Njx;
        this.l4 = f21;
        this.l5 = list;
        this.l6 = interfaceC88473Ynt;
        this.l7 = interfaceC88472Yns;
    }
}
