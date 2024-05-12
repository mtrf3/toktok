package X;

import Y.ARunnableS29S0200000_10;
import Y.IDcS14S1100000_10;
import com.bytedance.im.core.proto.ConversationParticipantsListRequestBody;
import com.bytedance.im.core.proto.ConversationParticipantsListResponseBody;
import com.bytedance.im.core.proto.ParticipantsPage;
import com.bytedance.im.core.proto.ResponseBody;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.OsH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63265OsH extends AbstractC63515OwJ<List<C63089OpR>> {
    public final List<C63089OpR> LIZJ;
    public final boolean LIZLLL;

    @Override // X.AbstractC63515OwJ
    public final boolean LJFF() {
        return true;
    }

    public C63265OsH(boolean z) {
        super(EnumC63625Oy5.CONVERSATION_PARTICIPANTS_LIST.getValue(), null);
        this.LIZJ = new ArrayList();
        this.LIZLLL = z;
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        ConversationParticipantsListResponseBody conversationParticipantsListResponseBody;
        ResponseBody responseBody = c63622Oy2.LJLJL.body;
        if (responseBody != null && (conversationParticipantsListResponseBody = responseBody.conversation_participants_body) != null && conversationParticipantsListResponseBody.participants_page != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        if (c63622Oy2.LJIIJ() && LJIIIZ(c63622Oy2)) {
            ParticipantsPage participantsPage = c63622Oy2.LJLJL.body.conversation_participants_body.participants_page;
            String str = (String) c63622Oy2.LJLJJL[0];
            ((ArrayList) this.LIZJ).addAll(C63081OpJ.LJIILL(str, participantsPage.participants));
            if (participantsPage.has_more.booleanValue()) {
                LJIILIIL(str, participantsPage.cursor.longValue(), c63622Oy2.LJLJJI);
                return;
            } else {
                RunnableC63345OtZ.LJ(new IDcS14S1100000_10(this, str, 5), new C63264OsG(this, str, aRunnableS29S0200000_10, c63622Oy2), false);
                return;
            }
        }
        LIZIZ(c63622Oy2);
        aRunnableS29S0200000_10.run();
        C63337OtR.LJII(c63622Oy2, false).LIZ();
    }

    public final long LJIILIIL(String str, long j, InterfaceC63361Otp interfaceC63361Otp) {
        java.util.Set<String> set = C63269OsL.LJI;
        if (((CopyOnWriteArraySet) set).contains(str)) {
            return -1L;
        }
        ((CopyOnWriteArraySet) set).add(str);
        C63120Opw LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(str);
        if (LJIIIZ == null) {
            return -1L;
        }
        C63475Ovf c63475Ovf = new C63475Ovf();
        c63475Ovf.LIZLLL = str;
        c63475Ovf.LJ = Long.valueOf(LJIIIZ.getConversationShortId());
        c63475Ovf.LJFF = Integer.valueOf(LJIIIZ.getConversationType());
        c63475Ovf.LJI = Long.valueOf(j);
        ConversationParticipantsListRequestBody build = c63475Ovf.build();
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJIIZILJ = build;
        return LJIIJJI(LJIIIZ.getInboxType(), c89453Z8v.build(), interfaceC63361Otp, str, Long.valueOf(j));
    }
}
