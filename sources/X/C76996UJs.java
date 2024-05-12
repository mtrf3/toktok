package X;

import com.bytedance.android.livesdk.dataChannel.FirstFrameChannelEvent;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;

/* renamed from: X.UJs, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76996UJs extends DataChannelSceneObserver<Boolean, FirstFrameChannelEvent> {
    public C76996UJs() {
        super(false, 1, null);
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<FirstFrameChannelEvent> getType() {
        return FirstFrameChannelEvent.class;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool) {
        if (C76965UIn.LIZLLL(bool, layeredElementContext, "layeredElementContext", constraintProperty, "constraintProperty")) {
            constraintProperty.visibility(8);
        }
    }
}
