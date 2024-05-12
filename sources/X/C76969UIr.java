package X;

import com.bytedance.android.live.liveinteract.api.VoiceChatLayoutChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* renamed from: X.UIr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76969UIr extends DataChannelSceneObserver<C75345Thd, VoiceChatLayoutChannel> {
    public final /* synthetic */ C76973UIv LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<VoiceChatLayoutChannel> getType() {
        return VoiceChatLayoutChannel.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76969UIr(C76973UIv c76973UIv) {
        super(false, 1, null);
        this.LIZ = c76973UIv;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C75345Thd value) {
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        o.LJIIIZ(value, "value");
        this.LIZ.LJLILLLLZI.invoke(Boolean.FALSE);
        this.LIZ.LIZIZ(constraintProperty);
    }
}
