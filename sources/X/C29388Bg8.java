package X;

import com.bytedance.android.live.room.RefreshUserInRoomEvent;
import com.bytedance.android.livesdk.model.message.UserStatsMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* renamed from: X.Bg8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29388Bg8 extends BY9<InterfaceC2301691o> implements OnMessageListener {
    public IMessageManager LJLIL;
    public final DataChannel LJLILLLLZI;

    @Override // X.BY9
    public final void detachView() {
        super.detachView();
        IMessageManager iMessageManager = this.LJLIL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
    }

    public C29388Bg8(DataChannel dataChannel) {
        this.LJLILLLLZI = dataChannel;
    }

    @Override // X.BY9
    public final void attachView(InterfaceC2301691o interfaceC2301691o) {
        super.attachView(interfaceC2301691o);
        IMessageManager iMessageManager = (IMessageManager) this.LJLILLLLZI.kv0(C29927Bop.class);
        this.LJLIL = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.USER_STATS.getIntType(), this);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (!(iMessage instanceof UserStatsMessage)) {
            return;
        }
        UserStatsMessage userStatsMessage = (UserStatsMessage) iMessage;
        if (userStatsMessage.mUserId == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId() && 1 == userStatsMessage.mActionType) {
            ((C29374Bfu) B83.LIZ().LIZIZ()).LJIL("UserStatsPresenter_refreshUser").LIZ(new C29355Bfb());
            this.LJLILLLLZI.pv0(RefreshUserInRoomEvent.class);
        }
    }
}
