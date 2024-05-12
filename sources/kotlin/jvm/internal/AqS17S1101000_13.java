package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.C16880lQ;
import X.C76800UCe;
import X.C77134UPa;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.SY4;
import X.UP3;
import X.UPK;
import X.UQ4;
import X.UZ1;
import X.UZ8;
import Y.ACListenerS33S0100000_13;

/* loaded from: classes14.dex */
public class AqS17S1101000_13 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(SY4 it) {
        o.LJIIIZ(it, "it");
        it.setButtonVariant(this.i2);
        it.setButtonSize(3);
        it.setText(this.s0);
        C16880lQ.LJJIZ(it, new ACListenerS33S0100000_13((InterfaceC65784Pro) this.l1, 116));
    }

    public final void invoke$1(SY4 it) {
        o.LJIIIZ(it, "it");
        it.setButtonVariant(this.i2);
        it.setButtonSize(3);
        it.setText(this.s0);
        C16880lQ.LJJIZ(it, new ACListenerS33S0100000_13((InterfaceC65784Pro) this.l1, 118));
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AqS17S1101000_13 aqS17S1101000_13, Object obj) {
        aqS17S1101000_13.invoke$0((SY4) obj);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AqS17S1101000_13 aqS17S1101000_13, Object obj) {
        aqS17S1101000_13.invoke$1((SY4) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS17S1101000_13 aqS17S1101000_13, Object it) {
        o.LJIIIZ(it, "it");
        UZ1.LJ(aqS17S1101000_13.s0, (UZ8) aqS17S1101000_13.l1, aqS17S1101000_13.i2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS17S1101000_13 aqS17S1101000_13, Object it) {
        o.LJIIIZ(it, "it");
        String str = aqS17S1101000_13.s0;
        UZ1.LJFF(aqS17S1101000_13.i2, (UZ8) aqS17S1101000_13.l1, str, "not_now");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS17S1101000_13 aqS17S1101000_13, Object it) {
        o.LJIIIZ(it, "it");
        UZ1.LJ(aqS17S1101000_13.s0, (UZ8) aqS17S1101000_13.l1, aqS17S1101000_13.i2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS17S1101000_13 aqS17S1101000_13, Object it) {
        String str;
        String LJII;
        o.LJIIIZ(it, "it");
        int i = aqS17S1101000_13.i2;
        int i2 = 2;
        if (i == 2) {
            str = "facebook";
        } else {
            str = "contact";
        }
        if (i == 2) {
            LJII = UQ4.LJIIIIZZ();
        } else {
            LJII = UQ4.LJII();
        }
        UQ4.LJ(aqS17S1101000_13.s0, "user", str, false, false, ((UPK) aqS17S1101000_13.l1).LJFF(), "on", LJII, C77134UPa.LIZ.LIZLLL(), null, 528);
        if (aqS17S1101000_13.i2 != 2) {
            i2 = 1;
        }
        ((UPK) aqS17S1101000_13.l1).LIZJ(i2);
        ((UPK) aqS17S1101000_13.l1).getClass();
        UPK.LJIIIZ();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS17S1101000_13 aqS17S1101000_13, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJII(UP3.LIZIZ(), new AqS8S1201000_4(actionGroup, aqS17S1101000_13.i2, aqS17S1101000_13.s0, (UPK) aqS17S1101000_13.l1, 3));
        actionGroup.LJIIIZ(UP3.LIZJ(), new AqS17S1101000_13(aqS17S1101000_13.i2, aqS17S1101000_13.s0, (UPK) aqS17S1101000_13.l1, 5));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS17S1101000_13(int i, int i2, String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(1);
        this.$t = interfaceC65784Pro;
        this.i2 = i;
        this.s0 = i2;
        this.l1 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS17S1101000_13(int i, String str, UPK upk, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.s0 = str;
        this.l1 = upk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS17S1101000_13(String str, UZ8 uz8, int i, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.l1 = uz8;
        this.i2 = i;
    }
}
