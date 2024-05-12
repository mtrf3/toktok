package com.ss.android.ugc.aweme.ecommerce.global.pdp.module2.service;

import X.AZH;
import X.AZK;
import X.C26555AbX;
import X.C26778Af8;
import X.C73242Soo;
import X.C78685UuP;
import X.InterfaceC26432AYy;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.adapter.IPdpListUIRegisterService;
import com.ss.android.ugc.aweme.ecommerce.core.strategy.BizIdentity;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PdpServiceUIRegister implements IPdpListUIRegisterService {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.adapter.IPdpListUIRegisterService
    public final void LIZ(C26778Af8 adapter, C73242Soo c73242Soo, C26555AbX bizEnv) {
        o.LJIIIZ(adapter, "adapter");
        o.LJIIIZ(bizEnv, "bizEnv");
        InterfaceC26432AYy interfaceC26432AYy = (InterfaceC26432AYy) C78685UuP.LJIILL(InterfaceC26432AYy.class, new BizIdentity("GlobalShippingVO", bizEnv), false);
        if (interfaceC26432AYy != null) {
            c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1651), new AqS135S0200000_4(interfaceC26432AYy, adapter, 326), null);
        }
        InterfaceC26432AYy interfaceC26432AYy2 = (InterfaceC26432AYy) C78685UuP.LJIILL(InterfaceC26432AYy.class, new BizIdentity("ProductReturnPolicyVO", bizEnv), false);
        if (interfaceC26432AYy2 != null) {
            c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1661), new AqS135S0200000_4(interfaceC26432AYy2, adapter, 327), null);
        }
        InterfaceC26432AYy interfaceC26432AYy3 = (InterfaceC26432AYy) C78685UuP.LJIILL(InterfaceC26432AYy.class, new BizIdentity("GlobalProductReturnPolicyVO", bizEnv), false);
        if (interfaceC26432AYy3 != null) {
            c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1662), new AqS135S0200000_4(interfaceC26432AYy3, adapter, 328), null);
        }
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1663), new AqS170S0100000_4(adapter, 1664), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1665), new AqS170S0100000_4(adapter, 1666), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1667), AZH.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1652), new AqS170S0100000_4(adapter, 1653), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1654), new AqS170S0100000_4(adapter, 1655), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1656), new AqS170S0100000_4(adapter, 1657), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1658), new AqS170S0100000_4(adapter, 1659), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1660), AZK.LJLIL, null);
    }
}
