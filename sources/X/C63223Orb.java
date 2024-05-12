package X;

import Y.IDcS14S1100000_10;
import com.bytedance.im.core.proto.MarkStrangerConversationReadRequestBody;

/* renamed from: X.Orb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63223Orb implements InterfaceC86963bA<C63120Opw> {
    public final /* synthetic */ String LIZ;

    @Override // X.InterfaceC86963bA
    public final void LIZIZ(C63623Oy3 c63623Oy3) {
    }

    public C63223Orb(String str) {
        this.LIZ = str;
    }

    @Override // X.InterfaceC86963bA
    public final void onSuccess(C63120Opw c63120Opw) {
        C63120Opw c63120Opw2 = c63120Opw;
        if (c63120Opw2 != null && c63120Opw2.isStranger() && !C63308Osy.LJI().LIZLLL().LJLJJL) {
            C63230Ori c63230Ori = new C63230Ori();
            String str = this.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("StrangerMarkReadHandler mark, conversationId:");
            LIZ.append(str);
            C63322OtC.LJFF(X1D.LIZIZ(LIZ));
            C63120Opw LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(str);
            if (LJIIIZ == null) {
                c63230Ori.LIZIZ(C63622Oy2.LIZJ(-1017));
                return;
            }
            C63494Ovy c63494Ovy = new C63494Ovy();
            c63494Ovy.LIZLLL = Long.valueOf(LJIIIZ.getConversationShortId());
            MarkStrangerConversationReadRequestBody build = c63494Ovy.build();
            C89453Z8v c89453Z8v = new C89453Z8v();
            c89453Z8v.LJJJJJL = build;
            c63230Ori.LJIIJJI(LJIIIZ.getInboxType(), c89453Z8v.build(), null, new Object[0]);
            RunnableC63345OtZ.LJ(new C63142OqI(str), new C63170Oqk(str), false);
            return;
        }
        C63246Ory c63246Ory = new C63246Ory();
        String str2 = this.LIZ;
        RunnableC63345OtZ.LJ(new IDcS14S1100000_10(c63246Ory, str2, 7), new C63169Oqj(str2), false);
    }
}
