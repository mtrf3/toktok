package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.8XE, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8XE implements C3C8, ViewModelStoreOwner, LifecycleOwner, C8YZ, InterfaceC212848Wy<C3C8> {
    public Object LJLIL;
    public ViewModelProvider LJLILLLLZI;
    public ReusedAssem<? extends C3C8> LJLJI;
    public C65776Prg LJLJJI;
    public InterfaceC65784Pro<Integer> LJLJJL;
    public boolean LJLJJLL;
    public Object LJLJL;
    public long LJLJLJ;
    public final CopyOnWriteArrayList<C8XE> LJLJLLL = new CopyOnWriteArrayList<>();

    public <T extends ReusedAssem<? extends C3C8>, ITEM> void LIZLLL(T host, ITEM item, List<? extends Object> list, InterfaceC88472Yns<? super ITEM, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<Integer> interfaceC65784Pro) {
        o.LJIIIZ(host, "host");
    }

    public abstract void LJFF(int i, Object obj);

    public abstract <T extends ReusedAssem<? extends C3C8>, ITEM> void LJI(T t, C8XE c8xe, ITEM item, List<? extends Object> list, InterfaceC88472Yns<? super ITEM, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<Integer> interfaceC65784Pro);

    public C73849Syb<C8X4> LJII() {
        return null;
    }

    public void LJIIIIZZ() {
    }

    public void LJIIIZ() {
        this.LJLJJLL = true;
    }

    public void LJIIJ(ReusedAssem<?> host, long j) {
        o.LJIIIZ(host, "host");
    }

    public void LJIIJJI() {
    }

    public void LJIIL() {
    }

    public <VM extends AssemViewModel<S>, S extends C33Q, ITEM> void LJIILIIL(VM vm, InterfaceC88473Ynt<? super S, ? super ITEM, ? super List<? extends Object>, ? extends S> interfaceC88473Ynt) {
    }

    public void LJIILJJIL(AssemViewModel<?> vm, Object obj) {
        o.LJIIIZ(vm, "vm");
    }

    public void LJIILL() {
    }
}
