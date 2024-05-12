package com.bytedance.android.livesdk.programmedlive.ui;

import X.AbstractC73672Svk;
import X.B76;
import X.C1DH;
import X.C265112h;
import X.C29927Bop;
import X.C2A8;
import X.C73411SrX;
import X.EnumC31509CYf;
import Y.AfS57S0100000_5;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.ProgrammedLiveMenuVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.performance.EnableRecycleSingleWidgetSetting;
import com.bytedance.android.livesdk.model.RoomStats;
import com.bytedance.android.livesdk.model.message.RoomUserSeqMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public abstract class ProgrammedLiveOnlineAudienceWidget extends LiveRecyclableWidget implements OnMessageListener {
    public C2A8 LJLIL;
    public int LJLILLLLZI;
    public boolean LJLJI;
    public IMessageManager LJLJJI;
    public C73411SrX LJLJJL;

    public abstract void LJLZ();

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.dhd;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C73411SrX c73411SrX;
        this.LJLILLLLZI = 0;
        this.LJLJI = false;
        IMessageManager iMessageManager = this.LJLJJI;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(EnumC31509CYf.USER_SEQ.getIntType(), this);
        }
        C73411SrX c73411SrX2 = this.LJLJJL;
        if (c73411SrX2 != null && !c73411SrX2.isDisposed() && (c73411SrX = this.LJLJJL) != null) {
            c73411SrX.dispose();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return EnableRecycleSingleWidgetSetting.INSTANCE.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LJLIL = (C2A8) findViewById(R.id.hau);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        int i;
        RoomStats stats;
        Room room = (Room) this.dataChannel.kv0(RoomChannel.class);
        if (room != null && (stats = room.getStats()) != null) {
            i = stats.getTotalUser();
        } else {
            i = 0;
        }
        this.LJLILLLLZI = i;
        LJLZ();
        this.dataChannel.lv0(this, ProgrammedLiveMenuVisibilityChannel.class, new AqS171S0100000_5(this, 467));
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.kv0(C29927Bop.class);
        this.LJLJJI = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.USER_SEQ.getIntType(), this);
        }
        this.LJLJJL = (C73411SrX) C265112h.LIZ(AbstractC73672Svk.LJJIJIIJI(2L, TimeUnit.SECONDS)).LJJJJZI(new AfS57S0100000_5(this, 157));
        Room LJIILL = C1DH.LJIILL(this.dataChannel);
        if (LJIILL != null) {
            B76.LIZJ(LJIILL, "watch_cnt");
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        int i;
        if (iMessage instanceof RoomUserSeqMessage) {
            Long l = ((RoomUserSeqMessage) iMessage).totalUser;
            if (l != null) {
                i = (int) l.longValue();
            } else {
                i = 0;
            }
            this.LJLILLLLZI = i;
        }
    }
}
