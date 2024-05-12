package com.ss.android.ugc.aweme.ecommerce.tts.addresslist.us;

import X.AP6;
import X.AP8;
import X.AbstractC26779Af9;
import X.C26460Aa0;
import X.C26489AaT;
import X.C26506Aak;
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
public class UsAddressListStrategyService extends DefaultAddressListStrategyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.list.DefaultAddressListStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final ViewModel LIZIZ() {
        return new UsAddressListViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.list.DefaultAddressListStrategyService
    /* renamed from: LIZLLL */
    public final AddressListViewModel LIZIZ() {
        return new UsAddressListViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.list.DefaultAddressListStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public EnumC26549AbR getType() {
        return EnumC26549AbR.TTS_US_ADDRESS_LIST_V1;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.list.DefaultAddressListStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final InterfaceC26883Agp<AddressListViewModel> LIZJ(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        return new C26506Aak(owner);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.list.DefaultAddressListStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final void LIZ(AbstractC26779Af9 adapter, C73242Soo c73242Soo) {
        o.LJIIIZ(adapter, "adapter");
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1668), C26460Aa0.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1669), AP8.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1670), AP6.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1671), C26489AaT.LJLIL, null);
    }
}
