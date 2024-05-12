package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3rx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97373rx {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(List currentData, List list) {
        o.LJIIIZ(currentData, "currentData");
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C97383ry LIZIZ = LIZIZ((C63120Opw) it.next(), currentData);
                if (LIZIZ != null) {
                    arrayList.add(LIZIZ);
                }
            }
            return arrayList;
        }
        return C61878OQg.INSTANCE;
    }

    public static C97383ry LIZIZ(C63120Opw conversation, List currentData) {
        C3LK c3lk;
        o.LJIIIZ(currentData, "currentData");
        o.LJIIIZ(conversation, "conversation");
        boolean z = false;
        C97383ry c97383ry = null;
        if (!C79004UzY.LJJIJIL(conversation) || !conversation.isSingleChat()) {
            StringBuilder sb = new StringBuilder("convert not stranger: ");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(conversation.getConversationId());
            LIZ2.append(", ");
            LIZ2.append(conversation.isStranger());
            LIZ2.append(", ");
            LIZ2.append(conversation.isSingleChat());
            sb.append(X1D.LIZIZ(LIZ2));
            C34B.LJI("MessageRequestViewModel", sb.toString());
        } else {
            C3L5 LIZIZ = C82473Ln.LIZIZ(conversation, null, false, 14);
            if ((LIZIZ instanceof C3LK) && (c3lk = (C3LK) LIZIZ) != null) {
                C97383ry LIZJ = LIZJ(conversation, currentData);
                if (LIZJ != null) {
                    z = LIZJ.LJLIL;
                }
                c97383ry = new C97383ry(z, conversation, c3lk);
            }
        }
        return c97383ry;
    }

    public static C97383ry LIZJ(C63120Opw conversation, List currentData) {
        Object obj;
        o.LJIIIZ(currentData, "currentData");
        o.LJIIIZ(conversation, "conversation");
        String conversationId = conversation.getConversationId();
        o.LJIIIIZZ(conversationId, "conversation.conversationId");
        Iterator it = currentData.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (o.LJ(((C97383ry) obj).LJLJI.LJFF(), conversationId)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (C97383ry) obj;
    }
}
