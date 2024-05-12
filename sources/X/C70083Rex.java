package X;

import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Rex, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C70083Rex<VM extends ViewModel> implements InterfaceC72023SOl<VM> {
    public VM LJLIL;

    public final VM LIZ() {
        VM vm = this.LJLIL;
        if (vm != null) {
            return vm;
        }
        o.LJIJI("viewModel");
        throw null;
    }

    @Override // X.InterfaceC72023SOl
    public final void Hb(Object obj) {
        VM vm = (VM) obj;
        o.LJIIIZ(vm, "<set-?>");
        this.LJLIL = vm;
    }
}
