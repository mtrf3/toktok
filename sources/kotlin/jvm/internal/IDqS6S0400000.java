package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AnonymousClass164;
import X.AnonymousClass167;
import X.C13060fG;
import X.C1J8;
import X.C1JB;
import X.C1JE;
import X.C24380xW;
import X.C24450xd;
import X.C24570xp;
import X.C25860zu;
import X.C27U;
import X.C35931b3;
import X.C76732zl;
import X.C76800UCe;
import X.EnumC23500w6;
import X.InterfaceC13090fJ;
import X.InterfaceC24350xT;
import X.InterfaceC24420xa;
import X.InterfaceC24520xk;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88473Ynt;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public class IDqS6S0400000 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
    public static final Object invoke$0(IDqS6S0400000 iDqS6S0400000) {
        if (!o.LJ(iDqS6S0400000.l0, ((C1JE) iDqS6S0400000.l1).LJLIL) || !o.LJ(iDqS6S0400000.l2, ((C1JE) iDqS6S0400000.l1).LJLILLLLZI)) {
            C1JE c1je = (C1JE) iDqS6S0400000.l1;
            ?? r4 = iDqS6S0400000.l0;
            ?? r3 = iDqS6S0400000.l2;
            C1JB animationSpec = (C1JB) iDqS6S0400000.l3;
            c1je.getClass();
            o.LJIIIZ(animationSpec, "animationSpec");
            c1je.LJLIL = r4;
            c1je.LJLILLLLZI = r3;
            c1je.LJLJJI = animationSpec;
            c1je.LJLJJLL = new C1J8<>(animationSpec, c1je.LJLJI, r4, r3);
            c1je.LJLL.LIZIZ.setValue(Boolean.TRUE);
            c1je.LJLJL = false;
            c1je.LJLJLJ = true;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS6S0400000 iDqS6S0400000) {
        if (((C76732zl) iDqS6S0400000.l0).element > ((InterfaceC13090fJ) iDqS6S0400000.l1).getItemCount()) {
            ((C76732zl) iDqS6S0400000.l0).element = ((InterfaceC13090fJ) iDqS6S0400000.l1).getItemCount();
        }
        int i = ((C76732zl) iDqS6S0400000.l0).element;
        for (int i2 = 0; i2 < i; i2++) {
            Object LJII = ((C13060fG) iDqS6S0400000.l2).LIZIZ.invoke().LJII(i2);
            InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> LIZ = ((C13060fG) iDqS6S0400000.l2).LIZ(i2, LJII);
            AnonymousClass167 anonymousClass167 = (AnonymousClass167) iDqS6S0400000.l3;
            anonymousClass167.getClass();
            AnonymousClass164 LIZ2 = anonymousClass167.LIZ();
            LIZ2.LJIIL.add(LJII);
            LIZ2.LIZJ(LJII, LIZ);
            Object obj = ((LinkedHashMap) LIZ2.LJ).get(((LinkedHashMap) LIZ2.LJII).get(LJII));
            if (obj != null) {
                obj.getClass();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS6S0400000 iDqS6S0400000) {
        C35931b3 c35931b3 = (C35931b3) iDqS6S0400000.l0;
        List<InterfaceC88473Ynt<InterfaceC24420xa<?>, C24570xp, InterfaceC24350xT, C76800UCe>> list = (List) iDqS6S0400000.l1;
        C24450xd c24450xd = (C24450xd) iDqS6S0400000.l2;
        C24380xW c24380xW = (C24380xW) iDqS6S0400000.l3;
        List<InterfaceC88473Ynt<InterfaceC24420xa<?>, C24570xp, InterfaceC24350xT, C76800UCe>> list2 = c35931b3.LJFF;
        try {
            c35931b3.LJFF = list;
            C24450xd c24450xd2 = c35931b3.LJJIIZ;
            int[] iArr = c35931b3.LJIILJJIL;
            c35931b3.LJIILJJIL = null;
            try {
                c35931b3.LJJIIZ = c24450xd;
                C35931b3.LJJIJLIJ(c35931b3, c24380xW.LIZ, c24380xW.LJI, c24380xW.LIZIZ);
                c35931b3.LJFF = list2;
                return C76800UCe.LIZ;
            } finally {
                c35931b3.LJJIIZ = c24450xd2;
                c35931b3.LJIILJJIL = iArr;
            }
        } catch (Throwable th) {
            c35931b3.LJFF = list2;
            throw th;
        }
    }

    public static final Object invoke$3(IDqS6S0400000 iDqS6S0400000) {
        ((C27U) iDqS6S0400000.l0).LIZLLL((InterfaceC65784Pro) iDqS6S0400000.l1, (C25860zu) iDqS6S0400000.l2, (EnumC23500w6) iDqS6S0400000.l3);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS6S0400000(C35931b3 c35931b3, C35931b3 c35931b32, List<InterfaceC88473Ynt<InterfaceC24420xa<?>, C24570xp, InterfaceC24350xT, C76800UCe>> list, C24450xd c24450xd, C24380xW c24380xW) {
        super(0);
        this.$t = c24380xW;
        this.l0 = c35931b3;
        this.l1 = c35931b32;
        this.l2 = list;
        this.l3 = c24450xd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS6S0400000(C27U c27u, C27U c27u2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, C25860zu c25860zu, EnumC23500w6 enumC23500w6) {
        super(0);
        this.$t = enumC23500w6;
        this.l0 = c27u;
        this.l1 = c27u2;
        this.l2 = interfaceC65784Pro;
        this.l3 = c25860zu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS6S0400000(C76732zl c76732zl, InterfaceC13090fJ interfaceC13090fJ, C13060fG c13060fG, AnonymousClass167 anonymousClass167, int i) {
        super(0);
        this.$t = i;
        this.l0 = c76732zl;
        this.l1 = interfaceC13090fJ;
        this.l2 = c13060fG;
        this.l3 = anonymousClass167;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS6S0400000(Object obj, Object obj2, C1JE<Object, Object> c1je, Object obj3, C1JB<Object> c1jb) {
        super(0);
        this.$t = c1jb;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = c1je;
        this.l3 = obj3;
    }
}
