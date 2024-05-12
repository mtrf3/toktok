package X;

import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* renamed from: X.UJx, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77001UJx extends DataChannelSceneObserver<Boolean, KeyboardStatusChannel> {
    public C77001UJx() {
        super(false);
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<KeyboardStatusChannel> getType() {
        return KeyboardStatusChannel.class;
    }

    @Override // com.bytedance.ies.sdk.widgets.SceneObserver
    public final void dispose(LayeredElementContext context, ConstraintProperty constraintProperty) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        super.dispose(context, constraintProperty);
        constraintProperty.visibility(8);
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool) {
        if (C76965UIn.LIZLLL(bool, layeredElementContext, "layeredElementContext", constraintProperty, "constraintProperty")) {
            constraintProperty.visibility(0);
        } else {
            constraintProperty.visibility(8);
        }
    }
}
