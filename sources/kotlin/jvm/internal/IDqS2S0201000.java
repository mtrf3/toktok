package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AnonymousClass057;
import X.C03720Cq;
import X.C04Q;
import X.C07160Pw;
import X.C07730Sb;
import X.C08370Un;
import X.C08410Ur;
import X.C08440Uu;
import X.C09290Yb;
import X.C0MC;
import X.C0SZ;
import X.C0YW;
import X.C0YX;
import X.C0YY;
import X.C10320aq;
import X.C11490cj;
import X.C18490o1;
import X.C18550o7;
import X.C18730oP;
import X.C1DF;
import X.C1DJ;
import X.C1QN;
import X.C1QP;
import X.C1RG;
import X.C20140qg;
import X.C21350sd;
import X.C21380sg;
import X.C21430sl;
import X.C21560sy;
import X.C23360vs;
import X.C24410xZ;
import X.C24620xu;
import X.C24830yF;
import X.C31621Ly;
import X.C32301Oo;
import X.C32391Ox;
import X.C32411Oz;
import X.C32541Pm;
import X.C40431iJ;
import X.C45211q1;
import X.C46041rM;
import X.C51071zT;
import X.C56509MFt;
import X.C76800UCe;
import X.C78929UyL;
import X.InterfaceC015404g;
import X.InterfaceC03730Cr;
import X.InterfaceC07760Se;
import X.InterfaceC07790Sh;
import X.InterfaceC09320Ye;
import X.InterfaceC09420Yo;
import X.InterfaceC24420xa;
import X.InterfaceC24520xk;
import X.InterfaceC273215k;
import X.InterfaceC32551Pn;
import X.InterfaceC33691Tx;
import X.InterfaceC536028m;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.V1I;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class IDqS2S0201000 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case 9:
                return invoke$9(this, obj, obj2);
            case 10:
                return invoke$10(this, obj, obj2);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj, obj2);
            case 12:
                return invoke$12(this, obj, obj2);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj, obj2);
            case 17:
                return invoke$17(this, obj, obj2);
            case 18:
                return invoke$18(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(IDqS2S0201000 iDqS2S0201000, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C04Q.LIZ((C45211q1) iDqS2S0201000.l0, (InterfaceC88471Ynr) iDqS2S0201000.l1, (InterfaceC24520xk) obj, iDqS2S0201000.i2 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS2S0201000 iDqS2S0201000, Object obj, Object obj2) {
        InterfaceC24520xk nc = (InterfaceC24520xk) obj;
        ((Number) obj2).intValue();
        o.LJIIIZ(nc, "nc");
        ((C40431iJ) iDqS2S0201000.l0).LJ(iDqS2S0201000.l1, nc, iDqS2S0201000.i2 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(IDqS2S0201000 iDqS2S0201000, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !interfaceC24520xk.LIZ()) {
            if (((InterfaceC88471Ynr) iDqS2S0201000.l0) == null) {
                interfaceC24520xk.LJJIIJ(1275643833);
                C18490o1.LIZIZ((InterfaceC07790Sh) iDqS2S0201000.l1, interfaceC24520xk, (iDqS2S0201000.i2 >> 3) & 14);
                interfaceC24520xk.LJJIJIIJIL();
            } else {
                interfaceC24520xk.LJJIIJ(1275643903);
                ((InterfaceC88471Ynr) iDqS2S0201000.l0).invoke(interfaceC24520xk, Integer.valueOf((iDqS2S0201000.i2 >> 6) & 14));
                interfaceC24520xk.LJJIJIIJIL();
            }
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(IDqS2S0201000 iDqS2S0201000, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !interfaceC24520xk.LIZ()) {
            C18550o7.LIZ((C08440Uu) iDqS2S0201000.l0, (List) iDqS2S0201000.l1, interfaceC24520xk, (iDqS2S0201000.i2 & 14) | 64);
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(IDqS2S0201000 iDqS2S0201000, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C18550o7.LIZ((C08440Uu) iDqS2S0201000.l0, (List) iDqS2S0201000.l1, (InterfaceC24520xk) obj, iDqS2S0201000.i2 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(IDqS2S0201000 iDqS2S0201000, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C18730oP.LIZ((C20140qg) iDqS2S0201000.l0, (InterfaceC88471Ynr) iDqS2S0201000.l1, (InterfaceC24520xk) obj, iDqS2S0201000.i2 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(IDqS2S0201000 iDqS2S0201000, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !interfaceC24520xk.LIZ()) {
            C21430sl.LIZ(((C21560sy) iDqS2S0201000.l0).LJIIIIZZ, C1DJ.LJ(interfaceC24520xk, 181426554, new IDqS11S0101000(iDqS2S0201000.i2, (InterfaceC88471Ynr) iDqS2S0201000.l1, 9)), interfaceC24520xk, 48);
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(IDqS2S0201000 iDqS2S0201000, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C21430sl.LIZ((C08370Un) iDqS2S0201000.l0, (InterfaceC88471Ynr) iDqS2S0201000.l1, (InterfaceC24520xk) obj, iDqS2S0201000.i2 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(IDqS2S0201000 iDqS2S0201000, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !interfaceC24520xk.LIZ()) {
            InterfaceC07790Sh LIZLLL = C09290Yb.LIZLLL(InterfaceC07790Sh.LJJJI, C21380sg.LIZIZ, C21380sg.LIZJ);
            InterfaceC09420Yo paddingValues = (InterfaceC09420Yo) iDqS2S0201000.l0;
            o.LJIIIZ(LIZLLL, "<this>");
            o.LJIIIZ(paddingValues, "paddingValues");
            InterfaceC07790Sh LLLIIIL = LIZLLL.LLLIIIL(new C51071zT(paddingValues));
            C32301Oo c32301Oo = C0YW.LJ;
            InterfaceC07760Se.LJJJ.getClass();
            C31621Ly c31621Ly = C07730Sb.LJIIJJI;
            InterfaceC88473Ynt interfaceC88473Ynt = (InterfaceC88473Ynt) iDqS2S0201000.l1;
            int i = ((iDqS2S0201000.i2 >> 18) & 7168) | 432;
            interfaceC24520xk.LJJIIJ(693286680);
            InterfaceC273215k LIZ = C0YX.LIZ(c32301Oo, c31621Ly, interfaceC24520xk);
            interfaceC24520xk.LJJIIJ(-1323940314);
            Object LJIILLIIL = interfaceC24520xk.LJIILLIIL(AnonymousClass057.LJ);
            Object LJIILLIIL2 = interfaceC24520xk.LJIILLIIL(AnonymousClass057.LJIIJ);
            InterfaceC015404g interfaceC015404g = (InterfaceC015404g) interfaceC24520xk.LJIILLIIL(AnonymousClass057.LJIILJJIL);
            InterfaceC03730Cr.LJ.getClass();
            C46041rM c46041rM = C03720Cq.LIZIZ;
            C40431iJ LJIIL = C56509MFt.LJIIL(LLLIIIL);
            int i2 = ((((i << 3) & 112) << 9) & 7168) | 6;
            if (interfaceC24520xk.LJJ() instanceof InterfaceC24420xa) {
                interfaceC24520xk.LJIJI();
                if (interfaceC24520xk.LJIJJLI()) {
                    interfaceC24520xk.LJJI(c46041rM);
                } else {
                    interfaceC24520xk.LIZIZ();
                }
                interfaceC24520xk.LJJIIZI();
                C24830yF.LIZ(interfaceC24520xk, LIZ, C03720Cq.LJ);
                C24830yF.LIZ(interfaceC24520xk, LJIILLIIL, C03720Cq.LIZLLL);
                C24830yF.LIZ(interfaceC24520xk, LJIILLIIL2, C03720Cq.LJFF);
                LJIIL.invoke(V1I.LIZIZ(interfaceC24520xk, interfaceC015404g, C03720Cq.LJI, interfaceC24520xk), interfaceC24520xk, Integer.valueOf((i2 >> 3) & 112));
                interfaceC24520xk.LJJIIJ(2058660585);
                interfaceC24520xk.LJJIIJ(-678309503);
                if (((i2 >> 9) & 14 & 11) != 2 || !interfaceC24520xk.LIZ()) {
                    interfaceC88473Ynt.invoke(C32391Ox.LIZ, interfaceC24520xk, Integer.valueOf(((i >> 6) & 112) | 6));
                } else {
                    interfaceC24520xk.LIZLLL();
                }
                interfaceC24520xk.LJJIJIIJIL();
                interfaceC24520xk.LJJIJIIJIL();
                interfaceC24520xk.LJIJ();
                interfaceC24520xk.LJJIJIIJIL();
                interfaceC24520xk.LJJIJIIJIL();
            } else {
                C78929UyL.LJIILJJIL();
                throw null;
            }
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(IDqS2S0201000 iDqS2S0201000, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !interfaceC24520xk.LIZ()) {
            C21430sl.LIZ(C21350sd.LIZJ(interfaceC24520xk).LJIIJ, C1DJ.LJ(interfaceC24520xk, -630330208, new IDqS2S0201000((InterfaceC09420Yo) iDqS2S0201000.l0, (InterfaceC09420Yo) iDqS2S0201000.l1, (InterfaceC88473Ynt<? super C0YY, ? super InterfaceC24520xk, ? super Integer, C76800UCe>) iDqS2S0201000.i2, 16)), interfaceC24520xk, 48);
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(IDqS2S0201000 iDqS2S0201000, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C24620xu[] c24620xuArr = (C24620xu[]) iDqS2S0201000.l0;
        C24410xZ.LIZ((C24620xu[]) Arrays.copyOf(c24620xuArr, c24620xuArr.length), (InterfaceC88471Ynr) iDqS2S0201000.l1, (InterfaceC24520xk) obj, iDqS2S0201000.i2 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS2S0201000 iDqS2S0201000, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((C07160Pw) iDqS2S0201000.l0).LIZ(iDqS2S0201000.l1, (InterfaceC24520xk) obj, iDqS2S0201000.i2 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS2S0201000 iDqS2S0201000, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((C07160Pw) iDqS2S0201000.l0).LJIIIIZZ(iDqS2S0201000.l1, (InterfaceC24520xk) obj, iDqS2S0201000.i2 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS2S0201000 iDqS2S0201000, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C0SZ.LIZ((InterfaceC07790Sh) iDqS2S0201000.l0, (InterfaceC88472Yns) iDqS2S0201000.l1, (InterfaceC24520xk) obj, iDqS2S0201000.i2 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS2S0201000 iDqS2S0201000, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !interfaceC24520xk.LIZ()) {
            ((InterfaceC88473Ynt) iDqS2S0201000.l0).invoke((C32411Oz) iDqS2S0201000.l1, interfaceC24520xk, Integer.valueOf((iDqS2S0201000.i2 >> 6) & 112));
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [X.1Oz] */
    public static final Object invoke$6(IDqS2S0201000 iDqS2S0201000, Object obj, Object obj2) {
        final InterfaceC536028m SubcomposeLayout = (InterfaceC536028m) obj;
        final long j = ((C23360vs) obj2).LIZ;
        o.LJIIIZ(SubcomposeLayout, "$this$SubcomposeLayout");
        return ((InterfaceC273215k) iDqS2S0201000.l0).LIZJ(SubcomposeLayout, SubcomposeLayout.LJJJJL(C76800UCe.LIZ, C1DJ.LJFF(new IDqS2S0201000((InterfaceC88473Ynt) iDqS2S0201000.l1, (InterfaceC88473Ynt<? super InterfaceC09320Ye, ? super InterfaceC24520xk, ? super Integer, C76800UCe>) new InterfaceC09320Ye(SubcomposeLayout, j) { // from class: X.1Oz
            public final InterfaceC23370vt LIZ;
            public final long LIZIZ;

            @Override // X.InterfaceC09320Ye
            public final float LIZ() {
                return this.LIZ.LJJJLL(C23360vs.LJIIIIZZ(this.LIZIZ));
            }

            @Override // X.InterfaceC09320Ye
            public final float LIZIZ() {
                InterfaceC23370vt interfaceC23370vt = this.LIZ;
                if (C23360vs.LIZLLL(this.LIZIZ)) {
                    return interfaceC23370vt.LJJJLL(C23360vs.LJII(this.LIZIZ));
                }
                return Float.POSITIVE_INFINITY;
            }

            public final int hashCode() {
                return C16880lQ.LLJIJIL(this.LIZIZ) + (this.LIZ.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("BoxWithConstraintsScopeImpl(density=");
                LIZ.append(this.LIZ);
                LIZ.append(", constraints=");
                LIZ.append((Object) C23360vs.LJIIJ(this.LIZIZ));
                LIZ.append(')');
                return X1D.LIZIZ(LIZ);
            }

            @Override // X.InterfaceC09320Ye
            public final long LIZJ() {
                return this.LIZIZ;
            }

            public final boolean equals(Object obj3) {
                if (this == obj3) {
                    return true;
                }
                if (!(obj3 instanceof C32411Oz)) {
                    return false;
                }
                C32411Oz c32411Oz = (C32411Oz) obj3;
                if (o.LJ(this.LIZ, c32411Oz.LIZ) && C23360vs.LIZIZ(this.LIZIZ, c32411Oz.LIZIZ)) {
                    return true;
                }
                return false;
            }

            {
                this.LIZ = SubcomposeLayout;
                this.LIZIZ = j;
            }
        }, (C32411Oz) iDqS2S0201000.i2, 5), -1945019079, true)), j);
    }

    public static final Object invoke$7(IDqS2S0201000 iDqS2S0201000, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C10320aq.LIZIZ((InterfaceC32551Pn) iDqS2S0201000.l0, (C32541Pm) iDqS2S0201000.l1, (InterfaceC24520xk) obj, iDqS2S0201000.i2 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(IDqS2S0201000 iDqS2S0201000, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C11490cj.LIZIZ((C1QN) iDqS2S0201000.l0, (C1QP) iDqS2S0201000.l1, (InterfaceC24520xk) obj, iDqS2S0201000.i2 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(IDqS2S0201000 iDqS2S0201000, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !interfaceC24520xk.LIZ()) {
            C1RG c1rg = (C1RG) iDqS2S0201000.l0;
            c1rg.LIZIZ.setValue(C1DF.LJJIJ(interfaceC24520xk));
            ((InterfaceC88473Ynt) iDqS2S0201000.l1).invoke((C1RG) iDqS2S0201000.l0, interfaceC24520xk, Integer.valueOf(((iDqS2S0201000.i2 << 3) & 112) | 8));
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS2S0201000(C07160Pw c07160Pw, C07160Pw<S> c07160Pw2, S s, int i) {
        super(2);
        this.$t = i;
        this.l0 = c07160Pw;
        this.l1 = c07160Pw2;
        this.i2 = s;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS2S0201000(InterfaceC07790Sh interfaceC07790Sh, InterfaceC07790Sh interfaceC07790Sh2, InterfaceC88472Yns<? super InterfaceC33691Tx, C76800UCe> interfaceC88472Yns, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC07790Sh;
        this.l1 = interfaceC07790Sh2;
        this.i2 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS2S0201000(C08370Un c08370Un, C08370Un c08370Un2, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, int i) {
        super(2);
        this.$t = i;
        this.l0 = c08370Un;
        this.l1 = c08370Un2;
        this.i2 = interfaceC88471Ynr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS2S0201000(C08440Uu c08440Uu, C08440Uu c08440Uu2, List<C08410Ur<InterfaceC88473Ynt<String, InterfaceC24520xk, Integer, C76800UCe>>> list, int i) {
        super(2);
        this.$t = i;
        this.l0 = c08440Uu;
        this.l1 = c08440Uu2;
        this.i2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS2S0201000(InterfaceC09420Yo interfaceC09420Yo, InterfaceC09420Yo interfaceC09420Yo2, InterfaceC88473Ynt<? super C0YY, ? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88473Ynt, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC09420Yo;
        this.l1 = interfaceC09420Yo2;
        this.i2 = interfaceC88473Ynt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS2S0201000(C20140qg c20140qg, C20140qg c20140qg2, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, int i) {
        super(2);
        this.$t = i;
        this.l0 = c20140qg;
        this.l1 = c20140qg2;
        this.i2 = interfaceC88471Ynr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS2S0201000(C21560sy c21560sy, C21560sy c21560sy2, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, int i) {
        super(2);
        this.$t = i;
        this.l0 = c21560sy;
        this.l1 = c21560sy2;
        this.i2 = interfaceC88471Ynr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS2S0201000(InterfaceC273215k interfaceC273215k, InterfaceC273215k interfaceC273215k2, InterfaceC88473Ynt<? super InterfaceC09320Ye, ? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88473Ynt, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC273215k;
        this.l1 = interfaceC273215k2;
        this.i2 = interfaceC88473Ynt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS2S0201000(InterfaceC32551Pn interfaceC32551Pn, C32541Pm c32541Pm, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = interfaceC32551Pn;
        this.l1 = c32541Pm;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS2S0201000(C1QN c1qn, C1QP c1qp, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c1qn;
        this.l1 = c1qp;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS2S0201000(C1RG c1rg, C1RG c1rg2, InterfaceC88473Ynt<? super C0MC, ? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88473Ynt, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1rg;
        this.l1 = c1rg2;
        this.i2 = interfaceC88473Ynt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS2S0201000(C40431iJ c40431iJ, Object obj, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c40431iJ;
        this.l1 = obj;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS2S0201000(C45211q1 c45211q1, C45211q1 c45211q12, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, int i) {
        super(2);
        this.$t = i;
        this.l0 = c45211q1;
        this.l1 = c45211q12;
        this.i2 = interfaceC88471Ynr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS2S0201000(InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr2, InterfaceC07790Sh interfaceC07790Sh, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC88471Ynr;
        this.l1 = interfaceC88471Ynr2;
        this.i2 = interfaceC07790Sh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS2S0201000(InterfaceC88473Ynt interfaceC88473Ynt, InterfaceC88473Ynt<? super InterfaceC09320Ye, ? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88473Ynt2, C32411Oz c32411Oz, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC88473Ynt;
        this.l1 = interfaceC88473Ynt2;
        this.i2 = c32411Oz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS2S0201000(C24620xu[] c24620xuArr, C24620xu<?>[] c24620xuArr2, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, int i) {
        super(2);
        this.$t = i;
        this.l0 = c24620xuArr;
        this.l1 = c24620xuArr2;
        this.i2 = interfaceC88471Ynr;
    }
}
