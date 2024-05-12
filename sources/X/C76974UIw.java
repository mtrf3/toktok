package X;

import com.bytedance.android.live.liveinteract.api.InteractPlayerViewChangeChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* renamed from: X.UIw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76974UIw extends DataChannelSceneObserver<BV7, InteractPlayerViewChangeChannel> {
    public final /* synthetic */ C76973UIv LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<InteractPlayerViewChangeChannel> getType() {
        return InteractPlayerViewChangeChannel.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76974UIw(C76973UIv c76973UIv) {
        super(false, 1, null);
        this.LIZ = c76973UIv;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, BV7 value) {
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        o.LJIIIZ(value, "value");
        C76973UIv c76973UIv = this.LIZ;
        c76973UIv.getClass();
        c76973UIv.LJLJJI = 0;
        c76973UIv.LIZ(constraintProperty);
        this.LIZ.LJLILLLLZI.invoke(Boolean.FALSE);
    }
}
