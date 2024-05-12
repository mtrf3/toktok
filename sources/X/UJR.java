package X;

import com.bytedance.android.livesdk.dataChannel.GiftTrayPositionChangeEvent;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMultiHostGiftTrayOptSetting;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;

/* loaded from: classes14.dex */
public final class UJR extends DataChannelSceneObserver<Boolean, GiftTrayPositionChangeEvent> {
    public final /* synthetic */ UJP LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<GiftTrayPositionChangeEvent> getType() {
        return GiftTrayPositionChangeEvent.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UJR(UJP ujp) {
        super(false, 1, null);
        this.LIZ = ujp;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool) {
        boolean LIZLLL = C76965UIn.LIZLLL(bool, layeredElementContext, "layeredElementContext", constraintProperty, "constraintProperty");
        if (LiveMultiHostGiftTrayOptSetting.enableGiftTrayPositionChange()) {
            this.LIZ.LLIFFJFJJ = LIZLLL;
        }
    }
}
