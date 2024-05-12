package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.viewholder;

import X.C16880lQ;
import X.C214298b3;
import X.C27493Aqf;
import X.C65352Pkq;
import X.C65776Prg;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC65784Pro;
import X.OUP;
import X.SBI;
import X.SFT;
import X.SFU;
import X.SFV;
import X.SFW;
import X.SFX;
import X.SFY;
import X.YE1;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.BillingAddressViewModel;
import com.ss.android.ugc.aweme.utils.Au2S19S0200000_12;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SameShippingAddressElementViewHolder extends PowerCell<SBI> {
    public final C214298b3 LJLIL;

    public SameShippingAddressElementViewHolder() {
        C214298b3 c214298b3;
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(BillingAddressViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 269);
        SFW sfw = SFW.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SFU.INSTANCE, new AqS162S0100000_12(this, 270), new AqS162S0100000_12(this, 271), SFY.INSTANCE, sfw, new AqS162S0100000_12(this, 272), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SFV.INSTANCE, new AqS162S0100000_12(this, 273), new AqS162S0100000_12(this, 264), SFX.INSTANCE, sfw, new AqS162S0100000_12(this, 265), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SFT.INSTANCE, new AqS162S0100000_12(this, 266), new AqS162S0100000_12(this, 267), new AqS162S0100000_12(this, 268), sfw, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C27493Aqf.LIZJ("use_shipping_address");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(SBI sbi) {
        int i;
        SBI t = sbi;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        View findViewById = this.itemView.findViewById(R.id.lyd);
        o.LJIIIIZZ(findViewById, "itemView.tvTitleLabel");
        if (t.LJLILLLLZI) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById.setVisibility(i);
        View findViewById2 = this.itemView.findViewById(R.id.atb);
        o.LJIIIIZZ(findViewById2, "itemView.btSameAddress");
        C16880lQ.LJIIJ(new Au2S19S0200000_12(this, t, 31, 42), findViewById2);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return OUP.LJIL(R.layout.xr, parent, false);
    }
}
