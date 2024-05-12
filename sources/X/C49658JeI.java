package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JeI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49658JeI extends AbstractC65781Prl implements InterfaceC88471Ynr<C49657JeH, C49659JeJ, C49657JeH> {
    public static final C49658JeI LJLIL = new C49658JeI();

    public C49658JeI() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C49657JeH invoke(C49657JeH c49657JeH, C49659JeJ c49659JeJ) {
        C49657JeH lastState = c49657JeH;
        C49659JeJ action = c49659JeJ;
        o.LJIIIZ(lastState, "lastState");
        o.LJIIIZ(action, "action");
        C49847JhL streamRoot = action.LJLIL;
        String sourceId = lastState.LJLILLLLZI;
        o.LJIIIZ(streamRoot, "streamRoot");
        o.LJIIIZ(sourceId, "sourceId");
        return new C49657JeH(streamRoot, sourceId);
    }
}
