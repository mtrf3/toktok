package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JQJ implements InterfaceC49224JTo {
    public final RecyclerView LJLIL;
    public final /* synthetic */ JU8 LJLILLLLZI = new JU8();
    public JQX LJLJI;

    @Override // X.InterfaceC49224JTo
    public final void LLLLLILLIL() {
        this.LJLILLLLZI.LJLIL = null;
    }

    public JQJ(RecyclerView recyclerView) {
        this.LJLIL = recyclerView;
    }

    @Override // X.InterfaceC49224JTo
    public final void LLIIJI(JU3 eventDispatcher) {
        o.LJIIIZ(eventDispatcher, "eventDispatcher");
        JU8 ju8 = this.LJLILLLLZI;
        ju8.getClass();
        ju8.LJLIL = eventDispatcher;
    }
}
