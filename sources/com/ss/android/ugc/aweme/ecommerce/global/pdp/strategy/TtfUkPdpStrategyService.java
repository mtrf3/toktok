package com.ss.android.ugc.aweme.ecommerce.global.pdp.strategy;

import X.ANP;
import X.ANY;
import X.AZ0;
import X.AZ7;
import X.AZ8;
import X.AZ9;
import X.AZA;
import X.AbstractC26779Af9;
import X.C26169AOv;
import X.C26499Aad;
import X.C26778Af8;
import X.C69855RbH;
import X.C73242Soo;
import X.EnumC26549AbR;
import X.InterfaceC26883Agp;
import X.InterfaceC27210Am6;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.engine.DefaultPdpStrategyService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.vm.TtfUkPdpViewModel;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC27210Am6(name = "product_detail")
/* loaded from: classes5.dex */
public final class TtfUkPdpStrategyService extends DefaultPdpStrategyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.engine.DefaultPdpStrategyService
    /* renamed from: LIZLLL */
    public final PdpViewModel LIZIZ() {
        C69855RbH.LIZ.getClass();
        if (C69855RbH.LIZ()) {
            return new PdpViewModel();
        }
        return new TtfUkPdpViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.engine.DefaultPdpStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final /* bridge */ /* synthetic */ ViewModel LIZIZ() {
        return LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.engine.DefaultPdpStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final EnumC26549AbR getType() {
        return EnumC26549AbR.TTF_UK_PRODUCT_DETAIL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.engine.DefaultPdpStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final InterfaceC26883Agp<PdpViewModel> LIZJ(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        return new C26499Aad(owner);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.engine.DefaultPdpStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final void LIZ(AbstractC26779Af9 adapter, C73242Soo c73242Soo) {
        o.LJIIIZ(adapter, "adapter");
        if (!(adapter instanceof C26778Af8)) {
            return;
        }
        DefaultPdpStrategyService.LJ((C26778Af8) adapter, c73242Soo);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 73), AZ7.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 60), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 66), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 69), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 74), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 79), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 84), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 88), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 130), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 133), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 137), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 48), C26169AOv.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 56), ANY.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 62), AZA.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 68), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 78), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 83), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 87), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 92), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 96), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 100), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 104), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 107), AZ9.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 113), AZ8.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 122), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 125), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 128), ANP.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 134), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 138), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 49), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 53), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 57), AZ0.LJLIL, null);
    }
}
