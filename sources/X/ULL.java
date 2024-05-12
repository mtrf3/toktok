package X;

import Y.ARunnableS49S0100000_13;
import android.os.Handler;
import com.bytedance.android.livesdk.dataChannel.ProgrammedLiveFollowCardVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.ProgrammedLiveMenuVisibilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ULL extends DataChannelSceneObserver<C30744C4u, ProgrammedLiveMenuVisibilityChannel> {
    public final /* synthetic */ ULM LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<ProgrammedLiveMenuVisibilityChannel> getType() {
        return ProgrammedLiveMenuVisibilityChannel.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ULL(ULM ulm) {
        super(false, 1, null);
        this.LIZ = ulm;
    }

    @Override // com.bytedance.ies.sdk.widgets.SceneObserver
    public final void dispose(LayeredElementContext context, ConstraintProperty constraintProperty) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        ((Handler) this.LIZ.LJLILLLLZI.getValue()).removeCallbacksAndMessages(null);
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C30744C4u c30744C4u) {
        int i;
        C30744C4u value = c30744C4u;
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        o.LJIIIZ(value, "value");
        ULM ulm = this.LIZ;
        boolean z = true;
        boolean z2 = !value.LIZ;
        ((Handler) ulm.LJLILLLLZI.getValue()).removeCallbacksAndMessages(null);
        if (z2) {
            i = ulm.LJLJI & (-2);
        } else {
            i = ulm.LJLJI | 1;
        }
        ulm.LJLJI = i;
        if (z2) {
            ulm.LJLJJI = false;
            ((Handler) ulm.LJLILLLLZI.getValue()).postDelayed(new ARunnableS49S0100000_13(ulm, 249), 20000L);
            return;
        }
        DataChannel dataChannel = ulm.LJLIL;
        if (i != 0 || !ulm.LJLJJI) {
            z = false;
        }
        dataChannel.rv0(ProgrammedLiveFollowCardVisibilityChannel.class, new C29594BjS(z));
    }
}
