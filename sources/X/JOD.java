package X;

import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JOD implements InterfaceC49224JTo {
    public final InterfaceC49148JQq LJLIL;
    public final /* synthetic */ JU8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    public final boolean equals(Object obj) {
        return true;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // X.InterfaceC49224JTo
    public final void LLLLLILLIL() {
        this.LJLILLLLZI.LJLIL = null;
    }

    public JOD(SearchVideoHolder host) {
        o.LJIIIZ(host, "host");
        this.LJLIL = host;
        this.LJLILLLLZI = new JU8();
        this.LJLJI = C221108m2.LIZIZ(C2VH.LJLIL);
    }

    @Override // X.InterfaceC49224JTo
    public final void LLIIJI(JU3 eventDispatcher) {
        o.LJIIIZ(eventDispatcher, "eventDispatcher");
        JU8 ju8 = this.LJLILLLLZI;
        ju8.getClass();
        ju8.LJLIL = eventDispatcher;
    }
}
