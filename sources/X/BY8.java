package X;

import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* loaded from: classes6.dex */
public final class BY8 extends BY9<InterfaceC2301691o> implements OnMessageListener {
    public final Room LJLIL;
    public IMessageManager LJLILLLLZI;
    public final DataChannel LJLJI;

    @Override // X.BY9
    public final void detachView() {
        super.detachView();
        IMessageManager iMessageManager = this.LJLILLLLZI;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
    }

    @Override // X.BY9
    public final void attachView(InterfaceC2301691o interfaceC2301691o) {
        super.attachView(interfaceC2301691o);
        IMessageManager iMessageManager = (IMessageManager) this.LJLJI.kv0(C29927Bop.class);
        this.LJLILLLLZI = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.PERCEPTION_MESSAGE.getIntType(), this);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        PerceptionDialogInfo perceptionDialogInfo;
        Room room;
        PunishEventInfo punishEventInfo;
        if (iMessage != null && (iMessage instanceof PerceptionMessage)) {
            PerceptionMessage perceptionMessage = (PerceptionMessage) iMessage;
            if (perceptionMessage.getMessageType() != EnumC31509CYf.PERCEPTION_MESSAGE || (perceptionDialogInfo = perceptionMessage.dialog) == null || perceptionDialogInfo.scene != 6 || (room = this.LJLIL) == null || (punishEventInfo = perceptionMessage.publicEventInfo) == null || punishEventInfo.punishId == null) {
                return;
            }
            ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).Lk0(room.getId(), perceptionMessage.publicEventInfo.punishId);
        }
    }

    public BY8(Room room, DataChannel dataChannel) {
        this.LJLIL = room;
        this.LJLJI = dataChannel;
    }
}
