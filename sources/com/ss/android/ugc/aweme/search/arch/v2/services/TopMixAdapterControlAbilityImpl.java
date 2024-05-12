package com.ss.android.ugc.aweme.search.arch.v2.services;

import X.C47261Igj;
import X.C49265JVd;
import X.C49707Jf5;
import X.C49825Jgz;
import X.C65352Pkq;
import X.C65776Prg;
import X.InterfaceC49285JVx;
import X.InterfaceC49871Jhj;
import X.InterfaceC65316PkG;
import X.T2R;
import androidx.recyclerview.widget.GridLayoutManager;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment$initAdapter$layoutManager$1;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class TopMixAdapterControlAbilityImpl implements SearchServiceCenter$AdapterControlAbility {
    public final C49265JVd LJLIL;
    public final GridLayoutManager LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AdapterControlAbility
    public final boolean c10(InterfaceC49871Jhj interfaceC49871Jhj) {
        C49707Jf5 c49707Jf5;
        List<SearchMixFeed> items;
        InterfaceC49285JVx interfaceC49285JVx;
        C49265JVd c49265JVd = this.LJLIL;
        c49265JVd.getClass();
        List<T> list = c49265JVd.mmItems;
        if (list == 0) {
            return false;
        }
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            InterfaceC49871Jhj interfaceC49871Jhj2 = null;
            if (i >= 0) {
                InterfaceC65316PkG searchMixFeed = (SearchMixFeed) obj;
                if (System.identityHashCode(searchMixFeed) != System.identityHashCode(interfaceC49871Jhj)) {
                    C65776Prg LIZ = C65352Pkq.LIZ(InterfaceC49871Jhj.class);
                    if ((searchMixFeed instanceof InterfaceC49285JVx) && (interfaceC49285JVx = (InterfaceC49285JVx) searchMixFeed) != null) {
                        interfaceC49871Jhj2 = interfaceC49285JVx.LIZIZ();
                    }
                    if (!o.LJ(T2R.LJIL(interfaceC49871Jhj2, LIZ), interfaceC49871Jhj)) {
                        i = i2;
                    }
                }
                List<T> list2 = c49265JVd.mmItems;
                if (list2 != 0) {
                    list2.remove(searchMixFeed);
                }
                C49825Jgz LLIIIL = c49265JVd.LLIIIL();
                if (LLIIIL != null && (items = LLIIIL.getItems()) != null) {
                    items.remove(searchMixFeed);
                }
                C49825Jgz LLIIIL2 = c49265JVd.LLIIIL();
                if (LLIIIL2 != null && (c49707Jf5 = LLIIIL2.LLD) != null) {
                    o.LJIIIZ(searchMixFeed, "searchMixFeed");
                    c49707Jf5.LJIIIIZZ().remove(searchMixFeed);
                }
                c49265JVd.notifyItemRemoved(i);
                return true;
            }
            C47261Igj.LJJJJJ();
            throw null;
        }
        return false;
    }

    public TopMixAdapterControlAbilityImpl(C49265JVd adapter, SearchJediMixFeedFragment$initAdapter$layoutManager$1 searchJediMixFeedFragment$initAdapter$layoutManager$1) {
        o.LJIIIZ(adapter, "adapter");
        this.LJLIL = adapter;
        this.LJLILLLLZI = searchJediMixFeedFragment$initAdapter$layoutManager$1;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AdapterControlAbility
    public final boolean Yx(int i, InterfaceC49871Jhj interfaceC49871Jhj) {
        return this.LJLIL.LLIIIZ(i, interfaceC49871Jhj);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AdapterControlAbility
    public final boolean iu(int i, InterfaceC49871Jhj item) {
        int LL;
        o.LJIIIZ(item, "item");
        GridLayoutManager gridLayoutManager = this.LJLILLLLZI;
        int LJ = gridLayoutManager.LLIILII.LJ(i, gridLayoutManager.LLIIIL);
        int LJFF = this.LJLILLLLZI.LLIILII.LJFF(i);
        int i2 = this.LJLILLLLZI.LLIIIL;
        if (LJFF == i2) {
            LL = (i + 1) - this.LJLIL.LL();
        } else {
            LL = ((i2 - LJ) + i) - this.LJLIL.LL();
        }
        return this.LJLIL.LLIIIZ(LL, item);
    }
}
