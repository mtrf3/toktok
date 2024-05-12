package com.ss.android.ugc.aweme.ecommerce.us.logistic.module.shipto;

import X.C16880lQ;
import X.C1DG;
import X.C221108m2;
import X.C26508Aam;
import X.C26744Aea;
import X.C26817Afl;
import X.C44878HjO;
import X.C45804HyK;
import X.C61878OQg;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C68322mC;
import X.C88913eJ;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipToBarHolder;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class USShipToBarVH extends ShipToBarHolder {
    public final C62822Ol8 LJLJJI;
    public final Map<Integer, View> LJLJJL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipToBarHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipToBarHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipToBarHolder
    public final void Q() {
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 54, 42), itemView);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USShipToBarVH(ViewGroup viewGroup) {
        super(viewGroup, R.layout.a90, 2);
        this.LJLJJL = C44878HjO.LIZIZ(viewGroup, "parent");
        C65776Prg LIZ = C65352Pkq.LIZ(DeliveryPanelViewModel.class);
        this.LJLJJI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 128));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.String] */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipToBarHolder
    /* renamed from: N */
    public final void onBind(C26817Afl item) {
        String str;
        o.LJIIIZ(item, "item");
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C26508Aam.LIZ(itemView, true);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.jwm);
        if (_$_findCachedViewById != null) {
            C45804HyK.LJJLL(_$_findCachedViewById);
        }
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = "";
        C68322mC c68322mC2 = new C68322mC();
        c68322mC2.element = C88913eJ.LIZ(this.itemView, R.string.fby, "itemView.context.getStri…istics_panel_ship_to_txt)");
        item.LIZJ(new AqS170S0100000_4(c68322mC, (C68322mC<List<Object>>) 881));
        AqS135S0200000_4 aqS135S0200000_4 = new AqS135S0200000_4(c68322mC, (C68322mC<String>) c68322mC2, (C68322mC<String>) 130);
        List<Region> LIZIZ = item.LIZIZ();
        if (LIZIZ != null) {
            aqS135S0200000_4.invoke(LIZIZ);
        }
        int i = 0;
        if (((CharSequence) c68322mC.element).length() == 0) {
            str = (String) c68322mC2.element;
        } else {
            str = (String) c68322mC.element;
        }
        if (o.LJ(str, this.itemView.getContext().getString(R.string.fby))) {
            TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.jxn);
            if (tuxTextView != null) {
                tuxTextView.setTextColorRes(R.attr.gp);
            }
        } else {
            TuxTextView tuxTextView2 = (TuxTextView) _$_findCachedViewById(R.id.jxn);
            if (tuxTextView2 != null) {
                tuxTextView2.setTextColorRes(R.attr.go);
            }
        }
        TextView textView = (TextView) _$_findCachedViewById(R.id.jxn);
        if (textView != null) {
            textView.setText(str);
        }
        Q();
        View view = this.itemView;
        if (view != null) {
            view.setClickable(this.LJLIL);
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.cob);
        if (_$_findCachedViewById2 != null) {
            if (!this.LJLIL) {
                i = 8;
            }
            _$_findCachedViewById2.setVisibility(i);
        }
        Boolean bool = C26744Aea.LIZ().enableSearchAddress;
        if (bool != null) {
            if (bool.booleanValue()) {
                TuxTextView tuxTextView3 = (TuxTextView) _$_findCachedViewById(R.id.cob);
                if (tuxTextView3 == null) {
                    return;
                }
                C1DG.LJI(this.itemView, R.string.f5h, tuxTextView3);
                return;
            }
            String LIZ = C88913eJ.LIZ(this.itemView, R.string.fbu, "itemView.context.getStri…pdp_logistics_panel_edit)");
            DeliveryData deliveryData = ((DeliveryPanelViewModel) this.LJLJJI.getValue()).LJLJLLL;
            if (deliveryData != null) {
                List list = deliveryData.addresses;
                if (list == null) {
                    list = C61878OQg.INSTANCE;
                }
                if (true ^ list.isEmpty()) {
                    LIZ = C88913eJ.LIZ(this.itemView, R.string.f5h, "itemView.context.getStri…address_unavailable_edit)");
                }
            }
            TextView textView2 = (TextView) _$_findCachedViewById(R.id.cob);
            if (textView2 == null) {
                return;
            }
            textView2.setText(LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipToBarHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* bridge */ /* synthetic */ void onBind(Object obj) {
        onBind((C26817Afl) obj);
    }
}
