package X;

import Y.AfS3S0200100_13;
import android.os.SystemClock;
import com.bytedance.android.livesdk.business.detect.MessageDetectApi;
import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import com.bytedance.android.livesdk.model.message.MsgDetectMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.message.IMessageService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.google.gson.m;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.data.MessageTrackTimeInfo;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import kotlin.jvm.internal.o;

/* renamed from: X.Uho, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77904Uho implements OnMessageListener {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public final boolean LJLIL;

    public C77904Uho(boolean z) {
        this.LJLIL = z;
    }

    public final synchronized String LIZJ(MsgDetectMessage msgDetectMessage) {
        String str;
        try {
            str = C09650Zl.LIZIZ.LJIILL(msgDetectMessage);
            o.LJIIIIZZ(str, "{\n            GsonHelper…toJson(message)\n        }");
        } catch (Exception unused) {
            str = "";
        }
        return str;
    }

    public final void LIZLLL(MsgDetectMessage msgDetectMessage) {
        IMessageManager iMessageManager;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        String str = null;
        if (room != null) {
            iMessageManager = ((IMessageService) CN1.LIZ(IMessageService.class)).get(room.getId());
        } else {
            iMessageManager = null;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_im_delay_detect");
        LIZ.LJIJJ(Integer.valueOf(this.LJLIL ? 1 : 0), "is_anchor");
        LIZ.LJIJJ(Long.valueOf(msgDetectMessage.getMessageId()), "msg_id");
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        LIZ.LJIJJ(l, "room_id");
        LIZ.LJIJJ(Integer.valueOf(msgDetectMessage.getMessageFrom()), "msg_from");
        LIZ.LJIJJ(Integer.valueOf(msgDetectMessage.getGeneralMessageType()), "msg_type");
        MsgDetectMessage.TimeInfo timeInfo = msgDetectMessage.timeInfo;
        if (timeInfo != null) {
            l2 = Long.valueOf(timeInfo.clientStartMs);
        } else {
            l2 = null;
        }
        LIZ.LJIJJ(l2, "client_start_ms");
        MsgDetectMessage.TimeInfo timeInfo2 = msgDetectMessage.timeInfo;
        if (timeInfo2 != null) {
            l3 = Long.valueOf(timeInfo2.apiRecvTimeMs);
        } else {
            l3 = null;
        }
        LIZ.LJIJJ(l3, "api_recv_time_ms");
        MsgDetectMessage.TimeInfo timeInfo3 = msgDetectMessage.timeInfo;
        if (timeInfo3 != null) {
            l4 = Long.valueOf(timeInfo3.apiSendToGoimMs);
        } else {
            l4 = null;
        }
        LIZ.LJIJJ(l4, "api_send_to_goim_ms");
        LIZ.LJIJJ(Long.valueOf(msgDetectMessage.messageTrackTimeInfo.receiveMessageTime), "imsdk_recv_time_ms");
        LIZ.LJIJJ(Long.valueOf(msgDetectMessage.messageTrackTimeInfo.deliverMessageTime), "imsdk_deliver_time_ms");
        LIZ.LJIJJ(Long.valueOf(C30725C4b.LIZ()), "report_time_ms");
        LIZ.LJIJJ(msgDetectMessage.baseMessage.fromIdc, "from_idc");
        LIZ.LJIJJ(msgDetectMessage.fromRegion, "from_region");
        if (iMessageManager != null) {
            str = iMessageManager.getDomain();
        }
        LIZ.LJIJJ(str, "domain");
        LIZ.LJJIIJZLJL();
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        if (!(iMessage instanceof MsgDetectMessage)) {
            return;
        }
        MsgDetectMessage msgDetectMessage = (MsgDetectMessage) iMessage;
        int i = msgDetectMessage.detectType;
        long j9 = 0;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                LIZLLL(msgDetectMessage);
                Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                MessageDetectApi messageDetectApi = (MessageDetectApi) Q7L.LIZIZ(MessageDetectApi.class);
                if (room != null) {
                    j6 = room.getId();
                } else {
                    j6 = 0;
                }
                int generalMessageType = msgDetectMessage.getGeneralMessageType();
                MsgDetectMessage.TimeInfo timeInfo = msgDetectMessage.timeInfo;
                if (timeInfo != null) {
                    j7 = timeInfo.clientStartMs;
                    j8 = timeInfo.apiRecvTimeMs;
                    j9 = timeInfo.apiSendToGoimMs;
                } else {
                    j7 = 0;
                    j8 = 0;
                }
                MessageTrackTimeInfo messageTrackTimeInfo = msgDetectMessage.messageTrackTimeInfo;
                C1EW.LIZ(messageDetectApi.imDetectReport(j6, generalMessageType, j7, j8, j9, messageTrackTimeInfo.receiveMessageTime, messageTrackTimeInfo.deliverMessageTime)).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9Cy
                    @Override // X.InterfaceC64592gB
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    }
                }, new InterfaceC64592gB() { // from class: X.9Cz
                    @Override // X.InterfaceC64592gB
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    }
                });
                return;
            }
            LIZLLL(msgDetectMessage);
            return;
        }
        Room room2 = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        MsgDetectMessage.TriggerCondition triggerCondition = msgDetectMessage.triggerCondition;
        if (triggerCondition != null && o.LJ(triggerCondition.uplinkDetectHTTP, Boolean.TRUE)) {
            MsgDetectMessage.TriggerCondition triggerCondition2 = msgDetectMessage.triggerCondition;
            if (triggerCondition2 != null && o.LJ(triggerCondition2.httpOptimize, Boolean.TRUE)) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C65814PsI.LIZ().getClass();
                MessageDetectApi messageDetectApi2 = (MessageDetectApi) ((INetworkService) CN1.LIZ(INetworkService.class)).Du0(MessageDetectApi.class);
                if (room2 != null) {
                    j4 = room2.getId();
                } else {
                    j4 = 0;
                }
                if (room2 != null) {
                    j5 = room2.getOwnerUserId();
                } else {
                    j5 = 0;
                }
                long LIZ = C30725C4b.LIZ();
                String LIZJ = LIZJ(msgDetectMessage);
                C65124PhA.LIZLLL().getClass();
                C1EW.LIZ(messageDetectApi2.imDetect(j4, 0L, j5, LIZ, LIZJ, C65124PhA.LIZIZ())).LJJJLIIL(new AfS3S0200100_13(elapsedRealtime, this, msgDetectMessage, 35), new AfS3S0200100_13(elapsedRealtime, this, msgDetectMessage, 36));
            } else {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                MessageDetectApi messageDetectApi3 = (MessageDetectApi) Q7L.LIZIZ(MessageDetectApi.class);
                if (room2 != null) {
                    j2 = room2.getId();
                } else {
                    j2 = 0;
                }
                if (room2 != null) {
                    j3 = room2.getOwnerUserId();
                } else {
                    j3 = 0;
                }
                C1EW.LIZ(messageDetectApi3.imDetect(j2, 0L, j3, C30725C4b.LIZ(), LIZJ(msgDetectMessage), C113554cx.LJJJLIIL())).LJJJLIIL(new AfS3S0200100_13(elapsedRealtime2, this, msgDetectMessage, 33), new AfS3S0200100_13(elapsedRealtime2, this, msgDetectMessage, 34));
            }
        }
        MsgDetectMessage.TriggerCondition triggerCondition3 = msgDetectMessage.triggerCondition;
        if (triggerCondition3 == null || !o.LJ(triggerCondition3.uplinkDetectWebsocket, Boolean.TRUE)) {
            return;
        }
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        MessageDetectApi messageDetectApi4 = (MessageDetectApi) ((IMessageService) CN1.LIZ(IMessageService.class)).create(MessageDetectApi.class);
        if (messageDetectApi4 == null) {
            return;
        }
        if (room2 != null) {
            j = room2.getId();
        } else {
            j = 0;
        }
        if (room2 != null) {
            j9 = room2.getOwnerUserId();
        }
        AbstractC73672Svk<C28467BFf<m>> imDetect = messageDetectApi4.imDetect(j, 0L, j9, C30725C4b.LIZ(), LIZJ(msgDetectMessage), C113554cx.LJJJLIIL());
        if (imDetect == null) {
            return;
        }
        C1EW.LIZ(imDetect).LJJJLIIL(new AfS3S0200100_13(elapsedRealtime3, this, msgDetectMessage, 37), new AfS3S0200100_13(elapsedRealtime3, this, msgDetectMessage, 38));
    }

    public static BZI LIZIZ(MsgDetectMessage msgDetectMessage, long j, int i) {
        String str;
        BZI LIZ = C28787BRn.LIZ("livesdk_im_detect_api");
        LIZ.LJIJJ(Integer.valueOf(msgDetectMessage.detectType), "detect_type");
        LIZ.LJIJJ(Integer.valueOf(i), "condition_type");
        LIZ.LJIJJ(Long.valueOf(SystemClock.elapsedRealtime() - j), "delay");
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && room.getOwnerUserId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(str, "is_anchor");
        return LIZ;
    }

    public static int LIZ(C77904Uho c77904Uho, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        c77904Uho.getClass();
        if (z) {
            return 1;
        }
        if (z2) {
            return 2;
        }
        if (!z3) {
            return 0;
        }
        return 3;
    }
}
