package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JWF extends AbstractC65781Prl implements InterfaceC88474Ynu<SearchMixFeed, SearchMixFeed, SearchMixFeed, Integer, C76800UCe> {
    public final /* synthetic */ SearchJediMixFeedFragment LJLIL;
    public final /* synthetic */ C76732zl LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JWF(SearchJediMixFeedFragment searchJediMixFeedFragment, C76732zl c76732zl) {
        super(4);
        this.LJLIL = searchJediMixFeedFragment;
        this.LJLILLLLZI = c76732zl;
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(SearchMixFeed feed, SearchMixFeed searchMixFeed, SearchMixFeed searchMixFeed2, Integer num) {
        List<SearchMixFeed> items;
        C49825Jgz Dn;
        C49825Jgz Dn2;
        int intValue = num.intValue();
        o.LJIIIZ(feed, "feed");
        C49825Jgz Dn3 = this.LJLIL.Dn();
        if (Dn3 != null) {
            Dn3.deleteItem(feed);
        }
        if (searchMixFeed != null && (Dn2 = this.LJLIL.Dn()) != null) {
            Dn2.deleteItem(searchMixFeed);
        }
        if (searchMixFeed2 != null && (Dn = this.LJLIL.Dn()) != null) {
            Dn.deleteItem(searchMixFeed2);
        }
        C49825Jgz Dn4 = this.LJLIL.Dn();
        if (Dn4 != null && (items = Dn4.getItems()) != null) {
            int i = 0;
            for (SearchMixFeed item : items) {
                C49369JZd c49369JZd = C49369JZd.LIZ;
                o.LJIIIIZZ(item, "item");
                c49369JZd.getClass();
                if (C49369JZd.LIZIZ(item)) {
                    item.LJLILLLLZI = i;
                    i++;
                    o.LJ(item, feed);
                }
            }
        }
        this.LJLILLLLZI.element -= intValue;
        C48658J7u.LIZIZ("rd_ec_search_dynamic_add", C65232Piu.LIZJ(WM7.SCENE_SERVICE, "remove"));
        return C76800UCe.LIZ;
    }
}
