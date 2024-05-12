package X;

import com.bytedance.android.livesdk.microom.MicRoomAudienceExitWidget;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdk.model.message.OfficialChannelModifyMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* renamed from: X.Bjv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29623Bjv implements OnMessageListener {
    public final /* synthetic */ MicRoomAudienceExitWidget LJLIL;

    public C29623Bjv(MicRoomAudienceExitWidget micRoomAudienceExitWidget) {
        this.LJLIL = micRoomAudienceExitWidget;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        OfficialChannelInfo officialChannelInfo;
        if ((iMessage instanceof OfficialChannelModifyMessage) && iMessage != null) {
            MicRoomAudienceExitWidget micRoomAudienceExitWidget = this.LJLIL;
            Room room = micRoomAudienceExitWidget.LJLJJI;
            if (room != null && (officialChannelInfo = room.officialChannelInfo) != null) {
                officialChannelInfo.endTimeStamp = ((OfficialChannelModifyMessage) iMessage).endTimeStamp;
            }
            micRoomAudienceExitWidget.LJLILLLLZI.LIZLLL();
            micRoomAudienceExitWidget.LJZ();
        }
    }
}
