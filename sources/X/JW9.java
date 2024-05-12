package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JW9 extends AbstractC65781Prl implements InterfaceC88475Ynv<SearchMixFeed, SearchMixFeed, SearchMixFeed, SearchMixFeed, Integer, C76800UCe> {
    public final /* synthetic */ SearchJediMixFeedFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JW9(SearchJediMixFeedFragment searchJediMixFeedFragment) {
        super(5);
        this.LJLIL = searchJediMixFeedFragment;
    }

    @Override // X.InterfaceC88475Ynv
    public final C76800UCe invoke(SearchMixFeed item, SearchMixFeed searchMixFeed, SearchMixFeed searchMixFeed2, SearchMixFeed searchMixFeed3, Integer num) {
        int i;
        int i2;
        SearchMixFeed searchMixFeed4;
        List<SearchMixFeed> items;
        List<SearchMixFeed> items2;
        List<SearchMixFeed> items3;
        int intValue = num.intValue();
        o.LJIIIZ(item, "item");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("add_size: ");
        C49825Jgz Dn = this.LJLIL.Dn();
        int i3 = 0;
        if (Dn != null && (items3 = Dn.getItems()) != null) {
            i = items3.size();
        } else {
            i = 0;
        }
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        C49825Jgz Dn2 = this.LJLIL.Dn();
        int i4 = -1;
        if (Dn2 != null && (items2 = Dn2.getItems()) != null) {
            int i5 = 0;
            for (SearchMixFeed searchMixFeed5 : items2) {
                int i6 = i5 + 1;
                if (i5 >= 0) {
                    if (searchMixFeed2 != null) {
                        if (o.LJ(searchMixFeed5, searchMixFeed2)) {
                            i4 = i5 - 2;
                        }
                        if (searchMixFeed3 != null && o.LJ(searchMixFeed5, searchMixFeed3)) {
                            i4 = i6;
                        }
                    } else {
                        if (o.LJ(searchMixFeed5, searchMixFeed)) {
                            i4 = i5 - 1;
                        }
                        if (searchMixFeed3 != null) {
                            i4 = i6;
                        }
                    }
                    i5 = i6;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        if (i4 <= 0) {
            C48658J7u.LIZIZ("rd_ec_search_dynamic_add", C65232Piu.LIZJ(WM7.SCENE_SERVICE, "error"));
        } else {
            C49825Jgz Dn3 = this.LJLIL.Dn();
            if (Dn3 != null) {
                Dn3.insertItem(item, i4);
            }
            C49825Jgz Dn4 = this.LJLIL.Dn();
            if (Dn4 != null && (items = Dn4.getItems()) != null) {
                int i7 = 0;
                for (SearchMixFeed it : items) {
                    C49369JZd c49369JZd = C49369JZd.LIZ;
                    o.LJIIIIZZ(it, "it");
                    c49369JZd.getClass();
                    if (C49369JZd.LIZIZ(it)) {
                        it.LJLILLLLZI = i7;
                        i7++;
                        o.LJ(item, it);
                    }
                }
            }
            JVP jvp = (JVP) this.LJLIL.nm();
            List<T> list = jvp.mmItems;
            if (list != 0) {
                i2 = list.size();
            } else {
                i2 = 0;
            }
            if (i2 > intValue && (searchMixFeed4 = jvp.LJZL) != null) {
                List<T> list2 = jvp.mmItems;
                if (list2 != 0) {
                    ListProtector.add(list2, intValue, searchMixFeed4);
                }
                List<T> list3 = jvp.mmItems;
                if (list3 != 0) {
                    int i8 = 0;
                    for (Object obj : list3) {
                        int i9 = i3 + 1;
                        if (i3 >= 0) {
                            SearchMixFeed searchMixFeed6 = (SearchMixFeed) obj;
                            if (i3 <= intValue) {
                                C49369JZd.LIZ.getClass();
                                if (C49369JZd.LIZIZ(searchMixFeed6)) {
                                    searchMixFeed6.LJLILLLLZI = i8;
                                    i8++;
                                }
                            }
                            i3 = i9;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                }
                jvp.LJZI = searchMixFeed4.LJLILLLLZI;
                jvp.notifyItemInserted(intValue);
                List<T> list4 = jvp.mmItems;
                if (list4 != 0) {
                    int i10 = intValue + 1;
                    if (jvp.getBasicItemViewType(i10) != 5) {
                        int i11 = intValue + 2;
                        if (jvp.getBasicItemViewType(i11) == 1 || jvp.getBasicItemViewType(i11) == 14) {
                            SearchMixFeed searchMixFeed7 = new SearchMixFeed();
                            C35670DzG c35670DzG = new C35670DzG(EF7.LIZIZ().getString(R.string.qc_), 1);
                            searchMixFeed7.setFeedType(65465);
                            searchMixFeed7.LJLIL = c35670DzG;
                            ListProtector.add(list4, i10, searchMixFeed7);
                            jvp.notifyItemInserted(i10);
                        }
                    }
                }
            }
            C48658J7u.LIZIZ("rd_ec_search_dynamic_add", C65232Piu.LIZJ(WM7.SCENE_SERVICE, "insert"));
        }
        return C76800UCe.LIZ;
    }
}
