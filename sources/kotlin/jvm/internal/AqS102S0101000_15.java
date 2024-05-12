package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C72808Sho;
import X.C76800UCe;
import X.C85799Xlr;
import X.C85800Xls;
import X.C85938Xo6;
import X.InterfaceC2064888m;
import X.InterfaceC208718Hb;
import X.InterfaceC88472Yns;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.List;

/* loaded from: classes16.dex */
public class AqS102S0101000_15 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i1;
    public Object l0;

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
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS102S0101000_15(C85799Xlr c85799Xlr, int i) {
        super(1);
        this.$t = i;
        this.l0 = c85799Xlr;
        this.i1 = 0;
    }

    public static final Object invoke$0(AqS102S0101000_15 aqS102S0101000_15, Object obj) {
        InterfaceC208718Hb it = (InterfaceC208718Hb) obj;
        o.LJIIIZ(it, "it");
        AssemListViewModel assemListViewModel = (AssemListViewModel) aqS102S0101000_15.l0;
        C72808Sho<ITEM> c72808Sho = assemListViewModel.state;
        if (c72808Sho != 0) {
            c72808Sho.LJIILIIL(aqS102S0101000_15.i1);
            assemListViewModel.modifyListState((AssemListViewModel) it, (C72808Sho) c72808Sho);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS102S0101000_15 aqS102S0101000_15, Object obj) {
        InterfaceC2064888m it = (InterfaceC2064888m) obj;
        o.LJIIIZ(it, "it");
        ((AssemSingleListViewModel) aqS102S0101000_15.l0).modifyListState(it, new AqS39S0001000_15(aqS102S0101000_15.i1, 0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS102S0101000_15 aqS102S0101000_15, Object obj) {
        List modifyListState = (List) obj;
        o.LJIIIZ(modifyListState, "$this$modifyListState");
        modifyListState.addAll(aqS102S0101000_15.i1, (Collection) aqS102S0101000_15.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS102S0101000_15 aqS102S0101000_15, Object obj) {
        List modifyListState = (List) obj;
        o.LJIIIZ(modifyListState, "$this$modifyListState");
        ListProtector.add(modifyListState, aqS102S0101000_15.i1, aqS102S0101000_15.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS102S0101000_15 aqS102S0101000_15, Object obj) {
        List modifyListState = (List) obj;
        o.LJIIIZ(modifyListState, "$this$modifyListState");
        ListProtector.set(modifyListState, aqS102S0101000_15.i1, aqS102S0101000_15.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS102S0101000_15 aqS102S0101000_15, Object obj) {
        List modifyListState = (List) obj;
        o.LJIIIZ(modifyListState, "$this$modifyListState");
        ListProtector.set(modifyListState, aqS102S0101000_15.i1, aqS102S0101000_15.l0);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (X.C85926Xnu.LIZ(r1) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$6(kotlin.jvm.internal.AqS102S0101000_15 r12, java.lang.Object r13) {
        /*
            r2 = r13
            X.ACm r2 = (X.C25848ACm) r2
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            int r0 = r12.i1
            r3 = 1
            if (r0 != r3) goto L2f
            java.lang.Object r0 = r12.l0
            X.Xo6 r0 = (X.C85938Xo6) r0
            java.lang.String r1 = r0.LJLJJLL
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.o.LJII(r1, r0)
            boolean r0 = X.C85926Xnu.LIZ(r1)
            if (r0 == 0) goto L2f
        L1e:
            r4 = 0
            r6 = 0
            r13 = 65534(0xfffe, float:9.1833E-41)
            r5 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r10 = r6
            r11 = r6
            r12 = r6
            X.ACm r0 = X.C25848ACm.LJIILJJIL(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L2f:
            r3 = 0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS102S0101000_15.invoke$6(kotlin.jvm.internal.AqS102S0101000_15, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$7(AqS102S0101000_15 aqS102S0101000_15, Object it) {
        o.LJIIIZ(it, "it");
        return C85800Xls.LIZJ(((C85799Xlr) aqS102S0101000_15.l0).LJFF(), aqS102S0101000_15.i1, null, 0, null, false, 1021);
    }

    public static final Object invoke$8(AqS102S0101000_15 aqS102S0101000_15, Object it) {
        o.LJIIIZ(it, "it");
        return C85800Xls.LIZJ(((C85799Xlr) aqS102S0101000_15.l0).LJFF(), 0, null, aqS102S0101000_15.i1, null, false, 991);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS102S0101000_15(int i, C85938Xo6 c85938Xo6, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c85938Xo6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS102S0101000_15(int i, int i2, Object obj) {
        super(1);
        this.$t = obj;
        this.i1 = i;
        this.l0 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS102S0101000_15(int i, int i2, Collection<Object> collection) {
        super(1);
        this.$t = collection;
        this.i1 = i;
        this.l0 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS102S0101000_15(C85799Xlr c85799Xlr, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c85799Xlr;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS102S0101000_15(AssemListViewModel assemListViewModel, AssemListViewModel<S, ITEM, Cursor> assemListViewModel2, int i) {
        super(1);
        this.$t = i;
        this.l0 = assemListViewModel;
        this.i1 = assemListViewModel2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS102S0101000_15(AssemSingleListViewModel assemSingleListViewModel, AssemSingleListViewModel<ITEM, S, Cursor> assemSingleListViewModel2, int i) {
        super(1);
        this.$t = i;
        this.l0 = assemSingleListViewModel;
        this.i1 = assemSingleListViewModel2;
    }
}
