package X;

import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.im.sdk.chatlist.data.LastReadMessageReactionTimestamp;

/* renamed from: X.31w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C773631w {
    public static boolean LIZ(C63120Opw c63120Opw) {
        if (c63120Opw == null) {
            return false;
        }
        C82223Ko c82223Ko = C99033ud.Companion;
        String conversationId = c63120Opw.getConversationId();
        c82223Ko.getClass();
        if (C82223Ko.LIZ(conversationId) || c63120Opw.isMute()) {
            return false;
        }
        if ((C55888Lwa.LIZIZ.LJJI(true) && !u.LJJII(c63120Opw)) || c63120Opw.getUnreadCount() <= 0) {
            return false;
        }
        C109544Rq lastShowMessage = c63120Opw.getLastShowMessage();
        if (lastShowMessage != null && lastShowMessage.isSelf()) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(C109544Rq c109544Rq) {
        if (c109544Rq == null || c109544Rq.getReadStatus() == 1) {
            return false;
        }
        C31F.LIZ.getClass();
        C31G.LIZ();
        if (!C63162Oqc.LIZLLL(c109544Rq) || !C93793mB.LJII(null, c109544Rq)) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(C771931f c771931f) {
        C63120Opw c63120Opw;
        Object LIZ;
        long j;
        long j2;
        C32H c32h;
        Long l;
        Long l2;
        if (c771931f.LIZ != EnumC772331j.PROPERTY || (c63120Opw = c771931f.LIZLLL) == null) {
            return false;
        }
        try {
            LIZ = (LastReadMessageReactionTimestamp) C62070OXq.LIZ(LastReadMessageReactionTimestamp.class, c63120Opw.getLocalExt().get("a:s_last_read_message_reaction_timestamp"));
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        LastReadMessageReactionTimestamp lastReadMessageReactionTimestamp = (LastReadMessageReactionTimestamp) LIZ;
        if (lastReadMessageReactionTimestamp != null && (l2 = lastReadMessageReactionTimestamp.lastReadTime) != null) {
            j = l2.longValue();
        } else {
            j = -1;
        }
        AnonymousClass323 anonymousClass323 = c771931f.LJ;
        if (anonymousClass323 == null || (c32h = anonymousClass323.LIZ) == null || (l = c32h.create_time_v2) == null) {
            j2 = 0;
        } else {
            j2 = l.longValue();
        }
        if (!C93793mB.LJII(c63120Opw, c771931f.LIZJ) || j2 <= j) {
            return false;
        }
        return true;
    }
}
