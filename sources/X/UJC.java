package X;

import com.bytedance.android.livesdk.dataChannel.PublicScreenShortenChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;

/* loaded from: classes14.dex */
public final class UJC extends DataChannelSceneObserver<Boolean, PublicScreenShortenChannel> {
    public final /* synthetic */ UJP LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<PublicScreenShortenChannel> getType() {
        return PublicScreenShortenChannel.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UJC(UJP ujp) {
        super(false, 1, null);
        this.LIZ = ujp;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool) {
        boolean LIZLLL = C76965UIn.LIZLLL(bool, layeredElementContext, "layeredElementContext", constraintProperty, "constraintProperty");
        UJP ujp = this.LIZ;
        ujp.LJLLL = LIZLLL;
        ujp.LJIIJ(constraintProperty, true);
    }
}
