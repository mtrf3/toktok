package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JrO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50470JrO extends AbstractC65781Prl implements InterfaceC88471Ynr<C50468JrM, C50474JrS, C50468JrM> {
    public static final C50470JrO LJLIL = new C50470JrO();

    public C50470JrO() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C50468JrM invoke(C50468JrM c50468JrM, C50474JrS c50474JrS) {
        C50468JrM lastState = c50468JrM;
        C50474JrS action = c50474JrS;
        o.LJIIIZ(lastState, "lastState");
        o.LJIIIZ(action, "action");
        String authorId = action.LJLIL;
        String groupId = action.LJLILLLLZI;
        boolean z = lastState.LJLJI;
        boolean z2 = lastState.LJLJJI;
        boolean z3 = lastState.LJLJJL;
        boolean z4 = lastState.LJLJJLL;
        String sourceId = lastState.LJLJL;
        o.LJIIIZ(authorId, "authorId");
        o.LJIIIZ(groupId, "groupId");
        o.LJIIIZ(sourceId, "sourceId");
        return new C50468JrM(authorId, groupId, sourceId, z, z2, z3, z4);
    }
}
