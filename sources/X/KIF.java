package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KIF extends AbstractC65781Prl implements InterfaceC88471Ynr<KID, KIE, KID> {
    public static final KIF LJLIL = new KIF();

    public KIF() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final KID invoke(KID kid, KIE kie) {
        KID state = kid;
        KIE action = kie;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(action, "action");
        long j = action.LJLIL;
        String sourceId = state.LJLILLLLZI;
        o.LJIIIZ(sourceId, "sourceId");
        return new KID(j, sourceId);
    }
}
