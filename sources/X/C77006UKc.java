package X;

import com.bytedance.android.livesdk.RecommendButtonStatEvent;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* renamed from: X.UKc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77006UKc extends DataChannelSceneObserver<C2JY, RecommendButtonStatEvent> {
    public C77006UKc() {
        super(false, 1, null);
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<RecommendButtonStatEvent> getType() {
        return RecommendButtonStatEvent.class;
    }

    @Override // com.bytedance.ies.sdk.widgets.SceneObserver
    public final void dispose(LayeredElementContext context, ConstraintProperty constraintProperty) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        super.dispose(context, constraintProperty);
        constraintProperty.alpha(1.0f);
        constraintProperty.translationY(0.0f);
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C2JY value) {
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        o.LJIIIZ(value, "value");
        constraintProperty.alpha(0.0f);
        constraintProperty.translationY(layeredElementContext.getContainer().getHeight());
    }
}
