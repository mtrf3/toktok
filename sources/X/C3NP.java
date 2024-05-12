package X;

import com.ss.android.ugc.aweme.im.sdk.chatlist.data.LastMessageProperty;
import com.ss.android.ugc.aweme.im.service.appsettings.UnreadCountForgivenessSettingsConfig;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3NP, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3NP implements C4WQ {
    public final C3NQ LIZ = new C3NQ("creatorUnreadCountCalculator");

    @Override // X.C4WQ
    public final void LIZ() {
        this.LIZ.LJIIIIZZ();
    }

    public final void LJ() {
        C3NQ c3nq = this.LIZ;
        c3nq.getClass();
        if (!C3TX.LIZ()) {
            return;
        }
        c3nq.LIZ();
        c3nq.LJFF = "";
        c3nq.LJI = "";
    }

    @Override // X.C4WQ
    public final long LIZIZ(C63120Opw c63120Opw) {
        List<C3NR> list;
        C3NR[] c3nrArr;
        long j;
        boolean LJI;
        C109544Rq lastShowMessage;
        C3NQ c3nq = this.LIZ;
        String conversationId = c63120Opw.getConversationId();
        o.LJIIIIZZ(conversationId, "conversation.conversationId");
        c3nq.getClass();
        if (C3TX.LIZ() && c3nq.LIZLLL().containsKey(conversationId) && (list = c3nq.LIZLLL().get(conversationId)) != null && (c3nrArr = (C3NR[]) list.toArray(new C3NR[0])) != null) {
            C3NR[] c3nrArr2 = (C3NR[]) Arrays.copyOf(c3nrArr, c3nrArr.length);
            Long l = (Long) ((java.util.Map) c3nq.LJ.getValue()).get(conversationId);
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            int i = (int) j;
            String LJJJJLL = ORY.LJJJJLL(Arrays.copyOf(c3nrArr2, c3nrArr2.length), "_", null, null, null, 62);
            if (c3nq.LJ().get(LJJJJLL) != null) {
                c3nq.LJ().put(LJJJJLL, Integer.valueOf(r0.intValue() - 1));
            }
            Integer num = c3nq.LJFF().get(LJJJJLL);
            if (num != null) {
                c3nq.LJFF().put(LJJJJLL, Integer.valueOf(num.intValue() - i));
            }
            c3nq.LIZLLL().remove(conversationId);
        }
        if (!C53405Kxd.LIZJ()) {
            LJI = C82473Ln.LJI(c63120Opw, new C43001GuD());
            boolean LIZ = C3U8.LIZ();
            if (!LJI) {
                C3NQ.LIZIZ(this.LIZ, c63120Opw, false, false, false, false, false, 124);
                return 0L;
            }
            if (c63120Opw.isMute() && (c63120Opw.isSingleChat() || c63120Opw.isGroupChat())) {
                C3NQ.LIZIZ(this.LIZ, c63120Opw, true, false, false, false, false, 122);
                return 0L;
            }
            if ((C3TE.LIZ() == 2 || C3TE.LIZ() == 3) && (lastShowMessage = c63120Opw.getLastShowMessage()) != null) {
                long createdAt = lastShowMessage.getCreatedAt();
                if (c63120Opw.getUnreadCount() > 0 && C81413Hl.LIZJ - createdAt > ((UnreadCountForgivenessSettingsConfig) C81423Hm.LIZIZ.getValue()).expiredDay * 86400000) {
                    C3NQ.LIZIZ(this.LIZ, c63120Opw, false, true, false, false, false, 118);
                    return 0L;
                }
            }
            if (c63120Opw.getCategory() == EnumC96103pu.USER_SET_CONVERSATION_CATEGORY_SECONDARY.getValue()) {
                C3NQ.LIZIZ(this.LIZ, c63120Opw, false, false, true, false, false, 110);
                return 0L;
            }
            C96963rI.LIZLLL().getClass();
            if (!C84563To.LIZ()) {
                C82223Ko c82223Ko = C99033ud.Companion;
                String conversationId2 = c63120Opw.getConversationId();
                c82223Ko.getClass();
                if (C82223Ko.LIZ(conversationId2)) {
                    C3NQ.LIZIZ(this.LIZ, c63120Opw, false, false, false, true, false, 94);
                    return 0L;
                }
            }
            if (LIZ && c63120Opw.isFiltered()) {
                C3NQ.LIZIZ(this.LIZ, c63120Opw, false, false, false, false, true, 62);
                return 0L;
            }
            C3NQ.LIZIZ(this.LIZ, c63120Opw, false, false, false, false, false, 126);
            return c63120Opw.getUnreadCount();
        }
        return 0L;
    }

    @Override // X.C4WQ
    public final boolean LIZJ(C63120Opw c63120Opw) {
        Integer mark_read;
        AnonymousClass325.LIZ.getClass();
        LastMessageProperty LJ = AnonymousClass325.LJ(c63120Opw);
        if (LJ == null || (mark_read = LJ.getMark_read()) == null || mark_read.intValue() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.C4WQ
    public final C78541Us5 LIZLLL(C63120Opw c63120Opw) {
        c63120Opw.getUnreadCount();
        c63120Opw.getConversationType();
        return new C78541Us5();
    }
}
