package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3JC, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3JC implements C3JI {
    public final C3L4 LIZ;
    public final C3JB LIZIZ;
    public final C3JF LIZJ;

    @Override // X.C3JI
    public final String LIZIZ() {
        String LJFF = this.LIZ.LJFF();
        o.LJIIIIZZ(LJFF, "updatedSession.sessionID");
        return LJFF;
    }

    @Override // X.C3JI
    public final C3JF LIZ() {
        return this.LIZJ;
    }

    @Override // X.C3JI
    public final C3L4 LIZJ() {
        return this.LIZ;
    }

    @Override // X.C3JI
    public final C3JB getSessionType() {
        return this.LIZIZ;
    }

    public C3JC(C3L5 c3l5, C3JF operationType) {
        C3JB sessionType = C3JB.SESSION_LIST;
        o.LJIIIZ(sessionType, "sessionType");
        o.LJIIIZ(operationType, "operationType");
        this.LIZ = c3l5;
        this.LIZIZ = sessionType;
        this.LIZJ = operationType;
    }
}
