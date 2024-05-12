package X;

import androidx.lifecycle.SharedViewModelProvider;
import androidx.lifecycle.ViewModel;

/* loaded from: classes9.dex */
public final class JEW<VM extends ViewModel> implements C5H3<VM> {
    public final C5H3<JEY> LJLIL;
    public final InterfaceC65350Pko<VM> LJLILLLLZI;
    public final String LJLJI = null;
    public boolean LJLJJI;

    @Override // X.C5H3
    public final Object getValue() {
        ViewModel viewModel;
        SharedViewModelProvider sharedViewModelProvider = new SharedViewModelProvider(this.LJLIL.getValue().getDefaultViewModelProviderFactory());
        String str = this.LJLJI;
        if (str == null || (viewModel = sharedViewModelProvider.get(str, (Class<ViewModel>) C39557Ffl.LIZ(this.LJLILLLLZI))) == null) {
            viewModel = sharedViewModelProvider.get(this.LJLIL.getValue().getLifecycle(), (Class<ViewModel>) C39557Ffl.LIZ(this.LJLILLLLZI));
        }
        this.LJLJJI = true;
        return viewModel;
    }

    @Override // X.C5H3
    public final boolean isInitialized() {
        return this.LJLJJI;
    }

    public JEW(C62822Ol8 c62822Ol8, C65776Prg c65776Prg) {
        this.LJLIL = c62822Ol8;
        this.LJLILLLLZI = c65776Prg;
    }
}
