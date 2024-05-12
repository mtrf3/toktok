package X;

import com.bytedance.android.livesdk.slot.FrameSlotVisibilityChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UJ5 extends DataChannelSceneObserver<Boolean, FrameSlotVisibilityChannel> {
    public final /* synthetic */ UJ4 LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<FrameSlotVisibilityChannel> getType() {
        return FrameSlotVisibilityChannel.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UJ5(UJ4 uj4) {
        super(false);
        this.LIZ = uj4;
    }

    @Override // com.bytedance.ies.sdk.widgets.SceneObserver
    public final void dispose(LayeredElementContext context, ConstraintProperty constraintProperty) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        this.LIZ.LIZJ().removeCallbacksAndMessages(null);
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool) {
        this.LIZ.LIZIZ(1, !C76965UIn.LIZLLL(bool, layeredElementContext, "layeredElementContext", constraintProperty, "constraintProperty"));
    }
}
