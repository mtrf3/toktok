package Y;

import X.AbstractC63778P1i;
import X.C26045AKb;
import X.C3C5;
import X.C63804P2i;
import X.C76800UCe;
import X.C77150UPq;
import X.C77157UPx;
import X.C77159UPz;
import X.C77216USe;
import X.C77217USf;
import X.C77259UTv;
import X.C77260UTw;
import X.C77266UUc;
import X.EnumC77147UPn;
import X.EnumC77154UPu;
import X.InterfaceC64672gJ;
import X.InterfaceC65784Pro;
import X.InterfaceC67352kd;
import X.P1W;
import X.UQ0;
import X.USG;
import X.UTK;
import X.UU3;
import X.UU4;
import X.UU5;
import X.UU6;
import X.UUE;
import X.XJL;
import com.ss.android.ugc.aweme.setting.unit.privacy.FindCtxViewModel;
import com.ss.android.ugc.aweme.setting.unit.privacy.RemoveContactsUnit;
import com.ss.android.ugc.aweme.setting.unit.privacy.RemoveFBFriendsUnit;
import com.ss.android.ugc.aweme.setting.unit.privacy.RemoveMLBBFriendsUnit;
import com.zhiliaoapp.musically.R;

/* loaded from: classes14.dex */
public class IDfS133S0100000_13 implements InterfaceC64672gJ {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC64672gJ
    public final Object emit(C77216USe c77216USe, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        switch (this.$t) {
            case 0:
                return emit$0(this, c77216USe, interfaceC67352kd);
            case 1:
                return emit$1(this, c77216USe, interfaceC67352kd);
            case 2:
                return emit$2(this, c77216USe, interfaceC67352kd);
            case 3:
                return emit$3(this, c77216USe, interfaceC67352kd);
            case 4:
                return emit$4(this, c77216USe, interfaceC67352kd);
            case 5:
                return emit$5(this, c77216USe, interfaceC67352kd);
            case 6:
                return emit$6(this, c77216USe, interfaceC67352kd);
            case 7:
                return emit$7(this, c77216USe, interfaceC67352kd);
            case 8:
                return emit$8(this, c77216USe, interfaceC67352kd);
            default:
                return null;
        }
    }

