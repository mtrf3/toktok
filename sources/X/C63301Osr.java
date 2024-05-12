package X;

import Y.ARunnableS29S0200000_10;
import android.os.SystemClock;
import com.bytedance.im.core.proto.ConversationRecentMessage;
import com.bytedance.im.core.proto.GetRecentMessageRespBody;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.ResponseBody;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.Osr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63301Osr extends AbstractC63515OwJ<Boolean> {
    public final int LIZJ;
    public String LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;

    @Override // X.AbstractC63515OwJ
    public final boolean LJFF() {
        return true;
    }

    public static void LJIILL(C63303Ost c63303Ost) {
        HashSet hashSet = new HashSet();
        for (C63120Opw c63120Opw : c63303Ost.LIZ) {
            String conversationId = c63120Opw.getConversationId();
            hashSet.add(conversationId);
            LJIILJJIL(conversationId, c63120Opw, (List) ((LinkedHashMap) c63303Ost.LIZLLL).get(conversationId), (Integer) ((HashMap) c63303Ost.LIZJ).get(conversationId));
        }
        if (C63308Osy.LJI().LIZLLL().LJJIZ) {
            for (String str : c63303Ost.LIZIZ) {
                if (!hashSet.contains(str)) {
                    LJIILJJIL(str, null, (List) ((LinkedHashMap) c63303Ost.LIZLLL).get(str), null);
                }
            }
        }
        if (!((ArrayList) c63303Ost.LJ).isEmpty()) {
            C63308Osy.LJI().LIZIZ().LJIIZILJ();
        }
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        ResponseBody responseBody = c63622Oy2.LJLJL.body;
        if (responseBody != null && responseBody.get_recent_message_body != null) {
            return true;
        }
        return false;
    }

    public final void LJIILIIL(boolean z) {
        if (this.LJ == 0) {
            C63309Osz.LIZLLL().LIZIZ(this.LIZJ);
        }
        C63309Osz.LIZLLL().getClass();
        C63309Osz.LJI(z);
    }

    public final void LJIILLIIL(int i) {
        if (i != 9 && (C63308Osy.LJI().LIZLLL().LJZI || C63305Osv.LIZIZ().LIZJ() != 1)) {
            C63272OsO.LIZJ(4, i);
        }
        String LJFF = C63312Ot2.LJFF(i);
        int i2 = this.LIZJ;
        if (((CopyOnWriteArraySet) C63269OsL.LIZLLL).contains(Integer.valueOf(i2))) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("GetRecentMsgHandler pull, source:", LJFF, ", inbox:");
            LIZIZ.append(this.LIZJ);
            LIZIZ.append(", already doing, return");
            C63322OtC.LJFF(X1D.LIZIZ(LIZIZ));
            return;
        }
        this.LJ = i;
        this.LJIIIIZZ = SystemClock.uptimeMillis();
        C63291Osh LIZ = C63291Osh.LIZ();
        int i3 = this.LIZJ;
        LIZ.getClass();
        LJIIZILJ(C63291Osh.LJI(i3), LJFF);
    }

    public C63301Osr(int i, C63204OrI c63204OrI) {
        super(EnumC63625Oy5.GET_RECENT_MESSAGE.getValue(), c63204OrI);
        this.LJFF = 0;
        this.LJI = 0;
        this.LJII = 0;
        this.LJIIJ = 0L;
        this.LJIIJJI = 0L;
        this.LJIIL = 0L;
        this.LJIILIIL = 0L;
        this.LJIILJJIL = 0L;
        this.LJIILL = 0L;
        this.LJIILLIIL = 0L;
        this.LIZJ = i;
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        boolean z;
        C47922IrO.LIZ();
        this.LJIIJJI = (SystemClock.uptimeMillis() - this.LJIIIZ) + this.LJIIJJI;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (c63622Oy2.LJIIJ() && LJIIIZ(c63622Oy2)) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GetRecentMsgHandler handleResponse, seqId:");
        V1I.LIZJ(LIZ, c63622Oy2.LJLIL, ", success:", z);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        if (!z) {
            int i = this.LIZJ;
            ((CopyOnWriteArraySet) C63269OsL.LIZLLL).remove(Integer.valueOf(i));
            C63337OtR.LJII(c63622Oy2, false).LIZ();
            this.LJIILLIIL = (SystemClock.uptimeMillis() - uptimeMillis) + this.LJIILLIIL;
            C63272OsO.LIZLLL(true, false, SystemClock.uptimeMillis() - this.LJIIIIZZ, this.LJFF, 0, this.LJI, this.LJII, C63623Oy3.LIZ(c63622Oy2), this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJ, false);
            LIZLLL(Boolean.FALSE);
            LJIILIIL(false);
            return;
        }
        GetRecentMessageRespBody getRecentMessageRespBody = c63622Oy2.LJLJL.body.get_recent_message_body;
        this.LJIILLIIL = (SystemClock.uptimeMillis() - uptimeMillis) + this.LJIILLIIL;
        RunnableC63345OtZ.LIZLLL(new C63304Osu(this, getRecentMessageRespBody, c63622Oy2), new C63302Oss(this, SystemClock.uptimeMillis(), c63622Oy2, getRecentMessageRespBody), C63346Ota.LIZJ());
    }

    public final void LJIIZILJ(long j, String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        StringBuilder LIZIZ = C25620zW.LIZIZ("GetRecentMsgHandler pull, source:", str, ", inbox:");
        V10.LJFF(LIZIZ, this.LIZJ, ", version:", j);
        C63322OtC.LJFF(X1D.LIZIZ(LIZIZ));
        this.LIZLLL = str;
        int i = this.LIZJ;
        ((CopyOnWriteArraySet) C63269OsL.LIZLLL).add(Integer.valueOf(i));
        C63466OvW c63466OvW = new C63466OvW();
        c63466OvW.LJ = str;
        c63466OvW.LIZLLL = Long.valueOf(j);
        if (this.LJ == 0) {
            C63308Osy.LJI().LIZIZ().isNewUser();
        }
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJJLIIJ = c63466OvW.build();
        LJIIJJI(this.LIZJ, c89453Z8v.build(), null, new Object[0]);
        this.LJIIJ = (SystemClock.uptimeMillis() - uptimeMillis) + this.LJIIJ;
        this.LJIIIZ = SystemClock.uptimeMillis();
    }

    public final void LJIJI(C63303Ost c63303Ost, Long l) {
        long j;
        C63291Osh LIZ = C63291Osh.LIZ();
        int i = this.LIZJ;
        LIZ.getClass();
        long LJI = C63291Osh.LJI(i);
        if (l == null || l.longValue() <= LJI) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("GetRecentMsgHandler updateVersion version invalid, next:");
            if (l != null) {
                j = l.longValue();
            } else {
                j = -1;
            }
            LIZ2.append(j);
            LIZ2.append(", local:");
            LIZ2.append(LJI);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZ2));
            return;
        }
        C63291Osh LIZ3 = C63291Osh.LIZ();
        int i2 = this.LIZJ;
        long longValue = l.longValue();
        LIZ3.getClass();
        C63291Osh.LJIILJJIL(i2, longValue);
        c63303Ost.LJFF = l.longValue();
    }

    public final void LJIJ(C63303Ost c63303Ost, List<ConversationRecentMessage> list, String str) {
        Long l;
        C109544Rq c109544Rq;
        if (list == null || list.size() <= 0) {
            return;
        }
        C63291Osh.LIZ().getClass();
        int i = 0;
        for (ConversationRecentMessage conversationRecentMessage : list) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (conversationRecentMessage != null && (l = conversationRecentMessage.conversation_short_id) != null && l.longValue() > 0) {
                List<MessageBody> list2 = conversationRecentMessage.messages;
                if (!V1B.LJJZZIII(list2)) {
                    String str2 = ((MessageBody) ListProtector.get(list2, 0)).conversation_id;
                    ArrayList arrayList = new ArrayList();
                    Iterator<MessageBody> it = list2.iterator();
                    while (it.hasNext()) {
                        i++;
                        C63195Or9 LJIJ = C63192Or6.LJIJ(it.next(), false, C45243HpH.LIZ("s:msg_get_by_pull", "1", "s:get_msg_log_id", str), 4);
                        if (LJIJ != null && (c109544Rq = LJIJ.LIZ) != null) {
                            arrayList.add(c109544Rq);
                        }
                    }
                    this.LJIIL = (SystemClock.uptimeMillis() - uptimeMillis) + this.LJIIL;
                    if (!arrayList.isEmpty()) {
                        this.LJI++;
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        c63303Ost.LIZLLL.put(str2, arrayList);
                        List<C109544Rq> LIZ = C63162Oqc.LIZ(str2, arrayList);
                        if (!V1B.LJJZZIII(LIZ)) {
                            ((ArrayList) c63303Ost.LJ).addAll(LIZ);
                        }
                        C109544Rq c109544Rq2 = (C109544Rq) ListProtector.get(arrayList, 0);
                        C63120Opw LJIIIZ = C63133Oq9.LJIIIZ(str2, true);
                        if (LJIIIZ == null || LJIIIZ.isWaitingInfo() || !LJIIIZ.isReadBadgeCountUpdated()) {
                            C47922IrO.LIZ();
                            C63217OrV.LJIJJ(c109544Rq2.getConversationId(), c109544Rq2.getConversationShortId(), c109544Rq2.getCreatedAt(), this.LIZJ, c109544Rq2.getConversationType(), conversationRecentMessage.badge_count.intValue());
                            C63269OsL.LIZ(this.LIZJ, c109544Rq2);
                            c63303Ost.LIZIZ.add(str2);
                        } else {
                            long unreadCount = LJIIIZ.getUnreadCount();
                            ((HashMap) c63303Ost.LIZJ).put(str2, Integer.valueOf(conversationRecentMessage.badge_count.intValue() - LJIIIZ.getBadgeCount()));
                            C63192Or6.LJIJI(LJIIIZ, c109544Rq2, conversationRecentMessage.badge_count);
                            this.LJII = (int) ((LJIIIZ.getUnreadCount() - unreadCount) + this.LJII);
                            c63303Ost.LIZ.add(LJIIIZ);
                        }
                        this.LJIILIIL = (SystemClock.uptimeMillis() - uptimeMillis2) + this.LJIILIIL;
                    }
                }
            }
        }
        this.LJFF += i;
    }

    public static void LJIILJJIL(String str, C63120Opw c63120Opw, List list, Integer num) {
        Object obj;
        int i;
        StringBuilder LIZIZ = C25620zW.LIZIZ("GetRecentMsgHandler notifyByConversation, cid:", str, ", msgList:");
        if (list != null) {
            obj = Integer.valueOf(list.size());
        } else {
            obj = "null";
        }
        LIZIZ.append(obj);
        C63322OtC.LJFF(X1D.LIZIZ(LIZIZ));
        if (!V1B.LJJZZIII(list)) {
            C107074Id c107074Id = new C107074Id();
            if (num != null) {
                i = num.intValue();
            } else {
                i = -1;
            }
            c107074Id.LIZ = i;
            C63309Osz.LIZLLL().LJFF(list, 4, c107074Id);
        }
        C63120Opw LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(str);
        if (LJIIIZ != null) {
            c63120Opw = LJIIIZ;
        } else if (c63120Opw == null) {
            return;
        }
        C115284fk.LJIILIIL().LJIJJ(false, 2, c63120Opw);
    }
}
