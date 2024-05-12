package X;

import java.util.List;
import java.util.Stack;
import kotlin.jvm.internal.o;

/* renamed from: X.3vi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99703vi implements InterfaceC99713vj {
    public final InterfaceC99713vj LIZIZ;
    public final Stack<InterfaceC99673vf> LIZJ = new Stack<>();
    public final boolean LIZLLL = C114414eL.LIZ();

    @Override // X.InterfaceC99713vj
    public final void LIZIZ(int i) {
        this.LIZIZ.LIZIZ(i);
    }

    @Override // X.InterfaceC99713vj
    public final void LIZJ(C109544Rq msg, boolean z, C102033zT c102033zT) {
        o.LJIIIZ(msg, "msg");
        this.LIZIZ.LIZJ(msg, z, c102033zT);
    }

    @Override // X.InterfaceC99713vj
    public final List<C109544Rq> LJ() {
        return this.LIZIZ.LJ();
    }

    @Override // X.InterfaceC99713vj
    public final void LJFF() {
        this.LIZIZ.LJFF();
    }

    @Override // X.InterfaceC99713vj
    public final void LJI(InterfaceC99673vf observer) {
        o.LJIIIZ(observer, "observer");
        this.LIZIZ.LJI(observer);
    }

    @Override // X.InterfaceC99713vj
    public final int LJII() {
        return this.LIZIZ.LJII();
    }

    @Override // X.InterfaceC99713vj
    public final String getConversationId() {
        return this.LIZIZ.getConversationId();
    }

    @Override // X.InterfaceC99713vj
    public final void refresh() {
        this.LIZIZ.refresh();
    }

    @Override // X.InterfaceC99713vj
    public final void resume() {
        this.LIZIZ.resume();
    }

    @Override // X.InterfaceC99713vj
    public final void stop() {
        this.LIZIZ.stop();
    }

    @Override // X.InterfaceC99713vj
    public final void LIZLLL() {
        InterfaceC99673vf pop = this.LIZJ.pop();
        if (this.LIZLLL && pop != null) {
            this.LIZIZ.LJI(pop);
        }
        if (this.LIZJ.empty()) {
            if (C115494g5.LIZ()) {
                C99733vl LIZ = C98783uE.LIZ();
                String convId = this.LIZIZ.getConversationId();
                LIZ.getClass();
                o.LJIIIZ(convId, "convId");
                LIZ.LIZLLL.remove(convId);
            } else {
                String sessionId = this.LIZIZ.getConversationId();
                o.LJIIIZ(sessionId, "sessionId");
                C99693vh.LIZ.remove(sessionId);
            }
            this.LIZIZ.LIZLLL();
            return;
        }
        if (this.LIZLLL) {
            return;
        }
        InterfaceC99713vj interfaceC99713vj = this.LIZIZ;
        InterfaceC99673vf peek = this.LIZJ.peek();
        o.LJIIIIZZ(peek, "observerStack.peek()");
        interfaceC99713vj.LIZ(peek);
    }

    public C99703vi(InterfaceC99713vj interfaceC99713vj) {
        this.LIZIZ = interfaceC99713vj;
    }

    @Override // X.InterfaceC99713vj
    public final void LIZ(InterfaceC99673vf interfaceC99673vf) {
        this.LIZJ.push(interfaceC99673vf);
        this.LIZIZ.LIZ(interfaceC99673vf);
    }
}
