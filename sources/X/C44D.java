package X;

import Y.IDaS159S0200000_1;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.44D, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C44D implements AnonymousClass454 {
    public final AnonymousClass457 LIZ = new C79156V4u();
    public final ConcurrentHashMap<String, InterfaceC99713vj> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, InterfaceC99713vj> LIZJ = new ConcurrentHashMap<>();

    @Override // X.AnonymousClass454
    public final C73429Srp LIZ(C99033ud sessionInfo) {
        o.LJIIIZ(sessionInfo, "sessionInfo");
        C115494g5.LIZ();
        return new C91623ig(LJ(sessionInfo)).LJIILLIIL(new IDaS159S0200000_1(sessionInfo, this, 0));
    }

    @Override // X.AnonymousClass454
    public final void LIZIZ(String conversationId) {
        o.LJIIIZ(conversationId, "conversationId");
        C115494g5.LIZ();
        InterfaceC99713vj interfaceC99713vj = this.LIZIZ.get(conversationId);
        if (interfaceC99713vj != null) {
            interfaceC99713vj.resume();
        }
        InterfaceC99713vj interfaceC99713vj2 = this.LIZJ.get(conversationId);
        if (interfaceC99713vj2 != null) {
            interfaceC99713vj2.resume();
        }
    }

    @Override // X.AnonymousClass454
    public final void LIZJ(String conversationId) {
        o.LJIIIZ(conversationId, "conversationId");
        C115494g5.LIZ();
        InterfaceC99713vj interfaceC99713vj = this.LIZIZ.get(conversationId);
        if (interfaceC99713vj != null) {
            interfaceC99713vj.refresh();
        }
        InterfaceC99713vj interfaceC99713vj2 = this.LIZJ.get(conversationId);
        if (interfaceC99713vj2 != null) {
            interfaceC99713vj2.refresh();
        }
    }

    @Override // X.AnonymousClass454
    public final void LIZLLL(String conversationId) {
        o.LJIIIZ(conversationId, "conversationId");
        C115494g5.LIZ();
        InterfaceC99713vj interfaceC99713vj = this.LIZIZ.get(conversationId);
        if (interfaceC99713vj != null) {
            interfaceC99713vj.stop();
        }
        InterfaceC99713vj interfaceC99713vj2 = this.LIZJ.get(conversationId);
        if (interfaceC99713vj2 != null) {
            interfaceC99713vj2.stop();
        }
    }

    public final InterfaceC99713vj LJ(C99033ud sessionInfo) {
        InterfaceC99713vj putIfAbsent;
        InterfaceC99713vj putIfAbsent2;
        o.LJIIIZ(sessionInfo, "sessionInfo");
        C115494g5.LIZ();
        if (sessionInfo.isReportPage()) {
            ConcurrentHashMap<String, InterfaceC99713vj> concurrentHashMap = this.LIZJ;
            String conversationId = sessionInfo.getConversationId();
            InterfaceC99713vj interfaceC99713vj = concurrentHashMap.get(conversationId);
            if (interfaceC99713vj == null && (putIfAbsent2 = concurrentHashMap.putIfAbsent(conversationId, (interfaceC99713vj = this.LIZ.LIZIZ(sessionInfo)))) != null) {
                interfaceC99713vj = putIfAbsent2;
            }
            o.LJIIIIZZ(interfaceC99713vj, "reportActiveConv.getOrPu…essionInfo)\n            }");
            return interfaceC99713vj;
        }
        ConcurrentHashMap<String, InterfaceC99713vj> concurrentHashMap2 = this.LIZIZ;
        String conversationId2 = sessionInfo.getConversationId();
        InterfaceC99713vj interfaceC99713vj2 = concurrentHashMap2.get(conversationId2);
        if (interfaceC99713vj2 == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(conversationId2, (interfaceC99713vj2 = this.LIZ.LIZIZ(sessionInfo)))) != null) {
            interfaceC99713vj2 = putIfAbsent;
        }
        o.LJIIIIZZ(interfaceC99713vj2, "activeConv.getOrPut(sess…te(sessionInfo)\n        }");
        return interfaceC99713vj2;
    }
}
