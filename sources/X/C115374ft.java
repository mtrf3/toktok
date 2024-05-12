package X;

import Y.IDHandlerS6S0000000_1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4ft, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C115374ft {
    public static final ConcurrentHashMap<String, ConcurrentHashMap<Long, C63148OqO>> LIZ = new ConcurrentHashMap<>();
    public static final List<String> LIZIZ = new ArrayList();
    public static final IDHandlerS6S0000000_1 LIZJ = new IDHandlerS6S0000000_1(C16880lQ.LLJJJJ(), 0);

    static {
        new AbstractC115354fr() { // from class: X.4fs
            @Override // X.C4WP
            public final void dU(java.util.Map<String, C63120Opw> map) {
            }

            @Override // X.InterfaceC120024nO
            public final void y9(int i, C63120Opw conversation) {
                o.LJIIIZ(conversation, "conversation");
                if (!C115374ft.LIZ.containsKey(conversation.getConversationId())) {
                    List<String> list = C115374ft.LIZIZ;
                    String conversationId = conversation.getConversationId();
                    o.LJIIIIZZ(conversationId, "conversation.conversationId");
                    ((ArrayList) list).add(conversationId);
                }
                IDHandlerS6S0000000_1 iDHandlerS6S0000000_1 = C115374ft.LIZJ;
                if (!iDHandlerS6S0000000_1.hasMessages(1)) {
                    iDHandlerS6S0000000_1.sendEmptyMessageDelayed(1, 5000L);
                }
            }
        };
    }
}
