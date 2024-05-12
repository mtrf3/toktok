package com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us;

import X.AbstractC26779Af9;
import X.C26100AMe;
import X.C26467Aa7;
import X.C26482AaM;
import X.C26494AaY;
import X.C26586Ac2;
import X.C73242Soo;
import X.EnumC26549AbR;
import X.InterfaceC26883Agp;
import X.InterfaceC27210Am6;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.DefaultAddressEditStrategyService;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC27210Am6(name = "shipping_address")
/* loaded from: classes5.dex */
public final class USAddressEditStrategyService extends DefaultAddressEditStrategyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.DefaultAddressEditStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final ViewModel LIZIZ() {
        return new USAddressEditViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.DefaultAddressEditStrategyService
    /* renamed from: LIZLLL */
    public final AddressEditViewModel LIZIZ() {
        return new USAddressEditViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.DefaultAddressEditStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final EnumC26549AbR getType() {
        return EnumC26549AbR.TTS_US_ADDRESS_EDIT_V1;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.DefaultAddressEditStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final InterfaceC26883Agp<AddressEditViewModel> LIZJ(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        return new C26494AaY(owner);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.DefaultAddressEditStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final void LIZ(AbstractC26779Af9 adapter, C73242Soo c73242Soo) {
        o.LJIIIZ(adapter, "adapter");
        c73242Soo.LJFF(new AqS135S0200000_4(this, (USAddressEditStrategyService) adapter, (AbstractC26779Af9<Object>) 318), C26482AaM.LJLIL, null);
        if (adapter instanceof C26586Ac2) {
            c73242Soo.LJFF(new AqS135S0200000_4(this, (USAddressEditStrategyService) adapter, (AbstractC26779Af9<Object>) 319), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1574), null);
            c73242Soo.LJFF(new AqS135S0200000_4(this, (USAddressEditStrategyService) adapter, (AbstractC26779Af9<Object>) 320), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1575), null);
            c73242Soo.LJFF(new AqS135S0200000_4(this, (USAddressEditStrategyService) adapter, (AbstractC26779Af9<Object>) 321), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1576), null);
            c73242Soo.LJFF(new AqS135S0200000_4(this, (USAddressEditStrategyService) adapter, (AbstractC26779Af9<Object>) 322), C26100AMe.LJLIL, null);
            LJ((C26586Ac2) adapter, c73242Soo);
            c73242Soo.LJFF(new AqS135S0200000_4(this, (USAddressEditStrategyService) adapter, (AbstractC26779Af9<Object>) 316), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1573), null);
            c73242Soo.LJFF(new AqS135S0200000_4(this, (USAddressEditStrategyService) adapter, (AbstractC26779Af9<Object>) 317), C26467Aa7.LJLIL, null);
        }
    }
}
