package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion;

import X.C018905p;
import X.C16880lQ;
import X.C221108m2;
import X.C26706Ady;
import X.C27162AlK;
import X.C27515Ar1;
import X.C27516Ar2;
import X.C47261Igj;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C79045V0n;
import X.ORS;
import X.ORZ;
import X.UC0;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.view.TieredBmsmItemView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RelateProduct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.utils.Au2S10S0300000_4;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes5.dex */
public final class PdpPromotionForUSHolder extends PdpHolder implements c {
    public Map<Integer, View> _$_findViewCache;
    public final LinkedList<TieredBmsmItemView> scrapViews;
    public final C5H3 viewModel$delegate;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final PdpViewModel getViewModel() {
        return (PdpViewModel) this.viewModel$delegate.getValue();
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpPromotionForUSHolder(View view) {
        super(view, R.layout.a3o);
        o.LJIIIZ(view, "view");
        this._$_findViewCache = new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.viewModel$delegate = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 58));
        this.scrapViews = new LinkedList<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindRelateProducts(List<RelateProduct> list) {
        boolean z;
        Image image;
        int i = 0;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.itemView.findViewById(R.id.iu8).setVisibility(8);
            return;
        }
        this.itemView.findViewById(R.id.iu8).setVisibility(0);
        if (((ViewGroup) this.itemView.findViewById(R.id.ehe)).getChildCount() > 0) {
            ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.ehe);
            o.LJIIIIZZ(viewGroup, "itemView.image_list_container");
            LinkedList<TieredBmsmItemView> linkedList = this.scrapViews;
            while (viewGroup.getChildCount() > 0) {
                View childAt = viewGroup.getChildAt(0);
                C16880lQ.LJLLL(childAt, viewGroup);
                if (childAt instanceof TieredBmsmItemView) {
                    linkedList.add(childAt);
                }
            }
        }
        for (RelateProduct relateProduct : list) {
            int i2 = i + 1;
            if (i >= 0) {
                RelateProduct relateProduct2 = relateProduct;
                List<Image> list2 = relateProduct2.images;
                if (list2 != null && (image = (Image) ORZ.LJLLLL(list2)) != null) {
                    TieredBmsmItemView tieredBmsmItemView = (TieredBmsmItemView) ORS.LJJLJLI(this.scrapViews);
                    if (tieredBmsmItemView == null) {
                        Context context = this.itemView.getContext();
                        o.LJIIIIZZ(context, "itemView.context");
                        tieredBmsmItemView = new TieredBmsmItemView(context, getViewModel().Wv0(), null, 0, 12, 0 == true ? 1 : 0);
                    }
                    C018905p c018905p = new C018905p(-2, -2);
                    if (i != 0) {
                        c018905p.setMarginStart(C27162AlK.LJIIIZ);
                    }
                    tieredBmsmItemView.setLayoutParams(c018905p);
                    Context context2 = this.itemView.getContext();
                    o.LJIIIIZZ(context2, "itemView.context");
                    tieredBmsmItemView.initView(context2, image, relateProduct2.price);
                    C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 43, 42), tieredBmsmItemView);
                    ((ViewGroup) this.itemView.findViewById(R.id.ehe)).addView(tieredBmsmItemView);
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public void onBind(C27515Ar1 item) {
        int i;
        o.LJIIIZ(item, "item");
        ((TextView) this.itemView.findViewById(R.id.ice)).setText(item.LJLIL.buttonText);
        View findViewById = this.itemView.findViewById(R.id.icc);
        o.LJIIIIZZ(findViewById, "itemView.promotion_divider_line");
        if (item.LJLILLLLZI) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById.setVisibility(i);
        C27516Ar2 c27516Ar2 = new C27516Ar2(item.LJLIL);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C16880lQ.LJIIJ(new Au2S10S0300000_4(this, item, c27516Ar2, 2), itemView);
        IPromotionStyle iPromotionStyle = (IPromotionStyle) UC0.LJIIJJI(this, "product_detail", getViewModel().Wv0(), null, null, 12);
        if (iPromotionStyle == null) {
            iPromotionStyle = new DefaultPromotionStyle();
        }
        ((TuxTextView) this.itemView.findViewById(R.id.ice)).setTuxFont(iPromotionStyle.getPromotionDescFont());
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        Integer LJI = C79045V0n.LJI(iPromotionStyle.getPromotionDescColor(), context);
        if (LJI != null) {
            ((TextView) this.itemView.findViewById(R.id.ice)).setTextColor(LJI.intValue());
        }
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.a7n);
        if (tuxIconView != null) {
            ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
            layoutParams.width = iPromotionStyle.getArrowSize();
            layoutParams.height = iPromotionStyle.getArrowSize();
            tuxIconView.setLayoutParams(layoutParams);
            tuxIconView.setTintColorRes(iPromotionStyle.getArrowColor());
        }
        bindRelateProducts(item.LJLIL.relateProducts);
    }
}
