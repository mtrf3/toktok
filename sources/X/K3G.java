package X;

import Y.ACListenerS43S0200000_8;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.pages.result.effectlist.core.model.SearchEffect;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K3G extends C8HS<SearchEffect> {
    public K3G() {
        super(false, 1, null);
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        K3H k3h;
        SearchEffect searchEffect;
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if (!(holder instanceof K3H) || (k3h = (K3H) holder) == null || (searchEffect = k3h.LJLJJLL) == null) {
            return;
        }
        C50653JuL.LJLILLLLZI.getClass();
        java.util.Map LIZIZ = C50654JuM.LIZIZ();
        K3J k3j = new K3J();
        k3j.LJIIZILJ("search_id", (String) LIZIZ.get("search_id"));
        k3j.LJIJ("search_result_id", searchEffect.docId);
        k3j.LJIJI("search_result");
        k3j.LJIIZILJ("search_keyword", (String) LIZIZ.get("search_keyword"));
        k3j.LJIIZILJ("token_type", "tiktok_effects");
        k3j.LJIIZILJ("is_aladdin", String.valueOf((Object) 0));
        k3j.LJJI(Integer.valueOf(k3h.getAdapterPosition()));
        k3j.LJIIZILJ("prop_id", searchEffect.id);
        k3j.LJIILIIL();
    }

    @Override // X.C8HS
    public final void setData(List<SearchEffect> list) {
        super.setData(list);
        resetLoadMoreState();
    }

    @Override // X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        SearchEffect searchEffect;
        List<T> list = this.mmItems;
        if (list != 0 && (searchEffect = (SearchEffect) ListProtector.get(list, i)) != null) {
            o.LJII(viewHolder, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.pages.result.effectlist.core.ui.SearchEffectViewHolder");
            K3H k3h = (K3H) viewHolder;
            k3h.LJLJJLL = searchEffect;
            k3h.LJLIL.setText(searchEffect.name());
            if (searchEffect.useCount() < 0) {
                k3h.LJLILLLLZI.setVisibility(8);
            } else {
                String quantityString = k3h.itemView.getContext().getResources().getQuantityString(R.plurals.sr, searchEffect.useCount(), C77123UOp.LJJIIJ(searchEffect.useCount()));
                o.LJIIIIZZ(quantityString, "itemView.context.resourc…useCount(), displayCount)");
                k3h.LJLILLLLZI.setText(quantityString);
            }
            if (TextUtils.isEmpty(searchEffect.hint())) {
                k3h.LJLJI.setVisibility(8);
            } else {
                k3h.LJLJI.setText(searchEffect.hint());
            }
            UrlModel icon = searchEffect.icon();
            if (icon != null) {
                W5F LJII = W5U.LJII(C78939UyV.LJ(icon));
                LJII.LJJIIJ = k3h.LJLJJI;
                C16880lQ.LLJJJ(LJII);
            }
            C16880lQ.LJIIJ(new ACListenerS43S0200000_8(k3h, searchEffect, 13), k3h.itemView);
            C16880lQ.LJIILJJIL(k3h.LJLJJL, new ACListenerS43S0200000_8(k3h, searchEffect, 14));
        }
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        Context context;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        return new K3H(AnonymousClass030.LIZLLL(context, R.layout.cgo, viewGroup, false, "from(parent?.context)\n  …ding_page, parent, false)"));
    }
}
