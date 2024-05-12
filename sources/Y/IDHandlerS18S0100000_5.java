package Y;

import X.B4N;
import X.B4O;
import X.B4P;
import X.B4W;
import X.B53;
import X.B83;
import X.C28154B3e;
import X.C76104Tts;
import X.CF1;
import X.CF8;
import X.CF9;
import X.CFN;
import X.CN1;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.bytedance.android.live.slot.SlotBarrageWidget;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.chatroom.ui.LiveStickerPropsDialog;
import com.bytedance.android.livesdk.chatroom.ui.PortraitAudienceInteractionFragment;
import com.bytedance.android.livesdk.feed.drawerfeed.DrawerFeedLiveFragmentV2;
import com.bytedance.android.livesdk.model.message.BarrageMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.debug.CheckDetectPermissionResponse;
import com.bytedance.android.livesdkapi.depend.model.live.debug.DebugToolState;
import com.bytedance.android.livesdkapi.depend.model.live.debug.DetectorInfo;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class IDHandlerS18S0100000_5 extends Handler {
    public final int $t;
    public Object l0;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.$t) {
            case 0:
                handleMessage$0(this, message);
                return;
            case 1:
                handleMessage$1(this, message);
                return;
            case 2:
                handleMessage$2(this, message);
                return;
            case 3:
                handleMessage$3(this, message);
                return;
            case 4:
                handleMessage$4(this, message);
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }

    public static final void handleMessage$0(IDHandlerS18S0100000_5 iDHandlerS18S0100000_5, Message message) {
        Boolean bool;
        Object obj;
        Boolean bool2;
        super.handleMessage(message);
        int i = message.what;
        if (i != 28) {
            if (i != 47) {
                if (i != 37) {
                    if (i != 38 || (obj = message.obj) == null || !(obj instanceof DebugToolState)) {
                        return;
                    }
                    C28154B3e.LIZ = ((DebugToolState) obj).getCanDebugTool();
                    C28154B3e.LIZJ = Long.valueOf(B83.LIZ().LIZIZ().getCurrentUserId());
                    ((LivePlayFragment) iDHandlerS18S0100000_5.l0).Ql();
                    LivePlayFragment livePlayFragment = (LivePlayFragment) iDHandlerS18S0100000_5.l0;
                    if (livePlayFragment.LLJIJIL == null) {
                        return;
                    }
                    if ((!((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline() && !((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLiveInhouse()) || (bool2 = C28154B3e.LIZ) == null || !bool2.booleanValue()) {
                        return;
                    }
                    AbsAudienceInteractionFragment absAudienceInteractionFragment = livePlayFragment.LLJIJIL;
                    if (!(absAudienceInteractionFragment instanceof PortraitAudienceInteractionFragment)) {
                        return;
                    }
                    ((PortraitAudienceInteractionFragment) absAudienceInteractionFragment).un();
                    return;
                }
                ((LivePlayFragment) iDHandlerS18S0100000_5.l0).LJII();
                return;
            }
            Object obj2 = message.obj;
            if (obj2 == null || !(obj2 instanceof CheckDetectPermissionResponse)) {
                return;
            }
            CheckDetectPermissionResponse checkDetectPermissionResponse = (CheckDetectPermissionResponse) obj2;
            B53.LIZ = Boolean.valueOf(checkDetectPermissionResponse.getStatus());
            DetectorInfo detectorInfo = checkDetectPermissionResponse.getDetectorInfo();
            if (detectorInfo != null) {
                B53.LIZIZ = detectorInfo.getDetectorId();
                detectorInfo.getDetectorEmail();
            }
            B4W.LIZ(((LivePlayFragment) iDHandlerS18S0100000_5.l0).LJLIL);
            LivePlayFragment livePlayFragment2 = (LivePlayFragment) iDHandlerS18S0100000_5.l0;
            if (livePlayFragment2.LLJIJIL == null) {
                return;
            }
            if ((!((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline() && !((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLiveInhouse()) || (bool = B53.LIZ) == null || !bool.booleanValue()) {
                return;
            }
            AbsAudienceInteractionFragment absAudienceInteractionFragment2 = livePlayFragment2.LLJIJIL;
            if (!(absAudienceInteractionFragment2 instanceof PortraitAudienceInteractionFragment)) {
                return;
            }
            ((PortraitAudienceInteractionFragment) absAudienceInteractionFragment2).vn();
            return;
        }
        ((LivePlayFragment) iDHandlerS18S0100000_5.l0).tn((Room) message.obj);
    }

    public static final void handleMessage$1(IDHandlerS18S0100000_5 iDHandlerS18S0100000_5, Message msg) {
        C76104Tts c76104Tts;
        o.LJIIIZ(msg, "msg");
        super.handleMessage(msg);
        if (msg.what == 1 && (c76104Tts = ((LiveStickerPropsDialog) iDHandlerS18S0100000_5.l0).LJLJJLL) != null) {
            c76104Tts.LJII = true;
            c76104Tts.LIZLLL();
        }
    }

    public static final void handleMessage$2(IDHandlerS18S0100000_5 iDHandlerS18S0100000_5, Message message) {
        if (message.what == 1) {
            DrawerFeedLiveFragmentV2 drawerFeedLiveFragmentV2 = (DrawerFeedLiveFragmentV2) iDHandlerS18S0100000_5.l0;
            drawerFeedLiveFragmentV2.getClass();
            DrawerFeedLiveFragmentV2.Al("show");
            View view = drawerFeedLiveFragmentV2.LJLJI;
            if (view == null) {
                return;
            }
            view.animate().setDuration(300L).alpha(1).setListener(new ALAdapterS2S0000000_5(2)).start();
        }
    }

    public static final void handleMessage$3(IDHandlerS18S0100000_5 iDHandlerS18S0100000_5, Message message) {
        super.handleMessage(message);
        Object obj = message.obj;
        if (!(obj instanceof B4O)) {
            return;
        }
        B4O b4o = (B4O) obj;
        if (b4o.LIZJ == 100) {
            ((CopyOnWriteArrayList) ((B4N) iDHandlerS18S0100000_5.l0).LIZ).remove(b4o.LIZ);
        }
        B4P b4p = b4o.LIZ;
        if (b4p != null) {
            b4p.LIZ(b4o.LIZIZ);
        }
    }

    public static final void handleMessage$4(IDHandlerS18S0100000_5 iDHandlerS18S0100000_5, Message msg) {
        CFN cfn;
        o.LJIIIZ(msg, "msg");
        super.handleMessage(msg);
        if (msg.what == 1 && (cfn = ((CF8) iDHandlerS18S0100000_5.l0).LIZIZ) != null) {
            CF9 cf9 = ((SlotBarrageWidget) cfn).LJLJJL;
            if (cf9 != null) {
                Iterator<BarrageMessage> it = cf9.LIZIZ.iterator();
                while (it.hasNext()) {
                    BarrageMessage item = it.next();
                    o.LJIIIIZZ(item, "item");
                    if (CF1.LJIIIZ(item)) {
                        return;
                    }
                }
                Iterator<BarrageMessage> it2 = cf9.LIZJ.iterator();
                while (it2.hasNext()) {
                    BarrageMessage item2 = it2.next();
                    o.LJIIIIZZ(item2, "item");
                    if (CF1.LJIIIZ(item2)) {
                        return;
                    }
                }
            }
            ((CF8) iDHandlerS18S0100000_5.l0).LJIJI();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDHandlerS18S0100000_5(Object obj, Looper looper, int i) {
        super(looper);
        this.$t = i;
        this.l0 = obj;
    }
}
