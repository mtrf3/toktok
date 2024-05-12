package com.bytedance.android.livesdk.microom;

import X.AbstractC73672Svk;
import X.BM1;
import X.BWZ;
import X.BYI;
import X.C29627Bjz;
import X.C29628Bk0;
import X.C29629Bk1;
import X.C29630Bk2;
import X.C29927Bop;
import X.C30725C4b;
import X.C32537Cpp;
import X.C73411SrX;
import X.C73969T1h;
import X.EnumC31509CYf;
import Y.AfS57S0100000_5;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.room.MicRoomDisableInteractionEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdk.model.message.OfficialChannelAnchorMessage;
import com.bytedance.android.livesdk.model.message.OfficialChannelModifyMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class MicRoomAnchorTimeControlWidget extends LiveRecyclableWidget implements OnMessageListener {
    public IMessageManager LJLIL;
    public Room LJLILLLLZI;
    public C73411SrX LJLJI;
    public C73411SrX LJLJJI;

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJLZ() {
        C29629Bk1 c29629Bk1;
        boolean z;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (c29629Bk1 = (C29629Bk1) dataChannel.kv0(C29628Bk0.class)) != null) {
            if (c29629Bk1.LIZ == 1) {
                z = true;
            } else {
                z = false;
            }
            BM1.LIZ = true;
            BM1.LIZIZ = z;
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.qv0(MicRoomDisableInteractionEvent.class, Boolean.TRUE);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C73411SrX c73411SrX = this.LJLJI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        C73411SrX c73411SrX2 = this.LJLJJI;
        if (c73411SrX2 != null) {
            c73411SrX2.dispose();
        }
        IMessageManager iMessageManager = this.LJLIL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
    }

    public final void LJZ(long j) {
        C73411SrX c73411SrX = this.LJLJJI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        long LIZ = j - (C30725C4b.LIZ() / 1000);
        if (LIZ <= 0) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.qv0(MicRoomDisableInteractionEvent.class, Boolean.FALSE);
            }
            BM1.LIZ = false;
            BM1.LIZIZ = false;
            return;
        }
        this.LJLJJI = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(LIZ, TimeUnit.SECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS57S0100000_5(this, UserLevelGeckoUpdateSetting.DEFAULT));
    }

    public final void LJZI(long j) {
        C73411SrX c73411SrX = this.LJLJI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        long LIZ = j - (C30725C4b.LIZ() / 1000);
        if (LIZ <= 10) {
            Room room = this.LJLILLLLZI;
            if (room != null) {
                room.liveSubOnly = 0L;
            }
            BYI.LIZLLL(BWZ.SUB_ONLY);
            LJLZ();
            return;
        }
        this.LJLJI = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(LIZ - 10, TimeUnit.SECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS57S0100000_5(this, 141));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        IMessageManager iMessageManager;
        OfficialChannelInfo officialChannelInfo;
        DataChannel dataChannel = this.dataChannel;
        Room room = null;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.OFFICIAL_CHANNEL_ANCHOR_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(EnumC31509CYf.OFFICIAL_CHANNEL_MODIFY_MESSAGE.getIntType(), this);
        } else {
            iMessageManager = null;
        }
        this.LJLIL = iMessageManager;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            room = (Room) dataChannel2.kv0(RoomChannel.class);
        }
        this.LJLILLLLZI = room;
        if (room != null && (officialChannelInfo = room.officialChannelInfo) != null) {
            LJZI(officialChannelInfo.startTimeStamp);
            LJZ(officialChannelInfo.endTimeStamp);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.Bk2, O] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.Bk1, O] */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        OfficialChannelAnchorMessage officialChannelAnchorMessage;
        OfficialChannelModifyMessage officialChannelModifyMessage;
        Integer num = null;
        if (iMessage != null) {
            num = Integer.valueOf(iMessage.getIntType());
        }
        int intType = EnumC31509CYf.OFFICIAL_CHANNEL_ANCHOR_MESSAGE.getIntType();
        if (num == null || num.intValue() != intType) {
            int intType2 = EnumC31509CYf.OFFICIAL_CHANNEL_MODIFY_MESSAGE.getIntType();
            if (num == null || num.intValue() != intType2 || !(iMessage instanceof OfficialChannelModifyMessage) || (officialChannelModifyMessage = (OfficialChannelModifyMessage) iMessage) == null) {
                return;
            }
            LJZ(officialChannelModifyMessage.endTimeStamp);
            return;
        }
        if (!(iMessage instanceof OfficialChannelAnchorMessage) || (officialChannelAnchorMessage = (OfficialChannelAnchorMessage) iMessage) == null) {
            return;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C29627Bjz.class)).LIZ = new C29630Bk2(officialChannelAnchorMessage.linkmicType);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            ((C32537Cpp) dataChannel2.gv0(C29628Bk0.class)).LIZ = new C29629Bk1(officialChannelAnchorMessage.roleType, officialChannelAnchorMessage.existLinkmic);
        }
        LJZI(officialChannelAnchorMessage.startTimeStamp);
        LJZ(officialChannelAnchorMessage.endTimeStamp);
    }
}
