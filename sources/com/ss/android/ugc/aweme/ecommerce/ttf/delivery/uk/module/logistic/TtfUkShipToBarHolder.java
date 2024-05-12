package com.ss.android.ugc.aweme.ecommerce.ttf.delivery.uk.module.logistic;

import X.C0F1;
import X.C16880lQ;
import X.C26817Afl;
import X.C32151Nz;
import X.C44878HjO;
import X.C45804HyK;
import X.C62562cu;
import X.EnumC72807Shn;
import X.O6R;
import X.OUP;
import X.W5F;
import X.W5U;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DispatchTo;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipToBarHolder;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.Icon;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class TtfUkShipToBarHolder extends ShipToBarHolder {
    public final Map<Integer, View> LJLJJI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipToBarHolder
    public final void P() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipToBarHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipToBarHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipToBarHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtfUkShipToBarHolder(ViewGroup viewGroup) {
        super(viewGroup, 0, 6);
        this.LJLJJI = C44878HjO.LIZIZ(viewGroup, "parent");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipToBarHolder
    public final void M(C26817Afl item) {
        Icon icon;
        Image icon2;
        C62562cu thumbFirstImageUrlModel;
        Icon icon3;
        o.LJIIIZ(item, "item");
        C45804HyK.LJJIJIIJIL(this.itemView.findViewById(R.id.fa2));
        C45804HyK.LJJLL(this.itemView.findViewById(R.id.emy));
        TextView textView = (TextView) this.itemView.findViewById(R.id.fa4);
        DispatchTo dispatchTo = item.LIZIZ;
        String str = null;
        if (dispatchTo != null) {
            str = dispatchTo.title;
        }
        textView.setText(str);
        int i = 8;
        C45804HyK.LJJLIIIIJ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), this.itemView.findViewById(R.id.fa4));
        C45804HyK.LJJLL(this.itemView.findViewById(R.id.fa4));
        C45804HyK.LJJLL(this.itemView.findViewById(R.id.gzn));
        View findViewById = this.itemView.findViewById(R.id.gzn);
        o.LJIIIIZZ(findViewById, "itemView.new_layout");
        OUP.LJJJJJL(C45804HyK.LJJI(0), findViewById);
        boolean LIZIZ = C0F1.LIZIZ(this.itemView, "itemView.context");
        DispatchTo dispatchTo2 = item.LIZIZ;
        if (LIZIZ) {
            if (dispatchTo2 != null && (icon3 = dispatchTo2.iconTo) != null) {
                icon2 = icon3.getIconDark();
                if (icon2 != null && (thumbFirstImageUrlModel = icon2.toThumbFirstImageUrlModel()) != null) {
                    W5F LJIIIZ = W5U.LJIIIZ(thumbFirstImageUrlModel);
                    LJIIIZ.LJIIJJI = R.drawable.adx;
                    LJIIIZ.LJIJJ = EnumC72807Shn.FIT_XY;
                    LJIIIZ.LJJIIJZLJL = (ImageView) this.itemView.findViewById(R.id.emy);
                    C16880lQ.LLJJJ(LJIIIZ);
                }
            }
        } else if (dispatchTo2 != null && (icon = dispatchTo2.iconTo) != null) {
            icon2 = icon.getIcon();
            if (icon2 != null) {
                W5F LJIIIZ2 = W5U.LJIIIZ(thumbFirstImageUrlModel);
                LJIIIZ2.LJIIJJI = R.drawable.adx;
                LJIIIZ2.LJIJJ = EnumC72807Shn.FIT_XY;
                LJIIIZ2.LJJIIJZLJL = (ImageView) this.itemView.findViewById(R.id.emy);
                C16880lQ.LLJJJ(LJIIIZ2);
            }
        }
        ((TextView) this.itemView.findViewById(R.id.exw)).setText(L());
        C45804HyK.LJJLIIIIJ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), this.itemView.findViewById(R.id.exw));
        Q();
        this.itemView.setClickable(this.LJLIL);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.f3b);
        if (this.LJLIL) {
            i = 0;
        }
        imageView.setVisibility(i);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipToBarHolder
    /* renamed from: N */
    public final void onBind(C26817Afl item) {
        o.LJIIIZ(item, "item");
        M(item);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipToBarHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* bridge */ /* synthetic */ void onBind(Object obj) {
        onBind((C26817Afl) obj);
    }
}
