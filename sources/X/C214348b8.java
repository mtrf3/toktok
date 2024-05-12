package X;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS71S1100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8b8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214348b8 {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LIZ;

    static {
        TBR tbr = new TBR(C214348b8.class, "vm", "<v#0>", 1);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        TBR tbr2 = new TBR(C214348b8.class, "vm", "<v#1>", 1);
        c65351Pkp.getClass();
        LIZ = new InterfaceC74236TBo[]{tbr, tbr2};
    }

    public static final C5H3 LIZIZ(final ReusedAssem reusedAssem, final C65776Prg c65776Prg, final InterfaceC88472Yns argumentsAcceptor) {
        o.LJIIIZ(reusedAssem, "<this>");
        o.LJIIIZ(argumentsAcceptor, "argumentsAcceptor");
        if (!C214368bA.LJIJJLI) {
            final C214458bJ c214458bJ = new C214458bJ(false);
            final C184077Kh c184077Kh = C184077Kh.LJLIL;
            final EnumC221088m0 enumC221088m0 = EnumC221088m0.SYNCHRONIZED;
            return new C5H3<VM>(c65776Prg, reusedAssem, c214458bJ, c184077Kh, argumentsAcceptor, enumC221088m0) { // from class: X.8b1
                public final InterfaceC65350Pko<VM> LJLIL;
                public final ReusedAssem<?> LJLILLLLZI;
                public final InterfaceC65784Pro<C8YR<S>> LJLJI;
                public final InterfaceC65784Pro<ViewModelProvider.Factory> LJLJJI;
                public final InterfaceC88472Yns<S, S> LJLJJL;
                public final EnumC221088m0 LJLJJLL;
                public VM LJLJL;

                @Override // X.C5H3
                public final Object getValue() {
                    VM vm = this.LJLJL;
                    if (vm == null) {
                        EnumC221088m0 enumC221088m02 = this.LJLJJLL;
                        if (enumC221088m02 == EnumC221088m0.SYNCHRONIZED) {
                            synchronized (C39557Ffl.LIZ(this.LJLIL)) {
                                VM vm2 = this.LJLJL;
                                if (vm2 == null) {
                                    return LIZ(this.LJLJJLL);
                                }
                                return vm2;
                            }
                        }
                        return LIZ(enumC221088m02);
                    }
                    return vm;
                }

                @Override // X.C5H3
                public final boolean isInitialized() {
                    if (this.LJLJL != null) {
                        return true;
                    }
                    return false;
                }

                public final VM LIZ(EnumC221088m0 enumC221088m02) {
                    final ViewModelStore viewModelStore;
                    C8W0 c8w0 = this.LJLILLLLZI;
                    while (!(c8w0.getParent() instanceof C8VZ)) {
                        LifecycleOwner parent = c8w0.getParent();
                        o.LJII(parent, "null cannot be cast to non-null type com.bytedance.assem.arch.reused.ReusedAssem<*>");
                        c8w0 = (C8W0) parent;
                    }
                    LifecycleOwner parent2 = c8w0.getParent();
                    Fragment LIZLLL = C212428Vi.LIZLLL(parent2);
                    if (LIZLLL != null) {
                        ViewModelProvider.Factory invoke = this.LJLJJI.invoke();
                        try {
                            viewModelStore = LIZLLL.getViewModelStore();
                        } catch (IllegalStateException unused) {
                            viewModelStore = new ViewModelStore();
                            FragmentManager fragmentManager = LIZLLL.getFragmentManager();
                            if (fragmentManager != null) {
                                fragmentManager.LJJLIL(new C08Z() { // from class: X.8b2
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
                        VM vm = (VM) new ViewModelProvider(viewModelStore, invoke, null, 4, null).get(this.LJLIL.LJFF() + parent2.hashCode(), C39557Ffl.LIZ(this.LJLIL));
                        vm.setLifecycleRef(new WeakReference<>(parent2.getLifecycle()));
                        C8K7.LIZ("assem_vm", new AqS150S0200000_3((AssemViewModel) vm, enumC221088m02, (EnumC221088m0) 102), false);
                        vm.initialize(this.LJLJI.invoke(), this.LJLJJL);
                        this.LJLJL = vm;
                        return vm;
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }

                {
                    o.LJIIIZ(reusedAssem, "host");
                    o.LJIIIZ(c184077Kh, "factoryProducer");
                    o.LJIIIZ(argumentsAcceptor, "argumentsAcceptor");
                    o.LJIIIZ(enumC221088m0, "safetyMode");
                    this.LJLIL = c65776Prg;
                    this.LJLILLLLZI = reusedAssem;
                    this.LJLJI = c214458bJ;
                    this.LJLJJI = c184077Kh;
                    this.LJLJJL = argumentsAcceptor;
                    this.LJLJJLL = enumC221088m0;
                }
            };
        }
        final InterfaceC115514g7 LJII = V2Q.LJII(reusedAssem, c65776Prg, C241249dQ.LIZ, argumentsAcceptor);
        return new C5H3<Object>() { // from class: X.8bE
            @Override // X.C5H3
            public final Object getValue() {
                return LJII.LIZ(null, C214348b8.LIZ[1]);
            }

            @Override // X.C5H3
            public final boolean isInitialized() {
                return ((AssemViewModel) LJII.LIZ(null, C214348b8.LIZ[1]))._initialized;
            }
        };
    }

    public static final C5H3 LIZJ(C8XZ c8xz, C65776Prg c65776Prg, InterfaceC88472Yns argumentsAcceptor, EnumC221088m0 safetyMode) {
        o.LJIIIZ(c8xz, "<this>");
        o.LJIIIZ(argumentsAcceptor, "argumentsAcceptor");
        o.LJIIIZ(safetyMode, "safetyMode");
        if (!C214368bA.LJIJJLI) {
            return new C214328b6(c65776Prg, new AqS71S1100000_3(c8xz, c65776Prg.LJFF(), 9), new C214458bJ(false), C78926UyI.LJJII(c8xz, false), c8xz, C184077Kh.LJLIL, argumentsAcceptor, c8xz.cq0(), safetyMode);
        }
        ReusedUIAssem<?> Yz = c8xz.Yz();
        if (Yz != null) {
            final InterfaceC115514g7 LJII = V2Q.LJII(Yz, c65776Prg, C241249dQ.LIZ, argumentsAcceptor);
            return new C5H3<Object>() { // from class: X.8bD
                @Override // X.C5H3
                public final Object getValue() {
                    return LJII.LIZ(null, C214348b8.LIZ[0]);
                }

                @Override // X.C5H3
                public final boolean isInitialized() {
                    return ((AssemViewModel) LJII.LIZ(null, C214348b8.LIZ[0]))._initialized;
                }
            };
        }
        "please implement the rootReusedAssem in your container".toString();
        throw new IllegalArgumentException("please implement the rootReusedAssem in your container");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.4g7, X.8b9] */
    public static final InterfaceC115514g7 LIZ(final ReusedAssem reusedAssem, final C65776Prg c65776Prg, AbstractC241239dP abstractC241239dP, final InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, final InterfaceC88472Yns argumentsAcceptor, InterfaceC88473Ynt interfaceC88473Ynt, InterfaceC88471Ynr interfaceC88471Ynr) {
        AbstractC84617XIv LIZ2;
        AbstractC241239dP abstractC241239dP2 = abstractC241239dP;
        InterfaceC65784Pro interfaceC65784Pro3 = interfaceC65784Pro2;
        o.LJIIIZ(reusedAssem, "<this>");
        o.LJIIIZ(argumentsAcceptor, "argumentsAcceptor");
        if (C214368bA.LJIJJLI) {
            if (abstractC241239dP2 == null) {
                abstractC241239dP2 = C241249dQ.LIZ;
            }
            return V2Q.LJI(reusedAssem, c65776Prg, abstractC241239dP2, interfaceC65784Pro, interfaceC65784Pro3, argumentsAcceptor, interfaceC88473Ynt, interfaceC88471Ynr);
        }
        if (abstractC241239dP2 == null) {
            abstractC241239dP2 = C241249dQ.LIZ;
        }
        final C214458bJ c214458bJ = new C214458bJ(true);
        if (interfaceC65784Pro3 == null) {
            interfaceC65784Pro3 = new AqS153S0100000_3((C8W0) reusedAssem, 1729);
        }
        final AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3((C8W0) reusedAssem, 1730);
        final AqS153S0100000_3 LJJIFFI = C78926UyI.LJJIFFI(reusedAssem);
        final C214238ax c214238ax = new C214238ax(reusedAssem, abstractC241239dP2, interfaceC65784Pro, c214458bJ, interfaceC65784Pro3, aqS153S0100000_3, LJJIFFI, argumentsAcceptor, interfaceC88471Ynr, interfaceC88473Ynt, c65776Prg);
        if (abstractC241239dP2 == null || o.LJ(abstractC241239dP2, C240999d1.LIZ) || o.LJ(abstractC241239dP2, C241249dQ.LIZ)) {
            if (o.LJ(c214238ax.LIZIZ(), C240999d1.LIZ)) {
                reusedAssem.LJLL = true;
            }
            reusedAssem.LJLJLLL.add(c214238ax);
        }
        final AbstractC241239dP abstractC241239dP3 = abstractC241239dP2;
        final InterfaceC65784Pro interfaceC65784Pro4 = interfaceC65784Pro3;
        ?? r1 = new InterfaceC115514g7<Object, Object>() { // from class: X.8b9
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v16, types: [androidx.lifecycle.LifecycleOwner, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v21, types: [X.8W0, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v38, types: [X.8W0, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v42, types: [X.8W0, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v2, types: [X.8W0, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v7, types: [X.8W0, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r9v0, types: [X.0VK, kotlin.jvm.internal.DefaultConstructorMarker] */
            /* JADX WARN: Type inference failed for: r9v8 */
            @Override // X.InterfaceC115514g7
            public final Object LIZ(Object obj, InterfaceC74236TBo property) {
                final ViewModelStore viewModelStore;
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                C7C3 c7c3;
                ViewModelProvider.Factory defaultViewModelProviderFactory2;
                C7C3 c7c32;
                o.LJIIIZ(property, "property");
                AbstractC241239dP abstractC241239dP4 = AbstractC241239dP.this;
                C8VA c8va = 0;
                C8VA c8va2 = null;
                if (o.LJ(abstractC241239dP4, C9BD.LIZ)) {
                    SZE.LIZ("default", C65352Pkq.LIZ(C88503YoN.class));
                    Context context = reusedAssem.getContext();
                    o.LJII(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    ViewModelStore viewModelStore2 = ((ComponentActivity) context).getViewModelStore();
                    o.LJIIIIZZ(viewModelStore2, "requireNotNull(context a…tActivity).viewModelStore");
                    InterfaceC65784Pro<ViewModelProvider.Factory> interfaceC65784Pro5 = interfaceC65784Pro4;
                    if (interfaceC65784Pro5 == null || (defaultViewModelProviderFactory2 = interfaceC65784Pro5.invoke()) == null) {
                        defaultViewModelProviderFactory2 = reusedAssem.getDefaultViewModelProviderFactory();
                    }
                    ViewModel viewModel = new ViewModelProvider(viewModelStore2, defaultViewModelProviderFactory2, c8va, 4, c8va).get(interfaceC65784Pro.invoke(), C39557Ffl.LIZ(c65776Prg));
                    ?? r8 = reusedAssem;
                    InterfaceC65784Pro<C7C3> interfaceC65784Pro6 = aqS153S0100000_3;
                    InterfaceC65784Pro<C8VA> interfaceC65784Pro7 = LJJIFFI;
                    InterfaceC65784Pro<C8YR<Object>> interfaceC65784Pro8 = c214458bJ;
                    InterfaceC88472Yns<Object, Object> interfaceC88472Yns = argumentsAcceptor;
                    AssemViewModel assemViewModel = (AssemViewModel) viewModel;
                    if (assemViewModel._initialized) {
                        return assemViewModel;
                    }
                    assemViewModel.setLifecycleRef(new WeakReference<>(r8.getLifecycle()));
                    if (interfaceC65784Pro6 != null) {
                        c7c32 = interfaceC65784Pro6.invoke();
                    } else {
                        c7c32 = null;
                    }
                    assemViewModel.hierarchyDataStore = c7c32;
                    if (interfaceC65784Pro7 != null) {
                        c8va2 = interfaceC65784Pro7.invoke();
                    }
                    assemViewModel.hierarchyServiceStore = c8va2;
                    assemViewModel.initialize(interfaceC65784Pro8.invoke(), interfaceC88472Yns);
                    SZE.LIZIZ(C65352Pkq.LIZ(C88503YoN.class), "default", new AqS153S0100000_3(c65776Prg, 1731));
                    return assemViewModel;
                }
                if (o.LJ(abstractC241239dP4, C9BE.LIZ)) {
                    SZE.LIZ("default", C65352Pkq.LIZ(C88503YoN.class));
                    Fragment LIZLLL = C212428Vi.LIZLLL(reusedAssem);
                    if (LIZLLL != null) {
                        try {
                            viewModelStore = LIZLLL.getViewModelStore();
                        } catch (IllegalStateException unused) {
                            viewModelStore = new ViewModelStore();
                            FragmentManager fragmentManager = LIZLLL.getFragmentManager();
                            if (fragmentManager != null) {
                                fragmentManager.LJJLIL(new C08Z() { // from class: X.8bG
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
                        o.LJIIIIZZ(viewModelStore, "try {\n                  …ore\n                    }");
                        InterfaceC65784Pro<ViewModelProvider.Factory> interfaceC65784Pro9 = interfaceC65784Pro4;
                        if (interfaceC65784Pro9 == null || (defaultViewModelProviderFactory = interfaceC65784Pro9.invoke()) == null) {
                            defaultViewModelProviderFactory = reusedAssem.getDefaultViewModelProviderFactory();
                        }
                        ViewModel viewModel2 = new ViewModelProvider(viewModelStore, defaultViewModelProviderFactory, c8va, 4, c8va).get(interfaceC65784Pro.invoke(), C39557Ffl.LIZ(c65776Prg));
                        ?? r82 = reusedAssem;
                        InterfaceC65784Pro<C7C3> interfaceC65784Pro10 = aqS153S0100000_3;
                        InterfaceC65784Pro<C8VA> interfaceC65784Pro11 = LJJIFFI;
                        InterfaceC65784Pro<C8YR<Object>> interfaceC65784Pro12 = c214458bJ;
                        InterfaceC88472Yns<Object, Object> interfaceC88472Yns2 = argumentsAcceptor;
                        AssemViewModel assemViewModel2 = (AssemViewModel) viewModel2;
                        if (assemViewModel2._initialized) {
                            return assemViewModel2;
                        }
                        assemViewModel2.setLifecycleRef(new WeakReference<>(r82.getLifecycle()));
                        if (interfaceC65784Pro10 != null) {
                            c7c3 = interfaceC65784Pro10.invoke();
                        } else {
                            c7c3 = null;
                        }
                        assemViewModel2.hierarchyDataStore = c7c3;
                        if (interfaceC65784Pro11 != null) {
                            c8va = interfaceC65784Pro11.invoke();
                        }
                        assemViewModel2.hierarchyServiceStore = c8va;
                        assemViewModel2.initialize(interfaceC65784Pro12.invoke(), interfaceC88472Yns2);
                        SZE.LIZIZ(C65352Pkq.LIZ(C88503YoN.class), "default", new AqS153S0100000_3(c65776Prg, 1732));
                        return assemViewModel2;
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (o.LJ(abstractC241239dP4, C240999d1.LIZ) || o.LJ(abstractC241239dP4, C241249dQ.LIZ) || abstractC241239dP4 == null) {
                    return c214238ax.LIZ();
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Don't support this VMScope: ");
                LIZ3.append(AbstractC241239dP.this);
                LIZ3.append(" there");
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ3));
            }
        };
        InterfaceC214468bK interfaceC214468bK = C214368bA.LJJII;
        if (interfaceC214468bK != 0 && (LIZ2 = interfaceC214468bK.LIZ(r1)) != null) {
            return LIZ2;
        }
        return r1;
    }
}
