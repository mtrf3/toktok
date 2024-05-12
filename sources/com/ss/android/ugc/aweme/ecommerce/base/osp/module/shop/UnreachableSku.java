package com.ss.android.ugc.aweme.ecommerce.base.osp.module.shop;

import X.C16880lQ;
import X.C221108m2;
import X.C26706Ady;
import X.C27949Ay1;
import X.C5H3;
import X.C62562cu;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70759Rpr;
import X.C72704Sg8;
import X.KL0;
import X.OUP;
import X.SG3;
import X.W5F;
import X.X1D;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.unreachable.IUnreachableSkuStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes5.dex */
public final class UnreachableSku extends ECJediViewHolder implements c {
    public Map<Integer, View> _$_findViewCache;
    public final C5H3 dynamicStyle$delegate;
    public final C5H3 vm$delegate;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
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

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    private final IUnreachableSkuStyle getDynamicStyle() {
        return (IUnreachableSkuStyle) this.dynamicStyle$delegate.getValue();
    }

    private final OrderSubmitViewModel getVm() {
        return (OrderSubmitViewModel) this.vm$delegate.getValue();
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnreachableSku(View view) {
        super(view);
        o.LJIIIZ(view, "view");
        this._$_findViewCache = new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(OrderSubmitViewModel.class);
        this.vm$delegate = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 32));
        this.dynamicStyle$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 173));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public void onBind(PackedSku item) {
        CharSequence charSequence;
        String LIZIZ;
        Price price;
        C62562cu imageUrlModel;
        HashMap<String, Object> hashMap;
        o.LJIIIZ(item, "item");
        Image image = item.getImage();
        if (image != null && (imageUrlModel = image.toImageUrlModel()) != null) {
            C27949Ay1.LJJJJJL();
            W5F LIZLLL = C70759Rpr.LIZLLL(imageUrlModel);
            LIZLLL.LJJI = KL0.HIGH;
            LIZLLL.LIZIZ("product_image_tag");
            LIZLLL.LJJIIJ = (SmartImageView) this.itemView.findViewById(R.id.i5y);
            C16880lQ.LLJJJ(LIZLLL);
            if (getVm().LJLJJLL == 0 && (hashMap = getVm().LLIL) != null) {
                C27949Ay1.LIZLLL(!imageUrlModel.LIZ() ? 1 : 0, hashMap);
            }
        }
        IUnreachableSkuStyle dynamicStyle = getDynamicStyle();
        if (dynamicStyle != null) {
            this.itemView.findViewById(R.id.i5y).getLayoutParams().height = dynamicStyle.getImgSize();
            this.itemView.findViewById(R.id.i5y).getLayoutParams().width = dynamicStyle.getImgSize();
            this.itemView.findViewById(R.id.ejl).getLayoutParams().width = dynamicStyle.getImgSize();
            this.itemView.findViewById(R.id.ejl).getLayoutParams().height = dynamicStyle.getImgSize();
            this.itemView.findViewById(R.id.mtz).getLayoutParams().height = dynamicStyle.getLayoutSize();
        }
        ((SG3) this.itemView.findViewById(R.id.i6k)).LJJJIL(item.getProductName(), item.getPromotionLogos());
        ((TextView) this.itemView.findViewById(R.id.i6i)).setText(item.getSalePropsStr());
        TextView textView = (TextView) this.itemView.findViewById(R.id.i3w);
        SkuPrice price2 = item.getPrice();
        if (price2 != null && (price = price2.realPrice) != null) {
            charSequence = price.getPriceStr();
        } else {
            charSequence = null;
        }
        textView.setText(charSequence);
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.msq);
        o.LJIIIIZZ(textView2, "itemView.unavailable_text");
        OUP.LJJLIIIJILLIZJL(textView2, item.getUnavailableText());
        TextView textView3 = (TextView) this.itemView.findViewById(R.id.euj);
        if (C72704Sg8.LIZIZ(this.itemView, "itemView.context")) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(g0.LJJIII(item));
            LIZ.append(" x");
            LIZIZ = X1D.LIZIZ(LIZ);
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("x ");
            LIZ2.append(g0.LJJIII(item));
            LIZIZ = X1D.LIZIZ(LIZ2);
        }
        textView3.setText(LIZIZ);
    }
}
