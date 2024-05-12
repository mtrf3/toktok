package com.ss.android.ugc.aweme.ecommerce.global.address.edit;

import X.AN8;
import X.AbstractC26779Af9;
import X.C26483AaN;
import X.C26484AaO;
import X.C26586Ac2;
import X.C73242Soo;
import X.EnumC26549AbR;
import X.InterfaceC26883Agp;
import X.InterfaceC27210Am6;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.DefaultAddressEditStrategyService;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC27210Am6(name = "shipping_address")
/* loaded from: classes5.dex */
public class GlobalAddressEditStrategyService extends DefaultAddressEditStrategyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.DefaultAddressEditStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final ViewModel LIZIZ() {
        return new GlobalAddressEditViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.DefaultAddressEditStrategyService
    /* renamed from: LIZLLL */
    public final AddressEditViewModel LIZIZ() {
        return new GlobalAddressEditViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.DefaultAddressEditStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final EnumC26549AbR getType() {
        return EnumC26549AbR.TTS_GLOBAL_ADDRESS_EDIT_V1;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.DefaultAddressEditStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final InterfaceC26883Agp<AddressEditViewModel> LIZJ(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        return new C26484AaO(owner);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.DefaultAddressEditStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final void LIZ(AbstractC26779Af9 adapter, C73242Soo c73242Soo) {
        o.LJIIIZ(adapter, "adapter");
        c73242Soo.LJFF(new AqS135S0200000_4(this, (GlobalAddressEditStrategyService) adapter, (AbstractC26779Af9<Object>) UserLevelGeckoUpdateSetting.DEFAULT), C26483AaN.LJLIL, null);
        if (adapter instanceof C26586Ac2) {
            c73242Soo.LJFF(new AqS135S0200000_4(this, (GlobalAddressEditStrategyService) adapter, (AbstractC26779Af9<Object>) 141), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 912), null);
            c73242Soo.LJFF(new AqS135S0200000_4(this, (GlobalAddressEditStrategyService) adapter, (AbstractC26779Af9<Object>) 142), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 913), null);
            c73242Soo.LJFF(new AqS135S0200000_4(this, (GlobalAddressEditStrategyService) adapter, (AbstractC26779Af9<Object>) 143), AN8.LJLIL, null);
            LJ((C26586Ac2) adapter, c73242Soo);
        }
    }
}
