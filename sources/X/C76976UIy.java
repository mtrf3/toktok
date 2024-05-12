package X;

import com.bytedance.android.live.liveinteract.api.InteractPlayerViewChangeChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* renamed from: X.UIy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76976UIy extends DataChannelSceneObserver<BV7, InteractPlayerViewChangeChannel> {
    public final /* synthetic */ ULA LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<InteractPlayerViewChangeChannel> getType() {
        return InteractPlayerViewChangeChannel.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76976UIy(ULA ula) {
        super(false, 1, null);
        this.LIZ = ula;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, BV7 value) {
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        o.LJIIIZ(value, "value");
        constraintProperty.margin(4, this.LIZ.LIZLLL);
        constraintProperty.apply();
    }
}
