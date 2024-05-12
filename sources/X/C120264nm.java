package X;

import Y.ARunnableS29S0200000_10;
import Y.IDcS364S0100000_1;
import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.im.core.proto.ConversationRemoveParticipantsResponseBody;
import com.bytedance.im.core.proto.ResponseBody;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.4nm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C120264nm extends AbstractC63515OwJ<List<C63089OpR>> {
    public final C116934iP LIZJ;

    public C120264nm(IDcS364S0100000_1 iDcS364S0100000_1) {
        super(EnumC63625Oy5.REMOVE_CONVERSATION_PARTICIPANTS.getValue(), iDcS364S0100000_1);
        this.LIZJ = new C116934iP("imsdk_group_chat_remove_member");
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        ConversationRemoveParticipantsResponseBody conversationRemoveParticipantsResponseBody;
        Integer num;
        ResponseBody responseBody = c63622Oy2.LJLJL.body;
        if (responseBody != null && (conversationRemoveParticipantsResponseBody = responseBody.conversation_remove_participants_body) != null && (num = conversationRemoveParticipantsResponseBody.status) != null && num.intValue() == EnumC63567Ox9.OP_SUCCEED.getValue()) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(final C63622Oy2 c63622Oy2, final ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        this.LIZJ.LIZJ = SystemClock.elapsedRealtime();
        if (c63622Oy2.LJIIJ() && LJIIIZ(c63622Oy2)) {
            Object[] objArr = c63622Oy2.LJLJJL;
            String str = (String) objArr[0];
            RunnableC63345OtZ.LJ(new C63125Oq1(this, c63622Oy2.LJLJL.body.conversation_remove_participants_body, (List) objArr[1], str), new InterfaceC63353Oth<Pair<C63120Opw, List<C63089OpR>>>() { // from class: X.4nX
                @Override // X.InterfaceC63353Oth
                public final void LIZLLL(Pair<C63120Opw, List<C63089OpR>> pair) {
                    Object obj;
                    Pair<C63120Opw, List<C63089OpR>> pair2 = pair;
                    if (pair2 != null) {
                        if (pair2.first != null) {
                            C115284fk.LJIILIIL().LJIJI(8, (C63120Opw) pair2.first);
                        }
                        C115284fk LJIILIIL = C115284fk.LJIILIIL();
                        final List<C63089OpR> list = (List) pair2.second;
                        LJIILIIL.getClass();
                        if (list != null && !list.isEmpty()) {
                            C63309Osz LIZLLL = C63309Osz.LIZLLL();
                            LIZLLL.getClass();
                            if (!list.isEmpty()) {
                                LIZLLL.LIZ(((C63089OpR) ListProtector.get(list, 0)).getConversationId(), new InterfaceC118594l5<InterfaceC120024nO>() { // from class: X.4nU
                                    @Override // X.InterfaceC118594l5
                                    public final void invoke(InterfaceC120024nO interfaceC120024nO) {
                                        interfaceC120024nO.BH(list);
                                    }
                                });
                            }
                            Iterator it = ((CopyOnWriteArraySet) LJIILIIL.LIZLLL).iterator();
                            while (it.hasNext()) {
                                ((InterfaceC120024nO) it.next()).BH(list);
                            }
                        }
                        C63337OtR.LJII(c63622Oy2, true).LIZ();
                    }
                    C120264nm c120264nm = C120264nm.this;
                    if (pair2 != null) {
                        obj = pair2.second;
                    } else {
                        obj = null;
                    }
                    c120264nm.LIZLLL(obj);
                    aRunnableS29S0200000_10.run();
                    C120264nm.this.LIZJ.LIZLLL = SystemClock.elapsedRealtime();
                    C120264nm.this.LIZJ.LIZ(true);
                }
            }, false);
            return;
        }
        LIZIZ(c63622Oy2);
        aRunnableS29S0200000_10.run();
        C63337OtR.LJII(c63622Oy2, false).LIZ();
        this.LIZJ.LIZLLL = SystemClock.elapsedRealtime();
        this.LIZJ.LIZ(false);
    }
}
