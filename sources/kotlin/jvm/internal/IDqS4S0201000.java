package kotlin.jvm.internal;

import X.AbstractC274515x;
import X.AbstractC39201gK;
import X.AbstractC65781Prl;
import X.C0O9;
import X.C16940lW;
import X.C1V9;
import X.C1VA;
import X.C22M;
import X.C24630xv;
import X.C25680zc;
import X.C25690zd;
import X.C28J;
import X.C35991b9;
import X.C43991o3;
import X.C44001o4;
import X.C49041wC;
import X.C61898ORa;
import X.C68322mC;
import X.C76800UCe;
import X.C78842Uww;
import X.InterfaceC24790yB;
import X.InterfaceC35921b2;
import X.InterfaceC88472Yns;
import android.view.View;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;

/* loaded from: classes.dex */
public class IDqS4S0201000 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(IDqS4S0201000 iDqS4S0201000, Object obj) {
        int i;
        int i2;
        AbstractC274515x layout = (AbstractC274515x) obj;
        o.LJIIIZ(layout, "$this$layout");
        int i3 = 0;
        int LJIIL = C78842Uww.LJIIL(((C49041wC) iDqS4S0201000.l0).LJLIL.LJ(), 0, iDqS4S0201000.i2);
        C49041wC c49041wC = (C49041wC) iDqS4S0201000.l0;
        if (c49041wC.LJLILLLLZI) {
            i = LJIIL - iDqS4S0201000.i2;
        } else {
            i = -LJIIL;
        }
        if (c49041wC.LJLJI) {
            i2 = 0;
            i3 = i;
        } else {
            i2 = i;
        }
        AbstractC274515x.LJII(layout, (AbstractC39201gK) iDqS4S0201000.l1, i2, i3);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, X.22M] */
    public static final Object invoke$1(IDqS4S0201000 iDqS4S0201000, Object obj) {
        C68322mC c68322mC = (C68322mC) iDqS4S0201000.l0;
        C1V9 c1v9 = (C1V9) iDqS4S0201000.l1;
        ?? LJIIL = C1VA.LJIIL((C22M) obj, c1v9.LIZIZ, c1v9.LIZLLL, c1v9.LIZJ, c1v9.LJ, c1v9.LJFF, iDqS4S0201000.i2, "get", C1V9.LIZLLL(c1v9.LJI, c1v9.LJIIIIZZ));
        C16940lW.LIZ(LJIIL, (C1V9) iDqS4S0201000.l1);
        c68322mC.element = LJIIL;
        return ((C68322mC) iDqS4S0201000.l0).element;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, X.22M] */
    public static final Object invoke$2(IDqS4S0201000 iDqS4S0201000, Object obj) {
        C68322mC c68322mC = (C68322mC) iDqS4S0201000.l0;
        C1V9 c1v9 = (C1V9) iDqS4S0201000.l1;
        ?? LJIIL = C1VA.LJIIL((C22M) obj, c1v9.LIZIZ, c1v9.LIZLLL, c1v9.LIZJ, c1v9.LJ, c1v9.LJFF, iDqS4S0201000.i2, "store", C1V9.LIZLLL(c1v9.LJI, c1v9.LJIIIIZZ));
        C16940lW.LIZ(LJIIL, (C1V9) iDqS4S0201000.l1);
        c68322mC.element = LJIIL;
        return ((C68322mC) iDqS4S0201000.l0).element;
    }

    public static final Object invoke$3(IDqS4S0201000 iDqS4S0201000, Object it) {
        int i;
        o.LJIIIZ(it, "it");
        if (it != ((C44001o4) iDqS4S0201000.l0)) {
            if (it instanceof C0O9) {
                Object LIZ = C24630xv.LIZ.LIZ();
                o.LJI(LIZ);
                int intValue = ((Number) LIZ).intValue();
                C25690zd c25690zd = (C25690zd) iDqS4S0201000.l1;
                int i2 = intValue - iDqS4S0201000.i2;
                Integer num = (Integer) c25690zd.LIZIZ(it);
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = Integer.MAX_VALUE;
                }
                c25690zd.LIZJ(it, Integer.valueOf(Math.min(i2, i)));
            }
            return C76800UCe.LIZ;
        }
        "A derived state calculation cannot read itself".toString();
        throw new IllegalStateException("A derived state calculation cannot read itself");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$4(IDqS4S0201000 iDqS4S0201000, Object obj) {
        boolean z;
        C25690zd<InterfaceC35921b2<?>, Object> c25690zd;
        InterfaceC24790yB composition = (InterfaceC24790yB) obj;
        o.LJIIIZ(composition, "composition");
        C35991b9 c35991b9 = (C35991b9) iDqS4S0201000.l0;
        if (c35991b9.LJ == iDqS4S0201000.i2 && o.LJ((C25680zc) iDqS4S0201000.l1, c35991b9.LJFF) && (composition instanceof C43991o3)) {
            C25680zc c25680zc = (C25680zc) iDqS4S0201000.l1;
            int i = iDqS4S0201000.i2;
            C35991b9 scope = (C35991b9) iDqS4S0201000.l0;
            int i2 = c25680zc.LIZ;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj2 = c25680zc.LIZIZ[i4];
                o.LJII(obj2, "null cannot be cast to non-null type kotlin.Any");
                int i5 = c25680zc.LIZJ[i4];
                if (i5 != i) {
                    z = true;
                    C43991o3 c43991o3 = (C43991o3) composition;
                    o.LJIIIZ(scope, "scope");
                    c43991o3.LJLJL.LJ(obj2, scope);
                    if ((obj2 instanceof InterfaceC35921b2) && obj2 != null) {
                        if (!c43991o3.LJLJL.LIZJ(obj2)) {
                            c43991o3.LJLJLLL.LJFF(obj2);
                        }
                        C25690zd<InterfaceC35921b2<?>, Object> c25690zd2 = scope.LJI;
                        if (c25690zd2 != null) {
                            int LIZ = c25690zd2.LIZ(obj2);
                            if (LIZ >= 0) {
                                int i6 = c25690zd2.LIZJ;
                                Object[] objArr = c25690zd2.LIZ;
                                Object[] objArr2 = c25690zd2.LIZIZ;
                                int i7 = LIZ + 1;
                                C61898ORa.LJIIZILJ(LIZ, i7, i6, objArr, objArr);
                                C61898ORa.LJIIZILJ(LIZ, i7, i6, objArr2, objArr2);
                                int i8 = i6 - 1;
                                c25690zd = null;
                                objArr[i8] = null;
                                objArr2[i8] = null;
                                c25690zd2.LIZJ = i8;
                            } else {
                                c25690zd = null;
                            }
                            if (c25690zd2.LIZJ == 0) {
                                scope.LJI = c25690zd;
                            }
                        }
                    }
                } else {
                    z = false;
                }
                if (!z) {
                    if (i3 != i4) {
                        c25680zc.LIZIZ[i3] = obj2;
                        c25680zc.LIZJ[i3] = i5;
                    }
                    i3++;
                }
            }
            int i9 = c25680zc.LIZ;
            for (int i10 = i3; i10 < i9; i10++) {
                c25680zc.LIZIZ[i10] = null;
            }
            c25680zc.LIZ = i3;
            if (((C25680zc) iDqS4S0201000.l1).LIZ == 0) {
                ((C35991b9) iDqS4S0201000.l0).LJFF = null;
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS4S0201000 iDqS4S0201000, Object obj) {
        View it = (View) obj;
        o.LJIIIZ(it, "it");
        ((C28J) iDqS4S0201000.l0).LLILZ(it, (SoundEffect) iDqS4S0201000.l1, iDqS4S0201000.i2);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS4S0201000(C35991b9 c35991b9, int i, C25680zc c25680zc, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c35991b9;
        this.i2 = i;
        this.l1 = c25680zc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS4S0201000(C44001o4 c44001o4, C44001o4<T> c44001o42, C25690zd<C0O9, Integer> c25690zd, int i) {
        super(1);
        this.$t = i;
        this.l0 = c44001o4;
        this.l1 = c44001o42;
        this.i2 = c25690zd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS4S0201000(C49041wC c49041wC, int i, AbstractC39201gK abstractC39201gK, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c49041wC;
        this.i2 = i;
        this.l1 = abstractC39201gK;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS4S0201000(C28J c28j, SoundEffect soundEffect, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c28j;
        this.l1 = soundEffect;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS4S0201000(C68322mC c68322mC, C68322mC<C22M> c68322mC2, C1V9 c1v9, int i) {
        super(1);
        this.$t = i;
        this.l0 = c68322mC;
        this.l1 = c68322mC2;
        this.i2 = c1v9;
    }
}
