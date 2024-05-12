package kotlin.jvm.internal;

import X.A90;
import X.AbstractC65781Prl;
import X.AlertDialogC45239HpD;
import X.C41082GAk;
import X.C41988Gds;
import X.C42278GiY;
import X.C43544H7c;
import X.C45054HmE;
import X.C45057HmH;
import X.C45220Hou;
import X.C45237HpB;
import X.C45254HpS;
import X.C76800UCe;
import X.H1U;
import X.H7O;
import X.I9X;
import X.InterfaceC41084GAm;
import X.InterfaceC45213Hon;
import X.InterfaceC65784Pro;
import X.X1D;
import android.app.ProgressDialog;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.advertiser.AdvertiserModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.Locale;

/* loaded from: classes8.dex */
public class AqS107S0101000_7 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i1;
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
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case 9:
                return invoke$9(this);
            case 10:
                return invoke$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS107S0101000_7 aqS107S0101000_7) {
        ((C45054HmE) aqS107S0101000_7.l0).LLLLLL(aqS107S0101000_7.i1);
        C45057HmH c45057HmH = ((C45054HmE) aqS107S0101000_7.l0).LLJJIJIL;
        if (c45057HmH != null) {
            c45057HmH.LIZIZ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS107S0101000_7 aqS107S0101000_7) {
        C43544H7c c43544H7c = (C43544H7c) aqS107S0101000_7.l0;
        int i = c43544H7c.LJIIIZ;
        int i2 = aqS107S0101000_7.i1;
        if (i != i2) {
            c43544H7c.LJIIIZ = i2;
            C42278GiY c42278GiY = c43544H7c.LJ;
            if (c42278GiY != null && c42278GiY.isShowing()) {
                c42278GiY.updateProgress(Math.min(((C43544H7c) aqS107S0101000_7.l0).LJIIIZ, 100));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS107S0101000_7 aqS107S0101000_7) {
        InterfaceC45213Hon LJIJJ = ((C45220Hou) aqS107S0101000_7.l0).LJIJJ();
        if (LJIJJ != null) {
            LJIJJ.fU(false, aqS107S0101000_7.i1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS107S0101000_7 aqS107S0101000_7) {
        ((A90) aqS107S0101000_7.l0).LIZLLL(aqS107S0101000_7.i1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS107S0101000_7 aqS107S0101000_7) {
        C43544H7c c43544H7c = (C43544H7c) aqS107S0101000_7.l0;
        c43544H7c.LJIIIZ += aqS107S0101000_7.i1;
        C42278GiY c42278GiY = c43544H7c.LJ;
        if (c42278GiY != null && c42278GiY.isShowing()) {
            c42278GiY.updateProgress(Math.min(((C43544H7c) aqS107S0101000_7.l0).LJIIIZ, 100));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS107S0101000_7 aqS107S0101000_7) {
        ((I9X) aqS107S0101000_7.l0).LLLJL(aqS107S0101000_7.i1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS107S0101000_7 aqS107S0101000_7) {
        H7O h7o = (H7O) aqS107S0101000_7.l0;
        int i = aqS107S0101000_7.i1;
        C42278GiY c42278GiY = h7o.LIZJ;
        if (c42278GiY != null && c42278GiY.isShowing()) {
            c42278GiY.updateProgress(Math.min(i, 100));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS107S0101000_7 aqS107S0101000_7) {
        C41082GAk c41082GAk = (C41082GAk) aqS107S0101000_7.l0;
        InterfaceC41084GAm interfaceC41084GAm = c41082GAk.LJLIL;
        int i = aqS107S0101000_7.i1;
        interfaceC41084GAm.LJLILLLLZI(i, (AdvertiserModel) ListProtector.get(c41082GAk.LJLILLLLZI, i));
        return Boolean.TRUE;
    }

    public static final Object invoke$6(AqS107S0101000_7 aqS107S0101000_7) {
        C41988Gds c41988Gds = (C41988Gds) aqS107S0101000_7.l0;
        c41988Gds.LJIIIIZZ += aqS107S0101000_7.i1;
        ProgressDialog progressDialog = c41988Gds.LJI;
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.setProgress(Math.min(((C41988Gds) aqS107S0101000_7.l0).LJIIIIZZ, 100));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS107S0101000_7 aqS107S0101000_7) {
        StringBuilder LIZ = X1D.LIZ();
        String lowerCase = ((H1U) aqS107S0101000_7.l0).name().toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        LIZ.append(lowerCase);
        LIZ.append(": ");
        LIZ.append(aqS107S0101000_7.i1);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$8(AqS107S0101000_7 aqS107S0101000_7) {
        AlertDialogC45239HpD LJIJJ = ((C45237HpB) aqS107S0101000_7.l0).LJIJJ();
        if (LJIJJ != null) {
            LJIJJ.LIZLLL(aqS107S0101000_7.i1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS107S0101000_7 aqS107S0101000_7) {
        ((C45254HpS) aqS107S0101000_7.l0).LIZLLL.setProgress(aqS107S0101000_7.i1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0101000_7(A90 a90, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = a90;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0101000_7(C41082GAk c41082GAk, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c41082GAk;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0101000_7(C41988Gds c41988Gds, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c41988Gds;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0101000_7(H1U h1u, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = h1u;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0101000_7(H7O h7o, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = h7o;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0101000_7(C43544H7c c43544H7c, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c43544H7c;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0101000_7(C45054HmE c45054HmE, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c45054HmE;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0101000_7(C45220Hou c45220Hou, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c45220Hou;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0101000_7(C45237HpB c45237HpB, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c45237HpB;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0101000_7(C45254HpS c45254HpS, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c45254HpS;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0101000_7(I9X i9x, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = i9x;
        this.i1 = i;
    }
}
