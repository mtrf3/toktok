package X;

import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.pages.choosemusic.sug.core.ui.SearchMusicSugFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KI9 implements InterfaceC57784Mm4 {
    public final SearchSugEntity LJLIL;
    public final KIQ LJLILLLLZI;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof KI9) {
            return o.LJ(this.LJLIL.content, ((KI9) interfaceC57784Mm4).LJLIL.content);
        }
        return false;
    }

    public KI9(SearchSugEntity searchSugEntity, SearchMusicSugFragment searchMusicSugFragment) {
        this.LJLIL = searchSugEntity;
        this.LJLILLLLZI = searchMusicSugFragment;
    }
}
