package X;

import com.bytedance.android.livesdk.dataChannel.CommentOrMessageData;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ULX extends DataChannelSceneObserver<Boolean, CommentOrMessageData> {
    public final /* synthetic */ ULZ LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<CommentOrMessageData> getType() {
        return CommentOrMessageData.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ULX(ULZ ulz) {
        super(false, 1, null);
        this.LIZ = ulz;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool) {
        bool.booleanValue();
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        if (C30149BsP.LIZIZ(this.LIZ.LJLIL.getDataChannel())) {
            boolean z = !C30149BsP.LIZ();
            if (z) {
                constraintProperty.margin(7, this.LIZ.LJLIL.LJIILL);
                constraintProperty.apply();
            } else {
                constraintProperty.margin(7, 0);
                constraintProperty.apply();
            }
            C73943T0h.LIZ().LIZIZ(new C28166B3q(z, false));
        }
    }
}
