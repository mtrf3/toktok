package X;

import com.bytedance.android.live.liveinteract.api.LinkInRoomWindowCountChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* renamed from: X.UIz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76977UIz extends DataChannelSceneObserver<Integer, LinkInRoomWindowCountChannel> {
    public final /* synthetic */ UJ4 LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<LinkInRoomWindowCountChannel> getType() {
        return LinkInRoomWindowCountChannel.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76977UIz(UJ4 uj4) {
        super(false);
        this.LIZ = uj4;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Integer num) {
        boolean z;
        int intValue = num.intValue();
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        UJ4 uj4 = this.LIZ;
        if (intValue <= 0) {
            z = true;
        } else {
            z = false;
        }
        uj4.LIZ(1, z);
    }
}
