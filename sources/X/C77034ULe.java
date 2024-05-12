package X;

import com.bytedance.android.livesdk.LandscapeInteractionMarginData;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* renamed from: X.ULe, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77034ULe extends DataChannelSceneObserver<C28157B3h, LandscapeInteractionMarginData> {
    public C77034ULe() {
        super(false, 1, null);
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<LandscapeInteractionMarginData> getType() {
        return LandscapeInteractionMarginData.class;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C28157B3h c28157B3h) {
        C28157B3h value = c28157B3h;
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        o.LJIIIZ(value, "value");
        Boolean bool = (Boolean) layeredElementContext.getDataChannel().kv0(BCS.class);
        int i = 0;
        if (bool == null || !bool.booleanValue()) {
            i = value.LIZIZ;
        }
        constraintProperty.margin(3, i);
        constraintProperty.apply();
    }
}
