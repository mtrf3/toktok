package Y;

import X.AbstractC73672Svk;
import X.C67623QgN;
import X.C67624QgO;
import X.C67625QgP;
import X.C73454SsE;
import X.C73969T1h;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.T16;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.setting.page.diskmanager.DiskViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class AObjectS148S0100000_11 implements InterfaceC88472Yns {
    public final int $t;
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
            default:
                return null;
        }
    }

    public AObjectS148S0100000_11(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS148S0100000_11 aObjectS148S0100000_11, Object eventArgs) {
        MutableLiveData<Integer> mutableLiveData;
        o.LJIIIZ(eventArgs, "eventArgs");
        DiskViewModel LJIILJJIL = ((C67624QgO) aObjectS148S0100000_11.l0).LJIILJJIL();
        if (LJIILJJIL != null && (mutableLiveData = LJIILJJIL.LJLILLLLZI) != null) {
            mutableLiveData.setValue(1);
        }
        C73454SsE LJJJ = AbstractC73672Svk.LJJIJIL("").LJJL(T16.LIZ()).LJJIJL(new IDhS101S0100000_8((C67624QgO) aObjectS148S0100000_11.l0, 2)).LJJJ(C73969T1h.LIZIZ());
        C67624QgO c67624QgO = (C67624QgO) aObjectS148S0100000_11.l0;
        LJJJ.LJJJLIIL(new AfS63S0100000_11(c67624QgO, 45), new AfS63S0100000_11(c67624QgO, 46));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AObjectS148S0100000_11 aObjectS148S0100000_11, Object eventArgs) {
        MutableLiveData<Integer> mutableLiveData;
        o.LJIIIZ(eventArgs, "eventArgs");
        DiskViewModel LJIILJJIL = ((C67623QgN) aObjectS148S0100000_11.l0).LJIILJJIL();
        if (LJIILJJIL != null && (mutableLiveData = LJIILJJIL.LJLILLLLZI) != null) {
            mutableLiveData.setValue(1);
        }
        C73454SsE LJJJ = AbstractC73672Svk.LJJIJIL("").LJJL(T16.LIZ()).LJJIJL(new IDhS101S0100000_8((C67623QgN) aObjectS148S0100000_11.l0, 3)).LJJJ(C73969T1h.LIZIZ());
        C67623QgN c67623QgN = (C67623QgN) aObjectS148S0100000_11.l0;
        LJJJ.LJJJLIIL(new AfS63S0100000_11(c67623QgN, 47), new AfS63S0100000_11(c67623QgN, 48));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AObjectS148S0100000_11 aObjectS148S0100000_11, Object eventArgs) {
        o.LJIIIZ(eventArgs, "eventArgs");
        ((C67625QgP) aObjectS148S0100000_11.l0).LJIILJJIL().LJLILLLLZI.setValue(1);
        C73454SsE LJJJ = AbstractC73672Svk.LJJIJIL("").LJJL(T16.LIZ()).LJJIJL(new IDhS101S0100000_8((C67625QgP) aObjectS148S0100000_11.l0, 4)).LJJJ(C73969T1h.LIZIZ());
        C67625QgP c67625QgP = (C67625QgP) aObjectS148S0100000_11.l0;
        LJJJ.LJJJLIIL(new AfS63S0100000_11(c67625QgP, 49), new AfS63S0100000_11(c67625QgP, 50));
        return C76800UCe.LIZ;
    }
}
