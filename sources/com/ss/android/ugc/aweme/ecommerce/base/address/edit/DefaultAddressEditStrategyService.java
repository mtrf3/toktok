package com.ss.android.ugc.aweme.ecommerce.base.address.edit;

import X.AN9;
import X.AbstractC26551AbT;
import X.AbstractC26779Af9;
import X.AbstractC73230Soc;
import X.C26099AMd;
import X.C26475AaF;
import X.C26476AaG;
import X.C26480AaK;
import X.C26495AaZ;
import X.C26586Ac2;
import X.C27021Aj3;
import X.C73242Soo;
import X.EnumC26549AbR;
import X.InterfaceC26883Agp;
import X.InterfaceC27210Am6;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC27210Am6(name = "shipping_address")
/* loaded from: classes5.dex */
public class DefaultAddressEditStrategyService extends AbstractC26551AbT<AddressEditViewModel> {
    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    /* renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    public AddressEditViewModel LIZIZ() {
        return new AddressEditViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public EnumC26549AbR getType() {
        return EnumC26549AbR.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public InterfaceC26883Agp<AddressEditViewModel> LIZJ(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        return new C26495AaZ(owner);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public void LIZ(AbstractC26779Af9 adapter, C73242Soo c73242Soo) {
        o.LJIIIZ(adapter, "adapter");
        if (!(adapter instanceof C26586Ac2)) {
            return;
        }
        c73242Soo.LJFF(new AqS135S0200000_4(this, (DefaultAddressEditStrategyService) adapter, (AbstractC26779Af9<Object>) 248), C26475AaF.LJLIL, null);
        c73242Soo.LJFF(new AqS135S0200000_4(this, (DefaultAddressEditStrategyService) adapter, (AbstractC26779Af9<Object>) 249), C26476AaG.LJLIL, null);
        c73242Soo.LJFF(new AqS135S0200000_4(this, (DefaultAddressEditStrategyService) adapter, (AbstractC26779Af9<Object>) LiveCoverMinSizeSetting.DEFAULT), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1330), null);
        c73242Soo.LJFF(new AqS135S0200000_4(this, (DefaultAddressEditStrategyService) adapter, (AbstractC26779Af9<Object>) 251), AN9.LJLIL, null);
        LJ((C26586Ac2) adapter, c73242Soo);
    }

    public final void LJ(C26586Ac2 adapter, C73242Soo c73242Soo) {
        o.LJIIIZ(adapter, "adapter");
        c73242Soo.LJFF(new AqS135S0200000_4(this, adapter, 253), new AqS170S0100000_4(adapter, 1338), null);
        c73242Soo.LJFF(new AqS135S0200000_4(this, adapter, 255), new AqS170S0100000_4(adapter, 1339), null);
        c73242Soo.LJFF(new AqS135S0200000_4(this, adapter, 244), new AqS170S0100000_4(adapter, 1323), null);
        c73242Soo.LJFF(new AqS135S0200000_4(this, adapter, 245), C26099AMd.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1324), C26480AaK.LJLIL, null);
    }

    public final boolean LJFF(int i, int i2, AbstractC73230Soc<Object> adapter) {
        C27021Aj3 c27021Aj3;
        InputItemDTO inputItemDTO;
        Integer num;
        o.LJIIIZ(adapter, "adapter");
        Object LJZL = adapter.LJZL(i, false);
        if (!(LJZL instanceof C27021Aj3) || (c27021Aj3 = (C27021Aj3) LJZL) == null || (inputItemDTO = c27021Aj3.LIZ) == null || (num = inputItemDTO.type) == null || num.intValue() != i2) {
            return false;
        }
        return true;
    }
}
