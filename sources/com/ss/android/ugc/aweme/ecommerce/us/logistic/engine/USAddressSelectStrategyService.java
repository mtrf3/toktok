package com.ss.android.ugc.aweme.ecommerce.us.logistic.engine;

import X.AP0;
import X.AP1;
import X.AbstractC26779Af9;
import X.C26459AZz;
import X.C26465Aa5;
import X.C26589Ac5;
import X.C73242Soo;
import X.EnumC26549AbR;
import X.InterfaceC27210Am6;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.address.DefaultAddressSelectStrategyService;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.vm.USAddressSelectViewModel;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC27210Am6(name = "logistics_address")
/* loaded from: classes5.dex */
public final class USAddressSelectStrategyService extends DefaultAddressSelectStrategyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.address.DefaultAddressSelectStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final ViewModel LIZIZ() {
        return new USAddressSelectViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.address.DefaultAddressSelectStrategyService
    /* renamed from: LIZLLL */
    public final AddressSelectViewModel LIZIZ() {
        return new USAddressSelectViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.address.DefaultAddressSelectStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final EnumC26549AbR getType() {
        return EnumC26549AbR.US_LOGISTICS_ADDRESS;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.address.DefaultAddressSelectStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final void LIZ(AbstractC26779Af9 adapter, C73242Soo c73242Soo) {
        o.LJIIIZ(adapter, "adapter");
        if (!(adapter instanceof C26589Ac5)) {
            return;
        }
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1578), C26459AZz.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1581), AP1.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1583), C26465Aa5.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1585), AP0.LJLIL, null);
    }
}