    public IDfS133S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object emit$0(IDfS133S0100000_13 iDfS133S0100000_13, Object obj, InterfaceC67352kd interfaceC67352kd) {
        C77216USe c77216USe = (C77216USe) obj;
        if (c77216USe.LJLILLLLZI == UQ0.SYNC && c77216USe.LJLIL.LJLJI) {
            ((InterfaceC65784Pro) iDfS133S0100000_13.l0).invoke();
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$1(IDfS133S0100000_13 iDfS133S0100000_13, Object obj, InterfaceC67352kd interfaceC67352kd) {
        C77216USe c77216USe = (C77216USe) obj;
        if (USG.LIZ[c77216USe.LJLILLLLZI.ordinal()] == 1) {
            if (c77216USe.LJLIL.LJLJI) {
                XJL xjl = (XJL) iDfS133S0100000_13.l0;
                Boolean bool = Boolean.TRUE;
                C3C5.m7constructorimpl(bool);
                xjl.resumeWith(bool);
            } else {
                XJL xjl2 = (XJL) iDfS133S0100000_13.l0;
                Boolean bool2 = Boolean.FALSE;
                C3C5.m7constructorimpl(bool2);
                xjl2.resumeWith(bool2);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$2(IDfS133S0100000_13 iDfS133S0100000_13, Object obj, InterfaceC67352kd interfaceC67352kd) {
        C77216USe c77216USe = (C77216USe) obj;
        int i = C77159UPz.LIZ[c77216USe.LJLILLLLZI.ordinal()];
        if (i != 1) {
            if (i == 2 && c77216USe.LJLIL.LJLJI) {
                ((P1W) ((AbstractC63778P1i) ((C63804P2i) iDfS133S0100000_13.l0).LJIIJJI.getValue())).LJFF();
            }
        } else if (c77216USe.LJLIL.LJLJI) {
            ((C63804P2i) iDfS133S0100000_13.l0).LIZ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$3(IDfS133S0100000_13 iDfS133S0100000_13, Object obj, InterfaceC67352kd interfaceC67352kd) {
        C77216USe c77216USe = (C77216USe) obj;
        if (UU3.LIZ[c77216USe.LJLILLLLZI.ordinal()] == 1) {
            if (c77216USe.LJLIL.LJLJI) {
                ((UUE) iDfS133S0100000_13.l0).LJIILIIL().gv0(new C77259UTv(null, "mlbb", false, 1));
            } else {
                C26045AKb c26045AKb = new C26045AKb(((UUE) iDfS133S0100000_13.l0).LJLJJL);
                c26045AKb.LJIIIIZZ(R.string.g5r);
                c26045AKb.LJIIJ();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$4(IDfS133S0100000_13 iDfS133S0100000_13, Object obj, InterfaceC67352kd interfaceC67352kd) {
        C77216USe c77216USe = (C77216USe) obj;
        if (UU4.LIZ[c77216USe.LJLILLLLZI.ordinal()] == 1) {
            C77217USf c77217USf = c77216USe.LJLIL;
            if (c77217USf.LJLIL) {
                if (c77217USf.LJLJI) {
                    ((UUE) iDfS133S0100000_13.l0).LJIILIIL().gv0(new C77259UTv(null, "mlbb", true, 1));
                } else if (!c77217USf.LJLJI) {
                    C26045AKb c26045AKb = new C26045AKb(((UUE) iDfS133S0100000_13.l0).LJLJJL);
                    c26045AKb.LJIIIIZZ(R.string.g5r);
                    c26045AKb.LJIIJ();
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$5(IDfS133S0100000_13 iDfS133S0100000_13, Object obj, InterfaceC67352kd interfaceC67352kd) {
        C77216USe c77216USe = (C77216USe) obj;
        if (C77260UTw.LIZ[c77216USe.LJLILLLLZI.ordinal()] == 1) {
            if (c77216USe.LJLIL.LJLJI) {
                ((FindCtxViewModel) ((RemoveContactsUnit) iDfS133S0100000_13.l0).LJLLILLLL.getValue()).gv0(new C77259UTv(new C77157UPx(EnumC77154UPu.SYNC_STATUS, new C77150UPq(false, 0, 0, null, 30)), "contact", false));
                C77266UUc.LIZIZ.LIZLLL().LIZJ(1, System.currentTimeMillis());
                UTK.LIZIZ.LIZLLL(EnumC77147UPn.EMAIL).LIZJ(false);
            } else {
                C26045AKb c26045AKb = new C26045AKb(((RemoveContactsUnit) iDfS133S0100000_13.l0).LJLJJL);
                c26045AKb.LJIIIIZZ(R.string.g5r);
                c26045AKb.LJIIJ();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$6(IDfS133S0100000_13 iDfS133S0100000_13, Object obj, InterfaceC67352kd interfaceC67352kd) {
        C77216USe c77216USe = (C77216USe) obj;
        if (UU5.LIZ[c77216USe.LJLILLLLZI.ordinal()] == 1) {
            if (c77216USe.LJLIL.LJLJI) {
                ((FindCtxViewModel) ((RemoveMLBBFriendsUnit) iDfS133S0100000_13.l0).LJLLILLLL.getValue()).gv0(new C77259UTv(null, "mlbb", false, 1));
            } else {
                C26045AKb c26045AKb = new C26045AKb(((RemoveMLBBFriendsUnit) iDfS133S0100000_13.l0).LJLJJL);
                c26045AKb.LJIIIIZZ(R.string.g5r);
                c26045AKb.LJIIJ();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$7(IDfS133S0100000_13 iDfS133S0100000_13, Object obj, InterfaceC67352kd interfaceC67352kd) {
        C77216USe c77216USe = (C77216USe) obj;
        if (UU6.LIZ[c77216USe.LJLILLLLZI.ordinal()] == 1) {
            if (c77216USe.LJLIL.LJLJI) {
                ((FindCtxViewModel) ((RemoveFBFriendsUnit) iDfS133S0100000_13.l0).LJLLLL.getValue()).gv0(new C77259UTv(null, "facebook", false, 1));
                C77266UUc.LIZIZ.LIZLLL().LIZJ(2, System.currentTimeMillis());
            } else {
                C26045AKb c26045AKb = new C26045AKb(((RemoveFBFriendsUnit) iDfS133S0100000_13.l0).LJLJJL);
                c26045AKb.LJIIIIZZ(R.string.g5r);
                c26045AKb.LJIIJ();
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$8(Y.IDfS133S0100000_13 r5, java.lang.Object r6, X.InterfaceC67352kd r7) {
        /*
            boolean r0 = r7 instanceof X.C79209V6v
            if (r0 == 0) goto L37
            r4 = r7
            X.V6v r4 = (X.C79209V6v) r4
            int r2 = r4.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L37
            int r2 = r2 - r1
            r4.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r4.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLILLLLZI
            r2 = 1
            if (r0 == 0) goto L23
            if (r0 != r2) goto L3d
            X.C141335gf.LIZJ(r1)
        L20:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L23:
            X.C141335gf.LIZJ(r1)
            java.lang.Object r1 = r5.l0
            X.2gJ r1 = (X.InterfaceC64672gJ) r1
            X.883 r6 = (X.AnonymousClass883) r6
            S r0 = r6.LIZIZ
            r4.LJLILLLLZI = r2
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L20
            return r3
        L37:
            X.V6v r4 = new X.V6v
            r4.<init>(r5, r7)
            goto L12
        L3d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS133S0100000_13.emit$8(Y.IDfS133S0100000_13, java.lang.Object, X.2kd):java.lang.Object");
    }
}
