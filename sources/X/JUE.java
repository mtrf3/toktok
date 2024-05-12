package X;

import Y.AObserverS76S0100000_8;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JUE implements InterfaceC49224JTo {
    public final LifecycleOwner LJLIL;
    public final /* synthetic */ JUF LJLILLLLZI = new JUF();
    public final C62822Ol8 LJLJI;

    @Override // X.InterfaceC49224JTo
    public final void LLLLLILLIL() {
        this.LJLILLLLZI.LJLIL = null;
    }

    @Override // X.InterfaceC49224JTo
    public final void LLIIJI(JU3 eventDispatcher) {
        o.LJIIIZ(eventDispatcher, "eventDispatcher");
        JUF juf = this.LJLILLLLZI;
        juf.getClass();
        juf.LJLIL = eventDispatcher;
    }

    public JUE(SearchStateViewModel searchStateViewModel, SearchFragment searchFragment) {
        this.LJLIL = searchFragment;
        searchStateViewModel.tacoClearPlayData.observe(searchFragment, new AObserverS76S0100000_8(this, 126));
        this.LJLJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 642));
    }
}
