package com.ss.android.ugc.aweme.ecommerce.ttf.addressedit.sa;

import X.AbstractC26779Af9;
import X.C26461Aa1;
import X.C26473AaD;
import X.C26474AaE;
import X.C26485AaP;
import X.C26493AaX;
import X.C26586Ac2;
import X.C27100AkK;
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
public final class TtfSaAddressEditStrategyService extends DefaultAddressEditStrategyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.DefaultAddressEditStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final ViewModel LIZIZ() {
        return new TtfSaAddressEditViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.DefaultAddressEditStrategyService
    /* renamed from: LIZLLL */
    public final AddressEditViewModel LIZIZ() {
        return new TtfSaAddressEditViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.DefaultAddressEditStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final EnumC26549AbR getType() {
        return EnumC26549AbR.TTF_SA_ADDRESS_EDIT;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.DefaultAddressEditStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final InterfaceC26883Agp<AddressEditViewModel> LIZJ(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        return new C26493AaX(owner);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.DefaultAddressEditStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final void LIZ(AbstractC26779Af9 adapter, C73242Soo c73242Soo) {
        o.LJIIIZ(adapter, "adapter");
        if (!(adapter instanceof C26586Ac2)) {
            return;
        }
        if (C27100AkK.LIZ()) {
            c73242Soo.LJFF(new AqS135S0200000_4(this, (TtfSaAddressEditStrategyService) adapter, (AbstractC26779Af9<Object>) 214), C26485AaP.LJLIL, null);
        } else {
            c73242Soo.LJFF(new AqS135S0200000_4(this, (TtfSaAddressEditStrategyService) adapter, (AbstractC26779Af9<Object>) 215), C26473AaD.LJLIL, null);
            c73242Soo.LJFF(new AqS135S0200000_4(this, (TtfSaAddressEditStrategyService) adapter, (AbstractC26779Af9<Object>) 216), C26474AaE.LJLIL, null);
        }
        c73242Soo.LJFF(new AqS135S0200000_4(this, (TtfSaAddressEditStrategyService) adapter, (AbstractC26779Af9<Object>) 217), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1144), null);
        c73242Soo.LJFF(new AqS135S0200000_4(this, (TtfSaAddressEditStrategyService) adapter, (AbstractC26779Af9<Object>) 218), C26461Aa1.LJLIL, null);
        LJ((C26586Ac2) adapter, c73242Soo);
    }
}
