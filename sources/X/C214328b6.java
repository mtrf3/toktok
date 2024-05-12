package X;

import X.C33Q;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS61S0110000_4;
import kotlin.jvm.internal.AqS71S1100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8b6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214328b6<S extends C33Q, VM extends AssemViewModel<S>> implements C5H3<VM> {
    public final InterfaceC65350Pko<VM> LJLIL;
    public final InterfaceC65784Pro<String> LJLILLLLZI;
    public final InterfaceC65784Pro<C8YR<S>> LJLJI;
    public final InterfaceC65784Pro<LifecycleOwner> LJLJJI;
    public final LifecycleOwner LJLJJL;
    public final InterfaceC65784Pro<ViewModelProvider.Factory> LJLJJLL;
    public final InterfaceC88472Yns<S, S> LJLJL;
    public final InterfaceC214448bI LJLJLJ;
    public final EnumC221088m0 LJLJLLL;
    public VM LJLL;

    public final VM LIZ() {
        final ViewModelStore viewModelStore;
        java.util.Set<AssemViewModel<?>> LIZ;
        SZE.LIZ("default", C65352Pkq.LIZ(C88503YoN.class));
        ViewModelProvider.Factory invoke = this.LJLJJLL.invoke();
        Fragment LIZLLL = C212428Vi.LIZLLL(this.LJLJJL);
        if (LIZLLL != null) {
            try {
                viewModelStore = LIZLLL.getViewModelStore();
            } catch (IllegalStateException unused) {
                viewModelStore = new ViewModelStore();
                FragmentManager fragmentManager = LIZLLL.getFragmentManager();
                if (fragmentManager != null) {
                    fragmentManager.LJJLIL(new C08Z() { // from class: X.8b7
                        @Override // X.C08Z
                        public final void onFragmentDestroyed(FragmentManager fm, Fragment f) {
                            o.LJIIIZ(fm, "fm");
                            o.LJIIIZ(f, "f");
                            super.onFragmentDestroyed(fm, f);
                            ViewModelStore.this.clear();
                        }
                    }, false);
                }
            }
            o.LJIIIIZZ(viewModelStore, "try {\n            // may… viewModelStore\n        }");
            VM vm = (VM) new ViewModelProvider(viewModelStore, invoke, null, 4, null).get(this.LJLILLLLZI.invoke(), C39557Ffl.LIZ(this.LJLIL));
            vm.setLifecycleRef(new WeakReference<>(this.LJLJJI.invoke().getLifecycle()));
            vm.initialize(this.LJLJI.invoke(), this.LJLJL);
            InterfaceC214448bI interfaceC214448bI = this.LJLJLJ;
            if (interfaceC214448bI != null && (LIZ = interfaceC214448bI.LIZ()) != null) {
                LIZ.add(vm);
            }
            this.LJLL = vm;
            SZE.LIZIZ(C65352Pkq.LIZ(C88503YoN.class), "default", new AqS153S0100000_3(this, 1728));
            return vm;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.C5H3
    public final Object getValue() {
        VM vm = this.LJLL;
        if (vm != null) {
            return vm;
        }
        if (this.LJLJLLL == EnumC221088m0.SYNCHRONIZED) {
            synchronized (this.LJLIL) {
                VM vm2 = this.LJLL;
                if (vm2 != null) {
                    return vm2;
                }
                return LIZ();
            }
        }
        return LIZ();
    }

    @Override // X.C5H3
    public final boolean isInitialized() {
        if (this.LJLL != null) {
            return true;
        }
        return false;
    }

    public C214328b6(C65776Prg c65776Prg, AqS71S1100000_3 aqS71S1100000_3, C214458bJ c214458bJ, AqS61S0110000_4 aqS61S0110000_4, LifecycleOwner host, InterfaceC65784Pro factoryProducer, InterfaceC88472Yns argumentsAcceptor, InterfaceC214448bI interfaceC214448bI, EnumC221088m0 safetyMode) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(factoryProducer, "factoryProducer");
        o.LJIIIZ(argumentsAcceptor, "argumentsAcceptor");
        o.LJIIIZ(safetyMode, "safetyMode");
        this.LJLIL = c65776Prg;
        this.LJLILLLLZI = aqS71S1100000_3;
        this.LJLJI = c214458bJ;
        this.LJLJJI = aqS61S0110000_4;
        this.LJLJJL = host;
        this.LJLJJLL = factoryProducer;
        this.LJLJL = argumentsAcceptor;
        this.LJLJLJ = interfaceC214448bI;
        this.LJLJLLL = safetyMode;
    }
}
