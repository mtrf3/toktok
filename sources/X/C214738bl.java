package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import kotlin.jvm.internal.o;

/* renamed from: X.8bl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214738bl<VM extends ViewModel> implements C5H3<VM> {
    public final InterfaceC65350Pko<VM> LJLIL;
    public final InterfaceC65784Pro<ViewModelStore> LJLILLLLZI;
    public final InterfaceC65784Pro<ViewModelProvider.Factory> LJLJI;
    public VM LJLJJI;

    @Override // X.C5H3
    public final Object getValue() {
        VM vm = this.LJLJJI;
        if (vm == null) {
            VM vm2 = (VM) new ViewModelProvider(this.LJLILLLLZI.invoke(), this.LJLJI.invoke()).get(C39557Ffl.LIZ(this.LJLIL));
            this.LJLJJI = vm2;
            o.LJIIIIZZ(vm2, "{\n                val fa…          }\n            }");
            return vm2;
        }
        return vm;
    }

    @Override // X.C5H3
    public final boolean isInitialized() {
        if (this.LJLJJI != null) {
            return true;
        }
        return false;
    }

    public C214738bl(C65776Prg c65776Prg, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2) {
        this.LJLIL = c65776Prg;
        this.LJLILLLLZI = interfaceC65784Pro;
        this.LJLJI = interfaceC65784Pro2;
    }
}
