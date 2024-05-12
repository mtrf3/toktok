package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.TrackMessage;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageTrackerSwitchSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.EventListener;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.o;

/* renamed from: X.CiQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32078CiQ implements EventListener {
    public final AtomicLong LIZ = new AtomicLong();
    public final AtomicLong LIZIZ = new AtomicLong();
    public final AtomicLong LIZJ = new AtomicLong();

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onMessageConsumed(OnMessageListener onMessageListener, IMessage iMessage) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onPreDispatchMessage(IMessage iMessage) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onPreDispatchMessages(List<IMessage> list) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onImFetchStarted() {
        this.LIZIZ.set(SystemClock.uptimeMillis());
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onImFetchSucceeded() {
        if (this.LIZIZ.get() > 0) {
            C0K2.LJIIIZ(0, SystemClock.uptimeMillis() - this.LIZIZ.get(), "ttlive_im_fetch_status_all");
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onImPrefetchStarted() {
        this.LIZJ.set(SystemClock.uptimeMillis());
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onImPrefetchSucceeded() {
        if (this.LIZJ.get() > 0) {
            C0K2.LJIIIZ(0, SystemClock.uptimeMillis() - this.LIZJ.get(), "ttlive_im_prefetch_status_all");
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onReset() {
        this.LIZ.set(0L);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onRoomEntered() {
        this.LIZ.set(SystemClock.uptimeMillis());
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onWebSocketConnected() {
        if (!ORY.LJJIJIIJIL("ttlive_web_socket_connected", LiveMessageTrackerSwitchSetting.INSTANCE.getValue())) {
            return;
        }
        C32079CiR.LJIIL(0, "ttlive_web_socket_connected", new HashMap(C32079CiR.LIZ));
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onWebSocketDisconnected() {
        if (!ORY.LJJIJIIJIL("ttlive_web_socket_disconnected", LiveMessageTrackerSwitchSetting.INSTANCE.getValue())) {
            return;
        }
        C32079CiR.LJIIL(0, "ttlive_web_socket_disconnected", new HashMap(C32079CiR.LIZ));
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onConnectingWebSocket(int i) {
        if (i == 0 && this.LIZ.get() > 0) {
            BZI LIZ = C28787BRn.LIZ("livesdk_ws_start_connect_duration");
            LIZ.LJIIZILJ();
            LIZ.LJIJJ(Long.valueOf(SystemClock.uptimeMillis() - this.LIZ.get()), "duration");
            LIZ.LJJIIJZLJL();
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onDeduplicateInterceptorMessage(IMessage iMessage) {
        Object obj;
        String str;
        if (iMessage instanceof CR6) {
            CR6 cr6 = (CR6) iMessage;
            if (cr6.baseMessage != null) {
                String valueOf = String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
                java.util.Map map = (java.util.Map) DataChannelGlobal.LJLJJI.mv0(C29824BnA.class);
                if (map == null || (obj = map.get("anchor_id")) == null) {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                boolean LJ = o.LJ(valueOf, obj);
                OSZ[] oszArr = new OSZ[7];
                IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
                if (iHostAppContext != null) {
                    str = iHostAppContext.getServerDeviceId();
                } else {
                    str = null;
                }
                oszArr[0] = new OSZ("device_id", str);
                oszArr[1] = new OSZ("room_id", Long.valueOf(cr6.baseMessage.roomId));
                oszArr[2] = new OSZ("is_anchor", Integer.valueOf(LJ ? 1 : 0));
                oszArr[3] = new OSZ("msg_id", Long.valueOf(cr6.baseMessage.messageId));
                oszArr[4] = new OSZ("method", cr6.getMethodName());
                oszArr[5] = new OSZ("msg_from", Integer.valueOf(cr6.getMessageFrom()));
                oszArr[6] = new OSZ("msg_type", Integer.valueOf(C32072CiK.LIZJ(cr6.getGeneralMessageType()) ? 1 : 0));
                java.util.Map LJJL = C113554cx.LJJL(oszArr);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : LJJL.entrySet()) {
                    if (entry.getValue() != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                C0K2.LJII(1, "ttlive_im_message_duplicate_interceptor", linkedHashMap);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        if (new java.util.Random().nextDouble() < r2.p2pSamplingRate()) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0192  */
    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDispatchMessage(com.ss.ugc.live.sdk.message.data.IMessage r15) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32078CiQ.onDispatchMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onImFetchFailed(Throwable th) {
        String str;
        C276516r c276516r;
        if (this.LIZIZ.get() > 0) {
            C0K2.LJIIIZ(1, SystemClock.uptimeMillis() - this.LIZIZ.get(), "ttlive_im_fetch_status_all");
            OSZ[] oszArr = new OSZ[2];
            Integer num = null;
            if (th != null) {
                str = th.getMessage();
            } else {
                str = null;
            }
            oszArr[0] = new OSZ("error_msg", str);
            if ((th instanceof C276516r) && (c276516r = (C276516r) th) != null) {
                num = Integer.valueOf(c276516r.getErrorCode());
            }
            oszArr[1] = new OSZ("error_code", num);
            java.util.Map LJJL = C113554cx.LJJL(oszArr);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : LJJL.entrySet()) {
                if (entry.getValue() != null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            C0K2.LJII(1, "ttlive_im_fetch_status_error", linkedHashMap);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onImPrefetchFailed(Throwable th) {
        String str;
        C276516r c276516r;
        if (this.LIZJ.get() > 0) {
            C0K2.LJIIIZ(1, SystemClock.uptimeMillis() - this.LIZJ.get(), "ttlive_im_prefetch_status_all");
            OSZ[] oszArr = new OSZ[2];
            Integer num = null;
            if (th != null) {
                str = th.getMessage();
            } else {
                str = null;
            }
            oszArr[0] = new OSZ("error_msg", str);
            if ((th instanceof C276516r) && (c276516r = (C276516r) th) != null) {
                num = Integer.valueOf(c276516r.getErrorCode());
            }
            oszArr[1] = new OSZ("error_code", num);
            java.util.Map LJJL = C113554cx.LJJL(oszArr);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : LJJL.entrySet()) {
                if (entry.getValue() != null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            C0K2.LJII(1, "ttlive_im_prefetch_status_error", linkedHashMap);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onInterceptMessage(IMessage iMessage) {
        if (!ORY.LJJIJIIJIL("ttlive_intercept_message", LiveMessageTrackerSwitchSetting.INSTANCE.getValue())) {
            return;
        }
        HashMap hashMap = new HashMap(C32079CiR.LIZ);
        if (iMessage != null) {
            hashMap.put("message_id", Long.valueOf(iMessage.getMessageId()));
            hashMap.put("message_type", Integer.valueOf(iMessage.getGeneralMessageType()));
            hashMap.put("message_method", iMessage.getMethodName());
            hashMap.put("message_strategy", Integer.valueOf(iMessage.getMessageFrom()));
        }
        C32079CiR.LJIIL(0, "ttlive_intercept_message", hashMap);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onSwitchToHttp(String reason) {
        o.LJIIIZ(reason, "reason");
        if (!ORY.LJJIJIIJIL("ttlive_switch_to_http", LiveMessageTrackerSwitchSetting.INSTANCE.getValue())) {
            return;
        }
        HashMap hashMap = new HashMap(C32079CiR.LIZ);
        hashMap.put("reason", reason);
        C32079CiR.LJIIL(0, "ttlive_switch_to_http", hashMap);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onEnqueueMessage(List<? extends IMessage> list, List<? extends IMessage> list2) {
        Integer num;
        if (!ORY.LJJIJIIJIL("ttlive_enqueue_message", LiveMessageTrackerSwitchSetting.INSTANCE.getValue())) {
            return;
        }
        HashMap hashMap = new HashMap(C32079CiR.LIZ);
        Integer num2 = null;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        hashMap.put("total_size", num);
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (IMessage iMessage : list) {
                arrayList.add(new TrackMessage(Long.valueOf(iMessage.getMessageId()), Integer.valueOf(iMessage.getGeneralMessageType()), iMessage.getMethodName(), Integer.valueOf(iMessage.getMessageFrom())));
            }
        }
        hashMap.put("total_message_list", arrayList);
        if (list2 != null) {
            num2 = Integer.valueOf(list2.size());
        }
        hashMap.put("dispatch_size", num2);
        ArrayList arrayList2 = new ArrayList();
        if (list2 != null) {
            for (IMessage iMessage2 : list2) {
                arrayList2.add(new TrackMessage(Long.valueOf(iMessage2.getMessageId()), Integer.valueOf(iMessage2.getGeneralMessageType()), iMessage2.getMethodName(), Integer.valueOf(iMessage2.getMessageFrom())));
            }
        }
        hashMap.put("dispatch_message_list", arrayList2);
        C32079CiR.LJIIL(0, "ttlive_enqueue_message", hashMap);
    }
}
