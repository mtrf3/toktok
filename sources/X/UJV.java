package X;

import com.bytedance.android.live.liveinteract.api.BattleBonusTaskShowChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;

/* loaded from: classes14.dex */
public final class UJV extends DataChannelSceneObserver<Boolean, BattleBonusTaskShowChannel> {
    public final /* synthetic */ UJX LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<BattleBonusTaskShowChannel> getType() {
        return BattleBonusTaskShowChannel.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UJV(UJX ujx) {
        super(false, 1, null);
        this.LIZ = ujx;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool) {
        int i;
        if (C76965UIn.LIZLLL(bool, layeredElementContext, "layeredElementContext", constraintProperty, "constraintProperty")) {
            i = layeredElementContext.getContext().getResources().getDimensionPixelSize(R.dimen.a_a);
        } else {
            i = 0;
        }
        UJX ujx = this.LIZ;
        if (i != ujx.LLD) {
            ujx.LLD = i;
            UJX.LIZLLL(ujx, false, false, 3);
        }
    }
}
