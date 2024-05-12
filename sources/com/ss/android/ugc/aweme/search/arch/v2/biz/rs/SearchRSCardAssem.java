package com.ss.android.ugc.aweme.search.arch.v2.biz.rs;

import X.AbstractC50059Jkl;
import X.C17N;
import X.C221108m2;
import X.C32151Nz;
import X.C49098JOs;
import X.C49301JWn;
import X.C49332JXs;
import X.C49567Jcp;
import X.C49587Jd9;
import X.C49701Jez;
import X.C49920JiW;
import X.C49921JiX;
import X.C50322Jp0;
import X.C55096Ljo;
import X.C62822Ol8;
import X.C8XO;
import X.JWQ;
import X.O6R;
import X.V1B;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.RelatedWord;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchRSCardAssem extends ReusedUISlotAssem<SearchRSCardAssem> implements C8XO<C49301JWn>, View.OnAttachStateChangeListener {
    public RecyclerView LLFF;
    public View LLFFF;
    public final int LLFII;
    public final int LLFZ;
    public C49301JWn LLI;
    public final C62822Ol8 LLIFFJFJJ;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void N3(View view) {
        o.LJIIIZ(view, "view");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.cf4;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        o.LJIIIZ(v, "v");
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public SearchRSCardAssem() {
        boolean z;
        float LJIIZILJ;
        float LJIIZILJ2;
        new LinkedHashMap();
        C49098JOs.LIZ.getClass();
        if (C49098JOs.LIZ() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LJIIZILJ = C32151Nz.LJIIZILJ(10);
        } else {
            LJIIZILJ = C32151Nz.LJIIZILJ(16);
        }
        this.LLFII = O6R.LJJIIZ(LJIIZILJ);
        if (C49098JOs.LIZ() != 0) {
            LJIIZILJ2 = C32151Nz.LJIIZILJ(10);
        } else {
            LJIIZILJ2 = C32151Nz.LJIIZILJ(8);
        }
        this.LLFZ = O6R.LJJIIZ(LJIIZILJ2);
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 111));
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(C49301JWn c49301JWn) {
        View view;
        C49920JiW c49920JiW;
        ViewGroup.LayoutParams layoutParams;
        RecyclerView.ViewHolder C40;
        C49301JWn item = c49301JWn;
        o.LJIIIZ(item, "item");
        ISearchContextAbility iSearchContextAbility = null;
        SearchServiceCenter$CardCommonAbility searchServiceCenter$CardCommonAbility = (SearchServiceCenter$CardCommonAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), SearchServiceCenter$CardCommonAbility.class, null);
        if (searchServiceCenter$CardCommonAbility != null && (C40 = searchServiceCenter$CardCommonAbility.C40()) != null) {
            view = C40.itemView;
        } else {
            view = null;
        }
        if (item.LJLIL.LJIIIZ()) {
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            view.setLayoutParams(new RecyclerView.LayoutParams(-1, 0));
            return;
        }
        if (view != null) {
            view.setVisibility(0);
        }
        if (view != null && ((layoutParams = view.getLayoutParams()) == null || layoutParams.height != -2)) {
            view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        }
        String str = (String) this.LLIFFJFJJ.getValue();
        if (!TextUtils.isEmpty(str)) {
            c49920JiW = (C49920JiW) ((LinkedHashMap) C49921JiX.LIZJ).get(str);
            if (c49920JiW == null) {
                c49920JiW = C49567Jcp.LIZ;
            }
        } else {
            c49920JiW = C49567Jcp.LIZ;
        }
        c49920JiW.LJJIJIIJI.add("relative_card");
        this.LLI = item;
        List<RelatedWord> wordList = item.LJLIL.relatedWordList;
        o.LJIIIIZZ(wordList, "wordList");
        if (!(true ^ wordList.isEmpty())) {
            return;
        }
        RecyclerView recyclerView = this.LLFF;
        if (recyclerView != null) {
            C49332JXs c49332JXs = new C49332JXs();
            View view2 = this.LLFFF;
            if (view2 != null) {
                iSearchContextAbility = C17N.LJJJJJ(view2);
            }
            SearchMixFeed searchMixFeed = item.LJLIL;
            int i = searchMixFeed.groupPosition;
            int i2 = searchMixFeed.LJLILLLLZI;
            c49332JXs.LJLILLLLZI = iSearchContextAbility;
            c49332JXs.LJLJI = i;
            c49332JXs.LJLIL = wordList;
            c49332JXs.LJLJJI = i2;
            c49332JXs.notifyDataSetChanged();
            recyclerView.setAdapter(c49332JXs);
            return;
        }
        o.LJIJI("list");
        throw null;
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C49301JWn c49301JWn) {
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        int i;
        ISearchContextAbility iSearchContextAbility;
        Integer num;
        int i2;
        String str;
        String str2;
        AbstractC50059Jkl<C50322Jp0> If;
        C50322Jp0 LIZJ;
        AbstractC50059Jkl<C49587Jd9> ut0;
        C49587Jd9 LIZJ2;
        AbstractC50059Jkl<C50322Jp0> If2;
        C50322Jp0 LIZJ3;
        SearchMixFeed searchMixFeed;
        SearchMixFeed searchMixFeed2;
        SearchMixFeed searchMixFeed3;
        List<RelatedWord> list;
        o.LJIIIZ(v, "v");
        C49301JWn c49301JWn = this.LLI;
        if (c49301JWn != null && (searchMixFeed3 = c49301JWn.LJLIL) != null && (list = searchMixFeed3.relatedWordList) != null) {
            i = list.size();
        } else {
            i = 0;
        }
        View view = this.LLFFF;
        String str3 = null;
        if (view != null) {
            iSearchContextAbility = C17N.LJJJJJ(view);
        } else {
            iSearchContextAbility = null;
        }
        C49301JWn c49301JWn2 = this.LLI;
        if (c49301JWn2 != null && (searchMixFeed2 = c49301JWn2.LJLIL) != null) {
            num = Integer.valueOf(searchMixFeed2.groupPosition);
        } else {
            num = null;
        }
        C49301JWn c49301JWn3 = this.LLI;
        if (c49301JWn3 != null && (searchMixFeed = c49301JWn3.LJLIL) != null) {
            i2 = searchMixFeed.LJLILLLLZI;
        } else {
            i2 = -1;
        }
        C49701Jez c49701Jez = new C49701Jez();
        c49701Jez.LJIIZILJ("words_source", "related_search");
        c49701Jez.LJIIZILJ("words_num", String.valueOf(Integer.valueOf(i)));
        if (iSearchContextAbility != null && (If2 = iSearchContextAbility.If()) != null && (LIZJ3 = If2.LIZJ()) != null) {
            str = LIZJ3.LJLJI;
        } else {
            str = null;
        }
        c49701Jez.LJIIZILJ("search_id", str);
        if (iSearchContextAbility != null && (ut0 = iSearchContextAbility.ut0()) != null && (LIZJ2 = ut0.LIZJ()) != null) {
            str2 = LIZJ2.LJLIL;
        } else {
            str2 = null;
        }
        c49701Jez.LJIIZILJ("impr_id", str2);
        if (iSearchContextAbility != null && (If = iSearchContextAbility.If()) != null && (LIZJ = If.LIZJ()) != null) {
            str3 = LIZJ.LJLJJI;
        }
        c49701Jez.LJIIZILJ("raw_query", str3);
        c49701Jez.LJIIZILJ("search_position", "general");
        c49701Jez.LJIIZILJ("group_position", String.valueOf(num));
        c49701Jez.LJJIII(Integer.valueOf(i2));
        c49701Jez.LJIILIIL();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLFFF = view;
        view.addOnAttachStateChangeListener(this);
        View findViewById = view.findViewById(R.id.j8m);
        V1B.LJLLL(this.LLFZ, findViewById);
        V1B.LJLJLJ(this.LLFZ, findViewById);
        o.LJIIIIZZ(findViewById, "view.findViewById<Recycl…gin(listMargin)\n        }");
        this.LLFF = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(R.id.j8n);
        V1B.LJLLL(this.LLFII, findViewById2);
        V1B.LJLJLJ(this.LLFII, findViewById2);
        o.LJIIIIZZ(findViewById2, "view.findViewById<TuxTex…in(titleMargin)\n        }");
        RecyclerView recyclerView = this.LLFF;
        if (recyclerView != null) {
            view.getContext();
            recyclerView.setLayoutManager(new WrapGridLayoutManager(2, 1, false));
            RecyclerView recyclerView2 = this.LLFF;
            if (recyclerView2 != null) {
                recyclerView2.LJII(new JWQ(), -1);
                return;
            } else {
                o.LJIJI("list");
                throw null;
            }
        }
        o.LJIJI("list");
        throw null;
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C49301JWn c49301JWn) {
    }
}
