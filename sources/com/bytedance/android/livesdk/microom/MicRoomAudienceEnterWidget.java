package com.bytedance.android.livesdk.microom;

import X.AbstractC73672Svk;
import X.C29927Bop;
import X.C30079BrH;
import X.C30725C4b;
import X.C73318Sq2;
import X.C73969T1h;
import X.C76848UEa;
import X.CN1;
import X.EnumC31509CYf;
import X.UEZ;
import X.V0Q;
import Y.AfS65S0100000_13;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.OfficialChannelUserMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS179S0100000_13;

/* loaded from: classes14.dex */
public final class MicRoomAudienceEnterWidget extends LiveRecyclableWidget {
    public IMessageManager LJLILLLLZI;
    public long LJLJI;
    public long LJLJJI;
    public final C73318Sq2 LJLIL = new C73318Sq2();
    public final AqS179S0100000_13 LJLJJL = new AqS179S0100000_13(this, 331);

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        this.LJLIL.LIZLLL();
        IMessageManager iMessageManager = this.LJLILLLLZI;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(EnumC31509CYf.OFFICIAL_CHANNEL_USER_MESSAGE.getIntType(), new C76848UEa(this.LJLJJL));
        }
    }

    public final void LJLZ(IMessage iMessage) {
        if ((iMessage instanceof OfficialChannelUserMessage) && iMessage != null) {
            this.LJLIL.LIZLLL();
            long LIZ = (((OfficialChannelUserMessage) iMessage).startTimeStamp - (C30725C4b.LIZ() / 1000)) + V0Q.Default.nextInt(2, (int) r8.maxEnterTime);
            if (LIZ <= 0) {
                IMicRoomService iMicRoomService = (IMicRoomService) CN1.LIZ(IMicRoomService.class);
                if (iMicRoomService != null) {
                    iMicRoomService.Y30(this.LJLJI, this.LJLJJI, true);
                    return;
                }
                return;
            }
            this.LJLIL.LIZ(AbstractC73672Svk.LJJLIIIJLJLI(LIZ, TimeUnit.SECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS65S0100000_13(this, 85), UEZ.LJLIL));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        IMessageManager iMessageManager;
        Object obj;
        Room room;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class);
        } else {
            iMessageManager = null;
        }
        this.LJLILLLLZI = iMessageManager;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (room = (Room) dataChannel2.kv0(RoomChannel.class)) != null) {
            this.LJLJI = room.getId();
            this.LJLJJI = room.getOwnerUserId();
        }
        IMessageManager iMessageManager2 = this.LJLILLLLZI;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(EnumC31509CYf.OFFICIAL_CHANNEL_USER_MESSAGE.getIntType(), new C76848UEa(this.LJLJJL));
        }
        if (objArr != null) {
            for (Object obj2 : objArr) {
                if ((obj2 instanceof C30079BrH) && ((obj = ((C30079BrH) obj2).LIZ) == null || (obj instanceof IMessage))) {
                    LJLZ((IMessage) obj);
                }
            }
        }
    }
}
