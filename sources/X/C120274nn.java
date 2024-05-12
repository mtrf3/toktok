package X;

import Y.ARunnableS29S0200000_10;
import Y.IDcS135S0200000_1;
import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.im.core.proto.ConversationAddParticipantsResponseBody;
import com.bytedance.im.core.proto.ResponseBody;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.4nn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C120274nn extends AbstractC63515OwJ<List<C63089OpR>> {
    public final long LIZJ;
    public final C116934iP LIZLLL;

    public C120274nn(IDcS135S0200000_1 iDcS135S0200000_1) {
        super(EnumC63625Oy5.ADD_CONVERSATION_PARTICIPANTS.getValue(), iDcS135S0200000_1);
        this.LIZJ = -1L;
        this.LIZLLL = new C116934iP("imsdk_group_chat_add_member");
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody;
        Integer num;
        ResponseBody responseBody = c63622Oy2.LJLJL.body;
        if (responseBody != null && (conversationAddParticipantsResponseBody = responseBody.conversation_add_participants_body) != null && (num = conversationAddParticipantsResponseBody.status) != null && num.intValue() == EnumC63567Ox9.OP_SUCCEED.getValue()) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(final C63622Oy2 c63622Oy2, final ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        boolean z;
        this.LIZLLL.LIZJ = SystemClock.elapsedRealtime();
        if (c63622Oy2.LJIIJ() && LJIIIZ(c63622Oy2)) {
            z = true;
        } else {
            z = false;
        }
        Object[] objArr = c63622Oy2.LJLJJL;
        final String str = (String) objArr[0];
        List list = (List) objArr[1];
        final int size = list.size();
        if (z) {
            RunnableC63345OtZ.LJ(new C63123Opz(this, c63622Oy2.LJLJL.body.conversation_add_participants_body, list, str, c63622Oy2), new InterfaceC63353Oth<Pair<C63120Opw, List<C63089OpR>>>() { // from class: X.4nW
                @Override // X.InterfaceC63353Oth
                public final void LIZLLL(Pair<C63120Opw, List<C63089OpR>> pair) {
                    Pair<C63120Opw, List<C63089OpR>> pair2 = pair;
                    if (pair2.first != null) {
                        C115284fk.LJIILIIL().LJIJI(1, (C63120Opw) pair2.first);
                    }
                    C120274nn.this.LJ(pair2.second, c63622Oy2);
                    C115284fk LJIILIIL = C115284fk.LJIILIIL();
                    final List<C63089OpR> list2 = (List) pair2.second;
                    LJIILIIL.getClass();
                    if (list2 != null && !list2.isEmpty()) {
                        C63309Osz LIZLLL = C63309Osz.LIZLLL();
                        LIZLLL.getClass();
                        if (!list2.isEmpty()) {
                            LIZLLL.LIZ(((C63089OpR) ListProtector.get(list2, 0)).getConversationId(), new InterfaceC118594l5<InterfaceC120024nO>() { // from class: X.4nT
                                @Override // X.InterfaceC118594l5
                                public final void invoke(InterfaceC120024nO interfaceC120024nO) {
                                    interfaceC120024nO.DH(list2);
                                }
                            });
                        }
                        Iterator it = ((CopyOnWriteArraySet) LJIILIIL.LIZLLL).iterator();
                        while (it.hasNext()) {
                            ((InterfaceC120024nO) it.next()).DH(list2);
                        }
                    }
                    C115064fO LJII = C63337OtR.LJII(c63622Oy2, true);
                    LJII.LIZJ.put("conversation_id", str);
                    LJII.LIZJ.put("total_count", Integer.valueOf(size));
                    LJII.LIZJ.put("count", Integer.valueOf(((List) pair2.second).size()));
                    LJII.LIZ();
                    aRunnableS29S0200000_10.run();
                    C120274nn.this.LIZLLL.LIZLLL = SystemClock.elapsedRealtime();
                    C120274nn.this.LIZLLL.LIZ(true);
                }
            }, false);
            return;
        }
        LIZIZ(c63622Oy2);
        aRunnableS29S0200000_10.run();
        C115064fO LJII = C63337OtR.LJII(c63622Oy2, false);
        LJII.LIZJ.put("conversation_id", str);
        LJII.LIZJ.put("total_count", Integer.valueOf(size));
        LJII.LIZ();
        this.LIZLLL.LIZLLL = SystemClock.elapsedRealtime();
        this.LIZLLL.LIZ(false);
    }
}
