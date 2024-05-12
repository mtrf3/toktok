package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.viewholder;

import X.AnonymousClass391;
import X.C04270Et;
import X.C214298b3;
import X.C26338AVi;
import X.C26718AeA;
import X.C26719AeB;
import X.C27316Ano;
import X.C27317Anp;
import X.C27318Anq;
import X.C27319Anr;
import X.C27354AoQ;
import X.C27356AoS;
import X.C27493Aqf;
import X.C27681Ath;
import X.C27682Ati;
import X.C27683Atj;
import X.C28112B1o;
import X.C2NU;
import X.C32151Nz;
import X.C36636EZk;
import X.C47261Igj;
import X.C59102Tq;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76542zS;
import X.C78983UzD;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.FKM;
import X.InterfaceC27330Ao2;
import X.InterfaceC27359AoV;
import X.InterfaceC65784Pro;
import X.O6R;
import X.OUP;
import X.V1M;
import X.XKQ;
import X.XKX;
import X.YE1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.BillingAddressViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS58S1100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SearchAddressElementViewHolder extends PowerCell<C59102Tq> implements InterfaceC27330Ao2, InterfaceC27359AoV<CandInputData> {
    public final C27354AoQ<CandInputData> LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public boolean LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public boolean LJLJL;
    public final C214298b3 LJLJLJ;

    @Override // X.InterfaceC27330Ao2
    public final void LJIIZILJ() {
    }

    public SearchAddressElementViewHolder() {
        C214298b3 c214298b3;
        new LinkedHashMap();
        this.LJLILLLLZI = "";
        this.LJLJI = "";
        this.LJLJJL = "address_searchbarFOCUS";
        this.LJLJJLL = "address_searchbarshow";
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(BillingAddressViewModel.class);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(LIZ, 213);
        C27316Ano c27316Ano = C27316Ano.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS154S0100000_4, C27682Ati.INSTANCE, new AqS154S0100000_4(this, 214), new AqS154S0100000_4(this, 215), C27318Anq.INSTANCE, c27316Ano, new AqS154S0100000_4(this, 216), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS154S0100000_4, C27683Atj.INSTANCE, new AqS154S0100000_4(this, 217), new AqS154S0100000_4(this, 208), C27317Anp.INSTANCE, c27316Ano, new AqS154S0100000_4(this, 209), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS154S0100000_4, C27681Ath.INSTANCE, new AqS154S0100000_4(this, 210), new AqS154S0100000_4(this, 211), new AqS154S0100000_4(this, 212), c27316Ano, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLJLJ = c214298b3;
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        C27354AoQ<CandInputData> c27354AoQ = new C27354AoQ<>(context);
        C26338AVi.LJIIIZ(c27354AoQ, AnonymousClass391.LIZJ(6), AnonymousClass391.LIZJ(9), AnonymousClass391.LIZJ(12), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(9))), 16);
        c27354AoQ.setBackground(C04270Et.LIZIZ(c27354AoQ.getContext(), R.drawable.ack));
        c27354AoQ.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.LJLIL = c27354AoQ;
    }

    @Override // X.InterfaceC27359AoV
    public final void c7() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C27493Aqf.LIZ);
        linkedHashMap.put("input_box_name", "address_searchbar");
        linkedHashMap.put("button_name", "enter_address");
        linkedHashMap.put("button_area", "drop_down_list_address_searchbar");
        C76542zS.LIZ("tiktokec_button_click", linkedHashMap);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC227608wW
    public final void onDestroy() {
        super.onDestroy();
        C27354AoQ<CandInputData> c27354AoQ = this.LJLIL;
        if (c27354AoQ != null) {
            ((ArrayList) c27354AoQ.LJLIL).remove(this);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        ((ViewGroup) this.itemView.findViewById(R.id.gas)).addView(this.LJLIL, 0);
        View findViewById = this.itemView.findViewById(R.id.gas);
        o.LJIIIIZZ(findViewById, "itemView.lv_address_search");
        OUP.LJJJJIZL(0, findViewById);
        View findViewById2 = this.itemView.findViewById(R.id.gas);
        o.LJIIIIZZ(findViewById2, "itemView.lv_address_search");
        OUP.LJJJJJ(0, findViewById2);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        OUP.LJJJJI(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), itemView);
        C27354AoQ<CandInputData> c27354AoQ = this.LJLIL;
        if (c27354AoQ != null) {
            c27354AoQ.LIZJ(this);
        }
    }

    @Override // X.InterfaceC27330Ao2
    public final void Rb(String str) {
        BillingAddressViewModel billingAddressViewModel = (BillingAddressViewModel) this.LJLJLJ.getValue();
        AddressItem addressItem = new AddressItem("address_searchbar", str);
        AqS58S1100000_4 aqS58S1100000_4 = new AqS58S1100000_4(this, str, 7);
        Address address = new Address(CardStruct.IStatusCode.DEFAULT, C47261Igj.LJJIJ(addressItem), billingAddressViewModel.kv0(), billingAddressViewModel.LJLJLJ, null, 16, null);
        C27319Anr c27319Anr = (C27319Anr) billingAddressViewModel.LJLJLLL.getValue();
        c27319Anr.getClass();
        FKM.LIZ();
        try {
            if (C2NU.LIZ.LIZIZ()) {
                try {
                    XKQ xkq = c27319Anr.LIZIZ;
                    if (xkq != null) {
                        xkq.LIZIZ(null);
                    }
                    c27319Anr.LIZIZ = XKX.LIZLLL(c27319Anr.LIZ, C36636EZk.LIZ, null, new C26718AeA(c27319Anr, "address_searchbar", address, aqS58S1100000_4, null), 2);
                } catch (Throwable unused) {
                    C78983UzD.LJIILL("getRecommendAddressList fail");
                }
            }
        } catch (Exception unused2) {
        }
    }

    @Override // X.InterfaceC27359AoV
    public final void hg(int i) {
        this.LJLJL = false;
        long LIZ = C27493Aqf.LIZ(this.LJLJJLL);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C27493Aqf.LIZ);
        linkedHashMap.put("drop_down_list_name", "address_searchbar");
        linkedHashMap.put("item_num", String.valueOf(i));
        linkedHashMap.put("stay_time", String.valueOf(LIZ));
        C76542zS.LIZ("tiktokec_drop_down_list_staytime", linkedHashMap);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C59102Tq t) {
        String str;
        C27354AoQ<CandInputData> c27354AoQ;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        C59102Tq item = getItem();
        if (item != null && (str = item.LJLIL) != null && (c27354AoQ = this.LJLIL) != null) {
            c27354AoQ.setHint(str);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return OUP.LJIL(R.layout.xf, parent, false);
    }

    @Override // X.InterfaceC27330Ao2
    public final void eh(View view, String str, boolean z) {
        String str2;
        String str3;
        o.LJIIIZ(view, "view");
        if (z) {
            this.LJLJJI = false;
            C27493Aqf.LIZLLL(null, "address_searchbar");
            C27493Aqf.LJ(this.LJLJJL);
        } else {
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            if (this.LJLJI.length() == str2.length()) {
                str3 = "";
            } else {
                this.LJLJI.getClass();
                str3 = "add";
            }
            long LIZ = C28112B1o.LIZ(this.LJLJJL);
            boolean LJ = o.LJ(this.LJLJI, str2);
            boolean z2 = this.LJLJJI;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(C27493Aqf.LIZ);
            linkedHashMap.put("input_box_name", "address_searchbar");
            linkedHashMap.put("stay_time", String.valueOf(LIZ));
            linkedHashMap.put("input_method", str3);
            linkedHashMap.put("has_normal_input", V1M.LJJJJZ(LJ));
            linkedHashMap.put("has_auto_input", V1M.LJJJJZ(false));
            linkedHashMap.put("has_sug_input", V1M.LJJJJZ(z2));
            linkedHashMap.put("is_valid", "1");
            C76542zS.LIZ("tiktokec_input_staytime", linkedHashMap);
        }
        if (str == null) {
            str = "";
        }
        this.LJLJI = str;
    }

    @Override // X.InterfaceC27359AoV
    public final void ke(C27356AoS<CandInputData> result, int i, int i2) {
        o.LJIIIZ(result, "result");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C27493Aqf.LIZ);
        linkedHashMap.put("drop_down_list_name", "address_searchbar");
        linkedHashMap.put("item_num", String.valueOf(i));
        linkedHashMap.put("rank", String.valueOf(i2));
        linkedHashMap.put("action_type", "click");
        C76542zS.LIZ("tiktokec_drop_down_list_click", linkedHashMap);
        this.LJLJJI = true;
        BillingAddressViewModel billingAddressViewModel = (BillingAddressViewModel) this.LJLJLJ.getValue();
        CandInputData candInputData = result.LIZ;
        Address address = candInputData.address;
        String str = this.LJLILLLLZI;
        String str2 = candInputData.autocompleteAddressId;
        Integer num = candInputData.placeType;
        AqS170S0100000_4 aqS170S0100000_4 = new AqS170S0100000_4(this, 277);
        C27319Anr c27319Anr = (C27319Anr) billingAddressViewModel.LJLJLLL.getValue();
        c27319Anr.getClass();
        if (address == null || str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return;
        }
        try {
            XKQ xkq = c27319Anr.LIZJ;
            if (xkq != null) {
                xkq.LIZIZ(null);
            }
            c27319Anr.LIZJ = XKX.LIZLLL(c27319Anr.LIZ, C36636EZk.LIZ, null, new C26719AeB(c27319Anr, address, str, str2, num, aqS170S0100000_4, null), 2);
        } catch (Throwable unused) {
            C78983UzD.LJIILL("getAddressDetail fail");
        }
    }
}
