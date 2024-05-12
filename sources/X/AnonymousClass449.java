package X;

import Y.ARunnableS37S0100000_1;
import android.app.Activity;
import android.os.Handler;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.service.BotTypingProcessInfoManager;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* renamed from: X.449, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass449 {
    public static boolean LJFF;
    public static Long LJI;
    public static boolean LJII;
    public final C99033ud LIZ;
    public final ChatRoomViewModel LIZIZ;
    public final String LIZJ;
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C1035344n.INSTANCE);
    public final C99873vz LJ = C96963rI.LJI().LIZ;

    public final void LIZLLL() {
        V1B.LJIIZILJ("remove typing delay task");
        ((Handler) this.LIZLLL.getValue()).removeCallbacksAndMessages(null);
        BotTypingProcessInfoManager.INSTANCE.stopPollingProcessInfo$im_base_release();
    }

    public final void LIZIZ(C89463fC c89463fC) {
        long j;
        for (C109544Rq c109544Rq : c89463fC.LIZ) {
            if (!c109544Rq.isSelf() && !C93793mB.LJIILIIL(c109544Rq)) {
                String conversationId = c109544Rq.getConversationId();
                o.LJIIIIZZ(conversationId, "message.conversationId");
                LJ(conversationId, false, false);
            }
            if (c109544Rq.isSelf() && !C44H.LIZ() && c109544Rq.getMsgStatus() == 5) {
                long msgId = c109544Rq.getMsgId();
                String conversationId2 = c109544Rq.getConversationId();
                o.LJIIIIZZ(conversationId2, "message.conversationId");
                Long l = C1036144v.LIZ().typingExceedTime;
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                LIZJ(msgId, j, conversationId2, false);
                LJI = Long.valueOf(System.currentTimeMillis());
            }
        }
    }

    public AnonymousClass449(C99033ud c99033ud, ChatRoomViewModel chatRoomViewModel) {
        this.LIZ = c99033ud;
        this.LIZIZ = chatRoomViewModel;
        this.LIZJ = c99033ud.getConversationId();
    }

    public final void LIZ(boolean z, EnumC1036244w enumC1036244w, boolean z2) {
        String clientMsgId;
        List<C109544Rq> LJ;
        EnumC1036244w enumC1036244w2 = enumC1036244w;
        C99873vz c99873vz = this.LJ;
        if (c99873vz != null) {
            c99873vz.LJFF = false;
        }
        if (z) {
            enumC1036244w2 = EnumC1036244w.EXCEED_TIME;
        }
        C57082Lw.LIZ.LIZJ("#TakoTypingEvent").postValue(new C1034944j(this.LIZJ, false, enumC1036244w2, z2, null));
        ChatRoomViewModel chatRoomViewModel = this.LIZIZ;
        C1032443k event = C1032443k.LIZ;
        chatRoomViewModel.getClass();
        o.LJIIIZ(event, "event");
        chatRoomViewModel.LJLLLL.onNext(event);
        LIZLLL();
        LJFF = false;
        LJII = false;
        C109544Rq c109544Rq = null;
        LJI = null;
        if (z) {
            C97313rr LJIIIIZZ = C96963rI.LJIIIIZZ();
            C99033ud sessionInfo = this.LIZ;
            C99873vz c99873vz2 = this.LJ;
            if (c99873vz2 != null && (LJ = c99873vz2.LJ()) != null) {
                c109544Rq = (C109544Rq) ORZ.LJLLLL(LJ);
            }
            LJIIIIZZ.getClass();
            o.LJIIIZ(sessionInfo, "sessionInfo");
            Activity topActivity = ActivityStack.getTopActivity();
            if (topActivity == null) {
                return;
            }
            AnonymousClass114.LIZ(topActivity, R.string.cng);
            if (c109544Rq != null && c109544Rq.isSelf()) {
                clientMsgId = c109544Rq.getUuid();
            } else {
                clientMsgId = "";
            }
            String enterFrom = sessionInfo.getEnterFromForMob();
            String enterMethod = sessionInfo.getEnterMethod();
            o.LJIIIIZZ(clientMsgId, "clientMsgId");
            C85323Wm onEventV3 = C772831o.LIZ();
            o.LJIIIZ(enterFrom, "enterFrom");
            o.LJIIIZ(enterMethod, "enterMethod");
            o.LJIIIZ(onEventV3, "onEventV3");
            C1HQ LIZJ = HXX.LIZJ("enter_from", enterFrom, "enter_method", enterMethod);
            LIZJ.put("query_message_id", clientMsgId);
            LIZJ.put("process_id", C3Y4.LIZJ);
            onEventV3.LIZIZ("tikbot_client_response_timeout", LIZJ);
        }
    }

    public final void LJ(String str, boolean z, boolean z2) {
        if (!o.LJ(this.LIZJ, str)) {
            return;
        }
        LIZ(z, null, z2);
    }

    public final void LIZJ(long j, long j2, String str, boolean z) {
        if (ActivityStack.getTopActivity() != null && !z) {
            try {
                if (!C2NU.LIZ.LIZIZ()) {
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        if (!o.LJ(this.LIZJ, str)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C99873vz c99873vz = this.LJ;
        if (c99873vz != null) {
            c99873vz.LJFF = true;
            c99873vz.LJI = currentTimeMillis;
            ((C109544Rq) c99873vz.LIZLLL.getValue()).setUuid(UUID.randomUUID().toString());
        }
        C57082Lw.LIZ.LIZJ("#TakoTypingEvent").postValue(new C1034944j(str, true, null, z, Long.valueOf(j2)));
        ChatRoomViewModel chatRoomViewModel = this.LIZIZ;
        C1032443k event = C1032443k.LIZ;
        chatRoomViewModel.getClass();
        o.LJIIIZ(event, "event");
        chatRoomViewModel.LJLLLL.onNext(event);
        String valueOf = String.valueOf(j);
        LIZLLL();
        Handler handler = (Handler) this.LIZLLL.getValue();
        ARunnableS37S0100000_1 aRunnableS37S0100000_1 = new ARunnableS37S0100000_1(this, 144);
        o.LJIIIZ(handler, "<this>");
        handler.postDelayed(aRunnableS37S0100000_1, j2);
        BotTypingProcessInfoManager.INSTANCE.startPollingProcessInfo$im_base_release(valueOf);
        LJFF = true;
    }
}
