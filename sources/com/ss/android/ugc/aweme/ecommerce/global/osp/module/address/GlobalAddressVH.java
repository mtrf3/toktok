package com.ss.android.ugc.aweme.ecommerce.global.osp.module.address;

import X.C16880lQ;
import X.C221108m2;
import X.C26565Abh;
import X.C26566Abi;
import X.C27949Ay1;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.OUP;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarling;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.global.osp.vm.GlobalOrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class GlobalAddressVH extends ECJediViewHolder {
    public final View LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public String LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
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

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final OrderSubmitViewModel L() {
        return (OrderSubmitViewModel) this.LJLILLLLZI.getValue();
    }

    public GlobalAddressVH(View view) {
        super(view);
        this.LJLIL = view;
        C65776Prg LIZ = C65352Pkq.LIZ(OrderSubmitViewModel.class);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 87));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        String str;
        String str2;
        BillStarling starlingTexts;
        BillStarlingText billStarlingText;
        BillStarling starlingTexts2;
        BillStarlingText billStarlingText2;
        C26566Abi item = (C26566Abi) obj;
        o.LJIIIZ(item, "item");
        boolean z = L() instanceof GlobalOrderSubmitViewModel;
        String str3 = null;
        if (item.LJI) {
            View view = this.LJLIL;
            view.findViewById(R.id.mvo).setVisibility(0);
            view.findViewById(R.id.mvk).setVisibility(8);
            ((C26565Abh) view.findViewById(R.id.mvo)).setAddressCardInfo((C26566Abi) getItem());
            View us_order_submit_address_exist = view.findViewById(R.id.mvo);
            o.LJIIIIZZ(us_order_submit_address_exist, "us_order_submit_address_exist");
            C16880lQ.LJIIJ(new Au2S14S0200000_4(this, view, 32), us_order_submit_address_exist);
            str2 = "edit_shipping";
        } else {
            View view2 = this.LJLIL;
            view2.findViewById(R.id.mvo).setVisibility(8);
            view2.findViewById(R.id.mvk).setVisibility(0);
            TuxTextView us_order_submit_address_add_address_button = (TuxTextView) view2.findViewById(R.id.mvk);
            o.LJIIIIZZ(us_order_submit_address_add_address_button, "us_order_submit_address_add_address_button");
            BillInfoData billInfoData = L().LJZ;
            if (billInfoData != null && (starlingTexts = billInfoData.getStarlingTexts()) != null && (billStarlingText = starlingTexts.addDeliverAddress) != null) {
                str = billStarlingText.text;
            } else {
                str = null;
            }
            OUP.LJJJJZI(us_order_submit_address_add_address_button, str, "Add shipping address");
            View us_order_submit_address_add_address_button2 = view2.findViewById(R.id.mvk);
            o.LJIIIIZZ(us_order_submit_address_add_address_button2, "us_order_submit_address_add_address_button");
            C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 80, 42), us_order_submit_address_add_address_button2);
            str2 = "add_new_shipping";
        }
        BillInfoData billInfoData2 = L().LJZ;
        if (billInfoData2 != null && (starlingTexts2 = billInfoData2.getStarlingTexts()) != null && (billStarlingText2 = starlingTexts2.deliveryAddress) != null) {
            str3 = billStarlingText2.text;
        }
        TuxTextView tuxTextView = (TuxTextView) this.LJLIL.findViewById(R.id.mvs);
        o.LJIIIIZZ(tuxTextView, "view.us_order_submit_address_module_name");
        OUP.LJJJJZI(tuxTextView, str3, "Shipping address");
        if (!o.LJ(str2, this.LJLJI)) {
            C27949Ay1.LJJIFFI(C27949Ay1.LIZ, str2, L().fw0(false), null, null, null, null, null, 2044);
            this.LJLJI = str2;
        }
    }
}
