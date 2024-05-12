package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Jra, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50482Jra extends AbstractC65781Prl implements InterfaceC88471Ynr<C49589JdB, C50476JrU, C49589JdB> {
    public static final C50482Jra LJLIL = new C50482Jra();

    public C50482Jra() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C49589JdB invoke(C49589JdB c49589JdB, C50476JrU c50476JrU) {
        C49589JdB state = c49589JdB;
        C50476JrU action = c50476JrU;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(action, "action");
        long j = action.LJLIL;
        String sourceId = state.LJLILLLLZI;
        o.LJIIIZ(sourceId, "sourceId");
        return new C49589JdB(j, sourceId);
    }
}
