package X;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.ss.ugc.live.sdk.message.MessageApiConstant;
import com.ss.ugc.live.sdk.message.MessageMonitor;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.data.PayloadItem;
import com.ss.ugc.live.sdk.message.data.ProtoApiResult;
import com.ss.ugc.live.sdk.message.interfaces.EventListener;
import com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YRG implements IMessageWsClient.Callback {
    public final /* synthetic */ YRF LIZ;

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
    public final void onWebSocketConnected() {
        Handler handler;
        MessageMonitor LIZJ = this.LIZ.LIZ.LIZ.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onWebSocketConnected, current state: ");
        LIZ.append(this.LIZ.LIZ.LIZ.LIZIZ().LIZ);
        LIZJ.log("MessagePortalReuse", X1D.LIZIZ(LIZ));
        this.LIZ.LJIL(YRL.WS_CONNECTED);
        YRF yrf = this.LIZ;
        yrf.LJJIIJ++;
        yrf.LJIIIZ();
        this.LIZ.LJIIJ();
        this.LIZ.LJIJ();
        YRF yrf2 = this.LIZ;
        Handler handler2 = yrf2.LJIJ;
        if (handler2 != null && !handler2.hasMessages(116) && (handler = yrf2.LJIJ) != null) {
            handler.sendEmptyMessage(116);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LIZ.LIZ.LIZ.LJI().LIZ).iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).onWebSocketConnected();
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
    public final void onWebSocketDisconnected() {
        long j;
        this.LIZ.LJIL(YRL.HTTP);
        YRF yrf = this.LIZ;
        yrf.LJIILIIL++;
        yrf.LJIJJLI = 0L;
        MessageMonitor LIZJ = yrf.LIZ.LIZ.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onWebSocketDisconnected, ws connect failed count is ");
        LIZ.append(this.LIZ.LJIILIIL);
        LIZJ.log("MessagePortalReuse", X1D.LIZIZ(LIZ));
        this.LIZ.LJIIJJI();
        this.LIZ.LJIIJ();
        this.LIZ.LJIIIZ();
        this.LIZ.LJIIL();
        Iterator it = ((CopyOnWriteArrayList) this.LIZ.LIZ.LIZ.LJI().LIZ).iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).onWebSocketDisconnected();
        }
        this.LIZ.LIZ.LIZ.LIZJ().monitorWSReuseCount(this.LIZ.LJJIIZ);
        YRF yrf2 = this.LIZ;
        yrf2.LJJIIZ = 0;
        yrf2.LIZLLL.disconnectFromWebSocket("ws_disconnect_re_determine");
        Handler handler = this.LIZ.LJIJI;
        if (handler != null && handler.hasMessages(109)) {
            return;
        }
        YRF yrf3 = this.LIZ;
        if (yrf3.LJII > 0) {
            j = yrf3.LJII;
        } else {
            j = 1000;
        }
        MessageMonitor LIZJ2 = this.LIZ.LIZ.LIZ.LIZJ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("re determine message strategy ");
        LIZ2.append(j);
        LIZJ2.log("MessagePortalReuse", X1D.LIZIZ(LIZ2));
        Handler handler2 = this.LIZ.LJIJI;
        if (handler2 != null) {
            handler2.sendEmptyMessageDelayed(109, j);
        }
        YMI ymi = this.LIZ.LJIJJ;
        if (ymi != null) {
            ymi.LIZLLL();
        }
    }

    public YRG(YRF yrf) {
        this.LIZ = yrf;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
    public final void onHostWebSocketMessage(PayloadItem payloadItem) {
        Message obtainMessage;
        o.LJIIIZ(payloadItem, "payloadItem");
        this.LIZ.LIZ.LIZ.LIZJ().log("MessagePortalReuse", "onHostWebSocketMessage");
        Handler handler = this.LIZ.LJIJ;
        if (handler != null && (obtainMessage = handler.obtainMessage(111, payloadItem)) != null) {
            obtainMessage.sendToTarget();
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
    public final void onWebSocketMessage(PayloadItem payloadItem) {
        YMI ymi;
        VLD vld;
        Message obtainMessage;
        Message obtainMessage2;
        Handler handler;
        Message obtainMessage3;
        Message obtainMessage4;
        o.LJIIIZ(payloadItem, "payloadItem");
        MessageMonitor LIZJ = this.LIZ.LIZ.LIZ.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onWebSocketMessage: payload type is ");
        LIZ.append(payloadItem.getPayloadType());
        LIZJ.log("MessagePortalReuse", X1D.LIZIZ(LIZ));
        if (TextUtils.equals(payloadItem.getPayloadType(), "msg")) {
            this.LIZ.LJIIJ = System.currentTimeMillis();
            Handler handler2 = this.LIZ.LJIJ;
            if (handler2 != null && (obtainMessage4 = handler2.obtainMessage(107, payloadItem)) != null) {
                obtainMessage4.sendToTarget();
                return;
            }
            return;
        }
        if (TextUtils.equals(payloadItem.getPayloadType(), "close")) {
            this.LIZ.LIZ.LIZ.LIZJ().log("MessagePortalReuse", "onWebSocketMessage: payload type is close, fallback to http");
            this.LIZ.LJJ("service_close_cmd");
            return;
        }
        if (TextUtils.equals(payloadItem.getPayloadType(), "hb")) {
            YRF yrf = this.LIZ;
            yrf.getClass();
            try {
                String valueOf = String.valueOf(payloadItem.getSeqId());
                long j = yrf.LJIILL;
                long serverTime = payloadItem.getServerTime();
                long currentTimeMillis = System.currentTimeMillis();
                long j2 = currentTimeMillis - j;
                MessageMonitor LIZJ2 = yrf.LIZ.LIZ.LIZJ();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("sendPacketTime = ");
                LIZ2.append(j);
                LIZ2.append(", serverTime = ");
                LIZ2.append(serverTime);
                LIZ2.append(", receivePacketTime = ");
                LIZ2.append(currentTimeMillis);
                LIZ2.append(", serverTimeGap = ");
                long j3 = 2;
                LIZ2.append(((j2 / j3) + serverTime) - currentTimeMillis);
                LIZJ2.log("MessagePortalReuse", X1D.LIZIZ(LIZ2));
                if (!TextUtils.equals(valueOf, yrf.LJIILLIIL)) {
                    MessageMonitor LIZJ3 = yrf.LIZ.LIZ.LIZJ();
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("not match, discard packetSeqId: ");
                    LIZ3.append(valueOf);
                    LIZ3.append(", heartbeatSendPacketSeqId: ");
                    LIZ3.append(yrf.LJIILLIIL);
                    LIZJ3.log("MessagePortalReuse", X1D.LIZIZ(LIZ3));
                } else {
                    YRJ yrj = yrf.LIZIZ;
                    if (!yrj.LJLJJL ? !(currentTimeMillis <= j || j <= 0 || serverTime <= 0 || serverTime < currentTimeMillis || j2 > 1000) : !(currentTimeMillis <= j || j <= 0 || serverTime <= 0 || j2 > yrj.LJLJJI)) {
                        yrf.LIZLLL.setWebSocketServerTimeGap((serverTime + (j2 / j3)) - currentTimeMillis);
                    }
                }
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        if (TextUtils.equals(payloadItem.getPayloadType(), "im_enter_room_resp")) {
            this.LIZ.LJIIJ = System.currentTimeMillis();
            this.LIZ.LJIL(YRL.WS_CONNECTED_AND_ENTER_ROOM_RESP);
            this.LIZ.LJIIL();
            this.LIZ.LJIIIZ();
            MessageMonitor LIZJ4 = this.LIZ.LIZ.LIZ.LIZJ();
            long currentTimeMillis2 = System.currentTimeMillis();
            YRF yrf2 = this.LIZ;
            LIZJ4.monitorImEnterRoomDelay(currentTimeMillis2 - yrf2.LJJI, yrf2.LJJIII);
            YRF yrf3 = this.LIZ;
            yrf3.LJJIFFI++;
            Handler handler3 = yrf3.LJIJ;
            if (handler3 != null && (obtainMessage3 = handler3.obtainMessage(107, payloadItem)) != null) {
                obtainMessage3.sendToTarget();
            }
            if (payloadItem.getServerTime() > 0) {
                long currentTimeMillis3 = System.currentTimeMillis();
                this.LIZ.LIZLLL.setWebSocketServerTimeGap((((currentTimeMillis3 - this.LIZ.LJJI) / 2) + payloadItem.getServerTime()) - currentTimeMillis3);
            }
            YRF yrf4 = this.LIZ;
            if (!yrf4.LIZIZ.LJLJJLL || !yrf4.LIZLLL.isWsConnected()) {
                return;
            }
            yrf4.LIZ.LIZ.LIZJ().log("MessagePortalReuse", "trigger heartbeat timer");
            yrf4.LJIIJJI();
            Handler handler4 = yrf4.LJIJ;
            if (handler4 == null || (obtainMessage2 = handler4.obtainMessage(110)) == null || (handler = yrf4.LJIJ) == null) {
                return;
            }
            handler.sendMessage(obtainMessage2);
            return;
        }
        if (!TextUtils.equals(payloadItem.getPayloadType(), "uplink_im_gateway") || (ymi = this.LIZ.LJIJJ) == null || (vld = ymi.LJII) == null || (obtainMessage = vld.obtainMessage(YMI.LJIIJJI, payloadItem)) == null) {
            return;
        }
        obtainMessage.sendToTarget();
    }

    public final void LIZ(long j, List list) {
        long j2;
        long currentTimeMillis = System.currentTimeMillis();
        YRF yrf = this.LIZ;
        long j3 = currentTimeMillis - yrf.LJIIJ;
        if (j3 > 0) {
            ((CopyOnWriteArrayList) yrf.LJ).add(Long.valueOf(j3));
            if (((CopyOnWriteArrayList) this.LIZ.LJ).size() > 5) {
                ORS.LJJLJLI(this.LIZ.LJ);
            }
        }
        C87392YRo context = this.LIZ.LIZ.LIZ.context();
        Long l = (Long) ORZ.LLFZ(this.LIZ.LJ);
        if (l != null) {
            j2 = l.longValue();
        } else {
            j2 = 200;
        }
        context.LJ = j2;
        this.LIZ.LIZ.LIZ.LJFF().LJI(j, list);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
    public final void onApiError(Exception e, int i) {
        long j;
        o.LJIIIZ(e, "e");
        ((CopyOnWriteArraySet) this.LIZ.LJIIJJI).remove(Integer.valueOf(i));
        YRF yrf = this.LIZ;
        int i2 = yrf.LJFF + 1;
        yrf.LJFF = i2;
        if (i2 > 3) {
            j = 5000;
        } else {
            j = i2 * 1000;
        }
        MessageMonitor LIZJ = yrf.LIZ.LIZ.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onApiError: ");
        LIZ.append(e);
        LIZ.append(". failed count: ");
        V10.LJFF(LIZ, this.LIZ.LJFF, ", retry after ", j);
        LIZJ.log("MessagePortalReuse", X1D.LIZIZ(LIZ));
        if (i == MessageApiConstant.FetchRule.FETCH_DATA_FOR_WS_ALONGSIDE) {
            Handler handler = this.LIZ.LJIJI;
            if (handler != null) {
                handler.sendEmptyMessageDelayed(113, j);
            }
        } else {
            this.LIZ.LJIJJ();
        }
        Iterator it = ((CopyOnWriteArrayList) this.LIZ.LIZ.LIZ.LJI().LIZ).iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).onImFetchFailed(e);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
    public final void onHostWebSocketPayloadDecoded(ProtoApiResult result, boolean z) {
        Integer num;
        C30176Bsq c30176Bsq;
        o.LJIIIZ(result, "result");
        if (!this.LIZ.LJIILJJIL(result.dimension)) {
            this.LIZ.LIZ.LIZ.LIZJ().log("MessagePortalReuse", "onHostWebSocketPayloadDecoded, but checkDimensionValid false");
            return;
        }
        YRF yrf = this.LIZ;
        if (!yrf.LJJ && (c30176Bsq = yrf.LJI) != null && c30176Bsq.LJLIL) {
            yrf.LIZ.LIZ.LIZJ().log("MessagePortalReuse", "isStarted = false, resetCursor = true");
            return;
        }
        MessageMonitor LIZJ = yrf.LIZ.LIZ.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onHostWebSocketMessage, cursor: ");
        LIZ.append(this.LIZ.LJIIIZ);
        LIZ.append(", fetch_interval: ");
        LIZ.append(this.LIZ.LJII);
        LIZ.append(", timestamp: ");
        LIZ.append(this.LIZ.LJIIIIZZ);
        LIZ.append(", size: ");
        List<IMessage> list = result.messages;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(", heartbeat duration is ");
        LIZ.append(this.LIZ.LJIIL);
        LIZJ.log("MessagePortal", X1D.LIZIZ(LIZ));
        YRF yrf2 = this.LIZ;
        if (yrf2.LIZIZ.LJLJLJ.LJLIL) {
            if (yrf2.LJJ) {
                if (z) {
                    List<IMessage> list2 = result.messages;
                    o.LJIIIIZZ(list2, "result.messages");
                    LIZ(result.delayTimeBeforeDispatch, list2);
                    return;
                } else {
                    List<IMessage> list3 = yrf2.LIZLLL.decodeProtoApiResult(result).messages;
                    o.LJIIIIZZ(list3, "client.decodeProtoApiResult(result).messages");
                    LIZ(result.delayTimeBeforeDispatch, list3);
                    return;
                }
            }
            if (!yrf2.LJJIIZI) {
                return;
            }
            if (z) {
                List<IMessage> list4 = yrf2.LJJIJIIJI;
                List<IMessage> list5 = result.messages;
                o.LJIIIIZZ(list5, "result.messages");
                ((CopyOnWriteArrayList) list4).addAll(list5);
                return;
            }
            ((CopyOnWriteArrayList) yrf2.LJJIJIIJIL).add(result);
            return;
        }
        List<IMessage> list6 = result.messages;
        o.LJIIIIZZ(list6, "result.messages");
        LIZ(result.delayTimeBeforeDispatch, list6);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
    public final void onWebSocketPayloadDecoded(ProtoApiResult result, boolean z) {
        Integer num;
        Message obtainMessage;
        C30176Bsq c30176Bsq;
        o.LJIIIZ(result, "result");
        if (!this.LIZ.LJIILJJIL(result.dimension)) {
            this.LIZ.LIZ.LIZ.LIZJ().log("MessagePortalReuse", "onWebSocketPayloadDecoded, but checkDimensionValid false");
            return;
        }
        YRF yrf = this.LIZ;
        long j = result.enterUniqueId;
        MessageMonitor LIZJ = yrf.LIZ.LIZ.LIZJ();
        StringBuilder LIZJ2 = V10.LIZJ("checkEnterUniqueIdValid, result enterUniqueId: ", j, ", portal currentEnterUniqueId: ");
        LIZJ2.append(yrf.LJIJJLI);
        LIZJ.log("MessagePortalReuse", X1D.LIZIZ(LIZJ2));
        if (j == 0 || j == yrf.LJIJJLI) {
            if (!this.LIZ.LJIILL(result.isFirst)) {
                this.LIZ.LIZ.LIZ.LIZJ().log("MessagePortalReuse", "onWebSocketPayloadDecoded, but checkFirstMessageValid false");
                return;
            }
            YRF yrf2 = this.LIZ;
            if (!yrf2.LJJ && (c30176Bsq = yrf2.LJI) != null && c30176Bsq.LJLIL) {
                yrf2.LIZ.LIZ.LIZJ().log("MessagePortalReuse", "isStarted = false, resetCursor = true");
                return;
            }
            String str = result.cursor;
            o.LJIIIIZZ(str, "result.cursor");
            yrf2.LJIIIZ = str;
            YRF yrf3 = this.LIZ;
            long j2 = result.fetchInterval;
            yrf3.LIZ.LIZ.context().LIZLLL = j2;
            yrf3.LJII = j2;
            this.LIZ.LJIIIIZZ = result.now;
            this.LIZ.LJIIL = Math.max(10L, result.heartbeatDuration);
            MessageMonitor LIZJ3 = this.LIZ.LIZ.LIZ.LIZJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onWebSocketPayloadDecoded, cursor: ");
            LIZ.append(this.LIZ.LJIIIZ);
            LIZ.append(", fetch_interval: ");
            LIZ.append(this.LIZ.LJII);
            LIZ.append(", timestamp: ");
            LIZ.append(this.LIZ.LJIIIIZZ);
            LIZ.append(", size: ");
            List<IMessage> list = result.messages;
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            LIZ.append(num);
            LIZ.append(", heartbeat duration is ");
            LIZ.append(this.LIZ.LJIIL);
            LIZJ3.log("MessagePortalReuse", X1D.LIZIZ(LIZ));
            YRF yrf4 = this.LIZ;
            if (yrf4.LIZIZ.LJLJLJ.LJLIL) {
                if (yrf4.LJJ) {
                    if (z) {
                        List<IMessage> list2 = result.messages;
                        o.LJIIIIZZ(list2, "result.messages");
                        LIZ(result.delayTimeBeforeDispatch, list2);
                    } else {
                        List<IMessage> list3 = yrf4.LIZLLL.decodeProtoApiResult(result).messages;
                        o.LJIIIIZZ(list3, "client.decodeProtoApiResult(result).messages");
                        LIZ(result.delayTimeBeforeDispatch, list3);
                    }
                } else if (yrf4.LJJIIZI) {
                    if (z) {
                        List<IMessage> list4 = yrf4.LJJIJIIJI;
                        List<IMessage> list5 = result.messages;
                        o.LJIIIIZZ(list5, "result.messages");
                        ((CopyOnWriteArrayList) list4).addAll(list5);
                    } else {
                        ((CopyOnWriteArrayList) yrf4.LJJIJIIJIL).add(result);
                    }
                }
            } else {
                List<IMessage> list6 = result.messages;
                o.LJIIIIZZ(list6, "result.messages");
                LIZ(result.delayTimeBeforeDispatch, list6);
            }
            if ((TextUtils.equals(result.payloadType, "msg") || TextUtils.equals(result.payloadType, "im_enter_room_resp")) && result.needAck) {
                MessageMonitor LIZJ4 = this.LIZ.LIZ.LIZ.LIZJ();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onWebSocketPayloadDecoded, need send ack: ");
                LIZ2.append(result.getFormatAckInfo());
                LIZJ4.log("MessagePortalReuse", X1D.LIZIZ(LIZ2));
                Handler handler = this.LIZ.LJIJ;
                if (handler != null && (obtainMessage = handler.obtainMessage(108, result)) != null) {
                    obtainMessage.sendToTarget();
                    return;
                }
                return;
            }
            return;
        }
        this.LIZ.LIZ.LIZ.LIZJ().log("MessagePortalReuse", "onWebSocketPayloadDecoded, but checkEnterUniqueId false");
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
    public final void onApiSuccess(ProtoApiResult result, int i, boolean z) {
        long size;
        Message obtainMessage;
        Handler handler;
        Message obtainMessage2;
        C30176Bsq c30176Bsq;
        o.LJIIIZ(result, "result");
        ((CopyOnWriteArraySet) this.LIZ.LJIIJJI).remove(Integer.valueOf(i));
        if (!this.LIZ.LJIILJJIL(result.dimension)) {
            this.LIZ.LIZ.LIZ.LIZJ().log("MessagePortalReuse", "onApiSuccess, but checkDimensionValid false");
            return;
        }
        if (!this.LIZ.LJIILL(result.isFirst)) {
            this.LIZ.LIZ.LIZ.LIZJ().log("MessagePortalReuse", "onApiSuccess, but checkFirstMessageValid false");
            return;
        }
        YRF yrf = this.LIZ;
        if (!yrf.LJJ && (c30176Bsq = yrf.LJI) != null && c30176Bsq.LJLIL) {
            yrf.LIZ.LIZ.LIZJ().log("MessagePortalReuse", "isStarted = false, resetCursor = true");
            return;
        }
        yrf.LJFF = 0;
        String str = result.cursor;
        o.LJIIIIZZ(str, "result.cursor");
        yrf.LJIIIZ = str;
        YRF yrf2 = this.LIZ;
        long j = result.fetchInterval;
        yrf2.LIZ.LIZ.context().LIZLLL = j;
        yrf2.LJII = j;
        this.LIZ.LJIIIIZZ = result.now;
        List<IMessage> list = result.messages;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        MessageMonitor LIZJ = this.LIZ.LIZ.LIZ.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onApiSuccess, cursor: ");
        LIZ.append(this.LIZ.LJIIIZ);
        LIZ.append(", fetch_interval: ");
        LIZ.append(this.LIZ.LJII);
        LIZ.append(", timestamp: ");
        LIZ.append(this.LIZ.LJIIIIZZ);
        LIZJ.log("MessagePortalReuse", C132805Jc.LIZLLL(LIZ, ", size: ", size, LIZ));
        YRF yrf3 = this.LIZ;
        if (yrf3.LIZIZ.LJLJLJ.LJLIL) {
            if (yrf3.LJJ) {
                if (z) {
                    List<IMessage> list2 = result.messages;
                    o.LJIIIIZZ(list2, "result.messages");
                    LIZ(result.delayTimeBeforeDispatch, list2);
                } else {
                    List<IMessage> list3 = yrf3.LIZLLL.decodeProtoApiResult(result).messages;
                    o.LJIIIIZZ(list3, "client.decodeProtoApiResult(result).messages");
                    LIZ(result.delayTimeBeforeDispatch, list3);
                }
            } else if (yrf3.LJJIIZI) {
                if (z) {
                    List<IMessage> list4 = yrf3.LJJIJIIJI;
                    List<IMessage> list5 = result.messages;
                    o.LJIIIIZZ(list5, "result.messages");
                    ((CopyOnWriteArrayList) list4).addAll(list5);
                } else {
                    ((CopyOnWriteArrayList) yrf3.LJJIJIIJIL).add(result);
                }
            }
        } else {
            List<IMessage> list6 = result.messages;
            o.LJIIIIZZ(list6, "result.messages");
            LIZ(result.delayTimeBeforeDispatch, list6);
        }
        long j2 = 1000;
        if (i == MessageApiConstant.FetchRule.FETCH_DATA_FOR_WS_ALONGSIDE) {
            YRF yrf4 = this.LIZ;
            if (yrf4.LJII > 0) {
                j2 = yrf4.LJII;
            }
            MessageMonitor LIZJ2 = this.LIZ.LIZ.LIZ.LIZJ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("call api after ");
            LIZ2.append(j2);
            LIZJ2.log("MessagePortalReuse", X1D.LIZIZ(LIZ2));
            Handler handler2 = this.LIZ.LJIJI;
            if (handler2 != null) {
                handler2.sendEmptyMessageDelayed(113, j2);
            }
        } else if (i == MessageApiConstant.FetchRule.FETCH_DATA_AND_DETERMINE_TYPE) {
            YRF yrf5 = this.LIZ;
            int i2 = result.fetchType;
            java.util.Map<String, String> map = result.routeParams;
            MessageMonitor LIZJ3 = yrf5.LIZ.LIZ.LIZJ();
            StringBuilder LJ = C7MY.LJ("onStrategyDetermined, fetchType: ", i2, ", isStarted: ");
            LJ.append(yrf5.LJJ);
            LIZJ3.log("MessagePortalReuse", X1D.LIZIZ(LJ));
            if (yrf5.LJJ) {
                if (MessageApiConstant.FetchType.WEBSOCKET_REUSE == i2) {
                    yrf5.LJIL(YRL.WS_CONNECTING);
                    Handler handler3 = yrf5.LJIJ;
                    if (handler3 != null && (obtainMessage2 = handler3.obtainMessage(105, map)) != null) {
                        obtainMessage2.sendToTarget();
                    }
                    Handler handler4 = yrf5.LJIJI;
                    if (handler4 != null && (obtainMessage = handler4.obtainMessage(113)) != null && (handler = yrf5.LJIJI) != null) {
                        handler.sendMessageDelayed(obtainMessage, 1000L);
                    }
                } else {
                    yrf5.LJIL(YRL.HTTP);
                    yrf5.LJIJJ();
                }
            }
        } else {
            this.LIZ.LJIJJ();
        }
        Iterator it = ((CopyOnWriteArrayList) this.LIZ.LIZ.LIZ.LJI().LIZ).iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).onImFetchSucceeded();
        }
    }
}
