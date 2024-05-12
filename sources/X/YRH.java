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
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YRH implements IMessageWsClient.Callback {
    public final /* synthetic */ YRI LIZ;

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
    public final void onWebSocketConnected() {
        Message obtainMessage;
        Handler handler;
        this.LIZ.LIZ.LIZ.LIZJ().log("MessagePortal", "onWebSocketConnected");
        this.LIZ.LJIILL(YRM.WS_CONNECTED);
        this.LIZ.LJIIIZ();
        this.LIZ.LJIIJ();
        YRI yri = this.LIZ;
        if (yri.LIZIZ.LJLJJLL) {
            if (yri.LIZLLL.isWsConnected()) {
                yri.LIZ.LIZ.LIZJ().log("MessagePortal", "trigger heartbeat timer");
                yri.LJIIJJI();
                Handler handler2 = yri.LJIIZILJ;
                if (handler2 != null && (obtainMessage = handler2.obtainMessage(110)) != null && (handler = yri.LJIIZILJ) != null) {
                    handler.sendMessage(obtainMessage);
                }
            }
        } else {
            yri.LJIILIIL();
        }
        Iterator it = ((CopyOnWriteArrayList) this.LIZ.LIZ.LIZ.LJI().LIZ).iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).onWebSocketConnected();
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
    public final void onWebSocketDisconnected() {
        long j;
        this.LIZ.LJIILL(YRM.HTTP);
        YRI yri = this.LIZ;
        yri.LJIIL++;
        MessageMonitor LIZJ = yri.LIZ.LIZ.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onWebSocketDisconnected, ws connect failed count is ");
        LIZ.append(this.LIZ.LJIIL);
        LIZJ.log("MessagePortal", X1D.LIZIZ(LIZ));
        this.LIZ.LJIIJJI();
        this.LIZ.LJIIJ();
        this.LIZ.LJIIIZ();
        Iterator it = ((CopyOnWriteArrayList) this.LIZ.LIZ.LIZ.LJI().LIZ).iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).onWebSocketDisconnected();
        }
        this.LIZ.LIZLLL.disconnectFromWebSocket("ws_disconnect_re_determine");
        Handler handler = this.LIZ.LJIIZILJ;
        if (handler != null && handler.hasMessages(109)) {
            return;
        }
        YRI yri2 = this.LIZ;
        if (yri2.LJI > 0) {
            j = yri2.LJI;
        } else {
            j = 1000;
        }
        MessageMonitor LIZJ2 = this.LIZ.LIZ.LIZ.LIZJ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("re determine message strategy ");
        LIZ2.append(j);
        LIZJ2.log("MessagePortal", X1D.LIZIZ(LIZ2));
        Handler handler2 = this.LIZ.LJIIZILJ;
        if (handler2 != null) {
            handler2.sendEmptyMessageDelayed(109, j);
        }
        YMI ymi = this.LIZ.LJIJ;
        if (ymi != null) {
            ymi.LIZLLL();
        }
    }

    public YRH(YRI yri) {
        this.LIZ = yri;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
    public final void onHostWebSocketMessage(PayloadItem payloadItem) {
        Message obtainMessage;
        o.LJIIIZ(payloadItem, "payloadItem");
        this.LIZ.LIZ.LIZ.LIZJ().log("MessagePortal", "onHostWebSocketMessage");
        Handler handler = this.LIZ.LJIIZILJ;
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
        o.LJIIIZ(payloadItem, "payloadItem");
        MessageMonitor LIZJ = this.LIZ.LIZ.LIZ.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onWebSocketMessage: payload type is ");
        LIZ.append(payloadItem.getPayloadType());
        LIZJ.log("MessagePortal", X1D.LIZIZ(LIZ));
        if (TextUtils.equals(payloadItem.getPayloadType(), "msg")) {
            this.LIZ.LJIIIZ = System.currentTimeMillis();
            Handler handler = this.LIZ.LJIIZILJ;
            if (handler != null && (obtainMessage2 = handler.obtainMessage(107, payloadItem)) != null) {
                obtainMessage2.sendToTarget();
                return;
            }
            return;
        }
        if (TextUtils.equals(payloadItem.getPayloadType(), "close")) {
            this.LIZ.LIZ.LIZ.LIZJ().log("MessagePortal", "onWebSocketMessage: payload type is close, fallback to http");
            this.LIZ.LJIILLIIL("service_close_cmd");
            return;
        }
        if (TextUtils.equals(payloadItem.getPayloadType(), "hb")) {
            YRI yri = this.LIZ;
            yri.getClass();
            try {
                String valueOf = String.valueOf(payloadItem.getSeqId());
                long j = yri.LJIILJJIL;
                long serverTime = payloadItem.getServerTime();
                long currentTimeMillis = System.currentTimeMillis();
                long j2 = currentTimeMillis - j;
                MessageMonitor LIZJ2 = yri.LIZ.LIZ.LIZJ();
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
                LIZJ2.log("MessagePortal", X1D.LIZIZ(LIZ2));
                if (!TextUtils.equals(valueOf, yri.LJIILL)) {
                    return;
                }
                YRJ yrj = yri.LIZIZ;
                if (yrj.LJLJJL) {
                    if (currentTimeMillis <= j) {
                        return;
                    }
                    if (j <= 0) {
                        return;
                    }
                    if (serverTime <= 0) {
                        return;
                    }
                    if (j2 > yrj.LJLJJI) {
                        return;
                    }
                } else {
                    if (currentTimeMillis <= j) {
                        return;
                    }
                    if (j <= 0) {
                        return;
                    }
                    if (serverTime <= 0) {
                        return;
                    }
                    if (serverTime < currentTimeMillis) {
                        return;
                    }
                    if (j2 > 1000) {
                        return;
                    }
                }
                yri.LIZLLL.setWebSocketServerTimeGap((serverTime + (j2 / j3)) - currentTimeMillis);
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        if (!TextUtils.equals(payloadItem.getPayloadType(), "uplink_im_gateway") || (ymi = this.LIZ.LJIJ) == null || (vld = ymi.LJII) == null || (obtainMessage = vld.obtainMessage(YMI.LJIIJJI, payloadItem)) == null) {
            return;
        }
        obtainMessage.sendToTarget();
    }

    public final void LIZ(long j, List list) {
        long j2;
        long currentTimeMillis = System.currentTimeMillis();
        YRI yri = this.LIZ;
        long j3 = currentTimeMillis - yri.LJIIIZ;
        if (j3 > 0) {
            yri.LJ.add(Long.valueOf(j3));
            if (this.LIZ.LJ.size() > 5) {
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
        this.LIZ.LJIIJ.remove(Integer.valueOf(i));
        YRI yri = this.LIZ;
        int i2 = yri.LJFF + 1;
        yri.LJFF = i2;
        if (i2 > 3) {
            j = 5000;
        } else {
            j = i2 * 1000;
        }
        MessageMonitor LIZJ = yri.LIZ.LIZ.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onApiError: ");
        LIZ.append(e);
        LIZ.append(". failed count: ");
        V10.LJFF(LIZ, this.LIZ.LJFF, ", retry after ", j);
        LIZJ.log("MessagePortal", X1D.LIZIZ(LIZ));
        if (i == MessageApiConstant.FetchRule.FETCH_DATA_FOR_WS_ALONGSIDE) {
            Handler handler = this.LIZ.LJIIZILJ;
            if (handler != null) {
                handler.sendEmptyMessageDelayed(113, j);
            }
        } else {
            this.LIZ.LJIILJJIL();
        }
        Iterator it = ((CopyOnWriteArrayList) this.LIZ.LIZ.LIZ.LJI().LIZ).iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).onImFetchFailed(e);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
    public final void onHostWebSocketPayloadDecoded(ProtoApiResult result, boolean z) {
        Integer num;
        o.LJIIIZ(result, "result");
        YRI yri = this.LIZ;
        long j = result.dimension;
        MessageMonitor LIZJ = yri.LIZ.LIZ.LIZJ();
        StringBuilder LIZJ2 = V10.LIZJ("checkDimensionValid, result dimension: ", j, ", portal dimension: ");
        LIZJ2.append(yri.LIZ.LIZ.context().LIZJ);
        LIZJ.log("MessagePortal", X1D.LIZIZ(LIZJ2));
        if (j == 0 || yri.LIZ.LIZ.context().LIZJ == j) {
            MessageMonitor LIZJ3 = this.LIZ.LIZ.LIZ.LIZJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onHostWebSocketPayloadDecoded, cursor: ");
            LIZ.append(this.LIZ.LJIIIIZZ);
            LIZ.append(", fetch_interval: ");
            LIZ.append(this.LIZ.LJI);
            LIZ.append(", timestamp: ");
            LIZ.append(this.LIZ.LJII);
            LIZ.append(", size: ");
            List<IMessage> list = result.messages;
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            LIZ.append(num);
            LIZ.append(", heartbeat duration is ");
            LIZ.append(this.LIZ.LJIIJJI);
            LIZJ3.log("MessagePortal", X1D.LIZIZ(LIZ));
            List<IMessage> list2 = result.messages;
            o.LJIIIIZZ(list2, "result.messages");
            LIZ(result.delayTimeBeforeDispatch, list2);
            return;
        }
        this.LIZ.LIZ.LIZ.LIZJ().log("MessagePortal", "onHostWebSocketPayloadDecoded, but checkDimensionValid false");
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
    public final void onWebSocketPayloadDecoded(ProtoApiResult result, boolean z) {
        Integer num;
        Message obtainMessage;
        o.LJIIIZ(result, "result");
        YRI yri = this.LIZ;
        String str = result.cursor;
        o.LJIIIIZZ(str, "result.cursor");
        yri.LJIIIIZZ = str;
        YRI yri2 = this.LIZ;
        long j = result.fetchInterval;
        yri2.LIZ.LIZ.context().LIZLLL = j;
        yri2.LJI = j;
        this.LIZ.LJII = result.now;
        this.LIZ.LJIIJJI = Math.max(10L, result.heartbeatDuration);
        MessageMonitor LIZJ = this.LIZ.LIZ.LIZ.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onWebSocketPayloadDecoded, cursor: ");
        LIZ.append(this.LIZ.LJIIIIZZ);
        LIZ.append(", fetch_interval: ");
        LIZ.append(this.LIZ.LJI);
        LIZ.append(", timestamp: ");
        LIZ.append(this.LIZ.LJII);
        LIZ.append(", size: ");
        List<IMessage> list = result.messages;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(", heartbeat duration is ");
        LIZ.append(this.LIZ.LJIIJJI);
        LIZJ.log("MessagePortal", X1D.LIZIZ(LIZ));
        List<IMessage> list2 = result.messages;
        o.LJIIIIZZ(list2, "result.messages");
        LIZ(result.delayTimeBeforeDispatch, list2);
        if (TextUtils.equals(result.payloadType, "msg") && result.needAck) {
            MessageMonitor LIZJ2 = this.LIZ.LIZ.LIZ.LIZJ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onWebSocketPayloadDecoded, need send ack: ");
            LIZ2.append(result.getFormatAckInfo());
            LIZJ2.log("MessagePortal", X1D.LIZIZ(LIZ2));
            Handler handler = this.LIZ.LJIIZILJ;
            if (handler != null && (obtainMessage = handler.obtainMessage(108, result)) != null) {
                obtainMessage.sendToTarget();
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
    public final void onApiSuccess(ProtoApiResult result, int i, boolean z) {
        long size;
        Message obtainMessage;
        Handler handler;
        Message obtainMessage2;
        o.LJIIIZ(result, "result");
        this.LIZ.LJIIJ.remove(Integer.valueOf(i));
        YRI yri = this.LIZ;
        yri.LJFF = 0;
        String str = result.cursor;
        o.LJIIIIZZ(str, "result.cursor");
        yri.LJIIIIZZ = str;
        YRI yri2 = this.LIZ;
        long j = result.fetchInterval;
        yri2.LIZ.LIZ.context().LIZLLL = j;
        yri2.LJI = j;
        this.LIZ.LJII = result.now;
        List<IMessage> list = result.messages;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        MessageMonitor LIZJ = this.LIZ.LIZ.LIZ.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onApiSuccess, cursor: ");
        LIZ.append(this.LIZ.LJIIIIZZ);
        LIZ.append(", fetch_interval: ");
        LIZ.append(this.LIZ.LJI);
        LIZ.append(", timestamp: ");
        LIZ.append(this.LIZ.LJII);
        LIZJ.log("MessagePortal", C132805Jc.LIZLLL(LIZ, ", size: ", size, LIZ));
        List<IMessage> list2 = result.messages;
        o.LJIIIIZZ(list2, "result.messages");
        LIZ(result.delayTimeBeforeDispatch, list2);
        long j2 = 1000;
        if (i == MessageApiConstant.FetchRule.FETCH_DATA_FOR_WS_ALONGSIDE) {
            YRI yri3 = this.LIZ;
            if (yri3.LJI > 0) {
                j2 = yri3.LJI;
            }
            MessageMonitor LIZJ2 = this.LIZ.LIZ.LIZ.LIZJ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("call api after ");
            LIZ2.append(j2);
            LIZJ2.log("MessagePortal", X1D.LIZIZ(LIZ2));
            Handler handler2 = this.LIZ.LJIIZILJ;
            if (handler2 != null) {
                handler2.sendEmptyMessageDelayed(113, j2);
            }
        } else if (i == MessageApiConstant.FetchRule.FETCH_DATA_AND_DETERMINE_TYPE) {
            YRI yri4 = this.LIZ;
            int i2 = result.fetchType;
            String str2 = result.pushServer;
            java.util.Map<String, String> map = result.routeParams;
            yri4.getClass();
            if (MessageApiConstant.FetchType.WEBSOCKET == i2 && !TextUtils.isEmpty(str2)) {
                yri4.LJIILL(YRM.WS_CONNECTING);
                Handler handler3 = yri4.LJIIZILJ;
                if (handler3 != null && (obtainMessage2 = handler3.obtainMessage(105, map)) != null) {
                    obtainMessage2.sendToTarget();
                }
                Handler handler4 = yri4.LJIIZILJ;
                if (handler4 != null && (obtainMessage = handler4.obtainMessage(113)) != null && (handler = yri4.LJIIZILJ) != null) {
                    handler.sendMessageDelayed(obtainMessage, 1000L);
                }
            } else {
                yri4.LJIILL(YRM.HTTP);
                yri4.LJIILJJIL();
            }
        } else {
            this.LIZ.LJIILJJIL();
        }
        Iterator it = ((CopyOnWriteArrayList) this.LIZ.LIZ.LIZ.LJI().LIZ).iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).onImFetchSucceeded();
        }
    }
}
