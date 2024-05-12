package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.3NQ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3NQ {
    public final String LIZ;
    public final C62822Ol8 LIZIZ;
    public final C62822Ol8 LIZJ;
    public final C62822Ol8 LIZLLL;
    public final C62822Ol8 LJ;
    public volatile String LJFF;
    public volatile String LJI;

    public final java.util.Map<String, List<C3NR>> LIZLLL() {
        return (java.util.Map) this.LIZLLL.getValue();
    }

    public final java.util.Map<String, Integer> LJ() {
        return (java.util.Map) this.LIZIZ.getValue();
    }

    public final java.util.Map<String, Integer> LJFF() {
        return (java.util.Map) this.LIZJ.getValue();
    }

    public final void LIZ() {
        if (!C3TX.LIZ()) {
            return;
        }
        LJ().clear();
        LJFF().clear();
        LIZLLL().clear();
        ((java.util.Map) this.LJ.getValue()).clear();
    }

    public final void LJIIIIZZ() {
        if (!C3TX.LIZ()) {
            return;
        }
        StringBuilder sb = new StringBuilder("reason to conversation count: ");
        for (Map.Entry<String, Integer> entry : LJ().entrySet()) {
            String key = entry.getKey();
            int intValue = entry.getValue().intValue();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(key);
            LIZ.append(':');
            LIZ.append(intValue);
            LIZ.append('-');
            sb.append(X1D.LIZIZ(LIZ));
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "debugString.toString()");
        StringBuilder sb3 = new StringBuilder("reason to unread count: ");
        for (Map.Entry<String, Integer> entry2 : LJFF().entrySet()) {
            String key2 = entry2.getKey();
            int intValue2 = entry2.getValue().intValue();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(key2);
            LIZ2.append(':');
            LIZ2.append(intValue2);
            LIZ2.append('-');
            sb3.append(X1D.LIZIZ(LIZ2));
        }
        String sb4 = sb3.toString();
        o.LJIIIIZZ(sb4, "debugString.toString()");
        if (!o.LJ(sb2, this.LJFF) || !o.LJ(sb4, this.LJI)) {
            C34B.LJI(this.LIZ, sb2);
            this.LJFF = sb2;
            C34B.LJI(this.LIZ, sb4);
            this.LJI = sb4;
        }
    }

    public C3NQ(String tag) {
        o.LJIIIZ(tag, "tag");
        this.LIZ = tag;
        this.LIZIZ = C221108m2.LIZIZ(C3NU.LJLIL);
        this.LIZJ = C221108m2.LIZIZ(C3NV.LJLIL);
        this.LIZLLL = C221108m2.LIZIZ(C3NS.LJLIL);
        this.LJ = C221108m2.LIZIZ(C3NT.LJLIL);
        this.LJFF = "";
        this.LJI = "";
    }

    public final void LJI(int i, String str, C3NR... c3nrArr) {
        int i2;
        ((java.util.Map) this.LJ.getValue()).put(str, Long.valueOf(i));
        LIZLLL().put(str, ORY.LJJZZIII(c3nrArr));
        if (i > 0) {
            String LJJJJLL = ORY.LJJJJLL(Arrays.copyOf(c3nrArr, c3nrArr.length), "_", null, null, null, 62);
            Integer num = LJ().get(LJJJJLL);
            int i3 = 0;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            LJ().put(LJJJJLL, Integer.valueOf(i2 + 1));
            Integer num2 = LJFF().get(LJJJJLL);
            if (num2 != null) {
                i3 = num2.intValue();
            }
            LJFF().put(LJJJJLL, Integer.valueOf(i + i3));
        }
    }

    public final void LJII(long j, String str, C3NR... c3nrArr) {
        LJI((int) j, str, (C3NR[]) Arrays.copyOf(c3nrArr, c3nrArr.length));
    }

    public static void LIZJ(C3NQ c3nq, C3L4 session, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        if ((i & 16) != 0) {
            z3 = false;
        }
        c3nq.getClass();
        o.LJIIIZ(session, "session");
        if (!C3TX.LIZ()) {
            return;
        }
        if (z) {
            int i2 = session.LJLLILLLL;
            String LJFF = session.LJFF();
            o.LJIIIIZZ(LJFF, "session.sessionID");
            c3nq.LJI(i2, LJFF, C3NR.MUTED);
            return;
        }
        if (z2) {
            int i3 = session.LJLLILLLL;
            String LJFF2 = session.LJFF();
            o.LJIIIIZZ(LJFF2, "session.sessionID");
            c3nq.LJI(i3, LJFF2, C3NR.TAKO);
            return;
        }
        if (z3) {
            int i4 = session.LJLLILLLL;
            String LJFF3 = session.LJFF();
            o.LJIIIIZZ(LJFF3, "session.sessionID");
            c3nq.LJI(i4, LJFF3, C3NR.OVER_THRESHOLD);
            return;
        }
        if (session.LJLLILLLL <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (session instanceof C3L3) {
            IMUser iMUser = ((C3L3) session).LLIIIZ;
            if (iMUser != null && iMUser.isBlock()) {
                arrayList.add(C3NR.BLOCKED);
            }
            if (C82503Lq.LIZ(((C3L3) session).LLIIIZ, session)) {
                arrayList.add(C3NR.RECOMMENDED);
            }
        }
        if (session instanceof C3L2) {
            arrayList.add(C3NR.MESSAGE_REQUEST);
        }
        if (arrayList.isEmpty()) {
            int i5 = session.LJLLILLLL;
            String LJFF4 = session.LJFF();
            o.LJIIIIZZ(LJFF4, "session.sessionID");
            c3nq.LJI(i5, LJFF4, C3NR.NORMAL);
            return;
        }
        int i6 = session.LJLLILLLL;
        String LJFF5 = session.LJFF();
        o.LJIIIIZZ(LJFF5, "session.sessionID");
        C3NR[] c3nrArr = (C3NR[]) arrayList.toArray(new C3NR[0]);
        c3nq.LJI(i6, LJFF5, (C3NR[]) Arrays.copyOf(c3nrArr, c3nrArr.length));
    }

    public static void LIZIZ(C3NQ c3nq, C63120Opw c63120Opw, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        boolean z6;
        if ((i & 2) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        if ((i & 16) != 0) {
            z3 = false;
        }
        if ((i & 32) != 0) {
            z4 = false;
        }
        if ((i & 64) != 0) {
            z5 = false;
        }
        c3nq.getClass();
        if (!C3TX.LIZ()) {
            return;
        }
        if (!z6) {
            long unreadCount = c63120Opw.getUnreadCount();
            String conversationId = c63120Opw.getConversationId();
            o.LJIIIIZZ(conversationId, "conversation.conversationId");
            c3nq.LJII(unreadCount, conversationId, C3NR.INVALID);
            return;
        }
        if (z) {
            long unreadCount2 = c63120Opw.getUnreadCount();
            String conversationId2 = c63120Opw.getConversationId();
            o.LJIIIIZZ(conversationId2, "conversation.conversationId");
            c3nq.LJII(unreadCount2, conversationId2, C3NR.MUTED);
            return;
        }
        if (z2) {
            long unreadCount3 = c63120Opw.getUnreadCount();
            String conversationId3 = c63120Opw.getConversationId();
            o.LJIIIIZZ(conversationId3, "conversation.conversationId");
            c3nq.LJII(unreadCount3, conversationId3, C3NR.OVER_THRESHOLD);
            return;
        }
        if (z3) {
            long unreadCount4 = c63120Opw.getUnreadCount();
            String conversationId4 = c63120Opw.getConversationId();
            o.LJIIIIZZ(conversationId4, "conversation.conversationId");
            c3nq.LJII(unreadCount4, conversationId4, C3NR.SECONDARY);
            return;
        }
        if (z4) {
            long unreadCount5 = c63120Opw.getUnreadCount();
            String conversationId5 = c63120Opw.getConversationId();
            o.LJIIIIZZ(conversationId5, "conversation.conversationId");
            c3nq.LJII(unreadCount5, conversationId5, C3NR.TAKO);
            return;
        }
        if (z5) {
            long unreadCount6 = c63120Opw.getUnreadCount();
            String conversationId6 = c63120Opw.getConversationId();
            o.LJIIIIZZ(conversationId6, "conversation.conversationId");
            c3nq.LJII(unreadCount6, conversationId6, C3NR.FILTERED);
            return;
        }
        if (c63120Opw.getUnreadCount() <= 0) {
            return;
        }
        long unreadCount7 = c63120Opw.getUnreadCount();
        String conversationId7 = c63120Opw.getConversationId();
        o.LJIIIIZZ(conversationId7, "conversation.conversationId");
        c3nq.LJII(unreadCount7, conversationId7, C3NR.NORMAL);
    }
}
