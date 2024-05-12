package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.OrC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63198OrC {
    public static final HashMap<Long, C63193Or7> LIZ = new HashMap<>();

    public static C63193Or7 LIZ(long j) {
        C63193Or7 c63193Or7 = new C63193Or7(j);
        LIZ.put(Long.valueOf(j), c63193Or7);
        return c63193Or7;
    }

    public static C63193Or7 LIZIZ(long j) {
        return LIZ.get(Long.valueOf(j));
    }

    public static void LIZJ(C109544Rq c109544Rq) {
        C63193Or7 LIZIZ = LIZIZ(c109544Rq.getMsgId());
        if (LIZIZ == null) {
            LIZIZ = LIZ(c109544Rq.getMsgId());
        }
        long j = LIZIZ.LJFF;
        long j2 = LIZIZ.LJI;
        String uuid = c109544Rq.getUuid();
        o.LJIIIIZZ(uuid, "msg.uuid");
        long msgId = c109544Rq.getMsgId();
        int msgType = c109544Rq.getMsgType();
        String conversationId = c109544Rq.getConversationId();
        o.LJIIIIZZ(conversationId, "msg.conversationId");
        LJ(j, j2, uuid, msgId, msgType, conversationId, LIZIZ.LJIIIIZZ, LIZIZ.LJIIIZ, LIZIZ.LJIIJ, false);
        LIZ.remove(Long.valueOf(c109544Rq.getMsgId()));
    }

    public static void LIZLLL(C109544Rq msg) {
        o.LJIIIZ(msg, "msg");
        C63193Or7 LIZIZ = LIZIZ(msg.getMsgId());
        if (LIZIZ == null) {
            LIZIZ = LIZ(msg.getMsgId());
        }
        C63323OtD LIZJ = C63144OqK.LIZJ("imsdk_recieve_msg");
        LIZJ.LIZ(msg.getConversationId(), "conversation_id");
        LIZJ.LIZ(msg.getUuid(), "msg_uuid");
        LIZJ.LIZ(1, "result");
        LIZJ.LIZ(Integer.valueOf(msg.getMsgType()), "msg_type");
        LIZJ.LIZ(Boolean.valueOf(C63308Osy.LJI().LIZIZ().isAppBackground()), "is_background");
        LIZJ.LIZ(Boolean.valueOf(C63308Osy.LJI().LIZIZ().LJIL()), "net_connected");
        LIZJ.LIZ(Long.valueOf(LIZIZ.LJ), "recieve_cost_time");
        LIZJ.LIZ(Long.valueOf(LIZIZ.LIZIZ), "recieve_start_time");
        LIZJ.LIZ(Long.valueOf(LIZIZ.LIZLLL), "recieve_end_time");
        LIZJ.LIZ(Long.valueOf(LIZIZ.LIZJ), "send_start_time");
        LIZJ.LIZ(Integer.valueOf(LIZIZ.LJII), "pull_msg_reaseon");
        LIZJ.LIZ(Integer.valueOf(LIZIZ.LJIIIZ ? 1 : 0), "is_ws");
        C63308Osy.LJI().LIZLLL().getClass();
        LIZJ.LIZ(0, "ntp_ready");
        LIZJ.LIZ(LIZIZ.LJIIJ, "logid");
        LIZJ.LIZLLL();
    }

    public static void LJ(long j, long j2, String str, long j3, int i, String conversationId, boolean z, boolean z2, String logId, boolean z3) {
        o.LJIIIZ(conversationId, "conversationId");
        o.LJIIIZ(logId, "logId");
        C63323OtD c63323OtD = new C63323OtD();
        c63323OtD.LIZJ("imsdk_load_msg");
        c63323OtD.LIZ(conversationId, "conversation_id");
        c63323OtD.LIZ(str, "msg_uuid");
        c63323OtD.LIZ(Long.valueOf(j3), "msg_svr_id");
        c63323OtD.LIZ(1, "result");
        c63323OtD.LIZ(Integer.valueOf(i), "msg_type");
        c63323OtD.LIZ(Boolean.valueOf(C63308Osy.LJI().LIZIZ().isAppBackground()), "is_background");
        c63323OtD.LIZ(Boolean.valueOf(C63308Osy.LJI().LIZIZ().LJIL()), "net_connected");
        c63323OtD.LIZ(Boolean.valueOf(C63308Osy.LJI().LIZIZ().isWsConnected()), "is_ws_connected");
        c63323OtD.LIZ(Long.valueOf(j), "load_cost_time");
        c63323OtD.LIZ(Long.valueOf(j2), "total_cost_time");
        c63323OtD.LIZ(Integer.valueOf(z2 ? 1 : 0), "is_ws");
        c63323OtD.LIZ(Integer.valueOf(z ? 1 : 0), "is_discontinuous");
        C63308Osy.LJI().LIZLLL().getClass();
        c63323OtD.LIZ(0, "ntp_ready");
        c63323OtD.LIZ(logId, "logid");
        c63323OtD.LIZ(Integer.valueOf(z3 ? 1 : 0), "WITH_RECEIVE_BUFFER");
        c63323OtD.LIZLLL();
        LIZ.remove(Long.valueOf(j3));
    }
}
