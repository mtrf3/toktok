package X;

import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UJL extends DataChannelSceneObserver<C32208CkW, LinkCrossRoomStateChangeEvent> {
    public final /* synthetic */ UJM LIZ;
    public final /* synthetic */ UJZ LIZIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<LinkCrossRoomStateChangeEvent> getType() {
        return LinkCrossRoomStateChangeEvent.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UJL(UJM ujm, UJZ ujz) {
        super(false, 1, null);
        this.LIZ = ujm;
        this.LIZIZ = ujz;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C32208CkW c32208CkW) {
        C32208CkW value = c32208CkW;
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        o.LJIIIZ(value, "value");
        UJH ujh = this.LIZ.LJLIL;
        this.LIZIZ.getClass();
        UJH.LIZ(ujh, value, false, UJZ.LIZ(layeredElementContext), 2);
        this.LIZ.LIZ(constraintProperty);
    }
}
