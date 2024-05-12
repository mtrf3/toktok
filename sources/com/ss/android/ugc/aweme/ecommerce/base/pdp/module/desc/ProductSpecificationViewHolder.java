package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc;

import X.C16880lQ;
import X.C2068389v;
import X.C26830Afy;
import X.C27186Ali;
import X.C44878HjO;
import X.C72545SdZ;
import X.C76800UCe;
import X.C78857UxB;
import X.ORS;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Specification;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProductSpecificationViewHolder extends AbsBrickFullSpanVH {
    public boolean LJLILLLLZI;
    public final LinkedList<SmartImageView> LJLJI;
    public final Map<Integer, View> LJLJJI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductSpecificationViewHolder(ViewGroup viewGroup) {
        super(C72545SdZ.LIZJ(viewGroup, "parent.context", R.layout.a3d, viewGroup, false));
        this.LJLJJI = C44878HjO.LIZIZ(viewGroup, "parent");
        this.LJLJI = new LinkedList<>();
    }

    public final View M(Specification specification) {
        View view = (View) ORS.LJJLJLI(this.LJLJI);
        if (view == null) {
            view = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.itemView.getContext()), R.layout.a3e, null, false);
        }
        StringBuilder sb = new StringBuilder();
        if (C78857UxB.LJJJIL(specification.name)) {
            sb.append(specification.name);
        }
        if (C78857UxB.LJJJIL(specification.value)) {
            if (sb.length() > 0) {
                sb.append(": ");
            }
            sb.append(specification.value);
        }
        ((TextView) view.findViewById(R.id.k9_)).setText(sb.toString());
        return view;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void onBind(C27186Ali item) {
        boolean z;
        int size;
        int i;
        o.LJIIIZ(item, "item");
        super.onBind(item);
        List<Specification> list = item.LJLIL;
        int i2 = 0;
        if (list.size() > 4 && !this.LJLILLLLZI) {
            z = true;
        } else {
            z = false;
        }
        if (C26830Afy.LIZ()) {
            ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.dlx);
            o.LJIIIIZZ(viewGroup, "itemView.four_specs_layout");
            LinkedList<SmartImageView> linkedList = this.LJLJI;
            while (viewGroup.getChildCount() > 0) {
                C16880lQ.LLIFFJFJJ(0, viewGroup);
                C76800UCe c76800UCe = C76800UCe.LIZ;
                if (c76800UCe instanceof SmartImageView) {
                    linkedList.add(c76800UCe);
                }
            }
        } else {
            ((ViewGroup) this.itemView.findViewById(R.id.dlx)).removeAllViews();
        }
        if (z) {
            size = Math.min(4, list.size());
        } else {
            size = list.size();
        }
        for (int i3 = 0; i3 < size; i3++) {
            ((ViewGroup) this.itemView.findViewById(R.id.dlx)).addView(M((Specification) ListProtector.get(list, i3)));
        }
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.jk6);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_chevron_down_fill;
        c2068389v.LJ = Integer.valueOf(R.attr.gp);
        tuxIconView.setTuxIcon(c2068389v);
        View findViewById = this.itemView.findViewById(R.id.jk3);
        o.LJIIIIZZ(findViewById, "itemView.see_more");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById.setVisibility(i);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.jk6);
        o.LJIIIIZZ(imageView, "itemView.see_more_icon");
        if (!z) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        View findViewById2 = this.itemView.findViewById(R.id.jk3);
        o.LJIIIIZZ(findViewById2, "itemView.see_more");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 41, 42), findViewById2);
    }
}
