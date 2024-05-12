package X;

import android.app.Activity;
import android.os.BaseBundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.NetworkService;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.internal.i;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui.DmViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatlist.data.LastMessageProperty;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMServiceProvider;
import com.ss.android.ugc.aweme.im.sdk.common.controller.websocket.IMBusinessWsPayload;
import com.ss.android.ugc.aweme.im.sdk.privacy.data.api.UserSettingService;
import com.ss.android.ugc.aweme.lego.RunnableIdleTask;
import djb.IDaS20S0000000_1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.3Yf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85773Yf implements InterfaceC76442zI {
    public static final C85773Yf LJLIL;
    public static final C64962gm LJLILLLLZI;
    public static InterfaceC83383Pa LJLJI;
    public static final AtomicBoolean LJLJJI;
    public static XKQ LJLJJL;

    static {
        C85773Yf c85773Yf = new C85773Yf();
        LJLIL = c85773Yf;
        LJLILLLLZI = C48841JEv.LIZ(C78613UtF.LIZ.plus(T2R.LJIIJJI()));
        LJLJJI = new AtomicBoolean(false);
        if (!C3YZ.LIZ()) {
            EventBus.LIZJ().LJIILJJIL(c85773Yf);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static void LIZLLL() {
        try {
            C62822Ol8 c62822Ol8 = DSG.LJII;
            if (((Boolean) c62822Ol8.getValue()).booleanValue()) {
                Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
                o.LJIIIIZZ(LLLLIIIILLL, "currentThread()");
                LLLLIIIILLL.setPriority(3);
            }
            C115074fP.LJ(new C4ZB() { // from class: X.3Yg
                @Override // X.C4ZB
                public final void LIZIZ(C115104fS c115104fS) {
                }

                @Override // X.C4ZB
                public final void LIZJ(String str) {
                }

                @Override // X.C4ZB
                public final void LIZLLL(WsChannelMsg channelMsg) {
                    IMBusinessWsPayload iMBusinessWsPayload;
                    o.LJIIIZ(channelMsg, "channelMsg");
                    if (channelMsg.service != 1015 || channelMsg.method != 1) {
                        return;
                    }
                    if (!C80763Ey.LIZLLL()) {
                        C34B.LIZJ("IMBizWsBridge", "onReceivedMsg but not login");
                        return;
                    }
                    try {
                        byte[] LIZ = channelMsg.LIZ();
                        o.LJIIIIZZ(LIZ, "channelMsg.payload");
                        iMBusinessWsPayload = (IMBusinessWsPayload) C62070OXq.LIZ(IMBusinessWsPayload.class, new String(LIZ, PVC.LIZ));
                    } catch (Throwable th) {
                        C34B.LJ("IMBizWsBridge", th);
                    }
                    if (iMBusinessWsPayload != null) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("onReceivedMsg: ");
                        LIZ2.append(iMBusinessWsPayload.getAction());
                        C34B.LJI("IMBizWsBridge", X1D.LIZIZ(LIZ2));
                        if (iMBusinessWsPayload.getAction() == 1) {
                            C3YC.LJLIL.LJIIIZ(C3YM.WS_DIFF, false);
                            return;
                        }
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("Unknown action: ");
                        LIZ3.append(iMBusinessWsPayload.getAction());
                        C34B.LIZJ("IMBizWsBridge", X1D.LIZIZ(LIZ3));
                        return;
                    }
                    C34B.LIZJ("IMBizWsBridge", "onReceivedMsg payload null");
                }
            });
            ((C4Z2) C96423qQ.LIZ()).LIZIZ(new InterfaceC99673vf() { // from class: X.3VB
                @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
                public final void K7(int i, String str, List list) {
                }

                @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
                public final void M1(List<C109544Rq> list, boolean z) {
                }

                @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
                public final void T1(C109544Rq c109544Rq) {
                }

                @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
                public final void ea(C109544Rq c109544Rq, boolean z) {
                }

                @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
                public final void u7(int i, C109544Rq c109544Rq) {
                }

                @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
                public final void v0(List<C109544Rq> list, boolean z) {
                }

                @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
                public final void y(C109544Rq c109544Rq) {
                    if (c109544Rq == null || c109544Rq.getConversationId() == null) {
                        return;
                    }
                    C3Q9.LIZ.getClass();
                    C75782yE.LIZ();
                    C63120Opw LIZ = C4WC.LIZIZ.LIZ(c109544Rq.getConversationId());
                    if (LIZ == null || LIZ.getLastShowMessage() != null) {
                        return;
                    }
                    AnonymousClass325 anonymousClass325 = AnonymousClass325.LIZ;
                    String conversationId = c109544Rq.getConversationId();
                    anonymousClass325.getClass();
                    AnonymousClass325.LJII(conversationId);
                }

                @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
                public final void y5(int i, C63219OrX c63219OrX) {
                    if (c63219OrX == null) {
                        return;
                    }
                    AnonymousClass325.LIZJ.getClass();
                }

                @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
                public final void X8(java.util.Map map, int i, List list) {
                    Object obj;
                    String str;
                    String str2;
                    C109544Rq c109544Rq;
                    AwemeCardTemplate awemeCardTemplate;
                    AnonymousClass489.LIZ.getClass();
                    if (list != null && !list.isEmpty() && C52550Kjq.LIZ() && AnonymousClass489.LIZJ) {
                        synchronized (list) {
                            int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(list, 10));
                            if (LJJIIZ < 16) {
                                LJJIIZ = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
                            for (Object obj2 : list) {
                                linkedHashMap.put(Long.valueOf(((C109544Rq) obj2).getMsgId()), obj2);
                            }
                            ArrayList arrayList = new ArrayList();
                            for (Map.Entry entry : C113554cx.LJJLIIIJLLLLLLLZ(AnonymousClass489.LIZLLL).entrySet()) {
                                long longValue = ((Number) entry.getKey()).longValue();
                                List list2 = (List) entry.getValue();
                                if (linkedHashMap.keySet().contains(Long.valueOf(longValue)) && (c109544Rq = (C109544Rq) linkedHashMap.get(Long.valueOf(longValue))) != null && (awemeCardTemplate = (AwemeCardTemplate) C78963Uyt.LJJJ(c109544Rq)) != null) {
                                    Iterator it = list2.iterator();
                                    while (it.hasNext()) {
                                        C109544Rq LIZJ = AnonymousClass489.LIZ.LIZJ((C109544Rq) it.next(), c109544Rq.getScene(), awemeCardTemplate);
                                        if (LIZJ != null) {
                                            arrayList.add(LIZJ);
                                        }
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                C31F.LIZ.getClass();
                                C31G.LIZ();
                                C63164Oqe.LIZIZ.LIZIZ(arrayList, true);
                            }
                        }
                    }
                    if (!C114394eJ.LIZ() || list == null || list.isEmpty() || map == null || map.isEmpty()) {
                        return;
                    }
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C109544Rq c109544Rq2 = (C109544Rq) it2.next();
                        String str3 = c109544Rq2.getExt().get("a:is_violative");
                        if (str3 != null) {
                            java.util.Map map2 = (java.util.Map) map.get(c109544Rq2.getUuid());
                            if (map2 == null || (obj = map2.get("a:is_violative")) == null) {
                                obj = "false";
                            }
                            if (!o.LJ(str3, obj)) {
                                C85323Wm onEventV3 = C772831o.LIZ();
                                o.LJIIIZ(onEventV3, "onEventV3");
                                C3Q9.LIZ.getClass();
                                C75782yE.LIZ();
                                C63120Opw LIZ = C4WC.LIZIZ.LIZ(c109544Rq2.getConversationId());
                                if (LIZ != null) {
                                    if (LIZ.isStranger()) {
                                        str = "stranger";
                                    } else if (LIZ.getConversationType() == AbstractC63505Ow9.LIZ) {
                                        str = "private";
                                    } else if (LIZ.getConversationType() == AbstractC63505Ow9.LIZIZ) {
                                        str = "group";
                                    } else {
                                        str = "unknown";
                                    }
                                } else {
                                    str = null;
                                }
                                C1HQ LIZIZ = C48339Iy7.LIZIZ("chat_type", str);
                                LIZIZ.put("sender_id", String.valueOf(c109544Rq2.getSender()));
                                LIZIZ.put("message_type", C106674Gp.LJFF(c109544Rq2, null));
                                LIZIZ.put("conversation_id", c109544Rq2.getConversationId());
                                LIZIZ.put("violation_policy_category", c109544Rq2.getExt().get("a:violation_reason"));
                                if (C93793mB.LJIIZILJ(c109544Rq2)) {
                                    str2 = "violation";
                                } else {
                                    str2 = "appeal_success";
                                }
                                LIZIZ.put("moderation_type", str2);
                                onEventV3.LIZIZ("dm_moderate_message", LIZIZ);
                            }
                        }
                    }
                }

                @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
                public final void m4(int i, C109544Rq c109544Rq, C63540Owi c63540Owi) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("onSendMsg: ");
                    LIZ.append(i);
                    C34B.LIZIZ("GlobalMsgObserver", X1D.LIZIZ(LIZ));
                    if (c109544Rq == null) {
                        return;
                    }
                    if (C93793mB.LIZLLL(c109544Rq)) {
                        C85323Wm onEventV3 = C772831o.LIZ();
                        C85323Wm onEventV3Json = C772831o.LIZ();
                        C64962gm scope = C3V2.LIZ;
                        o.LJIIIZ(onEventV3, "onEventV3");
                        o.LJIIIZ(onEventV3Json, "onEventV3Json");
                        o.LJIIIZ(scope, "scope");
                        int msgStatus = c109544Rq.getMsgStatus();
                        if (msgStatus != 1) {
                            if (msgStatus == 2 || msgStatus == 3) {
                                XKX.LIZLLL(scope, null, null, new C3V6(c109544Rq, c63540Owi, onEventV3Json, null), 3);
                            }
                        } else {
                            XKX.LIZLLL(scope, null, null, new C3V1(c109544Rq, onEventV3, null), 3);
                        }
                    } else if (C93793mB.LJIILL(c109544Rq)) {
                        int msgStatus2 = c109544Rq.getMsgStatus();
                        if (msgStatus2 != 1) {
                            if (msgStatus2 == 2 || msgStatus2 == 3) {
                                XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZ, null, new C3V5(c109544Rq, c63540Owi, null), 2);
                            }
                        } else {
                            XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZ, null, new C3V4(c109544Rq, null), 2);
                        }
                    } else {
                        String localExtValue = c109544Rq.getLocalExtValue("process_id");
                        if (localExtValue != null && localExtValue.length() != 0) {
                            Iterator it = ((ConcurrentHashMap) C60622Zm.LIZ).entrySet().iterator();
                            while (it.hasNext()) {
                                if (o.LJ(localExtValue, ((BaseBundle) ((Map.Entry) it.next()).getValue()).getString("process_id"))) {
                                    it.remove();
                                }
                            }
                        }
                        if (c109544Rq.getMsgStatus() == 1) {
                            C48N source = C48N.REAL_MESSAGE;
                            o.LJIIIZ(source, "source");
                            C84933Uz c84933Uz = new C84933Uz(c109544Rq, source);
                            XIA dispatcher = C78613UtF.LIZJ;
                            o.LJIIIZ(dispatcher, "dispatcher");
                            XKX.LIZLLL(C48841JEv.LIZ(dispatcher), null, null, new C84923Uy(c109544Rq, c84933Uz, null), 3);
                        } else if (c109544Rq.getMsgStatus() == 2 || c109544Rq.getMsgStatus() == 3) {
                            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ.plus(new IDaS20S0000000_1(CoroutineExceptionHandler.LJJJJIZL, 9))), null, null, new C48H(c109544Rq, SystemClock.uptimeMillis(), c63540Owi, null), 3);
                        }
                        synchronized (C3VT.class) {
                            if (C3VT.LIZ == null || (c109544Rq.getMsgStatus() != 2 && c109544Rq.getMsgStatus() != 3)) {
                            }
                            C3VT.LIZ(c109544Rq);
                            if (!TextUtils.isEmpty(c109544Rq.getLocalExtValue("process_id"))) {
                                java.util.Map<String, C3VU> map = C3VT.LIZIZ;
                                C3VU c3vu = (C3VU) ((LinkedHashMap) map).get(c109544Rq.getLocalExtValue("process_id"));
                                if (c3vu != null && c3vu.LJLILLLLZI.isEmpty()) {
                                    map.remove(c109544Rq.getLocalExtValue("process_id"));
                                }
                            }
                            C3VU c3vu2 = C3VT.LIZ;
                            o.LJI(c3vu2);
                            if (c3vu2.LJLILLLLZI.isEmpty()) {
                                C3VT.LIZ = null;
                            }
                        }
                    }
                    C3WB LIZ2 = C84943Va.LIZ();
                    LIZ2.getClass();
                    if (c109544Rq.getMsgStatus() == 2) {
                        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ.plus(new IDaS20S0000000_1(CoroutineExceptionHandler.LJJJJIZL, 15)), null, new C3WA(c109544Rq, LIZ2, null), 2);
                    }
                    if (c109544Rq.getMsgStatus() == 2 && C115204fc.LIZ()) {
                        String uuid = c109544Rq.getUuid();
                        o.LJIIIIZZ(uuid, "message.uuid");
                        C34B.LIZIZ("GlobalActionExecutor", "invokeMessageSentSuccessActions");
                        C3Y2 c3y2 = new C3Y2("sent_msg_success");
                        C3VM c3vm = C115114fT.LJI;
                        if (c3vm != null) {
                            c3vm.LIZIZ(c3y2, false);
                        }
                        List LIZJ = ((C169706lK) C115114fT.LJFF.getValue()).LIZJ();
                        o.LJIIIIZZ(LIZJ, "sendMessageSuccessActionList.immutableList");
                        Iterator it2 = LIZJ.iterator();
                        while (it2.hasNext()) {
                            ((C3VG) it2.next()).LJLIL.invoke(uuid);
                        }
                        C3VM c3vm2 = C115114fT.LJI;
                        if (c3vm2 != null) {
                            c3vm2.LIZ(c3y2, C46B.LIZLLL);
                        }
                    }
                    C100483wy.LJFF("send_message_local_label", "1");
                    C100483wy.LJFF("send_message_local_time_stamp", String.valueOf(NetworkService.LJI().LIZ()));
                    C37R.LIZ.getClass();
                    if (C4YR.LIZIZ(c109544Rq, C99033ud.Companion) && c109544Rq.getMsgStatus() == 1) {
                        java.util.Map<String, Long> map2 = C37R.LIZLLL;
                        if (!map2.containsKey(c109544Rq.getUuid())) {
                            String uuid2 = c109544Rq.getUuid();
                            o.LJIIIIZZ(uuid2, "message.uuid");
                            map2.put(uuid2, Long.valueOf(SystemClock.elapsedRealtime()));
                        }
                    }
                    if (C4YL.SENT.getValue().contains(Integer.valueOf(c109544Rq.getMsgStatus()))) {
                        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C770330p(c109544Rq, null), 2);
                    }
                    if (c109544Rq.getMsgStatus() == 3) {
                        C106754Gx.LIZ(i, c109544Rq, c63540Owi);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:213:0x0444 A[LOOP:10: B:211:0x043e->B:213:0x0444, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:217:0x0460  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x029a A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:81:0x01a7 A[SYNTHETIC] */
                @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void x6(java.util.List<X.C109544Rq> r24, int r25, X.C107074Id r26) {
                    /*
                        Method dump skipped, instructions count: 1469
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C3VB.x6(java.util.List, int, X.4Id):void");
                }

                @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
                public final void v6(final C109544Rq c109544Rq, java.util.Map<String, List<C32H>> map, java.util.Map<String, List<C32H>> map2, Long l, Long l2) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("onGetModifyPropertyMsg -> \n            old:");
                    LIZ.append(map);
                    LIZ.append("\n            new:");
                    LIZ.append(map2);
                    C34B.LJI("GlobalMsgObserver", C38346F3e.LJJIJIIJIL(X1D.LIZIZ(LIZ)));
                    AnonymousClass325.LIZ.getClass();
                    final AnonymousClass326 anonymousClass326 = AnonymousClass325.LIZJ;
                    anonymousClass326.getClass();
                    if (c109544Rq == null) {
                        return;
                    }
                    String LIZ2 = C80763Ey.LIZ(false);
                    LIZ2.toString();
                    if (!TextUtils.equals(LIZ2, String.valueOf(c109544Rq.getSender()))) {
                        return;
                    }
                    java.util.Map LIZ3 = C32G.LIZ(map);
                    java.util.Map LIZ4 = C32G.LIZ(map2);
                    try {
                        java.util.Map LIZ5 = AnonymousClass322.LIZ(LIZ3);
                        java.util.Map LIZ6 = AnonymousClass322.LIZ(LIZ4);
                        ArrayList arrayList = new ArrayList();
                        List LIZIZ = AnonymousClass322.LIZIZ(LIZ5, LIZ6, AnonymousClass320.REMOVE);
                        List LIZIZ2 = AnonymousClass322.LIZIZ(LIZ6, LIZ5, AnonymousClass320.ADD);
                        if (LIZIZ != null) {
                            arrayList.addAll(LIZIZ);
                        }
                        if (LIZIZ2 != null) {
                            arrayList.addAll(LIZIZ2);
                        }
                        final C84274X5q c84274X5q = new C84274X5q(arrayList, Integer.valueOf(LIZ6.size()));
                        List list = (List) c84274X5q.LIZ;
                        if (list == null || list.isEmpty()) {
                            return;
                        }
                        final C31Q c31q = C31Q.LJIILLIIL;
                        c31q.getClass();
                        C3Q9.LIZ.getClass();
                        C75782yE.LIZ();
                        C4WC.LJIILLIIL(c109544Rq.getConversationId(), new InterfaceC86963bA<C63120Opw>() { // from class: X.31g
                            @Override // X.InterfaceC86963bA
                            public final void LIZIZ(C63623Oy3 c63623Oy3) {
                                StringBuilder LIZ7 = X1D.LIZ();
                                LIZ7.append("onGetModifyPropertyMsg add fail cause:");
                                LIZ7.append(c109544Rq.getMsgId());
                                LIZ7.append(",error:");
                                LIZ7.append(c63623Oy3);
                                C34B.LIZJ("DmHelper", X1D.LIZIZ(LIZ7));
                            }

                            @Override // X.InterfaceC86963bA
                            public final void onSuccess(C63120Opw c63120Opw) {
                                List list2;
                                C63120Opw c63120Opw2 = c63120Opw;
                                if (c63120Opw2 == null || c63120Opw2.isMute() || (list2 = (List) C84274X5q.this.LIZ) == null) {
                                    return;
                                }
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj : list2) {
                                    if (((C772131h) obj).LIZIZ == AnonymousClass320.ADD) {
                                        arrayList2.add(obj);
                                    }
                                }
                                ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
                                Iterator it = arrayList2.iterator();
                                while (it.hasNext()) {
                                    arrayList3.add(((C772131h) it.next()).LIZ);
                                }
                                if (arrayList3.isEmpty()) {
                                    return;
                                }
                                StringBuilder LIZ7 = X1D.LIZ();
                                LIZ7.append("onGetModifyPropertyMsg start:");
                                LIZ7.append(c109544Rq.getMsgId());
                                C34B.LJI("DmHelper", X1D.LIZIZ(LIZ7));
                                if (c31q.LJ().LIZJ == 2) {
                                    return;
                                }
                                XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZ), null, null, new C771831e(arrayList3, c31q, c109544Rq, c63120Opw2, null), 3);
                            }
                        });
                        C75782yE.LIZ();
                        C4WC.LJIILLIIL(c109544Rq.getConversationId(), new InterfaceC86963bA<C63120Opw>() { // from class: X.31y
                            @Override // X.InterfaceC86963bA
                            public final void LIZIZ(C63623Oy3 c63623Oy3) {
                                Integer num;
                                StringBuilder LIZ7 = X1D.LIZ();
                                LIZ7.append("saveLastProperty get Conversation onFailure: error={");
                                String str = null;
                                if (c63623Oy3 != null) {
                                    num = Integer.valueOf(c63623Oy3.LIZ);
                                } else {
                                    num = null;
                                }
                                LIZ7.append(num);
                                LIZ7.append(", ");
                                if (c63623Oy3 != null) {
                                    str = c63623Oy3.LIZJ;
                                }
                                LIZ7.append(str);
                                LIZ7.append('}');
                                C34B.LIZIZ("DmHelper", X1D.LIZIZ(LIZ7));
                            }

                            @Override // X.InterfaceC86963bA
                            public final void onSuccess(C63120Opw c63120Opw) {
                                Long l3;
                                String str;
                                String str2;
                                LiveData liveData;
                                String str3;
                                C63120Opw c63120Opw2 = c63120Opw;
                                if (c63120Opw2 == null) {
                                    return;
                                }
                                List LLILII = ORZ.LLILII(new Comparator() { // from class: X.31x
                                    @Override // java.util.Comparator
                                    public final int compare(Object obj, Object obj2) {
                                        C32H c32h = ((C772131h) obj).LIZ.LIZ;
                                        Long o1CreateTime = c32h.create_time;
                                        C32H c32h2 = ((C772131h) obj2).LIZ.LIZ;
                                        Long o2CreateTime = c32h2.create_time;
                                        Long l4 = c32h.create_time_v2;
                                        Long l5 = c32h2.create_time_v2;
                                        o.LJIIIIZZ(o1CreateTime, "o1CreateTime");
                                        long longValue = o1CreateTime.longValue();
                                        o.LJIIIIZZ(o2CreateTime, "o2CreateTime");
                                        if (longValue >= o2CreateTime.longValue()) {
                                            if (o1CreateTime.longValue() <= o2CreateTime.longValue()) {
                                                if (l4 != null && l5 != null) {
                                                    if (l4.longValue() >= l5.longValue()) {
                                                        if (l4.longValue() > l5.longValue()) {
                                                        }
                                                    }
                                                }
                                                return 0;
                                            }
                                            return 1;
                                        }
                                        return -1;
                                    }
                                }, (Iterable) C84274X5q.this.LIZ);
                                if (!(!LLILII.isEmpty())) {
                                    return;
                                }
                                AnonymousClass326 anonymousClass3262 = anonymousClass326;
                                C109544Rq c109544Rq2 = c109544Rq;
                                anonymousClass3262.getClass();
                                java.util.Map<String, String> localExt = c63120Opw2.getLocalExt();
                                if (localExt == null) {
                                    localExt = new LinkedHashMap<>();
                                }
                                C772131h c772131h = (C772131h) ORZ.LLFF(LLILII);
                                AnonymousClass325.LIZ.getClass();
                                LastMessageProperty LJ = AnonymousClass325.LJ(c63120Opw2);
                                int i = C773931z.LIZ[c772131h.LIZIZ.ordinal()];
                                if (i != 1) {
                                    if (i == 2) {
                                        if (LJ != null) {
                                            str3 = LJ.getIdempotent_id();
                                        } else {
                                            str3 = null;
                                        }
                                        if (TextUtils.equals(str3, c772131h.LIZ.LIZ.idempotent_id)) {
                                            StringBuilder LIZ7 = X1D.LIZ();
                                            LIZ7.append("saveLastProperty called ,remove ");
                                            LIZ7.append(c109544Rq2.getUuid());
                                            C34B.LIZIZ("DmHelper", X1D.LIZIZ(LIZ7));
                                            localExt.remove("a:s_latest_message_property");
                                        } else {
                                            StringBuilder LIZ8 = X1D.LIZ();
                                            LIZ8.append("saveLastProperty called ,not remove ");
                                            LIZ8.append(c109544Rq2.getUuid());
                                            C34B.LIZIZ("DmHelper", X1D.LIZIZ(LIZ8));
                                        }
                                    }
                                } else {
                                    C32H c32h = c772131h.LIZ.LIZ;
                                    Long l4 = c32h.create_time;
                                    if (LJ != null) {
                                        l3 = LJ.getCreate_at_in_seconds();
                                    } else {
                                        l3 = null;
                                    }
                                    if (o.LJ(l4, l3)) {
                                        String valueOf = String.valueOf(c32h.uid);
                                        if (LJ != null) {
                                            str2 = LJ.getSender_uid();
                                        } else {
                                            str2 = null;
                                        }
                                        if (o.LJ(valueOf, str2)) {
                                            return;
                                        }
                                    }
                                    Gson gson = AnonymousClass325.LIZIZ;
                                    String str4 = c32h.key;
                                    String str5 = c32h.idempotent_id;
                                    Long l5 = c32h.create_time;
                                    String str6 = c32h.value;
                                    Long l6 = c32h.uid;
                                    if (l6 != null) {
                                        str = String.valueOf(l6);
                                    } else {
                                        str = null;
                                    }
                                    String json = GsonProtectorUtils.toJson(gson, new LastMessageProperty(str4, str5, l5, str6, str, c32h.sec_uid, c32h.msgUuid, c109544Rq2, 0));
                                    StringBuilder LIZ9 = X1D.LIZ();
                                    LIZ9.append("saveLastProperty called ,add ");
                                    LIZ9.append(c109544Rq2.getUuid());
                                    C34B.LIZIZ("DmHelper", X1D.LIZIZ(LIZ9));
                                    localExt.put("a:s_latest_message_property", json);
                                }
                                c63120Opw2.setLocalExt(localExt);
                                String conversationId = c63120Opw2.getConversationId();
                                o.LJIIIIZZ(conversationId, "conversationId");
                                ViewModel viewModel = null;
                                C81273Gx.LIZ(conversationId).LJIJJ(localExt, null);
                                Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                                if (LJIIIIZZ instanceof ActivityC45651qj) {
                                    viewModel = ViewModelProviders.of((ActivityC45651qj) LJIIIIZZ).get(DmViewModel.class);
                                }
                                DmViewModel dmViewModel = (DmViewModel) viewModel;
                                if (dmViewModel == null || (liveData = (LiveData) dmViewModel.LJLIL.getValue()) == null) {
                                    return;
                                }
                                liveData.postValue(conversationId);
                            }
                        });
                    } catch (Exception e) {
                        C36922EeM.LIZ(e);
                    }
                }
            });
            C56672Kh.LIZ().LIZLLL("cold_boot_init_im");
            C4Z2.LJIILLIIL();
            C106754Gx c106754Gx = C106754Gx.LJLIL;
            C115074fP.LJ(c106754Gx);
            C4ZL.LIZ();
            C4ZG.LLLLZ(c106754Gx);
            C56672Kh.LIZ().LJFF(SystemClock.uptimeMillis(), "cold_boot_init_im");
            if (((Boolean) c62822Ol8.getValue()).booleanValue()) {
                Thread LLLLIIIILLL2 = C16880lQ.LLLLIIIILLL();
                o.LJIIIIZZ(LLLLIIIILLL2, "currentThread()");
                C35801E3h.LJIIJ(LLLLIIIILLL2);
            }
        } catch (Exception e) {
            C34B.LIZLLL("AwemeImManager", "initInSubThread error", e);
        }
    }

    public static void LIZIZ() {
        if ((C33778DNm.LIZ() & 512) == 512) {
            C36089EEj c36089EEj = new C36089EEj(false, false);
            c36089EEj.LIZIZ(new RunnableIdleTask(new Runnable() { // from class: X.3Yh
                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ;
                    try {
                        C85773Yf.LIZLLL();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            }, "InitInSubThreadTask"), true);
            c36089EEj.LIZJ();
            return;
        }
        i.LIZJ(new Runnable() { // from class: X.3Yi
            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    C85773Yf.LIZLLL();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public static void LJ() {
        boolean z;
        if (C80763Ey.LIZLLL()) {
            long LIZIZ = C36L.LIZIZ();
            if (LIZIZ != C80993Fv.LIZ().LIZIZ.getLong("userid", -1L)) {
                z = true;
            } else {
                z = false;
            }
            C80993Fv.LIZ().LIZIZ.edit().putLong("userid", LIZIZ).commit();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("refresh login: true, user changed ");
            LIZ.append(z);
            C34B.LIZIZ("AwemeImManager", X1D.LIZIZ(LIZ));
            if (z) {
                C3YC.LJLIL.LJIIIZ(C3YM.COLDUP_FULL, true);
            }
            IMServiceProvider.INSTANCE.getFamiliarService().LIZLLL();
            UserSettingService.LIZ.getClass();
            if (C85813Yj.LIZIZ == null) {
                IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
                String str = EFJ.LIZJ;
                C85813Yj.LIZIZ = (UserSettingService) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, UserSettingService.class);
            }
            UserSettingService userSettingService = C85813Yj.LIZIZ;
            o.LJI(userSettingService);
            userSettingService.getUserSettings("").LJJIIJ(T16.LIZ()).LJJ(C78688UuS.LJLJJL);
            return;
        }
        C34B.LIZIZ("AwemeImManager", "refresh login: false");
        C80993Fv.LIZ().LIZIZ.edit().remove("userid").remove("token").commit();
        C80533Eb.LIZ();
    }

    public static void LIZJ(EnumC100693xJ scene) {
        XKQ xkq;
        o.LJIIIZ(scene, "scene");
        XKQ xkq2 = LJLJJL;
        if (xkq2 == null) {
            LJLJJL = XKX.LIZLLL(LJLILLLLZI, null, null, new C72222sU(null), 3);
            C100483wy.LIZLLL(true, scene);
        } else {
            if (xkq2.isActive() && (xkq = LJLJJL) != null && !xkq.isCompleted()) {
                C100483wy.LIZLLL(true, scene);
                XKQ xkq3 = LJLJJL;
                if (xkq3 != null) {
                    xkq3.LIZIZ(null);
                }
                LIZIZ();
                return;
            }
            C100483wy.LIZLLL(false, scene);
        }
    }

    @Override // X.InterfaceC76442zI
    public final void LIZ(C76512zP c76512zP) {
        C34B.LIZIZ("AwemeImManager", "NetworkStateInfo received");
        if (LJLJJI.get() && c76512zP.LJLILLLLZI == EnumC115234ff.CONNECTED && C80763Ey.LIZLLL()) {
            ((C4Z2) C96423qQ.LIZ()).LIZLLL();
        }
    }

    @QD3
    public final void onEvent(C76522zQ event) {
        o.LJIIIZ(event, "event");
        C34B.LIZIZ("AwemeImManager", "onEvent");
        if (LJLJJI.get() && event.LJLIL != 0 && C80763Ey.LIZLLL()) {
            C34B.LIZIZ("AwemeImManager", "pull message");
            C96423qQ.LIZ().LIZLLL();
        }
    }
}
