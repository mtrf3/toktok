package com.ss.android.ugc.aweme.ecommerce.global.pdp.module2.header;

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
public final class HeaderImageUIRegister implements IPdpListUIRegisterService {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.adapter.IPdpListUIRegisterService
    public final void LIZ(C26778Af8 adapter, C73242Soo c73242Soo, C26555AbX bizEnv) {
        o.LJIIIZ(adapter, "adapter");
        o.LJIIIZ(bizEnv, "bizEnv");
        InterfaceC26432AYy interfaceC26432AYy = (InterfaceC26432AYy) C78685UuP.LJIILL(InterfaceC26432AYy.class, new BizIdentity("HEADER_VO", bizEnv), true);
        if (interfaceC26432AYy != null) {
            c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1416), new AqS135S0200000_4(interfaceC26432AYy, adapter, 283), null);
        }
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1417), new AqS170S0100000_4(adapter, 1418), null);
    }
}
