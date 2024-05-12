package com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.address;

import X.AbstractC26551AbT;
import X.AbstractC26779Af9;
import X.C26486AaQ;
import X.C26488AaS;
import X.C26497Aab;
import X.C26589Ac5;
import X.C73242Soo;
import X.EnumC26549AbR;
import X.InterfaceC26883Agp;
import X.InterfaceC27210Am6;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC27210Am6(name = "logistics_address")
/* loaded from: classes5.dex */
public class DefaultAddressSelectStrategyService extends AbstractC26551AbT<AddressSelectViewModel> {
    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    /* renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    public AddressSelectViewModel LIZIZ() {
        return new AddressSelectViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public EnumC26549AbR getType() {
        return EnumC26549AbR.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final InterfaceC26883Agp<AddressSelectViewModel> LIZJ(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        return new C26497Aab(owner);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public void LIZ(AbstractC26779Af9 adapter, C73242Soo c73242Soo) {
        o.LJIIIZ(adapter, "adapter");
        if (!(adapter instanceof C26589Ac5)) {
            return;
        }
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1340), C26488AaS.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1341), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1342), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1343), C26486AaQ.LJLIL, null);
    }
}
