package X;

import java.util.List;

/* renamed from: X.3LB, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3LB {
    public final List<C63120Opw> LIZ;
    public final List<C63120Opw> LIZIZ;
    public final C63120Opw LIZJ;

    public final String LIZ() {
        String str;
        C63120Opw c63120Opw = this.LIZJ;
        long j = -1;
        if (c63120Opw != null) {
            str = c63120Opw.getConversationId();
            C109544Rq lastShowMessage = this.LIZJ.getLastShowMessage();
            if (lastShowMessage != null) {
                j = lastShowMessage.getMsgId();
            }
        } else {
            str = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StrangerBox{ , regularStrangerRequestsCount=");
        DIL.LIZIZ(this.LIZ, LIZ, ", filteredStrangerRequestsCount=");
        LIZ.append(this.LIZIZ.size());
        LIZ.append(", latestConversation=");
        LIZ.append(str);
        LIZ.append(", latestMessageId=");
        return C0H1.LIZJ(LIZ, j, "}", LIZ);
    }

    public C3LB(List<C63120Opw> list, List<C63120Opw> list2, C63120Opw c63120Opw) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = c63120Opw;
    }
}
