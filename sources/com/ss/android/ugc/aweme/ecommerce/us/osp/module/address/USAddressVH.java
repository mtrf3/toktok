package com.ss.android.ugc.aweme.ecommerce.us.osp.module.address;

import X.C16880lQ;
import X.C221108m2;
import X.C26563Abf;
import X.C26566Abi;
import X.C27949Ay1;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73156SnQ;
import X.C78685UuP;
import X.OUP;
import X.TBT;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarling;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.global.osp.vm.GlobalOrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class USAddressVH extends ECJediViewHolder {
    public final View LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public String LJLJI;
    public boolean LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
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

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final OrderSubmitViewModel L() {
        return (OrderSubmitViewModel) this.LJLILLLLZI.getValue();
    }

    public USAddressVH(View view) {
        super(view);
        this.LJLIL = view;
        C65776Prg LIZ = C65352Pkq.LIZ(OrderSubmitViewModel.class);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 130));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        BillStarlingText billStarlingText;
        String str;
        Integer num;
        String str2;
        BillStarling starlingTexts;
        BillStarling starlingTexts2;
        BillStarlingText billStarlingText2;
        C26566Abi item = (C26566Abi) obj;
        o.LJIIIZ(item, "item");
        boolean z = L() instanceof GlobalOrderSubmitViewModel;
        String str3 = null;
        if (item.LJI) {
            View view = this.LJLIL;
            view.findViewById(R.id.mvo).setVisibility(0);
            view.findViewById(R.id.mvl).setVisibility(8);
            ((TuxTextView) view.findViewById(R.id.mv_)).setTextColorRes(R.attr.go);
            ((C26563Abf) view.findViewById(R.id.mvo)).setAddressCardInfo((C26566Abi) getItem());
            if (((C26566Abi) getItem()).LJIIL || o.LJ(((C26566Abi) getItem()).LJIIJ, Boolean.FALSE)) {
                if (!this.LJLJJI) {
                    this.LJLJJI = true;
                    View us_order_submit_address_badge = view.findViewById(R.id.mvm);
                    o.LJIIIIZZ(us_order_submit_address_badge, "us_order_submit_address_badge");
                    us_order_submit_address_badge.setVisibility(0);
                }
            } else {
                View us_order_submit_address_badge2 = view.findViewById(R.id.mvm);
                o.LJIIIIZZ(us_order_submit_address_badge2, "us_order_submit_address_badge");
                us_order_submit_address_badge2.setVisibility(8);
            }
            View us_order_submit_address_exist = view.findViewById(R.id.mvo);
            o.LJIIIIZZ(us_order_submit_address_exist, "us_order_submit_address_exist");
            C16880lQ.LJIIJ(new Au2S14S0200000_4(this, view, 20), us_order_submit_address_exist);
            str2 = "edit_shipping";
        } else {
            View view2 = this.LJLIL;
            view2.findViewById(R.id.mvo).setVisibility(8);
            view2.findViewById(R.id.mvl).setVisibility(0);
            BillInfoData billInfoData = L().LJZ;
            if (billInfoData != null && (starlingTexts = billInfoData.getStarlingTexts()) != null) {
                billStarlingText = starlingTexts.addDeliverAddress;
            } else {
                billStarlingText = null;
            }
            TuxTextView us_cta_desc = (TuxTextView) view2.findViewById(R.id.mv_);
            o.LJIIIIZZ(us_cta_desc, "us_cta_desc");
            if (billStarlingText != null) {
                str = billStarlingText.text;
            } else {
                str = null;
            }
            OUP.LJJJJZI(us_cta_desc, str, "Add an address");
            TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.mv_);
            if (billStarlingText != null) {
                num = billStarlingText.textColor;
            } else {
                num = null;
            }
            tuxTextView.setTextColorRes(C78685UuP.LJLI(num, null));
            View us_order_submit_address_add_address_cta = view2.findViewById(R.id.mvl);
            o.LJIIIIZZ(us_order_submit_address_add_address_cta, "us_order_submit_address_add_address_cta");
            C16880lQ.LJIIJ(new Au2S14S0200000_4(this, view2, 21), us_order_submit_address_add_address_cta);
            str2 = "add_new_shipping";
        }
        C73156SnQ.LJIIIIZZ(this, L(), new TBT() { // from class: X.Awx
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj2) {
                return ((OrderSubmitState) obj2).getPageStatus();
            }
        }, new AqS186S0100000_4(this, 251));
        BillInfoData billInfoData2 = L().LJZ;
        if (billInfoData2 != null && (starlingTexts2 = billInfoData2.getStarlingTexts()) != null && (billStarlingText2 = starlingTexts2.deliveryAddress) != null) {
            str3 = billStarlingText2.text;
        }
        TuxTextView tuxTextView2 = (TuxTextView) this.LJLIL.findViewById(R.id.mvs);
        o.LJIIIIZZ(tuxTextView2, "view.us_order_submit_address_module_name");
        OUP.LJJJJZI(tuxTextView2, str3, "Shipping address");
        if (!o.LJ(str2, this.LJLJI)) {
            C27949Ay1.LJJIFFI(C27949Ay1.LIZ, str2, L().fw0(false), null, null, null, null, null, 2044);
            this.LJLJI = str2;
        }
    }
}
