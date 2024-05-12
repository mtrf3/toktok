package X;

import android.util.Pair;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.ParticipantsPage;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.OsI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63266OsI implements InterfaceC63352Otg<List<Pair<Pair<C63120Opw, Boolean>, List<C63089OpR>>>> {
    public final /* synthetic */ C63622Oy2 LJLIL;
    public final /* synthetic */ java.util.Map LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ java.util.Set LJLJJI;

    @Override // X.InterfaceC63352Otg
    public final List<Pair<Pair<C63120Opw, Boolean>, List<C63089OpR>>> LIZIZ() {
        Pair<C63120Opw, Boolean> LJIIZILJ;
        Object obj;
        List list;
        Boolean bool;
        List<ConversationInfoV2> list2 = this.LJLIL.LJLJL.body.get_conversation_info_list_v2_body.conversation_info_list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ConversationInfoV2 conversationInfoV2 : list2) {
            MessageBody messageBody = (MessageBody) this.LJLILLLLZI.get(conversationInfoV2.conversation_id);
            if (messageBody != null && (LJIIZILJ = C63217OrV.LJIIZILJ(this.LJLJI, messageBody.create_time.longValue(), conversationInfoV2)) != null && (obj = LJIIZILJ.first) != null) {
                if (conversationInfoV2.first_page_participants != null) {
                    list = C63081OpJ.LJIILL(((C63120Opw) obj).getConversationId(), conversationInfoV2.first_page_participants.participants);
                } else {
                    list = null;
                }
                arrayList.add(new Pair(LJIIZILJ, list));
                ParticipantsPage participantsPage = conversationInfoV2.first_page_participants;
                if (participantsPage != null && (bool = participantsPage.has_more) != null && bool.booleanValue()) {
                    this.LJLJJI.add(conversationInfoV2.conversation_id);
                }
            }
        }
        return arrayList;
    }

    public C63266OsI(int i, C63622Oy2 c63622Oy2, java.util.Map map, java.util.Set set) {
        this.LJLIL = c63622Oy2;
        this.LJLILLLLZI = map;
        this.LJLJI = i;
        this.LJLJJI = set;
    }
}
