package X;

import Y.ARunnableS39S0100000_3;
import Y.AfS55S0100000_3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS63S0400000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8XD, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8XD extends C8XE implements C8XU {
    public volatile boolean LJLZ;
    public final C73849Syb<C8X4> LJZI;
    public boolean LJLL = true;
    public final LifecycleRegistry LJLLI = new LifecycleRegistry(this);
    public final ViewModelStore LJLLILLLL = new ViewModelStore();
    public QXX LJLLJ = C8X8.LJLIL;
    public C8XB LJLLL = C8XB.Silent;
    public final ConcurrentHashMap<InterfaceC65350Pko<?>, Object> LJLLLL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<InterfaceC65350Pko<?>, AssemViewModel<?>> LJLLLLLL = new ConcurrentHashMap<>();
    public boolean LJZ = true;

    @Override // X.C8XE
    public final void LJIIIZ() {
        this.LJLJJLL = true;
        if (true ^ this.LJLJLLL.isEmpty()) {
            Iterator<C8XE> it = this.LJLJLLL.iterator();
            while (it.hasNext()) {
                it.next().LJIIIZ();
            }
        }
        C212428Vi.LJ(new AqS153S0100000_3(this, 1502));
        this.LJLLLL.clear();
        this.LJLLLLLL.clear();
        this.LJLLILLLL.clear();
    }

    @Override // X.C8XE
    public final void LJIIJJI() {
        C8V7 c8v7;
        this.LJLZ = true;
        if (o.LJ(this.LJLJJI, C214368bA.LIZJ) && (c8v7 = C214368bA.LIZIZ) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onHostAttached, proxy: ");
            LIZ.append(this);
            c8v7.log("AssemList", X1D.LIZIZ(LIZ));
        }
        C73849Syb<C8X4> c73849Syb = this.LJZI;
        if (c73849Syb != null) {
            c73849Syb.onNext(new C8X4(C8X3.HOSTATTACH, this.LJLJI));
        }
        Iterator<C8XE> it = this.LJLJLLL.iterator();
        int i = 0;
        while (it.hasNext()) {
            C8XE next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                next.LJIIJJI();
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    @Override // X.C8XE
    public final void LJIIL() {
        C8V7 c8v7;
        this.LJLZ = false;
        if (o.LJ(this.LJLJJI, C214368bA.LIZJ) && (c8v7 = C214368bA.LIZIZ) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onHostDetached, proxy: ");
            LIZ.append(this);
            c8v7.log("AssemList", X1D.LIZIZ(LIZ));
        }
        C73849Syb<C8X4> c73849Syb = this.LJZI;
        if (c73849Syb != null) {
            c73849Syb.onNext(new C8X4(C8X3.HOSTDETACH, null));
        }
        Iterator<C8XE> it = this.LJLJLLL.iterator();
        while (it.hasNext()) {
            it.next().LJIIL();
        }
    }

    @Override // X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.C8XE
    public void LJIIIIZZ() {
        if (C16880lQ.LLJJIJIL(this.LJLLI.getCurrentState(), Lifecycle.State.CREATED) >= 0) {
            return;
        }
        C212428Vi.LJ(new AqS153S0100000_3(this, 1501));
        if (!this.LJLJLLL.isEmpty()) {
            Iterator<C8XE> it = this.LJLJLLL.iterator();
            while (it.hasNext()) {
                it.next().LJIIIIZZ();
            }
        }
    }

    @Override // X.C8XE
    public void LJIILL() {
        C8XO c8xo;
        InterfaceC55235Lm3 interfaceC55235Lm3 = this.LJLJI;
        if ((interfaceC55235Lm3 instanceof C8XO) && (c8xo = (C8XO) interfaceC55235Lm3) != null) {
            c8xo.unBind();
        }
        this.LJLJI = null;
        Iterator<C8XE> it = this.LJLJLLL.iterator();
        while (it.hasNext()) {
            it.next().LJIILL();
        }
    }

    public C8XD() {
        C73849Syb<C8X4> LJJZZI = C73849Syb.LJJZZI(new C8X4(C8X3.DEFAULT, null));
        this.LJZI = LJJZZI;
        new C73426Srm(LJJZZI).LJJJJZI(new AfS55S0100000_3(this, 41));
    }

    @Override // X.C8XU
    public final boolean AI() {
        return this.LJLL;
    }

    @Override // X.C8XE
    public final C73849Syb<C8X4> LJII() {
        return this.LJZI;
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

    @Override // X.C8XE
    public final void LJFF(int i, Object item) {
        o.LJIIIZ(item, "item");
        this.LJLIL = item;
        Iterator<C8XE> it = this.LJLJLLL.iterator();
        while (it.hasNext()) {
            it.next().LJFF(i, item);
        }
    }

    @Override // X.C8XE
    public final void LJIIJ(ReusedAssem<?> host, long j) {
        C8XE c8xe;
        o.LJIIIZ(host, "host");
        String valueOf = String.valueOf(host.hashCode());
        SZE.LIZ(valueOf, C65352Pkq.LIZ(C88497YoH.class));
        Iterator<C8XE> it = this.LJLJLLL.iterator();
        while (true) {
            if (it.hasNext()) {
                c8xe = it.next();
                C8XE c8xe2 = c8xe;
                if ((c8xe2 instanceof C8XF) && o.LJ(c8xe2.LJLJJI, C65352Pkq.LIZ(host.getClass()))) {
                    break;
                }
            } else {
                c8xe = null;
                break;
            }
        }
        C8XE c8xe3 = c8xe;
        if (c8xe3 == null) {
            c8xe3 = new C8XF();
            this.LJLJLLL.add(c8xe3);
            if (this.LJLZ) {
                c8xe3.LJIIJJI();
            }
        }
        Object obj = this.LJLIL;
        Object obj2 = this.LJLJL;
        C65777Prh.LJ(1, obj2);
        c8xe3.LIZLLL(host, obj, null, (InterfaceC88472Yns) obj2, this.LJLJJL);
        SZE.LIZIZ(C65352Pkq.LIZ(C88497YoH.class), valueOf, C8XP.LJLIL);
    }

    @Override // X.C8XE
    public final <VM extends AssemViewModel<S>, S extends C33Q, ITEM> void LJIILIIL(VM vm, InterfaceC88473Ynt<? super S, ? super ITEM, ? super List<? extends Object>, ? extends S> interfaceC88473Ynt) {
        C65776Prg LIZ = C65352Pkq.LIZ(vm.getClass());
        if (!this.LJLLLL.containsKey(LIZ)) {
            this.LJLLLL.put(LIZ, interfaceC88473Ynt);
            C8K7.LIZ("assem_vm", new AqS153S0100000_3((AssemViewModel) vm, 1503), false);
            this.LJLLLLLL.put(LIZ, vm);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILLIIL(List list, ReusedAssem host, Object obj, InterfaceC65784Pro interfaceC65784Pro) {
        C8XO c8xo;
        C8V7 c8v7;
        o.LJIIIZ(host, "host");
        this.LJLIL = obj;
        this.LJLJI = host;
        this.LJLJJL = interfaceC65784Pro;
        if (host instanceof C8XO) {
            c8xo = (C8XO) host;
        } else {
            c8xo = null;
        }
        LJIIIIZZ();
        C214368bA.LIZ().execute(new ARunnableS39S0100000_3((Object) new AqS63S0400000_3(host, (ReusedAssem<? extends C3C8>) c8xo, (C8XO<Object>) this, (C8XD) list, (List<? extends Object>) 5), 157));
        if (c8xo != null) {
            boolean c2 = c8xo.c2(this.LJLIL);
            host.LJLIL = c2;
            if (!c2) {
                host.H3();
            }
        }
        C73849Syb<C8X4> c73849Syb = this.LJZI;
        if (c73849Syb != null) {
            c73849Syb.onNext(new C8X4(C8X3.HOSTBIND, host));
        }
        if (o.LJ(this.LJLJJI, C214368bA.LIZJ) && (c8v7 = C214368bA.LIZIZ) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onHostBind, proxy: ");
            LIZ.append(this);
            c8v7.log("AssemList", X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.C8XE
    public final <T extends ReusedAssem<? extends C3C8>, ITEM> void LIZLLL(T host, ITEM item, List<? extends Object> list, InterfaceC88472Yns<? super ITEM, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<Integer> interfaceC65784Pro) {
        o.LJIIIZ(host, "host");
        this.LJLJI = null;
        if (this.LJLJJI == null) {
            this.LJLJJI = C65352Pkq.LIZ(host.getClass());
        }
        host.LJLJLJ = this;
        this.LJLJI = host;
        LJIILLIIL(list, host, item, interfaceC65784Pro);
        LJI(host, this, item, list, interfaceC88472Yns, interfaceC65784Pro);
    }
}
