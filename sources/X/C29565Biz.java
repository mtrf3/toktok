package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.model.message.LinkMicAudienceNoticeMessage;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.Biz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29565Biz implements InterfaceC31330CRi<LinkMicAudienceNoticeMessage> {
    @Override // X.InterfaceC31330CRi
    public final boolean LIZ(LinkMicAudienceNoticeMessage linkMicAudienceNoticeMessage, CQQ context) {
        Object obj;
        LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide linkMicAudienceInviteGuide;
        User user;
        LinkMicAudienceNoticeMessage message = linkMicAudienceNoticeMessage;
        o.LJIIIZ(message, "message");
        o.LJIIIZ(context, "context");
        if (!context.LJFF) {
            return true;
        }
        DataChannel dataChannel = context.LJIIIIZZ;
        if (dataChannel != null) {
            obj = dataChannel.kv0(BCX.class);
        } else {
            obj = null;
        }
        if ((obj != LiveMode.VIDEO && obj != LiveMode.LIVE_VOICE) || !LiveAppBundleUtils.isPluginAvailable(EnumC38440F6u.LINK_MIC)) {
            return true;
        }
        int Fy = ((IInteractService) CN1.LIZ(IInteractService.class)).Fy();
        int i = message.noticeType;
        if (i == 0) {
            if (message.turnOnGuide != null) {
            }
            return true;
        }
        if (i != 1 || (linkMicAudienceInviteGuide = message.inviteGuide) == null || (user = linkMicAudienceInviteGuide.user) == null || user.getSecret() == 1) {
            return true;
        }
        return true ^ C77125UOr.LJIIJJI(Fy, 2);
    }
}
