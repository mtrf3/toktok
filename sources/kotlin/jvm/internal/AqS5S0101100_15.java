package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C30941Ji;
import X.C538229i;
import X.C76800UCe;
import X.C78966Uyw;
import X.C84459XCt;
import X.C84460XCu;
import X.InterfaceC65784Pro;
import X.InterfaceC84461XCv;
import X.ORZ;
import X.XCL;
import X.XCM;
import X.XCP;
import X.XCV;
import X.XDR;
import com.ss.ugc.effectplatform.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes16.dex */
public class AqS5S0101100_15 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i1;
    public long j2;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS5S0101100_15 aqS5S0101100_15) {
        String LJIL;
        C538229i<XCP> c538229i;
        XCL xcl = ((XCV) aqS5S0101100_15.l0).LIZ;
        XCM xcm = xcl.LJIILIIL.LJJIZ;
        Effect effect = xcl.LJIIL;
        int i = aqS5S0101100_15.i1;
        long j = aqS5S0101100_15.j2;
        xcm.getClass();
        if (effect != null && (LJIL = C78966Uyw.LJIL(effect)) != null && (c538229i = XCM.LIZIZ.get(LJIL)) != null) {
            Iterator<XCP> it = c538229i.iterator();
            while (it.hasNext()) {
                it.next().onProgress(effect, i, j);
            }
        }
        XCL xcl2 = ((XCV) aqS5S0101100_15.l0).LIZ;
        XDR LIZ = xcl2.LJIILIIL.LJJJ.LIZ(xcl2.LJIILJJIL);
        if (!(LIZ instanceof XCP)) {
            LIZ = null;
        }
        XCP xcp = (XCP) LIZ;
        if (xcp != null) {
            xcp.onProgress(((XCV) aqS5S0101100_15.l0).LIZ.LJIIL, aqS5S0101100_15.i1, aqS5S0101100_15.j2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS5S0101100_15 aqS5S0101100_15) {
        C84459XCt c84459XCt = (C84459XCt) aqS5S0101100_15.l0;
        XDR LIZ = c84459XCt.LJI.LJJJ.LIZ(c84459XCt.LJIIIIZZ);
        List list = null;
        if (!(LIZ instanceof InterfaceC84461XCv)) {
            LIZ = null;
        }
        InterfaceC84461XCv interfaceC84461XCv = (InterfaceC84461XCv) LIZ;
        if (interfaceC84461XCv != null) {
            interfaceC84461XCv.onProgress(((C84459XCt) aqS5S0101100_15.l0).LJII, aqS5S0101100_15.i1, aqS5S0101100_15.j2);
        }
        C30941Ji c30941Ji = C84459XCt.LJIIIZ;
        c30941Ji.LIZIZ();
        try {
            ArrayList<InterfaceC84461XCv> arrayList = C84459XCt.LJIIJ.get(((C84459XCt) aqS5S0101100_15.l0).LJII.getId());
            if (arrayList != null) {
                list = ORZ.LLJILJILJ(arrayList);
            }
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((InterfaceC84461XCv) it.next()).onProgress(((C84459XCt) aqS5S0101100_15.l0).LJII, aqS5S0101100_15.i1, aqS5S0101100_15.j2);
                }
            }
            return C76800UCe.LIZ;
        } finally {
            c30941Ji.LIZLLL();
        }
    }

    public static final Object invoke$2(AqS5S0101100_15 aqS5S0101100_15) {
        C84460XCu c84460XCu = (C84460XCu) aqS5S0101100_15.l0;
        XDR LIZ = c84460XCu.LJI.LJJJ.LIZ(c84460XCu.LJIIIIZZ);
        if (!(LIZ instanceof InterfaceC84461XCv)) {
            LIZ = null;
        }
        InterfaceC84461XCv interfaceC84461XCv = (InterfaceC84461XCv) LIZ;
        if (interfaceC84461XCv != null) {
            interfaceC84461XCv.onProgress(((C84460XCu) aqS5S0101100_15.l0).LJII, aqS5S0101100_15.i1, aqS5S0101100_15.j2);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS5S0101100_15(XCV xcv, int i, long j, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = xcv;
        this.i1 = i;
        this.j2 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS5S0101100_15(C84459XCt c84459XCt, int i, long j, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c84459XCt;
        this.i1 = i;
        this.j2 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS5S0101100_15(C84460XCu c84460XCu, int i, long j, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c84460XCu;
        this.i1 = i;
        this.j2 = j;
    }
}
