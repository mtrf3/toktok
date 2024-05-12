package X;

import com.bytedance.android.livesdk.dataChannel.LiveCenterFlingDurationChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UNR extends DataChannelSceneObserver<Long, LiveCenterFlingDurationChannel> {
    public final /* synthetic */ UNL LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<LiveCenterFlingDurationChannel> getType() {
        return LiveCenterFlingDurationChannel.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UNR(UNL unl) {
        super(false, 1, null);
        this.LIZ = unl;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Long l) {
        long longValue = l.longValue();
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        this.LIZ.LJLIL = longValue;
    }
}
