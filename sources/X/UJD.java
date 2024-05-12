package X;

import com.bytedance.android.livesdk.dataChannel.PublicScreenHeightenChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;

/* loaded from: classes14.dex */
public final class UJD extends DataChannelSceneObserver<Boolean, PublicScreenHeightenChannel> {
    public final /* synthetic */ UJP LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<PublicScreenHeightenChannel> getType() {
        return PublicScreenHeightenChannel.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UJD(UJP ujp) {
        super(false, 1, null);
        this.LIZ = ujp;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool) {
        boolean LIZLLL = C76965UIn.LIZLLL(bool, layeredElementContext, "layeredElementContext", constraintProperty, "constraintProperty");
        UJP ujp = this.LIZ;
        ujp.LJLLLL = LIZLLL;
        ujp.LJIIJ(constraintProperty, true);
    }
}
