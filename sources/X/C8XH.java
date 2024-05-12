package X;

import Y.ARunnableS14S0300000_3;
import Y.ARunnableS22S0200000_3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.8XH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8XH extends C8XE implements InterfaceC73396SrI {
    public volatile boolean LJLL;
    public boolean LJLLJ;
    public long LJLLL;
    public final LifecycleRegistry LJLLI = new LifecycleRegistry(this);
    public final ViewModelStore LJLLILLLL = new ViewModelStore();
    public final ConcurrentHashMap<InterfaceC65350Pko<?>, Object> LJLLLL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<InterfaceC65350Pko<?>, AssemViewModel<?>> LJLLLLLL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<AssemViewModel<?>, Object> LJLZ = new ConcurrentHashMap<>();
    public final CopyOnWriteArrayList<C8XK> LJZ = new CopyOnWriteArrayList<>();
    public final List<InterfaceC88472Yns<Boolean, C76800UCe>> LJZI = new CopyOnWriteArrayList();

    @Override // X.C8XE
    public final void LJIIIZ() {
        this.LJLJJLL = true;
        LJIIL();
        this.LJLLLL.clear();
        this.LJLLLLLL.clear();
        this.LJLLILLLL.clear();
    }

    @Override // X.C8XE
    public final void LJIIJJI() {
        this.LJLL = true;
        Iterator<InterfaceC88472Yns<Boolean, C76800UCe>> it = this.LJZI.iterator();
        while (it.hasNext()) {
            it.next().invoke(Boolean.TRUE);
        }
    }

    @Override // X.C8XE
    public final void LJIIL() {
        this.LJLL = false;
        Iterator<InterfaceC88472Yns<Boolean, C76800UCe>> it = this.LJZI.iterator();
        while (it.hasNext()) {
            it.next().invoke(Boolean.FALSE);
        }
    }

    @Override // X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.C8XE
    public final void LJIILL() {
        ReusedAssem<? extends C3C8> reusedAssem = this.LJLJI;
        if (reusedAssem == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        LJIILLIIL(reusedAssem, arrayList);
        LJIIZILJ(new C8XJ(this), arrayList);
        this.LJLJI = null;
    }

    @Override // X.InterfaceC73396SrI
    public final boolean LIZIZ() {
        return this.LJLL;
    }

    @Override // X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this.LJLJI;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final /* bridge */ /* synthetic */ Lifecycle getLifecycle() {
        return this.LJLLI;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        return this.LJLLILLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIJI(ReusedAssem reusedAssem) {
        boolean z;
        C8XO c8xo;
        reusedAssem.LJLIL = false;
        if ((reusedAssem instanceof C8XO) && (c8xo = (C8XO) reusedAssem) != null) {
            z = c8xo.c2(reusedAssem.v3());
        } else {
            z = true;
        }
        reusedAssem.LJLIL = z;
        if (!z) {
            reusedAssem.H3();
        }
        reusedAssem.K3(false);
    }

    @Override // X.InterfaceC73396SrI
    public final void LIZ(AqS178S0100000_12 listener) {
        o.LJIIIZ(listener, "listener");
        ((CopyOnWriteArrayList) this.LJZI).remove(listener);
    }

    @Override // X.InterfaceC73396SrI
    public final void LIZJ(AqS178S0100000_12 aqS178S0100000_12) {
        ((CopyOnWriteArrayList) this.LJZI).add(aqS178S0100000_12);
        aqS178S0100000_12.invoke(Boolean.valueOf(this.LJLL));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIJ(ReusedAssem<?> reusedAssem) {
        C8XK c8xk;
        reusedAssem.LJLJLJ = this;
        if (reusedAssem.LJLL) {
            Iterator<C8XK> it = this.LJZ.iterator();
            while (true) {
                if (it.hasNext()) {
                    c8xk = it.next();
                    if (o.LJ(c8xk.LJLIL, C65352Pkq.LIZ(reusedAssem.getClass()))) {
                        break;
                    }
                } else {
                    c8xk = null;
                    break;
                }
            }
            C8XK c8xk2 = c8xk;
            if (c8xk2 == null) {
                c8xk2 = new C8XK();
                c8xk2.LJLIL = C65352Pkq.LIZ(reusedAssem.getClass());
                this.LJZ.add(c8xk2);
            }
            reusedAssem.LJLLI = c8xk2;
            c8xk2.LJLILLLLZI = reusedAssem;
        }
    }

    public static void LJIILLIIL(ReusedAssem reusedAssem, List list) {
        ReusedAssem reusedAssem2;
        ((ArrayList) list).add(reusedAssem);
        List<C8W0> children = reusedAssem.getChildren();
        if (children != null) {
            for (C8W0 c8w0 : children) {
                o.LJIIIZ(c8w0, "<this>");
                if ((c8w0 instanceof ReusedAssem) && (reusedAssem2 = (ReusedAssem) c8w0) != null) {
                    LJIILLIIL(reusedAssem2, list);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
        }
    }

    @Override // X.C8XE
    public final void LJFF(int i, Object item) {
        o.LJIIIZ(item, "item");
        this.LJLIL = item;
    }

    @Override // X.C8XE
    public final void LJIIJ(ReusedAssem<?> assem, long j) {
        o.LJIIIZ(assem, "assem");
        String LIZ = C8XR.LIZ(this);
        SZE.LIZ(LIZ, C65352Pkq.LIZ(C88497YoH.class));
        LJIJ(assem);
        if (this.LJLL) {
            LJIJI(assem);
            ReusedAssem.I3(assem, C8X3.HOSTATTACH, false, false, 6);
        } else {
            if (!this.LJLJJLL) {
                LJIJI(assem);
            }
            C8V7 c8v7 = C214368bA.LIZIZ;
            if (c8v7 != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("assem: ");
                LIZ2.append(assem);
                LIZ2.append(" initializeHost, notAttached, ");
                LIZ2.append(j);
                LIZ2.append(", ");
                LIZ2.append(this.LJLJLJ);
                LIZ2.append("}, ");
                LIZ2.append(this.LJLJJLL);
                c8v7.log("AssemList", X1D.LIZIZ(LIZ2));
            }
        }
        C214368bA.LIZ().execute(new ARunnableS22S0200000_3(this, assem, 51));
        SZE.LIZIZ(C65352Pkq.LIZ(C88497YoH.class), LIZ, C8XQ.LJLIL);
    }

    @Override // X.C8XE
    public final <VM extends AssemViewModel<S>, S extends C33Q, ITEM> void LJIILIIL(VM vm, InterfaceC88473Ynt<? super S, ? super ITEM, ? super List<? extends Object>, ? extends S> interfaceC88473Ynt) {
        C65776Prg LIZ = C65352Pkq.LIZ(vm.getClass());
        if (!this.LJLLLL.containsKey(LIZ)) {
            LJIILJJIL(vm, interfaceC88473Ynt);
            this.LJLLLL.put(LIZ, interfaceC88473Ynt);
            C8K7.LIZ("assem_vm", new AqS153S0100000_3((AssemViewModel) vm, 1533), false);
            this.LJLLLLLL.put(LIZ, vm);
        }
    }

    @Override // X.C8XE
    public final void LJIILJJIL(AssemViewModel<?> vm, Object obj) {
        o.LJIIIZ(vm, "vm");
        if (vm.maxScheduledGeneration != this.LJLLL) {
            this.LJLZ.put(vm, obj);
        }
    }

    public final void LJIIZILJ(InterfaceC88472Yns interfaceC88472Yns, List list) {
        ReusedAssem<? extends C3C8> reusedAssem = this.LJLJI;
        if (reusedAssem == null) {
            return;
        }
        interfaceC88472Yns.invoke(reusedAssem);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            interfaceC88472Yns.invoke(it.next());
        }
    }

    @Override // X.C8XE
    public final <T extends ReusedAssem<? extends C3C8>, ITEM> void LIZLLL(T host, ITEM item, List<? extends Object> list, InterfaceC88472Yns<? super ITEM, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<Integer> interfaceC65784Pro) {
        o.LJIIIZ(host, "host");
        this.LJLJI = null;
        if (this.LJLJJI == null) {
            this.LJLJJI = C65352Pkq.LIZ(host.getClass());
        }
        this.LJLJLJ++;
        this.LJLIL = item;
        this.LJLJI = host;
        this.LJLJL = interfaceC88472Yns;
        this.LJLJJL = interfaceC65784Pro;
        ArrayList arrayList = new ArrayList();
        LJIILLIIL(host, arrayList);
        LJIIZILJ(new C8XM(this), arrayList);
        LJIIZILJ(new C8XL(this), arrayList);
        C214368bA.LIZ().execute(new ARunnableS14S0300000_3(this, arrayList, list, 7));
    }
}
