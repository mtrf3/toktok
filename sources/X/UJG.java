package X;

import com.bytedance.android.live.liveinteract.api.event.MatchGiftEvent;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UJG extends DataChannelSceneObserver<U0H, MatchGiftEvent> {
    public final /* synthetic */ UJM LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<MatchGiftEvent> getType() {
        return MatchGiftEvent.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UJG(UJM ujm) {
        super(false, 1, null);
        this.LIZ = ujm;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, U0H u0h) {
        UJM ujm;
        UJH ujh;
        C32208CkW c32208CkW;
        U0H value = u0h;
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        o.LJIIIZ(value, "value");
        if (value.LIZIZ == U05.END && (c32208CkW = (ujh = (ujm = this.LIZ).LJLIL).LIZJ) != null) {
            UJH.LIZ(ujh, c32208CkW, true, false, 4);
            ujm.LIZ(constraintProperty);
        }
    }
}
