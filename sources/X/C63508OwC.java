package X;

import Y.ARunnableS29S0200000_10;
import Y.IDcS364S0100000_1;
import Y.IDcS365S0100000_10;
import com.bytedance.im.core.proto.BatchDeleteConversationRequestBody;
import com.bytedance.im.core.proto.DeleteConversationRequestBody;
import com.bytedance.im.core.proto.ResponseBody;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OwC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63508OwC extends AbstractC63515OwJ<List<C63120Opw>> {
    public List<C63120Opw> LIZJ;
    public int LIZLLL;
    public boolean LJ;

    @Override // X.AbstractC63515OwJ
    public final boolean LJFF() {
        return true;
    }

    public C63508OwC(IDcS364S0100000_1 iDcS364S0100000_1) {
        super(EnumC63625Oy5.BATCH_DELETE_CONVERSATIONS.getValue(), iDcS364S0100000_1);
        this.LIZJ = new ArrayList();
        this.LJ = false;
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        ResponseBody responseBody = c63622Oy2.LJLJL.body;
        if (responseBody != null && responseBody.batch_delete_conversation_body != null) {
            return true;
        }
        return false;
    }

    public final void LJIILIIL(List<C63120Opw> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C63120Opw c63120Opw : list) {
            C63459OvP c63459OvP = new C63459OvP();
            c63459OvP.LIZLLL = c63120Opw.getConversationId();
            c63459OvP.LJ = Long.valueOf(c63120Opw.getConversationShortId());
            c63459OvP.LJFF = Integer.valueOf(c63120Opw.getConversationType());
            arrayList.add(c63459OvP.build());
        }
        C63509OwD c63509OwD = new C63509OwD();
        C63685Oz3.LIZ(arrayList);
        c63509OwD.LIZLLL = arrayList;
        BatchDeleteConversationRequestBody build = c63509OwD.build();
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJJIII = build;
        LJIIJJI(this.LIZLLL, c89453Z8v.build(), null, new Object[0]);
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        if (c63622Oy2.LJIIJ() && LJIIIZ(c63622Oy2)) {
            C63337OtR.LJII(c63622Oy2, true).LIZ();
            return;
        }
        if (!this.LJ) {
            C115284fk LJIILIIL = C115284fk.LJIILIIL();
            Integer num = c63622Oy2.LJLJL.status_code;
            LJIILIIL.getClass();
            if (C115284fk.LIZJ(num)) {
                this.LJ = true;
                List<DeleteConversationRequestBody> list = c63622Oy2.LJLJJLL.body.batch_delete_conversation_body.delete_requests;
                ArrayList arrayList = new ArrayList();
                Iterator<DeleteConversationRequestBody> it = list.iterator();
                while (it.hasNext()) {
                    String str = it.next().conversation_id;
                    C115284fk LJIILIIL2 = C115284fk.LJIILIIL();
                    int LJFF = c63622Oy2.LJFF();
                    IDcS365S0100000_10 iDcS365S0100000_10 = new IDcS365S0100000_10(arrayList, 2);
                    LJIILIIL2.getClass();
                    C115284fk.LJIL(LJFF, iDcS365S0100000_10, str);
                }
                LJIILIIL(arrayList);
            }
        }
        LIZIZ(c63622Oy2);
        C63337OtR.LJII(c63622Oy2, false).LIZ();
    }
}
