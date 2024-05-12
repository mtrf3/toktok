package X;

import com.bytedance.android.livesdk.dataChannel.GiftTrayPositionChangeEvent;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMultiHostGiftTrayOptSetting;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;

/* loaded from: classes14.dex */
public final class UK9 extends DataChannelSceneObserver<Boolean, GiftTrayPositionChangeEvent> {
    public final /* synthetic */ C77044ULo LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<GiftTrayPositionChangeEvent> getType() {
        return GiftTrayPositionChangeEvent.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UK9(C77044ULo c77044ULo) {
        super(false, 1, null);
        this.LIZ = c77044ULo;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool) {
        boolean LIZLLL = C76965UIn.LIZLLL(bool, layeredElementContext, "layeredElementContext", constraintProperty, "constraintProperty");
        if (LiveMultiHostGiftTrayOptSetting.enablePublicScreenHeightChange()) {
            this.LIZ.LJLJI = LIZLLL;
            if (LIZLLL) {
                constraintProperty.margin(3, 0);
                constraintProperty.apply();
            }
        }
    }
}
