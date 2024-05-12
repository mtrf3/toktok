package com.ss.android.ugc.aweme.ecommerce.global.pdp.strategy;

import X.ANV;
import X.AZ5;
import X.AZ6;
import X.AbstractC26779Af9;
import X.C26104AMi;
import X.C26170AOw;
import X.C26433AYz;
import X.C26778Af8;
import X.C69855RbH;
import X.C73242Soo;
import X.EnumC26549AbR;
import X.InterfaceC27210Am6;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.engine.DefaultPdpStrategyService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.vm.GlobalPdpViewModel;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC27210Am6(name = "product_detail")
/* loaded from: classes5.dex */
public class GlobalPdpStrategyService extends DefaultPdpStrategyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.engine.DefaultPdpStrategyService
    /* renamed from: LIZLLL */
    public PdpViewModel LIZIZ() {
        C69855RbH.LIZ.getClass();
        if (C69855RbH.LIZ()) {
            return new PdpViewModel();
        }
        return new GlobalPdpViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.engine.DefaultPdpStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public /* bridge */ /* synthetic */ ViewModel LIZIZ() {
        return LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.engine.DefaultPdpStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public EnumC26549AbR getType() {
        return EnumC26549AbR.GLOBAL_PRODUCT_DETAIL_V1;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.engine.DefaultPdpStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public void LIZ(AbstractC26779Af9 adapter, C73242Soo c73242Soo) {
        C26778Af8 c26778Af8;
        o.LJIIIZ(adapter, "adapter");
        if ((adapter instanceof C26778Af8) && (c26778Af8 = (C26778Af8) adapter) != null) {
            DefaultPdpStrategyService.LJ(c26778Af8, c73242Soo);
            c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 93), AZ5.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 61), new AqS170S0100000_4(c26778Af8, 64), null);
            c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 67), new AqS170S0100000_4(c26778Af8, 71), null);
            c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 76), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 81), null);
            c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 85), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 54), null);
            c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 58), ANV.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 63), AZ6.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 70), new AqS170S0100000_4(c26778Af8, 75), null);
            c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 80), C26170AOw.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 89), new AqS170S0100000_4(c26778Af8, 97), null);
            c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 101), new AqS170S0100000_4(c26778Af8, 105), null);
            c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 108), new AqS170S0100000_4(c26778Af8, 111), null);
            c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 114), new AqS170S0100000_4(c26778Af8, 117), null);
            c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 119), C26104AMi.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 126), new AqS170S0100000_4(c26778Af8, 131), null);
            c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 135), new AqS170S0100000_4(c26778Af8, 139), null);
            c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 46), new AqS170S0100000_4(c26778Af8, 51), null);
            c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 55), C26433AYz.LJLIL, null);
        }
    }
}
