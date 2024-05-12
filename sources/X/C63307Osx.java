package X;

import android.os.SystemClock;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.CreateConversationV2ResponseBody;

/* renamed from: X.Osx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63307Osx implements InterfaceC63352Otg<C63120Opw> {
    public final /* synthetic */ CreateConversationV2ResponseBody LJLIL;
    public final /* synthetic */ C63622Oy2 LJLILLLLZI;
    public final /* synthetic */ C63559Ox1 LJLJI;

    @Override // X.InterfaceC63352Otg
    public final C63120Opw LIZIZ() {
        C63120Opw c63120Opw;
        boolean z;
        int intValue;
        boolean LJIJ;
        this.LJLJI.LIZJ.LJFF = SystemClock.uptimeMillis();
        C63569OxB c63569OxB = this.LJLJI.LIZJ;
        c63569OxB.LJ = c63569OxB.LJFF - this.LJLJI.LIZJ.LIZJ;
        C63120Opw c63120Opw2 = null;
        try {
            C78847Ux1.LJJLIIIJJI("CreateConversationHandler saveConversation");
            C63120Opw LJIIIZ = C63133Oq9.LJIIIZ(this.LJLIL.conversation.conversation_id, true);
            if (LJIIIZ != null) {
                z = true;
            } else {
                z = false;
            }
            ConversationInfoV2 conversationInfoV2 = this.LJLIL.conversation;
            String str = conversationInfoV2.conversation_id;
            Integer num = conversationInfoV2.conversation_type;
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            ConversationInfoV2 conversationInfoV22 = this.LJLIL.conversation;
            C63124Oq0.LJII(intValue, str, C63081OpJ.LJIILL(conversationInfoV22.conversation_id, conversationInfoV22.first_page_participants.participants));
            C63308Osy.LJI().getClass();
            long LJ = C63308Osy.LJ();
            c63120Opw = C63081OpJ.LJIIIIZZ(this.LJLILLLLZI.LJLJL.inbox_type.intValue(), LJIIIZ, this.LJLIL.conversation, LJ, null, null, true);
            c63120Opw.setUpdatedTime(LJ);
            if (z) {
                LJIJ = C63133Oq9.LJIJJLI(c63120Opw, true);
            } else {
                LJIJ = C63133Oq9.LJIJ(c63120Opw);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CreateConversationHandler hasLocal = ");
            LIZ.append(z);
            LIZ.append(" result = ");
            LIZ.append(LJIJ);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZ));
            C78847Ux1.LJIJJLI("CreateConversationHandler saveConversation", true);
        } catch (Exception e) {
            e = e;
            c63120Opw = null;
        }
        if (LJIJ) {
            try {
                if (C63308Osy.LJI().LIZLLL().LJLJJL) {
                    C63139OqF.LIZ(C63139OqF.LIZ);
                }
            } catch (Exception e2) {
                e = e2;
                C63322OtC.LJ("CreateConversationHandler saveConversation", e);
                C78847Ux1.LJIJJLI("CreateConversationHandler saveConversation", false);
                c63120Opw2 = c63120Opw;
                this.LJLJI.LIZJ.LJI = SystemClock.uptimeMillis();
                C63569OxB c63569OxB2 = this.LJLJI.LIZJ;
                c63569OxB2.LJII = c63569OxB2.LJI - this.LJLJI.LIZJ.LJFF;
                return c63120Opw2;
            }
            c63120Opw2 = c63120Opw;
        }
        this.LJLJI.LIZJ.LJI = SystemClock.uptimeMillis();
        C63569OxB c63569OxB22 = this.LJLJI.LIZJ;
        c63569OxB22.LJII = c63569OxB22.LJI - this.LJLJI.LIZJ.LJFF;
        return c63120Opw2;
    }

    public C63307Osx(C63559Ox1 c63559Ox1, CreateConversationV2ResponseBody createConversationV2ResponseBody, C63622Oy2 c63622Oy2) {
        this.LJLJI = c63559Ox1;
        this.LJLIL = createConversationV2ResponseBody;
        this.LJLILLLLZI = c63622Oy2;
    }
}
