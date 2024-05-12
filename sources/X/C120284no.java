package X;

import Y.ARunnableS29S0200000_10;
import Y.IDcS13S1100000_1;
import Y.IDcS364S0100000_1;
import android.os.SystemClock;
import com.bytedance.im.core.proto.ResponseBody;
import com.bytedance.im.core.proto.UpdateConversationParticipantResponseBody;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.4no, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C120284no extends AbstractC63515OwJ<C63089OpR> {
    public final C116934iP LIZJ;

    public C120284no(IDcS364S0100000_1 iDcS364S0100000_1) {
        super(EnumC63625Oy5.UPDATE_CONVERSATION_PARTICIPANT.getValue(), iDcS364S0100000_1);
        this.LIZJ = new C116934iP("imsdk_group_chat_change_role");
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        UpdateConversationParticipantResponseBody updateConversationParticipantResponseBody;
        Integer num;
        ResponseBody responseBody = c63622Oy2.LJLJL.body;
        if (responseBody != null && (updateConversationParticipantResponseBody = responseBody.update_conversation_participant_body) != null && (num = updateConversationParticipantResponseBody.status) != null && num.intValue() == EnumC63567Ox9.OP_SUCCEED.getValue() && c63622Oy2.LJLJL.body.update_conversation_participant_body.participant != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(final C63622Oy2 c63622Oy2, final ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        this.LIZJ.LIZJ = SystemClock.elapsedRealtime();
        final String str = (String) c63622Oy2.LJLJJL[0];
        if (!c63622Oy2.LJIIJ() || !LJIIIZ(c63622Oy2)) {
            C115064fO LJII = C63337OtR.LJII(c63622Oy2, false);
            LJII.LIZJ.put("conversation_id", str);
            LJII.LIZ();
            LIZIZ(c63622Oy2);
            aRunnableS29S0200000_10.run();
            this.LIZJ.LIZLLL = SystemClock.elapsedRealtime();
            this.LIZJ.LIZ(false);
            return;
        }
        RunnableC63345OtZ.LJ(new IDcS13S1100000_1(str, c63622Oy2.LJLJL.body.update_conversation_participant_body.participant, 2), new InterfaceC63353Oth<C63089OpR>() { // from class: X.4nV
            @Override // X.InterfaceC63353Oth
            public final void LIZLLL(C63089OpR c63089OpR) {
                if (c63089OpR != null) {
                    C115284fk LJIILIIL = C115284fk.LJIILIIL();
                    final List<C63089OpR> singletonList = Collections.singletonList(c63089OpR);
                    LJIILIIL.getClass();
                    if (singletonList != null && !singletonList.isEmpty()) {
                        C63309Osz LIZLLL = C63309Osz.LIZLLL();
                        LIZLLL.getClass();
                        if (!singletonList.isEmpty()) {
                            LIZLLL.LIZ(((C63089OpR) ListProtector.get(singletonList, 0)).getConversationId(), new InterfaceC118594l5<InterfaceC120024nO>() { // from class: X.4nS
                                @Override // X.InterfaceC118594l5
                                public final void invoke(InterfaceC120024nO interfaceC120024nO) {
                                    interfaceC120024nO.MO(singletonList);
                                }
                            });
                        }
                        Iterator it = ((CopyOnWriteArraySet) LJIILIIL.LIZLLL).iterator();
                        while (it.hasNext()) {
                            ((InterfaceC120024nO) it.next()).MO(singletonList);
                        }
                    }
                    C115064fO LJII2 = C63337OtR.LJII(c63622Oy2, true);
                    LJII2.LIZJ.put("conversation_id", str);
                    LJII2.LIZ();
                    C120284no.this.LIZLLL(c63089OpR);
                } else {
                    C120284no.this.LIZIZ(C63622Oy2.LIZJ(-3001));
                }
                aRunnableS29S0200000_10.run();
                if (c63089OpR != null) {
                    C120284no.this.LIZJ.LIZLLL = SystemClock.elapsedRealtime();
                    C120284no.this.LIZJ.LIZ(true);
                } else {
                    C120284no.this.LIZJ.LIZLLL = SystemClock.elapsedRealtime();
                    C120284no.this.LIZJ.LIZ(false);
                }
            }
        }, false);
    }
}
