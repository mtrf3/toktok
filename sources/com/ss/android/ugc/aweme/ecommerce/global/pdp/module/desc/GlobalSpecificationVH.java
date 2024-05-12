package com.ss.android.ugc.aweme.ecommerce.global.pdp.module.desc;

import X.AnonymousClass391;
import X.C03090Af;
import X.C16880lQ;
import X.C26338AVi;
import X.C27187Alj;
import X.C2TI;
import X.ORS;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Specification;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class GlobalSpecificationVH extends PdpHolder {
    public boolean LJLIL;
    public final LinkedList<C2TI> LJLILLLLZI;
    public final Map<Integer, View> LJLJI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        boolean z;
        int size;
        C27187Alj item = (C27187Alj) obj;
        o.LJIIIZ(item, "item");
        List<Specification> list = item.LJLIL;
        int i = 0;
        if (list.size() > 4 && !this.LJLIL) {
            z = true;
        } else {
            z = false;
        }
        ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.dlx);
        o.LJIIIIZZ(viewGroup, "itemView.four_specs_layout");
        LinkedList<C2TI> linkedList = this.LJLILLLLZI;
        while (viewGroup.getChildCount() > 0) {
            View childAt = viewGroup.getChildAt(0);
            C16880lQ.LJLLL(childAt, viewGroup);
            if (childAt instanceof C2TI) {
                linkedList.add(childAt);
            }
        }
        if (z) {
            size = Math.min(4, list.size());
        } else {
            size = list.size();
        }
        for (int i2 = 0; i2 < size; i2++) {
            ((ViewGroup) this.itemView.findViewById(R.id.dlx)).addView(L((Specification) ListProtector.get(list, i2), i2));
        }
        View findViewById = this.itemView.findViewById(R.id.g5z);
        o.LJIIIIZZ(findViewById, "itemView.ll_see_more_container");
        if (!z) {
            i = 8;
        }
        findViewById.setVisibility(i);
        View findViewById2 = this.itemView.findViewById(R.id.g5z);
        o.LJIIIIZZ(findViewById2, "itemView.ll_see_more_container");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 6, 42), findViewById2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSpecificationVH(View view, ECBaseFragment eCBaseFragment) {
        super(view, R.layout.a4u);
        this.LJLJI = C03090Af.LIZLLL(view, "view", eCBaseFragment, "fragment");
        this.LJLILLLLZI = new LinkedList<>();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [X.2TI] */
    public final C2TI L(Specification specification, int i) {
        C2TI c2ti = (C2TI) ORS.LJJLJLI(this.LJLILLLLZI);
        C2TI c2ti2 = c2ti;
        if (c2ti == null) {
            Context context = this.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            ?? r2 = new RelativeLayout(context) { // from class: X.2TI
                public final java.util.Map<Integer, View> LJLIL = new LinkedHashMap();

                public final View LIZ(int i2) {
                    LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
                    View view = (View) linkedHashMap.get(Integer.valueOf(i2));
                    if (view != null) {
                        return view;
                    }
                    View findViewById = findViewById(i2);
                    if (findViewById == null) {
                        return null;
                    }
                    linkedHashMap.put(Integer.valueOf(i2), findViewById);
                    return findViewById;
                }

                {
                    super(context, null, 0);
                    C16880lQ.LLLZIIL(R.layout.a50, C16880lQ.LLZIL(context), this);
                }

                public final void setDescContent(String str) {
                    ((TextView) LIZ(R.id.ltp)).setText(str);
                }

                public final void setDescTitle(String str) {
                    ((TextView) LIZ(R.id.ltq)).setText(str);
                }
            };
            c2ti2 = r2;
            if (i != 0) {
                Integer LIZJ = AnonymousClass391.LIZJ(12);
                View cl_item_container = r2.LIZ(R.id.bd6);
                o.LJIIIIZZ(cl_item_container, "cl_item_container");
                C26338AVi.LJI(cl_item_container, null, LIZJ, null, null, false, 16);
                c2ti2 = r2;
            }
        }
        c2ti2.setDescTitle(specification.name);
        c2ti2.setDescContent(specification.value);
        return c2ti2;
    }
}
