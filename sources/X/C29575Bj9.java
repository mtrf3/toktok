package X;

import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCoHostMatchCapsuleGovernanceSetting;
import com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.Bj9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29575Bj9 implements InterfaceC31330CRi<LinkMicAnchorGuideMessage> {
    @Override // X.InterfaceC31330CRi
    public final boolean LIZ(LinkMicAnchorGuideMessage linkMicAnchorGuideMessage, CQQ context) {
        DataChannel dataChannel;
        Integer num;
        LinkMicAnchorGuideMessage message = linkMicAnchorGuideMessage;
        o.LJIIIZ(message, "message");
        o.LJIIIZ(context, "context");
        if (!LiveCoHostMatchCapsuleGovernanceSetting.INSTANCE.coHostMatchCapsuleDefault() || (dataChannel = context.LJIIIIZZ) == null || (num = (Integer) dataChannel.kv0(C28414BDe.class)) == null) {
            return true;
        }
        if (num.intValue() != 1 && num.intValue() != 3) {
            return true;
        }
        num.intValue();
        int i = message.guideType;
        if (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 7 || ((IMicRoomService) CN1.LIZ(IMicRoomService.class)).oT()) {
            return true;
        }
        if (message.connectType == 2) {
            C75017TcL.LJ("anchor_host_notice", true);
        } else {
            C75017TcL.LJ("anchor_host_notice", false);
        }
        return false;
    }
}
