package com.ss.android.ugc.aweme.ecommerce.global.pdp.strategy;

import X.ANZ;
import X.AZ1;
import X.AZC;
import X.AZD;
import X.AZE;
import X.AZG;
import X.AbstractC26779Af9;
import X.C26171AOx;
import X.C26499Aad;
import X.C26778Af8;
import X.C69855RbH;
import X.C73242Soo;
import X.EnumC26549AbR;
import X.InterfaceC26883Agp;
import X.InterfaceC27210Am6;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.engine.DefaultPdpStrategyService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.vm.TtfPdpViewModel;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC27210Am6(name = "product_detail")
/* loaded from: classes5.dex */
public final class TtfSAPdpStrategyService extends DefaultPdpStrategyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.engine.DefaultPdpStrategyService
    /* renamed from: LIZLLL */
    public final PdpViewModel LIZIZ() {
        C69855RbH.LIZ.getClass();
        if (C69855RbH.LIZ()) {
            return new PdpViewModel();
        }
        return new TtfPdpViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.engine.DefaultPdpStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final /* bridge */ /* synthetic */ ViewModel LIZIZ() {
        return LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.engine.DefaultPdpStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final EnumC26549AbR getType() {
        return EnumC26549AbR.TTF_SA_PRODUCT_DETAIL;
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
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 123), AZD.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 110), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 112), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 116), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 118), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 121), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 124), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 127), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 90), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 94), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 98), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 102), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 106), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 109), C26171AOx.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 115), ANZ.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) LiveTryModeCountDownThresholdSetting.DEFAULT), AZG.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 129), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 132), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 136), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 47), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 52), AZE.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 59), AZC.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 65), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 72), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 77), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 82), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 86), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 91), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 95), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 99), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 103), AZ1.LJLIL, null);
    }
}
