package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder;

import X.C26338AVi;
import X.C26706Ady;
import X.C27082Ak2;
import X.C27084Ak4;
import X.C28112B1o;
import X.C45804HyK;
import X.C79045V0n;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.view.CCDCPolicyItemView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes5.dex */
public final class CCDCPolicyViewHolder extends PowerCell<C27084Ak4> implements c {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public View getContainerView() {
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        return itemView;
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onItemViewCreated() {
        int i;
        super.onItemViewCreated();
        View view = this.itemView;
        o.LJII(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.view.CCDCPolicyItemView");
        Context context = view.getContext();
        o.LJIIIIZZ(context, "context");
        Integer LJI = C79045V0n.LJI(R.attr.c9, context);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = -1;
        }
        view.setBackgroundColor(i);
        C26338AVi.LJIIIZ(view, Integer.valueOf(C45804HyK.LJJI(16)), Integer.valueOf(C45804HyK.LJJI(16)), Integer.valueOf(C45804HyK.LJJI(16)), Integer.valueOf(C45804HyK.LJJI(24)), 16);
        C28112B1o.LJIIIZ("user_trust");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onBindItemView(C27084Ak4 t) {
        o.LJIIIZ(t, "t");
        super.onBindItemView((CCDCPolicyViewHolder) t);
        View view = this.itemView;
        o.LJII(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.view.CCDCPolicyItemView");
        CCDCPolicyItemView cCDCPolicyItemView = (CCDCPolicyItemView) view;
        cCDCPolicyItemView.setTitle(t.LJLIL.title);
        cCDCPolicyItemView.setUserRightDescBlocks(t.LJLIL.blockList);
        cCDCPolicyItemView.setClickListener(C27082Ak2.LJLIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        return new CCDCPolicyItemView(context, null, 0, 6, 0 == true ? 1 : 0);
    }
}
