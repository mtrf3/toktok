package X;

import com.bytedance.android.livesdk.broadcast.TryModeGoLiveChannel;
import com.bytedance.android.livesdk.broadcast.interaction.widget.TryModeGoLiveWidget;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final /* synthetic */ class BX5 extends TBS implements InterfaceC88472Yns<Room, C76800UCe> {
    public BX5(Object obj) {
        super(1, obj, TryModeGoLiveWidget.class, "jumpToLive", "jumpToLive(Lcom/bytedance/android/livesdkapi/depend/model/live/Room;)V", 0);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, com.bytedance.android.livesdkapi.depend.model.live.Room, O] */
    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Room room) {
        Room p0 = room;
        o.LJIIIZ(p0, "p0");
        TryModeGoLiveWidget tryModeGoLiveWidget = (TryModeGoLiveWidget) this.receiver;
        C29306Beo.LJJJJ(tryModeGoLiveWidget.LJLJI);
        boolean z = false;
        C0N7.LJI(p0, LiveMode.VIDEO, tryModeGoLiveWidget.dataChannel, 0, true);
        ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C29044Baa.class)).LIZ = p0;
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LLF;
        C29164BcW c29164BcW = tryModeGoLiveWidget.LJLJJL;
        if (c29164BcW != null) {
            if (c29164BcW.LJII == 1) {
                z = true;
            }
            c48459J0d.LIZ(Boolean.valueOf(z));
            C3Z.LIZ.getClass();
            C3Z.LJ(p0);
            tryModeGoLiveWidget.dataChannel.rv0(TryModeGoLiveChannel.class, Boolean.TRUE);
            return C76800UCe.LIZ;
        }
        o.LJIJI("roomBuilder");
        throw null;
    }
}
