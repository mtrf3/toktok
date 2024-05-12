package X;

import com.bytedance.android.livesdk.model.message.InRoomBannerMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* loaded from: classes6.dex */
public final class CAC extends AbstractC31497CXt<CAR> implements OnMessageListener {
    public final boolean LJLIL;
    public final Room LJLILLLLZI;

    @Override // X.AbstractC31497CXt
    /* renamed from: LJJJJ, reason: merged with bridge method [inline-methods] */
    public final void attachView(CAR car) {
        super.attachView((CAC) car);
        IMessageManager iMessageManager = this.mMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.IN_ROOM_BANNER_MESSAGE.getIntType(), this);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        T t = this.mView;
        if (t == 0 || !(iMessage instanceof InRoomBannerMessage)) {
            return;
        }
        int i = ((InRoomBannerMessage) iMessage).position;
        if (i != 2 && i != 5 && i != 1) {
            return;
        }
        ((CAR) t).Ri0((InRoomBannerMessage) iMessage);
    }

    public CAC(boolean z, Room room) {
        this.LJLILLLLZI = room;
        this.LJLIL = z;
    }
}
