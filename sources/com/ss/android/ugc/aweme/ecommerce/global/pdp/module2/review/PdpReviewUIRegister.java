package com.ss.android.ugc.aweme.ecommerce.global.pdp.module2.review;

import X.ANU;
import X.C26117AMv;
import X.C26119AMx;
import X.C26431AYx;
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
public final class PdpReviewUIRegister implements IPdpListUIRegisterService {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.adapter.IPdpListUIRegisterService
    public final void LIZ(C26778Af8 adapter, C73242Soo c73242Soo, C26555AbX bizEnv) {
        o.LJIIIZ(adapter, "adapter");
        o.LJIIIZ(bizEnv, "bizEnv");
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1616), ANU.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1617), C26117AMv.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1618), C26119AMx.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1619), new AqS170S0100000_4(adapter, 1620), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1621), new AqS170S0100000_4(adapter, 1607), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1608), new AqS170S0100000_4(adapter, 1609), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1610), new AqS170S0100000_4(adapter, 1611), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1612), new AqS170S0100000_4(adapter, 1613), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1614), C26431AYx.LJLIL, null);
        InterfaceC26432AYy interfaceC26432AYy = (InterfaceC26432AYy) C78685UuP.LJIILL(InterfaceC26432AYy.class, new BizIdentity("SeeMoreVO", bizEnv), true);
        if (interfaceC26432AYy != null) {
            c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1615), new AqS135S0200000_4(interfaceC26432AYy, adapter, 323), null);
        }
    }
}
