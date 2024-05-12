package X;

import X.InterfaceC61312at;
import Y.AfS61S0200000_12;
import Y.IDhS105S0100000_12;
import Y.IDhS94S0100000_1;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS57S0400000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Sn9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C73139Sn9<S extends InterfaceC61312at, PROP extends InterfaceC61312at> {
    public C73318Sq2 LJLIL;
    public JediViewModel<S> LJLILLLLZI;
    public TBW<S, ? extends PROP> LJLJI;
    public InterfaceC88471Ynr<? super S, ? super PROP, ? extends S> LJLJJI;

    public final TBW<S, PROP> LIZJ() {
        TBW<S, ? extends PROP> tbw = this.LJLJI;
        if (tbw != null) {
            return tbw;
        }
        o.LJIJI("substate");
        throw null;
    }

    public final JediViewModel<S> LIZLLL() {
        JediViewModel<S> jediViewModel = this.LJLILLLLZI;
        if (jediViewModel != null) {
            return jediViewModel;
        }
        o.LJIJI("viewModel");
        throw null;
    }

    public final void LJI(InterfaceC88472Yns<? super PROP, ? extends PROP> interfaceC88472Yns) {
        JediViewModel<S> jediViewModel = this.LJLILLLLZI;
        if (jediViewModel != null) {
            jediViewModel.Cv0(new AqS143S0200000_12(this, interfaceC88472Yns, 16));
        } else {
            o.LJIJI("viewModel");
            throw null;
        }
    }

    public final <T> InterfaceC92693kP LIZIZ(AbstractC73672Svk<T> execute, InterfaceC88471Ynr<? super PROP, ? super AbstractC26082ALm<? extends T>, ? extends PROP> interfaceC88471Ynr) {
        o.LJIIJ(execute, "$this$execute");
        C73136Sn6 mapper = C73136Sn6.LJLIL;
        o.LJIIJ(mapper, "mapper");
        LJI(new AqS178S0100000_12((InterfaceC88471Ynr) interfaceC88471Ynr, 89));
        InterfaceC92693kP LJJJJZI = execute.LJJIJL(new IDhS105S0100000_12(mapper, 4)).LJJJJ(C73138Sn8.LJLIL).LJJJJZI(new AfS61S0200000_12((ListMiddleware) this, interfaceC88471Ynr, 1));
        C73318Sq2 c73318Sq2 = this.LJLIL;
        if (c73318Sq2 != null) {
            c73318Sq2.LIZ(LJJJJZI);
            return LJJJJZI;
        }
        o.LJIJI("disposables");
        throw null;
    }

    public final void LJ(TBT subState, InterfaceC88471Ynr mainStateReducer) {
        o.LJIIJ(subState, "subState");
        o.LJIIJ(mainStateReducer, "mainStateReducer");
        this.LJLJI = subState;
        this.LJLJJI = mainStateReducer;
    }

    public final void LJFF(InterfaceC73150SnK selectSubscribe, TBZ prop1, boolean z, boolean z2, InterfaceC88471Ynr interfaceC88471Ynr) {
        o.LJIIJ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIJ(prop1, "prop1");
        InterfaceC73149SnJ receiverHolder = selectSubscribe.getReceiverHolder();
        JediViewModel<S> jediViewModel = this.LJLILLLLZI;
        if (jediViewModel != null) {
            LifecycleOwner lifecycleOwner = selectSubscribe.getLifecycleOwnerHolder().getLifecycleOwner();
            TBW<S, ? extends PROP> tbw = this.LJLJI;
            if (tbw != null) {
                JediViewModel.qv0(jediViewModel, jediViewModel.nv0().LJJIJL(new IDhS94S0100000_1(tbw, 5)).LJIILIIL().LJJIJL(new IDhS105S0100000_12(prop1, 19)).LJIILIIL(), lifecycleOwner, z, z2, null, new AqS143S0200000_12(jediViewModel, lifecycleOwner, z, z2, new AqS57S0400000_12(receiverHolder, selectSubscribe, prop1, interfaceC88471Ynr, 0), 86), 16, null);
                return;
            } else {
                o.LJIJI("substate");
                throw null;
            }
        }
        o.LJIJI("viewModel");
        throw null;
    }

    public final void LIZ(InterfaceC73150SnK asyncSubscribe, TBZ prop, boolean z, boolean z2, InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88471Ynr interfaceC88471Ynr2) {
        o.LJIIJ(asyncSubscribe, "$this$asyncSubscribe");
        o.LJIIJ(prop, "prop");
        InterfaceC73149SnJ receiverHolder = asyncSubscribe.getReceiverHolder();
        JediViewModel<S> jediViewModel = this.LJLILLLLZI;
        if (jediViewModel != null) {
            LifecycleOwner lifecycleOwner = asyncSubscribe.getLifecycleOwnerHolder().getLifecycleOwner();
            TBW<S, ? extends PROP> tbw = this.LJLJI;
            if (tbw != null) {
                AqS143S0200000_12 aqS143S0200000_12 = new AqS143S0200000_12(interfaceC88471Ynr, receiverHolder, 14);
                AqS159S0200000_12 aqS159S0200000_12 = new AqS159S0200000_12(interfaceC88472Yns, receiverHolder, 8);
                JediViewModel.qv0(jediViewModel, jediViewModel.nv0().LJJIJL(new IDhS94S0100000_1(tbw, 5)).LJIILIIL().LJJIJL(new IDhS105S0100000_12(prop, 18)).LJIILIIL(), lifecycleOwner, z, z2, null, new AqS57S0400000_12(jediViewModel, lifecycleOwner, z, z2, new AqS143S0200000_12(interfaceC88471Ynr2, receiverHolder, 15), aqS143S0200000_12, aqS159S0200000_12, 8), 16, null);
                return;
            }
            o.LJIJI("substate");
            throw null;
        }
        o.LJIJI("viewModel");
        throw null;
    }
}
