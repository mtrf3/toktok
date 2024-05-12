package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress;

import X.C214298b3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9BE;
import X.InterfaceC60061Nhh;
import X.SBG;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class BillingAddressAssemV2 extends UIContentAssem implements InterfaceC60061Nhh {
    public final C214298b3 LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    public BillingAddressAssemV2() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(BillingAddressViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS162S0100000_12(LIZ, 233), SBG.INSTANCE, null);
    }

    public final BillingAddressViewModel v3() {
        return (BillingAddressViewModel) this.LJLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        EventCenter.LJ().LIZIZ("ec_district_panel_changed_v2", this);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0134 A[SYNTHETIC] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r21) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.BillingAddressAssemV2.onViewCreated(android.view.View):void");
    }

    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        o.LJIIIZ(eventName, "eventName");
        v3().nv0(eventName, str);
    }
}
