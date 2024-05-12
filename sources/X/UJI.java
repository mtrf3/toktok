package X;

import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UJI extends DataChannelSceneObserver<C32208CkW, LinkCrossRoomStateChangeEvent> {
    public final /* synthetic */ UJP LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<LinkCrossRoomStateChangeEvent> getType() {
        return LinkCrossRoomStateChangeEvent.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UJI(UJP ujp) {
        super(false, 1, null);
        this.LIZ = ujp;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C32208CkW c32208CkW) {
        C32208CkW value = c32208CkW;
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        o.LJIIIZ(value, "value");
        if (UJH.LIZ(this.LIZ.LJLL, value, false, UJP.LJII(layeredElementContext), 2)) {
            this.LIZ.LJIIJ(constraintProperty, false);
        }
    }
}
