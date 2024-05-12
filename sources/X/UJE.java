package X;

import com.bytedance.android.livesdk.comp.api.game.ScreenRecordWidgetPosition;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UJE extends DataChannelSceneObserver<Integer, ScreenRecordWidgetPosition> {
    public final /* synthetic */ UJP LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<ScreenRecordWidgetPosition> getType() {
        return ScreenRecordWidgetPosition.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UJE(UJP ujp) {
        super(false, 1, null);
        this.LIZ = ujp;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Integer num) {
        int intValue = num.intValue();
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        UJP ujp = this.LIZ;
        ujp.LLFF = intValue;
        ujp.LJIIJ(constraintProperty, false);
    }
}
