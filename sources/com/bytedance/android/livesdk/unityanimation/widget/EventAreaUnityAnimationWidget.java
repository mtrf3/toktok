package com.bytedance.android.livesdk.unityanimation.widget;

import X.C0NB;
import X.C17280m4;
import X.C199097rd;
import X.C29044Baa;
import X.C29306Beo;
import X.C31811Ce7;
import X.C5H3;
import X.C72818Shy;
import X.C78996UzQ;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import X.T3F;
import X.T3G;
import X.T3H;
import X.T3I;
import X.T3J;
import X.T3K;
import X.UPJ;
import X.X1D;
import X.XKQ;
import Y.IDAListenerS42S0200000_12;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveUnityAnimationEnableSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchMemoryLeakOpt;
import com.bytedance.android.livesdk.unityanimation.event.UnityAnimationDataChannel;
import com.bytedance.android.livesdk.unityanimation.event.UnityAnimationDataDataChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class EventAreaUnityAnimationWidget extends LiveRecyclableWidget implements InterfaceC72822Si2 {
    public final C5H3 LJLIL = C78996UzQ.LJJIJIIJI(T3G.LJLIL);

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final PriorityBlockingQueue<T3I> LJZI() {
        return (PriorityBlockingQueue) this.LJLIL.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C72818Shy.LJII("event_area_js_event_live_unity_animation_queue", this);
        LJZI().clear();
    }

    public final void LJLZ() {
        T3I peek;
        if (LJZI().isEmpty() || (peek = LJZI().peek()) == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("play animation:");
        C31811Ce7.LJ(LIZ, peek.LJLIL, LIZ, "EventAreaUnityAnimationWidget");
        if (!peek.LJLJL) {
            peek.LJLJL = true;
            peek.LIZJ();
        }
        peek.LJLJJLL = C29306Beo.LJJIIJZLJL(this, null, new T3F(peek, this, null), 3);
    }

    public final void LJZ(T3K t3k) {
        if (!LiveUnityAnimationEnableSetting.INSTANCE.enable()) {
            t3k.LJLILLLLZI.LIZ();
            return;
        }
        T3J t3j = new T3J(t3k, t3k.LJLIL);
        t3k.LJLILLLLZI.LIZIZ(new IDAListenerS42S0200000_12(this, t3j, 0));
        LJZI().add(t3j);
        LJLZ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        C72818Shy.LIZLLL("event_area_js_event_live_unity_animation_queue", this);
        if (WatchMemoryLeakOpt.INSTANCE.settingValue()) {
            this.dataChannel.lv0(this, UnityAnimationDataChannel.class, new AqS178S0100000_12(this, 81));
        } else {
            DataChannelGlobal.LJLJJI.nv0(this, this, UnityAnimationDataDataChannel.class, new AqS178S0100000_12(this, 82));
        }
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        String str;
        boolean z;
        T3I t3i;
        InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
        if (interfaceC78280Uns == null) {
            return;
        }
        String LJJIJIL = u.LJJIJIL(interfaceC78280Uns, "type", "");
        String LJJIJIL2 = u.LJJIJIL(interfaceC78280Uns, "containerID", "");
        String LJJIJIL3 = u.LJJIJIL(interfaceC78280Uns, "bid", "");
        String LJJIJIL4 = u.LJJIJIL(interfaceC78280Uns, "room_id", "");
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null || (str = C17280m4.LIZ(room)) == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        if (LJJIJIL4.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || !o.LJ(LJJIJIL4, str)) {
            C0NB.LIZIZ("EventAreaUnityAnimationWidget", UPJ.LIZIZ("eventRoomId:", LJJIJIL4, " doesn't match currentRoomId:", str, ",just return"));
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onReceiveJsEvent: ");
        LIZ.append(LJJIJIL);
        LIZ.append("  bid:");
        LIZ.append(LJJIJIL3);
        C0NB.LIZIZ("EventAreaUnityAnimationWidget", X1D.LIZIZ(LIZ));
        if (o.LJ(LJJIJIL, "action_enter")) {
            T3H t3h = new T3H(LJJIJIL3, LJJIJIL2);
            if (!LiveUnityAnimationEnableSetting.INSTANCE.enable()) {
                if (!t3h.LJLJL) {
                    t3h.LJLJL = true;
                    t3h.LIZJ();
                    return;
                }
                return;
            }
            LJZI().add(t3h);
            LJLZ();
            return;
        }
        if (!o.LJ(LJJIJIL, "action_end")) {
            return;
        }
        Iterator<T3I> it = LJZI().iterator();
        while (true) {
            if (it.hasNext()) {
                t3i = it.next();
                T3I t3i2 = t3i;
                if (o.LJ(t3i2.LJLIL, LJJIJIL3) && o.LJ(t3i2.LJLILLLLZI, LJJIJIL2)) {
                    break;
                }
            } else {
                t3i = null;
                break;
            }
        }
        T3I t3i3 = t3i;
        if (t3i3 != null) {
            XKQ xkq = t3i3.LJLJJLL;
            if (xkq != null && !xkq.isCancelled()) {
                XKQ xkq2 = t3i3.LJLJJLL;
                if (xkq2 != null) {
                    xkq2.LIZIZ(null);
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("canceled delay job:");
                C31811Ce7.LJ(LIZ2, t3i3.LJLIL, LIZ2, "EventAreaUnityAnimationWidget");
            }
            LJZI().remove(t3i3);
        }
        LJLZ();
    }
}
