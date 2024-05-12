package X;

import com.bytedance.android.live.layer.ILayerService;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiHostGiftTrayOptForHostSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMultiGuestGiftTrayOptSetting;
import com.bytedance.ies.sdk.widgets.LayerSpecImpl;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImplKt;

/* loaded from: classes14.dex */
public final class ULR extends LayerSpecImpl {
    public ULR(C1O4 c1o4) {
        super(c1o4);
        C77044ULo An;
        if ((LiveMultiGuestGiftTrayOptSetting.INSTANCE.isOptimizeMultiGuest() || MultiHostGiftTrayOptForHostSetting.INSTANCE.isEnable()) && (An = ((ILayerService) CN1.LIZ(ILayerService.class)).An(c1o4)) != null) {
            MultiElementSpecImplKt.element(this, An);
        }
        MultiElementSpecImplKt.element(this, new UNY(c1o4));
    }
}
