package X;

import com.bytedance.android.livesdk.dataChannel.LivePlayContainerViewHeightChangedEvent;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UJJ extends DataChannelSceneObserver<Integer, LivePlayContainerViewHeightChangedEvent> {
    public final /* synthetic */ UJP LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<LivePlayContainerViewHeightChangedEvent> getType() {
        return LivePlayContainerViewHeightChangedEvent.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UJJ(UJP ujp) {
        super(false, 1, null);
        this.LIZ = ujp;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Integer num) {
        num.intValue();
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        UJP ujp = this.LIZ;
        UJH ujh = ujp.LJLL;
        C32208CkW c32208CkW = ujh.LIZJ;
        if (c32208CkW != null) {
            UJH.LIZ(ujh, c32208CkW, false, UJP.LJII(layeredElementContext), 2);
            ujp.LJIIJ(constraintProperty, false);
        }
    }
}
