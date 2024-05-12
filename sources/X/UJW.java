package X;

import com.bytedance.android.livesdk.dataChannel.GiftTrayPositionChangeEvent;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMultiHostGiftTrayOptSetting;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;

/* loaded from: classes14.dex */
public final class UJW extends DataChannelSceneObserver<Boolean, GiftTrayPositionChangeEvent> {
    public final /* synthetic */ UJX LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<GiftTrayPositionChangeEvent> getType() {
        return GiftTrayPositionChangeEvent.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UJW(UJX ujx) {
        super(false, 1, null);
        this.LIZ = ujx;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool) {
        boolean LIZLLL = C76965UIn.LIZLLL(bool, layeredElementContext, "layeredElementContext", constraintProperty, "constraintProperty");
        if (LiveMultiHostGiftTrayOptSetting.enableGiftTrayPositionChange()) {
            C0RN.LIZLLL("receive GiftTrayPositionChangeEvent", LIZLLL, "live_host_change");
            UJX ujx = this.LIZ;
            ujx.LLFF = LIZLLL;
            UJX.LIZLLL(ujx, false, false, 1);
        }
    }
}
