package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C07070Pn;
import X.C07090Pp;
import X.C0Q1;
import X.C0Q9;
import X.C14870iB;
import X.C15010iP;
import X.C15020iQ;
import X.C18780oU;
import X.C18810oX;
import X.C1JK;
import X.C34K;
import X.C68322mC;
import X.C76800UCe;
import X.InterfaceC07130Pt;
import X.InterfaceC24580xq;
import X.InterfaceC88472Yns;

/* loaded from: classes.dex */
public class IDqS8S0400000 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public static final Object invoke$0(IDqS8S0400000 iDqS8S0400000, Object obj) {
        C0Q1 animate = (C0Q1) obj;
        o.LJIIIZ(animate, "$this$animate");
        C07090Pp.LIZJ(animate, ((C07070Pn) iDqS8S0400000.l0).LIZJ);
        Object LIZ = C07070Pn.LIZ((C07070Pn) iDqS8S0400000.l0, animate.LIZ());
        if (!o.LJ(LIZ, animate.LIZ())) {
            ((C07070Pn) iDqS8S0400000.l0).LIZJ.LJLILLLLZI.setValue(LIZ);
            ((C1JK) iDqS8S0400000.l1).LJLILLLLZI.setValue(LIZ);
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDqS8S0400000.l2;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke((C07070Pn) iDqS8S0400000.l0);
            }
            animate.LJII.setValue(Boolean.FALSE);
            animate.LIZLLL.invoke();
            ((C34K) iDqS8S0400000.l3).element = true;
        } else {
            InterfaceC88472Yns interfaceC88472Yns2 = (InterfaceC88472Yns) iDqS8S0400000.l2;
            if (interfaceC88472Yns2 != null) {
                interfaceC88472Yns2.invoke((C07070Pn) iDqS8S0400000.l0);
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(IDqS8S0400000 iDqS8S0400000, Object obj) {
        long longValue = ((Number) obj).longValue();
        T t = ((C68322mC) iDqS8S0400000.l0).element;
        o.LJI(t);
        C07090Pp.LIZIZ((C0Q1) t, longValue, (InterfaceC07130Pt) iDqS8S0400000.l1, (C1JK) iDqS8S0400000.l2, (InterfaceC88472Yns) iDqS8S0400000.l3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS8S0400000 iDqS8S0400000, Object DisposableEffect) {
        o.LJIIIZ(DisposableEffect, "$this$DisposableEffect");
        if (((C15020iQ) iDqS8S0400000.l0) != null && ((C18810oX) iDqS8S0400000.l1).LIZIZ()) {
            C18810oX c18810oX = (C18810oX) iDqS8S0400000.l1;
            c18810oX.LIZLLL = C18780oU.LIZ((C15020iQ) iDqS8S0400000.l0, (C15010iP) iDqS8S0400000.l2, c18810oX.LIZJ, (C14870iB) iDqS8S0400000.l3, c18810oX.LJIIZILJ, c18810oX.LJIJ);
        }
        return new InterfaceC24580xq() { // from class: X.1XW
            @Override // X.InterfaceC24580xq
            public final void dispose() {
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS8S0400000(C07070Pn c07070Pn, C07070Pn<Object, C0Q9> c07070Pn2, C1JK<Object, C0Q9> c1jk, InterfaceC88472Yns<? super C07070Pn<Object, C0Q9>, C76800UCe> interfaceC88472Yns, C34K c34k) {
        super(1);
        this.$t = c34k;
        this.l0 = c07070Pn;
        this.l1 = c07070Pn2;
        this.l2 = c1jk;
        this.l3 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS8S0400000(C15020iQ c15020iQ, C18810oX c18810oX, C15010iP c15010iP, C14870iB c14870iB, int i) {
        super(1);
        this.$t = i;
        this.l0 = c15020iQ;
        this.l1 = c18810oX;
        this.l2 = c15010iP;
        this.l3 = c14870iB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS8S0400000(C68322mC c68322mC, C68322mC<C0Q1<T, V>> c68322mC2, InterfaceC07130Pt<T, V> interfaceC07130Pt, C1JK<T, V> c1jk, InterfaceC88472Yns<? super C0Q1<T, V>, C76800UCe> interfaceC88472Yns) {
        super(1);
        this.$t = interfaceC88472Yns;
        this.l0 = c68322mC;
        this.l1 = c68322mC2;
        this.l2 = interfaceC07130Pt;
        this.l3 = c1jk;
    }
}
