package X;

import X.C33Q;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8b3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214298b3<S extends C33Q, VM extends AssemViewModel<S>> implements C5H3<VM> {
    public final InterfaceC65350Pko<VM> LJLIL;
    public final InterfaceC65784Pro<String> LJLILLLLZI;
    public final InterfaceC65784Pro<C8YR<S>> LJLJI;
    public final InterfaceC65784Pro<LifecycleOwner> LJLJJI;
    public final InterfaceC65784Pro<ViewModelStore> LJLJJL;
    public final InterfaceC65784Pro<ViewModelProvider.Factory> LJLJJLL;
    public final InterfaceC88472Yns<S, S> LJLJL;
    public final InterfaceC65784Pro<C7C3> LJLJLJ;
    public final InterfaceC65784Pro<C8VA> LJLJLLL;
    public VM LJLL;

    @Override // X.C5H3
    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final VM getValue() {
        VM vm = this.LJLL;
        if (vm == null) {
            if (C214368bA.LJI) {
                synchronized (C39557Ffl.LIZ(this.LJLIL)) {
                    VM vm2 = this.LJLL;
                    if (vm2 != null) {
                        return vm2;
                    }
                    return LIZIZ();
                }
            }
            return LIZIZ();
        }
        return vm;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final VM LIZIZ() {
        SZE.LIZ("default", C65352Pkq.LIZ(C88503YoN.class));
        C7C3 c7c3 = null;
        VM vm = (VM) new ViewModelProvider(this.LJLJJL.invoke(), this.LJLJJLL.invoke(), 0 == true ? 1 : 0, 4, 0 == true ? 1 : 0).get(this.LJLILLLLZI.invoke(), C39557Ffl.LIZ(this.LJLIL));
        vm.setLifecycleRef(new WeakReference<>(this.LJLJJI.invoke().getLifecycle()));
        InterfaceC65784Pro<C7C3> interfaceC65784Pro = this.LJLJLJ;
        C8VA c8va = null;
        if (interfaceC65784Pro != null) {
            c7c3 = interfaceC65784Pro.invoke();
        }
        vm.hierarchyDataStore = c7c3;
        InterfaceC65784Pro<C8VA> interfaceC65784Pro2 = this.LJLJLLL;
        if (interfaceC65784Pro2 != null) {
            c8va = interfaceC65784Pro2.invoke();
        }
        vm.hierarchyServiceStore = c8va;
        vm.initialize(this.LJLJI.invoke(), this.LJLJL);
        this.LJLL = vm;
        SZE.LIZIZ(C65352Pkq.LIZ(C88503YoN.class), "default", new AqS153S0100000_3(this, 1593));
        return vm;
    }

    @Override // X.C5H3
    public final boolean isInitialized() {
        if (this.LJLL != null) {
            return true;
        }
        return false;
    }

    public C214298b3(InterfaceC65784Pro keyFactory, InterfaceC65784Pro dispatcherFactory, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, InterfaceC65784Pro factoryProducer, InterfaceC65784Pro interfaceC65784Pro3, InterfaceC65784Pro interfaceC65784Pro4, InterfaceC88472Yns argumentsAcceptor, C65776Prg c65776Prg) {
        o.LJIIIZ(keyFactory, "keyFactory");
        o.LJIIIZ(dispatcherFactory, "dispatcherFactory");
        o.LJIIIZ(factoryProducer, "factoryProducer");
        o.LJIIIZ(argumentsAcceptor, "argumentsAcceptor");
        this.LJLIL = c65776Prg;
        this.LJLILLLLZI = keyFactory;
        this.LJLJI = dispatcherFactory;
        this.LJLJJI = interfaceC65784Pro;
        this.LJLJJL = interfaceC65784Pro2;
        this.LJLJJLL = factoryProducer;
        this.LJLJL = argumentsAcceptor;
        this.LJLJLJ = interfaceC65784Pro3;
        this.LJLJLLL = interfaceC65784Pro4;
    }

    public /* synthetic */ C214298b3(C65776Prg c65776Prg, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, InterfaceC65784Pro interfaceC65784Pro3, InterfaceC65784Pro interfaceC65784Pro4, InterfaceC65784Pro interfaceC65784Pro5, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro interfaceC65784Pro6, int i) {
        this(interfaceC65784Pro, interfaceC65784Pro2, interfaceC65784Pro3, interfaceC65784Pro4, interfaceC65784Pro5, (i & 128) != 0 ? null : interfaceC65784Pro6, (InterfaceC65784Pro) null, interfaceC88472Yns, c65776Prg);
    }
}
