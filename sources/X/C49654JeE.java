package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JeE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49654JeE extends AbstractC65781Prl implements InterfaceC88471Ynr<C49653JeD, C49655JeF, C49653JeD> {
    public static final C49654JeE LJLIL = new C49654JeE();

    public C49654JeE() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C49653JeD invoke(C49653JeD c49653JeD, C49655JeF c49655JeF) {
        C49653JeD lastState = c49653JeD;
        o.LJIIIZ(lastState, "lastState");
        o.LJIIIZ(c49655JeF, "<anonymous parameter 1>");
        String sourceId = lastState.LJLILLLLZI;
        o.LJIIIZ(sourceId, "sourceId");
        return new C49653JeD(true, sourceId);
    }
}
