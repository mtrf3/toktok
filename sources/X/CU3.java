package X;

import com.bytedance.android.livesdk.livesetting.publicscreen.LiveMtIgnoreRoomCheckSetting;
import com.bytedance.android.livesdk.model.message.GiftGlobalMessage;
import com.bytedance.android.livesdk.model.message.HourlyRankRewardMessage;
import com.bytedance.android.livesdk.model.message.LiveIntroMessage;
import com.bytedance.android.livesdk.model.message.MarqueeAnnouncementMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IInterceptor;

/* loaded from: classes6.dex */
public final class CU3 implements IInterceptor {
    public final long LIZ;

    public CU3(long j) {
        this.LIZ = j;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IInterceptor
    public final boolean onMessage(IMessage iMessage) {
        CommonMessageData commonMessageData;
        CR6 cr6 = (CR6) iMessage;
        if ((cr6 instanceof LiveIntroMessage) && cr6.baseMessage != null) {
            cr6.baseMessage.roomId = this.LIZ;
            return false;
        }
        if ((cr6 instanceof HourlyRankRewardMessage) || (cr6 instanceof MarqueeAnnouncementMessage) || (cr6 instanceof GiftGlobalMessage) || LiveMtIgnoreRoomCheckSetting.INSTANCE.getValue() || (commonMessageData = cr6.baseMessage) == null || commonMessageData.roomId == this.LIZ) {
            return false;
        }
        return true;
    }
}
