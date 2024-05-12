package X;

import com.bytedance.android.live.gift.GiftDialogHeightEvent;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UJQ extends DataChannelSceneObserver<Integer, GiftDialogHeightEvent> {
    public final /* synthetic */ UJP LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<GiftDialogHeightEvent> getType() {
        return GiftDialogHeightEvent.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UJQ(UJP ujp) {
        super(false, 1, null);
        this.LIZ = ujp;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Integer num) {
        int intValue = num.intValue();
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        UJP ujp = this.LIZ;
        ujp.LJLZ = intValue;
        if (ujp.LJLL.LIZLLL || ujp.LJLLILLLL) {
            if (intValue == 0) {
                ujp.LIZLLL(true);
            } else {
                ujp.LIZLLL(false);
            }
        }
    }
}
