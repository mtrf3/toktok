package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9eY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C241949eY extends AbstractC65781Prl implements InterfaceC88471Ynr<C240719cZ, C241959eZ, C240719cZ> {
    public static final C241949eY LJLIL = new C241949eY();

    public C241949eY() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C240719cZ invoke(C240719cZ c240719cZ, C241959eZ c241959eZ) {
        C240719cZ assemViewModel = c240719cZ;
        C241959eZ it = c241959eZ;
        o.LJIIIZ(assemViewModel, "$this$assemViewModel");
        o.LJIIIZ(it, "it");
        assemViewModel.LJLIL.setPinnedVideoStatus(it.LJLIL.getValue());
        return assemViewModel;
    }
}