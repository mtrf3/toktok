package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel;

import X.C73278SpO;
import X.C74002T2o;
import X.InterfaceC92693kP;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SearchJediViewModel extends JediViewModel<SearchState> {
    public InterfaceC92693kP LJLJJLL;
    public InterfaceC92693kP LJLJL;
    public final ListMiddleware<SearchState, SearchMixFeed, C74002T2o> LJLJLJ = new ListMiddleware<>(new AqS178S0100000_12(this, 283), new AqS178S0100000_12(this, 284), C73278SpO.LJLIL, 4);
    public List<SearchMixFeed> LJLJLLL;
    public boolean LJLL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final SearchState kv0() {
        return new SearchState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void onStart() {
        super.onStart();
        new SearchJediViewModelMiddlewareBinding().binding(this);
    }

    public static boolean Hv0(SearchMixFeed searchMixFeed) {
        Integer valueOf;
        if (searchMixFeed == null || (valueOf = Integer.valueOf(searchMixFeed.getFeedType())) == null || (valueOf.intValue() != 65280 && valueOf.intValue() != 1048336)) {
            return false;
        }
        return true;
    }

    public static void Iv0(List list) {
        if (list != null && (!list.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SearchMixFeed searchMixFeed = (SearchMixFeed) it.next();
                if (searchMixFeed.getFeedType() == 65515 && searchMixFeed.users.size() < 3) {
                    arrayList.add(searchMixFeed);
                }
            }
            if (arrayList.size() > 0) {
                list.removeAll(arrayList);
            }
        }
    }

    public final void Jv0(List<SearchMixFeed> list) {
        int i;
        if (list != null) {
            int i2 = 1;
            if (!list.isEmpty()) {
                int i3 = 0;
                if (this.LJLL) {
                    this.LJLL = false;
                } else {
                    i2 = 0;
                }
                Iterator<SearchMixFeed> it = list.iterator();
                int i4 = 0;
                loop0: while (true) {
                    int i5 = -1;
                    while (true) {
                        if (it.hasNext()) {
                            i = i4 + 1;
                            if (Hv0(it.next())) {
                                i2++;
                            } else {
                                i5 = i4;
                            }
                            if (i5 != -1) {
                                if (i2 % 2 == 0) {
                                    break;
                                }
                                if (i5 != -1 && i2 % 2 != 0) {
                                    if (i < list.size()) {
                                        Iterator<SearchMixFeed> it2 = list.subList(i, list.size()).iterator();
                                        int i6 = 0;
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                break;
                                            }
                                            if (Hv0(it2.next())) {
                                                if (i6 != -1) {
                                                    ListProtector.add(list, i5, ListProtector.remove(list, i + i6));
                                                    int i7 = i5 + 2;
                                                    if (i7 < list.size()) {
                                                        Jv0(list.subList(i7, list.size()));
                                                    }
                                                }
                                            } else {
                                                i6++;
                                            }
                                        }
                                    }
                                    ArrayList arrayList = new ArrayList();
                                    this.LJLJLLL = arrayList;
                                    arrayList.addAll(list.subList(i5, list.size()));
                                    List<SearchMixFeed> list2 = this.LJLJLLL;
                                    o.LJI(list2);
                                    list.removeAll(list2);
                                }
                            }
                            i4 = i;
                        } else {
                            i3 = i2;
                            break loop0;
                        }
                    }
                    i4 = i;
                    i2 = 0;
                }
                if (i3 % 2 != 0) {
                    this.LJLJLLL = new ArrayList();
                }
            }
        }
    }
}
