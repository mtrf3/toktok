package X;

import com.bytedance.android.livesdk.dataChannel.UpdateStickerPositionEvent;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* renamed from: X.UJp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76993UJp extends DataChannelSceneObserver<C29652BkO, UpdateStickerPositionEvent> {
    public final /* synthetic */ C5H3<C76995UJr> LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<UpdateStickerPositionEvent> getType() {
        return UpdateStickerPositionEvent.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76993UJp(C62822Ol8 c62822Ol8) {
        super(false, 1, null);
        this.LIZ = c62822Ol8;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C29652BkO c29652BkO) {
        C29652BkO value = c29652BkO;
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        o.LJIIIZ(value, "value");
        C76995UJr value2 = this.LIZ.getValue();
        if (value2 != null) {
            value2.LJI = value.LIZ;
            value2.LIZ(layeredElementContext, constraintProperty);
        }
    }
}
