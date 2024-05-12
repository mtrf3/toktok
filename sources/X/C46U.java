package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.j;
import com.ss.android.ugc.aweme.im.sdk.chat.experiment.SuggestedReplyExperiment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.data.SuggestedReply;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.46U, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C46U {
    public static final String LIZ(String str) {
        boolean z;
        List<SuggestedReply> LIZIZ;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || (LIZIZ = LIZIZ(str)) == null) {
            return null;
        }
        return ORZ.LLD(LIZIZ, ",", null, null, C1039446c.LJLIL, 30);
    }

    public static final List<SuggestedReply> LIZIZ(String str) {
        int i;
        o.LJIIIZ(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        List LJLJJL = s.LJLJJL(str, new String[]{","}, 0, 6);
        if (((Boolean) SuggestedReplyExperiment.LJIIIIZZ.getValue()).booleanValue()) {
            i = 3;
        } else {
            i = 2;
        }
        List LLILLL = ORZ.LLILLL(LJLJJL, i);
        ArrayList arrayList = new ArrayList(C32I.LJJL(LLILLL, 10));
        Iterator it = LLILLL.iterator();
        while (it.hasNext()) {
            arrayList.add(s.LJLJJL((String) it.next(), new String[]{":"}, 0, 6));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((List) next).size() > 1) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            List list = (List) it3.next();
            arrayList3.add(new SuggestedReply((String) ListProtector.get(list, 1), (String) ListProtector.get(list, 0)));
        }
        return arrayList3;
    }

    public static final String LIZJ(List<SuggestedReply> list) {
        o.LJIIIZ(list, "<this>");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (SuggestedReply suggestedReply : list) {
            int i2 = i + 1;
            if (i >= 0) {
                SuggestedReply suggestedReply2 = suggestedReply;
                sb.append(suggestedReply2.getReplyEmoji());
                sb.append(":");
                sb.append(suggestedReply2.getReplyText());
                if (i < list.size() - 1) {
                    sb.append(",");
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }

    public static final String LJ(C109544Rq c109544Rq) {
        o.LJIIIZ(c109544Rq, "<this>");
        String str = c109544Rq.getExt().get("a:sug_reply_anime");
        String str2 = null;
        if (str == null) {
            return null;
        }
        try {
            j LJJIJ = GsonProtectorUtils.parse(new com.google.gson.o(), str).LJIIZILJ().LJJIJ("emoji_anime");
            if (LJJIJ == null) {
                return null;
            }
            str2 = LJJIJ.LJJIFFI();
            return str2;
        } catch (com.google.gson.s e) {
            C34B.LJFF(e);
            return str2;
        }
    }

    public static final boolean LJFF(C109544Rq c109544Rq) {
        o.LJIIIZ(c109544Rq, "<this>");
        return o.LJ(c109544Rq.getLocalExt().get("IS_DONE_SUG_ANIME"), "1");
    }

    public static final boolean LJI(C109544Rq c109544Rq) {
        o.LJIIIZ(c109544Rq, "<this>");
        if (o.LJ(c109544Rq.getLocalExt().get("IS_REPLIED_OR_REACTED"), "1") || o.LJ(c109544Rq.getLocalExt().get("IS_REPLIED_OR_REACTED"), "react")) {
            return true;
        }
        return false;
    }

    public static final void LJII(C109544Rq c109544Rq) {
        if (LJIIIIZZ(c109544Rq) || !((Boolean) SuggestedReplyExperiment.LJ.getValue()).booleanValue()) {
            return;
        }
        java.util.Map<String, String> localExt = c109544Rq.getLocalExt();
        o.LJIIIIZZ(localExt, "localExt");
        localExt.put("IS_SHAERED_AWEME_WATCHED", "1");
        C106674Gp.LJIILJJIL(c109544Rq);
    }

    public static final boolean LJIIIIZZ(C109544Rq c109544Rq) {
        o.LJIIIZ(c109544Rq, "<this>");
        if (o.LJ(c109544Rq.getLocalExt().get("IS_SHAERED_AWEME_WATCHED"), "1")) {
            return true;
        }
        return false;
    }

    public static final long LJIIIZ(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTime().getTime();
    }

    public static final List<SuggestedReply> LJIIJ(C109544Rq c109544Rq) {
        long j;
        long j2;
        String str;
        Long LJJIZ;
        o.LJIIIZ(c109544Rq, "<this>");
        if (!LJI(c109544Rq)) {
            String conversationId = c109544Rq.getConversationId();
            o.LJIIIIZZ(conversationId, "conversationId");
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            Long LIZLLL = LIZLLL(C4WC.LIZIZ, conversationId);
            if (LIZLLL != null) {
                j = LIZLLL.longValue();
            } else {
                j = Long.MIN_VALUE;
            }
            String str2 = c109544Rq.getLocalExt().get("SUG_REPLY_SHOW_TIME");
            if (str2 != null && (LJJIZ = C38350F3i.LJJIZ(str2)) != null) {
                j2 = LJJIZ.longValue();
            } else {
                j2 = j;
            }
            if (j2 < j || (str = c109544Rq.getLocalExt().get("SUGGESTED_REPLIES")) == null || str.length() == 0) {
                return null;
            }
            return LIZIZ(str);
        }
        return null;
    }

    public static final String LJIIJJI(List<SuggestedReply> list) {
        StringBuilder sb = new StringBuilder();
        if (list == null) {
            return null;
        }
        int i = 0;
        for (SuggestedReply suggestedReply : list) {
            int i2 = i + 1;
            if (i >= 0) {
                SuggestedReply suggestedReply2 = suggestedReply;
                sb.append(suggestedReply2.getReplyEmoji());
                sb.append(" ");
                sb.append(suggestedReply2.getReplyText());
                if (i < list.size() - 1) {
                    sb.append(",");
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return sb.toString();
    }

    public static final String LJIILIIL(String str) {
        String LIZIZ = C80763Ey.LIZIZ();
        if (!(!o.LJ(LIZIZ, "-1")) || LIZIZ == null) {
            return null;
        }
        return C00F.LIZIZ(str, '_', LIZIZ);
    }

    public static final Long LIZLLL(C3Q9 conversationListModel, String str) {
        java.util.Map<String, String> localExt;
        String str2;
        o.LJIIIZ(conversationListModel, "conversationListModel");
        C63120Opw LIZ = conversationListModel.LIZ(str);
        if (LIZ != null && (localExt = LIZ.getLocalExt()) != null && (str2 = localExt.get("LAST_SELF_MSG_SNEND_TIME")) != null) {
            return C38350F3i.LJJIZ(str2);
        }
        return null;
    }

    public static final void LJIIL(C109544Rq c109544Rq, String str) {
        o.LJIIIZ(c109544Rq, "<this>");
        if (!o.LJ(str, c109544Rq.getLocalExt().get("SUGGESTED_REPLIES"))) {
            java.util.Map<String, String> localExt = c109544Rq.getLocalExt();
            o.LJIIIIZZ(localExt, "localExt");
            localExt.put("SUGGESTED_REPLIES", str);
            C106674Gp.LJIILJJIL(c109544Rq);
        }
    }
}
