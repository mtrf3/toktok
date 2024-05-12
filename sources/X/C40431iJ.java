package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.IDqS1S0301000;
import kotlin.jvm.internal.IDqS2S0201000;
import kotlin.jvm.internal.o;

/* renamed from: X.1iJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40431iJ implements InterfaceC88471Ynr, InterfaceC88473Ynt, InterfaceC88474Ynu, InterfaceC88475Ynv, InterfaceC88476Ynw, InterfaceC88477Ynx, InterfaceC88478Yny, InterfaceC88479Ynz, InterfaceC88480Yo0, InterfaceC88481Yo1, InterfaceC88483Yo3, InterfaceC88484Yo4, InterfaceC88485Yo5, InterfaceC88486Yo6, InterfaceC88487Yo7, InterfaceC88488Yo8, InterfaceC88489Yo9, InterfaceC88490YoA, InterfaceC88491YoB {
    public final int LJLIL;
    public final boolean LJLILLLLZI;
    public Object LJLJI;
    public InterfaceC24650xx LJLJJI;
    public List<InterfaceC24650xx> LJLJJL;

    public final void LJFF(InterfaceC24520xk interfaceC24520xk) {
        C35991b9 LJIILIIL;
        if (this.LJLILLLLZI && (LJIILIIL = interfaceC24520xk.LJIILIIL()) != null) {
            interfaceC24520xk.LJ(LJIILIIL);
            if (C1DJ.LJJIIJ(this.LJLJJI, LJIILIIL)) {
                this.LJLJJI = LJIILIIL;
                return;
            }
            List<InterfaceC24650xx> list = this.LJLJJL;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                this.LJLJJL = arrayList;
                arrayList.add(LJIILIIL);
                return;
            }
            ArrayList arrayList2 = (ArrayList) list;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                if (C1DJ.LJJIIJ((InterfaceC24650xx) ListProtector.get(list, i), LJIILIIL)) {
                    ListProtector.set(list, i, LJIILIIL);
                    return;
                }
            }
            arrayList2.add(LJIILIIL);
        }
    }

    public final void LJI(Object block) {
        boolean z;
        o.LJIIIZ(block, "block");
        if (!o.LJ(this.LJLJI, block)) {
            if (this.LJLJI == null) {
                z = true;
            } else {
                z = false;
            }
            this.LJLJI = block;
            if (!z && this.LJLILLLLZI) {
                InterfaceC24650xx interfaceC24650xx = this.LJLJJI;
                if (interfaceC24650xx != null) {
                    interfaceC24650xx.invalidate();
                    this.LJLJJI = null;
                }
                List<InterfaceC24650xx> list = this.LJLJJL;
                if (list != null) {
                    ArrayList arrayList = (ArrayList) list;
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((InterfaceC24650xx) ListProtector.get(list, i)).invalidate();
                    }
                    arrayList.clear();
                }
            }
        }
    }

    public C40431iJ(int i, boolean z) {
        this.LJLIL = i;
        this.LJLILLLLZI = z;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        int LIZJ;
        InterfaceC24520xk c = (InterfaceC24520xk) obj;
        int intValue = ((Number) obj2).intValue();
        o.LJIIIZ(c, "c");
        C35931b3 LJIL = c.LJIL(this.LJLIL);
        LJFF(LJIL);
        if (LJIL.LJIJJ(this)) {
            LIZJ = C1DJ.LIZJ(2, 0);
        } else {
            LIZJ = C1DJ.LIZJ(1, 0);
        }
        Object obj3 = this.LJLJI;
        o.LJII(obj3, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C65777Prh.LJ(2, obj3);
        Object invoke = ((InterfaceC88471Ynr) obj3).invoke(LJIL, Integer.valueOf(intValue | LIZJ));
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI != null) {
            C65777Prh.LJ(2, this);
            LJJJJLI.LIZLLL = this;
        }
        return invoke;
    }

    public final Object LJ(Object obj, InterfaceC24520xk c, int i) {
        int LIZJ;
        o.LJIIIZ(c, "c");
        C35931b3 LJIL = c.LJIL(this.LJLIL);
        LJFF(LJIL);
        if (LJIL.LJIJJ(this)) {
            LIZJ = C1DJ.LIZJ(2, 1);
        } else {
            LIZJ = C1DJ.LIZJ(1, 1);
        }
        Object obj2 = this.LJLJI;
        o.LJII(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C65777Prh.LJ(3, obj2);
        Object invoke = ((InterfaceC88473Ynt) obj2).invoke(obj, LJIL, Integer.valueOf(LIZJ | i));
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI != null) {
            LJJJJLI.LIZLLL = new IDqS2S0201000(this, obj, i, 1);
        }
        return invoke;
    }

    @Override // X.InterfaceC88473Ynt
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return LJ(obj, (InterfaceC24520xk) obj2, ((Number) obj3).intValue());
    }

    public final Object LIZLLL(Object obj, Object obj2, InterfaceC24520xk c, int i) {
        int LIZJ;
        o.LJIIIZ(c, "c");
        C35931b3 LJIL = c.LJIL(this.LJLIL);
        LJFF(LJIL);
        if (LJIL.LJIJJ(this)) {
            LIZJ = C1DJ.LIZJ(2, 2);
        } else {
            LIZJ = C1DJ.LIZJ(1, 2);
        }
        Object obj3 = this.LJLJI;
        o.LJII(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C65777Prh.LJ(4, obj3);
        Object invoke = ((InterfaceC88474Ynu) obj3).invoke(obj, obj2, LJIL, Integer.valueOf(LIZJ | i));
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI != null) {
            LJJJJLI.LIZLLL = new IDqS1S0301000(this, obj, obj2, i, 2);
        }
        return invoke;
    }

    @Override // X.InterfaceC88474Ynu
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return LIZLLL(obj, obj2, (InterfaceC24520xk) obj3, ((Number) obj4).intValue());
    }

    public final Object LIZJ(Object obj, Object obj2, Object obj3, InterfaceC24520xk c, int i) {
        int LIZJ;
        o.LJIIIZ(c, "c");
        C35931b3 LJIL = c.LJIL(this.LJLIL);
        LJFF(LJIL);
        if (LJIL.LJIJJ(this)) {
            LIZJ = C1DJ.LIZJ(2, 3);
        } else {
            LIZJ = C1DJ.LIZJ(1, 3);
        }
        Object obj4 = this.LJLJI;
        o.LJII(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C65777Prh.LJ(5, obj4);
        Object invoke = ((InterfaceC88475Ynv) obj4).invoke(obj, obj2, obj3, LJIL, Integer.valueOf(LIZJ | i));
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI != null) {
            LJJJJLI.LIZLLL = new C45701qo(this, obj, obj2, obj3, i);
        }
        return invoke;
    }

    @Override // X.InterfaceC88475Ynv
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return LIZJ(obj, obj2, obj3, (InterfaceC24520xk) obj4, ((Number) obj5).intValue());
    }

    public final Object LIZIZ(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC24520xk c, int i) {
        int LIZJ;
        o.LJIIIZ(c, "c");
        C35931b3 LJIL = c.LJIL(this.LJLIL);
        LJFF(LJIL);
        if (LJIL.LJIJJ(this)) {
            LIZJ = C1DJ.LIZJ(2, 4);
        } else {
            LIZJ = C1DJ.LIZJ(1, 4);
        }
        Object obj5 = this.LJLJI;
        o.LJII(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C65777Prh.LJ(6, obj5);
        Object invoke = ((InterfaceC88476Ynw) obj5).invoke(obj, obj2, obj3, obj4, LJIL, Integer.valueOf(LIZJ | i));
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI != null) {
            LJJJJLI.LIZLLL = new C45711qp(this, obj, obj2, obj3, obj4, i);
        }
        return invoke;
    }

    @Override // X.InterfaceC88476Ynw
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return LIZIZ(obj, obj2, obj3, obj4, (InterfaceC24520xk) obj5, ((Number) obj6).intValue());
    }

    public final Object LIZ(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, InterfaceC24520xk c, int i) {
        int LIZJ;
        o.LJIIIZ(c, "c");
        C35931b3 LJIL = c.LJIL(this.LJLIL);
        LJFF(LJIL);
        if (LJIL.LJIJJ(this)) {
            LIZJ = C1DJ.LIZJ(2, 5);
        } else {
            LIZJ = C1DJ.LIZJ(1, 5);
        }
        Object obj6 = this.LJLJI;
        o.LJII(obj6, "null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C65777Prh.LJ(7, obj6);
        Object LJJIL = ((InterfaceC88477Ynx) obj6).LJJIL(obj, obj2, obj3, obj4, obj5, LJIL, Integer.valueOf(i | LIZJ));
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI != null) {
            LJJJJLI.LIZLLL = new C45721qq(this, obj, obj2, obj3, obj4, obj5, i);
        }
        return LJJIL;
    }

    @Override // X.InterfaceC88477Ynx
    public final /* bridge */ /* synthetic */ Object LJJIL(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return LIZ(obj, obj2, obj3, obj4, obj5, (InterfaceC24520xk) obj6, ((Number) obj7).intValue());
    }
}
