package X;

import com.bytedance.android.live.gift.GiftDialogHeightEvent;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* renamed from: X.UJb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76979UJb extends DataChannelSceneObserver<Integer, GiftDialogHeightEvent> {
    public final /* synthetic */ UJX LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<GiftDialogHeightEvent> getType() {
        return GiftDialogHeightEvent.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76979UJb(UJX ujx) {
        super(false, 1, null);
        this.LIZ = ujx;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Integer num) {
        int intValue = num.intValue();
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        UJX ujx = this.LIZ;
        if (intValue == 0) {
            intValue = -1;
        }
        ujx.LJLZ = intValue;
        ujx.LJ(constraintProperty);
        UJX.LIZLLL(this.LIZ, false, false, 3);
    }
}
