package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS158S0100000_8;

/* loaded from: classes9.dex */
public final class JEV<VM extends ViewModel> implements C5H3<VM> {
    public final InterfaceC65350Pko<VM> LJLIL;
    public final C5H3<JEY> LJLJI;
    public VM LJLJJI;
    public final String LJLILLLLZI = null;
    public final java.util.Map<String, VM> LJLJJL = new LinkedHashMap();
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, (JEV<ViewModel>) 719));

    @Override // X.C5H3
    public final Object getValue() {
        String str = this.LJLILLLLZI;
        if (str != null) {
            ViewModel viewModel = ((ViewModelProvider) this.LJLJJLL.getValue()).get(str, C39557Ffl.LIZ(this.LJLIL));
            this.LJLJJL.put(str, viewModel);
            if (viewModel != null) {
                return viewModel;
            }
        }
        VM vm = (VM) ((ViewModelProvider) this.LJLJJLL.getValue()).get(C39557Ffl.LIZ(this.LJLIL));
        this.LJLJJI = vm;
        return vm;
    }

    @Override // X.C5H3
    public final boolean isInitialized() {
        if (this.LJLJJI != null || !this.LJLJJL.isEmpty()) {
            return true;
        }
        return false;
    }

    public JEV(C62822Ol8 c62822Ol8, C65776Prg c65776Prg) {
        this.LJLIL = c65776Prg;
        this.LJLJI = c62822Ol8;
    }
}
