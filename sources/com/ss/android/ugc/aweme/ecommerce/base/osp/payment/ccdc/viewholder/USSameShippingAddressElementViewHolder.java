package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder;

import X.ARV;
import X.C117114ih;
import X.C16880lQ;
import X.C214298b3;
import X.C28112B1o;
import X.C45804HyK;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71695SBv;
import X.C79081V1x;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC65784Pro;
import X.OUP;
import X.SEQ;
import X.SER;
import X.SES;
import X.SET;
import X.SEU;
import X.SEV;
import X.YE1;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class USSameShippingAddressElementViewHolder extends PowerCell<C71695SBv> {
    public final C214298b3 LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    public USSameShippingAddressElementViewHolder() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(CCDCAddCardViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 345);
        SET set = SET.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SER.INSTANCE, new AqS162S0100000_12(this, 346), new AqS162S0100000_12(this, 347), SEV.INSTANCE, set, new AqS162S0100000_12(this, 348), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SES.INSTANCE, new AqS162S0100000_12(this, 349), new AqS162S0100000_12(this, 340), SEU.INSTANCE, set, new AqS162S0100000_12(this, 341), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SEQ.INSTANCE, new AqS162S0100000_12(this, 342), new AqS162S0100000_12(this, 343), new AqS162S0100000_12(this, 344), set, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
    }

    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view == null) {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            View findViewById = itemView.findViewById(i);
            if (findViewById != null) {
                linkedHashMap.put(Integer.valueOf(i), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C71695SBv c71695SBv) {
        C71695SBv item = c71695SBv;
        o.LJIIIZ(item, "item");
        super.onBindItemView(item);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        itemView.setTag(R.id.bn_, new C117114ih(C79081V1x.LJII(25), 0, 0, 0, false, 0, true, 254));
        this.itemView.setPadding(C45804HyK.LJJI(16), this.itemView.getPaddingTop(), C45804HyK.LJJI(16), this.itemView.getPaddingBottom());
        if (item.LJLIL == null) {
            C45804HyK.LJJIJIIJIL(_$_findCachedViewById(R.id.jad));
        } else if (o.LJ(item.LJLILLLLZI, "EDIT_CARD")) {
            View sasaLayout = _$_findCachedViewById(R.id.jad);
            o.LJIIIIZZ(sasaLayout, "sasaLayout");
            OUP.LJJLIIIJ(sasaLayout);
        } else {
            View sasaLayout2 = _$_findCachedViewById(R.id.jad);
            o.LJIIIIZZ(sasaLayout2, "sasaLayout");
            OUP.LJJLIIIJ(sasaLayout2);
            ((ARV) _$_findCachedViewById(R.id.jae)).setChecked(true);
            ((CCDCAddCardViewModel) this.LJLIL.getValue()).pv0(true);
        }
        View findViewById = this.itemView.findViewById(R.id.jad);
        o.LJIIIIZZ(findViewById, "itemView.sasaLayout");
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 98, 42), findViewById);
        View sasaLayout3 = _$_findCachedViewById(R.id.jad);
        o.LJIIIIZZ(sasaLayout3, "sasaLayout");
        if (sasaLayout3.getVisibility() == 0) {
            C28112B1o.LJ("use_shipping_address", null);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return OUP.LJIL(R.layout.a8q, parent, false);
    }
}
