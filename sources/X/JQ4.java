package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class JQ4<V> implements Callable {
    public final /* synthetic */ SearchAwemeCardViewHolder LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public JQ4(SearchAwemeCardViewHolder searchAwemeCardViewHolder, Aweme aweme, int i) {
        this.LJLIL = searchAwemeCardViewHolder;
        this.LJLILLLLZI = aweme;
        this.LJLJI = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.LJLIL.LJJ(this.LJLILLLLZI, Integer.valueOf(this.LJLJI)).LJIILIIL();
        return C76800UCe.LIZ;
    }
}
