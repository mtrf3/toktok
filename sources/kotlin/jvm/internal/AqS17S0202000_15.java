package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C72808Sho;
import X.C76800UCe;
import X.C84288X6e;
import X.InterfaceC2064888m;
import X.InterfaceC208718Hb;
import X.InterfaceC88472Yns;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import java.util.Collection;

/* loaded from: classes16.dex */
public class AqS17S0202000_15 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS17S0202000_15 aqS17S0202000_15, Object obj) {
        InterfaceC208718Hb it = (InterfaceC208718Hb) obj;
        o.LJIIIZ(it, "it");
        AssemListViewModel assemListViewModel = (AssemListViewModel) aqS17S0202000_15.l0;
        C72808Sho<ITEM> c72808Sho = assemListViewModel.state;
        if (c72808Sho != 0) {
            c72808Sho.LJIILJJIL(aqS17S0202000_15.i2, aqS17S0202000_15.i3, (Collection) aqS17S0202000_15.l1);
            assemListViewModel.modifyListState((AssemListViewModel) it, (C72808Sho) c72808Sho);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS17S0202000_15 aqS17S0202000_15, Object obj) {
        InterfaceC2064888m it = (InterfaceC2064888m) obj;
        o.LJIIIZ(it, "it");
        ((AssemSingleListViewModel) aqS17S0202000_15.l0).modifyListState(it, new C84288X6e(aqS17S0202000_15.i2, aqS17S0202000_15.i3, (Collection) aqS17S0202000_15.l1));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS17S0202000_15(AssemListViewModel assemListViewModel, AssemListViewModel<S, ITEM, Cursor> assemListViewModel2, int i, int i2, Collection<? extends ITEM> collection) {
        super(1);
        this.$t = collection;
        this.l0 = assemListViewModel;
        this.i2 = assemListViewModel2;
        this.i3 = i;
        this.l1 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS17S0202000_15(AssemSingleListViewModel assemSingleListViewModel, AssemSingleListViewModel<ITEM, S, Cursor> assemSingleListViewModel2, int i, int i2, Collection<? extends ITEM> collection) {
        super(1);
        this.$t = collection;
        this.l0 = assemSingleListViewModel;
        this.i2 = assemSingleListViewModel2;
        this.i3 = i;
        this.l1 = i2;
    }
}
