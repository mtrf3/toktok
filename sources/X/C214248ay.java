package X;

import X.C33Q;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemViewModelWithItem;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.IDqS428S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8ay, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214248ay<S extends C33Q, VM extends AssemViewModel<S>, ITEM> implements InterfaceC212858Wz<S, VM> {
    public final AbstractC241239dP LIZ;
    public final ReusedAssem<?> LIZIZ;
    public final InterfaceC65350Pko<VM> LIZJ;
    public final InterfaceC65784Pro<String> LIZLLL;
    public final InterfaceC65784Pro<C8YR<S>> LJ;
    public final InterfaceC65784Pro<ViewModelProvider.Factory> LJFF;
    public final InterfaceC88472Yns<S, S> LJI;
    public final InterfaceC88473Ynt<S, ITEM, List<? extends Object>, S> LJII;
    public final InterfaceC88471Ynr<ITEM, S, ITEM> LJIIIIZZ;
    public final InterfaceC65784Pro<C7C3> LJIIIZ;
    public final InterfaceC65784Pro<C8VA> LJIIJ;

    @Override // X.InterfaceC212858Wz
    public final VM LIZ() {
        LifecycleOwner lifecycleOwner;
        VM LIZLLL;
        AssemViewModelWithItem assemViewModelWithItem;
        ViewModelStore viewModelStore;
        AssemViewModelWithItem assemViewModelWithItem2;
        if (o.LJ(this.LIZ, C241249dQ.LIZ)) {
            synchronized (this.LIZJ) {
            }
        }
        ReusedAssem<?> reusedAssem = this.LIZIZ;
        while (true) {
            Object obj = null;
            if (reusedAssem != null) {
                lifecycleOwner = reusedAssem.getParent();
            } else {
                lifecycleOwner = null;
            }
            if (lifecycleOwner instanceof C8XZ) {
                break;
            }
            if (reusedAssem != null) {
                obj = reusedAssem.getParent();
            }
            reusedAssem = (ReusedAssem) obj;
        }
        LifecycleOwner parent = reusedAssem.getParent();
        o.LJII(parent, "null cannot be cast to non-null type com.bytedance.ext_power_list.IAssemReusedContainer<*, *>");
        C8XZ c8xz = (C8XZ) parent;
        Fragment LIZLLL2 = C212428Vi.LIZLLL(c8xz);
        if (LIZLLL2 != null) {
            if (o.LJ(this.LIZ, C241249dQ.LIZ)) {
                SZE.LIZ("default", C65352Pkq.LIZ(C88503YoN.class));
                if (C214368bA.LJIJJLI) {
                    viewModelStore = c8xz.Yb();
                } else {
                    try {
                        viewModelStore = LIZLLL2.getViewModelStore();
                    } catch (IllegalStateException unused) {
                        viewModelStore = new ViewModelStore();
                    }
                    o.LJIIIIZZ(viewModelStore, "{\n                    tr…      }\n                }");
                }
                String invoke = this.LIZLLL.invoke();
                Lifecycle lifecycle = c8xz.getLifecycle();
                o.LJIIIIZZ(lifecycle, "component.lifecycle");
                LIZLLL = LIZLLL(LIZLLL2, viewModelStore, invoke, lifecycle);
                if ((LIZLLL instanceof AssemViewModelWithItem) && (assemViewModelWithItem2 = (AssemViewModelWithItem) LIZLLL) != null) {
                    assemViewModelWithItem2.LJLIL = this.LIZIZ.LJLJLJ;
                }
                LIZLLL.useOwnerLifecycle = true;
                InterfaceC88473Ynt<S, ITEM, List<? extends Object>, S> first = LIZIZ(LIZLLL).getFirst();
                if (first != null) {
                    if (!C214368bA.LJIJJ) {
                        reusedAssem = this.LIZIZ;
                    }
                    reusedAssem.LJLJL.LIZ(LIZLLL, first, this.LIZIZ.LJLJLJ);
                }
                SZE.LIZIZ(C65352Pkq.LIZ(C88503YoN.class), "default", new AqS153S0100000_3(this, 1736));
            } else {
                SZE.LIZ("default", C65352Pkq.LIZ(C88503YoN.class));
                C8XE c8xe = reusedAssem.LJLJLJ;
                if (c8xe != null) {
                    ViewModelStore viewModelStore2 = c8xe.getViewModelStore();
                    o.LJIIIIZZ(viewModelStore2, "currentProxy.viewModelStore");
                    String invoke2 = this.LIZLLL.invoke();
                    Lifecycle lifecycle2 = c8xe.getLifecycle();
                    o.LJIIIIZZ(lifecycle2, "currentProxy.lifecycle");
                    LIZLLL = LIZLLL(LIZLLL2, viewModelStore2, invoke2, lifecycle2);
                    if ((LIZLLL instanceof AssemViewModelWithItem) && (assemViewModelWithItem = (AssemViewModelWithItem) LIZLLL) != null) {
                        assemViewModelWithItem.LJLIL = c8xe;
                    }
                    LIZLLL.usedInReusedScene = true;
                    OSZ<InterfaceC88473Ynt<S, ITEM, List<? extends Object>, S>, InterfaceC88471Ynr<ITEM, S, ITEM>> LIZIZ = LIZIZ(LIZLLL);
                    InterfaceC88473Ynt<S, ITEM, List<? extends Object>, S> first2 = LIZIZ.getFirst();
                    InterfaceC88471Ynr<ITEM, S, ITEM> second = LIZIZ.getSecond();
                    if (first2 != null) {
                        c8xe.LJIILIIL(LIZLLL, first2);
                    }
                    Object obj2 = c8xe.LJLJL;
                    if (obj2 != null && second != null) {
                        LIZLLL.syncState2Item(c8xe.LJLIL, second, obj2);
                    }
                    SZE.LIZIZ(C65352Pkq.LIZ(C88503YoN.class), "default", new AqS153S0100000_3(this, 1737));
                } else {
                    "proxy not bound to Assem yet".toString();
                    throw new IllegalArgumentException("proxy not bound to Assem yet");
                }
            }
            return LIZLLL;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        AbstractC241239dP abstractC241239dP = this.LIZ;
        int i = 0;
        if (abstractC241239dP == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC241239dP.hashCode();
        }
        int LIZLLL = C1JX.LIZLLL(this.LJ, C1JX.LIZLLL(this.LIZLLL, (this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (hashCode * 31)) * 31)) * 31, 31), 31);
        InterfaceC65784Pro<ViewModelProvider.Factory> interfaceC65784Pro = this.LJFF;
        if (interfaceC65784Pro == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = interfaceC65784Pro.hashCode();
        }
        int LIZIZ = QZY.LIZIZ(this.LJI, (LIZLLL + hashCode2) * 31, 31);
        InterfaceC88473Ynt<S, ITEM, List<? extends Object>, S> interfaceC88473Ynt = this.LJII;
        if (interfaceC88473Ynt == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = interfaceC88473Ynt.hashCode();
        }
        int i2 = (LIZIZ + hashCode3) * 31;
        InterfaceC88471Ynr<ITEM, S, ITEM> interfaceC88471Ynr = this.LJIIIIZZ;
        if (interfaceC88471Ynr == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = interfaceC88471Ynr.hashCode();
        }
        int i3 = (i2 + hashCode4) * 31;
        InterfaceC65784Pro<C7C3> interfaceC65784Pro2 = this.LJIIIZ;
        if (interfaceC65784Pro2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = interfaceC65784Pro2.hashCode();
        }
        int i4 = (i3 + hashCode5) * 31;
        InterfaceC65784Pro<C8VA> interfaceC65784Pro3 = this.LJIIJ;
        if (interfaceC65784Pro3 != null) {
            i = interfaceC65784Pro3.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        return "ListScopeViewModelProvideData(scope=" + this.LIZ + ", host=" + this.LIZIZ + ", viewModelClass=" + this.LIZJ + ", keyFactory=" + this.LIZLLL + ", dispatcherFactory=" + this.LJ + ", factoryProducer=" + this.LJFF + ", argumentsAcceptor=" + this.LJI + ", itemSync2StateAcceptor=" + this.LJII + ", state2ItemAcceptor=" + this.LJIIIIZZ + ", hierarchyDataStore=" + this.LJIIIZ + ", hierarchyServiceStore=" + this.LJIIJ + ')';
    }

    public final AbstractC241239dP LIZJ() {
        return this.LIZ;
    }

    public final OSZ<InterfaceC88473Ynt<S, ITEM, List<? extends Object>, S>, InterfaceC88471Ynr<ITEM, S, ITEM>> LIZIZ(VM vm) {
        C8YE c8ye;
        Object obj = this.LJII;
        Object obj2 = this.LJIIIIZZ;
        if ((vm instanceof C8YE) && (c8ye = (C8YE) vm) != null) {
            obj = new IDqS428S0100000_3(c8ye, 18);
            obj2 = new AqS185S0100000_3(c8ye, 222);
        }
        return new OSZ<>(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C214248ay)) {
            return false;
        }
        C214248ay c214248ay = (C214248ay) obj;
        if (o.LJ(this.LIZ, c214248ay.LIZ) && o.LJ(this.LIZIZ, c214248ay.LIZIZ) && o.LJ(this.LIZJ, c214248ay.LIZJ) && o.LJ(this.LIZLLL, c214248ay.LIZLLL) && o.LJ(this.LJ, c214248ay.LJ) && o.LJ(this.LJFF, c214248ay.LJFF) && o.LJ(this.LJI, c214248ay.LJI) && o.LJ(this.LJII, c214248ay.LJII) && o.LJ(this.LJIIIIZZ, c214248ay.LJIIIIZZ) && o.LJ(this.LJIIIZ, c214248ay.LJIIIZ) && o.LJ(this.LJIIJ, c214248ay.LJIIJ)) {
            return true;
        }
        return false;
    }

    public final VM LIZLLL(Fragment fragment, final ViewModelStore viewModelStore, String str, Lifecycle lifecycle) {
        ViewModelProvider.Factory newInstanceFactory;
        C7C3 c7c3;
        VM vm;
        ViewModelStore viewModelStore2;
        FragmentManager fragmentManager;
        synchronized (viewModelStore) {
            InterfaceC65784Pro<ViewModelProvider.Factory> interfaceC65784Pro = this.LJFF;
            if (interfaceC65784Pro == null || (newInstanceFactory = interfaceC65784Pro.invoke()) == null) {
                newInstanceFactory = new ViewModelProvider.NewInstanceFactory();
            }
            c7c3 = null;
            vm = (VM) new ViewModelProvider(viewModelStore, newInstanceFactory, null, 4, null).get(str, C39557Ffl.LIZ(this.LIZJ));
        }
        C8VA c8va = null;
        try {
            viewModelStore2 = fragment.getViewModelStore();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            viewModelStore2 = null;
        }
        if (!o.LJ(viewModelStore2, viewModelStore) && (fragmentManager = fragment.getFragmentManager()) != null) {
            fragmentManager.LJJLIL(new C08Z() { // from class: X.8az
                @Override // X.C08Z
                public final void onFragmentDestroyed(FragmentManager fm, Fragment f) {
                    o.LJIIIZ(fm, "fm");
                    o.LJIIIZ(f, "f");
                    super.onFragmentDestroyed(fm, f);
                    ViewModelStore.this.clear();
                }
            }, false);
        }
        if (!vm._initialized) {
            vm.setLifecycleRef(new WeakReference<>(lifecycle));
            vm.initialize(this.LJ.invoke(), this.LJI);
            InterfaceC65784Pro<C7C3> interfaceC65784Pro2 = this.LJIIIZ;
            if (interfaceC65784Pro2 != null) {
                c7c3 = interfaceC65784Pro2.invoke();
            }
            vm.hierarchyDataStore = c7c3;
            InterfaceC65784Pro<C8VA> interfaceC65784Pro3 = this.LJIIJ;
            if (interfaceC65784Pro3 != null) {
                c8va = interfaceC65784Pro3.invoke();
            }
            vm.hierarchyServiceStore = c8va;
        }
        return vm;
    }

    public C214248ay(ReusedAssem host, AbstractC241239dP abstractC241239dP, InterfaceC65784Pro keyFactory, C214458bJ c214458bJ, InterfaceC65784Pro interfaceC65784Pro, AqS153S0100000_3 aqS153S0100000_3, AqS153S0100000_3 aqS153S0100000_32, InterfaceC88472Yns argumentsAcceptor, InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC88473Ynt interfaceC88473Ynt, C65776Prg c65776Prg) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(keyFactory, "keyFactory");
        o.LJIIIZ(argumentsAcceptor, "argumentsAcceptor");
        this.LIZ = abstractC241239dP;
        this.LIZIZ = host;
        this.LIZJ = c65776Prg;
        this.LIZLLL = keyFactory;
        this.LJ = c214458bJ;
        this.LJFF = interfaceC65784Pro;
        this.LJI = argumentsAcceptor;
        this.LJII = interfaceC88473Ynt;
        this.LJIIIIZZ = interfaceC88471Ynr;
        this.LJIIIZ = aqS153S0100000_3;
        this.LJIIJ = aqS153S0100000_32;
    }
}
