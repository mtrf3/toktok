package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;

/* renamed from: X.3Nm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82983Nm {
    public static final C82983Nm LIZ = new C82983Nm();
    public static final C82993Nn LIZIZ = new InterfaceC116924iO() { // from class: X.3Nn
        @Override // X.InterfaceC116924iO
        public final long LIZ(C63120Opw c63120Opw) {
            long j;
            C109544Rq lastShowMessage;
            EnumC96123pw fromValue;
            Object obj;
            if (c63120Opw == null) {
                return 0L;
            }
            C109544Rq lastShowMessage2 = c63120Opw.getLastShowMessage();
            if (lastShowMessage2 != null) {
                j = lastShowMessage2.getCreatedAt();
            } else {
                j = 0;
            }
            if (c63120Opw.isStickTop()) {
                long updatedTime = c63120Opw.getUpdatedTime();
                if (j < updatedTime) {
                    j = updatedTime;
                }
            }
            C82983Nm.LIZ.getClass();
            C82833Mx.LIZ.getClass();
            String str = "manual_set_conversation_update_time";
            if (C82833Mx.LIZIZ && (lastShowMessage = c63120Opw.getLastShowMessage()) != null && ((fromValue = EnumC96123pw.fromValue(lastShowMessage.getConvRankUpdateRule())) == EnumC96123pw.IgnoreAllRankUpdate || ((fromValue == EnumC96123pw.IgnoreSenderRankUpdate && lastShowMessage.isSelf()) || (fromValue == EnumC96123pw.IgnoreReceiverRankUpdate && !lastShowMessage.isSelf())))) {
                java.util.Map<String, String> localExt = c63120Opw.getLocalExt();
                C82223Ko c82223Ko = C99033ud.Companion;
                String conversationId = c63120Opw.getConversationId();
                c82223Ko.getClass();
                if (C82223Ko.LIZ(conversationId)) {
                    obj = "manual_set_conversation_update_time";
                } else {
                    obj = "s:last_non_ignore_rank_update_message_creation_time";
                }
                if (localExt.containsKey(obj)) {
                    java.util.Map<String, String> localExt2 = c63120Opw.getLocalExt();
                    C82223Ko c82223Ko2 = C99033ud.Companion;
                    String conversationId2 = c63120Opw.getConversationId();
                    c82223Ko2.getClass();
                    if (!C82223Ko.LIZ(conversationId2)) {
                        str = "s:last_non_ignore_rank_update_message_creation_time";
                    }
                    String str2 = localExt2.get(str);
                    if (str2 != null) {
                        j = CastLongProtector.parseLong(str2);
                    }
                }
            }
            long LJJJJIZL = C79004UzY.LJJJJIZL(c63120Opw);
            if (LJJJJIZL != 0) {
                j = LJJJJIZL;
            }
            if (j < 10000000000L) {
                j *= 1000;
            }
            AnonymousClass325.LIZ.getClass();
            long LIZLLL = AnonymousClass325.LIZLLL(AnonymousClass325.LJ(c63120Opw));
            if (LIZLLL >= j) {
                j = LIZLLL;
            }
            return (long) ((Math.pow(10.0d, 13.0d) * C78609UtB.LJJIL(c63120Opw)) + j);
        }
    };
}
