package com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.ui;

import X.AbstractC50059Jkl;
import X.C17N;
import X.C221108m2;
import X.C32151Nz;
import X.C49098JOs;
import X.C49326JXm;
import X.C49567Jcp;
import X.C49701Jez;
import X.C49920JiW;
import X.C49921JiX;
import X.C50322Jp0;
import X.C50764Jw8;
import X.C62822Ol8;
import X.C8XO;
import X.JP4;
import X.JP9;
import X.JQA;
import X.JWQ;
import X.O6R;
import X.V1B;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.ClickSearchResponse;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.ClickSearchWord;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchCSCardAssem extends ReusedUISlotAssem<SearchCSCardAssem> implements C8XO<JP9>, View.OnAttachStateChangeListener {
    public RecyclerView LLFF;
    public View LLFFF;
    public final int LLFII;
    public final int LLFZ;
    public JP9 LLI;
    public final C62822Ol8 LLIFFJFJJ;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.cf3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        o.LJIIIZ(v, "v");
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public SearchCSCardAssem() {
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
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 308));
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(JP9 jp9) {
        C49920JiW c49920JiW;
        ClickSearchResponse clickSearchResponse;
        List<ClickSearchWord> list;
        JP9 item = jp9;
        o.LJIIIZ(item, "item");
        String str = (String) this.LLIFFJFJJ.getValue();
        if (!TextUtils.isEmpty(str)) {
            c49920JiW = (C49920JiW) ((LinkedHashMap) C49921JiX.LIZJ).get(str);
            if (c49920JiW == null) {
                c49920JiW = C49567Jcp.LIZ;
            }
        } else {
            c49920JiW = C49567Jcp.LIZ;
        }
        c49920JiW.LJJIJIIJI.add("click_search_card");
        this.LLI = item;
        C50764Jw8<ClickSearchResponse> c50764Jw8 = item.LJLIL.LIZLLL;
        ISearchContextAbility iSearchContextAbility = null;
        if (c50764Jw8 != null && (clickSearchResponse = c50764Jw8.LIZIZ) != null && (list = clickSearchResponse.wordsList) != null && (!list.isEmpty())) {
            RecyclerView recyclerView = this.LLFF;
            if (recyclerView != null) {
                C49326JXm c49326JXm = new C49326JXm();
                View view = this.LLFFF;
                if (view != null) {
                    iSearchContextAbility = C17N.LJJJJJ(view);
                }
                JQA jqa = item.LJLILLLLZI;
                o.LJIIIZ(list, "list");
                c49326JXm.LJLILLLLZI = iSearchContextAbility;
                c49326JXm.LJLJI = jqa;
                c49326JXm.LJLIL = list;
                c49326JXm.notifyDataSetChanged();
                recyclerView.setAdapter(c49326JXm);
                return;
            }
            o.LJIJI("list");
            throw null;
        }
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(JP9 jp9) {
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        int i;
        ISearchContextAbility iSearchContextAbility;
        JQA jqa;
        String str;
        String str2;
        String str3;
        AbstractC50059Jkl<C50322Jp0> If;
        C50322Jp0 LIZJ;
        AbstractC50059Jkl<C50322Jp0> If2;
        C50322Jp0 LIZJ2;
        JP4 jp4;
        C50764Jw8<ClickSearchResponse> c50764Jw8;
        ClickSearchResponse clickSearchResponse;
        List<ClickSearchWord> list;
        o.LJIIIZ(v, "v");
        JP9 jp9 = this.LLI;
        if (jp9 != null && (jp4 = jp9.LJLIL) != null && (c50764Jw8 = jp4.LIZLLL) != null && (clickSearchResponse = c50764Jw8.LIZIZ) != null && (list = clickSearchResponse.wordsList) != null) {
            i = list.size();
        } else {
            i = 0;
        }
        View view = this.LLFFF;
        Integer num = null;
        if (view != null) {
            iSearchContextAbility = C17N.LJJJJJ(view);
        } else {
            iSearchContextAbility = null;
        }
        JP9 jp92 = this.LLI;
        if (jp92 != null) {
            jqa = jp92.LJLILLLLZI;
        } else {
            jqa = null;
        }
        C49701Jez c49701Jez = new C49701Jez();
        c49701Jez.LJIIZILJ("words_source", "click_recom");
        c49701Jez.LJIIZILJ("words_num", String.valueOf(Integer.valueOf(i)));
        if (iSearchContextAbility != null && (If2 = iSearchContextAbility.If()) != null && (LIZJ2 = If2.LIZJ()) != null) {
            str = LIZJ2.LJLJI;
        } else {
            str = null;
        }
        c49701Jez.LJIIZILJ("search_id", str);
        if (jqa != null) {
            str2 = jqa.LJIIIZ;
        } else {
            str2 = null;
        }
        c49701Jez.LJIIZILJ("impr_id", str2);
        if (iSearchContextAbility != null && (If = iSearchContextAbility.If()) != null && (LIZJ = If.LIZJ()) != null) {
            str3 = LIZJ.LJLJJI;
        } else {
            str3 = null;
        }
        c49701Jez.LJIIZILJ("raw_query", str3);
        c49701Jez.LJIIZILJ("search_position", "general");
        if (jqa != null) {
            num = Integer.valueOf(jqa.LJIIL);
        }
        c49701Jez.LJJIII(num);
        c49701Jez.LJIILIIL();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLFFF = view;
        view.addOnAttachStateChangeListener(this);
        View findViewById = view.findViewById(R.id.c09);
        V1B.LJLLL(this.LLFZ, findViewById);
        V1B.LJLJLJ(this.LLFZ, findViewById);
        o.LJIIIIZZ(findViewById, "view.findViewById<Recycl…gin(listMargin)\n        }");
        this.LLFF = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(R.id.c0_);
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
    public final /* bridge */ /* synthetic */ void n3(JP9 jp9) {
    }
}
