package com.ss.android.ugc.aweme.ecommerce.ttf.delivery.uk.module.logistic;

import X.C0F1;
import X.C16880lQ;
import X.C44878HjO;
import X.C45804HyK;
import X.C62562cu;
import X.C70759Rpr;
import X.EnumC72807Shn;
import X.W5F;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DispatchFrom;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipFromBarHolder;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.Icon;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class TtfUkShipFromBarHolder extends ShipFromBarHolder {
    public final Map<Integer, View> LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipFromBarHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipFromBarHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipFromBarHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtfUkShipFromBarHolder(ViewGroup viewGroup) {
        super(viewGroup);
        this.LJLILLLLZI = C44878HjO.LIZIZ(viewGroup, "parent");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipFromBarHolder
    public final void L(DispatchFrom item) {
        Image icon;
        C62562cu thumbFirstImageUrlModel;
        C62562cu thumbFirstImageUrlModel2;
        o.LJIIIZ(item, "item");
        C45804HyK.LJJIJIIJIL(this.itemView.findViewById(R.id.f51));
        C45804HyK.LJJLL(this.itemView.findViewById(R.id.emx));
        ((TextView) this.itemView.findViewById(R.id.mk2)).setText(item.title);
        C45804HyK.LJJLL(this.itemView.findViewById(R.id.mk2));
        C45804HyK.LJJLIIIIJ(C45804HyK.LJJI(8), this.itemView.findViewById(R.id.mk2));
        C45804HyK.LJJLL(this.itemView.findViewById(R.id.f6o));
        C45804HyK.LJJIJIIJIL(this.itemView.findViewById(R.id.exx));
        C45804HyK.LJJLL(this.itemView.findViewById(R.id.gzn));
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        ShipFromBarHolder.M(itemView, item.warehouseTag);
        ((TextView) this.itemView.findViewById(R.id.mjz)).setText(item.text);
        C45804HyK.LJJLIIIJ(C45804HyK.LJJI(4), this.itemView.findViewById(R.id.mjz));
        C45804HyK.LJJLIIIIJ(C45804HyK.LJJI(8), this.itemView.findViewById(R.id.mjz));
        Image image = null;
        if (C0F1.LIZIZ(this.itemView, "itemView.context")) {
            Icon icon2 = item.icon;
            if (icon2 != null) {
                image = icon2.getIconDark();
            }
        } else {
            Icon icon3 = item.icon;
            if (icon3 != null) {
                image = icon3.getIcon();
            }
        }
        if (image != null && (thumbFirstImageUrlModel2 = image.toThumbFirstImageUrlModel()) != null) {
            W5F LIZLLL = C70759Rpr.LIZLLL(thumbFirstImageUrlModel2);
            LIZLLL.LJIIJJI = R.drawable.adx;
            LIZLLL.LJIJJ = EnumC72807Shn.FIT_XY;
            LIZLLL.LJJIIJZLJL = (ImageView) this.itemView.findViewById(R.id.emx);
            C16880lQ.LLJJJ(LIZLLL);
        }
        boolean LIZIZ = C0F1.LIZIZ(this.itemView, "itemView.context");
        Icon icon4 = item.arrow;
        if (LIZIZ) {
            if (icon4 != null) {
                icon = icon4.getIconDark();
            } else {
                return;
            }
        } else if (icon4 == null) {
            return;
        } else {
            icon = icon4.getIcon();
        }
        if (icon != null && (thumbFirstImageUrlModel = icon.toThumbFirstImageUrlModel()) != null) {
            W5F LIZLLL2 = C70759Rpr.LIZLLL(thumbFirstImageUrlModel);
            LIZLLL2.LJIIJJI = R.drawable.adx;
            LIZLLL2.LJIJJ = EnumC72807Shn.FIT_XY;
            LIZLLL2.LJJIIJZLJL = (ImageView) this.itemView.findViewById(R.id.f6o);
            C16880lQ.LLJJJ(LIZLLL2);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipFromBarHolder
    /* renamed from: N */
    public final void onBind(DispatchFrom item) {
        o.LJIIIZ(item, "item");
        L(item);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipFromBarHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* bridge */ /* synthetic */ void onBind(Object obj) {
        onBind((DispatchFrom) obj);
    }
}
