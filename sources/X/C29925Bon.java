package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.dataChannel.DisableMuteMicEvent;
import com.bytedance.android.livesdk.dataChannel.MuteMicChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.game.model.AccessRecallMessage;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubOnlyAllowMusicSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.MuteAnchorRoomAudioSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.Bon, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29925Bon implements OnIMMessageListener {
    public static final C29925Bon LJLIL = new C29925Bon();
    public static WeakReference<DataChannel> LJLILLLLZI;
    public static WeakReference<IMessageManager> LJLJI;
    public static boolean LJLJJI;
    public static boolean LJLJJL;
    public static CountDownTimerC29926Boo LJLJJLL;

    public static void LIZ() {
        LJLJJI = true;
        LIZJ(true);
        LIZIZ(true);
        LJLJJL = false;
        long j = 1000;
        long longValue = (InterfaceC30442Bx8.X2.LIZJ().longValue() - (C30725C4b.LIZ() / j)) * j;
        if (longValue <= 0) {
            return;
        }
        CountDownTimerC29926Boo countDownTimerC29926Boo = LJLJJLL;
        if (countDownTimerC29926Boo != null) {
            countDownTimerC29926Boo.cancel();
        }
        CountDownTimerC29926Boo countDownTimerC29926Boo2 = new CountDownTimerC29926Boo(longValue);
        LJLJJLL = countDownTimerC29926Boo2;
        countDownTimerC29926Boo2.start();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startCountDown：");
        LIZ.append(longValue);
        C0NB.LIZIZ("access_recall_message", X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "access_recall_message";
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    public static void LIZIZ(boolean z) {
        AudioDeviceModule LJII;
        InterfaceC21020s6 interfaceC21020s6 = (InterfaceC21020s6) DataChannelGlobal.LJLJJI.mv0(C54992Dv.class);
        if (interfaceC21020s6 != null && (LJII = interfaceC21020s6.LJII()) != null) {
            LJII.setInputStreamMute(z);
        }
        C10S.LIZ("muteInLiveStream: ", z, "access_recall_message");
    }

    public static void LIZJ(boolean z) {
        C10S.LIZ("muteInRtc: ", z, "access_recall_message");
        if (z) {
            ((IInteractService) CN1.LIZ(IInteractService.class)).yp0();
        } else {
            ((IInteractService) CN1.LIZ(IInteractService.class)).Wb0();
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        boolean z;
        DataChannel dataChannel;
        Object obj;
        WeakReference<DataChannel> weakReference;
        DataChannel dataChannel2;
        DataChannel dataChannel3;
        if ((iMessage instanceof AccessRecallMessage) && MuteAnchorRoomAudioSetting.INSTANCE.enableMute()) {
            C0NB.LIZIZ("access_recall_message", "receive AccessRecallMessage");
            AccessRecallMessage accessRecallMessage = (AccessRecallMessage) iMessage;
            if (o.LJ(accessRecallMessage.scene, "AUDIO_MUTE")) {
                if (accessRecallMessage.status == 1) {
                    z = true;
                    C48458J0c c48458J0c = InterfaceC30442Bx8.Y2;
                    WeakReference<DataChannel> weakReference2 = LJLILLLLZI;
                    if (weakReference2 != null && (dataChannel3 = weakReference2.get()) != null) {
                        obj = dataChannel3.kv0(MuteMicChannel.class);
                    } else {
                        obj = null;
                    }
                    c48458J0c.LIZ(obj);
                    InterfaceC30442Bx8.X2.LIZ(Long.valueOf(accessRecallMessage.endTime));
                    LIZ();
                    if (LiveSubOnlyAllowMusicSetting.getEnableAllowMusic() && (weakReference = LJLILLLLZI) != null && (dataChannel2 = weakReference.get()) != null) {
                        Room room = (Room) dataChannel2.kv0(RoomChannel.class);
                        if (room != null && room.liveSubOnly == 0) {
                            return;
                        } else {
                            ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).dw(dataChannel2);
                        }
                    }
                } else {
                    z = false;
                    InterfaceC30442Bx8.X2.LIZ(-1L);
                    synchronized (this) {
                        LJLJJI = false;
                        if (!LJLJJL) {
                            LIZJ(false);
                            LIZIZ(false);
                            LJLJJL = true;
                        }
                    }
                }
                WeakReference<DataChannel> weakReference3 = LJLILLLLZI;
                if (weakReference3 != null && (dataChannel = weakReference3.get()) != null) {
                    dataChannel.qv0(DisableMuteMicEvent.class, Boolean.valueOf(z));
                }
            }
        }
    }
}
