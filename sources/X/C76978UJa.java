package X;

import com.bytedance.android.live.liveinteract.api.BattleTaskGuideTipShowChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.UJa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76978UJa extends DataChannelSceneObserver<Integer, BattleTaskGuideTipShowChannel> {
    public final /* synthetic */ UJX LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<BattleTaskGuideTipShowChannel> getType() {
        return BattleTaskGuideTipShowChannel.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76978UJa(UJX ujx) {
        super(false, 1, null);
        this.LIZ = ujx;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Integer num) {
        int dimensionPixelSize;
        int intValue = num.intValue();
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        UJX ujx = this.LIZ;
        if (intValue != 1) {
            if (intValue != 2) {
                dimensionPixelSize = 0;
            } else {
                dimensionPixelSize = layeredElementContext.getContext().getResources().getDimensionPixelSize(R.dimen.a_c);
            }
        } else {
            dimensionPixelSize = layeredElementContext.getContext().getResources().getDimensionPixelSize(R.dimen.a_b);
        }
        ujx.LL = dimensionPixelSize;
        UJX.LIZLLL(this.LIZ, false, false, 3);
    }
}
