package X;

import X.C33Q;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SharedViewModelProvider;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AqS61S0110000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.8bB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214378bB<S extends C33Q, VM extends AssemViewModel<S>> implements C5H3<VM> {
    public static final /* synthetic */ int LJLL = 0;
    public final InterfaceC65350Pko<VM> LJLIL;
    public final InterfaceC65784Pro<String> LJLILLLLZI;
    public final InterfaceC65784Pro<C8YR<S>> LJLJI;
    public final InterfaceC65784Pro<LifecycleOwner> LJLJJI;
    public final InterfaceC65784Pro<ViewModelProvider.Factory> LJLJJL;
    public final InterfaceC88472Yns<S, S> LJLJJLL;
    public final InterfaceC65784Pro<C7C3> LJLJL;
    public final InterfaceC65784Pro<C8VA> LJLJLJ;
    public VM LJLJLLL;

    @Override // X.C5H3
    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final VM getValue() {
        VM vm;
        if (C214368bA.LJIILJJIL) {
            vm = this.LJLJLLL;
            if (vm == null) {
                synchronized (C39557Ffl.LIZ(this.LJLIL)) {
                    vm = this.LJLJLLL;
                    if (vm == null) {
                        ViewModelProvider.Factory invoke = this.LJLJJL.invoke();
                        if (this.LJLILLLLZI != null) {
                            SharedViewModelProvider sharedViewModelProvider = new SharedViewModelProvider(invoke);
                            Lifecycle lifecycle = this.LJLJJI.invoke().getLifecycle();
                            o.LJIIIIZZ(lifecycle, "lifecycleProducer().lifecycle");
                            vm = (VM) sharedViewModelProvider.get(lifecycle, this.LJLILLLLZI.invoke(), C39557Ffl.LIZ(this.LJLIL));
                        } else {
                            SharedViewModelProvider sharedViewModelProvider2 = new SharedViewModelProvider(invoke);
                            Lifecycle lifecycle2 = this.LJLJJI.invoke().getLifecycle();
                            o.LJIIIIZZ(lifecycle2, "lifecycleProducer().lifecycle");
                            vm = (VM) sharedViewModelProvider2.get(lifecycle2, C39557Ffl.LIZ(this.LJLIL));
                        }
                        C214388bC.LIZ(vm, this.LJLJJI, this.LJLJL, this.LJLJLJ, this.LJLJI, this.LJLJJLL);
                        this.LJLJLLL = vm;
                    }
                }
            }
        } else {
            vm = this.LJLJLLL;
            if (vm == null) {
                ViewModelProvider.Factory invoke2 = this.LJLJJL.invoke();
                if (this.LJLILLLLZI != null) {
                    SharedViewModelProvider sharedViewModelProvider3 = new SharedViewModelProvider(invoke2);
                    Lifecycle lifecycle3 = this.LJLJJI.invoke().getLifecycle();
                    o.LJIIIIZZ(lifecycle3, "lifecycleProducer().lifecycle");
                    vm = (VM) sharedViewModelProvider3.get(lifecycle3, this.LJLILLLLZI.invoke(), C39557Ffl.LIZ(this.LJLIL));
                } else {
                    SharedViewModelProvider sharedViewModelProvider4 = new SharedViewModelProvider(invoke2);
                    Lifecycle lifecycle4 = this.LJLJJI.invoke().getLifecycle();
                    o.LJIIIIZZ(lifecycle4, "lifecycleProducer().lifecycle");
                    vm = (VM) sharedViewModelProvider4.get(lifecycle4, C39557Ffl.LIZ(this.LJLIL));
                }
                this.LJLJLLL = vm;
                C214388bC.LIZ(vm, this.LJLJJI, this.LJLJL, this.LJLJLJ, this.LJLJI, this.LJLJJLL);
            }
        }
        return vm;
    }

    @Override // X.C5H3
    public final boolean isInitialized() {
        if (this.LJLJLLL != null) {
            return true;
        }
        return false;
    }

    public C214378bB(C65776Prg c65776Prg, InterfaceC65784Pro interfaceC65784Pro, C214528bQ dispatcherFactory, AqS61S0110000_4 aqS61S0110000_4, InterfaceC65784Pro factoryProducer, InterfaceC88472Yns argumentsAcceptor, InterfaceC65784Pro interfaceC65784Pro2, InterfaceC65784Pro interfaceC65784Pro3) {
        o.LJIIIZ(dispatcherFactory, "dispatcherFactory");
        o.LJIIIZ(factoryProducer, "factoryProducer");
        o.LJIIIZ(argumentsAcceptor, "argumentsAcceptor");
        this.LJLIL = c65776Prg;
        this.LJLILLLLZI = interfaceC65784Pro;
        this.LJLJI = dispatcherFactory;
        this.LJLJJI = aqS61S0110000_4;
        this.LJLJJL = factoryProducer;
        this.LJLJJLL = argumentsAcceptor;
        this.LJLJL = interfaceC65784Pro2;
        this.LJLJLJ = interfaceC65784Pro3;
    }
}
