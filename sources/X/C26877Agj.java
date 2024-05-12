package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelState;
import kotlin.jvm.internal.o;

/* renamed from: X.Agj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26877Agj extends AbstractC65781Prl implements InterfaceC88471Ynr<DeliveryPanelState, Bundle, DeliveryPanelState> {
    public static final C26877Agj INSTANCE = new C26877Agj();

    public C26877Agj() {
        super(2);
    }

    public final DeliveryPanelState invoke(DeliveryPanelState receiver, Bundle bundle) {
        o.LJIIJ(receiver, "$receiver");
        return receiver;
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ DeliveryPanelState invoke(DeliveryPanelState deliveryPanelState, Bundle bundle) {
        DeliveryPanelState deliveryPanelState2 = deliveryPanelState;
        invoke(deliveryPanelState2, bundle);
        return deliveryPanelState2;
    }
}
