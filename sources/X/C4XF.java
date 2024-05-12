package X;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4XF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4XF implements InterfaceC104994Ad {
    public static final /* synthetic */ C4XF LIZJ = new C4XF();
    public final /* synthetic */ C39061g6 LIZIZ = new C39061g6(4);

    public final void LIZ(C109544Rq msg) {
        o.LJIIIZ(msg, "msg");
        C39061g6 c39061g6 = this.LIZIZ;
        c39061g6.getClass();
        java.util.Map map = (java.util.Map) c39061g6.LIZJ;
        String conversationId = msg.getConversationId();
        o.LJIIIIZZ(conversationId, "msg.conversationId");
        Object obj = map.get(conversationId);
        if (obj == null) {
            String conversationId2 = msg.getConversationId();
            o.LJIIIIZZ(conversationId2, "msg.conversationId");
            obj = new C62853Old(conversationId2);
            map.put(conversationId, obj);
        }
        C4XG c4xg = (C4XG) obj;
        msg.putLocalCache(505, Boolean.TRUE);
        List singletonList = Collections.singletonList(msg);
        if (singletonList != null && !singletonList.isEmpty()) {
            C31F.LIZ.getClass();
            C31G.LIZ();
            C63164Oqe.LJIILJJIL(singletonList);
        }
        c4xg.LIZJ(msg);
    }
}
