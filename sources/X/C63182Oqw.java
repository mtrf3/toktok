package X;

import com.bytedance.im.core.proto.GetMessageError;
import com.bytedance.im.core.proto.MessageBody;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Oqw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63182Oqw implements InterfaceC63352Otg<List<C109544Rq>> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ List LJLILLLLZI;
    public final /* synthetic */ List LJLJI;

    @Override // X.InterfaceC63352Otg
    public final List<C109544Rq> LIZIZ() {
        C109544Rq c109544Rq;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GetMessagesByMsgIDsHandler update msg, Task onRun, seqId:");
        LIZ.append(this.LJLIL);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        ArrayList arrayList = new ArrayList();
        for (GetMessageError getMessageError : this.LJLILLLLZI) {
            try {
                C109544Rq LJIILIIL = C63150OqQ.LJIILIIL(getMessageError.entry.server_message_id.longValue());
                if (LJIILIIL != null) {
                    LJIILIIL.getLocalExt().put("s:msg_error_code", getMessageError.status_code.toString());
                    C63150OqQ.LJJII(true, LJIILIIL, true);
                    arrayList.add(LJIILIIL);
                }
            } catch (Exception e) {
                C63322OtC.LJ("GetMessagesByMsgIDsHandler update msg error(handle error msg)", e);
            }
        }
        List list = this.LJLJI;
        if (list != null && !list.isEmpty()) {
            try {
                Iterator it = this.LJLJI.iterator();
                while (it.hasNext()) {
                    C63160Oqa LIZ2 = C63151OqR.LIZ((MessageBody) it.next());
                    if (LIZ2.LIZ && (c109544Rq = LIZ2.LIZIZ) != null) {
                        arrayList.add(c109544Rq);
                    }
                }
            } catch (Exception e2) {
                C63322OtC.LJ("GetMessagesByMsgIDsHandler update msg error", e2);
                HashMap hashMap = new HashMap();
                hashMap.put("exception", e2.toString());
                C63275OsR.LIZIZ().LIZLLL(EnumC63665Oyj.COUNTER, "get_message_by_ids_fail", hashMap);
            }
        }
        return arrayList;
    }

    public C63182Oqw(long j, List list, List list2) {
        this.LJLIL = j;
        this.LJLILLLLZI = list;
        this.LJLJI = list2;
    }
}
