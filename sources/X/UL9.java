package X;

import com.bytedance.android.live.layer.ILayerService;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMultiHostGiftTrayOptSetting;
import com.bytedance.ies.sdk.widgets.LayerSpecImpl;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImplKt;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UL9 extends LayerSpecImpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UL9(C1O4 layeredElementContext) {
        super(layeredElementContext);
        C77044ULo An;
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        MultiElementSpecImplKt.element(this, new C77083UNb(layeredElementContext));
        if (LiveMultiHostGiftTrayOptSetting.enablePublicScreenHeightChange() && (An = ((ILayerService) CN1.LIZ(ILayerService.class)).An(layeredElementContext)) != null) {
            MultiElementSpecImplKt.element(this, An);
        }
    }
}
