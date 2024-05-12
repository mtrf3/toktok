package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Q0e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66296Q0e implements InterfaceC88471Ynr<Throwable, C66297Q0f, C66300Q0i> {
    @Override // X.InterfaceC88471Ynr
    public final C66300Q0i invoke(Throwable th, C66297Q0f c66297Q0f) {
        Throwable t = th;
        C66297Q0f event = c66297Q0f;
        o.LJIIJ(t, "t");
        o.LJIIJ(event, "event");
        event.LIZJ(EnumC66303Q0l.WARN);
        event.LIZJ = -1;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("inner error:");
        LIZ.append(t.getLocalizedMessage());
        String LIZIZ = X1D.LIZIZ(LIZ);
        event.LIZLLL = LIZIZ;
        event.LJI = t;
        if (LIZIZ == null && (LIZIZ = t.getLocalizedMessage()) == null) {
            LIZIZ = "";
        }
        return new C66300Q0i(-1, LIZIZ, 4);
    }
}
