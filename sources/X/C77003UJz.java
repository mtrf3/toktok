package X;

import com.bytedance.android.live.CommentWidgetStyleChangeEvent;
import com.bytedance.android.livesdk.livesetting.other.ToolBarRefactor;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.UJz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77003UJz extends DataChannelSceneObserver<Boolean, CommentWidgetStyleChangeEvent> {
    public C77003UJz() {
        super(false, 1, null);
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<CommentWidgetStyleChangeEvent> getType() {
        return CommentWidgetStyleChangeEvent.class;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool) {
        float f;
        boolean LIZLLL = C76965UIn.LIZLLL(bool, layeredElementContext, "layeredElementContext", constraintProperty, "constraintProperty");
        if (!C29232Bdc.LJIILJJIL()) {
            return;
        }
        if (LIZLLL) {
            constraintProperty.removeConstraints(1);
            constraintProperty.apply();
        } else {
            if (ToolBarRefactor.enable()) {
                constraintProperty.connect(1, R.id.bkq, 2, 0);
                constraintProperty.apply();
                return;
            }
            if (o.LJ(layeredElementContext.getDataChannel().kv0(BNK.class), Boolean.TRUE)) {
                f = 8.0f;
            } else {
                f = 0.0f;
            }
            constraintProperty.connect(1, R.id.bkq, 2, C15380j0.LIZ(f));
            constraintProperty.apply();
        }
    }
}
