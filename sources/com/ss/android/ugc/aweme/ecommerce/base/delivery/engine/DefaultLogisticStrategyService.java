package com.ss.android.ugc.aweme.ecommerce.base.delivery.engine;

import X.AbstractC26551AbT;
import X.AbstractC26779Af9;
import X.C26462Aa2;
import X.C26502Aag;
import X.C26519Aax;
import X.C26520Aay;
import X.C26521Aaz;
import X.C26525Ab3;
import X.C26527Ab5;
import X.C73242Soo;
import X.EnumC26549AbR;
import X.InterfaceC26883Agp;
import X.InterfaceC27210Am6;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticAdapter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC27210Am6(name = "logistics")
/* loaded from: classes5.dex */
public class DefaultLogisticStrategyService extends AbstractC26551AbT<DeliveryPanelViewModel> {
    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    /* renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    public DeliveryPanelViewModel LIZIZ() {
        return new DeliveryPanelViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public EnumC26549AbR getType() {
        return EnumC26549AbR.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final InterfaceC26883Agp<DeliveryPanelViewModel> LIZJ(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        return new C26502Aag(owner);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public void LIZ(AbstractC26779Af9 adapter, C73242Soo c73242Soo) {
        o.LJIIIZ(adapter, "adapter");
        if (!(adapter instanceof LogisticAdapter)) {
            return;
        }
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1279), C26519Aax.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1280), C26462Aa2.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1281), C26527Ab5.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1282), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1283), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1284), C26520Aay.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1277), C26521Aaz.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1278), C26525Ab3.LJLIL, null);
    }
}
