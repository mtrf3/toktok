package X;

import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUpdateUserSettingContent;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* loaded from: classes14.dex */
public final class TWU implements OnMessageListener {
    public final /* synthetic */ TWS LJLIL;

    public TWU(TWS tws) {
        this.LJLIL = tws;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        MultiLiveUpdateUserSettingContent multiLiveUpdateUserSettingContent;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        if (iMessage != null && (iMessage instanceof LinkMessage)) {
            LinkMessage linkMessage = (LinkMessage) iMessage;
            if (linkMessage.messageType == 17 && (multiLiveUpdateUserSettingContent = linkMessage.multiLiveUpdateUserSettingContent) != null && (multiLiveAnchorPanelSettings = multiLiveUpdateUserSettingContent.multiLiveAnchorPanelSettings) != null) {
                this.LJLIL.LJIILJJIL(false, multiLiveAnchorPanelSettings);
            }
        }
    }
}
