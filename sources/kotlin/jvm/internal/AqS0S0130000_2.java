package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C132045Ge;
import X.C135125Sa;
import X.C169236kZ;
import X.C169406kq;
import X.C5F9;
import X.C5LF;
import X.C5LI;
import X.C76800UCe;
import X.InterfaceC143855kj;
import X.InterfaceC153275zv;
import X.InterfaceC169246ka;
import X.InterfaceC65784Pro;
import Y.ARunnableS38S0100000_2;

/* loaded from: classes3.dex */
public class AqS0S0130000_2 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public boolean z1;
    public boolean z2;
    public boolean z3;

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

    public static final Object invoke$0(AqS0S0130000_2 aqS0S0130000_2) {
        if (aqS0S0130000_2.z1) {
            InterfaceC169246ka LLFFF = ((C169236kZ) aqS0S0130000_2.l0).LLFFF();
            final boolean z = aqS0S0130000_2.z2;
            final C169236kZ c169236kZ = (C169236kZ) aqS0S0130000_2.l0;
            final boolean z2 = aqS0S0130000_2.z3;
            LLFFF.s(new C5F9() { // from class: X.6kb
                @Override // X.C5F9
                public final void LIZIZ() {
                }

                @Override // X.C5F9
                public final void LIZ() {
                    if (z) {
                        c169236kZ.LLIFFJFJJ().LLJLLL(C169396kp.LJLIL);
                    }
                    if (z2) {
                        c169236kZ.LLIIIL().uT();
                    }
                    C1DH.LJJIJIIJI(new ARunnableS38S0100000_2(c169236kZ, 53));
                }
            });
        } else {
            if (aqS0S0130000_2.z2) {
                ((C169236kZ) aqS0S0130000_2.l0).LLIFFJFJJ().LLJLLL(C169406kq.LJLIL);
            }
            if (aqS0S0130000_2.z3) {
                ((C169236kZ) aqS0S0130000_2.l0).LLIIIL().uT();
            }
            ((C169236kZ) aqS0S0130000_2.l0).LJLZ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S0130000_2 aqS0S0130000_2) {
        String str;
        if (aqS0S0130000_2.z1) {
            InterfaceC153275zv LJZI = ((C5LF) aqS0S0130000_2.l0).LJZI();
            if (LJZI != null) {
                LJZI.refresh();
            }
            InterfaceC143855kj LLIIZ = ((C5LF) aqS0S0130000_2.l0).LLIIZ();
            if (LLIIZ != null) {
                LLIIZ.notifyMusicChange();
            }
            C132045Ge c132045Ge = ((C5LF) aqS0S0130000_2.l0).LJLZ;
            if (c132045Ge != null) {
                str = c132045Ge.getEnterFrom();
            } else {
                str = null;
            }
            if (o.LJ(str, "enter_from_album_editor_pro_entrance") && aqS0S0130000_2.z2) {
                if (!C135125Sa.LIZ().getBoolean("entranceTipsShown", false)) {
                    InterfaceC153275zv LJZI2 = ((C5LF) aqS0S0130000_2.l0).LJZI();
                    if (LJZI2 != null) {
                        LJZI2.VH(15, true, new AqS152S0100000_2((C5LF) aqS0S0130000_2.l0, 599));
                    }
                } else {
                    C5LI LJLJLJ = ((C5LF) aqS0S0130000_2.l0).LJLJLJ();
                    if (LJLJLJ != null) {
                        LJLJLJ.ms(true);
                    }
                }
            }
        }
        ((C5LF) aqS0S0130000_2.l0).LJLZ().Kg();
        ((C5LF) aqS0S0130000_2.l0).LJLZ().dv(true);
        if (aqS0S0130000_2.z2 && aqS0S0130000_2.z3) {
            ((C5LF) aqS0S0130000_2.l0).LLJI();
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S0130000_2(boolean z, C5LF c5lf, boolean z2, boolean z3, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = c5lf;
        this.z2 = z2;
        this.z3 = z3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S0130000_2(boolean z, C169236kZ c169236kZ, boolean z2, boolean z3, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = c169236kZ;
        this.z2 = z2;
        this.z3 = z3;
    }
}
