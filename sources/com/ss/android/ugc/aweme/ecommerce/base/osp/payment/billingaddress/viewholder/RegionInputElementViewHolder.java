package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.viewholder;

import X.C16880lQ;
import X.C214298b3;
import X.C221108m2;
import X.C252989wM;
import X.C253009wO;
import X.C45804HyK;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71652SAe;
import X.C71653SAf;
import X.C71654SAg;
import X.C71655SAh;
import X.C71656SAi;
import X.C71657SAj;
import X.C71658SAk;
import X.C71659SAl;
import X.C71661SAn;
import X.C71673SAz;
import X.C78685UuP;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC65784Pro;
import X.ORZ;
import X.OUP;
import X.YE1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.BillingAddressViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class RegionInputElementViewHolder extends PowerCell<C71661SAn> {
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;

    public RegionInputElementViewHolder() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(BillingAddressViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 259);
        C71656SAi c71656SAi = C71656SAi.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, C71654SAg.INSTANCE, new AqS162S0100000_12(this, 260), new AqS162S0100000_12(this, 261), C71658SAk.INSTANCE, c71656SAi, new AqS162S0100000_12(this, 262), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, C71655SAh.INSTANCE, new AqS162S0100000_12(this, 263), new AqS162S0100000_12(this, 254), C71657SAj.INSTANCE, c71656SAi, new AqS162S0100000_12(this, 255), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, C71653SAf.INSTANCE, new AqS162S0100000_12(this, 256), new AqS162S0100000_12(this, 257), new AqS162S0100000_12(this, 258), c71656SAi, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
        this.LJLILLLLZI = C221108m2.LIZIZ(C71659SAl.LJLIL);
    }

    public final void L(List<Region> list) {
        String str;
        TextView textView = (TextView) this.itemView.findViewById(R.id.l3h);
        if (list != null) {
            str = ORZ.LLD(list, null, null, null, C71652SAe.LJLIL, 31);
        } else {
            str = "";
        }
        textView.setText(str);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C71661SAn c71661SAn) {
        String str;
        String str2;
        String str3;
        PaymentElement paymentElement;
        C71661SAn t = c71661SAn;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        OUP.LJJJJJL(C45804HyK.LJJI(16), itemView);
        View itemView2 = this.itemView;
        o.LJIIIIZZ(itemView2, "itemView");
        itemView2.setTag(R.id.bn_, t.LJLJI);
        ElementDTO elementDTO = t.LJLILLLLZI.get("eg_ccdc_global_billing_address_city");
        ElementDTO elementDTO2 = t.LJLILLLLZI.get("eg_ccdc_global_billing_address_state");
        View view = this.itemView;
        TextView textView = (TextView) view.findViewById(R.id.lw9);
        String str4 = "";
        if ((elementDTO == null || (str = elementDTO.displayName) == null) && (elementDTO2 == null || (str = elementDTO2.displayName) == null)) {
            str = "";
        }
        textView.setText(str);
        TextView textView2 = (TextView) view.findViewById(R.id.l3h);
        if ((elementDTO != null && (str2 = elementDTO.placeholderDisplayName) != null) || (elementDTO2 != null && (str2 = elementDTO2.placeholderDisplayName) != null)) {
            str4 = str2;
        }
        textView2.setHint(str4);
        BillingAddressViewModel billingAddressViewModel = (BillingAddressViewModel) this.LJLIL.getValue();
        Map<String, ElementDTO> addressElementDTOMap = t.LJLILLLLZI;
        o.LJIIIZ(addressElementDTOMap, "addressElementDTOMap");
        ArrayList arrayList = new ArrayList(addressElementDTOMap.size());
        Iterator<Map.Entry<String, ElementDTO>> it = addressElementDTOMap.entrySet().iterator();
        while (it.hasNext()) {
            List list = (List) ((LinkedHashMap) billingAddressViewModel.LJLIL).get(it.next().getKey());
            if (list != null && (paymentElement = (PaymentElement) ORZ.LJLLLL(list)) != null) {
                str3 = paymentElement.getParamValue();
            } else {
                str3 = null;
            }
            arrayList.add(new Region(str3, null, null, null, null, null, 62, null));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (C78685UuP.LJJJZ(((Region) next).name)) {
                arrayList2.add(next);
            }
        }
        L(arrayList2);
        View itemView3 = this.itemView;
        o.LJIIIIZZ(itemView3, "itemView");
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 51, 42), itemView3);
        ((BillingAddressViewModel) this.LJLIL.getValue()).LJLJI = new AqS143S0200000_12(this, t, 93);
        View view2 = this.itemView;
        o.LJII(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.view.RegionElementUS");
        C252989wM c252989wM = (C252989wM) view2;
        if (C78685UuP.LJJJZ(t.LJLJJI)) {
            c252989wM.LJ(new C253009wO(t.LJLJJI, null, false, 6));
        } else {
            t.LJLJJI = null;
            c252989wM.LIZJ();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        return new C71673SAz(context);
    }
}
