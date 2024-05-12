package X;

import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewSubscriptionWidget;
import com.bytedance.android.livesdk.dataChannel.IsSubscribeEnable;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.android.livesdk.subscribe.model.invite.SubEnable;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C77 implements InterfaceC30844C8q {
    public final /* synthetic */ PreviewSubscriptionWidget LIZ;

    @Override // X.InterfaceC30844C8q
    public final void LIZ(Throwable e) {
        o.LJIIIZ(e, "e");
    }

    public C77(PreviewSubscriptionWidget previewSubscriptionWidget) {
        this.LIZ = previewSubscriptionWidget;
    }

    @Override // X.InterfaceC30844C8q
    public final void LIZIZ(GetSubInfoResponse getSubInfoResponse) {
        boolean z;
        SubEnable subEnable;
        DataChannel dataChannel = this.LIZ.dataChannel;
        if (getSubInfoResponse != null && (subEnable = getSubInfoResponse.subEnable) != null) {
            z = subEnable.canEnable;
        } else {
            z = false;
        }
        dataChannel.rv0(IsSubscribeEnable.class, Boolean.valueOf(z));
    }
}
