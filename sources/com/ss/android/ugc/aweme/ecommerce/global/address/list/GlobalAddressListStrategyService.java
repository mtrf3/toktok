package com.ss.android.ugc.aweme.ecommerce.global.address.list;

import X.AP5;
import X.AP7;
import X.AbstractC26779Af9;
import X.C26507Aal;
import X.C73242Soo;
import X.EnumC26549AbR;
import X.InterfaceC26883Agp;
import X.InterfaceC27210Am6;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.DefaultAddressListStrategyService;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC27210Am6(name = "shipping_info")
/* loaded from: classes5.dex */
public final class GlobalAddressListStrategyService extends DefaultAddressListStrategyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.list.DefaultAddressListStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final ViewModel LIZIZ() {
        return new GlobalAddressListViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.list.DefaultAddressListStrategyService
    /* renamed from: LIZLLL */
    public final AddressListViewModel LIZIZ() {
        return new GlobalAddressListViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.list.DefaultAddressListStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final EnumC26549AbR getType() {
        return EnumC26549AbR.TTS_GLOBAL_ADDRESS_LIST_V1;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.list.DefaultAddressListStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final InterfaceC26883Agp<AddressListViewModel> LIZJ(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        return new C26507Aal(owner);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.list.DefaultAddressListStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final void LIZ(AbstractC26779Af9 adapter, C73242Soo c73242Soo) {
        o.LJIIIZ(adapter, "adapter");
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 943), AP7.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 944), AP5.LJLIL, null);
    }
}
