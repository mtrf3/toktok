package X;

import com.bytedance.android.live.CommentWidgetStyleChangeEvent;
import com.bytedance.android.livesdk.livesetting.other.ToolBarRefactor;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;

/* loaded from: classes14.dex */
public final class UK0 extends DataChannelSceneObserver<Boolean, CommentWidgetStyleChangeEvent> {
    public UK0() {
        super(false, 1, null);
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<CommentWidgetStyleChangeEvent> getType() {
        return CommentWidgetStyleChangeEvent.class;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool) {
        if (C76965UIn.LIZLLL(bool, layeredElementContext, "layeredElementContext", constraintProperty, "constraintProperty")) {
            constraintProperty.removeConstraints(2);
            constraintProperty.apply();
        } else if (ToolBarRefactor.enable()) {
            constraintProperty.connect(1, R.id.aqb, 2, 0);
            constraintProperty.connect(2, R.id.j3c, 1, 0);
            constraintProperty.apply();
        } else {
            constraintProperty.connect(1, R.id.aqb, 2, C15380j0.LIZ(8.0f));
            constraintProperty.connect(2, R.id.j3c, 1, 0);
            constraintProperty.apply();
        }
    }
}
