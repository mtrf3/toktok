package X;

import com.bytedance.android.live.liveinteract.api.BattleBonusTaskShowChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;

/* loaded from: classes14.dex */
public final class UJ2 extends DataChannelSceneObserver<Boolean, BattleBonusTaskShowChannel> {
    public final /* synthetic */ UJP LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<BattleBonusTaskShowChannel> getType() {
        return BattleBonusTaskShowChannel.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UJ2(UJP ujp) {
        super(false, 1, null);
        this.LIZ = ujp;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool) {
        int i;
        if (C76965UIn.LIZLLL(bool, layeredElementContext, "layeredElementContext", constraintProperty, "constraintProperty")) {
            i = layeredElementContext.getContext().getResources().getDimensionPixelSize(R.dimen.a__);
        } else {
            i = 0;
        }
        UJP ujp = this.LIZ;
        if (i != ujp.LJZ) {
            ujp.LJZ = i;
            ujp.LJIIJ(constraintProperty, false);
        }
    }
}
