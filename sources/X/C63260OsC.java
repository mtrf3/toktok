package X;

import Y.ARunnableS29S0200000_10;
import android.util.Pair;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.ParticipantsPage;

/* renamed from: X.OsC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63260OsC implements InterfaceC63353Oth<Pair<C63120Opw, Boolean>> {
    public final /* synthetic */ ConversationInfoV2 LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ C63622Oy2 LJLJJI;
    public final /* synthetic */ Runnable LJLJJL;
    public final /* synthetic */ C63217OrV LJLJJLL;

    @Override // X.InterfaceC63353Oth
    public final void LIZLLL(Pair<C63120Opw, Boolean> pair) {
        Boolean bool;
        Pair<C63120Opw, Boolean> pair2 = pair;
        if (pair2 != null) {
            C63120Opw c63120Opw = (C63120Opw) pair2.first;
            C115284fk.LJIILIIL().LJIJI(5, c63120Opw);
            ParticipantsPage participantsPage = this.LJLIL.first_page_participants;
            if (participantsPage != null && (bool = participantsPage.has_more) != null && bool.booleanValue()) {
                new C63265OsH(true).LJIILIIL(c63120Opw.getConversationId(), 0L, null);
            }
            this.LJLJJLL.LIZLLL(c63120Opw);
            C63269OsL.LJIIJJI(this.LJLILLLLZI, this.LJLJI);
            C115064fO LJII = C63337OtR.LJII(this.LJLJJI, true);
            LJII.LIZJ.put("conversation_id", this.LJLJI);
            LJII.LIZ();
        } else {
            this.LJLJJLL.LIZIZ(C63622Oy2.LIZJ(-3001));
        }
        this.LJLJJL.run();
    }

    public C63260OsC(C63217OrV c63217OrV, ConversationInfoV2 conversationInfoV2, int i, String str, C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        this.LJLJJLL = c63217OrV;
        this.LJLIL = conversationInfoV2;
        this.LJLILLLLZI = i;
        this.LJLJI = str;
        this.LJLJJI = c63622Oy2;
        this.LJLJJL = aRunnableS29S0200000_10;
    }
}
