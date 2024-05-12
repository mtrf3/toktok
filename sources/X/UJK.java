package X;

import com.bytedance.android.livesdk.dataChannel.LivePlayContainerViewHeightChangedEvent;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UJK extends DataChannelSceneObserver<Integer, LivePlayContainerViewHeightChangedEvent> {
    public final /* synthetic */ UJM LIZ;
    public final /* synthetic */ UJZ LIZIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<LivePlayContainerViewHeightChangedEvent> getType() {
        return LivePlayContainerViewHeightChangedEvent.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UJK(UJM ujm, UJZ ujz) {
        super(false, 1, null);
        this.LIZ = ujm;
        this.LIZIZ = ujz;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Integer num) {
        num.intValue();
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        UJM ujm = this.LIZ;
        UJH ujh = ujm.LJLIL;
        C32208CkW c32208CkW = ujh.LIZJ;
        if (c32208CkW != null) {
            this.LIZIZ.getClass();
            UJH.LIZ(ujh, c32208CkW, false, UJZ.LIZ(layeredElementContext), 2);
            ujm.LIZ(constraintProperty);
        }
    }
}
