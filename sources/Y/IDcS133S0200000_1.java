package Y;

import X.AbstractC63515OwJ;
import X.C109544Rq;
import X.C115284fk;
import X.C115934gn;
import X.C115944go;
import X.C120144na;
import X.C120564oG;
import X.C3OG;
import X.C4W7;
import X.C4WG;
import X.C63120Opw;
import X.C63124Oq0;
import X.C63133Oq9;
import X.C63150OqQ;
import X.C63291Osh;
import X.C63308Osy;
import X.C63322OtC;
import X.C63337OtR;
import X.C63622Oy2;
import X.C89453Z8v;
import X.EnumC97443s4;
import X.InterfaceC63352Otg;
import X.RQI;
import X.X1D;
import Y.ARunnableS29S0200000_10;
import com.bytedance.im.core.proto.ConversationParticipantReadIndex;
import com.bytedance.im.core.proto.ParticipantReadIndex;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDcS133S0200000_1 implements InterfaceC63352Otg {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC63352Otg
    public final Object LIZIZ() {
        switch (this.$t) {
            case 0:
                return LIZIZ$0(this);
            case 1:
                return LIZIZ$1(this);
            case 2:
                return LIZIZ$2(this);
            case 3:
                return LIZIZ$3(this);
            default:
                return null;
        }
    }

    public static final Object LIZIZ$0(IDcS133S0200000_1 iDcS133S0200000_1) {
        C63322OtC.LJFF("MessageBrowserModel loadOlderMessageList onRun");
        C115934gn c115934gn = (C115934gn) iDcS133S0200000_1.l1;
        if (!c115934gn.LJLJJI.isEmpty()) {
            C109544Rq c109544Rq = c115934gn.LJLJJI.get(r1.size() - 1);
            if (c109544Rq != null) {
                String str = ((C115934gn) iDcS133S0200000_1.l1).LJLIL;
                long index = c109544Rq.getIndex();
                C115944go LIZJ = C115944go.LIZJ();
                String str2 = ((C115934gn) iDcS133S0200000_1.l1).LJLIL;
                List list = (List) iDcS133S0200000_1.l0;
                if (!list.isEmpty()) {
                    C63291Osh.LIZ().getClass();
                    long LIZIZ = C63291Osh.LIZIZ();
                    Iterator it = list.iterator();
                    long j = Long.MAX_VALUE;
                    while (it.hasNext()) {
                        long indexInConversationV2 = ((C109544Rq) it.next()).getIndexInConversationV2();
                        if (indexInConversationV2 >= LIZIZ) {
                            j = Math.min(indexInConversationV2, j);
                        }
                    }
                }
                LIZJ.getClass();
                C115944go.LIZIZ(str2);
                C115934gn c115934gn2 = (C115934gn) iDcS133S0200000_1.l1;
                return C63150OqQ.LJJIFFI(str, index, c115934gn2.LJLJI, c115934gn2.LJLILLLLZI);
            }
        }
        return Collections.emptyList();
    }

    public static final Object LIZIZ$1(IDcS133S0200000_1 iDcS133S0200000_1) {
        C120144na c120144na = (C120144na) iDcS133S0200000_1.l1;
        C63622Oy2 c63622Oy2 = (C63622Oy2) iDcS133S0200000_1.l0;
        c120144na.getClass();
        List<C109544Rq> list = (List) c63622Oy2.LJLJJL[0];
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (ConversationParticipantReadIndex conversationParticipantReadIndex : c63622Oy2.LJLJL.body.batch_get_conversation_participants_readindex.conversationParticipantsReadIndex) {
            hashMap.put(conversationParticipantReadIndex.conversation_id, conversationParticipantReadIndex);
        }
        List<ConversationParticipantReadIndex> netParticipantIndexInfoList = c63622Oy2.LJLJL.body.batch_get_conversation_participants_readindex.conversationParticipantsReadIndex;
        o.LJIIIZ(netParticipantIndexInfoList, "netParticipantIndexInfoList");
        C63308Osy.LJI().LIZLLL().getClass();
        if (list == null) {
            return null;
        }
        for (C109544Rq c109544Rq : list) {
            ConversationParticipantReadIndex conversationParticipantReadIndex2 = (ConversationParticipantReadIndex) hashMap.get(c109544Rq.getConversationId());
            if (conversationParticipantReadIndex2 != null && conversationParticipantReadIndex2.participantReadIndex != null) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                C63120Opw LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(conversationParticipantReadIndex2.conversation_id);
                if (LJIIIZ != null && LJIIIZ.getMemberIds() != null && !LJIIIZ.getMemberIds().isEmpty()) {
                    arrayList3.addAll(LJIIIZ.getMemberIds());
                } else {
                    arrayList3.addAll(C63124Oq0.LJ(conversationParticipantReadIndex2.conversation_id));
                }
                arrayList3.remove(Long.valueOf(C63308Osy.LJI().LIZIZ().getUid()));
                for (ParticipantReadIndex participantReadIndex : conversationParticipantReadIndex2.participantReadIndex) {
                    if (participantReadIndex.user_id.longValue() != C63308Osy.LJI().LIZIZ().getUid() && !"1".equals(c109544Rq.getLocalExt().get("s:message_index_is_local")) && participantReadIndex.index.longValue() >= c109544Rq.getIndex()) {
                        arrayList2.add(participantReadIndex.user_id);
                    }
                }
                String str = conversationParticipantReadIndex2.conversation_id;
                long msgId = c109544Rq.getMsgId();
                c109544Rq.getSender();
                arrayList.add(new C3OG(arrayList2, arrayList3, str, msgId));
            }
        }
        return new C4WG(arrayList, c120144na.LIZJ);
    }

    public static final Object LIZIZ$2(IDcS133S0200000_1 iDcS133S0200000_1) {
        ((C4W7) iDcS133S0200000_1.l1).getClass();
        return C63133Oq9.LJIILIIL(C4W7.LIZJ().intValue(), ((C63120Opw) iDcS133S0200000_1.l0).getUpdatedTime(), ((C4W7) iDcS133S0200000_1.l1).LJI);
    }

    public static final Object LIZIZ$3(IDcS133S0200000_1 iDcS133S0200000_1) {
        EnumC97443s4 enumC97443s4 = (EnumC97443s4) iDcS133S0200000_1.l0;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMConversationDao deleteAllStranger, inbox:");
        LIZ.append(-1);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        try {
            List<C63120Opw> LJIILJJIL = C63133Oq9.LJIILJJIL(-1, enumC97443s4, false);
            if (LJIILJJIL != null && !LJIILJJIL.isEmpty()) {
                Iterator<C63120Opw> it = LJIILJJIL.iterator();
                while (it.hasNext()) {
                    C63133Oq9.LJFF(it.next().getConversationId());
                }
            }
        } catch (Exception e) {
            C63322OtC.LJ("IMConversationDao deleteAllStranger", e);
            C63337OtR.LJFF(e);
        }
        final IDcS364S0100000_1 iDcS364S0100000_1 = new IDcS364S0100000_1(iDcS133S0200000_1, 28);
        AbstractC63515OwJ<Boolean> abstractC63515OwJ = new AbstractC63515OwJ<Boolean>(iDcS364S0100000_1) { // from class: X.4nY
            @Override // X.AbstractC63515OwJ
            public final boolean LJFF() {
                return true;
            }

            @Override // X.AbstractC63515OwJ
            public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
                return true;
            }

            {
                int value = EnumC63625Oy5.DELETE_ALL_STRANGER_CONVERSATIONS.getValue();
            }

            @Override // X.AbstractC63515OwJ
            public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
                if (c63622Oy2.LJIIJ()) {
                    LIZLLL(Boolean.TRUE);
                    C63337OtR.LJII(c63622Oy2, true).LIZ();
                } else {
                    LIZIZ(c63622Oy2);
                    C63337OtR.LJII(c63622Oy2, false).LIZ();
                }
            }
        };
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("DeleteAllStrangerConversationsHandler delete, inbox:");
        LIZ2.append(0);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
        RQI build = new C120564oG().build();
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJJJJJ = build;
        abstractC63515OwJ.LJIIJJI(0, c89453Z8v.build(), null, new Object[0]);
        return Boolean.TRUE;
    }

    public IDcS133S0200000_1(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }
}
