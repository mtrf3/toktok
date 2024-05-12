package X;

import com.bytedance.android.live.liveinteract.api.InteractPlayerViewChangeChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* renamed from: X.UIx, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76975UIx extends DataChannelSceneObserver<BV7, InteractPlayerViewChangeChannel> {
    public final /* synthetic */ UJ4 LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<InteractPlayerViewChangeChannel> getType() {
        return InteractPlayerViewChangeChannel.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76975UIx(UJ4 uj4) {
        super(false);
        this.LIZ = uj4;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, BV7 value) {
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        o.LJIIIZ(value, "value");
        this.LIZ.LIZ(3, true);
    }
}
