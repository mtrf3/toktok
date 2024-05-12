package com.ss.android.ugc.aweme.ecommerce.us.osp.payment.viewholder.ccdc;

import X.C16880lQ;
import X.C214298b3;
import X.C221108m2;
import X.C252989wM;
import X.C253009wO;
import X.C45804HyK;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71660SAm;
import X.C71666SAs;
import X.C71667SAt;
import X.C71668SAu;
import X.C71669SAv;
import X.C71670SAw;
import X.C71671SAx;
import X.C71672SAy;
import X.C71673SAz;
import X.C71678SBe;
import X.C78685UuP;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC65784Pro;
import X.ORZ;
import X.YE1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
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
public class USBARegionInputElementViewHolder extends PowerCell<C71678SBe> {
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;

    public final CCDCAddCardViewModel getViewModel() {
        return (CCDCAddCardViewModel) this.LJLIL.getValue();
    }

    public USBARegionInputElementViewHolder() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(CCDCAddCardViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 559);
        C71670SAw c71670SAw = C71670SAw.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, C71668SAu.INSTANCE, new AqS162S0100000_12(this, 560), new AqS162S0100000_12(this, 561), C71672SAy.INSTANCE, c71670SAw, new AqS162S0100000_12(this, 562), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, C71669SAv.INSTANCE, new AqS162S0100000_12(this, 563), new AqS162S0100000_12(this, 554), C71671SAx.INSTANCE, c71670SAw, new AqS162S0100000_12(this, 555), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, C71667SAt.INSTANCE, new AqS162S0100000_12(this, 556), new AqS162S0100000_12(this, 557), new AqS162S0100000_12(this, 558), c71670SAw, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
        this.LJLILLLLZI = C221108m2.LIZIZ(C71660SAm.LJLIL);
    }

    public final void L(List<Region> list) {
        String str;
        TextView textView = (TextView) this.itemView.findViewById(R.id.l3h);
        if (list != null) {
            str = ORZ.LLD(list, null, null, null, C71666SAs.LJLIL, 31);
        } else {
            str = "";
        }
        textView.setText(str);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C71678SBe c71678SBe) {
        String str;
        String str2;
        C252989wM c252989wM;
        String str3;
        PaymentElement paymentElement;
        C71678SBe t = c71678SBe;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        itemView.setTag(R.id.bn_, t.LJLJJL);
        View view = this.itemView;
        view.setPadding(view.getPaddingLeft(), this.itemView.getPaddingTop(), C45804HyK.LJJI(16), this.itemView.getPaddingBottom());
        ElementDTO elementDTO = t.LJLILLLLZI.get("eg_ccdc_global_billing_address_city");
        ElementDTO elementDTO2 = t.LJLILLLLZI.get("eg_ccdc_global_billing_address_state");
        View view2 = this.itemView;
        TextView textView = (TextView) view2.findViewById(R.id.lw9);
        String str4 = "";
        if ((elementDTO == null || (str = elementDTO.displayName) == null) && (elementDTO2 == null || (str = elementDTO2.displayName) == null)) {
            str = "";
        }
        textView.setText(str);
        TextView textView2 = (TextView) view2.findViewById(R.id.l3h);
        if ((elementDTO != null && (str2 = elementDTO.placeholderDisplayName) != null) || (elementDTO2 != null && (str2 = elementDTO2.placeholderDisplayName) != null)) {
            str4 = str2;
        }
        textView2.setHint(str4);
        CCDCAddCardViewModel viewModel = getViewModel();
        Map<String, ElementDTO> addressElementDTOMap = t.LJLILLLLZI;
        viewModel.getClass();
        o.LJIIIZ(addressElementDTOMap, "addressElementDTOMap");
        ArrayList arrayList = new ArrayList(addressElementDTOMap.size());
        Iterator<Map.Entry<String, ElementDTO>> it = addressElementDTOMap.entrySet().iterator();
        while (it.hasNext()) {
            List list = (List) ((LinkedHashMap) viewModel.LJLIL).get(it.next().getKey());
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
        View itemView2 = this.itemView;
        o.LJIIIIZZ(itemView2, "itemView");
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 78, 42), itemView2);
        getViewModel().LJLLI = new AqS143S0200000_12(this, t, 110);
        View view3 = this.itemView;
        if ((view3 instanceof C71673SAz) && (c252989wM = (C252989wM) view3) != null) {
            if (C78685UuP.LJJJZ(t.LJLJI)) {
                c252989wM.LJ(new C253009wO(t.LJLJI, null, false, 6));
            } else {
                t.LJLJI = null;
                c252989wM.LIZJ();
            }
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
