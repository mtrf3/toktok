package com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail;

import X.AbstractC26551AbT;
import X.AbstractC26779Af9;
import X.C26479AaJ;
import X.C26498Aac;
import X.C26590Ac6;
import X.C73242Soo;
import X.EnumC26549AbR;
import X.InterfaceC26883Agp;
import X.InterfaceC27210Am6;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC27210Am6(name = "add_address_and_detail")
/* loaded from: classes5.dex */
public class DefaultAddressEditDetailStrategyService extends AbstractC26551AbT<AddressEditDetailViewModel> {
    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final ViewModel LIZIZ() {
        return new AddressEditDetailViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final EnumC26549AbR getType() {
        return EnumC26549AbR.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final InterfaceC26883Agp<AddressEditDetailViewModel> LIZJ(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        return new C26498Aac(owner);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final void LIZ(AbstractC26779Af9 adapter, C73242Soo c73242Soo) {
        o.LJIIIZ(adapter, "adapter");
        if (!(adapter instanceof C26590Ac6)) {
            return;
        }
        c73242Soo.LJFF(new AqS135S0200000_4(this, (DefaultAddressEditDetailStrategyService) adapter, (AbstractC26779Af9<Object>) 274), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1387), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1388), C26479AaJ.LJLIL, null);
    }
}
