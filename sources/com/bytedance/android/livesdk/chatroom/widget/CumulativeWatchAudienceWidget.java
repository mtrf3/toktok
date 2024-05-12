package com.bytedance.android.livesdk.chatroom.widget;

import X.AbstractC73672Svk;
import X.BCW;
import X.C265112h;
import X.C29927Bop;
import X.C2A8;
import X.C73411SrX;
import X.EnumC31509CYf;
import Y.AfS57S0100000_5;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.performance.widget.PerformProcessWidget;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.performance.EnableRecycleSingleWidgetSetting;
import com.bytedance.android.livesdk.model.RoomStats;
import com.bytedance.android.livesdk.model.message.RoomUserSeqMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CumulativeWatchAudienceWidget extends PerformProcessWidget implements OnMessageListener {
    public C2A8 LJLIL;
    public int LJLILLLLZI;
    public IMessageManager LJLJI;
    public C73411SrX LJLJJI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.cvi;
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return EnableRecycleSingleWidgetSetting.INSTANCE.getValue();
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C73411SrX c73411SrX;
        hide();
        IMessageManager iMessageManager = this.LJLJI;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(EnumC31509CYf.USER_SEQ.getIntType(), this);
        }
        C73411SrX c73411SrX2 = this.LJLJJI;
        if (c73411SrX2 != null && !c73411SrX2.isDisposed() && (c73411SrX = this.LJLJJI) != null) {
            c73411SrX.dispose();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void initConstructor(Object... args) {
        o.LJIIIZ(args, "args");
        super.initConstructor(Arrays.copyOf(args, args.length));
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LJLIL = (C2A8) findViewById(R.id.hau);
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
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
        o.LJ(this.dataChannel.kv0(BCW.class), Boolean.TRUE);
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.kv0(C29927Bop.class);
        this.LJLJI = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.USER_SEQ.getIntType(), this);
        }
        show();
        this.LJLJJI = (C73411SrX) C265112h.LIZ(AbstractC73672Svk.LJJIIZI(1L, 2L, TimeUnit.SECONDS)).LJJJJZI(new AfS57S0100000_5(this, 92));
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
