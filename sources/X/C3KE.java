package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3KE, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3KE implements InterfaceC81723Iq {
    public final String LIZ;
    public final EnumC96553qd LIZIZ;
    public final String LIZJ;

    @Override // X.InterfaceC81703Io
    public final String LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC81723Iq
    public final String LIZIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC81703Io
    public final C3L4 LIZLLL(C3L4 c3l4) {
        if ((c3l4 instanceof C3L3) && !(c3l4 instanceof C3L2)) {
            ((C3L5) c3l4).LLII = this.LIZIZ;
        }
        return c3l4;
    }

    public C3KE(String targetSessionId, EnumC96553qd newReadStatus) {
        o.LJIIIZ(targetSessionId, "targetSessionId");
        o.LJIIIZ(newReadStatus, "newReadStatus");
        this.LIZ = targetSessionId;
        this.LIZIZ = newReadStatus;
        this.LIZJ = "ChatSessionMsgReadStatusDecorator-Operation";
    }
}
