package X;

import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewSubscriptionWidget;
import com.bytedance.android.livesdk.dataChannel.IsSubscribeEnable;
import com.bytedance.android.livesdk.livesetting.broadcast.TtliveGameImproveSubscribeSetting;
import com.bytedance.android.livesdk.subscribe.model.BubbleInfo;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.android.livesdk.subscribe.model.SubscribeBubbleList;
import com.bytedance.android.livesdk.subscribe.model.invite.SubEnable;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C73 implements InterfaceC30844C8q {
    public final /* synthetic */ PreviewSubscriptionWidget LIZ;

    @Override // X.InterfaceC30844C8q
    public final void LIZ(Throwable e) {
        o.LJIIIZ(e, "e");
    }

    public C73(PreviewSubscriptionWidget previewSubscriptionWidget) {
        this.LIZ = previewSubscriptionWidget;
    }

    @Override // X.InterfaceC30844C8q
    public final void LIZIZ(GetSubInfoResponse getSubInfoResponse) {
        BubbleInfo bubbleInfo;
        List<String> LIZ;
        String str;
        boolean z;
        SubEnable subEnable;
        if (TtliveGameImproveSubscribeSetting.INSTANCE.shouldImproveSubscribe()) {
            DataChannel dataChannel = this.LIZ.dataChannel;
            if (getSubInfoResponse != null && (subEnable = getSubInfoResponse.subEnable) != null) {
                z = subEnable.canEnable;
            } else {
                z = false;
            }
            dataChannel.rv0(IsSubscribeEnable.class, Boolean.valueOf(z));
        }
        if (getSubInfoResponse != null && (bubbleInfo = getSubInfoResponse.bubbleInfo) != null) {
            PreviewSubscriptionWidget previewSubscriptionWidget = this.LIZ;
            if (bubbleInfo.bubbleType > 4 && ((LIZ = InterfaceC30442Bx8.X1.LIZ()) == null || !LIZ.contains(String.valueOf(bubbleInfo.bubbleType)))) {
                C1YG c1yg = new C1YG(previewSubscriptionWidget.findViewById(R.id.nix));
                c1yg.LJI = 5000L;
                c1yg.LJII = true;
                SubscribeBubbleList subscribeBubbleList = bubbleInfo.bubbleList;
                if (subscribeBubbleList != null) {
                    str = subscribeBubbleList.defaultText;
                } else {
                    str = null;
                }
                c1yg.LJIILLIIL = str;
                c1yg.LJIIL = new C74(bubbleInfo, LIZ);
                C30770C5u.LIZLLL(new C1YH(c1yg), C09.GUIDE_SUBSCRIPTION);
                return;
            }
        }
        if (this.LIZ.LJLLI || o.LJ(InterfaceC30442Bx8.LJLJLLL.LIZ(), Boolean.TRUE)) {
            return;
        }
        PreviewSubscriptionWidget previewSubscriptionWidget2 = this.LIZ;
        previewSubscriptionWidget2.LJLLI = true;
        if (getSubInfoResponse == null || !getSubInfoResponse.showPreviewSubBubble) {
            return;
        }
        C1YG c1yg2 = new C1YG(previewSubscriptionWidget2.contentView);
        c1yg2.LIZ(R.string.odi);
        c1yg2.LJIIL = new C72(this.LIZ);
        C30770C5u.LIZLLL(new C1YH(c1yg2), C09.GUIDE_SUBSCRIPTION_PREVIEW_ON_BOARDING);
    }
}
