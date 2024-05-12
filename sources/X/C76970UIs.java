package X;

import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* renamed from: X.UIs, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76970UIs extends DataChannelSceneObserver<C75233Tfp, MultiLiveRTCLayoutChannel> {
    public final /* synthetic */ UJ4 LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<MultiLiveRTCLayoutChannel> getType() {
        return MultiLiveRTCLayoutChannel.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76970UIs(UJ4 uj4) {
        super(false);
        this.LIZ = uj4;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C75233Tfp c75233Tfp) {
        C75233Tfp value = c75233Tfp;
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        o.LJIIIZ(value, "value");
        EnumC74778TWk enumC74778TWk = value.LJLIL;
        if ((enumC74778TWk == EnumC74778TWk.FLOATING && value.LJLILLLLZI > 0) || enumC74778TWk == EnumC74778TWk.FLOATING_FIX) {
            this.LIZ.LIZ(2, false);
        } else {
            this.LIZ.LIZ(2, true);
        }
    }
}
