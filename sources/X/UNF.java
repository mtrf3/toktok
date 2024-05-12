package X;

import Y.AUListenerS100S0100000_13;
import com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UNF extends DataChannelSceneObserver<EnumC30738C4o, LiveCenterStatusChannel> {
    public final /* synthetic */ UNP LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<LiveCenterStatusChannel> getType() {
        return LiveCenterStatusChannel.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UNF(UNP unp) {
        super(false, 1, null);
        this.LIZ = unp;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, EnumC30738C4o enumC30738C4o) {
        float f;
        EnumC30738C4o value = enumC30738C4o;
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        o.LJIIIZ(value, "value");
        int i = C9M.LIZ[value.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return;
                } else {
                    throw new C162476Zf();
                }
            }
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        this.LIZ.LIZ().setDuration(this.LIZ.LJLIL);
        this.LIZ.LIZ().setFloatValues(constraintProperty.alpha(), f);
        this.LIZ.LIZ().cancel();
        this.LIZ.LIZ().removeAllUpdateListeners();
        C16880lQ.LJLJL(this.LIZ.LIZ());
        this.LIZ.LIZ().addUpdateListener(new AUListenerS100S0100000_13(constraintProperty, 102));
        this.LIZ.LIZ().start();
    }
}
